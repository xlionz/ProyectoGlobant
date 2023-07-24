PetStoreKarate
Este proyecto contiene pruebas automatizadas para la API de PetStore utilizando Karate, una herramienta para realizar pruebas de API REST. A continuación, 
se describen los pasos para configurar el entorno y ejecutar las pruebas utilizando Gradle y Java.

Requisitos previos
Antes de ejecutar las pruebas automatizadas, asegúrese de tener las siguientes herramientas instaladas y configuradas correctamente en su entorno:

Java: Asegúrese de tener Java instalado en su sistema. Puede verificar la instalación ejecutando el comando java -version en la terminal.

Gradle: Instale Gradle y configure las variables de entorno para que pueda ejecutar comandos de Gradle desde cualquier ubicación en la terminal.


Estructura del proyecto
El proyecto tiene la siguiente estructura de carpetas:

PetStoreKarate/
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   └── co.com.petstore.integrationTest/
│   │   │       └── miscroservicename(user)/
│   │   │           └─├── requests/
│   │   │              ├── responses/
│   │   │              ├── features/
│   │   │               
│   │   └── karate-config.js
│   │  
├── build.gradle
└── settings.gradle

La carpeta features contiene los archivos de prueba Karate que definen los escenarios y pasos de las pruebas.

Generación de reportes
Karate genera automáticamente reportes HTML con información detallada sobre las ejecuciones de las pruebas. Estos reportes se encontrarán en la carpeta target/surefire-reports del proyecto después de ejecutar las pruebas.