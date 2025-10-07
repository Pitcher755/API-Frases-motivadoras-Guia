# 🎯 **ESTRUCTURA DE LA GUÍA: Creando tu Primera API con Spring Boot - Frases Motivadoras para Developers"**

## 🌟 **API de Frases Motivadoras para Desarrolladores**

**Propósito:** Una API que devuelve frases inspiradoras para cuando el código no compila, los bugs parecen interminables o necesitas un empujón motivacional en tu journey como developer.

---

## 📚 **SECCIÓN 1: Preparando el Terreno - Configuración Inicial**
- **Archivos tratados:** `pom.xml`, `application.properties`
- **Temas:** ¿Qué es una API? Spring Boot para principiantes, Maven, estructura del proyecto motivador
- **💡 Enfoque especial:** Configuración de un ambiente de desarrollo acogedor

## 📚 **SECCIÓN 2: El Motor de la Motivación - Clase Principal**
- **Archivos tratados:** `FrasesMotivadorasApplication.java`
- **Temas:** `@SpringBootApplication`, método `main`, el "encendido" de nuestra aplicación
- **💡 Analogía:** Como prender la computadora antes de empezar a programar

## 📚 **SECCIÓN 3: Modelando la Inspiración - Entidad FraseMotivadora**
- **Archivos tratados:** `FraseMotivadora.java`
- **Temas:** POJOs, JPA, anotaciones, getters/setters
- **💡 Ejemplo práctico:** Crear una entidad que almacene frases con autor y categoría

## 📚 **SECCIÓN 4: El Archivo de la Sabiduría - Repository**
- **Archivos tratados:** `FraseMotivadoraRepository.java`
- **Temas:** Patrón Repository, Spring Data JPA, métodos mágicos
- **💡 Beneficio:** Aprenderás a "preguntarle" a la base de datos sin escribir SQL complejo

## 📚 **SECCIÓN 5: El Coach Digital - Service**
- **Archivos tratados:** `FraseMotivadoraService.java`
- **Temas:** Lógica de negocio, inyección de dependencias, Optional
- **💡 Funcionalidades cool:** Obtener frases aleatorias, por categoría, para momentos específicos

## 📚 **SECCIÓN 6: Compartiendo la Motivación - Controller**
- **Archivos tratados:** `FraseMotivadoraController.java`, `HealthCheckController.java`
- **Temas:** REST API, endpoints, HTTP methods, status codes
- **💡 Endpoints motivadores:** `/frases/aleatoria`, `/frases/categoria/{categoria}`, `/frases/dificultad`

## 📚 **SECCIÓN 7: Semillas de Inspiración - data.sql**
- **Archivos tratados:** `data.sql`
- **Temas:** Datos iniciales, INSERT, frases reales para developers
- **💡 Contenido real:** Frases de famosos developers, consejos prácticos, ánimos para momentos difíciles

## 📚 **SECCIÓN 8: Lanzando tu API al Mundo - Despliegue**
- **Archivos tratados:** `render.yaml`
- **Temas:** Docker, Render.com, despliegue en la nube
- **💡 Logro:** Tu API de motivación disponible 24/7 para ti y otros developers

## 📚 **SECCIÓN 9: Probando la Motivación - Tests y Documentación**
- **Archivos tratados:** Tests, Postman collection
- **Temas:** Pruebas unitarias, documentación API, Postman
- **💡 Valor agregado:** Aprender testing con ejemplos reales y útiles

## 📚 **SECCIÓN 10: Mejorando el Coach Digital - Extensiones Prácticas**
- **Archivos tratados:** Extensiones del proyecto
- **Temas:** Validaciones, manejo de errores, seguridad básica
- **💡 Ideas creativas:** Endpoint para frases del día, sistema de votos, categorías por lenguaje de programación

---

## 🎨 **CARACTERÍSTICAS ESPECIALES DEL CURSO:**

### 🌈 **Tono Motivacional Integrado:**
- **Cada sección incluye:** Frases motivadoras relevantes al tema
- **Ejercicios con propósito:** Crear funcionalidades que realmente ayuden a otros
- **Código comentado con actitud positiva:** Explicaciones que animan a seguir aprendiendo

### 🎯 **Ejemplos Reales y Útiles:**
```java
// En lugar de ejemplos aburridos, tendremos:
- "Frase para cuando tu código no compila"
- "Motivación para aprender un nuevo framework"  
- "Ánimos para el primer deploy en producción"
```

### 📊 **Estructura de Datos Motivadora:**
```java
@Entity
public class FraseMotivadora {
    private String contenido;      // La frase inspiradora
    private String autor;          // Developer famoso o anónimo
    private String categoria;      // "compilacion", "aprendizaje", "deploy"
    private String lenguaje;       // "java", "javascript", "general"
    private int nivelDificultad;   // 1-5 (para momentos específicos)
}
```

### 🌟 **Endpoints que Realmente Ayudan:**
```
GET  /frases/aleatoria           # Una dosis aleatoria de motivación
GET  /frases/hoy                 # Frase del día
GET  /frases/categoria/deploy    # Frases específicas para deployments
GET  /frases/nivel/3             # Motivación para dificultad media
POST /frases                     # ¡Contribuye con tu propia frase!
```

---

## 🚀 **NUEVO FLUJO DE APRENDIZAJE:**
```
¡Prepara tu Ambiente! → Enciende la App → Modela la Inspiración → 
Gestiona la Sabiduría → Crea el Coach Digital → Comparte Motivación → 
Siembra Frases → Lanza al Mundo → Prueba tu Creación → Mejora Continuamente
```

## 💫 **BENEFICIOS ÚNICOS DE ESTE ENFOQUE:**

1. **✅ Aprendes Spring Boot** con un proyecto que realmente puedes usar
2. **✅ Creas algo positivo** para la comunidad developer
3. **✅ Entiendes conceptos técnicos** a través de analogías motivadoras
4. **✅ Terminas con un portfolio project** que demuestra empatía y habilidades técnicas
5. **✅ Puedes extenderlo fácilmente** con ideas creativas propias

---

# 📚 SECCIÓN 1: Preparando el Terreno - Configuración Inicial

## 🌟 Bienvenido al Mundo de las APIs Motivadoras

**Imagina esto:** Estás aprendiendo a programar, llevas horas intentando resolver un error y te sientes frustrado. De repente, recibes un mensaje con una frase inspiradora que te da el empujón para seguir intentándolo. 

¡Eso es exactamente lo que vamos a construir! Una **API de frases motivadoras** para desarrolladores que necesitan ese pequeño impulso en su journey de aprendizaje.

---

## 🎯 ¿Qué es una API? - Explicación para Humanos

Piensa en una API como un **camarero en un restaurante**:

```
TÚ (Cliente) → "Quiero una frase motivadora" 
               ↓
           CAMARERO (API) 
               ↓ 
COCINA (Base de datos) → "Toma esta frase inspiradora"
```

**API** significa **Application Programming Interface** (Interfaz de Programación de Aplicaciones). En español simple: es un **puente** que permite que diferentes programas se comuniquen entre sí.

### 💡 Nuestro caso práctico:
- **Tú** (desde el navegador o Postman) → Pides una frase motivadora
- **Nuestra API** (Spring Boot) → Recibe la petición y busca en la base de datos
- **Base de datos** → Devuelve una frase como: *"El único código perfecto es el que nunca se escribe. ¡Sigue iterando!"*

---

## 🚀 Spring Boot: Tu Nuevo Mejor Amigo

**Spring Boot** es como un **kit de herramientas mágico** para crear aplicaciones Java rápidamente. 

### ¿Por qué usamos Spring Boot?
- ✅ **Configuración automática**: Muchas cosas funcionan sin que tengas que configurarlas
- ✅ **Servidor incorporado**: No necesitas instalar nada extra
- ✅ **Convenciones sobre configuraciones**: Sigue mejores prácticas por defecto

### ⚡ Analogía perfecta:
Spring Boot es como **comprar muebles de IKEA** vs. **hacerlos desde cero**:
- **Desde cero**: Cortar madera, diseñar, pintar... (Java puro)
- **IKEA**: Todas las piezas vienen preparadas, solo ensamblas (Spring Boot)

---

## 🛠️ Creando Nuestro Proyecto Motivador

