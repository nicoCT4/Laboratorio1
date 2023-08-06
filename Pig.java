
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
        // Creacion de los jugadores, dados y variables
        Jugador jugador1 = new Jugador("Jugador 1", 0, 0);
        Jugador jugador2 = new Jugador("Jugador 2", 0, 0);
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        int juego = 1;
        Scanner scanner = new Scanner(System.in);
        Jugador jugadorActual = jugador1;

        // Inicio del juego
        while (juego == 1) {
            if (jugadorActual.getPuntosTotales() < 100) {
                System.out.println("Turno de " + jugadorActual.getNombre());

                int numDado1 = dado1.lanzarDado();
                int numDado2 = dado2.lanzarDado();

                System.out.println("Dado 1: " + numDado1);
                System.out.println("Dado 2: " + numDado2);

                // Si obtiene 1 en alguno de los dados, pierde todos los puntos acumulados y le toca al jugador 2
                if (numDado1 == 1 || numDado2 == 1) {
                    System.out.println("Perdiste todos tus puntos en esta ronda");
                    jugadorActual.setPuntosRonda(0);
                    jugadorActual.setPuntosTotales(0); // Resetear puntos totales
                    if (jugadorActual == jugador1) {
                        jugadorActual = jugador2;
                    } else {
                        jugadorActual = jugador1;
                    } // Cambio de jugador
                } else {
                    jugadorActual.setPuntosRonda(jugadorActual.getPuntosRonda() + numDado1 + numDado2);
                    System.out.println("Puntos de la ronda: " + jugadorActual.getPuntosRonda());
                    System.out.println("Puntos totales: " + jugadorActual.getPuntosTotales());
                    System.out.println("¿Desea seguir jugando? 1 = sí, 0 = no");

                    int respuesta = scanner.nextInt();
                    if (respuesta == 0) {
                        jugadorActual.setPuntosTotales(jugadorActual.getPuntosTotales() + jugadorActual.getPuntosRonda());
                        jugadorActual.setPuntosRonda(0);
                        jugadorActual = (jugadorActual == jugador1) ? jugador2 : jugador1; // Cambio de jugador
                    } else {
                        if (jugadorActual.getPuntosRonda() >= 20) {
                            System.out.println("Obtuviste más de 20 puntos en esta ronda, le toca al siguiente jugador");
                            jugadorActual.setPuntosTotales(jugadorActual.getPuntosTotales() + jugadorActual.getPuntosRonda());
                            jugadorActual.setPuntosRonda(0);
                            if (jugadorActual == jugador1) {
                                jugadorActual = jugador2;
                            } else {
                                jugadorActual = jugador1;
                            } // Cambio de jugador
                        }
                    }
                }
            }

            if (jugador1.getPuntosTotales() >= 100 || jugador2.getPuntosTotales() >= 100) {
                juego = 0; // Salir del bucle
                System.out.println("Juego terminado"+ "\n" + "Puntos de " + jugador1.getNombre() + ": " + jugador1.getPuntosTotales() + "\n" + "Puntos de " + jugador2.getNombre() + ": " + jugador2.getPuntosTotales());
            }
        }

        scanner.close();
    }
}



