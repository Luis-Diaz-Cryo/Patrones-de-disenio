El patrón de diseño para esta pregunta es un patrón estructural llamado decorador. La razón detrás de esta elección es que el problema presentado tenía los siguientes requisitos.

-Permite agregar nuevas funcionalidades a objetos existentes de forma dinámica.

-Proporciona una alternativa flexible a la subclasificación para ampliar la funcionalidad.

-Mejora la legibilidad y el mantenimiento del código al separar las preocupaciones.

Entonces, mientras analizamos los diferentes patrones de diseño, descubrimos que el decorador cumple con estos requisitos.

-Puede ampliar el comportamiento de un objeto sin crear una nueva subclase.

-Puede agregar o eliminar responsabilidades de un objeto en tiempo de ejecución.

-Puedes combinar varios comportamientos envolviendo un objeto en varios decoradores.

Principio de Responsabilidad Única. Puede dividir una clase monolítica que implementa muchas variantes posibles de comportamiento en varias clases más pequeñas.

Como se puede observar todos estos cumplen con los requisitos solicitados.