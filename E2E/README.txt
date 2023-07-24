
OpenCartProyect


Este proyecto es una suite de pruebas automatizadas para la aplicación OpenCart. A continuación, se describen los pasos necesarios para configurar el entorno y ejecutar las automatizaciones, así como algunas opciones para generar evidencias y ejecutar los tests.


OpenCartProyect
Este proyecto es una suite de pruebas automatizadas para la aplicación OpenCart. A continuación, se describen los pasos necesarios para configurar el entorno y ejecutar las automatizaciones, así como algunas opciones para generar evidencias y ejecutar los tests.

Requisitos previos
Antes de ejecutar las pruebas automatizadas, asegúrese de tener las siguientes herramientas instaladas y configuradas correctamente en su entorno:

Java: Asegúrese de tener Java instalado en su sistema. Puede verificar la instalación ejecutando el comando java -version en la terminal.

Gradle: Instale Gradle y configure las variables de entorno para que pueda ejecutar comandos de Gradle desde cualquier ubicación en la terminal.

Ejecución de las automatizaciones

Para ejecutar las pruebas automatizadas, se proporciona un comando Gradle que facilita el proceso. Abra una terminal en la ubicación del proyecto y utilice el siguiente comando: gradlew clean test 'nombreDelRunner' aggregate -i, Donde 'nombreDelRunner' es el nombre específico del runner que desea ejecutar. 

Si desea ejecutar todos los tests del proyecto, puede utilizar el siguiente comando: gradlew clean test aggregate -i


Generación de evidencias
Durante la ejecución de las pruebas automatizadas, se generarán evidencias y reportes que ayudarán a analizar los resultados. Estos archivos se guardarán en la carpeta de salida del proyecto.

Ejecución desde el IDE
Si prefiere utilizar su IDE favorito para ejecutar las pruebas, simplemente vaya a la carpeta runners en el proyecto y ejecute el test deseado desde allí.

Notas adicionales
Asegúrese de que el entorno esté configurado adecuadamente antes de ejecutar las automatizaciones.
Si encuentra algún problema durante la ejecución de las pruebas o tiene alguna pregunta sobre el proyecto, no dude en ponerse en contacto con el equipo de desarrollo.