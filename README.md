# Taller de Polimorfismo

Implementacion en Java del uso del polimorfismo con una jerarquía de figuras geométricas(Figure, Circle, Square, Triangle). Incluye pruebas unitarias con JUnit 5.

## Requisitos

- Java 17
- Maven 3.x

## Estructura

- `src/main/java` → código fuente.
- `src/test/java` → pruebas unitarias.

## Cómo ejecutar las pruebas

```bash
mvn test
```

## Cómo ejecutar el programa

```bash
mvn compile
mvn exec:java -Dexec.mainClass="edu.unicauca.practice.figures.Client"
```