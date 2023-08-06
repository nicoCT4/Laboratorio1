
//Universidad Del Valle de Guatemala
//Nicolás Concuá
//Seccion 10
//carnet:23197
//Fecha de entrega: 04/08/2023
//Juego PIG con 2 jugadores, si obtiene más de 100 puntos ganas
//Si obtiene 1 en alguno de los dados, pierde todos los puntos acumulados y le toca al jugador 2
//Si obtiene más de 20 puntos en la ronda no tienes opcion de seguir jugando y le toca al jugador 2
//Mientras el jugador este jugando y tirando, enseñar los puntos de la ronda
//

import java.util.Scanner;

public class Pig {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Jugador 1", 0, 0);
        Jugador jugador2 = new Jugador("Jugador 2", 0, 0);
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        Scanner scanner = new Scanner(System.in);

        Jugador jugadorActual = jugador1;

        while (true) {
            System.out.println("Turno de " + jugadorActual.getNombre());

            int puntosRonda = 0;
            boolean turnoActivo = true;

            while (turnoActivo) {
                int numDado1 = dado1.lanzarDado();
                int numDado2 = dado2.lanzarDado();

                System.out.println("Dado 1: " + numDado1);
                System.out.println("Dado 2: " + numDado2);

                if (numDado1 == 1 || numDado2 == 1) {
                    System.out.println("Obtuviste un 1. Puntos de la ronda perdidos.");
                    puntosRonda = 0;
                    turnoActivo = false;
                } else {
                    puntosRonda += numDado1 + numDado2;
                    System.out.println("Puntos de la ronda: " + puntosRonda);
                    System.out.println("Puntos totales: " + jugadorActual.getPuntosTotales());
                    System.out.println("¿Deseas seguir jugando? 1 = sí, 0 = no");
                    int respuesta = scanner.nextInt();
                    if (respuesta == 0) {
                        jugadorActual.setPuntosTotales(jugadorActual.getPuntosTotales() + puntosRonda);
                        turnoActivo = false;
                    }
                }
            }

            if (jugadorActual.getPuntosTotales() >= 100) {
                System.out.println(jugadorActual.getNombre() + " ha ganado con " + jugadorActual.getPuntosTotales() + " puntos!");
                break;
            }

            // Cambio de jugador
            jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1;
        }

        scanner.close();
    }
    }



