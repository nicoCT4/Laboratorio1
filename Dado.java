//Creacion de dos Dados aleatorios utilizando la clase Random
import java.util.Random;
class Dado {
    private Random random;

    public Dado() {
        random = new Random();
    }

    public int lanzarDado() {
        return random.nextInt(6) + 1;
    }
}
