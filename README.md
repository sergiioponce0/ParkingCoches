# 🚗 Simulación de Aparcamiento Concurrente en Java 🅿️

## 📖 Descripción Completa

Este proyecto implementa una **simulación avanzada de un sistema de aparcamiento concurrente** donde múltiples vehículos (representados como hilos independientes) compiten por un número limitado de plazas de estacionamiento. El sistema utiliza **semáforos, sincronización y mecanismos de concurrencia** de Java para gestionar el acceso seguro a recursos compartidos, demostrando principios fundamentales de programación concurrente.

El modelo simula escenarios del mundo real donde recursos limitados deben ser compartidos entre múltiples entidades concurrentes, garantizando la exclusión mutua, la equidad en el acceso y la prevención de condiciones de carrera.

---

## 🎯 Objetivos del Proyecto

### 🎓 Objetivos Educativos
- Demostrar el uso práctico de **semáforos** en Java
- Implementar **sincronización** entre hilos concurrentes
- Gestionar **recursos compartidos** de forma segura
- Prevenir **condiciones de carrera** y **interbloqueos**
- Practicar el **manejo de excepciones** en entornos concurrentes

### 🔧 Objetivos Técnicos
- Crear un sistema **escalable** y **configurable**
- Implementar **patrones de diseño** concurrentes
- Garantizar **equidad** en el acceso a recursos
- Proporcionar **feedback visual** en tiempo real

---

## 🏗️ Arquitectura del Sistema

### 📁 Estructura de Archivos del Proyecto

| Archivo | Descripción | Responsabilidades |
|---------|-------------|-------------------|
| **`Aparcamiento_Coches.java`** | 🏢 Controlador principal del aparcamiento | Gestión de semáforos, control de acceso, sincronización |
| **`Coches.java`** | 🚗 Entidad vehículo como hilo concurrente | Comportamiento individual, tiempos de estancia, ciclo de vida |
| **`MainParking.java`** | 🎮 Punto de entrada de la aplicación | Configuración, inicialización, coordinación general |

### 🔄 Diagrama de Flujo del Sistema
