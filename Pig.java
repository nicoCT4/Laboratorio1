//Universidad Del Valle de Guatemala
//Nicolás Concuá
//Seccion 10
//carnet:23197
//Fecha de entrega: 04/08/2023
//Juego PIG con 2 jugadores, si obtiene más de 100 puntos gana
//Si obtiene 1 en alguno de los dados, pierde todos los puntos acumulados
//Si obtiene más de 20 puntos en la ronda, le toca al siguiente jugador
//Si obtiene 2 veces 1 en la ronda, pierde todos los puntos acumulados
//Mientras el jugador este jugando y tirando, enseñar los puntos de la ronda
import java.util.Random;

public class Pig{
    public static void main (String[]args){
        //Creacion de los jugadores
    Jugador Jugador1 = new Jugador("Jugador 1",0,0);
    Jugador Jugador2 = new Jugador("Jugador 2",0,0);
    //Creacion de los dados
    Dado Dado1 = new Dado(0);
    Dado Dado2 = new Dado(0);
    //Creacion de la variable que determina el turno
    int Turno = 1;
    //Creacion de la variable que determina el ganador
    int Ganador = 0;
    //Creacion de la variable que determina si el jugador quiere seguir jugando
    int Seguir = 1;
    //Creacion de la variable que determina si el jugador quiere seguir jugando
    int Seguir2 = 1;
    //Empieza el juego
    System.out.println("Bienvenido al juego PIG");
    System.out.println("El juego consiste en lanzar dos dados y sumar los puntos obtenidos");
    System.out.println("Si obtiene 1 en alguno de los dados, pierde los puntos de la ronda");
    System.out.println("Si obtiene 2 veces 1 en la ronda, pierde todos los puntos acumulados");
    System.out.println("Si obtiene más de 20 puntos en la ronda, puede elegir si seguir jugando o no");
    System.out.println("Si obtiene más de 100 puntos, gana");
    System.out.println("El jugador 1 empieza");
    //Empieza el juego
    while (Ganador == 0){
        //Empieza el turno del jugador 1
        if (Turno == 1){
            //Empieza la ronda del jugador 1
            while (Seguir == 1){
                //Lanza los dados
                Dado1.setNumDado(Dado1.LanzarDado());
                Dado2.setNumDado(Dado2.LanzarDado());
                //Si obtiene 1 en alguno de los dados, pierde los puntos de la ronda
                if (Dado1.getNumDado() == 1 || Dado2.getNumDado() == 1){
                    Jugador1.PuntosRonda = 0;
                    System.out.println("El jugador 1 obtuvo 1 en alguno de los dados, pierde los puntos de la ronda");
                    System.out.println("El jugador 1 tiene " + Jugador1.PuntosTotales + " puntos totales");
                    System.out.println("El jugador 1 tiene " + Jugador1.PuntosRonda + " puntos en la ronda");
                    Seguir = 0;
                }
                //Si obtiene 2 veces 1 en la ronda, pierde todos los puntos acumulados
                else if (Dado1.getNumDado() == 1 && Dado2.getNumDado() == 1){
                    Jugador1.PuntosTotales = 0;
                    Jugador1.PuntosRonda = 0;
                    System.out.println("El jugador 1 obtuvo 1 en ambos dados, pierde todos los puntos acumulados");
                    System.out.println("El jugador 1 tiene " + Jugador1.PuntosTotales + " puntos totales");
                    System.out.println("El jugador 1 tiene " + Jugador1.PuntosRonda + " puntos en la ronda");
                    Seguir = 0;
                }
                //Si obtiene más de 20 puntos en la ronda, le toca al siguiente jugador
                else if (Jugador1.PuntosRonda > 20){
                    System.out.println("El jugador 1 obtuvo más de 20 puntos, le toca al siguiente jugador");
                    System.out.println("El jugador 1 tiene " + Jugador1.PuntosTotales + " puntos totales");
                    System.out.println("El jugador 1 tiene " + Jugador1.PuntosRonda + " puntos en la ronda");
                    Seguir = 0;
                }
                //Si no obtiene 1 en ninguno de los dados, suma los puntos obtenidos
                else{
                    Jugador1.PuntosRonda = Jugador1.PuntosRonda + Dado1.getNumDado() + Dado2.getNumDado();
                    System.out.println("El jugador 1 obtuvo " + Dado1.getNumDado() + " y " + Dado2.getNumDado() + " en los dados");
                    System.out.println("El jugador 1 tiene " + Jugador1.PuntosTotales + " puntos totales");
                    System.out.println("El jugador 1 tiene " + Jugador1.PuntosRonda + " puntos en la ronda");
                    System.out.println("¿Desea seguir jugando? 1 = si, 0 = no");
                    Seguir = Integer.parseInt(System.console().readLine());
    };
    
                }
            }
        }
    }
}

