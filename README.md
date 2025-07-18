# 💱 Conversor de Monedas en Java

Este proyecto es un **conversor de monedas** desarrollado en Java. Forma parte del desafío final del programa **ONE - Oracle Next Education**. Permite convertir montos entre distintas monedas usando datos en tiempo real obtenidos desde la API [ExchangeRate-API](https://www.exchangerate-api.com/).

---

## 📁 Estructura del Proyecto

```
ConversorMonedas/
├── lib/
│   └── gson-2.13.1.jar               # Biblioteca Gson para parseo de JSON
├── src/
│   ├── ApiService.java               # Obtiene los datos de la API
│   ├── ConversionRegistro.java       # Registra el historial de conversiones
│   ├── ConversionService.java        # Lógica de conversión entre monedas
│   ├── ConversorMenu.java            # Muestra el menú interactivo
│   └── ConversorMonedas.java         # Clase principal (main)
```

---

## 🚀 Cómo Ejecutar

### 1. Cloná o descargá el proyecto
Asegurate de tener Java instalado (recomendado Java 17+).

### 2. Agregá tu API Key
En la clase `ConversorMonedas.java`, reemplazá `"TU_API_KEY"` con tu clave personal de ExchangeRate-API:

```java
String apiKey = "TU_API_KEY";
```

### 3. Compilá y ejecutá desde la terminal

**En Windows:**
```bash
javac -cp "lib/gson-2.13.1.jar" src/*.java
java -cp "lib/gson-2.13.1.jar;src" ConversorMonedas
```

**En macOS/Linux:**
```bash
javac -cp "lib/gson-2.13.1.jar" src/*.java
java -cp "lib/gson-2.13.1.jar:src" ConversorMonedas
```

---

## 💡 Funcionalidades

- ✅ Conversión de USD ↔ ARS, BRL, COP
- ✅ Visualización del menú con opciones
- ✅ Entrada por consola usando `Scanner`
- ✅ Validación de moneda y monto
- ✅ Registro del historial con marca de tiempo (`java.time`)
- ✅ Modularización del código

---

## 📷 Ejemplo del Menú

```text
**************************************************
Bienvenido/a al Conversor de Monedas

1. Dólar (USD) => Peso argentino (ARS)
2. Peso argentino(ARS) => Dólar(USD)
3. Dólar(USD) => Real brasileño (BRL)
4. Real brasileño(BRL) => Dólar(USD)
5. Dólar(USD) => Peso colombiano(COP)
6. Peso colombiano(COP) => Dólar (USD)
7. Ver historial de conversiones
8. Salir
**************************************************
Ingrese una opción:
```

---

## 🧠 Aprendizajes

- Uso del módulo `java.net.http.HttpClient`
- Análisis de respuestas JSON con `Gson`
- Organización por responsabilidades (SRP)
- Buenas prácticas en manejo de errores
- Registro de eventos con `LocalDateTime`

---

## 🔗 Créditos

Desarrollado por **Agustina Tereso**  
💼 Estudiante de Análisis de Sistemas  
📬 contacto: [agustere2008@gmail.com]

---

## 🏁 Licencia

Este proyecto está bajo licencia MIT. Podés usarlo, modificarlo y compartirlo libremente. 🚀
