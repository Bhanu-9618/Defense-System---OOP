# Defense System OOP

**A Java-based defense system simulation demonstrating OOP concepts and the Observer design pattern with interactive Helicopter, Tank, and Submarine modules.**

---

## Overview

This project simulates a simple defense control system where a **Main Controller** interacts with multiple defense units: **Helicopter**, **Tank**, and **Submarine**.  
It uses **Object-Oriented Programming principles** and implements the **Observer Pattern** to notify units about area clearance and updates.

---

## Features

- Interactive GUI for Main Controller and defense units  
- Send messages between Main Controller and units  
- Area clearance notifications to all units  
- Adjustable positions using sliders  
- Unit-specific operations:  
  - Helicopter: Shoot, Missile, Laser  
  - Tank: Shoot, Missile, Radar, Rotate Shooting  
  - Submarine: Shoot, Missile, Sonar, Trident  

---

## Technologies

- **Java SE**  
- **Swing (Java GUI Framework)**  
- **OOP Concepts**: Classes, Interfaces, Encapsulation  
- **Design Pattern**: Observer  

---

## Architecture

**Main Components**:  

1. **Maincontrol (Subject)** – Controls all units and notifies observers  
2. **Observer Interface** – Defines methods for units to implement (`update`, `updatemessage`, enable/disable controls)  
3. **Units (Observers)** – `Helicopter`, `Tank`, `Submarine` implement Observer interface  

**Flow**:  
- Maincontrol maintains a list of observers  
- Updates or area clearance triggers `notifyObservers()`  
- Units receive updates and update GUI accordingly  

