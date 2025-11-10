import java.util.concurrent.Semaphore;

//Clase que representa el Aparcamiento_Coches y gestiona el acceso concurrente a las plazas mediante un semáforo.

public class Aparcamiento_Coches {
    private final Semaphore semaphore;
    private int plazasOcupadas;

    //Constructor que inicializa el semáforo con el número de plazas disponibles

    public Aparcamiento_Coches(int numPlazas) {
        this.semaphore = new Semaphore(numPlazas, true); // Semáforo justo (FIFO)
        this.plazasOcupadas = 0;
    }

    //Metodo para que un coche entre en el Aparcamiento_Coches

    public void entrar(String nombreCoche) throws InterruptedException {
        System.out.println(nombreCoche + " está intentando entrar...");

        // Adquirir un permiso (bloqueante si no hay plazas disponibles)
        semaphore.acquire();

        // Actualizar contador de plazas ocupadas
        synchronized(this) {
            plazasOcupadas++;
            System.out.println(nombreCoche + " ha entrado. Plazas ocupadas: " + plazasOcupadas);
        }
    }

//Metodo para que un coche salga del Aparcamiento_Coches

    public void salir(String nombreCoche) {
        // Liberar el permiso
        semaphore.release();

        // Actualizar contador de plazas ocupadas
        synchronized(this) {
            plazasOcupadas--;
            System.out.println(nombreCoche + " ha salido. Plazas ocupadas: " + plazasOcupadas);
        }
    }


    //Obtiene el número actual de plazas ocupadas

    public synchronized int getPlazasOcupadas() {
        return plazasOcupadas;
    }
}