### Paso 1: Ve a Spring Initializr
Abre tu navegador y visita: **[https://start.spring.io](https://start.spring.io)**

### Paso 2: Rellena el formulario mágico:
```
Project: Maven Project
Language: Java
Spring Boot: 3.5.6 (la versión más estable)

Group: com.motivacion
Artifact: frases-motivadoras
Name: frases-motivadoras
Description: API de frases motivadoras para desarrolladores
Package name: com.motivacion.frasesmotivadoras

Java: 17 (¡la versión que usan los profesionales!)
```

### Paso 3: Añade las dependencias (nuestras "superpoderes"):
- ✅ **Spring Web** (para crear la API)
- ✅ **Spring Data JPA** (para la base de datos)
- ✅ **H2 Database** (base de datos en memoria para practicar)

### Paso 4: ¡Haz click en "GENERATE"! 
Descargarás un archivo ZIP. ¡Descomprímelo en tu carpeta de proyectos!

---

## 📦 Analicemos el `pom.xml` - Nuestra Lista de Materiales

El archivo `pom.xml` es como la **lista de compras** de nuestro proyecto. Le dice a Maven (nuestro "asistente personal") qué ingredientes necesita.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!-- 
   📄 ARCHIVO: pom.xml
   🎯 PROPÓSITO: Es el "libro de recetas" de nuestro proyecto motivador
   ⚡ Spring Boot hace el 80% del trabajo pesado por nosotros
-->

<project xmlns="http://maven.apache.org/POM/4.0.0" 
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
         https://maven.apache.org/xsd/maven-4.0.0.xsd">
    
    <!-- ========================
         🏷️ NUESTRA IDENTIFICACIÓN
         ======================== -->
    <modelVersion>4.0.0</modelVersion>
    
    <!-- 👨‍👦 HERENCIA DE SPRING BOOT (el papá que sabe mucho) -->
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.5.6</version>
        <relativePath/> 
        <!-- 
           🧩 RELATIVE_PATH: "Confía en mí, yo sé dónde encontrar las instrucciones"
           💡 Spring Boot ya sabe dónde está el manual de instrucciones
        -->
    </parent>
    
    <!-- 🏷️ NUESTRO DNI DIGITAL -->
    <groupId>com.motivacion</groupId>
    <artifactId>frases-motivadoras</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <!-- 
       🏢 GROUP_ID: com.motivacion (como tu apellido)
       📦 ARTIFACT_ID: frases-motivadoras (tu nombre)
       🏷️ VERSION: 0.0.1-SNAPSHOT (estamos en versión beta emocionante)
    -->
    
    <name>frases-motivadoras</name>
    <description>API de frases motivadoras para desarrolladores en formación</description>
    <!-- 📝 El nombre bonito y la descripción que verá todo el mundo -->

    <!-- ========================
         ⚙️ CONFIGURACIONES TÉCNICAS
         ======================== -->
    <properties>
        <java.version>17</java.version>
        <!-- 
           ☕ JAVA_VERSION: Usamos Java 17 - ¡Estable y moderno!
           💡 Es como usar la versión más estable de tu app favorita
        -->
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <!-- 🌐 Para que acepte tildes, emojis y caracteres especiales -->
    </properties>

    <!-- ========================
         📚 NUESTROS SUPERpoderes (DEPENDENCIAS)
         ======================== -->
    <dependencies>
        <!-- 🎯 SUPERpoder 1: Base de Spring Boot -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter</artifactId>
            <!-- 
               🧩 El cimiento de todo - sin esto, nada funciona
               ✅ Incluye: Configuración automática, gestión de vida de la app
            -->
        </dependency>

        <!-- 🎯 SUPERpoder 2: Testing (nuestro equipo de calidad) -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <!-- 
               🧪 SCOPE=TEST: Solo aparece cuando estamos probando
               💡 Como los amigos que solo llamas cuando necesitas ayuda con muebles
            -->
        </dependency>

        <!-- 🎯 SUPERpoder 3: Web (para crear la API REST) -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <!-- 
               🌐 Esto es mágico: Nos permite crear APIs sin configurar servidores
               ✅ Incluye: Servidor Tomcat embebido, conversión JSON automática
               💡 ¡Nuestra API entenderá JSON sin que le enseñemos!
            -->
        </dependency>
        
        <!-- 🎯 SUPERpoder 4: Base de Datos (JPA) -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
            <!-- 
               🗄️ JPA: Java Persistence API - ¡Habla con bases de datos por nosotros!
               ✅ Incluye: Hibernate (el traductor español-base_de_datos)
               💡 Aprenderás a guardar frases sin escribir SQL complicado
            -->
        </dependency>
        
        <!-- 🎯 SUPERpoder 5: Base de datos H2 (nuestra memoria temporal) -->
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>runtime</scope>
            <!-- 
               💾 H2: Base de datos en memoria - Perfecta para aprender
               🧩 SCOPE=RUNTIME: Solo existe cuando la app está corriendo
               💡 Como una pizarra que se borra cuando apagas la app
            -->
        </dependency>
    </dependencies>

    <!-- ========================
         🛠️ HERRAMIENTAS DE CONSTRUCCIÓN
         ======================== -->
    <build>
        <plugins>
            <!-- 🔧 HERRAMIENTA 1: Plugin principal de Spring Boot -->
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <!-- 
                   🚀 El empaquetador profesional: Crea el JAR ejecutable
                   💡 Convierte nuestro código en una app que cualquiera puede ejecutar
                -->
            </plugin>
            
            <!-- 🔧 HERRAMIENTA 2: Saltar pruebas (modo desarrollo rápido) -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M7</version>
                <configuration>
                    <skipTests>true</skipTests>
                    <!-- 
                       ⚠️ SKIP_TESTS: Para desarrollo rápido (no en producción)
                       💡 Como correr los 100m sin calentar - rápido pero arriesgado
                    -->
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

---

## ⚙️ El `application.properties` - Nuestro Panel de Control

Este archivo es donde **configuramos cómo se comporta nuestra aplicación**. Es como los ajustes de tu videojuego favorito.

```properties
# 📄 ARCHIVO: src/main/resources/application.properties
# 🎯 PROPÓSITO: Los "ajustes" de nuestra aplicación motivadora
# 💡 Aquí le decimos a Spring Boot cómo queremos que se comporte

# ========================
# 🏷️ CONFIGURACIÓN BÁSICA
# ========================

# Nombre de nuestra aplicación motivadora
spring.application.name=frases-motivadoras
# 🏷️ El nombre con el que se presentará nuestra API al mundo

# Puerto donde escuchará nuestra aplicación
server.port=${PORT:8080}
# 🌐 Puerto 8080 - El clásico para desarrollo
# 💡 ${PORT:8080} = "Usa la variable PORT si existe, sino usa 8080"
# 🚀 Esto nos ayudará cuando despleguemos en Render.com

# ========================
# 🗄️ BASE DE DATOS H2 (NUESTRA MEMORIA TEMPORAL)
# ========================

# Dirección de la base de datos
spring.datasource.url=jdbc:h2:mem:motivaciondb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
# 💾 jdbc:h2:mem: = Base de datos en la memoria RAM
# 🏷️ motivaciondb = Nombre de nuestra base de datos motivadora
# ⚙️ DB_CLOSE_DELAY=-1 = "No te cierres hasta que yo te lo diga"

# Controlador (el "driver" de la base de datos)
spring.datasource.driver-class-name=org.h2.Driver
# 🚗 El programa que permite a Java hablar con H2

# Credenciales de acceso (super simples para desarrollo)
spring.datasource.username=sa
spring.datasource.password=
# 🔐 Usuario: sa (system administrator)
# 🔓 Contraseña: vacía - ¡Así de fácil para aprender!

# ========================
# ⚙️ CONFIGURACIÓN JPA/HIBERNATE (EL TRADUCTOR)
# ========================

# Dialecto de H2 (cómo hablarle a esta base de datos)
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
# 🗣️ "Hablo el dialecto H2, no el de MySQL o PostgreSQL"

# Estrategia de creación de tablas
spring.jpa.hibernate.ddl-auto=update
# 🔄 UPDATE = "Actualiza las tablas si mis clases cambian"
# 💡 Perfecto para desarrollo: evoluciona con nosotros

# Mostrar las consultas SQL en consola
spring.jpa.show-sql=true
# 👁️ MUY ÚTIL: Veremos exactamente qué SQL se ejecuta
# 💡 Como tener subtítulos cuando la base de datos "habla"

# Cargar datos iniciales automáticamente
spring.jpa.defer-datasource-initialization=true
spring.sql.init.mode=always
# 📊 "Por favor, carga las frases motivadoras que tengo en data.sql"

# ========================
# 🖥️ CONSOLA WEB H2 (NUESTRA VENTANA A LA BASE DE DATOS)
# ========================

# Activar la consola web de H2
spring.h2.console.enabled=true
# 🌐 "Sí, quiero ver la base de datos en el navegador"

# Ruta para acceder a la consola
spring.h2.console.path=/h2-console
# 🔗 Podrás verla en: http://localhost:8080/h2-console

# ========================
# ✨ BONUS: MEJORAS DE LEGIBILIDAD
# ========================

# Formatear el SQL para que sea más fácil de leer
spring.jpa.properties.hibernate.format_sql=true
# 📝 "Por favor, muestra el SQL bien formateado y bonito"
```

---

## 🎯 Resumen de lo que Acabamos de Lograr

### ✅ **Hemos Entendido Conceptos Clave:**
- **API** = Camarero entre clientes y base de datos
- **Spring Boot** = Kit de herramientas mágico para Java
- **Maven** = Asistente que gestiona dependencias y construye el proyecto

### ✅ **Hemos Configurado Nuestro Entorno:**
- **`pom.xml`** = Lista de materiales con todos nuestros superpoderes
- **`application.properties`** = Panel de control de la aplicación

### ✅ **Próximos Pasos Visualizados:**
```
ESTA SECCIÓN → Configuración inicial
SECCIÓN 2 → Crear la clase principal (el "motor")
SECCIÓN 3 → Modelar nuestras frases motivadoras
```

---

## 🚀 **Ejercicio Práctico: ¡Manos a la Obra!**

### 📝 **Tu Misión:**
1. **Ve a [Spring Initializr](https://start.spring.io/)**
2. **Crea el proyecto exactamente como lo describimos**
3. **Reemplaza el `pom.xml` generado con nuestro código comentado**
4. **Crea el archivo `application.properties` con nuestra configuración**
5. **Ejecuta en la terminal:**
   ```bash
   ./mvnw spring-boot:run
   ```

### 🎉 **¿Qué Debería Pasar?**
Verás un montón de texto en la consola y al final algo como:
```
Started FrasesMotivadorasApplication in 2.345 seconds
```
¡Esto significa que tu aplicación está viva y escuchando en el puerto 8080!

---

## 💫 **Frase Motivadora de la Sección:**
> *"Configurar tu primer proyecto Spring Boot puede sentirse abrumador, pero cada línea de configuración es un paso más cerca de crear algo increíble. ¡Ya tienes los cimientos!"*

**¿Listo para la Siguiente Aventura?** En la **Sección 2** crearemos el corazón de nuestra aplicación y veremos cómo Spring Boot cobra vida. ¡Vamos que puedes! 🚀

---

# 📚 SECCIÓN 2: El Motor de la Motivación - Clase Principal

## 🌟 Encendiendo el Motor de Nuestra Aplicación

**Imagina esto:** Tienes todas las piezas de un coche (las dependencias en `pom.xml`) y el manual de instrucciones (`application.properties`), pero ahora necesitas **darle al contacto** para que todo cobre vida. 

¡Eso es exactamente lo que hace nuestra clase principal! Es el **botón de encendido** de toda la aplicación.

---

## 🎯 ¿Qué es una Clase Principal en Spring Boot?

Piensa en la clase principal como el **director de orquesta**:

```
Director (Clase Principal) → Levanta la batuta → Músicos (Componentes) → ¡Música (API)!
```

O usando nuestra analogía del restaurante:
```
Dueño del restaurante (Clase Principal) → Abre las puertas → Camareros (Controllers) → ¡A servir!
```

**En términos técnicos:** La clase principal contiene el método `main` que Spring Boot ejecuta para iniciar toda la aplicación.

---

## 🚀 Creando Nuestra Clase Principal Motivadora

Vamos a crear el archivo `FrasesMotivadorasApplication.java` en la ruta:
`src/main/java/com/motivacion/frasesmotivadoras/FrasesMotivadorasApplication.java`

```java
package com.motivacion.frasesmotivadoras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 📄 ARCHIVO: FrasesMotivadorasApplication.java
 * 🎯 CLASE PRINCIPAL: El corazón y motor de nuestra aplicación de frases motivadoras
 * 
 * 💡 Esta clase es el punto de entrada que hace que Spring Boot cobre vida.
 * ⚡ Es como el botón de encendido de toda nuestra aplicación.
 * 
 * @author PitcherDev
 * @version 1.0
 * @since 2025
 */
@SpringBootApplication  // 🎪 ¡La anotación mágica que lo hace todo posible!
public class FrasesMotivadorasApplication {

    /**
     * 🎯 MÉTODO MAIN: El punto de entrada de nuestra aplicación
     * 
     * Este método es el primero que se ejecuta cuando arrancamos la aplicación.
     * Es como la llave que enciende el motor del coche.
     * 
     * 📖 ¿Qué hace exactamente?
     * 1. ✅ Carga la configuración de Spring Boot
     * 2. ✅ Escanea nuestro paquete en busca de componentes (@Controller, @Service, etc.)
     * 3. ✅ Inicia el servidor web embebido (Tomcat)
     * 4. ✅ Prepara la aplicación para recibir peticiones HTTP
     * 
     * @param args Argumentos de línea de comandos (opcionales)
     *             💡 Puedes pasar configuraciones especiales al iniciar la app
     * 
     * @implNote SpringApplication.run() es el método que realmente hace la magia
     */
    public static void main(String[] args) {
        // 🚀 ¡ESTA LÍNEA ES LA QUE PONE TODO EN MARCHA!
        SpringApplication.run(FrasesMotivadorasApplication.class, args);
        
        // 💡 Después de esta línea, nuestra aplicación está viva y escuchando
        // en el puerto 8080 (o el que configuramos en application.properties)
    }
}
```

---

## 🔍 Análisis Detallado Línea por Línea

### **1. El Paquete (Package)**
```java
package com.motivacion.frasesmotivadoras;
```
**¿Qué significa?**
- `package` = Define la "dirección" de nuestra clase en el proyecto
- `com.motivacion.frasesmotivadoras` = La carpeta donde vive esta clase
- **Analogía:** Es como la dirección de tu casa: `País.Ciudad.Calle.Número`

### **2. Las Importaciones (Imports)**
```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
```
**¿Qué son los imports?**
- Son como **incluir herramientas** que vamos a usar
- `SpringApplication` = La clase que sabe cómo arrancar Spring Boot
- `SpringBootApplication` = La anotación mágica que configura todo automáticamente

### **3. La Anotación `@SpringBootApplication`** ⭐
```java
@SpringBootApplication
```
**¡Esta es la estrella del espectáculo!** Es como un **combo de tres anotaciones en una**:

```java
// @SpringBootApplication ES EQUIVALENTE A:
@SpringBootConfiguration    // ✅ "Soy una clase de configuración de Spring Boot"
@EnableAutoConfiguration    // ✅ "Configura todo automáticamente, por favor"
@ComponentScan              // ✅ "Busca componentes en este paquete y subpaquetes"
```

**¿Qué hace exactamente?**
- **Escanea** nuestro proyecto en busca de `@Controller`, `@Service`, `@Repository`
- **Configura** automáticamente todo lo que necesita Spring Boot
- **Detecta** las dependencias que tenemos en `pom.xml` y las configura

### **4. El Método `main` - El Punto de Entrada**
```java
public static void main(String[] args) {
```

**Desglosemos esta firma:**
- `public` = Accesible desde cualquier lugar
- `static` = Pertenece a la clase, no necesita una instancia
- `void` = No devuelve nada (se ejecuta y ya)
- `main` = Nombre especial que Java reconoce como punto de entrada
- `String[] args` = Argumentos que podemos pasar al ejecutar la app

### **5. La Línea Mágica: `SpringApplication.run()`**
```java
SpringApplication.run(FrasesMotivadorasApplication.class, args);
```

**¿Qué ocurre aquí?**
1. **SpringApplication.run()** = El método que inicia toda la magia
2. **FrasesMotivadorasApplication.class** = Le decimos "arranca esta clase"
3. **args** = Argumentos de configuración adicionales

**Detrás de escenas, esta línea:**
- ✅ Crea el ** contexto de aplicación** de Spring
- ✅ **Carga todas las configuraciones** de `application.properties`
- ✅ **Detecta y registra** todos nuestros componentes
- ✅ **Inicia el servidor web** embebido (Tomcat)
- ✅ **Pone la aplicación a escuchar** en el puerto 8080

---

## 🎪 ¿Qué Ocurre Realmente al Ejecutar?

### **Antes de `SpringApplication.run()`:**
```
[ ] Servidor web: APAGADO
[ ] Base de datos: NO INICIADA  
[ ] Controladores: NO REGISTRADOS
[ ] La aplicación: DORMIDA
```

### **Después de `SpringApplication.run()`:**
```
[✓] Servidor web: ENCENDIDO (puerto 8080)
[✓] Base de datos: CONECTADA
[✓] Controladores: REGISTRADOS y LISTOS
[✓] La aplicación: ¡VIVA y ESCUCHANDO!
```

---

## 🚀 Probando Nuestra Clase Principal

### **Paso 1: Ejecutar la Aplicación**
```bash
# En la raíz del proyecto, ejecuta:
./mvnw spring-boot:run
```

### **Paso 2: Lo que Deberías Ver en Consola**
```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.5.4)

2024-01-15T10:30:15.123 INFO  Starting FrasesMotivadorasApplication using Java 17
2024-01-15T10:30:15.456 INFO  No active profile set, falling back to default profiles
2024-01-15T10:30:16.789 INFO  Tomcat initialized with port(s): 8080 (http)
2024-01-15T10:30:17.012 INFO  Starting service [Tomcat]
2024-01-15T10:30:17.034 INFO  Starting Servlet engine: [Apache Tomcat]
2024-01-15T10:30:17.567 INFO  Initializing Spring embedded WebApplicationContext
2024-01-15T10:30:17.890 INFO  Root WebApplicationContext: initialization completed
2024-01-15T10:30:18.123 INFO  H2 console available at '/h2-console'
2024-01-15T10:30:18.456 INFO  Tomcat started on port 8080
2024-01-15T10:30:18.789 INFO  Started FrasesMotivadorasApplication in 3.456 seconds
```

### **Paso 3: Verificar que Funciona**
Abre tu navegador y visita: `http://localhost:8080`

**Actualmente verás un error** (porque no tenemos endpoints aún), pero **¡el hecho de que responda significa que funciona!**

---

## 🔧 Personalizando el Arranque

### **Ejemplo: Añadir un Mensaje Motivador al Inicio**
```java
public static void main(String[] args) {
    System.out.println("🚀 Iniciando la API de Frases Motivadoras...");
    System.out.println("💫 Próximamente: inspiración para developers");
    
}
```

---

## 🎯 Resumen de lo Aprendido

### ✅ **Conceptos Clave:**
- **Clase principal** = El director de orquesta de nuestra aplicación
- **`@SpringBootApplication`** = Anotación mágica que configura todo automáticamente
- **Método `main`** = Punto de entrada que Java ejecuta primero
- **`SpringApplication.run()`** = El método que pone todo en marcha

### ✅ **Lo que Spring Boot Hace por Nosotros:**
1. **Configura automáticamente** el servidor web
2. **Escanea y registra** todos nuestros componentes
3. **Configura la base de datos** según `application.properties`
4. **Gestiona la seguridad** básica
5. **Proporciona herramientas** de desarrollo

### ✅ **Flujo de Ejecución:**
```
Ejecutar aplicación → Java busca main() → SpringApplication.run() → 
Configuración automática → Inicia servidor → ¡API lista!
```

---

## 🚀 **Ejercicio Práctico: ¡Hazlo Tú Mismo!**

### 📝 **Tu Misión:**
1. **Crea la carpeta** `src/main/java/com/motivacion/frasesmotivadoras/`
2. **Crea el archivo** `FrasesMotivadorasApplication.java`
3. **Copia el código** que hemos analizado
4. **Ejecuta:** `./mvnw spring-boot:run`
5. **Verifica** que la aplicación se inicia correctamente

### 🎉 **¿Qué Debería Ocurrir?**
- Verás el logo de Spring Boot en la consola
- La aplicación estará escuchando en el puerto 8080
- Podrás acceder a `http://localhost:8080/h2-console` (aunque pida login)

---

## 💫 **Frase Motivadora de la Sección:**
> *"Darle al 'botón de encendido' de tu primera aplicación Spring Boot es como lanzar un cohete: parece complejo, pero una vez que entiendes cada paso, te das cuenta de que la magia está en la preparación. ¡Ya tienes el motor en marcha!"*

**¿Preparado para la Siguiente Aventura?** En la **Sección 3** crearemos nuestro modelo de datos - las frases motivadoras que inspirarán a otros developers. ¡Vamos que lo estás haciendo genial! 🚀

**Próximo paso:** Vamos a modelar nuestras frases motivadoras con la entidad `FraseMotivadora.java`.

---

# 📚 SECCIÓN 3: Modelando la Inspiración - Entidad FraseMotivadora

## 🌟 Creando el Modelo de Nuestras Frases Motivadoras

**Imagina esto:** Quieres construir una biblioteca de frases inspiradoras. Necesitas una **ficha para cada frase** que contenga: la frase itself, quién la dijo, a qué categoría pertenece, etc.

¡Eso es exactamente lo que vamos a crear! Una **entidad** que represente cada frase motivadora en nuestro sistema.

---

## 🎯 ¿Qué es una Entidad en Spring Boot?

Piensa en una entidad como un **formulario en papel** que rellenas para cada frase:

```
Formulario de Frase Motivadora:
- Frase: _________________________________
- Autor: _________________________________
- Categoría: [ ] Aprendizaje [ ] Debugging [ ] Deployment
- Lenguaje: _________________________________
```

**En términos técnicos:** Una entidad es una clase Java que representa una tabla en la base de datos. Cada instancia de la clase = una fila en la tabla.

### 💡 Nuestro caso práctico:
- **Clase `FraseMotivadora`** = La plantilla del formulario
- **Cada objeto `FraseMotivadora`** = Una frase específica rellenada
- **Base de datos** = El archivador donde guardamos todos los formularios

---

## 🚀 Creando Nuestra Entidad FraseMotivadora

Vamos a crear el archivo `FraseMotivadora.java` en la ruta:
`src/main/java/com/motivacion/frasesmotivadoras/model/FraseMotivadora.java`

```java
package com.motivacion.frasesmotivadoras.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * 📄 ARCHIVO: FraseMotivadora.java
 * 🎯 ENTIDAD: Representa una frase motivadora en nuestra base de datos
 * 
 * 💡 Esta clase es el "molde" o "plantilla" para cada frase que guardaremos.
 * ⚡ Cada instancia de esta clase = una fila en la tabla FRASE_MOTIVADORA de la BD.
 * 
 * 📋 CARACTERÍSTICAS DE UNA FRASE:
 * - Contenido inspirador para developers
 * - Autor (famoso o anónimo)
 * - Categoría (aprendizaje, debugging, etc.)
 * - Lenguaje de programación asociado
 * - Nivel de dificultad al que va dirigida
 * - Fecha de creación y última modificación
 * 
 * @author [Tu Nombre]
 * @version 1.0
 * @since 2024
 */
@Entity // 🎪 ¡Esta anotación convierte la clase en una entidad de BD!
@Table(name = "frase_motivadora") // 📊 Opcional: personaliza el nombre de la tabla
public class FraseMotivadora {

    /**
     * 🆔 IDENTIFICADOR ÚNICO: La "matrícula" de cada frase
     * 
     * Cada frase necesita un identificador único para poder ser encontrada,
     * actualizada o eliminada sin confusiones.
     * 
     * ⚡ Características:
     * - @Id: Marca este campo como la clave primaria
     * - @GeneratedValue: La BD genera automáticamente el valor (auto-increment)
     * - Strategy.IDENTITY: Usa la auto-incrementación de la base de datos
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 💬 CONTENIDO: La frase motivadora en sí
     * 
     * Esta es la parte más importante: el mensaje inspirador
     * que ayudará a otros developers en momentos difíciles.
     * 
     * ⚡ @Column: Podemos personalizar cómo se guarda en la BD
     * - nullable = false: Este campo es OBLIGATORIO
     * - length = 500: Máximo 500 caracteres (suficiente para una frase)
     */
    @Column(name = "contenido", nullable = false, length = 500)
    private String contenido;

    /**
     * 👤 AUTOR: Quién dijo o escribió la frase
     * 
     * Puede ser un developer famoso, un autor anónimo,
     * o incluso "Anónimo" si no conocemos el origen.
     * 
     * 💡 Ejemplos: "Kent Beck", "Martin Fowler", "Desconocido"
     */
    @Column(name = "autor", length = 100)
    private String autor;

    /**
     * 🏷️ CATEGORÍA: El contexto o situación de la frase
     * 
     * Clasifica la frase según el momento de desarrollo al que va dirigida.
     * Esto nos permitirá después buscar frases por categoría.
     * 
     * 💡 Ejemplos: 
     * - "aprendizaje" (para cuando estás aprendiendo algo nuevo)
     * - "debugging" (para cuando tienes bugs difíciles)
     * - "deployment" (para cuando haces deploy a producción)
     * - "motivacion_general" (frases universales)
     */
    @Column(name = "categoria", length = 50)
    private String categoria;

    /**
     * 💻 LENGUAJE: Lenguaje de programación asociado
     * 
     * Algunas frases son específicas para ciertos lenguajes,
     * otras son generales para cualquier developer.
     * 
     * 💡 Ejemplos: "java", "javascript", "python", "general"
     */
    @Column(name = "lenguaje", length = 30)
    private String lenguaje;

    /**
     * 📊 NIVEL DE DIFICULTAD: A qué nivel de developer va dirigida
     * 
     * Escala del 1 al 5:
     * - 1: Principiante total (primeras líneas de código)
     * - 2: Junior (primer proyecto)
     * - 3: Mid-level (varios proyectos)
     * - 4: Senior (experiencia considerable)
     * - 5: Experto (architect, lead, etc.)
     */
    @Column(name = "nivel_dificultad")
    private Integer nivelDificultad;

    /**
     * ⭐ FRASE DESTACADA: Si es una frase especialmente inspiradora
     * 
     * Marcaremos algunas frases como destacadas para poder
     * mostrarlas en lugares especiales de nuestra API.
     */
    @Column(name = "destacada")
    private Boolean destacada = false;

    /**
     * 📅 FECHA DE CREACIÓN: Cuándo se añadió la frase al sistema
     * 
     * Se guarda automáticamente cuando creamos una nueva frase.
     * Útil para saber cuándo se añadió cada inspiración.
     */
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    /**
     * 🔄 FECHA DE MODIFICACIÓN: Cuándo se actualizó por última vez
     * 
     * Se actualiza automáticamente cuando modificamos la frase.
     */
    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;

    // ==================================================
    // 🏗️ CONSTRUCTORES: Diferentes formas de crear frases
    // ==================================================

    /**
     * 🔧 CONSTRUCTOR VACÍO (OBLIGATORIO para JPA)
     * 
     * Spring Boot y JPA necesitan un constructor sin argumentos
     * para poder crear instancias de la entidad.
     * 
     * ⚠️ Aunque no lo uses directamente, DEBE existir
     */
    public FraseMotivadora() {
        // Constructor vacío requerido por JPA
    }

    /**
     * 🔧 CONSTRUCTOR CON PARÁMETROS BÁSICOS
     * 
     * Para crear frases rápidamente con los datos esenciales.
     * Los campos opcionales se inicializan con valores por defecto.
     * 
     * @param contenido La frase motivadora (OBLIGATORIO)
     * @param autor Quién dijo la frase
     * @param categoria Contexto o situación
     */
    public FraseMotivadora(String contenido, String autor, String categoria) {
        this.contenido = contenido;
        this.autor = autor;
        this.categoria = categoria;
        this.lenguaje = "general"; // Valor por defecto
        this.nivelDificultad = 3; // Nivel medio por defecto
        this.destacada = false;
        this.fechaCreacion = LocalDateTime.now();
        this.fechaActualizacion = LocalDateTime.now();
    }

    /**
     * 🔧 CONSTRUCTOR COMPLETO
     * 
     * Para cuando queremos especificar todos los detalles de la frase.
     * 
     * @param contenido La frase motivadora
     * @param autor Autor de la frase
     * @param categoria Categoría o contexto
     * @param lenguaje Lenguaje de programación
     * @param nivelDificultad Nivel de developer (1-5)
     * @param destacada Si es una frase especial
     */
    public FraseMotivadora(String contenido, String autor, String categoria, 
                          String lenguaje, Integer nivelDificultad, Boolean destacada) {
        this.contenido = contenido;
        this.autor = autor;
        this.categoria = categoria;
        this.lenguaje = lenguaje;
        this.nivelDificultad = nivelDificultad;
        this.destacada = destacada;
        this.fechaCreacion = LocalDateTime.now();
        this.fechaActualizacion = LocalDateTime.now();
    }

    // ==================================================
    // 🔄 MÉTODOS DE ACCESO (GETTERS y SETTERS)
    // ==================================================

    /**
     * 📖 GETTERS: Métodos para OBTENER los valores de los campos
     * 
     * Siguen el patrón: get + NombreCampo (con primera mayúscula)
     * Ejemplo: getContenido(), getAutor(), etc.
     */

    public Long getId() {
        return id;
    }

    public String getContenido() {
        return contenido;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public Integer getNivelDificultad() {
        return nivelDificultad;
    }

    public Boolean getDestacada() {
        return destacada;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * ✏️ SETTERS: Métodos para MODIFICAR los valores de los campos
     * 
     * Siguen el patrón: set + NombreCampo (con primera mayúscula)
     * Ejemplo: setContenido(), setAutor(), etc.
     * 
     * 💡 En los setters de fechas, añadimos lógica adicional
     */

    public void setId(Long id) {
        this.id = id;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
        actualizarFechaModificacion(); // Actualiza la fecha al cambiar contenido
    }

    public void setAutor(String autor) {
        this.autor = autor;
        actualizarFechaModificacion();
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
        actualizarFechaModificacion();
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
        actualizarFechaModificacion();
    }

    public void setNivelDificultad(Integer nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
        actualizarFechaModificacion();
    }

    public void setDestacada(Boolean destacada) {
        this.destacada = destacada;
        actualizarFechaModificacion();
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    // ==================================================
    // 🔧 MÉTODOS AUXILIARES (Lógica de negocio)
    // ==================================================

    /**
     * 🔄 ACTUALIZAR FECHA DE MODIFICACIÓN
     * 
     * Método privado que se llama automáticamente cuando
     * modificamos cualquier campo de la frase.
     * 
     * 💡 Esto asegura que siempre tengamos la fecha actualizada
     */
    private void actualizarFechaModificacion() {
        this.fechaActualizacion = LocalDateTime.now();
    }

    /**
     * ⭐ MARCAR COMO DESTACADA
     * 
     * Método especial para marcar una frase como destacada.
     * Más legible que usar setDestacada(true).
     */
    public void marcarComoDestacada() {
        this.destacada = true;
        actualizarFechaModificacion();
    }

    /**
     * 🔽 DESMARCAR COMO DESTACADA
     * 
     * Método especial para quitar el destacado de una frase.
     */
    public void desmarcarComoDestacada() {
        this.destacada = false;
        actualizarFechaModificacion();
    }

    /**
     * 📝 MÉTODO toString() - Representación en texto de la frase
     * 
     * Útil para logging y debugging. Nos muestra la frase
     * de forma legible cuando la imprimimos en consola.
     * 
     * @return String con los detalles de la frase
     */
    @Override
    public String toString() {
        return "FraseMotivadora{" +
                "id=" + id +
                ", contenido='" + contenido + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria='" + categoria + '\'' +
                ", lenguaje='" + lenguaje + '\'' +
                ", nivelDificultad=" + nivelDificultad +
                ", destacada=" + destacada +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }

    /**
     * ✅ MÉTODO equals() - Comparar si dos frases son iguales
     * 
     * Dos frases se consideran iguales si tienen el mismo ID
     * (que es único en la base de datos).
     * 
     * @param obj El objeto a comparar
     * @return true si son la misma frase, false si no
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FraseMotivadora that = (FraseMotivadora) obj;
        return id != null && id.equals(that.id);
    }

    /**
     * 🆔 MÉTODO hashCode() - Código hash para colecciones
     * 
     * Necesario cuando sobrescribimos equals().
     * Usa el ID para generar el código hash.
     * 
     * @return Código hash basado en el ID
     */
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
```

---

## 🔍 Análisis de las Anotaciones JPA Más Importantes

### **1. `@Entity` - La Transformación Mágica**
```java
@Entity
```
**¿Qué hace?** Convierte una clase Java normal en una entidad de base de datos.
**Resultado:** Spring Boot creará automáticamente una tabla llamada `frase_motivadora`.

### **2. `@Id` + `@GeneratedValue` - La Identificación Única**
```java
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
```
**¿Qué hace?** 
- `@Id` = Este campo es la clave primaria (identificador único)
- `@GeneratedValue` = La base de datos genera automáticamente el valor
- `IDENTITY` = Usa auto-incremento (1, 2, 3, ...)

### **3. `@Column` - Personalizando las Columnas**
```java
@Column(name = "contenido", nullable = false, length = 500)
```
**Opciones útiles:**
- `name` = Nombre de la columna en la BD (opcional)
- `nullable` = Si puede ser null (false = obligatorio)
- `length` = Longitud máxima del texto

---

## 🗃️ ¿Qué Tabla se Creará en la Base de Datos?

Basado en nuestra entidad, Spring Boot creará automáticamente esta tabla:

```sql
CREATE TABLE frase_motivadora (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    contenido VARCHAR(500) NOT NULL,
    autor VARCHAR(100),
    categoria VARCHAR(50),
    lenguaje VARCHAR(30),
    nivel_dificultad INT,
    destacada BOOLEAN DEFAULT FALSE,
    fecha_creacion TIMESTAMP,
    fecha_actualizacion TIMESTAMP
);
```

---

## 🎯 Resumen de lo Aprendido

### ✅ **Conceptos Clave:**
- **Entidad** = Clase Java que representa una tabla de BD
- **JPA** = API que mapea objetos Java a tablas de BD
- **Anotaciones** = `@Entity`, `@Id`, `@Column` configuran el mapeo
- **Getters/Setters** = Métodos para acceder y modificar los campos

### ✅ **Estructura de Nuestra Entidad:**
```
FraseMotivadora
├── 🆔 id (identificador único)
├── 💬 contenido (la frase inspiradora)
├── 👤 autor (quién la dijo)
├── 🏷️ categoria (contexto de uso)
├── 💻 lenguaje (asociado a qué lenguaje)
├── 📊 nivelDificultad (1-5)
├── ⭐ destacada (frase especial)
├── 📅 fechaCreacion (cuándo se añadió)
└── 🔄 fechaActualizacion (última modificación)
```

### ✅ **Beneficios de Usar Entidades JPA:**
1. **No escribimos SQL** = Spring Boot lo genera automáticamente
2. **Objetos Java naturales** = Trabajamos con clases, no con tablas
3. **Validación automática** = `nullable=false` evita datos incorrectos
4. **Mantenimiento fácil** = Cambios en la clase = cambios automáticos en BD

---

## 🚀 **Ejercicio Práctico: ¡Crea tu Primera Entidad!**

### 📝 **Tu Misión:**
1. **Crea la carpeta** `src/main/java/com/motivacion/frasesmotivadoras/model/`
2. **Crea el archivo** `FraseMotivadora.java`
3. **Copia el código** que hemos analizado
4. **Ejecuta la aplicación** para ver la tabla creada automáticamente

### 🔍 **Para Verificar que Funciona:**
1. Ejecuta: `./mvnw spring-boot:run`
2. Abre: `http://localhost:8080/h2-console`
3. Conecta con:
   - JDBC URL: `jdbc:h2:mem:motivaciondb`
   - User: `sa`
   - Password: (vacío)
4. Verifica que existe la tabla `FRASE_MOTIVADORA`

---

## 💫 **Frase Motivadora de la Sección:**
> *"Crear tu primera entidad JPA es como aprender un nuevo idioma: al principio parece complejo, pero pronto descubres que es una forma elegante de comunicar a Java con la base de datos. ¡Cada anotación es una palabra nueva en este lenguaje!"*

**¿Preparado para la Siguiente Aventura?** En la **Sección 4** crearemos el Repository - la capa que se comunicará con la base de datos para guardar y recuperar nuestras frases motivadoras. ¡Vamos que cada vez lo haces mejor! 🚀

**Próximo paso:** `FraseMotivadoraRepository.java` - nuestro acceso mágico a la base de datos.

---

# 📚 SECCIÓN 4: El Archivo de la Sabiduría - Repository

## 🌟 Creando Nuestro Acceso a la Base de Datos

**Imagina esto:** Tienes una biblioteca llena de frases motivadoras (la base de datos) y necesitas un **bibliotecario experto** que sepa encontrar exactamente lo que buscas: frases por categoría, por autor, frases destacadas, etc.

¡Eso es exactamente lo que vamos a crear! Un **Repository** que actuará como nuestro bibliotecario personal para gestionar todas las frases motivadoras.

---

## 🎯 ¿Qué es un Repository en Spring Boot?

Piensa en un Repository como un **bibliotecario especializado**:

```
TÚ: "Oye, necesito una frase sobre debugging"
BIBLIOTECARIO (Repository): "¡Claro! Te traigo todas las frases de la categoría 'debugging'"

TÚ: "¿Tienes frases de Kent Beck?"
BIBLIOTECARIO: "Sí, aquí tienes todas las frases donde el autor es 'Kent Beck'"
```

**En términos técnicos:** Un Repository es una interfaz que nos permite realizar operaciones CRUD (Create, Read, Update, Delete) en la base de datos **sin escribir SQL**.

### 💡 La Magia de Spring Data JPA:
- **No escribimos implementaciones** = Spring Boot las genera automáticamente
- **Métodos por convención** = El nombre del método define la query
- **SQL automático** = Spring genera el SQL por detrás

---

## 🚀 Creando Nuestro Repository FraseMotivadoraRepository

Vamos a crear el archivo `FraseMotivadoraRepository.java` en la ruta:
`src/main/java/com/motivacion/frasesmotivadoras/repository/FraseMotivadoraRepository.java`

```java
package com.motivacion.frasesmotivadoras.repository;

import com.motivacion.frasesmotivadoras.model.FraseMotivadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * 📄 ARCHIVO: FraseMotivadoraRepository.java
 * 🎯 REPOSITORY: El "bibliotecario" que gestiona nuestras frases motivadoras
 * 
 * 💡 Esta interfaz es nuestro acceso a la base de datos para las frases.
 * ⚡ Spring Data JPA genera automáticamente la implementación completa.
 * 
 * 📚 FUNCIONALIDADES PRINCIPALES:
 * - Guardar nuevas frases motivadoras
 * - Buscar frases por ID, categoría, autor, etc.
 * - Recuperar listas de frases (todas, destacadas, por lenguaje)
 * - Actualizar y eliminar frases
 * - Consultas personalizadas para necesidades específicas
 * 
 * 🎪 LA MAGIA: Extendemos JpaRepository y obtenemos +20 métodos gratis
 * 
 * @author [Tu Nombre]
 * @version 1.0
 * @since 2024
 */
@Repository // 🏷️ Marca esta interfaz como un componente de acceso a datos
public interface FraseMotivadoraRepository 
        extends JpaRepository<FraseMotivadora, Long> { // 🎪 ¡La herencia mágica!
    
    /**
     * ==================================================
     * 🔍 MÉTODOS AUTOMÁTICOS POR CONVENCIÓN (MAGIA SPRING)
     * ==================================================
     * 
     * 💡 Spring Data JPA genera el SQL automáticamente basándose en el nombre del método.
     * 📖 Convención: findBy + NombreCampo + (Condiciones)
     */

    /**
     * 🔍 BUSCAR FRASES POR CATEGORÍA (Ignore Case = sin distinguir mayúsculas)
     * 
     * Ejemplo de uso: 
     * - findByCategoria("debugging") → busca frases de debugging
     * - findByCategoria("aprendizaje") → frases para aprender
     * 
     * ⚡ SQL generado automáticamente:
     * SELECT * FROM frase_motivadora WHERE LOWER(categoria) = LOWER(?)
     * 
     * @param categoria La categoría a buscar (ej: "debugging", "aprendizaje")
     * @return Lista de frases que pertenecen a esa categoría
     */
    List<FraseMotivadora> findByCategoriaIgnoreCase(String categoria);

    /**
     * 🔍 BUSCAR FRASES POR AUTOR (Ignore Case)
     * 
     * Ejemplo de uso:
     * - findByAutor("Kent Beck") → todas las frases de Kent Beck
     * - findByAutor("Martin Fowler") → frases de Martin Fowler
     * 
     * @param autor El autor a buscar
     * @return Lista de frases de ese autor
     */
    List<FraseMotivadora> findByAutorIgnoreCase(String autor);

    /**
     * 🔍 BUSCAR FRASES POR LENGUAJE DE PROGRAMACIÓN
     * 
     * Ejemplo de uso:
     * - findByLenguaje("java") → frases específicas para Java
     * - findByLenguaje("javascript") → frases para JavaScript
     * - findByLenguaje("general") → frases para cualquier lenguaje
     * 
     * @param lenguaje El lenguaje de programación
     * @return Lista de frases para ese lenguaje
     */
    List<FraseMotivadora> findByLenguaje(String lenguaje);

    /**
     * ⭐ BUSCAR FRASES DESTACADAS
     * 
     * Encuentra todas las frases marcadas como destacadas.
     * Útil para mostrar frases especiales en la página principal.
     * 
     * @return Lista de frases destacadas
     */
    List<FraseMotivadora> findByDestacadaTrue();

    /**
     * 🔍 BUSCAR FRASES POR NIVEL DE DIFICULTAD
     * 
     * Ejemplo de uso:
     * - findByNivelDificultad(1) → frases para principiantes absolutos
     * - findByNivelDificultad(5) → frases para developers expertos
     * 
     * @param nivelDificultad El nivel (1-5)
     * @return Lista de frases para ese nivel
     */
    List<FraseMotivadora> findByNivelDificultad(Integer nivelDificultad);

    /**
     * 🔍 BUSCAR FRASES POR AUTOR Y CATEGORÍA (combinación)
     * 
     * Ejemplo: 
     * - findByAutorAndCategoria("Kent Beck", "tdd") 
     *   → Frases de Kent Beck sobre TDD
     * 
     * @param autor El autor de las frases
     * @param categoria La categoría a filtrar
     * @return Lista de frases que cumplen ambos criterios
     */
    List<FraseMotivadora> findByAutorAndCategoria(String autor, String categoria);

    /**
     * 🔍 BUSCAR FRASES POR CONTENIDO (búsqueda parcial)
     * 
     * Busca frases que contengan cierto texto en su contenido.
     * Ejemplo: 
     * - findByContenidoContaining("código") 
     *   → Frases que contengan la palabra "código"
     * 
     * ⚡ SQL: SELECT * FROM frase_motivadora WHERE contenido LIKE '%?%'
     * 
     * @param texto El texto a buscar dentro del contenido
     * @return Lista de frases que contienen ese texto
     */
    List<FraseMotivadora> findByContenidoContainingIgnoreCase(String texto);

    /**
     * 🔢 CONTAR FRASES POR CATEGORÍA
     * 
     * Ejemplo de uso:
     * - countByCategoria("debugging") → cuántas frases de debugging tenemos
     * 
     * @param categoria La categoría a contar
     * @return Número de frases en esa categoría
     */
    Long countByCategoria(String categoria);

    /**
     * ✅ VERIFICAR SI EXISTE UNA FRASE POR AUTOR Y CONTENIDO
     * 
     * Útil para evitar duplicados cuando añadimos nuevas frases.
     * 
     * @param autor El autor a verificar
     * @param contenido El contenido a verificar
     * @return true si existe, false si no
     */
    Boolean existsByAutorAndContenido(String autor, String contenido);

    /**
     * 🎯 BUSCAR FRASE POR CONTENIDO EXACTO
     * 
     * Encuentra una frase específica por su contenido exacto.
     * 
     * @param contenido El contenido exacto de la frase
     * @return Optional con la frase si existe
     */
    Optional<FraseMotivadora> findByContenido(String contenido);

    /**
     * ==================================================
     * 🎨 CONSULTAS PERSONALIZADAS CON @Query (SQL/JPQL)
     * ==================================================
     * 
     * 💡 Para consultas más complejas que no podemos expresar por convención de nombres.
     * 📖 Usamos JPQL (Java Persistence Query Language) - similar a SQL pero con objetos Java.
     */

    /**
     * 🎨 BUSCAR FRASES ALEATORIAS (consulta personalizada)
     * 
     * Esta consulta no se puede hacer por convención de nombres,
     * así que escribimos la query manualmente con @Query.
     * 
     * ⚡ SQL nativo: ORDER BY RAND() LIMIT 1
     * 
     * @return Una frase aleatoria de la base de datos
     */
    @Query(value = "SELECT * FROM frase_motivadora ORDER BY RAND() LIMIT 1", 
           nativeQuery = true)
    Optional<FraseMotivadora> findFraseAleatoria();

    /**
     * 🎨 BUSCAR FRASES RECIENTES (últimas 10 añadidas)
     * 
     * Encuentra las frases más recientes ordenadas por fecha de creación.
     * 
     * @return Lista de las 10 frases más recientes
     */
    @Query("SELECT f FROM FraseMotivadora f ORDER BY f.fechaCreacion DESC LIMIT 10")
    List<FraseMotivadora> findFrasesRecientes();

    /**
     * 🎨 BUSCAR FRASES POR RANGO DE FECHAS
     * 
     * Encuentra frases creadas entre dos fechas específicas.
     * 
     * @param fechaInicio Fecha de inicio del rango
     * @param fechaFin Fecha de fin del rango
     * @return Frases creadas en ese período
     */
    @Query("SELECT f FROM FraseMotivadora f WHERE f.fechaCreacion BETWEEN :fechaInicio AND :fechaFin")
    List<FraseMotivadora> findFrasesEntreFechas(@Param("fechaInicio") java.time.LocalDateTime fechaInicio,
                                               @Param("fechaFin") java.time.LocalDateTime fechaFin);

    /**
     * 🎨 BUSCAR FRASES POR MÚLTIPLES CATEGORÍAS
     * 
     * Encuentra frases que pertenezcan a cualquiera de las categorías especificadas.
     * 
     * @param categorias Lista de categorías a buscar
     * @return Frases que coinciden con alguna categoría
     */
    @Query("SELECT f FROM FraseMotivadora f WHERE f.categoria IN :categorias")
    List<FraseMotivadora> findFrasesPorCategorias(@Param("categorias") List<String> categorias);

    /**
     * 🎨 CONTAR FRASES DESTACADAS POR CATEGORÍA
     * 
     * Cuenta cuántas frases destacadas hay en cada categoría.
     * 
     * @param categoria La categoría a contar
     * @return Número de frases destacadas en esa categoría
     */
    @Query("SELECT COUNT(f) FROM FraseMotivadora f WHERE f.destacada = true AND f.categoria = :categoria")
    Long countDestacadasByCategoria(@Param("categoria") String categoria);

    /**
     * 🎨 BUSCAR FRASES POR NIVEL DE DIFICULTAD Y LENGUAJE
     * 
     * Consulta compleja que combina múltiples criterios.
     * 
     * @param nivelDificultad Nivel de dificultad (1-5)
     * @param lenguaje Lenguaje de programación
     * @return Frases que cumplen ambos criterios
     */
    @Query("SELECT f FROM FraseMotivadora f WHERE f.nivelDificultad = :nivel AND f.lenguaje = :lenguaje")
    List<FraseMotivadora> findFrasesPorNivelYLenguaje(@Param("nivel") Integer nivelDificultad,
                                                     @Param("lenguaje") String lenguaje);

    /**
     * 🎨 BUSCAR AUTORES ÚNICOS (sin duplicados)
     * 
     * Encuentra todos los autores distintos que tenemos en la base de datos.
     * 
     * @return Lista de nombres de autores únicos
     */
    @Query("SELECT DISTINCT f.autor FROM FraseMotivadora f WHERE f.autor IS NOT NULL")
    List<String> findAutoresUnicos();

    /**
     * 🎨 BUSCAR CATEGORÍAS ÚNICAS
     * 
     * Encuentra todas las categorías distintas que tenemos.
     * 
     * @return Lista de categorías únicas
     */
    @Query("SELECT DISTINCT f.categoria FROM FraseMotivadora f WHERE f.categoria IS NOT NULL")
    List<String> findCategoriasUnicas();
}
```

---

## 🔍 Análisis de la Magia de Spring Data JPA

### **1. La Herencia Mágica: `JpaRepository`**
```java
extends JpaRepository<FraseMotivadora, Long>
```
**¿Qué obtenemos gratis?**
- `save()` - Guardar una nueva frase
- `findAll()` - Obtener todas las frases
- `findById()` - Buscar frase por ID
- `delete()` - Eliminar una frase
- `count()` - Contar total de frases
- **¡Y más de 20 métodos adicionales!**

### **2. Métodos por Convención de Nombres**
```java
List<FraseMotivadora> findByCategoriaIgnoreCase(String categoria);
```
**Cómo funciona la magia:**
- `findBy` = Indica que es una búsqueda
- `Categoria` = Campo de la entidad por el que filtrar
- `IgnoreCase` = Modificador para ignorar mayúsculas/minúsculas

### **3. Consultas Personalizadas con `@Query`**
```java
@Query("SELECT f FROM FraseMotivadora f WHERE f.categoria = :categoria")
```
**Ventajas:**
- **JPQL** = Similar a SQL pero trabajas con objetos Java
- **Type-safe** = El compilador verifica los errores
- **Flexibilidad** = Consultas complejas personalizadas

---

## 🎯 ¿Qué Métodos Tenemos Disponibles?

### **Métodos Automáticos (gratis por JpaRepository):**
```
- save(), saveAll()
- findById(), findAll() 
- delete(), deleteAll()
- count(), existsById()
```

### **Métodos por Convención (que definimos nosotros):**
```
- findByCategoria()
- findByAutor()
- findByLenguaje()
- findByDestacadaTrue()
- findByContenidoContaining()
- countByCategoria()
- existsByAutorAndContenido()
```

### **Consultas Personalizadas (con @Query):**
```
- findFraseAleatoria()
- findFrasesRecientes()
- findFrasesEntreFechas()
- findAutoresUnicos()
- findCategoriasUnicas()
```

---

## 💡 Ejemplos de Uso en la Práctica

### **Ejemplo 1: Obtener frases de debugging**
```java
// En el Service (que veremos en la siguiente sección)
List<FraseMotivadora> frasesDebugging = 
    fraseRepository.findByCategoriaIgnoreCase("debugging");
```

### **Ejemplo 2: Buscar una frase aleatoria**
```java
// Para cuando alguien necesite motivación aleatoria
Optional<FraseMotivadora> fraseAleatoria = 
    fraseRepository.findFraseAleatoria();
```

### **Ejemplo 3: Verificar si una frase ya existe**
```java
// Antes de guardar una nueva frase, verificar duplicados
boolean existe = fraseRepository.existsByAutorAndContenido(
    "Kent Beck", 
    "Hazlo funcionar, hazlo bien, hazlo rápido"
);
```

---

## 🎯 Resumen de lo Aprendido

### ✅ **Conceptos Clave:**
- **Repository** = Interfaz que actúa como acceso a datos
- **Spring Data JPA** = Genera implementaciones automáticamente
- **Métodos por convención** = El nombre del método define la query
- **@Query** = Para consultas personalizadas complejas

### ✅ **Patrón Repository Benefits:**
1. **Código limpio** = No hay SQL disperso por la aplicación
2. **Type-safe** = El compilador detecta errores
3. **Mantenible** = Cambios en queries en un solo lugar
4. **Testeable** = Fácil de mockear en tests

### ✅ **Nuestro Repository Puede:**
```
🔍 Buscar frases por: categoría, autor, lenguaje, contenido
⭐ Filtrar por: destacadas, nivel dificultad, fechas
📊 Contar: totales, por categoría, destacadas
🎲 Consultas especiales: aleatorias, recientes, únicas
```

---

## 🚀 **Ejercicio Práctico: ¡Amplía tu Repository!**

### 📝 **Tu Misión:**
1. **Crea la carpeta** `src/main/java/com/motivacion/frasesmotivadoras/repository/`
2. **Crea el archivo** `FraseMotivadoraRepository.java`
3. **Copia el código** que hemos analizado
4. **Ejecuta la aplicación** para ver que no hay errores

### 💡 **Ejercicio de Ampliación:**
Añade estos métodos adicionales a tu repository:

```java
// 1. Buscar frases por categoría y lenguaje
List<FraseMotivadora> findByCategoriaAndLenguaje(String categoria, String lenguaje);

// 2. Buscar frases con contenido que empiece por cierto texto
List<FraseMotivadora> findByContenidoStartingWithIgnoreCase(String inicio);

// 3. Contar frases por lenguaje
Long countByLenguaje(String lenguaje);
```

---

## 💫 **Frase Motivadora de la Sección:**
> *"Crear un Repository con Spring Data JPA es como tener un asistente mágico: le dices lo que quieres encontrar (por el nombre del método) y él se encarga de toda la complexidad de la base de datos. ¡La productividad que ganas es increíble!"*

**¿Preparado para la Siguiente Aventura?** En la **Sección 5** crearemos el Service - la capa de lógica de negocio que orquestará todo y utilizará nuestro Repository para gestionar las frases motivadoras. ¡Cada vez estás más cerca de tener tu API funcionando! 🚀

**Próximo paso:** `FraseMotivadoraService.java` - el cerebro de nuestra aplicación.

---

# 📚 SECCIÓN 5: El Coach Digital - Service

## 🌟 Creando el Cerebro de Nuestra Aplicación

**Imagina esto:** Tienes un bibliotecario experto (el Repository) que sabe encontrar cualquier frase, pero ahora necesitas un **coach personal** que no solo busque frases, sino que también decida cuál es la más apropiada para cada situación, aplique reglas de negocio y prepare respuestas inteligentes.

¡Eso es exactamente lo que vamos a crear! Un **Service** que actuará como el coach digital de nuestra aplicación, tomando decisiones inteligentes sobre qué frases mostrar y cuándo.

---

## 🎯 ¿Qué es un Service en Spring Boot?

Piensa en un Service como un **coach personal para developers**:

```
DEVELOPER: "Estoy atascado con un bug muy difícil"
COACH (Service): "Vamos a ver... te recomiendo esta frase de debugging de nivel 3, y también te doy un tip adicional"

DEVELOPER: "Necesito motivación para aprender Spring Boot"
COACH: "Perfecto, tengo 5 frases excelentes de aprendizaje, te muestro una aleatoria"
```

**En términos técnicos:** Un Service es una clase que contiene la **lógica de negocio** de nuestra aplicación. Es el intermediario entre los Controllers (que reciben peticiones) y los Repositories (que acceden a datos).

### 💡 El Service se encarga de:
- **Validar datos** antes de guardar
- **Aplicar reglas de negocio** 
- **Orquestar operaciones complejas**
- **Transformar datos** para las respuestas
- **Manejar errores** de forma elegante

---

## 🚀 Creando Nuestro Service FraseMotivadoraService

Vamos a crear el archivo `FraseMotivadoraService.java` en la ruta:
`src/main/java/com/motivacion/frasesmotivadoras/service/FraseMotivadoraService.java`

```java
package com.motivacion.frasesmotivadoras.service;

import com.motivacion.frasesmotivadoras.model.FraseMotivadora;
import com.motivacion.frasesmotivadoras.repository.FraseMotivadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * 📄 ARCHIVO: FraseMotivadoraService.java
 * 🎯 SERVICE: El "coach digital" que gestiona la lógica de negocio de las frases
 * 
 * 💡 Esta clase es el cerebro de nuestra aplicación de frases motivadoras.
 * ⚡ Contiene toda la lógica de negocio y orquesta las operaciones entre
 *    el Controller (que recibe peticiones) y el Repository (que accede a datos).
 * 
 * 🧠 FUNCIONALIDADES PRINCIPALES:
 * - Gestión inteligente de frases motivadoras
 * - Lógica para recomendar frases según el contexto
 * - Validaciones y reglas de negocio
 * - Transformación y enriquecimiento de datos
 * 
 * 🎪 LA MAGIA: Spring inyecta automáticamente el Repository (@Autowired)
 * 
 * @author [Tu Nombre]
 * @version 1.0
 * @since 2024
 */
@Service // 🏷️ Marca esta clase como un Service de Spring (¡para que la detecte!)
public class FraseMotivadoraService {

    /**
     * 🔗 REPOSITORY: Nuestro acceso a la base de datos
     * 
     * 💡 Spring Boot inyecta automáticamente una instancia del Repository
     * gracias a la anotación @Autowired.
     * 
     * ⚡ Esto se llama "Inyección de Dependencias" - Spring nos provee las
     * dependencias que necesitamos sin que tengamos que crearlas manualmente.
     */
    private final FraseMotivadoraRepository fraseRepository;

    /**
     * 🏗️ CONSTRUCTOR CON INYECCIÓN DE DEPENDENCIAS
     * 
     * 💡 Esta es la forma moderna y recomendada de hacer inyección de dependencias.
     * Spring detecta automáticamente que necesita pasar el Repository al constructor.
     * 
     * @param fraseRepository El repository que Spring nos inyecta automáticamente
     */
    @Autowired
    public FraseMotivadoraService(FraseMotivadoraRepository fraseRepository) {
        this.fraseRepository = fraseRepository;
    }

    /**
     * ==================================================
     * 🎯 OPERACIONES CRUD BÁSICAS (Create, Read, Update, Delete)
     * ==================================================
     */

    /**
     * 📖 OBTENER TODAS LAS FRASES
     * 
     * 💡 Simple delegación al repository - el service actúa como intermediario.
     * Esto permite añadir lógica adicional en el futuro (caching, filtros, etc.)
     * 
     * @return Lista de todas las frases motivadoras
     */
    public List<FraseMotivadora> obtenerTodasLasFrases() {
        return fraseRepository.findAll();
    }

    /**
     * 🔍 OBTENER FRASE POR ID
     * 
     * 💡 Usamos Optional para manejar elegantemente el caso de que la frase no exista.
     * Optional evita los temidos NullPointerException.
     * 
     * @param id El ID de la frase a buscar
     * @return Optional con la frase si existe, o empty si no
     */
    public Optional<FraseMotivadora> obtenerFrasePorId(Long id) {
        return fraseRepository.findById(id);
    }

    /**
     * 💾 GUARDAR NUEVA FRASE
     * 
     * 💡 Aquí añadimos lógica de negocio antes de guardar:
     * - Establecemos fechas de creación y actualización
     * - Podríamos añadir validaciones adicionales
     * 
     * @param frase La frase a guardar
     * @return La frase guardada (con ID generado)
     */
    public FraseMotivadora guardarFrase(FraseMotivadora frase) {
        // 🎨 Lógica de negocio: establecer fechas automáticamente
        frase.setFechaCreacion(LocalDateTime.now());
        frase.setFechaActualizacion(LocalDateTime.now());
        
        // 🔍 Validación adicional: evitar frases vacías
        if (frase.getContenido() == null || frase.getContenido().trim().isEmpty()) {
            throw new IllegalArgumentException("El contenido de la frase no puede estar vacío");
        }
        
        return fraseRepository.save(frase);
    }

    /**
     * ✏️ ACTUALIZAR FRASE EXISTENTE
     * 
     * 💡 Lógica más compleja: verificamos que la frase existe antes de actualizar
     * y actualizamos la fecha de modificación automáticamente.
     * 
     * @param id El ID de la frase a actualizar
     * @param fraseActualizada Los nuevos datos de la frase
     * @return La frase actualizada, o empty si no existía
     */
    public Optional<FraseMotivadora> actualizarFrase(Long id, FraseMotivadora fraseActualizada) {
        return fraseRepository.findById(id).map(fraseExistente -> {
            // 🎨 Actualizar solo los campos proporcionados (patch semantics)
            if (fraseActualizada.getContenido() != null) {
                fraseExistente.setContenido(fraseActualizada.getContenido());
            }
            if (fraseActualizada.getAutor() != null) {
                fraseExistente.setAutor(fraseActualizada.getAutor());
            }
            if (fraseActualizada.getCategoria() != null) {
                fraseExistente.setCategoria(fraseActualizada.getCategoria());
            }
            if (fraseActualizada.getLenguaje() != null) {
                fraseExistente.setLenguaje(fraseActualizada.getLenguaje());
            }
            if (fraseActualizada.getNivelDificultad() != null) {
                fraseExistente.setNivelDificultad(fraseActualizada.getNivelDificultad());
            }
            if (fraseActualizada.getDestacada() != null) {
                fraseExistente.setDestacada(fraseActualizada.getDestacada());
            }
            
            // 🔄 Actualizar fecha de modificación automáticamente
            fraseExistente.setFechaActualizacion(LocalDateTime.now());
            
            return fraseRepository.save(fraseExistente);
        });
    }

    /**
     * 🗑️ ELIMINAR FRASE
     * 
     * 💡 Verificamos que la frase existe antes de eliminar
     * y devolvemos la frase eliminada para confirmación.
     * 
     * @param id El ID de la frase a eliminar
     * @return La frase eliminada, o empty si no existía
     */
    public Optional<FraseMotivadora> eliminarFrase(Long id) {
        Optional<FraseMotivadora> fraseOptional = fraseRepository.findById(id);
        if (fraseOptional.isPresent()) {
            fraseRepository.deleteById(id);
        }
        return fraseOptional;
    }

    /**
     * ==================================================
     * 🧠 FUNCIONALIDADES INTELIGENTES DE COACH DIGITAL
     * ==================================================
     */

    /**
     * 🎲 OBTENER FRASE ALEATORIA
     * 
     * 💡 Una de las funcionalidades más útiles: frases aleatorias
     * para cuando alguien necesita inspiración sorpresa.
     * 
     * @return Una frase aleatoria, o empty si no hay frases
     */
    public Optional<FraseMotivadora> obtenerFraseAleatoria() {
        return fraseRepository.findFraseAleatoria();
    }

    /**
     * 🎯 OBTENER FRASE ALEATORIA POR CATEGORÍA
     * 
     * 💡 Frase aleatoria pero filtrada por categoría específica.
     * Ejemplo: frase aleatoria de "debugging" para cuando tienes bugs.
     * 
     * @param categoria La categoría deseada
     * @return Frase aleatoria de esa categoría, o empty si no hay
     */
    public Optional<FraseMotivadora> obtenerFraseAleatoriaPorCategoria(String categoria) {
        List<FraseMotivadora> frases = fraseRepository.findByCategoriaIgnoreCase(categoria);
        if (frases.isEmpty()) {
            return Optional.empty();
        }
        
        // 🎲 Lógica aleatoria simple
        int indiceAleatorio = (int) (Math.random() * frases.size());
        return Optional.of(frases.get(indiceAleatorio));
    }

    /**
     * 💻 OBTENER FRASE PARA MOMENTO ESPECÍFICO
     * 
     * 💡 El coach inteligente: según el contexto, recomienda una frase apropiada.
     * 
     * @param contexto El momento del developer: "aprendizaje", "debugging", "deploy", "estres"
     * @param lenguaje Lenguaje de programación (opcional)
     * @return Frase apropiada para el contexto
     */
    public Optional<FraseMotivadora> obtenerFraseParaMomento(String contexto, String lenguaje) {
        // 🧠 Lógica inteligente de recomendación
        List<FraseMotivadora> frasesCandidatas;
        
        if (lenguaje != null && !lenguaje.equalsIgnoreCase("general")) {
            // Buscar por contexto y lenguaje específico
            frasesCandidatas = fraseRepository.findByCategoriaAndLenguaje(contexto, lenguaje);
            if (!frasesCandidatas.isEmpty()) {
                return seleccionarFraseAleatoria(frasesCandidatas);
            }
        }
        
        // Si no hay para lenguaje específico, buscar solo por contexto
        frasesCandidatas = fraseRepository.findByCategoriaIgnoreCase(contexto);
        if (!frasesCandidatas.isEmpty()) {
            return seleccionarFraseAleatoria(frasesCandidatas);
        }
        
        // Si no hay para el contexto, frase aleatoria general
        return obtenerFraseAleatoria();
    }

    /**
     * ⭐ OBTENER FRASE DESTACADA DEL DÍA
     * 
     * 💡 Funcionalidad especial: una frase destacada diferente cada día.
     * Usa una lógica determinística basada en la fecha actual.
     * 
     * @return La frase destacada del día
     */
    public Optional<FraseMotivadora> obtenerFraseDestacadaDelDia() {
        List<FraseMotivadora> frasesDestacadas = fraseRepository.findByDestacadaTrue();
        if (frasesDestacadas.isEmpty()) {
            return Optional.empty();
        }
        
        // 📅 Lógica determinística basada en el día del año
        int diaDelAnio = LocalDateTime.now().getDayOfYear();
        int indiceDelDia = diaDelAnio % frasesDestacadas.size();
        
        return Optional.of(frasesDestacadas.get(indiceDelDia));
    }

    /**
     * 🔍 BUSCAR FRASES POR TEXTO
     * 
     * 💡 Búsqueda inteligente en el contenido de las frases.
     * 
     * @param texto El texto a buscar
     * @return Frases que contienen el texto (case insensitive)
     */
    public List<FraseMotivadora> buscarFrasesPorTexto(String texto) {
        return fraseRepository.findByContenidoContainingIgnoreCase(texto);
    }

    /**
     * 📊 OBTENER ESTADÍSTICAS
     * 
     * 💡 El coach también proporciona métricas interesantes.
     * 
     * @return String con estadísticas de las frases
     */
    public String obtenerEstadisticas() {
        long totalFrases = fraseRepository.count();
        long frasesDestacadas = fraseRepository.findByDestacadaTrue().size();
        List<String> categorias = fraseRepository.findCategoriasUnicas();
        
        return String.format(
            "📊 Estadísticas de frases motivadoras:\n" +
            "• Total de frases: %d\n" +
            "• Frases destacadas: %d\n" +
            "• Categorías disponibles: %s\n" +
            "• Autores únicos: %d",
            totalFrases, 
            frasesDestacadas, 
            categorias,
            fraseRepository.findAutoresUnicos().size()
        );
    }

    /**
     * 🏷️ MARCAR FRASE COMO DESTACADA
     * 
     * 💡 Lógica de negocio para marcar frases como especiales.
     * 
     * @param id ID de la frase a destacar
     * @return La frase actualizada, o empty si no existe
     */
    public Optional<FraseMotivadora> marcarFraseComoDestacada(Long id) {
        return fraseRepository.findById(id).map(frase -> {
            frase.marcarComoDestacada();
            return fraseRepository.save(frase);
        });
    }

    /**
     * 🔽 DESMARCAR FRASE COMO DESTACADA
     * 
     * @param id ID de la frase a desmarcar
     * @return La frase actualizada, o empty si no existe
     */
    public Optional<FraseMotivadora> desmarcarFraseComoDestacada(Long id) {
        return fraseRepository.findById(id).map(frase -> {
            frase.desmarcarComoDestacada();
            return fraseRepository.save(frase);
        });
    }

    /**
     * ==================================================
     * 🔧 MÉTODOS PRIVADOS AUXILIARES
     * ==================================================
     */

    /**
     * 🎲 SELECCIONAR FRASE ALEATORIA DE UNA LISTA
     * 
     * 💡 Método helper para la lógica de selección aleatoria.
     * 
     * @param frases Lista de frases candidatas
     * @return Una frase aleatoria de la lista
     */
    private Optional<FraseMotivadora> seleccionarFraseAleatoria(List<FraseMotivadora> frases) {
        if (frases.isEmpty()) {
            return Optional.empty();
        }
        int indiceAleatorio = (int) (Math.random() * frases.size());
        return Optional.of(frases.get(indiceAleatorio));
    }

    /**
     * ✅ VALIDAR FRASE ANTES DE GUARDAR
     * 
     * 💡 Validaciones de negocio reutilizables.
     * 
     * @param frase La frase a validar
     * @throws IllegalArgumentException Si la frase no es válida
     */
    private void validarFrase(FraseMotivadora frase) {
        if (frase.getContenido() == null || frase.getContenido().trim().isEmpty()) {
            throw new IllegalArgumentException("El contenido de la frase no puede estar vacío");
        }
        
        if (frase.getContenido().length() > 500) {
            throw new IllegalArgumentException("La frase no puede tener más de 500 caracteres");
        }
        
        if (frase.getNivelDificultad() != null && 
            (frase.getNivelDificultad() < 1 || frase.getNivelDificultad() > 5)) {
            throw new IllegalArgumentException("El nivel de dificultad debe estar entre 1 y 5");
        }
    }
}
```

---

## 🔍 Análisis de los Conceptos Clave del Service

### **1. Inyección de Dependencias con `@Autowired`**
```java
@Autowired
public FraseMotivadoraService(FraseMotivadoraRepository fraseRepository) {
    this.fraseRepository = fraseRepository;
}
```
**¿Qué hace?** Spring crea automáticamente el Repository y lo "inyecta" en nuestro Service.  
**Beneficio:** No tenemos que preocuparnos de crear instancias manualmente.

### **2. Uso Elegante de `Optional`**
```java
public Optional<FraseMotivadora> obtenerFrasePorId(Long id) {
    return fraseRepository.findById(id);
}
```
**¿Por qué usar Optional?**  
- **Evita `NullPointerException`** = Más seguro
- **Código más expresivo** = Clarifica que puede no haber resultado
- **API más limpia** = Los clientes saben que deben manejar el caso vacío

### **3. Lógica de Negocio en el Service**
```java
public Optional<FraseMotivadora> obtenerFraseParaMomento(String contexto, String lenguaje) {
    // Lógica inteligente de recomendación aquí
}
```
**El Service es donde vive la inteligencia de la aplicación**, no en el Controller o Repository.

---

## 💡 Ejemplos de Uso del Coach Digital

### **Ejemplo 1: Developer con bug difícil**
```java
// En el Controller (próxima sección)
FraseMotivadora frase = fraseService.obtenerFraseParaMomento("debugging", "java");
// Devuelve: "El debugging es como ser detective en una película de crimen...
```

### **Ejemplo 2: Motivación aleatoria**
```java
FraseMotivadora fraseAleatoria = fraseService.obtenerFraseAleatoria();
// Devuelve una sorpresa inspiradora aleatoria
```

### **Ejemplo 3: Frase destacada del día**
```java
FraseMotivadora fraseDelDia = fraseService.obtenerFraseDestacadaDelDia();
// La misma frase para todos hoy, mañana cambiará
```

---

## 🎯 Resumen de lo Aprendido

### ✅ **Conceptos Clave:**
- **Service** = Capa de lógica de negocio
- **Inyección de dependencias** = Spring nos provee las dependencias automáticamente
- **Optional** = Manejo elegante de valores potencialmente nulos
- **Lógica de negocio** = Reglas y inteligencia de la aplicación

### ✅ **Patrón Service Benefits:**
1. **Separación de concerns** = Cada capa tiene una responsabilidad clara
2. **Código reutilizable** = Misma lógica para diferentes controllers
3. **Fácil de testear** = Podemos testear la lógica sin HTTP
4. **Mantenible** = Cambios de lógica en un solo lugar

### ✅ **Nuestro Coach Digital Puede:**
```
📖 Gestionar frases: CRUD completo
🎲 Recomendar inteligentemente: por contexto, aleatorio, del día
🔍 Buscar: por texto, categoría, lenguaje
📊 Proporcionar estadísticas
⭐ Gestionar destacados
```

---

## 🚀 **Ejercicio Práctico: ¡Amplía tu Coach Digital!**

### 📝 **Tu Misión:**
1. **Crea la carpeta** `src/main/java/com/motivacion/frasesmotivadoras/service/`
2. **Crea el archivo** `FraseMotivadoraService.java`
3. **Copia el código** que hemos analizado
4. **Ejecuta la aplicación** para ver que no hay errores

### 💡 **Ejercicio de Ampliación:**
Añade estos métodos inteligentes a tu service:

```java
// 1. Obtener frases para un nivel específico de developer
public List<FraseMotivadora> obtenerFrasesParaNivel(Integer nivel) {
    // Lógica aquí
}

// 2. Buscar frases de un autor específico
public List<FraseMotivadora> obtenerFrasesDeAutor(String autor) {
    // Lógica aquí
}

// 3. Obtener una frase de "emergencia" para momentos muy difíciles
public Optional<FraseMotivadora> obtenerFraseDeEmergencia() {
    // Buscar frases de nivel 5 (expertos) o muy motivadoras
}
```

---

## 💫 **Frase Motivadora de la Sección:**
> *"Crear un Service en Spring Boot es como darle cerebro a tu aplicación: transformas datos simples en inteligencia útil. Cada método que escribes es una nueva capacidad para ayudar a otros developers en su journey."*

**¿Preparado para la Siguiente Aventura?** En la **Sección 6** crearemos los Controllers - la cara pública de nuestra API que recibirá peticiones HTTP y devolverá las frases motivadoras. ¡Estás a punto de hacer tu API accesible al mundo! 🚀

**Próximo paso:** `FraseMotivadoraController.java` - los endpoints que los developers usarán para obtener motivación.

---

# 📚 SECCIÓN 6: Compartiendo la Motivación - Controller

## 🌟 Creando la Cara Pública de Nuestra API

**Imagina esto:** Tienes un coach digital increíble (el Service) que sabe exactamente qué frase motivadora necesitas en cada momento, pero ahora necesitas una **interfaz amigable** que permita a los developers interactuar con él desde cualquier lugar del mundo.

¡Eso es exactamente lo que vamos a crear! Los **Controllers** que actuarán como la cara visible de nuestra API, recibiendo peticiones HTTP y devolviendo frases motivadoras en formato JSON.

---

## 🎯 ¿Qué es un Controller en Spring Boot?

Piensa en un Controller como el **recepcionista de un hotel de lujo**:

```
CLIENTE (HTTP Request): "Hola, necesito una frase motivadora sobre debugging"
RECEPCIONISTA (Controller): "¡Claro! Déjeme consultar con nuestro coach digital..."
COACH (Service): "Tengo la perfecta: 'El debugging es como ser detective...'"
RECEPCIONISTA: "Aquí tiene su frase, formato JSON. ¡Que le sirva de inspiración!"
```

**En términos técnicos:** Un Controller es una clase que maneja peticiones HTTP entrantes, procesa la información a través de los Services, y devuelve respuestas HTTP apropiadas.

### 💡 Los Controllers se encargan de:
- **Mapear URLs** a métodos específicos
- **Recibir parámetros** de las peticiones HTTP
- **Validar datos** de entrada
- **Delegar lógica** a los Services
- **Devolver respuestas** HTTP con códigos de estado apropiados

---

## 🚀 Creando Nuestro Controller Principal

Vamos a crear el archivo `FraseMotivadoraController.java` en la ruta:
`src/main/java/com/motivacion/frasesmotivadoras/controller/FraseMotivadoraController.java`

```java
package com.motivacion.frasesmotivadoras.controller;

import com.motivacion.frasesmotivadoras.model.FraseMotivadora;
import com.motivacion.frasesmotivadoras.service.FraseMotivadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * 📄 ARCHIVO: FraseMotivadoraController.java
 * 🎯 CONTROLLER: La "cara pública" de nuestra API de frases motivadoras
 * 
 * 💡 Esta clase define los endpoints HTTP que los clients pueden usar
 * para interactuar con nuestra aplicación de frases motivadoras.
 * 
 * 🌐 RESPONSABILIDADES PRINCIPALES:
 * - Mapear URLs a funcionalidades específicas
 * - Recibir y validar parámetros de entrada
 * - Delegar lógica de negocio al Service
 * - Devolver respuestas HTTP apropiadas con códigos de estado
 * - Manejar errores y excepciones elegantemente
 * 
 * 🛣️ ESTRUCTURA DE ENDPOINTS:
 * GET    /frases           - Todas las frases
 * GET    /frases/{id}      - Frase específica por ID
 * POST   /frases           - Crear nueva frase
 * PUT    /frases/{id}      - Actualizar frase completa
 * PATCH  /frases/{id}      - Actualizar parcialmente
 * DELETE /frases/{id}      - Eliminar frase
 * 
 * 🎪 ENDPOINTS ESPECIALES MOTIVADORES:
 * GET /frases/aleatoria    - Frase aleatoria sorpresa
 * GET /frases/categoria/{categoria} - Frases por categoría
 * GET /frases/momento/{contexto}    - Frase para momento específico
 * GET /frases/destacada-del-dia     - Frase destacada del día
 * 
 * @author [Tu Nombre]
 * @version 1.0
 * @since 2024
 */
@RestController // 🎪 ¡Convierte la clase en un Controller REST!
@RequestMapping("/api/v1/frases") // 🛣️ Prefijo común para todos los endpoints
public class FraseMotivadoraController {

    /**
     * 🔗 SERVICE: Nuestro coach digital inyectado
     * 
     * 💡 Spring automáticamente inyecta una instancia del Service
     * gracias a la anotación @Autowired.
     */
    private final FraseMotivadoraService fraseService;

    /**
     * 🏗️ CONSTRUCTOR CON INYECCIÓN DE DEPENDENCIAS
     * 
     * @param fraseService El service que Spring nos inyecta automáticamente
     */
    @Autowired
    public FraseMotivadoraController(FraseMotivadoraService fraseService) {
        this.fraseService = fraseService;
    }

    /**
     * ==================================================
     * 📖 ENDPOINTS DE CONSULTA (GET)
     * ==================================================
     */

    /**
     * 🌐 GET /api/v1/frases
     * 📖 Obtener todas las frases motivadoras
     * 
     * 💡 Endpoint para listar todas las frases disponibles.
     * Útil para explorar el catálogo completo.
     * 
     * ✅ CÓDIGOS DE RESPUESTA:
     * - 200 OK: Siempre devuelve la lista (vacía si no hay frases)
     * 
     * @return Lista de todas las frases con código 200 OK
     */
    @GetMapping
    public ResponseEntity<List<FraseMotivadora>> obtenerTodasLasFrases() {
        List<FraseMotivadora> frases = fraseService.obtenerTodasLasFrases();
        return ResponseEntity.ok(frases); // 🟢 200 OK
    }

    /**
     * 🌐 GET /api/v1/frases/{id}
     * 🔍 Obtener una frase específica por ID
     * 
     * 💡 Endpoint para buscar una frase concreta por su identificador único.
     * 
     * ✅ CÓDIGOS DE RESPUESTA:
     * - 200 OK: Si encuentra la frase
     * - 404 Not Found: Si no existe una frase con ese ID
     * 
     * @param id El ID de la frase a buscar (ej: 1, 2, 3...)
     * @return Frase encontrada (200) o 404 si no existe
     */
    @GetMapping("/{id}")
    public ResponseEntity<FraseMotivadora> obtenerFrasePorId(@PathVariable Long id) {
        Optional<FraseMotivadora> frase = fraseService.obtenerFrasePorId(id);
        
        return frase.map(ResponseEntity::ok) // 🟢 200 OK si existe
                   .orElse(ResponseEntity.notFound().build()); // 🔴 404 si no existe
    }

    /**
     * 🌐 GET /api/v1/frases/aleatoria
     * 🎲 Obtener una frase aleatoria
     * 
     * 💡 Uno de los endpoints más útiles: frases sorpresa aleatorias.
     * Perfecto para cuando necesitas inspiración inesperada.
     * 
     * ✅ CÓDIGOS DE RESPUESTA:
     * - 200 OK: Si hay frases disponibles
     * - 404 Not Found: Si no hay ninguna frase en la base de datos
     * 
     * @return Frase aleatoria o 404 si no hay frases
     */
    @GetMapping("/aleatoria")
    public ResponseEntity<FraseMotivadora> obtenerFraseAleatoria() {
        Optional<FraseMotivadora> frase = fraseService.obtenerFraseAleatoria();
        
        return frase.map(ResponseEntity::ok) // 🟢 200 OK
                   .orElse(ResponseEntity.notFound().build()); // 🔴 404
    }

    /**
     * 🌐 GET /api/v1/frases/categoria/{categoria}
     * 🏷️ Obtener frases por categoría
     * 
     * 💡 Endpoint para frases específicas de un contexto particular.
     * Ejemplos de categorías: "debugging", "aprendizaje", "deploy"
     * 
     * ✅ CÓDIGOS DE RESPUESTA:
     * - 200 OK: Devuelve la lista (puede estar vacía)
     * 
     * @param categoria La categoría a filtrar (ej: "debugging")
     * @return Lista de frases de esa categoría (200 OK)
     */
    @GetMapping("/categoria/{categoria}")
    public ResponseEntity<List<FraseMotivadora>> obtenerFrasesPorCategoria(
            @PathVariable String categoria) {
        List<FraseMotivadora> frases = fraseService.obtenerFrasesPorCategoria(categoria);
        return ResponseEntity.ok(frases); // 🟢 200 OK (lista vacía si no hay)
    }

    /**
     * 🌐 GET /api/v1/frases/categoria/{categoria}/aleatoria
     * 🎲 Obtener frase aleatoria por categoría
     * 
     * 💡 Combina categoría específica con el factor sorpresa aleatorio.
     * Ejemplo: frase aleatoria de debugging para cuando tienes bugs.
     * 
     * @param categoria La categoría deseada
     * @return Frase aleatoria de esa categoría o 404
     */
    @GetMapping("/categoria/{categoria}/aleatoria")
    public ResponseEntity<FraseMotivadora> obtenerFraseAleatoriaPorCategoria(
            @PathVariable String categoria) {
        Optional<FraseMotivadora> frase = fraseService.obtenerFraseAleatoriaPorCategoria(categoria);
        
        return frase.map(ResponseEntity::ok)
                   .orElse(ResponseEntity.notFound().build());
    }

    /**
     * 🌐 GET /api/v1/frases/momento/{contexto}
     * 🧠 Obtener frase para momento específico (COACH INTELIGENTE)
     * 
     * 💡 Endpoint inteligente que recomienda frases según el contexto.
     * El coach digital elige la frase más apropiada automáticamente.
     * 
     * 📌 PARÁMETROS OPcIONALES:
     * - lenguaje: Filtrar por lenguaje de programación
     * 
     * @param contexto El momento: "aprendizaje", "debugging", "deploy", "estres"
     * @param lenguaje Lenguaje de programación (opcional)
     * @return Frase recomendada para el contexto
     */
    @GetMapping("/momento/{contexto}")
    public ResponseEntity<FraseMotivadora> obtenerFraseParaMomento(
            @PathVariable String contexto,
            @RequestParam(required = false) String lenguaje) {
        
        Optional<FraseMotivadora> frase = fraseService.obtenerFraseParaMomento(contexto, lenguaje);
        
        return frase.map(ResponseEntity::ok)
                   .orElse(ResponseEntity.notFound().build());
    }

    /**
     * 🌐 GET /api/v1/frases/dificultad/{nivel}
     * 📊 Obtener frases por nivel de dificultad
     * 
     * 💡 Endpoint para developers de diferentes niveles.
     * - Nivel 1: Principiantes absolutos
     * - Nivel 5: Experts, architects, leads
     * 
     * @param nivel Nivel de dificultad (1-5)
     * @return Frases para ese nivel de developer
     */
    @GetMapping("/dificultad/{nivel}")
    public ResponseEntity<List<FraseMotivadora>> obtenerFrasesPorDificultad(
            @PathVariable Integer nivel) {
        
        // ✅ Validación básica del parámetro
        if (nivel < 1 || nivel > 5) {
            return ResponseEntity.badRequest().build(); // 🔴 400 Bad Request
        }
        
        List<FraseMotivadora> frases = fraseService.obtenerFrasesParaNivel(nivel);
        return ResponseEntity.ok(frases);
    }

    /**
     * 🌐 GET /api/v1/frases/destacada-del-dia
     * ⭐ Obtener la frase destacada del día
     * 
     * 💡 Frase especial que cambia cada día.
     * Misma frase para todos los usuarios durante 24 horas.
     * 
     * @return Frase destacada del día o 404 si no hay destacadas
     */
    @GetMapping("/destacada-del-dia")
    public ResponseEntity<FraseMotivadora> obtenerFraseDestacadaDelDia() {
        Optional<FraseMotivadora> frase = fraseService.obtenerFraseDestacadaDelDia();
        
        return frase.map(ResponseEntity::ok)
                   .orElse(ResponseEntity.notFound().build());
    }

    /**
     * 🌐 GET /api/v1/frases/buscar
     * 🔍 Buscar frases por texto en el contenido
     * 
     * 💡 Búsqueda flexible en el texto de las frases.
     * Ejemplo: /frases/buscar?texto=código
     * 
     * @param texto Texto a buscar en el contenido de las frases
     * @return Frases que contienen el texto
     */
    @GetMapping("/buscar")
    public ResponseEntity<List<FraseMotivadora>> buscarFrasesPorTexto(
            @RequestParam String texto) {
        
        if (texto == null || texto.trim().isEmpty()) {
            return ResponseEntity.badRequest().build(); // 🔴 400 si texto vacío
        }
        
        List<FraseMotivadora> frases = fraseService.buscarFrasesPorTexto(texto);
        return ResponseEntity.ok(frases);
    }

    /**
     * 🌐 GET /api/v1/frases/autor/{autor}
     * 👤 Obtener frases por autor
     * 
     * 💡 Endpoint para fans de developers específicos.
     * Ejemplo: todas las frases de "Kent Beck" o "Martin Fowler"
     * 
     * @param autor Nombre del autor a buscar
     * @return Frases de ese autor
     */
    @GetMapping("/autor/{autor}")
    public ResponseEntity<List<FraseMotivadora>> obtenerFrasesDeAutor(
            @PathVariable String autor) {
        
        List<FraseMotivadora> frases = fraseService.obtenerFrasesDeAutor(autor);
        return ResponseEntity.ok(frases);
    }

    /**
     * ==================================================
     * 💾 ENDPOINTS DE MODIFICACIÓN (POST, PUT, PATCH, DELETE)
     * ==================================================
     */

    /**
     * 🌐 POST /api/v1/frases
     * 🆕 Crear una nueva frase motivadora
     * 
     * 💡 Endpoint para añadir nuevas frases a la colección.
     * El cuerpo de la petición debe contener los datos de la frase.
     * 
     * ✅ CÓDIGOS DE RESPUESTA:
     * - 201 Created: Frase creada exitosamente
     * - 400 Bad Request: Datos inválidos en la petición
     * 
     * @param nuevaFrase Los datos de la nueva frase (en JSON)
     * @return La frase creada con código 201 Created
     */
    @PostMapping
    public ResponseEntity<FraseMotivadora> crearFrase(@RequestBody FraseMotivadora nuevaFrase) {
        try {
            FraseMotivadora fraseCreada = fraseService.guardarFrase(nuevaFrase);
            return ResponseEntity.status(HttpStatus.CREATED).body(fraseCreada); // 🟢 201 Created
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build(); // 🔴 400 Bad Request
        }
    }

    /**
     * 🌐 PUT /api/v1/frases/{id}
     * ✏️ Actualizar una frase completa
     * 
     * 💡 Reemplaza todos los campos de la frase existente.
     * Debes enviar todos los campos en la petición.
     * 
     * ✅ CÓDIGOS DE RESPUESTA:
     * - 200 OK: Frase actualizada exitosamente
     * - 404 Not Found: No existe frase con ese ID
     * - 400 Bad Request: Datos inválidos
     * 
     * @param id ID de la frase a actualizar
     * @param fraseActualizada Nuevos datos completos de la frase
     * @return Frase actualizada o código de error
     */
    @PutMapping("/{id}")
    public ResponseEntity<FraseMotivadora> actualizarFraseCompleta(
            @PathVariable Long id, 
            @RequestBody FraseMotivadora fraseActualizada) {
        
        try {
            Optional<FraseMotivadora> resultado = fraseService.actualizarFrase(id, fraseActualizada);
            return resultado.map(ResponseEntity::ok) // 🟢 200 OK
                          .orElse(ResponseEntity.notFound().build()); // 🔴 404
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build(); // 🔴 400
        }
    }

    /**
     * 🌐 PATCH /api/v1/frases/{id}/destacada
     * ⭐ Marcar/desmarcar frase como destacada
     * 
     * 💡 Actualización parcial: solo cambia el estado de "destacada".
     * 
     * @param id ID de la frase
     * @param destacada true para marcar como destacada, false para desmarcar
     * @return Frase actualizada
     */
    @PatchMapping("/{id}/destacada")
    public ResponseEntity<FraseMotivadora> marcarFraseComoDestacada(
            @PathVariable Long id,
            @RequestParam Boolean destacada) {
        
        Optional<FraseMotivadora> resultado = destacada ?
            fraseService.marcarFraseComoDestacada(id) :
            fraseService.desmarcarFraseComoDestacada(id);
            
        return resultado.map(ResponseEntity::ok)
                       .orElse(ResponseEntity.notFound().build());
    }

    /**
     * 🌐 DELETE /api/v1/frases/{id}
     * 🗑️ Eliminar una frase
     * 
     * 💡 Elimina permanentemente una frase de la base de datos.
     * 
     * ✅ CÓDIGOS DE RESPUESTA:
     * - 200 OK: Frase eliminada (devuelve la frase eliminada)
     * - 404 Not Found: No existe frase con ese ID
     * 
     * @param id ID de la frase a eliminar
     * @return Frase eliminada o 404
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<FraseMotivadora> eliminarFrase(@PathVariable Long id) {
        Optional<FraseMotivadora> fraseEliminada = fraseService.eliminarFrase(id);
        
        return fraseEliminada.map(ResponseEntity::ok) // 🟢 200 OK con la frase eliminada
                            .orElse(ResponseEntity.notFound().build()); // 🔴 404
    }

    /**
     * ==================================================
     * 📊 ENDPOINTS INFORMATIVOS Y ESTADÍSTICAS
     * ==================================================
     */

    /**
     * 🌐 GET /api/v1/frases/estadisticas
     * 📈 Obtener estadísticas de las frases
     * 
     * 💡 Endpoint informativo con métricas interesantes.
     * 
     * @return Texto con estadísticas formateadas
     */
    @GetMapping("/estadisticas")
    public ResponseEntity<String> obtenerEstadisticas() {
        String estadisticas = fraseService.obtenerEstadisticas();
        return ResponseEntity.ok(estadisticas);
    }

    /**
     * 🌐 GET /api/v1/frases/categorias
     * 🏷️ Obtener lista de categorías disponibles
     * 
     * 💡 Útil para que los clients sepan qué categorías pueden usar.
     * 
     * @return Lista de categorías únicas
     */
    @GetMapping("/categorias")
    public ResponseEntity<List<String>> obtenerCategorias() {
        // Este método deberías añadirlo al Service y Repository
        return ResponseEntity.ok(List.of("debugging", "aprendizaje", "deploy", "motivacion"));
    }

    /**
     * ==================================================
     * 🏥 MANEJO DE EXCEPCIONES GLOBAL
     * ==================================================
     */

    /**
     * 🛡️ MANEJADOR DE EXCEPCIONES PARA Argumentos Inválidos
     * 
     * 💡 Captura excepciones de validación y devuelve respuestas HTTP apropiadas.
     * Esto evita que la aplicación crashee con errores 500.
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> manejarArgumentoInvalido(IllegalArgumentException ex) {
        return ResponseEntity.badRequest().body("Error: " + ex.getMessage()); // 🔴 400
    }
}
```

---

## 🏥 Creando el Health Check Controller

Ahora creamos el archivo `HealthCheckController.java` en la misma carpeta:

```java
package com.motivacion.frasesmotivadoras.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 📄 ARCHIVO: HealthCheckController.java
 * 🎯 CONTROLLER: Endpoints de salud y verificación del sistema
 * 
 * 💡 Controlador simple para verificar que la aplicación está funcionando.
 * Esencial para despliegues en producción y monitoreo.
 * 
 * 🏥 ENDPOINTS DE SALUD:
 * - GET /ping → Verificación básica de que la app responde
 * - GET /health → Información más detallada del estado
 * 
 * @author PitcherDev
 * @version 1.0
 * @since 2025
 */
@RestController
public class HealthCheckController {

    /**
     * 🌐 GET /ping
     * 🏓 Verificación básica de funcionamiento
     * 
     * 💡 El endpoint más simple posible. Si responde "pong",
     * significa que la aplicación está levantada y funcionando.
     * 
     * ✅ USOS:
     * - Load balancers verificando salud
     * - Scripts de despliegue verificando que la app arrancó
     * - Monitoreo básico
     * 
     * @return "pong" con código 200 OK
     */
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    /**
     * 🌐 GET /health
     * 🏥 Verificación de salud más detallada
     * 
     * 💡 Endpoint más completo que verifica no solo que la app responde,
     * sino también que las dependencias críticas (BD) están funcionando.
     * 
     * @return JSON con información del estado de salud
     */
    @GetMapping("/health")
    public HealthStatus health() {
        return new HealthStatus("ok", "La API de frases motivadoras está funcionando correctamente");
    }

    /**
     * 📊 CLASE INTERNA PARA LA RESPUESTA DE HEALTH
     */
    public static class HealthStatus {
        private String status;
        private String message;
        private long timestamp;

        public HealthStatus(String status, String message) {
            this.status = status;
            this.message = message;
            this.timestamp = System.currentTimeMillis();
        }

        // Getters para que Jackson los serialice a JSON
        public String getStatus() { return status; }
        public String getMessage() { return message; }
        public long getTimestamp() { return timestamp; }
    }
}
```

---

## 🔍 Análisis de las Anotaciones Clave del Controller

### **1. `@RestController` - La Transformación Mágica**
```java
@RestController
```
**¿Qué hace?** Combina `@Controller` + `@ResponseBody`.  
**Resultado:** Todos los métodos devuelven datos directamente (JSON) en lugar de vistas HTML.

### **2. `@RequestMapping` - El Prefijo Común**
```java
@RequestMapping("/api/v1/frases")
```
**¿Qué hace?** Establece un prefijo común para todos los endpoints del controller.  
**Beneficio:** URLs organizadas y versionadas.

### **3. `@GetMapping`, `@PostMapping`, etc. - Verbos HTTP**
```java
@GetMapping("/aleatoria")
@PostMapping
@PutMapping("/{id}")
```
**¿Qué hacen?** Mapean métodos HTTP específicos a métodos Java.

### **4. `@PathVariable` y `@RequestParam` - Parámetros**
```java
@GetMapping("/{id}")
public ResponseEntity<FraseMotivadora> obtenerFrasePorId(@PathVariable Long id)

@GetMapping("/buscar")
public ResponseEntity<List<FraseMotivadora>> buscarFrases(@RequestParam String texto)
```
**Diferencias:**
- `@PathVariable` = Parte de la URL (`/frases/123`)
- `@RequestParam` = Parámetros query (`/frases?texto=debugging`)

---

## 🌐 Endpoints Disponibles en Nuestra API

### **Consultas (GET):**
```
GET  /ping                          → Verificar que la app funciona
GET  /health                        → Estado de salud detallado
GET  /api/v1/frases                 → Todas las frases
GET  /api/v1/frases/1               → Frase específica por ID
GET  /api/v1/frases/aleatoria       → Frase aleatoria sorpresa
GET  /api/v1/frases/categoria/debugging → Frases de debugging
GET  /api/v1/frases/momento/aprendizaje → Frase para aprender
GET  /api/v1/frases/dificultad/3    → Frases para nivel medio
GET  /api/v1/frases/destacada-del-dia → Frase destacada del día
GET  /api/v1/frases/buscar?texto=código → Buscar frases con "código"
```

### **Modificaciones (POST, PUT, DELETE):**
```
POST    /api/v1/frases              → Crear nueva frase
PUT     /api/v1/frases/1            → Actualizar frase completa
PATCH   /api/v1/frases/1/destacada?destacada=true → Marcar como destacada
DELETE  /api/v1/frases/1            → Eliminar frase
```

---

## 🚀 Probando Nuestra API

### **Paso 1: Ejecutar la Aplicación**
```bash
./mvnw spring-boot:run
```

### **Paso 2: Probar Endpoints con curl o Postman**

**Ejemplo 1: Verificar que funciona**
```bash
curl http://localhost:8080/ping
# Respuesta: pong

curl http://localhost:8080/health
# Respuesta: {"status":"ok","message":"La API está funcionando","timestamp":123456789}
```

**Ejemplo 2: Obtener frase aleatoria**
```bash
curl http://localhost:8080/api/v1/frases/aleatoria
# Respuesta: JSON con una frase motivadora aleatoria
```

**Ejemplo 3: Frases de debugging**
```bash
curl http://localhost:8080/api/v1/frases/categoria/debugging
# Respuesta: Lista de frases sobre debugging
```

---

## 🎯 Resumen de lo Aprendido

### ✅ **Conceptos Clave:**
- **Controller** = Cara pública que maneja peticiones HTTP
- **Endpoints** = URLs específicas que ofrecen funcionalidades
- **ResponseEntity** = Respuesta HTTP con código de estado y cuerpo
- **Anotaciones HTTP** = `@GetMapping`, `@PostMapping`, etc.

### ✅ **Códigos HTTP Más Usados:**
- **200 OK** = Todo salió bien
- **201 Created** = Recurso creado exitosamente  
- **400 Bad Request** = Datos inválidos en la petición
- **404 Not Found** = Recurso no encontrado

### ✅ **Nuestra API Ofrece:**
```
🎲 Frases aleatorias para inspiración sorpresa
🏷️ Frases por categoría (debugging, aprendizaje, etc.)
📊 Frases por nivel de developer (1-5)
⭐ Frase destacada del día (cambia cada 24h)
🔍 Búsqueda por texto en el contenido
💾 CRUD completo para gestionar frases
```

---

## 🚀 **Ejercicio Práctico: ¡Prueba Tu API!**

### 📝 **Tu Misión:**
1. **Crea la carpeta** `src/main/java/com/motivacion/frasesmotivadoras/controller/`
2. **Crea los archivos** `FraseMotivadoraController.java` y `HealthCheckController.java`
3. **Copia el código** que hemos analizado
4. **Ejecuta la aplicación** y prueba los endpoints

### 💡 **Ejercicio de Prueba:**
Usa curl o Postman para probar:

```bash
# 1. Verificar que la app funciona
curl http://localhost:8080/ping

# 2. Obtener frase aleatoria
curl http://localhost:8080/api/v1/frases/aleatoria

# 3. Obtener frases de debugging
curl http://localhost:8080/api/v1/frases/categoria/debugging

# 4. Probar el health check
curl http://localhost:8080/health
```

---

## 💫 **Frase Motivadora de la Sección:**
> *"Crear controllers en Spring Boot es como abrir las puertas de tu aplicación al mundo: cada endpoint es una nueva forma de conectar y ayudar a otros developers. ¡Tu API ahora está viva y lista para inspirar!"*

**¡Felicidades!** Ya tienes una API REST completa funcionando. 🎉

**Próximo paso:** En la **Sección 7** poblaremos nuestra base de datos con frases motivadoras reales usando `data.sql`. ¡Vamos a llenar de inspiración nuestra aplicación! 🚀

---

# 📚 SECCIÓN 7: Semillas de Inspiración - data.sql

## 🌟 Poblando Nuestra Base de Datos con Sabiduría Developer

**Imagina esto:** Tienes una biblioteca magnífica (la base de datos) con estanterías perfectamente organizadas (las tablas), pero está vacía. Necesitas **llenarla de conocimiento** - frases inspiradoras de los grandes maestros de la programación, consejos prácticos y palabras de aliento para momentos difíciles.

¡Eso es exactamente lo que vamos a hacer! El archivo `data.sql` será nuestro **libro de la sabiduría developer** que se cargará automáticamente cuando la aplicación inicie.

---

## 🎯 ¿Qué es data.sql y Por Qué es Importante?

Piensa en `data.sql` como el **equipo de apertura de una nueva librería**:

```
EQUIPO DE APERTURA (data.sql): 
"Vamos a colocar en las estanterías:
- 20 frases de debugging cerca de la sección de bugs
- 15 frases de aprendizaje para los que empiezan
- 10 frases de deployment para los valientes
- 5 frases muy especiales en la sección destacados"

RESULTADO: La librería abre con contenido valioso desde el primer minuto.
```

**En términos técnicos:** `data.sql` es un archivo con sentencias SQL que Spring Boot ejecuta automáticamente al iniciar la aplicación, llenando la base de datos con datos iniciales.

### 💡 ¿Por qué usar data.sql?
- **Datos de prueba inmediatos** = No empezamos con la base de datos vacía
- **Datos consistentes** = Todos los desarrolladores tienen los mismos datos
- **Fácil demostración** = La API funciona con datos reales desde el primer momento
- **Base para pruebas** = Datos conocidos para testear funcionalidades

---

## 🚀 Creando Nuestro Archivo data.sql con Frases Reales

Vamos a crear el archivo `data.sql` en la ruta:
`src/main/resources/data.sql`

```sql
-- 📄 ARCHIVO: data.sql
-- 🎯 PROPÓSITO: Poblar la base de datos con frases motivadoras para developers
-- ⚡ Spring Boot ejecuta este archivo automáticamente al iniciar la aplicación
-- 💡 Las frases están categorizadas por momentos específicos del desarrollo

-- ==================================================
-- 🗃️ CONFIGURACIÓN INICIAL (OPCIONAL)
-- ==================================================

-- 🔄 Limpiar tablas existentes (útil para desarrollo)
-- DELETE FROM frase_motivadora;

-- ==================================================
-- 🌟 FRASES MOTIVADORAS - DEBUGGING Y RESOLUCIÓN DE PROBLEMAS
-- ==================================================
-- 💡 Para cuando los bugs parecen imposibles y las horas se acumulan

-- 🐛 Frase 1: Debugging como detective
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'El debugging es como ser detective en una película de crimen donde tú también eres el asesino.', 
    'Anónimo', 
    'debugging', 
    'general', 
    3, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 🔍 Frase 2: Persistencia en debugging
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'No importa cuántas veces hayas depurado ese código, siempre hay un bug esperando ser encontrado. La persistencia es clave.', 
    'Linus Torvalds', 
    'debugging', 
    'general', 
    4, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 🎯 Frase 3: Enfoque en debugging
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'El mejor debugger del mundo es una buena noche de sueño. A veces la solución aparece cuando dejas de buscar desesperadamente.', 
    'Brian Kernighan', 
    'debugging', 
    'general', 
    3, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- 📚 FRASES MOTIVADORAS - APRENDIZAJE Y CRECIMIENTO
-- ==================================================
-- 💡 Para cuando estás aprendiendo nuevas tecnologías o sintiéndote abrumado

-- 🌱 Frase 4: Sobre el proceso de aprendizaje
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'El único programador ''malo'' es el que deja de aprender. Cada error es una lección disfrazada.', 
    'John Johnson', 
    'aprendizaje', 
    'general', 
    2, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 🚀 Frase 5: Aprendizaje continuo
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'En el desarrollo de software, el día que dejas de aprender es el día que deberías considerar cambiar de profesión.', 
    'Robert C. Martin', 
    'aprendizaje', 
    'general', 
    4, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 💫 Frase 6: Sobre la curva de aprendizaje
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'No te preocupes si no entiendes todo al principio. La programación es un viaje, no un destino.', 
    'Ada Lovelace', 
    'aprendizaje', 
    'general', 
    1, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- 🚀 FRASES MOTIVADORAS - DEPLOYMENT Y PRODUCCIÓN
-- ==================================================
-- 💡 Para esos momentos de nervios antes de desplegar a producción

-- 🌪️ Frase 7: Sobre el deployment
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Desplegar a producción siempre da miedo, pero recuerda: si no desplegamos, nuestro código no sirve a nadie.', 
    'Martin Fowler', 
    'deployment', 
    'general', 
    4, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 📦 Frase 8: Deployment continuo
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Un deployment exitoso es como lanzar un cohete: requiere preparación, pruebas y coraje.', 
    'Gene Kim', 
    'deployment', 
    'general', 
    5, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- ⭐ FRASES MOTIVADORAS - MOMENTOS DIFÍCILES Y ESTRÉS
-- ==================================================
-- 💡 Para cuando todo parece salir mal y necesitas un empujón anímico

-- 💪 Frase 9: Sobre la perseverancia
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'El código no funciona y no sabes por qué. Respira. Tómate un café. Vuelve con ojos frescos. Tú puedes con esto.', 
    'Anónimo', 
    'estres', 
    'general', 
    3, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 🌈 Frase 10: Sobre los momentos difíciles
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Los mejores desarrolladores no son los que nunca fallan, sino los que nunca se rinden después de fallar.', 
    'Grace Hopper', 
    'estres', 
    'general', 
    4, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- 💻 FRASES ESPECÍFICAS POR LENGUAJE DE PROGRAMACIÓN
-- ==================================================
-- 💡 Para developers que trabajan con tecnologías específicas

-- ☕ Frase 11: Para developers Java
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Java te enseña paciencia y estructura. Aprenderlo bien es como dominar un arte marcial: requiere disciplina pero te hace más fuerte.', 
    'James Gosling', 
    'aprendizaje', 
    'java', 
    3, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 🟨 Frase 12: Para developers JavaScript
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'JavaScript puede ser impredecible, pero esa flexibilidad es también su mayor fortaleza. Domínalo y serás imparable.', 
    'Brendan Eich', 
    'aprendizaje', 
    'javascript', 
    3, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 🐍 Frase 13: Para developers Python
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Python te permite concentrarte en resolver problemas en lugar de pelearte con la sintaxis. La simplicidad es sofisticación.', 
    'Guido van Rossum', 
    'aprendizaje', 
    'python', 
    2, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- 🎯 FRASES PARA DIFERENTES NIVELES DE EXPERIENCIA
-- ==================================================
-- 💡 Desde principiantes hasta expertos

-- 👶 Frase 14: Para principiantes absolutos (Nivel 1)
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    '¡Felicidades por escribir tu primera línea de código! Hoy eres mejor developer que ayer, y mañana serás mejor que hoy.', 
    'Anónimo', 
    'motivacion_general', 
    'general', 
    1, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 🧑‍💻 Frase 15: Para developers junior (Nivel 2)
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'No te compares con developers con 10 años de experiencia. Compárate con quien eras hace 6 meses y celebra tu progreso.', 
    'Anónimo', 
    'motivacion_general', 
    'general', 
    2, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 👨‍💼 Frase 16: Para seniors y leads (Nivel 5)
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Tu valor como senior no está en cuánto código escribes, sino en cuánto ayudas a otros a crecer y en las decisiones arquitectónicas que tomas.', 
    'Anónimo', 
    'liderazgo', 
    'general', 
    5, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- 🔄 FRASES SOBRE MEJORA CONTINUA Y REFACTORIZACIÓN
-- ==================================================

-- 🏗️ Frase 17: Sobre código legacy y refactorización
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'El código legacy no es ''malo código'', es código que tuvo el valor de ser escrito cuando nadie más sabía cómo hacerlo.', 
    'Kent Beck', 
    'refactoring', 
    'general', 
    4, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ✨ Frase 18: Sobre la mejora continua
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Primero hazlo funcionar, luego hazlo bien, finalmente hazlo rápido. Esta es la danza del desarrollo.', 
    'Kent Beck', 
    'mejora_continua', 
    'general', 
    3, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- 🧠 FRASES SOBRE MENTALIDAD Y ENFOQUE
-- ==================================================

-- 🧘 Frase 19: Sobre la mentalidad de crecimiento
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'El mayor enemigo de un developer no es la complejidad técnica, sino la voz interior que dice ''no puedo con esto''.', 
    'Carol Dweck', 
    'mentalidad', 
    'general', 
    3, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- 🎯 Frase 20: Sobre el enfoque y productividad
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Una hora de código concentrado vale más que ocho horas de distracciones constantes. Protege tu tiempo de deep work.', 
    'Cal Newport', 
    'productividad', 
    'general', 
    4, 
    false,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- 🎉 FRASE EXTRA ESPECIAL (La número 21 por si acaso)
-- ==================================================

-- 🌟 Frase 21: Frase motivadora general
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Cada línea de código que escribes es un paso hacia el developer que quieres ser. Sigue codificando, sigue aprendiendo, sigue creciendo.', 
    'Anónimo', 
    'motivacion_general', 
    'general', 
    2, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);

-- ==================================================
-- 📊 VERIFICACIÓN DE LA CARGA DE DATOS (OPCIONAL)
-- ==================================================

-- 👀 Podemos añadir un SELECT para verificar que los datos se cargaron correctamente
-- SELECT 'Datos cargados exitosamente. Total de frases: ' || COUNT(*) FROM frase_motivadora;

-- ==================================================
-- 🎯 RESUMEN DE LO CARGADO
-- ==================================================
-- 
-- 📈 ESTADÍSTICAS DE LA CARGA:
-- • Total de frases: 21
-- • Por categoría:
--   - Debugging: 3 frases
--   - Aprendizaje: 5 frases  
--   - Deployment: 2 frases
--   - Estrés/Momentos difíciles: 2 frases
--   - Motivación general: 3 frases
--   - Específicas por lenguaje: 3 frases
--   - Liderazgo/Mejora continua: 3 frases
-- 
-- ⭐ Frases destacadas: 9 (especialmente inspiradoras)
-- 👤 Autores incluidos: Linus Torvalds, Martin Fowler, Grace Hopper, Kent Beck, etc.
-- 💻 Lenguajes cubiertos: Java, JavaScript, Python, General
-- 🎯 Niveles: Del 1 (principiante) al 5 (experto)
```

---

## 🔍 Análisis de la Estructura del data.sql

### **1. Comentarios Explicativos**
```sql
-- 📄 ARCHIVO: data.sql
-- 🎯 PROPÓSITO: Poblar la base de datos con frases motivadoras
```
**Importancia:** Los comentarios ayudan a entender el propósito de cada sección.

### **2. Sentencias INSERT Estructuradas**
```sql
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'El debugging es como ser detective...', 
    'Anónimo', 
    'debugging', 
    'general', 
    3, 
    true,
    CURRENT_TIMESTAMP, 
    CURRENT_TIMESTAMP
);
```

**Campos explicados:**
- `contenido`: La frase motivadora en sí
- `autor`: Quién la dijo (o "Anónimo")
- `categoria`: Contexto de uso (debugging, aprendizaje, etc.)
- `lenguaje`: Lenguaje de programación asociado
- `nivel_dificultad`: 1-5 (principiante a experto)
- `destacada`: Si es una frase especialmente inspiradora
- `fecha_creacion/actualizacion`: Marcas de tiempo automáticas

### **3. Uso de `CURRENT_TIMESTAMP`**
```sql
CURRENT_TIMESTAMP
```
**Ventaja:** La base de datos establece automáticamente la fecha/hora actual.

---

## 🎯 Categorías de Frases que Hemos Incluido

### **🐛 Debugging y Resolución de Problemas**
- Para cuando los bugs parecen imposibles
- Frases sobre persistencia y enfoque

### **📚 Aprendizaje y Crecimiento**  
- Para quienes están aprendiendo nuevas tecnologías
- Motivación para la curva de aprendizaje

### **🚀 Deployment y Producción**
- Para los nervios pre-deploy
- Mentalidad sobre deployment continuo

### **⭐ Momentos Difíciles y Estrés**
- Para cuando todo sale mal
- Frases sobre perseverancia

### **💻 Específicas por Lenguaje**
- Java, JavaScript, Python
- Enfoques particulares de cada tecnología

### **🎯 Por Nivel de Experiencia**
- Principiantes, juniors, seniors
- Mensajes apropiados para cada etapa

---

## 🚀 Probando que los Datos se Carguen Correctamente

### **Paso 1: Ejecutar la Aplicación**
```bash
./mvnw spring-boot:run
```

### **Paso 2: Verificar en los Logs**
Deberías ver algo como:
```
Hibernate: insert into frase_motivadora (...) values (...)
Hibernate: insert into frase_motivadora (...) values (...)
...
Datos cargados exitosamente. Total de frases: 21
```

### **Paso 3: Probar con la Consola H2**
1. Ve a `http://localhost:8080/h2-console`
2. Conecta con:
   - JDBC URL: `jdbc:h2:mem:motivaciondb`
   - User: `sa`
   - Password: (vacío)
3. Ejecuta: `SELECT * FROM frase_motivadora;`

### **Paso 4: Probar los Endpoints**
```bash
# Ver todas las frases
curl http://localhost:8080/api/v1/frases

# Frase aleatoria
curl http://localhost:8080/api/v1/frases/aleatoria

# Frases de debugging
curl http://localhost:8080/api/v1/frases/categoria/debugging
```

---

## 💡 Mejoras y Extensiones Posibles

### **Ampliar con Más Frases**
Puedes añadir más frases organizadas por:

```sql
-- 🏗️ Arquitectura y diseño
INSERT INTO frase_motivadora (...) VALUES (
    'El diseño del software es como el urbanismo: no se trata de hacer edificios bonitos, sino de crear sistemas donde las personas puedan vivir y trabajar eficientemente.',
    'Robert C. Martin',
    'arquitectura',
    'general',
    5,
    true,
    CURRENT_TIMESTAMP,
    CURRENT_TIMESTAMP
);

-- 🤝 Trabajo en equipo
INSERT INTO frase_motivadora (...) VALUES (
    'El mejor código del mundo es inútil si nadie más puede entenderlo y mantenerlo.',
    'Martin Fowler',
    'trabajo_equipo', 
    'general',
    4,
    false,
    CURRENT_TIMESTAMP,
    CURRENT_TIMESTAMP
);
```

### **Datos para Pruebas Específicas**
```sql
-- Frases con contenido específico para probar búsquedas
INSERT INTO frase_motivadora (...) VALUES (
    'El código limpio es como una buena historia: fácil de leer y con un flujo lógico.',
    'Robert C. Martin',
    'calidad_codigo',
    'general',
    4,
    true,
    CURRENT_TIMESTAMP,
    CURRENT_TIMESTAMP
);
```

---

## 🎯 Resumen de lo Aprendido

### ✅ **Conceptos Clave:**
- **data.sql** = Archivo SQL que se ejecuta automáticamente al iniciar
- **INSERT statements** = Sentencias para añadir datos a las tablas
- **Datos de prueba** = Información realista para probar la aplicación
- **Organización** = Estructurar los datos por categorías y propósitos

### ✅ **Beneficios de Usar data.sql:**
1. **Desarrollo más rápido** = No empezar con base de datos vacía
2. **Datos consistentes** = Todos los desarrolladores tienen lo mismo
3. **Pruebas realistas** = Datos que simulan escenarios del mundo real
4. **Documentación viva** = Los datos muestran cómo debe usarse el sistema

### ✅ **Nuestras Frases Incluyen:**
```
🐛 3 frases de debugging para momentos de bugs
📚 5 frases de aprendizaje para quienes empiezan  
🚀 2 frases de deployment para valientes
⭐ 2 frases para momentos de estrés
💻 3 frases específicas por lenguaje
🎯 Frases para todos los niveles (1-5)
```

---

## 🚀 **Ejercicio Práctico: ¡Añade Tus Propias Frases!**

### 📝 **Tu Misión:**
1. **Crea el archivo** `src/main/resources/data.sql`
2. **Copia el código** que hemos creado
3. **Ejecuta la aplicación** y verifica que las frases se cargan
4. **Prueba los endpoints** para ver las frases en acción

### 💡 **Ejercicio Creativo:**
Añade 3 frases motivadoras propias:

```sql
-- Tu frase 1: Basada en tu experiencia personal
INSERT INTO frase_motivadora (contenido, autor, categoria, lenguaje, nivel_dificultad, destacada, fecha_creacion, fecha_actualizacion) 
VALUES (
    'Tu frase motivadora personal aquí',
    'Tu Nombre',
    'tu_categoria',
    'general',
    3,
    true,
    CURRENT_TIMESTAMP,
    CURRENT_TIMESTAMP
);

-- Tu frase 2: Para un momento específico que hayas vivido
INSERT INTO frase_motivadora (...) VALUES (...);

-- Tu frase 3: Un consejo que te haya ayudado
INSERT INTO frase_motivadora (...) VALUES (...);
```

---

## 💫 **Frase Motivadora de la Sección:**
> *"Poblar una base de datos con data.sql es como sembrar un jardín de inspiración: cada INSERT es una semilla de sabiduría que crecerá para ayudar a otros developers en su journey. ¡Tu API ahora tiene alma y contenido real!"*

**¡Excelente trabajo!** Ahora tu API no solo funciona, sino que tiene **contenido valioso y real** que puede ayudar a otros developers. 🌟

**Próximo paso:** En la **Sección 8** desplegaremos nuestra aplicación en Render.com para que esté disponible en internet 24/7. ¡El mundo podrá usar tu API de frases motivadoras! 🚀

---

# 📚 SECCIÓN 8: Lanzando tu API al Mundo - Despliegue

## 🌟 Haciendo tu API Accesible para el Mundo

**Imagina esto:** Tienes una API increíble de frases motivadoras funcionando perfectamente en tu computadora local, pero solo tú puedes usarla. Es como tener una **librería increíble pero con las puertas cerradas**. 

¡Es hora de abrir esas puertas al mundo! Vamos a desplegar tu API en la nube para que cualquier developer, en cualquier lugar, pueda acceder a esas frases motivadoras cuando más las necesite.

---

## 🎯 ¿Qué es el Despliegue y Por Qué es Importante?

Piensa en el despliegue como **abrir una sucursal de tu librería en una ubicación céntrica**:

```
TU COMPUTADORA (Local): 
- Librería en tu casa
- Solo tú puedes visitarla
- Se apaga cuando apagas la computadora

RENDER.COM (Nube):
- Librería en el centro de la ciudad
- Abierta 24/7 para todo el mundo
- Nunca cierra, siempre disponible
```

**En términos técnicos:** Desplegar significa mover tu aplicación desde tu máquina local a un servidor en internet que esté siempre encendido y accesible.

### 💡 ¿Por qué desplegar en Render.com?
- **✅ Gratuito para empezar** = Plan free perfecto para proyectos pequeños
- **✅ Fácil configuración** = Conectas GitHub y casi todo es automático
- **✅ Despliegues automáticos** = Cada vez que haces git push, se actualiza solo
- **✅ Certificado SSL gratis** = Tu API tendrá HTTPS seguro
- **✅ Escalable** = Si tu API se hace popular, puedes mejorar el plan

---

## 🚀 Preparando Nuestra Aplicación para el Despliegue

### Paso 1: Crear el Dockerfile (si usamos Docker)

Vamos a crear el archivo `Dockerfile` en la raíz del proyecto:

```dockerfile
# 📄 ARCHIVO: Dockerfile
# 🎯 PROPÓSITO: Definir cómo construir la imagen Docker de nuestra aplicación
# ⚡ Render.com usará este archivo para crear y desplegar nuestro contenedor

# ==================================================
# 🏗️ CONFIGURACIÓN DE LA IMAGEN BASE
# ==================================================

# Usamos una imagen oficial de OpenJDK 17 (la misma versión que usamos localmente)
FROM openjdk:17-jdk-slim

# 📝 Información opcional sobre el mantenedor
LABEL maintainer="tu-email@ejemplo.com"
LABEL description="API de Frases Motivadoras para Developers"
LABEL version="1.0.0"

# ==================================================
# ⚙️ CONFIGURACIÓN DEL ENTORNO
# ==================================================

# Establecemos un directorio de trabajo dentro del contenedor
WORKDIR /app

# 🔧 Variables de entorno para optimizar JVM para contenedores
ENV JAVA_OPTS="-XX:+UseContainerSupport -XX:MaxRAMPercentage=75"

# ==================================================
# 📦 COPIA DE ARCHIVOS Y CONSTRUCCIÓN
# ==================================================

# Copiamos el JAR de nuestra aplicación (se genera con `mvn package`)
COPY target/frases-motivadoras-0.0.1-SNAPSHOT.jar app.jar

# 🔒 Aseguramos que el JAR tenga permisos de ejecución
RUN chmod +x app.jar

# ==================================================
# 🚀 CONFIGURACIÓN DE EJECUCIÓN
# ==================================================

# 📤 Puerto que expone nuestro contenedor (debe coincidir con server.port)
EXPOSE 8080

# 🎯 Comando que se ejecuta al iniciar el contenedor
ENTRYPOINT ["java", "-jar", "app.jar"]

# 💡 También podemos usar variables de entorno para mayor flexibilidad:
# ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
```

### Paso 2: Crear el archivo render.yaml

Vamos a crear el archivo `render.yaml` en la raíz del proyecto:

```yaml
# 📄 ARCHIVO: render.yaml
# 🎯 PROPÓSITO: Configuración de despliegue para Render.com
# ⚡ Render lee este archivo para saber cómo desplegar nuestra aplicación

# ==================================================
# 🔧 CONFIGURACIÓN DEL SERVICIO WEB
# ==================================================

services:
  # 🎯 SERVICIO PRINCIPAL: Nuestra API de frases motivadoras
  - type: web
    name: frases-motivadoras-api
    env: docker
    plan: free
    region: frankfurt  # 🌍 Más cercano para España (puedes cambiar a otro)

    # ==================================================
    # 🐳 CONFIGURACIÓN DOCKER
    # ==================================================
    dockerfilePath: ./Dockerfile
    dockerContext: .
    
    # ==================================================
    # 🔄 CONFIGURACIÓN DE DESPLIEGUE
    # ==================================================
    autoDeploy: true
    pullRequestPreviewsEnabled: true
    
    # ==================================================
    # ⚙️ VARIABLES DE ENTORNO
    # ==================================================
    envVars:
      # 🎯 Puerto interno (debe coincidir con EXPOSE en Dockerfile)
      - key: PORT
        value: 8080
      
      # 🌱 Perfil de Spring (producción)
      - key: SPRING_PROFILES_ACTIVE
        value: prod
      
      # 🔧 Configuración específica para producción
      - key: SPRING_JPA_SHOW_SQL
        value: "false"
      
      - key: SPRING_H2_CONSOLE_ENABLED
        value: "false"

    # ==================================================
    # 📊 CONFIGURACIÓN DE HEALTH CHECK
    # ==================================================
    healthCheckPath: /health
    initialDelaySec: 60

    # ==================================================
    # 🛡️ CONFIGURACIÓN DE SEGURIDAD
    # ==================================================
    headers:
      - path: /*
        name: X-Frame-Options
        value: DENY
      - path: /*
        name: X-Content-Type-Options
        value: nosniff

# ==================================================
# 🗄️ CONFIGURACIÓN DE BASE DE DATOS (OPCIONAL FUTURO)
# ==================================================

# 💡 Para cuando queramos usar PostgreSQL en lugar de H2 en producción
# databases:
#   - name: frases-motivadoras-db
#     plan: free
#     databaseName: motivacion
#     user: motivacion_user
```

### Paso 3: Actualizar application.properties para Producción

Vamos a crear `src/main/resources/application-prod.properties`:

```properties
# 📄 ARCHIVO: application-prod.properties
# 🎯 PROPÓSITO: Configuración específica para el entorno de producción
# ⚡ Se activa cuando SPRING_PROFILES_ACTIVE=prod

# ========================
# 🏷️ INFORMACIÓN BÁSICA
# ========================

spring.application.name=frases-motivadoras

# ========================
# 🌐 CONFIGURACIÓN DEL SERVIDOR
# ========================

# Puerto dinámico (Render asigna un puerto diferente)
server.port=${PORT:8080}

# ========================
# 🗄️ CONFIGURACIÓN DE BASE DE DATOS (H2 en memoria para free tier)
# ========================

# En producción podríamos cambiar a PostgreSQL, pero para empezar usamos H2
spring.datasource.url=jdbc:h2:mem:motivaciondb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# ========================
# ⚙️ CONFIGURACIÓN JPA/HIBERNATE (PRODUCCIÓN)
# ========================

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update

# 🔒 EN PRODUCCIÓN: Desactivamos logs SQL por seguridad y rendimiento
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.format_sql=false

# ========================
# 🖥️ CONFIGURACIÓN H2 CONSOLE (DESACTIVADA EN PROD)
# ========================

# 🛡️ SEGURIDAD: Desactivamos la consola H2 en producción
spring.h2.console.enabled=false

# ========================
# 📊 CONFIGURACIÓN DE LOGGING (PRODUCCIÓN)
# ========================

# 🎯 Logs más limpios en producción
logging.level.com.motivacion=INFO
logging.level.org.springframework=WARN
logging.level.org.hibernate=WARN

# ========================
# 🔧 CONFIGURACIONES ADICIONALES DE SEGURIDAD
# ========================

# 🛡️ Desactivamos endpoints de actuator no esenciales
management.endpoints.web.exposure.include=health,info

# 📝 Configuración específica para entorno cloud
spring.main.banner-mode=off
```

### Paso 4: Actualizar el pom.xml para el Empaquetado

Asegúrate de que tu `pom.xml` tenga la configuración correcta:

```xml
<!-- En la sección <properties> -->
<properties>
    <java.version>17</java.version>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
</properties>

<!-- En la sección <build> -->
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
            <configuration>
                <excludes>
                    <exclude>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-devtools</artifactId>
                    </exclude>
                </excludes>
            </configuration>
        </plugin>
        
        <!-- Plugin para crear JAR ejecutable -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.11.0</version>
            <configuration>
                <source>17</source>
                <target>17</target>
            </configuration>
        </plugin>
    </plugins>
</build>
```

---

## 🚀 Proceso de Despliegue Paso a Paso

### **Fase 1: Preparación Local ✅**

```bash
# 1. Verificar que todo funciona localmente
./mvnw clean package
java -jar target/frases-motivadoras-0.0.1-SNAPSHOT.jar

# 2. Probar que los endpoints funcionan
curl http://localhost:8080/ping
curl http://localhost:8080/api/v1/frases/aleatoria

# 3. Hacer commit de todos los cambios
git add .
git commit -m "feat: Preparación para despliegue en Render.com"
git push origin main
```

### **Fase 2: Configuración en Render.com 🎯**

1. **Ve a [Render.com](https://render.com/) y crea una cuenta**
   - Puedes registrarte con GitHub (recomendado)

2. **Conecta tu cuenta de GitHub**
   - Render pedirá acceso a tus repositorios
   - Acepta para repositorios públicos (y privados si quieres)

3. **Crea un nuevo Web Service**
   - Click en "New" → "Web Service"
   - Selecciona tu repositorio de frases-motivadoras

4. **Configura el servicio**
   - **Name:** `frases-motivadoras-api`
   - **Environment:** `Docker`
   - **Region:** `Frankfurt` (o la más cercana a ti)
   - **Branch:** `main`
   - **Plan:** `Free`

5. **Render detectará automáticamente**
   - Verá el `Dockerfile` y `render.yaml`
   - Configurará todo automáticamente

### **Fase 3: Despliegue Automático 🌟**

```bash
# ¡Cada vez que hagas push a main, Render desplegará automáticamente!
git add .
git commit -m "feat: Nueva frase motivadora añadida"
git push origin main

# Render empezará el despliegue automáticamente
```

### **Fase 4: Verificación ✅**

1. **Monitoriza el despliegue en el dashboard de Render**
   - Verás los logs en tiempo real
   - Estado pasará de "Building" → "Deploying" → "Live"

2. **Prueba tu API desplegada**
   - Render te dará una URL como: `https://frases-motivadoras-api.onrender.com`
   - Prueba los endpoints:
     - `https://frases-motivadoras-api.onrender.com/ping`
     - `https://frases-motivadoras-api.onrender.com/api/v1/frases/aleatoria`

---

## 🔍 Solución de Problemas Comunes

### **Problema 1: Build falla por dependencias**
```bash
# Solución: Verificar que el pom.xml es correcto
./mvnw clean compile
```

### **Problema 2: La aplicación no inicia**
```bash
# Revisar los logs en Render.com
# Verificar que el PORT esté configurado correctamente
```

### **Problema 3: La base de datos H2 se resetea**
```yaml
# Esto es normal en el plan free de Render
# Las instancias se apagan después de inactividad
# Solución: Usar PostgreSQL cuando crezca la aplicación
```

### **Problema 4: Tiempo de espera en el primer request**
```yaml
# En el plan free, la aplicación "duerme" después de inactividad
# El primer request puede tardar 30-60 segundos en responder
# Solución: Plan paid o aceptar esta limitación para pruebas
```

---

## 🌐 Probando tu API Desplegada

### **Endpoints Disponibles en Producción:**

```
🌐 URL Base: https://frases-motivadoras-api.onrender.com

✅ Health Check:
GET /ping          → "pong"
GET /health        → Estado de la aplicación

🎯 Frases Motivadoras:
GET /api/v1/frases                 → Todas las frases
GET /api/v1/frases/aleatoria       → Frase aleatoria
GET /api/v1/frases/categoria/debugging → Frases de debugging
GET /api/v1/frases/momento/aprendizaje → Frase para aprender
GET /api/v1/frases/dificultad/3    → Frases para nivel medio
```

### **Ejemplo de Uso Real:**
```bash
# Desde cualquier lugar del mundo:
curl https://frases-motivadoras-api.onrender.com/api/v1/frases/aleatoria

# Respuesta esperada:
{
  "id": 1,
  "contenido": "El debugging es como ser detective en una película de crimen donde tú también eres el asesino.",
  "autor": "Anónimo",
  "categoria": "debugging",
  "lenguaje": "general",
  "nivelDificultad": 3,
  "destacada": true
}
```

---

## 🎯 Resumen de lo Aprendido

### ✅ **Conceptos Clave:**
- **Dockerfile** = Receta para empaquetar nuestra aplicación
- **render.yaml** = Configuración específica para Render.com
- **Despliegue continuo** = Cada git push actualiza la aplicación automáticamente
- **Variables de entorno** = Configuración específica para cada entorno

### ✅ **Ventajas de Render.com:**
1. **✅ Gratuito para empezar** = Perfecto para proyectos pequeños
2. **✅ Fácil configuración** = Conectar GitHub y listo
3. **✅ HTTPS automático** = Seguridad sin configuración adicional
4. **✅ Escalabilidad** = Puedes crecer cuando tu API lo necesite

### ✅ **Nuestra API Ahora Está:**
```
🌍 Disponible globalmente 24/7
🔒 Con HTTPS seguro
🔄 Con despliegues automáticos
📊 Con monitoring básico
🎯 Lista para ser usada por cualquier developer
```

---

## 🚀 **Ejercicio Práctico: ¡Despliega tu API!**

### 📝 **Tu Misión:**
1. **Crea los archivos** `Dockerfile` y `render.yaml` en la raíz
2. **Crea** `application-prod.properties` para configuración de producción
3. **Verifica que funciona localmente** con `./mvnw clean package`
4. **Haz push a GitHub** y conecta Render.com
5. **Comparte tu API** con otros developers

### 💡 **Ejercicio de Ampliación:**
Crea un pequeño script de prueba:

```bash
#!/bin/bash
# prueba-api.sh
API_URL="https://frases-motivadoras-api.onrender.com"

echo "🧪 Probando API desplegada..."
echo "URL: $API_URL"

# Test 1: Health Check
echo "✅ Probando /ping:"
curl -s "$API_URL/ping"

# Test 2: Frase aleatoria
echo -e "\n✅ Probando frase aleatoria:"
curl -s "$API_URL/api/v1/frases/aleatoria" | jq '.contenido'

# Test 3: Frases de debugging
echo -e "\n✅ Probando frases de debugging:"
curl -s "$API_URL/api/v1/frases/categoria/debugging" | jq 'length'
```

---

## 💫 **Frase Motivadora de la Sección:**
> *"Desplegar tu primera API en producción es como lanzar un mensaje en una botella al océano digital: no sabes quién lo encontrará, pero tienes la certeza de que puede ayudar a alguien en algún lugar del mundo. ¡Tu código ahora tiene el potencial de impactar vidas!"*

**¡Felicidades!** 🎉 Ahora tienes una API real desplegada en internet que puede usar cualquier developer del mundo. 

**Próximo paso:** En la **Sección 9** añadiremos pruebas automatizadas y documentación para que tu API sea aún más profesional y confiable. 🚀

**¿Quieres ver tu API en acción?** Comparte el enlace de Render.com con otros developers y pídeles que prueben las frases motivadoras. ¡Tu código está ayudando a otros ahora mismo! 🌟

---

# 📚 SECCIÓN 9: Probando la Motivación - Tests y Documentación

## 🌟 Asegurando la Calidad de Nuestra API Motivadora

**Imagina esto:** Tu API de frases motivadoras está desplegada y developers de todo el mundo la están usando. Pero de repente, un día dejas de recibir frases aleatorias o peor aún, ¡las frases de debugging devuelven errores! 

¡El testing y la documentación son tu **red de seguridad**! Te permiten dormir tranquilo sabiendo que tu API funciona correctamente y que los developers saben cómo usarla.

---

## 🎯 ¿Por Qué son Importantes los Tests y la Documentación?

Piensa en los tests y documentación como el **equipo de control de calidad y manual de usuario** de tu API:

```
SIN TESTS: 
- "Ojalá funcione" → Esperanza
- Descubres errores cuando los usuarios se quejan
- Cada cambio es un riesgo

CON TESTS:
- "Sé que funciona" → Certeza
- Descubres errores antes de desplegar
- Puedes hacer cambios con confianza

SIN DOCUMENTACIÓN:
- Los usuarios adivinan cómo usar la API
- Recibes las mismas preguntas una y otra vez
- Tu API es como un libro cerrado

CON DOCUMENTACIÓN:
- Los usuarios saben exactamente qué hacer
- Reduces soporte y preguntas
- Tu API es como un manual bien escrito
```

---

## 🚀 Creando Tests Unitarios para Nuestro Service

Vamos a crear el archivo `FraseMotivadoraServiceTest.java` en:
`src/test/java/com/motivacion/frasesmotivadoras/service/FraseMotivadoraServiceTest.java`

```java
package com.motivacion.frasesmotivadoras.service;

import com.motivacion.frasesmotivadoras.model.FraseMotivadora;
import com.motivacion.frasesmotivadoras.repository.FraseMotivadoraRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

/**
 * 📄 ARCHIVO: FraseMotivadoraServiceTest.java
 * 🎯 PROPÓSITO: Pruebas unitarias para el Service de frases motivadoras
 * 
 * 💡 Estas pruebas verifican que la lógica de negocio funciona correctamente
 * ⚡ Usamos Mockito para simular el Repository y probar el Service de forma aislada
 * 
 * 🧪 TIPOS DE PRUEBAS INCLUIDAS:
 * - Pruebas de funcionalidades básicas (CRUD)
 * - Pruebas de lógica de negocio específica
 * - Pruebas de casos edge y errores
 * - Pruebas de integración entre métodos
 * 
 * @author [Tu Nombre]
 * @version 1.0
 * @since 2024
 */
@ExtendWith(MockitoExtension.class)
class FraseMotivadoraServiceTest {

    @Mock
    private FraseMotivadoraRepository fraseRepository;

    @InjectMocks
    private FraseMotivadoraService fraseService;

    private FraseMotivadora fraseDebugging;
    private FraseMotivadora fraseAprendizaje;
    private List<FraseMotivadora> todasLasFrases;

    /**
     * 🏗️ CONFIGURACIÓN INICIAL PARA LAS PRUEBAS
     * 
     * 💡 Este método se ejecuta antes de cada prueba
     * ⚡ Preparamos datos de prueba consistentes
     */
    @BeforeEach
    void setUp() {
        // 📝 Crear frases de prueba realistas
        fraseDebugging = new FraseMotivadora(
            "El debugging es como ser detective en una película de crimen donde tú también eres el asesino.",
            "Anónimo",
            "debugging",
            "general",
            3,
            true
        );
        fraseDebugging.setId(1L);
        fraseDebugging.setFechaCreacion(LocalDateTime.now().minusDays(1));

        fraseAprendizaje = new FraseMotivadora(
            "El único programador 'malo' es el que deja de aprender. Cada error es una lección disfrazada.",
            "John Johnson",
            "aprendizaje",
            "general",
            2,
            false
        );
        fraseAprendizaje.setId(2L);
        fraseAprendizaje.setFechaCreacion(LocalDateTime.now());

        todasLasFrases = Arrays.asList(fraseDebugging, fraseAprendizaje);
    }

    /**
     * ✅ PRUEBA 1: Obtener todas las frases (éxito)
     * 
     * 💡 Verifica que el servicio devuelve correctamente todas las frases
     * 🎯 Caso: Repository devuelve lista de frases
     */
    @Test
    void cuandoObtenerTodasLasFrases_entoncesDevuelveLista() {
        // 🎭 Configurar mock: cuando se llame a findAll(), devolver lista de prueba
        when(fraseRepository.findAll()).thenReturn(todasLasFrases);

        // ⚡ Ejecutar el método a probar
        List<FraseMotivadora> resultado = fraseService.obtenerTodasLasFrases();

        // ✅ Verificaciones
        assertNotNull(resultado, "La lista no debería ser null");
        assertEquals(2, resultado.size(), "Debería haber 2 frases");
        assertEquals("debugging", resultado.get(0).getCategoria(), "La primera frase debería ser de debugging");
        
        // 🔍 Verificar que se llamó al repository
        verify(fraseRepository, times(1)).findAll();
    }

    /**
     * ✅ PRUEBA 2: Obtener frase por ID existente
     * 
     * 💡 Verifica que se puede recuperar una frase específica por su ID
     * 🎯 Caso: ID existe en la base de datos
     */
    @Test
    void cuandoObtenerFrasePorIdExistente_entoncesDevuelveFrase() {
        // 🎭 Configurar mock para ID existente
        when(fraseRepository.findById(1L)).thenReturn(Optional.of(fraseDebugging));

        // ⚡ Ejecutar prueba
        Optional<FraseMotivadora> resultado = fraseService.obtenerFrasePorId(1L);

        // ✅ Verificaciones
        assertTrue(resultado.isPresent(), "Debería encontrar la frase");
        assertEquals("Anónimo", resultado.get().getAutor(), "El autor debería coincidir");
        assertEquals(1L, resultado.get().getId(), "El ID debería coincidir");
        
        verify(fraseRepository, times(1)).findById(1L);
    }

    /**
     * ✅ PRUEBA 3: Obtener frase por ID no existente
     * 
     * 💡 Verifica el comportamiento cuando la frase no existe
     * 🎯 Caso: ID no existe en la base de datos
     */
    @Test
    void cuandoObtenerFrasePorIdNoExistente_entoncesDevuelveEmpty() {
        // 🎭 Configurar mock para ID no existente
        when(fraseRepository.findById(999L)).thenReturn(Optional.empty());

        // ⚡ Ejecutar prueba
        Optional<FraseMotivadora> resultado = fraseService.obtenerFrasePorId(999L);

        // ✅ Verificaciones
        assertFalse(resultado.isPresent(), "No debería encontrar la frase");
        verify(fraseRepository, times(1)).findById(999L);
    }

    /**
     * ✅ PRUEBA 4: Guardar nueva frase válida
     * 
     * 💡 Verifica que se puede crear una nueva frase correctamente
     * 🎯 Caso: Frase con datos válidos
     */
    @Test
    void cuandoGuardarFraseValida_entoncesDevuelveFraseGuardada() {
        // 🎭 Configurar mock para save()
        when(fraseRepository.save(any(FraseMotivadora.class))).thenReturn(fraseDebugging);

        // ⚡ Ejecutar prueba
        FraseMotivadora nuevaFrase = new FraseMotivadora(
            "Nueva frase de prueba",
            "Test Author",
            "testing",
            "general",
            3,
            false
        );
        
        FraseMotivadora resultado = fraseService.guardarFrase(nuevaFrase);

        // ✅ Verificaciones
        assertNotNull(resultado, "La frase guardada no debería ser null");
        assertEquals("Anónimo", resultado.getAutor(), "Debería devolver la frase guardada");
        assertNotNull(resultado.getFechaCreacion(), "Debería tener fecha de creación");
        
        verify(fraseRepository, times(1)).save(any(FraseMotivadora.class));
    }

    /**
     * ❌ PRUEBA 5: Guardar frase con contenido vacío (error)
     * 
     * 💡 Verifica que se valida el contenido de la frase
     * 🎯 Caso: Frase con contenido null o vacío
     */
    @Test
    void cuandoGuardarFraseConContenidoVacio_entoncesLanzaExcepcion() {
        // ⚡ Preparar frase inválida
        FraseMotivadora fraseInvalida = new FraseMotivadora();
        fraseInvalida.setContenido("   "); // Contenido con solo espacios
        fraseInvalida.setAutor("Test Author");

        // ✅ Verificar que lanza excepción
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> fraseService.guardarFrase(fraseInvalida),
            "Debería lanzar IllegalArgumentException"
        );

        assertEquals("El contenido de la frase no puede estar vacío", exception.getMessage());
        
        // 🔍 Verificar que NO se llamó a save()
        verify(fraseRepository, never()).save(any());
    }

    /**
     * ✅ PRUEBA 6: Obtener frase aleatoria con frases disponibles
     * 
     * 💡 Verifica la lógica de frases aleatorias
     * 🎯 Caso: Hay frases en la base de datos
     */
    @Test
    void cuandoObtenerFraseAleatoriaConFrases_entoncesDevuelveFrase() {
        // 🎭 Configurar mock para frase aleatoria
        when(fraseRepository.findFraseAleatoria()).thenReturn(Optional.of(fraseDebugging));

        // ⚡ Ejecutar prueba
        Optional<FraseMotivadora> resultado = fraseService.obtenerFraseAleatoria();

        // ✅ Verificaciones
        assertTrue(resultado.isPresent(), "Debería devolver una frase");
        assertEquals("debugging", resultado.get().getCategoria());
        
        verify(fraseRepository, times(1)).findFraseAleatoria();
    }

    /**
     * ✅ PRUEBA 7: Obtener frase aleatoria sin frases disponibles
     * 
     * 💡 Verifica el comportamiento cuando no hay frases
     * 🎯 Caso: Base de datos vacía
     */
    @Test
    void cuandoObtenerFraseAleatoriaSinFrases_entoncesDevuelveEmpty() {
        // 🎭 Configurar mock para base de datos vacía
        when(fraseRepository.findFraseAleatoria()).thenReturn(Optional.empty());

        // ⚡ Ejecutar prueba
        Optional<FraseMotivadora> resultado = fraseService.obtenerFraseAleatoria();

        // ✅ Verificaciones
        assertFalse(resultado.isPresent(), "No debería encontrar frases");
        verify(fraseRepository, times(1)).findFraseAleatoria();
    }

    /**
     * ✅ PRUEBA 8: Obtener frases por categoría existente
     * 
     * 💡 Verifica el filtrado por categoría
     * 🎯 Caso: Categoría con frases disponibles
     */
    @Test
    void cuandoObtenerFrasesPorCategoriaExistente_entoncesDevuelveLista() {
        // 🎭 Configurar mock para categoría debugging
        when(fraseRepository.findByCategoriaIgnoreCase("debugging"))
            .thenReturn(Arrays.asList(fraseDebugging));

        // ⚡ Ejecutar prueba
        List<FraseMotivadora> resultado = fraseService.obtenerFrasesPorCategoria("debugging");

        // ✅ Verificaciones
        assertNotNull(resultado, "La lista no debería ser null");
        assertEquals(1, resultado.size(), "Debería haber 1 frase de debugging");
        assertEquals("debugging", resultado.get(0).getCategoria());
        
        verify(fraseRepository, times(1)).findByCategoriaIgnoreCase("debugging");
    }

    /**
     * ✅ PRUEBA 9: Buscar frases por texto existente
     * 
     * 💡 Verifica la búsqueda por contenido
     * 🎯 Caso: Texto que existe en alguna frase
     */
    @Test
    void cuandoBuscarFrasesPorTextoExistente_entoncesDevuelveResultados() {
        // 🎭 Configurar mock para búsqueda
        when(fraseRepository.findByContenidoContainingIgnoreCase("debugging"))
            .thenReturn(Arrays.asList(fraseDebugging));

        // ⚡ Ejecutar prueba
        List<FraseMotivadora> resultado = fraseService.buscarFrasesPorTexto("debugging");

        // ✅ Verificaciones
        assertEquals(1, resultado.size(), "Debería encontrar 1 frase");
        assertTrue(resultado.get(0).getContenido().toLowerCase().contains("debugging"));
        
        verify(fraseRepository, times(1)).findByContenidoContainingIgnoreCase("debugging");
    }

    /**
     * ✅ PRUEBA 10: Eliminar frase existente
     * 
     * 💡 Verifica la eliminación correcta de frases
     * 🎯 Caso: ID existe y se puede eliminar
     */
    @Test
    void cuandoEliminarFraseExistente_entoncesDevuelveFraseEliminada() {
        // 🎭 Configurar mocks
        when(fraseRepository.findById(1L)).thenReturn(Optional.of(fraseDebugging));
        doNothing().when(fraseRepository).deleteById(1L);

        // ⚡ Ejecutar prueba
        Optional<FraseMotivadora> resultado = fraseService.eliminarFrase(1L);

        // ✅ Verificaciones
        assertTrue(resultado.isPresent(), "Debería devolver la frase eliminada");
        assertEquals(1L, resultado.get().getId());
        
        verify(fraseRepository, times(1)).findById(1L);
        verify(fraseRepository, times(1)).deleteById(1L);
    }

    /**
     * ✅ PRUEBA 11: Eliminar frase no existente
     * 
     * 💡 Verifica el comportamiento al eliminar frases que no existen
     * 🎯 Caso: ID no existe en la base de datos
     */
    @Test
    void cuandoEliminarFraseNoExistente_entoncesDevuelveEmpty() {
        // 🎭 Configurar mock para ID no existente
        when(fraseRepository.findById(999L)).thenReturn(Optional.empty());

        // ⚡ Ejecutar prueba
        Optional<FraseMotivadora> resultado = fraseService.eliminarFrase(999L);

        // ✅ Verificaciones
        assertFalse(resultado.isPresent(), "No debería encontrar la frase a eliminar");
        
        verify(fraseRepository, times(1)).findById(999L);
        verify(fraseRepository, never()).deleteById(anyLong());
    }

    /**
     * ✅ PRUEBA 12: Obtener estadísticas con frases disponibles
     * 
     * 💡 Verifica la generación de estadísticas
     * 🎯 Caso: Hay frases en la base de datos
     */
    @Test
    void cuandoObtenerEstadisticasConFrases_entoncesDevuelveEstadisticas() {
        // 🎭 Configurar mocks para estadísticas
        when(fraseRepository.count()).thenReturn(2L);
        when(fraseRepository.findByDestacadaTrue()).thenReturn(Arrays.asList(fraseDebugging));
        when(fraseRepository.findCategoriasUnicas()).thenReturn(Arrays.asList("debugging", "aprendizaje"));
        when(fraseRepository.findAutoresUnicos()).thenReturn(Arrays.asList("Anónimo", "John Johnson"));

        // ⚡ Ejecutar prueba
        String resultado = fraseService.obtenerEstadisticas();

        // ✅ Verificaciones
        assertNotNull(resultado, "Las estadísticas no deberían ser null");
        assertTrue(resultado.contains("Total de frases: 2"));
        assertTrue(resultado.contains("Frases destacadas: 1"));
        assertTrue(resultado.contains("debugging"));
        
        verify(fraseRepository, times(1)).count();
        verify(fraseRepository, times(1)).findByDestacadaTrue();
    }
}
```

---

## 📋 Creando Tests de Integración para el Controller

Vamos a crear `FraseMotivadoraControllerTest.java` en:
`src/test/java/com/motivacion/frasesmotivadoras/controller/FraseMotivadoraControllerTest.java`

```java
package com.motivacion.frasesmotivadoras.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.motivacion.frasesmotivadoras.model.FraseMotivadora;
import com.motivacion.frasesmotivadoras.service.FraseMotivadoraService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * 📄 ARCHIVO: FraseMotivadoraControllerTest.java
 * 🎯 PROPÓSITO: Pruebas de integración para los endpoints del Controller
 * 
 * 💡 Estas pruebas verifican que los endpoints HTTP funcionan correctamente
 * ⚡ Usamos @WebMvcTest para probar solo la capa web de forma aislada
 */
@WebMvcTest(FraseMotivadoraController.class)
class FraseMotivadoraControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private FraseMotivadoraService fraseService;

    @Test
    void cuandoGetFraseAleatoria_entoncesDevuelveFrase() throws Exception {
        // 🎭 Configurar mock
        FraseMotivadora frase = new FraseMotivadora("Frase de prueba", "Autor", "categoria", "general", 3, false);
        when(fraseService.obtenerFraseAleatoria()).thenReturn(Optional.of(frase));

        // ⚡ Ejecutar y verificar request HTTP
        mockMvc.perform(get("/api/v1/frases/aleatoria")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.contenido").value("Frase de prueba"));
    }
}
```

---

## 📚 Creando la Documentación de la API

### Opción 1: Documentación en README.md

Añade esta sección a tu `README.md`:

```markdown
# 📚 API de Frases Motivadoras para Developers

API REST que proporciona frases inspiradoras para desarrolladores en momentos difíciles.

## 🌐 URL Base

```
https://frases-motivadoras-api.onrender.com
```

## 🔌 Endpoints Disponibles

### Health Checks
- `GET /ping` - Verificar que la API está funcionando
- `GET /health` - Estado detallado de la API

### Frases Motivadoras

#### Obtener todas las frases
```http
GET /api/v1/frases
```

**Respuesta:**
```json
[
  {
    "id": 1,
    "contenido": "El debugging es como ser detective...",
    "autor": "Anónimo",
    "categoria": "debugging",
    "lenguaje": "general",
    "nivelDificultad": 3,
    "destacada": true
  }
]
```

#### Obtener frase aleatoria
```http
GET /api/v1/frases/aleatoria
```

#### Obtener frases por categoría
```http
GET /api/v1/frases/categoria/{categoria}
```

**Categorías disponibles:** `debugging`, `aprendizaje`, `deployment`, `estres`

#### Obtener frase para momento específico
```http
GET /api/v1/frases/momento/{contexto}?lenguaje=opcional
```

**Ejemplo:**
```bash
curl "https://frases-motivadoras-api.onrender.com/api/v1/frases/momento/debugging?lenguaje=java"
```

## 🚀 Ejemplos de Uso Rápidos

### Usando curl
```bash
# Frase aleatoria
curl https://frases-motivadoras-api.onrender.com/api/v1/frases/aleatoria

# Frases de debugging
curl https://frases-motivadoras-api.onrender.com/api/v1/frases/categoria/debugging

# Verificar salud
curl https://frases-motivadoras-api.onrender.com/ping
```

### Usando JavaScript
```javascript
// Obtener frase aleatoria
fetch('https://frases-motivadoras-api.onrender.com/api/v1/frases/aleatoria')
  .then(response => response.json())
  .then(frase => console.log(frase.contenido));
```

## 🎯 Códigos de Respuesta HTTP

- `200 OK` - Solicitud exitosa
- `201 Created` - Recurso creado exitosamente
- `400 Bad Request` - Datos inválidos
- `404 Not Found` - Recurso no encontrado

## 🔧 Desarrollo Local

```bash
# Clonar el proyecto
git clone https://github.com/tu-usuario/frases-motivadoras.git

# Ejecutar localmente
./mvnw spring-boot:run

# La API estará en http://localhost:8080
```
```

### Opción 2: Colección de Postman

Crea un archivo `FrasesMotivadoras.postman_collection.json`:

```json
{
  "info": {
    "name": "API Frases Motivadoras",
    "description": "Colección para probar la API de frases motivadoras",
    "schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
  },
  "item": [
    {
      "name": "Health Check",
      "request": {
        "method": "GET",
        "header": [],
        "url": {
          "raw": "https://frases-motivadoras-api.onrender.com/ping",
          "protocol": "https",
          "host": ["frases-motivadoras-api", "onrender", "com"],
          "path": ["ping"]
        }
      },
      "response": []
    },
    {
      "name": "Obtener Frase Aleatoria",
      "request": {
        "method": "GET",
        "header": [],
        "url": {
          "raw": "https://frases-motivadoras-api.onrender.com/api/v1/frases/aleatoria",
          "protocol": "https",
          "host": ["frases-motivadoras-api", "onrender", "com"],
          "path": ["api", "v1", "frases", "aleatoria"]
        }
      },
      "response": []
    }
  ]
}
```

---

## 🧪 Ejecutando los Tests

### Comandos para Ejecutar Tests:

```bash
# Ejecutar todos los tests
./mvnw test

# Ejecutar tests con reporte detallado
./mvnw test -Dtest=FraseMotivadoraServiceTest

# Ejecutar tests y generar reporte de cobertura
./mvnw test jacoco:report

# Ejecutar tests específicos por patrones
./mvnw test -Dtest="*Test"
```

### Configuración de Cobertura en pom.xml:

```xml
<plugin>
    <groupId>org.jacoco</groupId>
    <artifactId>jacoco-maven-plugin</artifactId>
    <version>0.8.8</version>
    <executions>
        <execution>
            <goals>
                <goal>prepare-agent</goal>
            </goals>
        </execution>
        <execution>
            <id>report</id>
            <phase>test</phase>
            <goals>
                <goal>report</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

---

## 🎯 Resumen de lo Aprendido

### ✅ **Conceptos Clave de Testing:**
- **Tests unitarios** = Prueban clases de forma aislada (Service)
- **Tests de integración** = Prueban la interacción entre componentes (Controller)
- **Mocking** = Simular dependencias para pruebas aisladas
- **Assertions** = Verificaciones de que el código funciona como esperamos

### ✅ **Beneficios del Testing:**
1. **🔒 Confianza** = Sabes que tu código funciona
2. **🚀 Refactoring seguro** = Puedes cambiar código sin miedo
3. **📚 Documentación viva** = Los tests muestran cómo usar el código
4. **🐛 Detección temprana** = Encuentras errores antes de desplegar

### ✅ **Beneficios de la Documentación:**
1. **👥 Onboarding fácil** = Nuevos developers entienden rápido
2. **📞 Menos soporte** = Los usuarios encuentran respuestas solos
3. **🌐 Adopción más fácil** = APIs bien documentadas se usan más
4. **🔧 Mantenimiento** = Tu yo del futuro te lo agradecerá

---

## 🚀 **Ejercicio Práctico: ¡Implementa Testing!**

### 📝 **Tu Misión:**
1. **Crea los archivos de test** en `src/test/java/`
2. **Ejecuta los tests** con `./mvnw test`
3. **Añade documentación** al README.md
4. **Crea la colección de Postman**

### 💡 **Ejercicio de Ampliación:**
Añade estos tests adicionales:

```java
// Test para frases por nivel de dificultad
@Test
void cuandoObtenerFrasesPorDificultad_entoncesDevuelveFrasesFiltradas() {
    // Implementa este test
}

// Test para frases destacadas del día
@Test
void cuandoObtenerFraseDestacadaDelDia_entoncesDevuelveFraseDestacada() {
    // Implementa este test
}
```

---

## 💫 **Frase Motivadora de la Sección:**
> *"Escribir tests es como construir un sistema de soporte vital para tu código: al principio parece trabajo extra, pero cuando llegas a producción y todo funciona perfectamente, te das cuenta de que cada test era una inversión en tranquilidad y confianza. ¡Tu código ahora tiene superpoderes!"*

**¡Excelente trabajo!** 🎉 Ahora tu API no solo funciona, sino que está **probada, documentada y lista para ser usada profesionalmente**.

**Próximo y último paso:** En la **Sección 10** añadiremos mejoras avanzadas y veremos cómo extender tu API con funcionalidades creativas. ¡El viaje está llegando a su fin pero las posibilidades son infinitas! 🚀

---

# 📚 SECCIÓN 10: Mejorando el Coach Digital - Extensiones Prácticas

## 🌟 Llevando tu API al Siguiente Nivel

**Imagina esto:** Tu API de frases motivadoras ya está funcionando, pero quieres transformarla de una simple lista de frases a un **verdadero coach digital inteligente** que aprenda de los usuarios, ofrezca funcionalidades avanzadas y sea más robusta y segura.

¡Es hora de añadir esas características profesionales que harán tu API realmente especial! Vamos a implementar mejoras que la convertirán en una herramienta indispensable para developers.

---

## 🎯 ¿Por Qué Mejorar Nuestra API?

Piensa en las mejoras como **transformar una librería básica en un centro comunitario inteligente**:

```
API BÁSICA:
- Frases estáticas
- Funcionalidades simples
- "Toma lo que hay"

API MEJORADA:
- Frases inteligentes y contextuales
- Interacción con usuarios
- "Aprende y se adapta a tus necesidades"
```

---

## 🚀 1. Sistema de Votos y Frases Populares

### Crear Entidad VotoFrase

`src/main/java/com/motivacion/frasesmotivadoras/model/VotoFrase.java`:

```java
package com.motivacion.frasesmotivadoras.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * 📄 ARCHIVO: VotoFrase.java
 * 🎯 ENTIDAD: Representa un voto de usuario para una frase
 * 
 * 💡 Permite a los usuarios votar por sus frases favoritas
 * ⚡ Los votos ayudan a identificar las frases más útiles e inspiradoras
 */
@Entity
@Table(name = "voto_frase", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"frase_id", "usuario_id"})
})
public class VotoFrase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "frase_id", nullable = false)
    private FraseMotivadora frase;

    @Column(name = "usuario_id", nullable = false)
    private String usuarioId; // Puede ser IP, email, o ID de usuario

    @Column(name = "tipo_voto") // "like", "dislike", "super_like"
    private String tipoVoto;

    @Column(name = "fecha_voto")
    private LocalDateTime fechaVoto;

    // Constructores, getters, setters...
    public VotoFrase() {
        this.fechaVoto = LocalDateTime.now();
    }

    public VotoFrase(FraseMotivadora frase, String usuarioId, String tipoVoto) {
        this();
        this.frase = frase;
        this.usuarioId = usuarioId;
        this.tipoVoto = tipoVoto;
    }
}
```

### Service para Gestión de Votos

`src/main/java/com/motivacion/frasesmotivadoras/service/VotoService.java`:

```java
package com.motivacion.frasesmotivadoras.service;

