# javafx-multi-scene
**javafx-multi-scene** is a demonstration how you can use one stage and many scenes when building a JavaFX application.  The graphics are very simple, as the point of the demo is how to move from one to the other.  

## Intro
**javafx-multi-scene** uses a static Map in Main with the Scene as the value and the SceneName as the key.  SceneName is an enum with the name of each Scene.  Main builds all the Scenes at startup and adds them to the static Map.

The Stage is injected from Main into each View and from there into each controller.  This combination of Scene Map and Stage provides all the control need for each Scene.

The graphics were kept simple, as the point of the demo is the switching between Scenes.

## Requirements
**javafx-multi-scene** should run on Java 8 or above.

## Launching
Launch **javafx-multi-scene** from your favorite IDE, or with [Maven](https://maven.apache.org/):

    mvn exec:java

