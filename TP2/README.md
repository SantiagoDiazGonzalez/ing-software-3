TRABAJO PRACTICO 2

Qué es Maven?
    Maven es una herramienta con el objetivo de simplificar los procesos de build, sin tener que preocuparse de los modulos, dependencias y librerias que necesite el proyecto (simplemente se escribe mvn install). Maven es capaz de gestionar un proyecto de software completo.

Qué es el archivo POM?
    El archivo POM es un archivo XML que define los pasos para la ejecucion de un build.
        modelVersion: define la version de Maven que utiliza el proyecto.
        groupId: define el nombre de la libreria.
        artifactId: define el nombre del proyecto, del target a generar. (Id de la libreria que se esta trabajando)
        version: define la version de la libreria que se esta desarrollando.

Repositorios
    Central: Por defecto se buscan las dependencias que se necesiten en este repositorio, global y publico.
    Local: Cuando se obtiene la dependencia se crea una copia local, en el repositorio local. (M2)
    Remoto: Servidor privado, tambien se obtienen dependencias pero no es publico como el central.

Ciclos de vida del build
    Maven es una herramienta utilizada durante todo el ciclo de vida del proyecto de software.

------------------------------------------------------------------------------------------------------------------------

mvn clean install
    Cuando ejecuto este comando en el directorio donde se encuentra el archivo POM se realiza el build del proyecto y se crea un target con un archivo jar, correspondiente a la aplicacion y las propiedades que se declararon en el archivo POM. Install no solo compila el codigo, sino que lo agrega al repositorio local.

mvn clean package
    Este comando realiza el build del proyecto creando un archivo jar como el comando anterior (siguiendo las instrucciones indicadas en el archivo POM).

Dependencias
    Se pueden indicar las dependencias del proyecto en el archivo POM, sin embargo si no se usa el plugin shade de maven las dependencias no se van a empaquetar en un uber-jar con el proyecto empaquetado, y cuando se lo quiera ejecutar no se encontraran las mismas.

------------------------------------------------------------------------------------------------------------------------

Build tools
    Java --> Maven, Gradle.
    Python --> PyBuilder.
    C++ --> Cmake, Gradle.
    C# --> Cake.
    javascript --> Grunt, Nodejs.
    Ruby --> RubyGems.
    Go --> go build.
    Swift --> Package manager.
    Kotlin --> Ant, Maven, Gradle.
    PHP --> Phing.