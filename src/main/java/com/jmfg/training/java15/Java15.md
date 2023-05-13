# Java 15

## Sección 8

### Tema 117: Intro
 
- Se exploraran Text Blocks 
  - Introducidos en 12 como preview
- NPEs útiles
- Records
  - Ayudan a modelar datos inmutables
  - Record Local
- Sealed Classes e interfaces
- Cambios a GC, depreciaciones, remociones


### Tema 118: Text blocks

- String de varias lineas
- Se inicia con 3 comillas dobles `"""`
- Las 3 comillas dobles deben de estar solas en la linea


### Tema 119: Explorando Text blocks

- Los saltos de linea se ponen automáticamente
- No es necesario escapar las comillas dobles
- Se puede interpolar con `formatted`
- Eliminan los espacios incidentales

### Tema 120: Text blocks: Escape sequences

- Se elimina el line terminator con `\` para que el texto este en la misma linea
- `\s` representa un espacio  

### Tema 121: Text blocks: Que esta haciendo el compilador

- Se normalizan los saltos de linea
- Se maneja el espacio en blanco
- Se maneja las secuencias de escape 

### Tema 122: NPEs útiles

- Introducidos en Java 14
- `-XX:+ShowCodeDetailsInExceptionMessages` ya no es necesario desde JDK15
-  `-XX:-ShowCodeDetailsInExceptionMessages`: apaga los detalles

### Tema 123: Records: Intro

- Se quita el boilerplate
- Se clara como en Kotlin `public record NombreClass(String nombre, Double valor)`

### Tema 124: Records: Locales

- Se declara localmente en un metodo como `record Registro(String llave, Integer valor)`
- Ayuda con la encapsulación



### Tema 125: Sealed Class: Intro

- Como restringir extensibilidad
  - hacer la clase final
  - hacer el constructor privado
  - hacer la visibilidad privada al paquete
  - hacer clases privadas estáticas
- Sealed Classes son de preview en JDK 15
- `public sealed abstract class Clase permites Clase1, Clase2`
  - permite Clase1, Clase2 extender a la Clase



### Tema 126: Sealed Class: Beneficios

- Se pueden sellar interfaces
- So se sella la clase se tiene que declarar cuales pueden extender
- Se controlan las implementaciones
- Se crean jerarquías seguras
- Se modela el dominio
- Se mejora la revision de los tipos

### Tema 127: Otros cambios notables

- ZGC: era experimental en JDK 11
  - Se activa -XX:+UseZGC
  - Se integro permanente
- Shenandoah GC
  - Se integro permanente
  - Se activa -XX:+UseShenandoahGC
- Se remueve Nashorn JS Engine / JJS Tool
  - Fue depreciado en JDK11
- Se remueve el compilador estático RMI 
- Se deprecia RMI Activation

### Tema 128: Ejercicio







