create database concesionario;
use concesionario;

CREATE TABLE MODELO(
	idModelo BIGINT PRIMARY KEY,
    año INT,
    referencia VARCHAR(200),
    tipoVehiculo VARCHAR(200)
);
CREATE TABLE PERSONAS (
    idPersona BIGINT PRIMARY KEY,
    nombre VARCHAR(100),
    apellido VARCHAR(100),
    fechaNacimiento DATE,
    tipoDocumento VARCHAR(2),
    numeroDocumento VARCHAR(15),
    direccion VARCHAR(30),
    telefono VARCHAR(15)
);
CREATE TABLE ADICIONALES (
	idAdicionales BIGINT PRIMARY KEY,
    aireAcondicionado BOOLEAN,
    rinesLujo BOOLEAN,
    acientosCuero BOOLEAN,
    vidrioElectricos BOOLEAN,
    descripcion VARCHAR(200)
);
CREATE TABLE VEHICULOS(
	idVehiculos BIGINT PRIMARY KEY,
    marca VARCHAR(50),
    modelo VARCHAR(50),
    cilindrada VARCHAR(50),
    precio DECIMAL(10,3),
    matricula VARCHAR(50),
    usado BOOLEAN,
	idModelo BIGINT,
    FOREIGN KEY (idModelo) REFERENCES MODELO(idModelo)
);
CREATE TABLE VEHICULOS_ADICIONALES(
	idVehiculos BIGINT,
    idAdicionales BIGINT,
    PRIMARY KEY(idVehiculos,idAdicionales),
    FOREIGN KEY (idVehiculos) REFERENCES VEHICULOS(idVehiculos),
    FOREIGN KEY (idAdicionales) REFERENCES ADICIONALES(idAdicionales)
);
CREATE TABLE VENTAS (
    idVentas BIGINT PRIMARY KEY,
    fechaVenta DATE,
    tipoPago VARCHAR(25),
    
    idCliente BIGINT, -- FK  CLIENTE_FACTURA
    idVendedor BIGINT, -- FK VENDEDOR_FACTURA
    FOREIGN KEY (idCliente) REFERENCES PERSONAS(idPersona),
    FOREIGN KEY (idVendedor) REFERENCES PERSONAS(idPersona),
    
    idTipoPago BIGINT,
    idNuevo BIGINT,
	FOREIGN KEY (idTipoPago) REFERENCES VEHICULOS(idVehiculos),
    FOREIGN KEY (idNuevo) REFERENCES VEHICULOS(idVehiculos)
);

