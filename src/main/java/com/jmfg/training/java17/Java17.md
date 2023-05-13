# JAva 17

## Sección 10: JDK 17

### Tema 146: Intro

- Sealed clases
- Remociones y deprecaciones
- Pattern matching para switch
- Encapsulation para JDK

### Tema 147: Sealed classes

- JDK 15 preview, ahora son finales
- Permiten controlar que código puede implementar la clase o interface
- Crea jerarquía segura
- Mejor type checking

### Tema 148: Encapsulación fuerte

- No se puede hacer --illegal-access
- Se usan API standard
- Se mejora la seguridad y mantenimiento

### Tema 149: Remociones y deprecaciones

- Se deprecia el Security Manager
- Se deprecia Applet API
- RMI se quita


### Tema 150: Pattern matching para switch

- Se puede hacer revision de tipo y condiciones (guarded pattern)
- case String s ->  
- case List l && l.size() > 0 -> 


### Tema 151: Pattern matching para switch: Vista previa

- Se puede hacer --enable-preview
- --release 17
- `<compilerArgs>--enable-preview</compilerArgs>`

### Tema 152: Pattern matching para switch: Mejoras

- Se extiende a cualquier tipo de objeto

## Sección 11 - Migración

### Tema 155: Tools y Plugins

- Actualizar maven o gradle
- maven-compiler-plugin y en <configuration> especificar <release>
- usar JaCoCo
- Gradle 5 soporta 11, gradle 7.3 soporta 17

### Tema 156: JAXB

- En JDK11 se quitaron
- Se debe de agregar como dependencia al proyecto `jakarta.xml.bind-api`
- Dependencia `jaxb-impl`

### Tema 157: Hibernate

- Simple app con DB H2
- NoClassDefFoundError JAXB 
- 

### Tema 158: Actualizando Hibernate

- Se actualiza hibernate
- https://hibernate.org/orm/releases/


### Tema 159: Actualizando Spring Boot

- Spring boot 2.1: Java 11
- Spring boot 2.5.5: Java 17


### Tema 160: Actualizando a JDK 17

- Se actualiza a 2.6

## Sección 12 - Final


### Tema 161: Futuro

- Cadencia de release de 6 meses
- Rápida innovation
- Project Loom
- Project Valhalla