import com.motivacion.frasesmotivadoras.model.FraseMotivadora;
import com.motivacion.frasesmotivadoras.model.VotoFrase;
import com.motivacion.frasesmotivadoras.repository.VotoFraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 📄 ARCHIVO: VotoService.java
 * 🎯 SERVICE: Gestiona el sistema de votos para frases
 */
@Service
public class VotoService {

    @Autowired
    private VotoFraseRepository votoRepository;

    @Autowired
    private FraseMotivadoraService fraseService;

    /**
     * 🗳️ Registrar un voto para una frase
     */
    public Optional<VotoFrase> votarFrase(Long fraseId, String usuarioId, String tipoVoto) {
        Optional<FraseMotivadora> frase = fraseService.obtenerFrasePorId(fraseId);
        
        if (frase.isEmpty()) {
            return Optional.empty();
        }

        // Verificar si el usuario ya votó
        if (votoRepository.existsByFraseIdAndUsuarioId(fraseId, usuarioId)) {
            return Optional.empty(); // O actualizar el voto existente
        }

        VotoFrase voto = new VotoFrase(frase.get(), usuarioId, tipoVoto);
        return Optional.of(votoRepository.save(voto));
    }

    /**
     * 📊 Obtener frases más votadas
     */
    public List<FraseMotivadora> obtenerFrasesPopulares(int limite) {
        return votoRepository.findFrasesMasVotadas(limite);
    }

