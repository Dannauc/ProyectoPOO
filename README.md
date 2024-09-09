# ProyectoPOO

# Sistema de gestión de inventario de una librería

# Introducción

El sistema de gestión de inventario en una librería actúa como una herramienta fundamental para el funcionamiento diario de cualquier establecimiento dedicado a la distribución de libros. La principal finalidad de su desarrollo es mejorar y simplificar la administración de recursos esenciales, tales como los libros en existencia, la información sobre autores y categorías, la gestión de ventas y el seguimiento de clientes. Este proyecto se orienta a proporcionar una solución tecnológica eficaz que permita a los empleados de la librería mantener un control detallado y automatizado de sus inventarios, facilitando operaciones de ventas y atención al cliente de manera más rápida y precisa.

Entre los desafíos más importantes que enfrenta una librería está la gestión adecuada de su inventario. Una administración deficiente puede traducirse en pérdidas de ventas por falta de stock o por la acumulación de productos obsoletos. Asimismo, el manejo de datos relativos a autores y categorías es crucial para mantener una organización estructurada que facilite la búsqueda de información y el análisis de tendencias. Este sistema permitirá a los empleados registrar nuevos libros en el inventario, actualizar las existencias y eliminar aquellos que hayan dejado de estar disponibles. Cada libro será identificado por varios atributos que contribuirán a una mejor categorización y búsqueda, tales como el título, autor, ISBN, precio y cantidad en stock.

El sistema incluirá una gestión completa de autores, permitiendo almacenar información que les atañe (biografía, lista de libros publicados, etc.) Esto no sólo logrará una buena gestión interna, sino que también contribuirá a mejorar la experiencia del cliente, dado que permitirá ofrecer recomendaciones o información de los autores de la librería.
Por otro lado, uno de los componentes más importantes de este proyecto es la posibilidad de registrar y analizar las ventas. El sistema permitirá llevar una contabilidad exacta de la operación, generando automáticamente recibos o facturas de las operaciones. Además, mantendrá el archivo de las ventas realizadas, de tal forma que la librería podrá tener control sobre sus productos más vendidos y, por ejemplo, aquellos que presentan peor rendimientos. Este registro servirá también para el levantamiento de informes y estadísticas que serán útiles para la gestión, por ejemplo, en promociones o reposición de libros.
La búsqueda y filtrado de libros, será otro de los aspectos clave del sistema, dado que permitirá, tanto a los empleados como a los clientes, acceder rápidamente a los libros que están buscando, bien por título, bien por autor, bien por categoría o incluso por precio. El poder filtrar por novedades o bien por ofertas, hará que la experiencia del usuario final se vea favorecida en cuanto a la compra de artículos destacados.
Este sistema de gestión está diseñado para ser extensible y escalable, mediante la utilización de tecnologías tales como lenguajes de programación orientados a objetos (Java, C++ o Python), bases de datos relacionales (MySQL o SQLite), lo que le permitirá, además, alcanzar su eficiencia y capacidad de manejo de grandes volúmenes de datos. Además, se contempla la posibilidad de integrar una interfaz gráfica amigable que haga más intuitiva la interacción con el sistema, facilitando su uso por parte de los empleados de la librería, incluso aquellos con menos experiencia en tecnología.

Objetivos principales 

-La optimización de los recursos es el objetivo principal
Mantenga los niveles de inventario para evitar el exceso y la pérdida de productos, lo que ayuda a las librerías a ser rentables y atraer buenos clientes

- La reducción de pérdidas es parte del proceso
Implementa un mecanismo que te permita detectar y minimizar pérdidas de libros como robo, deterioro o errores de registro. Es imprescindible mantener la integridad del inventario y garantizar la disponibilidad de los títulos para los clientes.

-Medidas mejoradas de control de existencias
Administre los libros con un control estricto, como ordenarlos por popularidad, exhibirlos en las rebajas e identificar si tienen alta o baja demanda. Esto ayudará a planificar las compras y la gestión del espacio.

-Facilitando la obtención de información
Establezca un sistema que permita generar informes rápidos y convenientes sobre el estado del inventario, incluida la cantidad de libros disponibles, los préstamos activos y las reservas. Esto no sólo mejora la gestión interna, sino que también mejora el servicio al cliente.

-La aplicación de la tecnología
El software de gestión de inventario puede ayudarle a automatizar procesos y mantener registros precisos. El proceso implica el uso de herramientas que permiten la actualización de datos en tiempo real y la creación de informes sobre el estado del inventario.

