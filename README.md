# 🎮 RPG Character System

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Version](https://img.shields.io/badge/Version-1.0-blue?style=for-the-badge)

</div>
## 📖 Overview

A comprehensive object-oriented RPG character system implemented in Java. This project showcases advanced OOP principles including inheritance, polymorphism, abstract classes, and interfaces to create a flexible and extensible game character framework.

## ✨ Features

- **Class Hierarchy**
  - Abstract base `Personaje` class
  - Intermediate `PersonajeFisico` and `PersonajeMagico` classes 
  - Five concrete character classes with unique abilities

- **Design Patterns**
  - Inheritance with multi-level class hierarchy
  - Interface implementation for specialized behaviors
  - Polymorphic collections and method calls

- **Game Systems**
  - Turn-based combat system
  - Character attribute management
  - Special ability implementation

## 🧙‍♂️ Character Classes

<div align="center">

| Character | Base Type | Abilities | Special Skills |
|:---------:|:---------:|:----------|:--------------|
| ⚔️ **Guerrero** | Physical | High strength & armor | Shield defense, power attacks |
| 🧙 **Mago** | Magical | Wisdom & mana | Spellcasting, healing abilities |
| 🏹 **Arquero** | Physical | Agility & range | Arrow attacks, high mobility |
| 🔮 **Hechicero** | Magical | Concentration & dark magic | Entity summoning, magical barriers |
| 🗡️ **Asesino** | Physical | Stealth & critical hits | Backstab attacks, shadow hiding |

</div>

## 📋 Project Structure

```
src/
├── Main.java               # Main application entry point
├── core/
│   ├── Personaje.java      # Abstract base class
│   ├── PersonajeFisico.java # Physical character type
│   └── PersonajeMagico.java # Magical character type
├── interfaces/
│   ├── Defendible.java     # Defense capabilities
│   ├── Magico.java         # Magic usage  
│   ├── Volador.java        # Flying abilities
│   ├── Curable.java        # Healing abilities
│   └── Movilizable.java    # Movement specialties
├── characters/
│   ├── Guerrero.java       # Warrior implementation
│   ├── Mago.java           # Mage implementation
│   ├── Arquero.java        # Archer implementation
│   ├── Hechicero.java      # Sorcerer implementation
│   └── Asesino.java        # Assassin implementation
└── system/
    ├── Juego.java          # Game management class
    └── Batalla.java        # Combat system implementation
```

## 🚀 Quick Start

```bash
# Clone this repository
git clone https://github.com/yourusername/rpg-character-system.git

# Navigate to the project directory
cd rpg-character-system

# Compile the project
javac -d bin src/Main.java

# Run the application
java -cp bin Main
```

## 💻 Usage Example

```java
// Create characters
Guerrero aragorn = new Guerrero("Aragorn", 10, 150);
aragorn.setFuerza(17);
aragorn.setArmadura(15);

Mago gandalf = new Mago("Gandalf", 15, 100);
gandalf.setMana(18);
gandalf.setSabiduria(15);

// Add characters to game
Juego juego = new Juego();
juego.agregarPersonaje(aragorn);
juego.agregarPersonaje(gandalf);

// Show character actions
juego.mostrarAcciones();

// Start a battle between characters
Batalla batalla = new Batalla(aragorn, gandalf);
batalla.iniciarCombate();
```
<div align="center">
  <sub>Built with ❤️ by Alejandro Hernández Ravelo & Martín Oliver Pallarés.</sub>
</div>
