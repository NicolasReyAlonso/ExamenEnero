# Well Known Text

La representación  **Well Known Text** (**WKT**  en su acrónimo inglés) es una codificación o sintaxis en formato  ASCII diseñada para describir objetos espaciales expresados de forma  vectorial. Los objetos que es capaz de describir el formato WKT son los siguientes:
-   Puntos.
-   Multipuntos.
-   Líneas.
-   Multilíneas.
-   Polígonos.
-   Multipolígonos.
-   Colecciones de geometría.
-   Puntos en 3 y 4 dimensiones.

```
POINT (30 10)`
LINESTRING (30 10, 10 30, 40 40)`
POLYGON ((30 10, 40 40, 20 40, 10 20, 30 10))`
```
Crear un método estático de la clase Shape que genere un objeto de tipo Point, Line o Polygon a partir de una cadena de caracteres.

Añadir a la clase __Polygon__ el método inside(Point point) que devuelva un valor booleano si el punto está dentro o fuera del polígono.
