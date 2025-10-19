# Tic Tac Toe Game (Java)

A simple command-line Tic Tac Toe game built using Java.
This game allows **two players** to play alternately using `X` and `O` on a 3x3 board.

---

## Features
- Two-player mode
- Valid move checking
- Detects win/draw
- Option to play again

---

## How to Run
```bash
javac *.java
java Main

---

## Project Structure 
TicTacToeGame/
├── Board.java      → Handles game board display & logic
├── Game.java       → Manages turns, moves & win/draw logic
├── Player.java     → Holds player name and symbol
├── Main.java       → Entry point, manages input & game start
├── README.md       → This file (project documentation)
└── .gitignore      → Ignores unnecessary files like .class

---

## Tech Stack
Language: Java
Runtime: JDK 8 or higher
IDE (optional): IntelliJ IDEA, Eclipse, or VS Code