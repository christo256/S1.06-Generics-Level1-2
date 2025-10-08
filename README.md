# 📚 Java Generics Exercises - Level 1 & Level 2

## 📄 Description

This repository contains **Java exercises** for **Level 1** and **Level 2**, focused on the use of **Generics in Java**.  
The goal is to practice creating **generic classes**, **generic methods**, and working with **type parameters** to ensure type safety and flexibility in your code.

All exercises are written in **English**, follow the **Sprint 0 best practices**, and can be implemented using **Eclipse** or **IntelliJ IDEA**.  
Projects can be built using **Maven**, **Gradle**, or plain **Java**.

---

## 🧩 Level 1 - Generics Exercises

### Exercise 1 - NoGenericMethods

- Create a class named `NoGenericMethods` that stores **three arguments of the same type**.  
- Include:
  - A constructor to initialize the three arguments.
  - Getters and setters for each argument.
- Verify that the arguments can be passed in **any order** to the constructor.

**Goal:**  
Understand how non-generic classes behave when handling objects of the same type.

---

### Exercise 2 - GenericMethods

- Create a class named `Persona` with the following attributes:
  - `name`
  - `surname`
  - `age`
- Then, create a class named `GenericMethods` containing a **generic method** that accepts **three arguments of any type**.
- The method must **print to the console** the received arguments.
- In the `main()` method of the main class, call the generic method with different parameter types, such as:
  - An object of class `Persona`
  - A `String`
  - A primitive type (e.g. `int`)

**Goal:**  
Verify that the method can accept **any type of parameter** and **in any order**.

---

## 🧩 Level 2 - Generics Exercises

### Exercise 1 - Mixed Generic Method

- Modify the previous exercise so that **one of the arguments** in the generic method is **not generic**.  
  (For example, make the first argument of type `String` and the other two generic.)

**Goal:**  
Learn to combine **generic and non-generic parameters** within the same method.

---

### Exercise 2 - Variable-Length Generic Arguments

- Modify the previous method so that the generic arguments are passed as a **variable-length argument list** (`varargs`).
- The method should print all the received arguments.

**Goal:**  
Practice using **variable-length generic parameters** to handle an **undefined number of arguments** of different types.

---

## 💻 Technologies Used

- **Java 24**  
- **Maven** (optional project build)  
- **IntelliJ IDEA** or **Eclipse**  
- **Git & GitHub**

---

## 📋 Requirements

- Java 17 or higher  
- IDE: Eclipse or IntelliJ IDEA (recommended)  
- Maven or Gradle (optional)  
- Git installed

---

## 🛠️ Installation

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/christo256/S1.06-Generics-Level1-2
