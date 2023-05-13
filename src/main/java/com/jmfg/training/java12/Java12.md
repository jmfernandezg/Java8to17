# Java 12

## Tema 85: Introduccion

- CompactNumberFormat: API para formatear numeros de forma compacta
- Comparando 2 archivos: comparar el contenido de dos archivs
- JMH: microbenchmarking harness
- Shenadoah GC
- Teeing Collector: Stream API
- Expresiones Switch


## Tema 86: Formateando numeros compactos

- Representando numeros en forma compacta
- Se localiza para varios lenguajes
- `NumberFormat.getCompactNumberInstance`
- RoundingMode.DOWN: se redondea hacia abajo


## Tema 87: Teeing collector

- Comando tee de linux
- Combina el resultado de otros dos colectores
- `teeing()`
- Hace dos cosas al mismo tiempo

## Tema 88: Compara 2 archivos

- Files.mismatch determina si hay un mismatch entre los archivos
- Regresa el indice donde esta el mismatch o -1 si no hay mismatch


## Tema 89: Expresiones Switch

- Caracteristicas de preview
- no esta disponible al compilar o ejecutar
- Su intencion es para la retro
- java --enable-preview
- javac --enable-preview
- Mejora la legibilidad del codigo


##  Tema 90: Shenadoa GC

- Desarrollado por RedHAT
- Bajo tiempo de Pausa
- Aplicacion responsiva
- Concurrente
- No esta disponible en los JDK's de Oracle
- XX:+UnlockExperimentalVMOptions -XX:+UseShenandoahGC

## Tema 91: String indent

- `indent(int)` pone sangria en las lineas del string con el numero de espacios 

## Tema 92: String transform

- Mejora la legibilidad del codigo
- `transform` es una funcion de String


## Tema 93: Java Microbenckmarking Harness

- Por que benchmark: se compara el desempeño del software o de dos algoritmos
- Microbenchmark: comparan diferentes implementaciones en un ambiente aislado
- Puede ser de una funcion o bloque de codigo
- JMH es una libreria de harness 
- Es el estandard para escribir benchmarks en el JVM
- Es un proyecto separado del JDK
- System.currentTimeMillis no es confiable
- Se requiere un periodo de calentamiento en la JVM
- La JVM tiene varias optimizaciones


## Tema 94: Java Microbenckmarking Harness Iniciando

- Iniciar el proyecto desde maven

```bash
mvn archetype:generate \
  -DinteractiveMode=false \
  -DarchetypeGroupId=org.openjdk.jmh \
  -DarchetypeArtifactId=jmh-java-benchmark-archetype \
  -DgroupId=com.demo.jmh \
  -DartifactId=test \
  -Dversion=1.0

mvn clean verify
```

## Tema 95: Como hacer benchmark

- Anotación `@Benchmark`


## Tema 96, 97: JMH Conclusiones y Ejercicio

- Solo en areas criticas
- Es para aplicaciones sensibles a latencia
- Produce resultados precisos
- 


