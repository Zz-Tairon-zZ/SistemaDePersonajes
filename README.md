#Sistema de Juego RPG en Java
Descripción
Sistema de juego RPG orientado a objetos que modela diferentes tipos de personajes con sus respectivas habilidades y características. Implementa principios avanzados de POO como herencia, polimorfismo, clases abstractas e interfaces.
#Estructura del Proyecto
└── src/
    ├── Main.java            # Clase principal con método main
    ├── Personaje.java       # Clase abstracta base
    ├── PersonajeFisico.java # Clase abstracta intermedia
    ├── PersonajeMagico.java # Clase abstracta intermedia
    ├── interfaces/          # Interfaces para comportamientos
    ├── personajes/          # Clases concretas de personajes
    └── sistema/             # Clases de sistema (Juego, Batalla)

#Características
Herencia multinivel con clases abstractas
Implementación de interfaces para comportamientos específicos
Sistema de atributos y habilidades para cada tipo de personaje
Mecanismo de combate por turnos
Polimorfismo a través de colecciones de interfaces
#Clases de Personajes
Personaje
Tipo
Interfaces
Habilidades Especiales
Guerrero
Físico
Defendible
Carga de ataque, alta defensa
Mago
Mágico
Mágico, Curable
Lanzamiento de hechizos, curación
Arquero
Físico
Volador, Movilizable
Disparo de flechas, alta velocidad
Hechicero
Mágico
Mágico, Defendible
Hechizos oscuros, invocación
Asesino
Físico
Movilizable, Curable
Sigilo, ataques críticos

#Requisitos
Java JDK 11 o superior
IDE compatible con Java (Eclipse, IntelliJ IDEA, etc.)
Ejecución
javac Main.java
java Main

Ejemplo de Uso
// Crear personajes
Guerrero guerrero = new Guerrero("Aragorn", 10, 150);
Mago mago = new Mago("Gandalf", 15, 100);

// Crear juego y añadir personajes
Juego juego = new Juego();
juego.agregarPersonaje(guerrero);
juego.agregarPersonaje(mago);

// Mostrar acciones
juego.mostrarAcciones();

// Crear batalla
Batalla batalla = new Batalla(guerrero, mago);
batalla.iniciarCombate();

Creadores: 
Alejandro Hernández Ravelo.
Martín Oliver Pallarés.