-La formación del personal es imprescindible
Se debe capacitar adecuadamente al personal en sistema de gestión de inventarios, anotaciones y salidas de libros, salidas de libros, herramientas tecnológicas

La librería se beneficiará de estos objetivos no sólo en términos de eficiencia operativa sino también en términos de atención al cliente y optimización de recursos

Funciones principales 

Las principales funciones de un sistema de gestión de inventario para una librería incluyen lo siguiente:

Control del stock, realizando un seguimiento del inventario disponible, incluida la cantidad de cada libro en existencia, para garantizar que se mantengan niveles adecuados de productos.

 Administración de compras, registrando y controlando los pedidos de compra a proveedores, con la recepción y verificación de los artículos recibidos. 

Actualización del inventario en tiempo real a medida que se venden o reciben nuevos libros. Generación de informes detallados sobre el inventario, como los niveles de existencias, la rotación de productos y las tendencias de ventas. 

Integración con el sistema de ventas para ajustar automáticamente el inventario según las ventas realizadas. 

Notificación o activación automática de pedidos de reposición cuando los niveles de existencias alcancen un umbral preestablecido. 

Gestión de devoluciones, manejando las devoluciones y ajustes en el inventario en caso de devoluciones de productos o errores en los pedidos. 

Registro de información sobre proveedores, incluidos detalles de contacto, historial de pedidos y condiciones de compra. 

Organización de libros en categorías y etiquetas para facilitar la búsqueda y manejo del inventario. 

Control de acceso al sistema y gestión de permisos para garantizar que solo el personal autorizado pueda realizar cambios importantes en el inventario.

Diagrama de Clases UML

El diagrama de clases es ideal para representar la estructura estática del sistema, mostrando las clases, atributos, métodos y las relaciones entre ellas.

Clases Principales:

1. Libro
   Atributos:
     - ISBN: String
     - título: String
     - añoPublicación: Date
     - precio: Decimal
     - stock: Integer
   Métodos:
     - agregarLibro()
     - modificarLibro()
     - eliminarLibro()
     - buscarLibro()

2. Autor
    Atributos:
     - autorID: Integer
     - nombre: String
     - nacionalidad: String
     - biografía: Text
   Métodos:
     - agregarAutor()
     - modificarAutor()
     - eliminarAutor()

3. Categoría
   Atributos:
     - categoriaID: Integer
     - nombre: String
   Métodos:
     - agregarCategoria()
     - modificarCategoria()
     - eliminarCategoria()

4. Venta
   Atributos:
     - ventaID: Integer
     - fecha: Date
     - total: Decimal
    Métodos:
     - registrarVenta()
     - calcularTotal()

5. Cliente
   Atributos:
     - clienteID: Integer
     - nombre: String
     - email: String
     - historialCompras: List<Venta>
   Métodos:
     - agregarCliente()
     - modificarCliente()
     - eliminarCliente()

6. Empleado
   Atributos:
     - empleadoID: Integer
     - nombre: String
     - puesto: String
    Métodos:
     - gestionarInventario()
     - gestionarVentas()

Relaciones:
- Libro está asociado con Autor (Una relación de asociación "muchos a muchos").
- Libro pertenece a una Categoría (Una relación de asociación "muchos a uno").
- Venta incluye uno o más Libro (Una relación de asociación "uno a muchos").
- Cliente está asociado con Venta (Una relación de asociación "uno a muchos").
- Empleado puede gestionar tanto Libro como Venta.

2. Diagrama de Secuencia UML

Este diagrama muestra cómo interactúan las clases para realizar ciertas operaciones clave.

Secuencia: Registro de Venta

1. cliente selecciona un libro en la interfaz.
2. Empleado verifica la disponibilidad del Libro.
3. Empleado crea un registro de Venta.
4. Venta se asocia con los libros seleccionados.
5. Empleado procesa el pago.
6. Sistema actualiza el stock del Libro.
7. Sistema guarda el registro de la Venta en el historial del Cliente.


3. Diagrama de Casos de Uso UML

Este diagrama representa los diferentes casos de uso que el sistema permitirá, y los actores involucrados.

Casos de Uso Principales:

- Gestionar Inventario: Permite a los empleados agregar, modificar y eliminar libros.
- Gestionar Autores: Permite la gestión de la información de los autores.
- Gestionar Categorías: Permite agregar, modificar y eliminar categorías.
- Registrar Venta: Permite registrar una venta y actualizar el inventario.
- Gestionar Clientes: Permite agregar, modificar y eliminar información de los clientes.

Actores:
- Empleado: Actor principal que interactúa con el sistema.
- Cliente: Actor que genera acciones en el sistema a través de sus compras.
