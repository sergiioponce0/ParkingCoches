Simulación de Aparcamiento Concurrente en Java
Este proyecto implementa una simulación de un sistema de aparcamiento concurrente donde múltiples coches (hilos) compiten por un número limitado de plazas de estacionamiento.

📋 Descripción
El sistema simula el comportamiento de un aparcamiento con un número limitado de plazas donde los coches intentan entrar, permanecen aparcados durante un tiempo aleatorio y luego salen. La gestión del acceso concurrente se realiza mediante semáforos para garantizar la exclusión mutua y el correcto funcionamiento con múltiples hilos.

🏗️ Estructura del Proyecto
Archivos Principales
Aparcamiento_Coches.java - Clase que gestiona el aparcamiento usando semáforos

Coches.java - Clase que representa un coche como hilo concurrente

MainParking.java - Clase principal que inicia la simulación

🚀 Características
Gestión de concurrencia: Uso de Semaphore para controlar el acceso a las plazas

Sincronización: Bloqueos sincronizados para actualizar contadores compartidos

Comportamiento realista: Los coches permanecen aparcados tiempos aleatorios

Semáforo justo (FIFO): Garantiza que los coches se atienden en orden de llegada

Manejo de interrupciones: Gestión adecuada de excepciones InterruptedException

⚙️ Configuración
Parámetros Modificables
En MainParking.java puedes configurar:

java
private static final int NUM_PLAZAS = 3;    // Número total de plazas
private static final int NUM_COCHES = 7;    // Número total de coches
Tiempos de Aparcamiento
En Coches.java se define el tiempo que permanecen los coches:

java
int tiempoAparcado = 1000 + random.nextInt(3000); // 1000-4000 ms
🎯 Funcionamiento
Flujo de Ejecución
Inicialización: Se crea el aparcamiento con un número fijo de plazas

Creación de coches: Se instancian múltiples hilos de coches

Entrada al aparcamiento:

Los coches intentan adquirir un permiso del semáforo

Si hay plazas disponibles, entran inmediatamente

Si no hay plazas, esperan en cola (FIFO)

Estancia: Los coches permanecen aparcados un tiempo aleatorio

Salida: Liberan su plaza para que otros coches puedan entrar