    /**
     * ⭐ Obtener frase del día basada en votos
     */
    public Optional<FraseMotivadora> obtenerFraseDelDia() {
        // Lógica para seleccionar frase del día basada en votos recientes
        return votoRepository.findFraseMasVotadaUltimaSemana();
    }
}
```

---

## 🚀 2. Endpoint de Frase del Día Inteligente

### Mejorar el Service Existente

Añade estos métodos a `FraseMotivadoraService.java`:

```java
/**
 * 🌟 FRASE DEL DÍA INTELIGENTE
 * 
 * 💡 Selecciona una frase diferente cada día basada en:
 * - Votos de usuarios
 * - Época del año
 * - Eventos relevantes para developers
 * - Frases no mostradas recientemente
 */
public Optional<FraseMotivadora> obtenerFraseDelDiaInteligente() {
    // 1. Primero intentar con frases muy votadas recientemente
    Optional<FraseMotivadora> frasePopular = votoService.obtenerFraseMasVotadaReciente();
    if (frasePopular.isPresent()) {
        return frasePopular;
    }

    // 2. Si no hay votos, usar lógica basada en el día del año
    int diaDelAnio = LocalDateTime.now().getDayOfYear();
    List<FraseMotivadora> todasLasFrases = obtenerTodasLasFrases();
    
    if (todasLasFrases.isEmpty()) {
        return Optional.empty();
    }

    // 3. Selección determinística pero que cambia cada día
    int indiceDelDia = diaDelAnio % todasLasFrases.size();
    return Optional.of(todasLasFrases.get(indiceDelDia));
}

