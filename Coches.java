
import java.util.Random;


 //Clase que representa un coche como hilo concurrente
 //Implementa Runnable para poder ejecutarse en un hilo independiente

public class Coches implements Runnable {
    private final Aparcamiento_Coches aparcamiento;
    private final String nombre;
    private final Random random;

    //Constructor de la clase Coche

    public Coches(Aparcamiento_Coches aparcamiento, String nombre) {
        this.aparcamiento = aparcamiento;
        this.nombre = nombre;
        this.random = new Random();
    }

    //Secuencia: entrar -> aparcar (tiempo aleatorio) -> salir

    @Override
    public void run() {
        try {
            // Intentar entrar al aparcamiento
            aparcamiento.entrar(nombre);

            // Simular tiempo de aparcamiento (1-4 segundos)
            int tiempoAparcado = 1000 + random.nextInt(3000); // 1000-4000 ms
            Thread.sleep(tiempoAparcado);

            // Salir del aparcamiento
            aparcamiento.salir(nombre);

        } catch (InterruptedException e) {
            System.out.println(nombre + " fue interrumpido durante su ejecución");
            Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
        }
    }

    public String getNombre() {
        return nombre;
    }
}