# MONGODB


Aplicativo solicitado: El concesionario 

Un concesionario de automóviles desea informatizar su gestión de ventas de vehículos. En particular, se quiere tener almacenada la información referente a los clientes que compran en el concesionario, los vehículos vendidos, así como los vendedores que realizan las distintas ventas. Para ello se tendrá en cuenta que:

El concesionario dispone de un catálogo de vehículos definidos por su marca, modelo, cilindrada y precio.

Cada uno de los modelos dispondrá de unas opciones adicionales (aire acondicionado, pintura metalizada, etc.). Las opciones vienen definidas por un nombre y una descripción. Hay que tener en cuenta que una opción puede ser común para varios modelos variando sólo el precio en cada caso.

En cuanto a los clientes, la información de interés es el nombre, C.C., dirección y teléfono, lo mismo que para los vendedores.

Los clientes pueden ceder su coche usado en el momento de comprar un vehículo nuevo. El coche usado vendrá definido por su marca, modelo, matrícula y precio de tasación. Es importante conocer la fecha en la que el cliente realiza esta cesión.

Se desea saber qué vendedor ha vendido qué modelo a qué cliente. También la fecha de la venta y la matricula del nuevo vehículo. Es importante así mismo saber las opciones que el cliente ha elegido para el modelo que compra.

Adicionalmente se desea almacenar la auditoría de cada una de las entidades de negocio. 

CREAR UN APLICATIVO JAVA QUE PERMITA LAS ACCIONES DE CRUD PARA CADA UNA DE LAS ENTIDADES DESCRITAS EN EL PROBLEMA.

RETO CONCEPTUAL

El reto de este caso consiste en determinar que información se puede almacenar en una base de datos no relacional y hacer la integración con MongoDB para almacenar esta información. 

![](https://github.com/JUNAK1/MONGODB/blob/JAVA/Mysql/Modelo_Concesionario.png)
