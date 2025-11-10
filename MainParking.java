


//Clase principal que inicia la simulación del aparcamiento concurrente
//Crea el aparcamiento y lanza múltiples hilos de coches

public class MainParking {
    // Constantes de configuración
    private static final int NUM_PLAZAS = 3;
    private static final int NUM_COCHES = 7;

    //Metodo principal que inicia la aplicación

    public static void main(String[] args) {
        System.out.println("SIMULACIÓN DE APARCAMIENTO");
        System.out.println("Configuración: " + NUM_PLAZAS + " plazas, " + NUM_COCHES + " coches");
        System.out.println("=============================================\n");

        // Crear el aparcamiento compartido
        Aparcamiento_Coches aparcamiento = new Aparcamiento_Coches(NUM_PLAZAS);

        // Crear y lanzar los hilos de los coches
        Thread[] hilosCoches = new Thread[NUM_COCHES];

        for (int i = 0; i < NUM_COCHES; i++) {
            String nombreCoche = "Coche-" + (i + 1);
            Coches coche = new Coches(aparcamiento, nombreCoche);
            hilosCoches[i] = new Thread(coche, nombreCoche);
            hilosCoches[i].start();
        }

        // Esperar a que todos los hilos terminen
        for (Thread hilo : hilosCoches) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                System.out.println("El hilo principal fue interrumpido");
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Todos los coches han terminado de usar el aparcamiento");
    }
}