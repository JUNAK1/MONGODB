INSERT INTO MODELO (idModelo, año, referencia, tipoVehiculo)
VALUES
    (1, 2023, 'Modelo A', 'Sedán'),
    (2, 2022, 'Modelo B', 'SUV'),
    (3, 2023, 'Modelo C', 'Camioneta'),
    (4, 2021, 'Modelo D', 'Hatchback'),
    (5, 2022, 'Modelo E', 'Pickup'),
    (6, 2023, 'Modelo F', 'Sedán'),
    (7, 2022, 'Modelo G', 'SUV'),
    (8, 2021, 'Modelo H', 'Hatchback'),
    (9, 2022, 'Modelo I', 'Camioneta'),
    (10, 2023, 'Modelo J', 'SUV'),
    (11, 2021, 'Modelo K', 'Sedán'),
    (12, 2023, 'Modelo L', 'Hatchback'),
    (13, 2022, 'Modelo M', 'Camioneta'),
    (14, 2022, 'Modelo N', 'SUV'),
    (15, 2021, 'Modelo O', 'Hatchback'),
    (16, 2023, 'Modelo P', 'Camioneta'),
    (17, 2022, 'Modelo Q', 'Sedán'),
    (18, 2022, 'Modelo R', 'Hatchback'),
    (19, 2021, 'Modelo S', 'SUV'),
    (20, 2023, 'Modelo T', 'Sedán');
    

INSERT INTO PERSONAS (idPersona, nombre, apellido, fechaNacimiento, tipoDocumento, numeroDocumento, direccion, telefono, fechaPersona)
VALUES
    (1, 'Juan', 'Pérez', '1990-05-15', 'DNI', 12345678, 'Calle 123', '123-456-7890', '2021-08-10'),
    (2, 'María', 'Gómez', '1985-03-20', 'DNI', 87654321, 'Avenida 456', '987-654-3210', '2021-09-05'),
    (3, 'Pedro', 'López', '1978-11-02', 'CUI', 1234567, 'Calle Principal', '555-555-5555', '2021-07-20'),
    (4, 'Ana', 'Martínez', '1995-09-12', 'DNI', 56789012, 'Avenida 789', '555-123-4567', '2021-06-15'),
    (5, 'Luis', 'Rodríguez', '1980-07-25', 'CUI', 7654321, 'Calle Secundaria', '555-987-6543', '2021-10-01'),
    (6, 'Laura', 'Sánchez', '1992-04-18', 'DNI', 98765432, 'Avenida Norte', '555-888-9999', '2021-05-30'),
    (7, 'Carlos', 'García', '1987-12-08', 'CUI', 2345678, 'Calle Sur', '555-111-2222', '2021-08-25'),
    (8, 'Elena', 'Fernández', '1975-06-30', 'DNI', 34567890, 'Avenida Oeste', '555-222-3333', '2021-09-15'),
    (9, 'Sergio', 'Hernández', '1991-02-03', 'DNI', 67890123, 'Calle Este', '555-333-4444', '2021-07-10'),
    (10, 'Isabel', 'González', '1983-10-17', 'CUI', 1234567, 'Avenida Central', '555-444-5555', '2021-11-05'),
    (11, 'Andrés', 'Ramírez', '1989-08-28', 'DNI', 23456789, 'Calle 1', '555-666-7777', '2021-06-20'),
    (12, 'Marta', 'Torres', '1976-03-15', 'CUI', 7654321, 'Avenida 2', '555-777-8888', '2021-10-10'),
    (13, 'Raul', 'Pérez', '1993-07-08', 'DNI', 45678901, 'Calle 3', '555-999-0000', '2021-08-30'),
    (14, 'Teresa', 'Díaz', '1982-11-20', 'CUI', 2345678, 'Avenida 4', '555-000-1111', '2021-09-20'),
    (15, 'José', 'López', '1984-05-10', 'DNI', 56789012, 'Calle 5', '555-111-2222', '2021-07-01');



INSERT INTO ADICIONALES (idAdicionales, aireAcondicionado, rinesLujo, acientosCuero, vidrioElectricos, descripcion)
VALUES
    (1, true, true, false, true, 'Paquete completo de lujo'),
    (2, true, false, true, false, 'Paquete básico'),
    (3, false, true, false, true, 'Paquete deportivo'),
    (4, false, false, false, false, 'Sin extras'),
    (5, true, true, true, true, 'Paquete premium'),
    (6, true, false, false, false, 'Aire acondicionado y vidrios eléctricos'),
    (7, false, true, true, false, 'Rines de lujo y asientos de cuero'),
    (8, true, true, true, false, 'Paquete de confort'),
    (9, true, true, true, true, 'Paquete todo incluido'),
    (10, false, true, true, true, 'Paquete familiar'),
    (11, false, true, false, false, 'Paquete de rines'),
    (12, true, false, true, true, 'Paquete de asientos'),
    (13, true, true, false, false, 'Paquete de lujo'),
    (14, false, false, true, true, 'Paquete de ventanas'),
    (15, true, false, false, true, 'Paquete de aire acondicionado');
    

