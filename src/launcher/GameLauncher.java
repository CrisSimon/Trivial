package launcher;


import smellytrivial.Game;

import java.util.Random;

public class GameLauncher {

    private static boolean Ganador;

    public static void main(String[] args) {
        Game juego = new Game();
        try {
            juego.agregar("Maria");
            juego.agregar("Juan");
            juego.agregar("Antonio");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("no puedes introducir mas de seis jugadores!! ");
        }

        if (juego.esJugable()) {

            Random rand = new Random();


            do {

                juego.tirarDado(rand.nextInt(5) + 1);

                if (rand.nextInt(9) == 7) {
                    Ganador = juego.respuestaIncorrecta();
                } else {
                    Ganador = juego.fueRespuestaCorrecta();
                }

            } while (!Ganador);
            System.out.println("El juego ha terminado!");
        }
    }
}