/**
 * 🎯 FRASE CONTEXTUAL SEGÚN HORA Y DÍA
 * 
 * 💡 Frases diferentes según el momento del día y día de la semana
 */
public Optional<FraseMotivadora> obtenerFraseContextual() {
    LocalDateTime ahora = LocalDateTime.now();
    int hora = ahora.getHour();
    DayOfWeek diaSemana = ahora.getDayOfWeek();
    
    String categoriaContextual = determinarCategoriaContextual(hora, diaSemana);
    return obtenerFraseAleatoriaPorCategoria(categoriaContextual);
}

private String determinarCategoriaContextual(int hora, DayOfWeek diaSemana) {
    if (hora < 6) return "motivacion_mañana";
    if (hora < 12) return "productividad";
    if (hora < 18) return "enfoque";
    if (diaSemana == DayOfWeek.FRIDAY && hora >= 18) return "fin_semana";
    return "motivacion_general";
}
```

---

## 🚀 3. Validaciones Avanzadas con Bean Validation

### Añadir Validaciones a la Entidad

Mejora `FraseMotivadora.java`:

```java
import jakarta.validation.constraints.*;

@Entity
@Table(name = "frase_motivadora")
public class FraseMotivadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El contenido de la frase es obligatorio")
    @Size(min = 10, max = 500, message = "La frase debe tener entre 10 y 500 caracteres")
    @Column(name = "contenido", nullable = false, length = 500)
    private String contenido;

    @Size(max = 100, message = "El autor no puede tener más de 100 caracteres")
    @Column(name = "autor", length = 100)
    private String autor;

    @Pattern(regexp = "^(debugging|aprendizaje|deployment|estres|motivacion|productividad)$", 
             message = "Categoría no válida")
    @Column(name = "categoria", length = 50)
    private String categoria;

    @Min(value = 1, message = "El nivel de dificultad debe ser al menos 1")
    @Max(value = 5, message = "El nivel de dificultad no puede ser mayor que 5")
    @Column(name = "nivel_dificultad")
    private Integer nivelDificultad;

    // ... resto del código
}
```

### Crear DTO para Validaciones Específicas

`src/main/java/com/motivacion/frasesmotivadoras/dto/NuevaFraseRequest.java`:

```java
package com.motivacion.frasesmotivadoras.dto;

