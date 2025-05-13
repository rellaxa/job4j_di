# Dependency Injection (DI)

This repository provides a simple implementation of **Dependency Injection (DI)** in Java. 
With DI, object creation and dependency management are centralized.

## Key Concepts

* **Dependency Injection**: A design pattern where an object receives (or is "injected" with) its dependencies rather than creating them itself.
* **Context**: A container (often called an *IoC container* or *DI context*) that holds and manages class registrations and their object lifecycles.

## How It Works

1. **Register Classes**

    * All classes required by your application are registered in the `Context`.

2. **Initialize Context**

    * After registration, the `Context` scans its registry and instantiates the classes.
    * Dependencies are resolved by constructor.

3. **Retrieve Instances**

    * You can request fully-configured, ready-to-use objects from the `Context`.

## Getting Started

1. **Add Classes to the Context**

   ```java
   Context context = new Context();
   context.reg(Store.class);
   context.reg(ConsoleInput.class);
   context.reg(StartUI.class);
   // ... register other classes
   ```
2. **Fetch Objects**

   ```java
   StartUI ui = context.get(StartUI.class);
   ```
3. **Use Objects**

   ```java
   ui.add("Text");
   ui.print();
   ```

