# Java 10

## Tema 43: Intro

- Inferencia de tipos de variable local
- Clase Optional y OrElseThrow
- Crear colecciones inmutables
- Data sharing de la clase Application
- Mejoras de contenedores

## Tema 44: Inferencia de tipos de variable local

- En las colecciones el tipo se infiere viendo el lado izquierdo de la declaration
- En la declaration de variables, el compilador infiere el tipo viendo el lado derecho de la declaration

## Tema 45: Java sigue siendo estático

- La declaración `var` no hace a java dinámico
- En el bytecode el compilador declara la variable de forma estatica

## Tema 46: Dnode puede ser usado var

- La declaración dinamica solo puede usarse en variables locales
- No se puede usar en campos de la clase
- No se puede usar como parametros de metodo


## Tema 47, 48, 49, 50: Ejemplos de inferencia de tipos

## Tema 51: Beneficios de inferencia de tipos

- Mejor código
- Mejor nombre de variables

## Tema 52: OrElseThrow

- Se lanza un noSUchElementException en el método get

## Tema 53: Usando copyOf

- Set, List y Map, `copyOf` crea una copia inmutable
- Se puede usar `unmodifiableList` para hacer una vista inmutable

## Tema 54: CDS - Inicio

- El JVM introduce CDS  o CLass Data Sharing en JDK5 
- App CDS permite que las clases de aplicación ejecutandose 
- Es gratis a partir de JDK 10
- Mejora el inicio de la aplicacion

## Tema 55: Class Data Sharing - Pasos

- :\Program Files\Zulu\zulu-17\lib
- java -Xshare:dump
- java -Xshare:on -Xlog:class+load App

## Tema 56: Comenzando con App CDS

## Tema 57: Beneficios de App CDS

- Ahorra espacio
- Mejora el tiempo de inicio de la aplicacion
- Ahorra costo en la nube

## Tema 58: Mejoras de contenedores

- Las aplicaciones de hoy en dia son ejecutadas en contenedores
- 