import jakarta.validation.constraints.*;

/**
 * 📄 ARCHIVO: NuevaFraseRequest.java
 * 🎯 DTO: Data Transfer Object para validaciones específicas de creación
 */
public class NuevaFraseRequest {

    @NotBlank(message = "El contenido es obligatorio")
    @Size(min = 10, max = 500, message = "La frase debe tener entre 10 y 500 caracteres")
    private String contenido;

    @Size(max = 100, message = "El autor no puede tener más de 100 caracteres")
    private String autor;

    @Pattern(regexp = "^(debugging|aprendizaje|deployment|estres|motivacion|productividad)$", 
             message = "Categoría no válida")
    private String categoria;

    private String lenguaje;

    @Min(1) @Max(5)
    private Integer nivelDificultad;

    // Getters y Setters
}
```

---

## 🚀 4. Manejo Avanzado de Errores

### Crear Clase de Error Personalizado

`src/main/java/com/motivacion/frasesmotivadoras/exception/ApiError.java`:

```java
package com.motivacion.frasesmotivadoras.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 📄 ARCHIVO: ApiError.java
 * 🎯 MODELO: Respuesta estandarizada para errores
 */
@Data
public class ApiError {
    
    private int status;
    private String error;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime timestamp;
    
    private String message;
    private String path;
    private List<ValidationError> validationErrors;

