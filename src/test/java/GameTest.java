package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {

    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void shouldWinPlayer1Test() {
        Player player1 = new Player(1, "Добрыня Никитич", 100);
        Player player2 = new Player(2, "Илья Муромец", 50);
        game.register(player1);
        game.register(player2);

        int result = game.round("Добрыня Никитич", "Илья Муромец");
        Assertions.assertEquals(1, result);
    }

    @Test
    void shouldWinPlayer2Test() {
        Player player1 = new Player(1, "Добрыня Никитич", 50);
        Player player2 = new Player(2, "Илья Муромец", 100);
        game.register(player1);
        game.register(player2);

        int result = game.round("Добрыня Никитич", "Илья Муромец");
        Assertions.assertEquals(2, result);

    }

    @Test
    void shouldBeDrawTest(){
        Player player1 = new Player(1, "Добрыня Никитич", 50);
        Player player2 = new Player(2, "Илья Муромец", 50);
        game.register(player1);
        game.register(player2);

        int result = game.round("Добрыня Никитич", "Илья Муромец");

        Assertions.assertEquals(0,result);
    }
    @Test
    void gameWithNotRegisterPlayer1Test(){
        Player player1 = new Player(1, "Добрыня Никитич", 50);
        game.register(player1);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Добрыня Никитич", "Илья Муромец"));
    }
    @Test
    void gameWithNotRegisterPlayer2Test(){
        Player player2 = new Player(2, "Илья Муромец", 50);
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Добрыня Никитич", "Илья Муромец"));
    }

    @Test
    void gameBothNotRegisterPlayersTest(){
        Player player1 = new Player(1, "Добрыня Никитич", 50);
        Player player2 = new Player(2, "Илья Муромец", 50);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Добрыня Никитич", "Илья Муромец"));
    }
}