//Creacion de dos Dados aleatorios
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
