# Java 16

## Sección 9: Explorando Java 16

### Tema 129: Intro

- Records
- Cambios a Stream API
- Pattern matching para `instanceOf`
- Sealed Types y Records
- Strongly Encapsulate
- Precauciones para KV clases

### Tema 130: Records: BTS

- Vista Previa en JDK 14 y 15
- Permanente desde JDK 16
- `public Record Clase(String llave, Integer valor)`
- Los miembros de la clase son finales
- Se crea un constructor publico
- Se crea una impl de equals, hashcode y toString
- javap -c Clase.class da la firma de la clase
- `public final class com.jmfg.training.java16.Product extends java.lang.Record`
- Records son clases
    - No pueden extender de otra clase
    - No pueden tener campos de instancia
    - Pueden implementar varias interfaces
    - No pueden ser abstractos
    - Son finales de forma implícita
- Se puede usar constructores compactos

### Tema 131: Records: Creando desde Map.Entry

- Constructor
  public PopularItems(Map.Entry<String, String> entry) { this(entry.getKey(), entry.getValue()); }
-

### Tema 132: Records: Llave compuesta

- Se puede usar una llave compuesta en un mapa

### Tema 133: Records para retornar valores multiples

- Se usa collectors.Teeing

### Tema 134: Records: Casos de Uso

- Para DTO
- Para retornar valores múltiples de un objeto
- Streams
- Llaves compuestas de mapas
- No pueden ser usados como JPA o en Hibernate
    - JPA no pueden ser finales y deben de tener un constructor sin parametros
- No pueden ser Java Beans

### Tema 135: Stream flatMap

- flatMap transforma una lista de listas en una lista
- map es 1 a 1
- flatMap es 1 a muchos

### Tema 136: Stream mapMulti

- Se introdujo en JDK 16
- Es parecido a flatMap
- Solo se crea una instancia plana de Stream en lugar de muchas como flatMap

### Te,a 147: Stream toList

- toList crea una lista inmutable

### Tema 138: Pattern matching para InstanceOf

- Permanente en Java 16, Preview en JDK 14
- Se evitan class cast exceptions cuando se declara la variable en instanceOf
- Type Pattern se hace el cast automatico

### Tema 139: Pattern matching para InstanceOf: Entiendo el alcance

- Declarar la variable con instanceOf se llama Type Pattern
- Se declara una variable local
- Eo alcance de la variable es solamente en el bloque de código donde cae
- No se puede usar OR (flow scope)
-
-
- ### Tema 140: Pattern matching para InstanceOf: Futuro
- Pattern matching en switches, arrays, records

### Tema 141: Usando Sealed Types y Records juntos

- Sealed types siguen siendo preview
- Se pueden usar sealed types y records de forma conjunta
- El sealed type es la interface y los records son la clase que extiende

### Tema 142: Entendiendo como los internos del JDK están altamente encapsulados

- Illegal reflective access en JDK ya no es permitido
- -ilegal-access=permit permite

#### Reemplazos

| Actual                     | Reemplazo                             |
|----------------------------|---------------------------------------|
| defineClass                | java.lang.invoke.MethodHandles.Lookup |
| sun.util.calendar.ZoneInfo | java.time API                         |
| com.sun.rowset             | javax.sql.rowset                      |
| JDK Xerces                 | Xerces standalone                     |
| JDK ASM                    | ASM standalone                        |

### Tema 143: jpackage, empaquetando aplicaciones autocontenidas: Intro

- Utilería de empaquetado para apps autocontenidas
- Instala el software en plataformas nativas
- Aplicaciones de escritorio y de línea de comando
- jpackage --name myapp --input lib --main-jar main.jar

#### Produces

| OS      | Formato   |
|---------|-----------|
| Windows | msi & exe |
| Linux   | deb & rpm |
| macOS   | pkg & dmg |

### Tema 144: jpackage, empaquetando aplicaciones autocontenidas

- Wix Toolset es requerido

### Tema 145: Clases basadas en valor, advertencias y motivación

- Las clases Integer, Double, etc son designadas `ValueBased`
- Los constructores están marcados como deprecated
- Son clases de envoltorios de primitivo
- Valhalla se encargará de esto
- Se mejora el performance
