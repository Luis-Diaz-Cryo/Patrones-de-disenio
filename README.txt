1) El patrón de diseño para esta pregunta es un patrón de comportamiento llamado método de plantilla. La razón detrás de esta elección es que el problema presentado tenía los siguientes requisitos.

- Encapsulación de la estructura del algoritmo común en una clase base.

- Flexibilidad para que las subclases implementen pasos específicos según el tipo de pedido.

- Evite la duplicación de código reutilizando la estructura común.

Entonces, después de revisar el patrón de diseños, descubrimos que el método de plantilla se ajusta a los requisitos necesarios para este problema. El método de plantilla puede hacer lo siguiente

- Puede extraer el código duplicado en una superclase para evitar la duplicación y encapsular la estructura del algoritmo común en una clase.

- anular sólo ciertas partes de un algoritmo grande, haciéndolas menos afectadas por los cambios que ocurren en otras partes del algoritmo. Eso permite flexibilidad para subclasificar para implementar solo pasos específicos





2) El patrón de diseño para el problema 2 es de comportamiento y el tipo de patrón es "Comando"". La razón detrás de esto es que este ejercicio solicita 3 requisitos específicos que son:

-Desacoplar al invocador de los objetos que realizan las acciones
-Permitir la extensión de nuevas operaciones sin modificar el código existente
-Facilitar el registro de acciones para realizar operaciones de reversión.

Entonces, al revisar el patrón de diseño, encontramos que Comando se ajusta a estos criterios, ya que las ventajas que proporciona son:

-Principio de Responsabilidad Única. Puede desacoplar clases que invocan operaciones de clases que realizan estas operaciones.
-Principio Open/Closed. Puede introducir nuevos comandos en la aplicación sin romper el código de cliente existente.
-Puede implementar deshacer/rehacer.


3) Utilizamos el patrón de diseño Creacional Builder para este caso ya que, a partir de los requerimientos del mismo, se especifica que es crucial
permitir la construcción paso a paso de objetos complejos y desacoplar el proceso de construcción de la representación interna del objeto.

Builder permite esto ya que en el caso de sistema de gestión para un restaurante, se puede utilizar un Builder de Menú que tenga métodos para agregar
platos principales, entrantes, postres, bebidas, etc. Y cada uno de estos elementos puede ser un objeto complejo con diferentes propiedades y configuraciones.
Builder te permite construir el menú paso a paso según las necesidades sin tener que modificar la lógica de construcción principal, además
de permitir legibilidad y mantebinilidad del código al separar el proceso de construcción del objeto de su representaicón interna.


4) Para este problema, elegimos el patrón Estructural Decorador ya que se solicitaban los siquientes requisitos:

-Permitir agregar nuevas funcionalidades a objetos existentes de forma dinámica.
-Proporcionar una alternativa flexible a la subclasificación para ampliar la funcionalidad.
-Mejorrar la legibilidad y el mantenimiento del código al separar las preocupaciones.

Entonces, descubrimos que Decorador cumple con estos requisitos.

-Puede ampliar el comportamiento de un objeto sin crear una nueva subclase.
-Puede agregar o eliminar responsabilidades de un objeto en tiempo de ejecución.
-Puedes combinar varios comportamientos envolviendo un objeto en varios decoradores.
-Principio de Responsabilidad Única. Puede dividir una clase monolítica que implementa muchas variantes posibles de comportamiento en varias clases más pequeñas.

De esta manera, pudimos dar solución a las solicitudes del problema.

5)
En este caso, se solicita desacoplar la abstracción de su implementación, permitiendo que ambas varíen de manera independiente.
Por este motivo, seleccionamos el patrón Estructural Bridge ya que, además permite que tanto la abstracción como la implementación tengan jerarquías propias
y que la abstracción delegue la implementación a su objeto implementador, separando así las dos jerarquías, ambos requerimientos del problema.

En este caso:

Abstracción (Envío) define la interfaz para la abstracción del envío.

Implementación (Servicio) define la interfaz para la implementación del servicio.

El Implementador Concreto (EnvíoTerrestre, EnvíoMarítimo, EnvíoAéreo) proporciona la implementación específica para cada tipo de envío.

Implementador Concreto (EnvíoExpress, EnvíoEstándar): Puede haber implementadores concretos adicionales que definen variantes específicas de servicios, como el envío estándar y envío express.
Este patrón permite que los diferentes tipos de envíos (terrestres, marítimos, aéreos) se combinen con diferentes tipos de servicios (estándar, express) de manera independiente.
