# 🚗 Simulación de Aparcamiento Concurrente en Java 🅿️

## 📖 Descripción

Este proyecto implementa una **simulación completa de un sistema de aparcamiento concurrente** donde múltiples vehículos (representados como hilos) compiten por un número limitado de plazas de estacionamiento. El sistema utiliza **semáforos y sincronización** para gestionar el acceso seguro a recursos compartidos.

---

## 🏗️ Arquitectura del Sistema

### 📁 Estructura de Archivos

| Archivo | Descripción |
|---------|-------------|
| **`Aparcamiento_Coches.java`** | 🏢 Gestiona el aparcamiento usando semáforos |
| **`Coches.java`** | 🚗 Representa un coche como hilo concurrente |
| **`MainParking.java`** | 🎮 Clase principal que inicia la simulación |

---

## ⚡ Características Principales

### 🛡️ Gestión de Concurrencia
- **Semáforos justos (FIFO)** para acceso equitativo
- **Sincronización** de contadores compartidos
- **Manejo robusto de interrupciones**

### 🎯 Comportamiento Realista
- Tiempos de aparcamiento aleatorios
- Entrada/salida ordenada de vehículos
- Visualización en tiempo real del estado

### 🔧 Configuración Flexible
```java
private static final int NUM_PLAZAS = 3;    // 🅿️ Número de plazas
private static final int NUM_COCHES = 7;    // 🚗 Número de coches
