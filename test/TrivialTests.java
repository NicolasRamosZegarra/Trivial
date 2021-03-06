import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {

    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1(){
        //Arrange
        Game sut = new Game();
        sut.agregar("Maria");
        sut.agregar("Juan");

        sut.tirarDado(1);

        String expected = "La nueva posicion de Maria es 1";

        //Act
        String actual = sut.nuevaPosicionJugador();

        //Assert
        Assertions.assertEquals(expected,actual);
    }

    //Test Problema 1
    @Test
    public void hay_menos_de_2_jugadores_en_la_partida(){
        //Arrange
        Game player = new Game();
        player.agregar("Lola");

        //Assert
        Assertions.assertFalse(player.esJugable());
    }

    @Test
    public void hay_mas_de_2_jugadores_en_la_partida(){
        //Arrange
        Game player = new Game();
        player.agregar("Elena");
        player.agregar("Ana");
        player.agregar("Alba");
        player.agregar("Pedro");

        //Assert
        Assertions.assertTrue(player.esJugable());
    }

    //Test Problema 2
    @Test
    public void hay_mas_de_6_jugadores_en_la_partida(){
        //Arrange
        Game player= new Game();
        try {
            player.agregar("Josefa");
            player.agregar("Pilar");
            player.agregar("Elmo");
            player.agregar("Greg");
            player.agregar("Tomas");
            player.agregar("Aihnoa");
            player.agregar("Maria");
            player.agregar("Paco");
        } catch (ArrayIndexOutOfBoundsException e) {
            //Assert
            Assertions.assertFalse(player.esJugable());
        }
    }

    @Test
    public void hay_menos_o_igual_de_6_jugadores_en_la_partida(){
        //Arrange
        Game player= new Game();
        try {
            player.agregar("Josefa");
            player.agregar("Pilar");
            player.agregar("Elmo");
            player.agregar("Greg");
            player.agregar("Tomas");

        } catch (ArrayIndexOutOfBoundsException e) {
            //Assert
            Assertions.assertTrue(player.esJugable());
        }
    }

    //Test problema 3
    @Test
    public void un_jugador_se_queda_atrapado_en_la_carcel(){
        //Arrange
        Game player = new Game();

        //Act
        player.agregar("Paca");
        player.agregar("Matilde");

        player.respuestaIncorrecta();
        player.tirarDado(2);

        player.respuestaIncorrecta();
        player.tirarDado(3);

        player.nuevaPosicionJugador();

        player.fueRespuestaCorrecta();
    }


    @Test
    public void true_is_true(){
        Assertions.assertTrue(false);
    }

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }
}
