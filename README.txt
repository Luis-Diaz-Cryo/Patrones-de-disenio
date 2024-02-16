1)





2) El patrón de diseño para el problema 2 es de comportamiento. El tipo de patrón de comportamiento para este problema específico es el patrón de comando. La razón detrás de esto es que este ejercicio solicita 3 requisitos específicos que son:

-Desacopla al invocador de los objetos que realizan las acciones,

-Permite la extensión de nuevas operaciones sin modificar el código existente,

 -Facilita el registro de acciones para realizar operaciones de reversión.

Entonces, al revisar el patrón de diseño, encontramos que el patrón de comando se ajusta a estos criterios, ya que las ventajas del patrón de comando son:

-Principio de Responsabilidad Única. Puede desacoplar clases que invocan operaciones de clases que realizan estas operaciones.

-Principio Abierto/Cerrado. Puede introducir nuevos comandos en la aplicación sin romper el código de cliente existente.

-Puede implementar deshacer/rehacer.

Y todo esto se ajusta a los criterios necesarios para que el patrón de diseño sea dominante.


3)

4) El patrón de diseño para esta pregunta es un patrón estructural llamado decorador. La razón detrás de esta elección es que el problema presentado tenía los siguientes requisitos.

-Permite agregar nuevas funcionalidades a objetos existentes de forma dinámica.

-Proporciona una alternativa flexible a la subclasificación para ampliar la funcionalidad.

-Mejora la legibilidad y el mantenimiento del código al separar las preocupaciones.

Entonces, mientras analizamos los diferentes patrones de diseño, descubrimos que el decorador cumple con estos requisitos.

-Puede ampliar el comportamiento de un objeto sin crear una nueva subclase.

-Puede agregar o eliminar responsabilidades de un objeto en tiempo de ejecución.

-Puedes combinar varios comportamientos envolviendo un objeto en varios decoradores.

Principio de Responsabilidad Única. Puede dividir una clase monolítica que implementa muchas variantes posibles de comportamiento en varias clases más pequeñas.

Como se puede observar todos estos cumplen con los requisitos solicitados.

5)