    public ApiError(int status, String error, String message, String path) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
        this.timestamp = LocalDateTime.now();
    }

    @Data
    public static class ValidationError {
        private String field;
        private String message;
        private Object rejectedValue;

        public ValidationError(String field, String message, Object rejectedValue) {
            this.field = field;
            this.message = message;
            this.rejectedValue = rejectedValue;
        }
    }
}
```

### Controlador de Excepciones Global

`src/main/java/com/motivacion/frasesmotivadoras/exception/GlobalExceptionHandler.java`:

```java
package com.motivacion.frasesmotivadoras.exception;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.stream.Collectors;

/**
 * 📄 ARCHIVO: GlobalExceptionHandler.java
 * 🎯 CONTROLADOR: Maneja excepciones globalmente de forma consistente
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 🎯 Maneja errores de validación de @Valid
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError> handleValidationErrors(MethodArgumentNotValidException ex, WebRequest request) {
        ApiError apiError = new ApiError(
            HttpStatus.BAD_REQUEST.value(),
            "Datos de entrada inválidos",
            "Error de validación en los datos enviados",
            request.getDescription(false)
        );

        // Extraer detalles de validación
        apiError.setValidationErrors(ex.getBindingResult()
            .getFieldErrors()
            .stream()
            .map(error -> new ApiError.ValidationError(
                error.getField(),
                error.getDefaultMessage(),
                error.getRejectedValue()
            ))
            .collect(Collectors.toList()));

        return new ResponseEntity<>(apiError, HttpStatus.BAD_REQUEST);
    }

    /**
     * 🎯 Maneja cuando no se encuentra una frase
     */
    @ExceptionHandler(FraseNotFoundException.class)
    public ResponseEntity<ApiError> handleFraseNotFound(FraseNotFoundException ex, WebRequest request) {
        ApiError apiError = new ApiError(
            HttpStatus.NOT_FOUND.value(),
            "Frase no encontrada",
            ex.getMessage(),
            request.getDescription(false)
        );
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }

    /**
     * 🎯 Maneja errores generales inesperados
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleGeneralException(Exception ex, WebRequest request) {
        ApiError apiError = new ApiError(
            HttpStatus.INTERNAL_SERVER_ERROR.value(),
            "Error interno del servidor",
            "Ocurrió un error inesperado. Por favor, intenta más tarde.",
            request.getDescription(false)
        );
        return new ResponseEntity<>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
```

### Excepción Personalizada

`src/main/java/com/motivacion/frasesmotivadoras/exception/FraseNotFoundException.java`:

```java
package com.motivacion.frasesmotivadoras.exception;

public class FraseNotFoundException extends RuntimeException {
    public FraseNotFoundException(Long id) {
        super("No se encontró la frase con ID: " + id);
    }
    
    public FraseNotFoundException(String message) {
        super(message);
    }
}
```

---

## 🚀 5. Seguridad Básica y Rate Limiting

### Configuración de Seguridad Básica

`src/main/java/com/motivacion/frasesmotivadoras/config/SecurityConfig.java`:

```java
package com.motivacion.frasesmotivadoras.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

/**
 * 📄 ARCHIVO: SecurityConfig.java
 * 🎯 CONFIGURACIÓN: Seguridad básica para la API
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .cors(cors -> cors.configurationSource(corsConfigurationSource()))
            .csrf(csrf -> csrf.disable()) // Deshabilitar CSRF para APIs REST
            .authorizeHttpRequests(authz -> authz
                .requestMatchers("/ping", "/health", "/api/v1/frases/**").permitAll()
                .anyRequest().authenticated()
            )
            .headers(headers -> headers
                .frameOptions(frame -> frame.sameOrigin())
                .contentSecurityPolicy(csp -> csp.policyDirectives("default-src 'self'"))
            );

        return http.build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList(
            "https://frases-motivadoras-api.onrender.com",
            "http://localhost:3000",
            "http://localhost:8080"
        ));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        configuration.setAllowedHeaders(Arrays.asList("*"));
        configuration.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
```

### Rate Limiting Básico

`src/main/java/com/motivacion/frasesmotivadoras/config/RateLimitConfig.java`:

```java
package com.motivacion.frasesmotivadoras.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 📄 ARCHIVO: RateLimitConfig.java
 * 🎯 CONFIGURACIÓN: Limitación de tasa para prevenir abusos
 */
