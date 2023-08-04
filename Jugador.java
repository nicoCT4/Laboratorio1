//Creacion del jugador
public class Jugador{
    String QuienEres;
    int PuntosTotales;
    int PuntosRonda;

    public Jugador(String QuienEres, int PuntosTotales, int PuntosRonda){
        this.QuienEres = QuienEres;
        this.PuntosTotales = PuntosTotales;
        this.PuntosRonda = PuntosRonda;
    }
    
    public int getPuntosTotales(){
        return this.PuntosTotales;
    }
    public int getPuntosRonda(){
        return this.PuntosRonda;
    }
}
