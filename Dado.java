//Creacion de dos Dados aleatorios
import java.util.Random;
public class Dado{
    int NumDado;
    public Dado(int NumDado){
        this.NumDado = NumDado;
    }
    public int getNumDado(){
        return this.NumDado;
    }
    public void setNumDado(int NumDado){
        this.NumDado = NumDado;
    }
    public int LanzarDado(){
        Random rand = new Random();
        int NumDado = rand.nextInt(6)+1;
        return NumDado;
    }
    
}
