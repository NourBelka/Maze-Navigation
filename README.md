# Maze-Navigation

A Java console-based program that simulates navigating through a maze using connected nodes. Each room in the maze is represented by a Node object, with references to neighboring rooms in the north, south, east, and west directions. The program allows the user to move through the maze step by step until reaching the finish.

---

## Features
- Maze modeled as a graph using nodes connected by directional references  
- Each room displays its name and available movement directions  
- Console-based interaction with movement commands (`n`, `s`, `e`, `w`)  
- Error messages for invalid moves  
- Finishes when the user reaches the designated end room (room L) 

---

## Classes
- **Node** → Represents a room with a name and up to four directional connections (north, south, east, west)  
- **Main** → Runs the program and handles user interaction  

---

## How to Run
1. Clone the repository  
2. Open the project in an IDE (IntelliJ, Eclipse, VS Code with Java extensions)  
3. Run the `Main.java` file
4. Enter a command (`n`, `s`, `e`, `w`) to move to another room  
