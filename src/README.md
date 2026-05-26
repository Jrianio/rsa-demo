# 🔐 RSA Demo - Cifrado Asimétrico en Java

Este proyecto implementa un ejemplo práctico del algoritmo RSA, utilizado en criptografía de clave pública para garantizar la seguridad en la transmisión de información.

---

## 🧠 Descripción

El sistema genera un par de claves (pública y privada), cifra un mensaje utilizando la clave pública y posteriormente lo descifra con la clave privada.

Este proceso demuestra cómo funciona el cifrado asimétrico en un entorno real de desarrollo.

---

## ⚙️ Tecnologías utilizadas

- Java 17
- IntelliJ IDEA
- Maven

---

## 🔄 Flujo del sistema

```mermaid
flowchart TD
    A[Inicio] --> B[Generar claves RSA]
    B --> C[Clave pública]
    B --> D[Clave privada]
    
    C --> E[Cifrar mensaje]
    E --> F[Mensaje cifrado]
    
    F --> G[Descifrar mensaje]
    D --> G
    
    G --> H[Mensaje original recuperado]
    H --> I[Fin]