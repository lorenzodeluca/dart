# Dart Language Support (Xtext)

An integrated development environment (IDE) and Language Server Protocol (LSP) implementation for the **Dart** programming language, built using **Xtext**.

This project provides comprehensive tooling for parsing the full Dart grammar.

## Features

*   **Eclipse IDE Integration:** Full-featured editor support within Eclipse, including syntax highlighting, content assist, validation, and outline view (managed via Maven/m2e).
*   **Language Server Protocol (LSP) Support:** Pre-configured to generate a standalone Language Server (Fat Jar), enabling editor support in other modern IDEs like **VS Code**, Sublime Text, and Theia.
*   **Robust Parsing:** Implements the official Dart language specification grammar.
*   **Testing Infrastructure:** Includes generated boilerplate for unit and integration testing of the parser and validator.

## Getting Started

### Prerequisites

*   **Eclipse IDE:** Ensure you have an Eclipse installation that includes the **Xtext** and **m2e** (Maven integration) plugins installed. The "Eclipse IDE for Java and DSL Developers" package usually includes these by default.

### 1. Import the Project into Eclipse

1.  Clone this repository to your local machine.
2.  In Eclipse, go to `File` -> `Import...`.
3.  Select `Maven` -> `Existing Maven Projects`.
4.  Browse to the root directory of the cloned repository and select it.
5.  Click `Finish`. Eclipse will automatically configure the projects based on the `pom.xml` files.

### 2. Run and Test the Editor

To test the generated Dart editor within an isolated Eclipse runtime environment:

1.  In the Eclipse **Project Explorer**, right-click on the main language project (`it.lorenzodeluca.dart`).
2.  Select `Run As` -> `Eclipse Application`.
3.  A new instance of Eclipse will open. Create a new project within this runtime workbench and create a file with the extension defined in your grammar (e.g., `.dart`).
4.  The Xtext editor functionalities (syntax highlighting, validation) should now be active for your new file.

## Future Improvements

*   Advanced semantic validation and type checking.
*   Code generation capabilities.
*   Continuous integration setup for automated LSP builds.
