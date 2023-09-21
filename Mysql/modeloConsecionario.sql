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
    telefono VARCHAR(15),
    fechaPersona DATE
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

CREATE TABLE AUDITORIA_PERSONAS (
    id INT AUTO_INCREMENT PRIMARY KEY,
    operacion VARCHAR(50),
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    idPersona BIGINT,
    nombre VARCHAR(100),
    apellido VARCHAR(100),
    fechaNacimiento DATE,
    tipoDocumento VARCHAR(2),
    numeroDocumento VARCHAR(15),
    direccion VARCHAR(30),
    telefono VARCHAR(15),
    fechaPersona DATE
);


#Auditoria tabala personas CrUD
DELIMITER //
CREATE TRIGGER personas_after_insert AFTER INSERT ON PERSONAS
FOR EACH ROW
BEGIN
   INSERT INTO AUDITORIA_PERSONAS (operacion, idPersona, nombre, apellido, fechaNacimiento, tipoDocumento, numeroDocumento, direccion, telefono, fechaPersona) 
   VALUES ('INSERT', NEW.idPersona, NEW.nombre, NEW.apellido, NEW.fechaNacimiento, NEW.tipoDocumento, NEW.numeroDocumento, NEW.direccion, NEW.telefono, NEW.fechaPersona);
END;//
DELIMITER ;

DELIMITER //
CREATE TRIGGER personas_after_update AFTER UPDATE ON PERSONAS
FOR EACH ROW
BEGIN
   INSERT INTO AUDITORIA_PERSONAS (operacion, idPersona, nombre, apellido, fechaNacimiento, tipoDocumento, numeroDocumento, direccion, telefono, fechaPersona) 
   VALUES ('UPDATE', NEW.idPersona, NEW.nombre, NEW.apellido, NEW.fechaNacimiento, NEW.tipoDocumento, NEW.numeroDocumento, NEW.direccion, NEW.telefono, NEW.fechaPersona);
END;//
DELIMITER ;

DELIMITER //
CREATE TRIGGER personas_after_delete AFTER DELETE ON PERSONAS
FOR EACH ROW
BEGIN
   INSERT INTO AUDITORIA_PERSONAS (operacion, idPersona) 
   VALUES ('DELETE', OLD.idPersona);
END;//
DELIMITER ;

#########
CREATE TABLE AUDITORIA_VEHICULOS (
    id INT AUTO_INCREMENT PRIMARY KEY,
    operacion VARCHAR(50),
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    idVehiculos BIGINT,
    marca VARCHAR(50),
    modelo VARCHAR(50),
    cilindrada VARCHAR(50),
    precio INT,
    matricula INT,
    usado BOOLEAN,
	idModelo BIGINT
);

#Auditoria tabla vehiculos CrUD
DELIMITER //
CREATE TRIGGER vehiculos_after_insert AFTER INSERT ON VEHICULOS
FOR EACH ROW
BEGIN
   INSERT INTO AUDITORIA_VEHICULOS (operacion, idVehiculos, marca, modelo, cilindrada, precio, matricula, usado, idModelo) 
   VALUES ('INSERT', NEW.idVehiculos, NEW.marca, NEW.modelo, NEW.cilindrada, NEW.precio, NEW.matricula, NEW.usado, NEW.idModelo);
END;//
DELIMITER ;

DELIMITER //
CREATE TRIGGER vehiculos_after_update AFTER UPDATE ON VEHICULOS
FOR EACH ROW
BEGIN
   INSERT INTO AUDITORIA_VEHICULOS (operacion, idVehiculos, marca, modelo, cilindrada, precio, matricula, usado, idModelo) 
   VALUES ('UPDATE', NEW.idVehiculos, NEW.marca, NEW.modelo, NEW.cilindrada, NEW.precio, NEW.matricula, NEW.usado, NEW.idModelo);
END;//
DELIMITER ;

DELIMITER //
CREATE TRIGGER vehiculos_after_delete AFTER DELETE ON VEHICULOS
FOR EACH ROW
BEGIN
   INSERT INTO AUDITORIA_VEHICULOS (operacion, idVehiculos) 
   VALUES ('DELETE', OLD.idVehiculos);
END;//
DELIMITER ;

