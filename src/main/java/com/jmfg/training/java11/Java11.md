## Tema 60: Introducción

- API de HTTP 
- Sintaxis de variable local para parámetros de lambda
- Cambios al API de String
- Deprecaciones y cosas removidas
- Programas de un solo archivo
- Epsilon y ZGC Garbage Collection
- Nuevos API para File y Predicate
- Flight Recorder / Mission Control


## Tema 61: HTTP Api

- HTTP es fluido
- HTTP 1.1 y 2
- Puede hacer comunicación asíncrona

## Tema 62: HTTP Api - Componentees
 
- HttpRequest
  - GET
  - POST
- HttpClient
  - send
  - sendAsync
- HttpResponse
  - uri
  - body

## Tema 63: Enviando request asincronos

- Se usa el patron Builder `HttpClient.newBuilder()`

## Tema 64: HTTP Client API

- Actualiza el URL connection API
- Es compacto
- Tiene streams reactivos

## Tema 65: Local variables para parametros de lambda

- Se introdujo para uniformidad
- (var s, var length) -> s.length > length

## Tema 66: String repeat

- Repite la secuencia de caracteres N veces


## Tema 67: String isBlank

- Revisa si el string esta en blanco
- Trim regresa un string sin las partes en blanco del inicio y del final
- Whitespace es u+0020 (espacio)

## Tema 67, 68, 69: String strip

- strip remove espacio en blanco del inicio y del final
- `stripTrailing` remueve el espacio en blanco al final
- `stripLeading` remueve el espacio en blanco al inicio
- Hacen uso de `Character.isWhitespace`

## Tema 70: String lines()

- Obtiene todas las lineas separadas por separador de linea

## Tema 71: Epsilon GC

- No hace nada
- No op

## Tema 72: Z GC

- Latencia baja, escalable
- Maxima pausa es 10 milisegundos
- Es concurrente
- Para heap size en terabytes
- Experimental linux x64
- Almacena metadata de los objetos
- 

## Tema 73: Deprecación y cosas removidas

- Se remueve JavaEE y Corba
- Se remueve JAX-WS usado para webservices soap
- Se remueve JAXB para XML binding
- Java Beans Activation JAF
- Java Transaction Api JTA

## Tema 74: Applets y Nashorn

- Las applets tenían problemas de seguridad
- Desde 2013 todos los navegadores dejaron de soportar applets
- Nashorn era un motor de Javascript como reemplazo de Rino
- ECMAScript hizo que el mantenimiento de Nashorn muy laborioso


## Tema 75: JavaFX y OpenJFX

- JavaFX era parte de JDK 8, 9 y 10
- Ya no es incluido a partir de JDK 11
- Se puede descargar de OpenJFX

## Tema 76: Programas de archivo Único 

- Se puede lanzar una clase sin compilar solamente java App.java


## Tema 77: Shebang

- #! es un shebang
- El archivo debe ser único y no debe de tener la extensión java


## Tema 78: File API

- Files.readAllBytes y readString

## Tema 79: Interface Predicate usando not()

- ((Predicate<String>) String::isBlank).negate()
- Predicate.not(String::isBlank)

## Tema 80: JDK Flight Recorder

- Un perfilador monitorea la ejecución de un JVM al nivel de bytecode
  - Inspeccionan el estado del JVM
    - CPU
    - Heap
    - Wall-Clock
    - Thread
  - Java Visual VM, YourKit, Visual Profiler
  - Flight Recorder es un perfilador y diagnosticador
    - Alto desempeño, dentro del JVM
    - Bajo overhead (1 a 2%)
    - Graba en archivos binarios
    - Uso de memoria, GC, input output, sockets y mas}+
    - Puede usarse en producción
  - java -XX:StartFlightRecording inicia el perfilador
  - java -XX:StartFlightRecording=duration=60s,filename=recording.jfr App
  - No necesita ser configurado cuando el JVM inicia
  - jcmd <PID> JFR.stat duration=30s filename=recording.jfr

## Tema 81: Java Mission Control (JMC)

- Suite para monitorear, perfilar y optimizar aplicaciones
- Histogramas, listas, graficas y tablas faciles de entender
- Interface grafica de lo que el JFR graba
- Azul Mission Control en zulu
- Tiene que ser descargado por separado

## Tema 82: JMC en Deadlock

- Conectar a MbeanServer
- Seleccionar threads

## Tema 83: Crear una grabación y verla en JMC

- java -XX:StartFlightRecording=dumponexit=true,filename=deadlocked.jfr