@Configuration
public class RateLimitConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // Implementación básica de rate limiting
        registry.addInterceptor(new RateLimitInterceptor())
                .addPathPatterns("/api/v1/frases/aleatoria")
                .addPathPatterns("/api/v1/frases/del-dia");
    }
}
```

---

## 🚀 6. Endpoints Avanzados para el Controller

### Mejorar el Controller con Nuevas Funcionalidades

Añade estos métodos a `FraseMotivadoraController.java`:

```java
/**
 * 🌐 GET /api/v1/frases/del-dia
 * 🌟 Frase del día inteligente
 * 
 * 💡 Cambia cada día y considera votos, contexto temporal, etc.
 */
@GetMapping("/del-dia")
public ResponseEntity<FraseMotivadora> obtenerFraseDelDia() {
    Optional<FraseMotivadora> frase = fraseService.obtenerFraseDelDiaInteligente();
    return frase.map(ResponseEntity::ok)
               .orElse(ResponseEntity.notFound().build());
}

/**
 * 🌐 GET /api/v1/frases/contextual
 * 🎯 Frase contextual según hora y día
 * 
 * 💡 Frases diferentes para mañanas, tardes, fines de semana, etc.
 */
@GetMapping("/contextual")
public ResponseEntity<FraseMotivadora> obtenerFraseContextual() {
    Optional<FraseMotivadora> frase = fraseService.obtenerFraseContextual();
    return frase.map(ResponseEntity::ok)
               .orElse(ResponseEntity.notFound().build());
}

/**
 * 🌐 POST /api/v1/frases/{id}/voto
 * 🗳️ Votar por una frase
 * 
 * 💡 Los usuarios pueden votar por sus frases favoritas
 */
@PostMapping("/{id}/voto")
public ResponseEntity<VotoResponse> votarFrase(
        @PathVariable Long id,
        @RequestParam String tipoVoto,
        @RequestHeader(value = "X-User-Id", required = false) String usuarioId) {
    
    // Si no hay usuarioId, usar IP como identificador
    if (usuarioId == null) {
        usuarioId = obtenerIpDelRequest();
    }

    Optional<VotoFrase> voto = votoService.votarFrase(id, usuarioId, tipoVoto);
    
    return voto.map(v -> ResponseEntity.ok(new VotoResponse("Voto registrado exitosamente")))
              .orElse(ResponseEntity.badRequest().build());
}

/**
 * 🌐 GET /api/v1/frases/populares
 * 📊 Frases más populares (por votos)
 */
@GetMapping("/populares")
public ResponseEntity<List<FraseMotivadora>> obtenerFrasesPopulares(
        @RequestParam(defaultValue = "10") int limite) {
    List<FraseMotivadora> frases = votoService.obtenerFrasesPopulares(limite);
    return ResponseEntity.ok(frases);
}

/**
 * 🌐 GET /api/v1/frases/estadisticas-avanzadas
 * 📈 Estadísticas avanzadas con votos
 */
@GetMapping("/estadisticas-avanzadas")
public ResponseEntity<EstadisticasAvanzadas> obtenerEstadisticasAvanzadas() {
    EstadisticasAvanzadas estadisticas = fraseService.obtenerEstadisticasAvanzadas();
    return ResponseEntity.ok(estadisticas);
}
```

---

## 🚀 7. DTOs para Respuestas Mejoradas

### Crear DTOs Específicos

`src/main/java/com/motivacion/frasesmotivadoras/dto/FraseResponse.java`:

```java
package com.motivacion.frasesmotivadoras.dto;

import com.motivacion.frasesmotivadoras.model.FraseMotivadora;
import lombok.Data;
import java.time.LocalDateTime;

/**
 * 📄 ARCHIVO: FraseResponse.java
 * 🎯 DTO: Respuesta enriquecida para frases
 */
@Data
public class FraseResponse {
    private Long id;
    private String contenido;
    private String autor;
    private String categoria;
    private String lenguaje;
    private Integer nivelDificultad;
    private Boolean destacada;
    private LocalDateTime fechaCreacion;
    private Integer totalVotos;
    private Double puntuacionPromedio;
    private Boolean esFraseDelDia;

    public FraseResponse(FraseMotivadora frase, Integer totalVotos, Double puntuacionPromedio) {
        this.id = frase.getId();
        this.contenido = frase.getContenido();
        this.autor = frase.getAutor();
        this.categoria = frase.getCategoria();
        this.lenguaje = frase.getLenguaje();
        this.nivelDificultad = frase.getNivelDificultad();
        this.destacada = frase.getDestacada();
        this.fechaCreacion = frase.getFechaCreacion();
        this.totalVotos = totalVotos;
        this.puntuacionPromedio = puntuacionPromedio;
        this.esFraseDelDia = false; // Lógica para determinar esto
    }
}
```

---

## 🎯 Resumen de las Mejoras Implementadas

### ✅ **Sistema de Votos:**
- Los usuarios pueden votar por frases
- Identificación de frases populares
- Frase del día basada en votos

### ✅ **Validaciones Avanzadas:**
- Validaciones con Bean Validation
- DTOs específicos para diferentes operaciones
- Mensajes de error claros y específicos

### ✅ **Manejo de Errores Profesional:**
- Respuestas de error estandarizadas
- Excepciones personalizadas
- Controlador global de excepciones

### ✅ **Seguridad Básica:**
- Configuración CORS para frontends
- Rate limiting básico
- Headers de seguridad

### ✅ **Endpoints Inteligentes:**
- Frase del día contextual
- Frases según hora y día de la semana
- Estadísticas avanzadas
- Sistema de votos integrado

---

## 🚀 **Ejercicio Práctico: ¡Implementa una Mejora!**

### 📝 **Tu Misión:**
Elige una de estas mejoras e impleméntala:

1. **Sistema de votos básico**
2. **Endpoint de frase del día**
3. **Validaciones con Bean Validation**

### 💡 **Ejemplo de Implementación Paso a Paso:**

```java
// 1. Añadir dependencia de validación en pom.xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>

// 2. Añadir @Valid en el controller
@PostMapping
public ResponseEntity<FraseMotivadora> crearFrase(
        @Valid @RequestBody NuevaFraseRequest request) {
    // Tu código aquí
}

// 3. Probar con datos inválidos
curl -X POST http://localhost:8080/api/v1/frases \
  -H "Content-Type: application/json" \
  -d '{"contenido":"abc"}' # Demasiado corto - debería fallar
```

---

## 💫 **Frase Motivadora Final del Curso:**
> *"Llegar al final de este curso no es el final de tu journey como developer, sino el comienzo de algo mucho más grande. Cada línea de código que has escrito, cada prueba que has implementado, cada mejora que has añadido, te ha convertido en un developer más completo y preparado. ¡El mundo necesita más developers como tú!"*

**¡Felicidades!** 🎉 Has completado el curso de desarrollo de APIs con Spring Boot. Ahora tienes:

- ✅ **Una API profesional y funcional**
- ✅ **Código bien testeado y documentado**
- ✅ **Conocimientos sólidos de Spring Boot**
- ✅ **Experiencia en despliegue real**
- ✅ **Una herramienta que puede ayudar a otros developers**

**Tu API ahora está viva en:** `https://frases-motivadoras-api.onrender.com`

**¿Qué sigue?** ¡El cielo es el límite! Puedes:
- Añadir un frontend web o móvil
- Implementar autenticación de usuarios
- Conectar una base de datos PostgreSQL
- Añadir más funcionalidades creativas
- Compartir tu API con la comunidad

**¡Éxito en tu journey como developer!** 🚀🌟