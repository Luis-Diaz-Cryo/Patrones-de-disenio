El patrón de diseño para el problema 2 es de comportamiento. El tipo de patrón de comportamiento para este problema específico es el patrón de comando. La razón detrás de esto es que este ejercicio solicita 3 requisitos específicos que son:

-Desacopla al invocador de los objetos que realizan las acciones,

-Permite la extensión de nuevas operaciones sin modificar el código existente,

 -Facilita el registro de acciones para realizar operaciones de reversión.

Entonces, al revisar el patrón de diseño, encontramos que el patrón de comando se ajusta a estos criterios, ya que las ventajas del patrón de comando son:

-Principio de Responsabilidad Única. Puede desacoplar clases que invocan operaciones de clases que realizan estas operaciones.

-Principio Abierto/Cerrado. Puede introducir nuevos comandos en la aplicación sin romper el código de cliente existente.

-Puede implementar deshacer/rehacer.

Y todo esto se ajusta a los criterios necesarios para que el patrón de diseño sea dominante.