INSERT INTO VEHICULOS (idVehiculos, marca, modelo, cilindrada, precio, matricula, usado, idModelo)
VALUES
    (1, 'Toyota', 'Camry', '2.5L', 25000.000, 'ABC123', false, 1),
    (2, 'Honda', 'Civic', '2.0L', 22000.000, 'XYZ789', false, 2),
    (3, 'Ford', 'Escape', '1.5L', 28000.000, 'LMN456', false, 3),
    (4, 'Chevrolet', 'Malibu', '2.0L', 24000.000, 'PQR321', false, 4),
    (5, 'Hyundai', 'Elantra', '2.0L', 23000.000, 'DEF456', false, 5),
    (6, 'Nissan', 'Altima', '2.5L', 27000.000, 'GHI789', false, 6),
    (7, 'Volkswagen', 'Jetta', '1.8L', 26000.000, 'JKL123', false, 7),
    (8, 'Mazda', 'Mazda3', '2.0L', 22500.000, 'RST789', false, 8),
    (9, 'Kia', 'Optima', '2.4L', 25500.000, 'UVW123', false, 9),
    (10, 'Subaru', 'Impreza', '2.0L', 23000.000, 'XYZ456', false, 10),
    (11, 'Audi', 'A4', '2.0L', 33000.000, 'ABC789', false, 11),
    (12, 'BMW', '3 Series', '2.0L', 34000.000, 'DEF123', false, 12),
    (13, 'Mercedes-Benz', 'C-Class', '2.0L', 35000.000, 'GHI123', false, 13),
    (14, 'Lexus', 'ES', '2.5L', 36000.000, 'JKL789', false, 14),
    (15, 'Tesla', 'Model 3', 'Electric', 45000.000, 'MNO123', false, 15);


INSERT INTO VEHICULOS_ADICIONALES (idVehiculos, idAdicionales)
VALUES
    (1, 1), -- Asignar el extra 1 al vehículo 1
    (1, 2), -- Asignar el extra 2 al vehículo 1
    (2, 3), -- Asignar el extra 3 al vehículo 2
    (3, 4), -- Asignar el extra 4 al vehículo 3
    (4, 5), -- Asignar el extra 5 al vehículo 4
    (5, 1), -- Asignar el extra 1 al vehículo 5
    (5, 3), -- Asignar el extra 3 al vehículo 5
    (6, 2), -- Asignar el extra 2 al vehículo 6
    (7, 4), -- Asignar el extra 4 al vehículo 7
    (8, 5); -- Asignar el extra 5 al vehículo 8;
    


INSERT INTO VENTAS (idVentas, fechaVenta, tipoPago, idCliente, idVendedor, idTipoPago, idNuevo)
VALUES
    (10, '2023-09-20', 'Tarjeta de crédito', 1, 2, 5, 3),  -- Venta 1
    (20, '2023-09-21', 'Efectivo', 3, 1, 2, 4),         -- Venta 2
    (30, '2023-09-22', 'Transferencia bancaria', 2, 3, 1, 5),  -- Venta 3
    (40, '2023-09-23', 'Tarjeta de débito', 4, 2, 3, 1),     -- Venta 4
    (50, '2023-09-25', 'Efectivo', 1, 3, 4, 2),    -- Venta 5
    (60, '2023-09-26', 'Tarjeta de crédito', 2, 1, 3, 1),  -- Venta 6
    (70, '2023-09-27', 'Transferencia bancaria', 4, 2, 5, 3), -- Venta 7
    (80, '2023-09-28', 'Efectivo', 3, 1, 2, 4),  -- Venta 8
    (90, '2023-09-29', 'Tarjeta de débito', 1, 2, 1, 5);   -- Venta 9
    

INSERT INTO AUDITORIA_PERSONAS (operacion, idPersona, nombre, apellido, fechaNacimiento, tipoDocumento, numeroDocumento, direccion, telefono, fechaPersona)
VALUES
    ('Inserción', 1, 'Juan', 'Pérez', '1990-05-15', 'DNI', '12345678', 'Calle 123', '123-456-7890', '2021-08-10'),
    ('Actualización', 2, 'María', 'Gómez', '1985-03-20', 'DNI', '87654321', 'Avenida 456', '987-654-3210', '2021-09-05'),
    ('Eliminación', 3, 'Pedro', 'López', '1978-11-02', 'CUI', 'A1234567', 'Calle Principal', '555-555-5555', '2021-07-20'),
    ('Inserción', 4, 'Ana', 'Martínez', '1995-09-12', 'DNI', '56789012', 'Avenida 789', '555-123-4567', '2021-06-15'),
    ('Actualización', 5, 'Luis', 'Rodríguez', '1980-07-25', 'CUI', 'B7654321', 'Calle Secundaria', '555-987-6543', '2021-10-01'),
    ('Inserción', 6, 'Laura', 'Sánchez', '1992-04-18', 'DNI', '98765432', 'Avenida Norte', '555-888-9999', '2021-05-30'),
    ('Eliminación', 7, 'Carlos', 'García', '1987-12-08', 'CUI', 'C2345678', 'Calle Sur', '555-111-2222', '2021-08-25'),
    ('Actualización', 8, 'Elena', 'Fernández', '1975-06-30', 'DNI', '34567890', 'Avenida Oeste', '555-222-3333', '2021-09-15'),
    ('Inserción', 9, 'Sergio', 'Hernández', '1991-02-03', 'DNI', '67890123', 'Calle Este', '555-333-4444', '2021-07-10'),
    ('Inserción', 10, 'Isabel', 'González', '1983-10-17', 'CUI', 'D1234567', 'Avenida Central', '555-444-5555', '2021-11-05');
