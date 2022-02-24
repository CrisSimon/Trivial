
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void true_is_true() {
        Assertions.assertTrue(true);
    }

    @Test
    public void crear_Game() {
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1() {
        Game sut = new Game();
        sut.agregar("Maria");
        sut.agregar("Juan");

        sut.tirarDado(1);

        String expected = "La nueva posición de Maria es 1";

        String actual = sut.nuevaPosicionJugador();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void con_1_jugador_no_hay_partida() {

        Game game = new Game();
        game.agregar("Maria");

        boolean actual = game.esJugable();

        Assertions.assertFalse(actual);


    }
}
