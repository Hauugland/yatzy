package no.kristiania.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    private final YatzyGame yatzyGame = new YatzyGame();

    @Test
    void shouldScoreOnes(){
        assertEquals(4, yatzyGame.score(YatzyCategory.ONES, new int[] {1, 1, 2, 1, 1}));
        assertEquals(2, yatzyGame.score(YatzyCategory.ONES, new int[] {6, 5, 2, 1, 1}));
    }

    @Test
    void shouldScoreTwos(){
        assertEquals(4, yatzyGame.score(YatzyCategory.TWOS, new int[] {1, 1, 2, 2, 1}));
        assertEquals(2, yatzyGame.score(YatzyCategory.TWOS, new int[] {6, 5, 2, 1, 1}));
    }

    @Test
    void shouldScoreThrees(){
        assertEquals(6, yatzyGame.score(YatzyCategory.THREES, new int[] {3, 4, 3, 6, 1}));
        assertEquals(9, yatzyGame.score(YatzyCategory.THREES, new int[] {6, 3, 1, 3, 3}));
    }

    @Test
    void shouldScoreFours(){
        assertEquals(8, yatzyGame.score(YatzyCategory.FOURS, new int[] {3, 4, 3, 4, 1}));
        assertEquals(16, yatzyGame.score(YatzyCategory.FOURS, new int[] {4, 4, 1, 4, 4}));
    }

    @Test
    void shouldScoreFives(){
        assertEquals(10, yatzyGame.score(YatzyCategory.FIVES, new int[] {3, 5, 5, 4, 1}));
        assertEquals(5, yatzyGame.score(YatzyCategory.FIVES, new int[] {4, 5, 1, 4, 4}));
    }

    @Test
    void shouldScoreSixes(){
        assertEquals(18, yatzyGame.score(YatzyCategory.SIXES, new int[] {3, 6, 6, 6, 1}));
        assertEquals(6, yatzyGame.score(YatzyCategory.SIXES, new int[] {4, 6, 1, 4, 4}));
    }

    @Test
    void shouldScorePair(){
        assertEquals(10, yatzyGame.score(YatzyCategory.PAIR, new int[] {1, 3, 5, 5, 2}));
        assertEquals(12, yatzyGame.score(YatzyCategory.PAIR, new int[] {1, 3, 6, 6, 2}));
        assertEquals(12, yatzyGame.score(YatzyCategory.PAIR, new int[] {5, 5, 6, 6, 2}));
    }

    @Test
    void shouldScoreTwoPairs(){
        assertEquals(14, yatzyGame.score(YatzyCategory.TWO_PAIRS, new int[] {1, 1, 6, 6, 2}));
        assertEquals(22, yatzyGame.score(YatzyCategory.TWO_PAIRS, new int[] {5, 5, 6, 6, 2}));
    }

    @Test
    void shouldScoreThreeOfAKind(){
        assertEquals(12, yatzyGame.score(YatzyCategory.THREE_OF_A_KIND, new int[] {4, 4, 6, 4, 2}));
        assertEquals(18, yatzyGame.score(YatzyCategory.THREE_OF_A_KIND, new int[] {4, 6, 6, 4, 6}));
    }

    @Test
    void shouldScoreFourOfAKind(){
        assertEquals(12, yatzyGame.score(YatzyCategory.FOUR_OF_A_KIND, new int[] {3, 3, 6, 3, 3}));
        assertEquals(20, yatzyGame.score(YatzyCategory.FOUR_OF_A_KIND, new int[] {5, 5, 6, 5, 5}));
    }

    @Test
    void shouldScoreYatzy(){
        assertEquals(50, yatzyGame.score(YatzyCategory.YATZY, new int[] {6, 6, 6, 6, 6}));
        assertEquals(50, yatzyGame.score(YatzyCategory.YATZY, new int[] {1, 1, 1, 1, 1}));
    }

    @Test
    void shouldScoreSmallStraight(){
        assertEquals(15, yatzyGame.score(YatzyCategory.SMALL_STRAIGHT, new int[] {3, 5, 1, 4, 2}));
        assertEquals(15, yatzyGame.score(YatzyCategory.SMALL_STRAIGHT, new int[] {4, 3, 2, 5, 1}));
    }

    @Test
    void shouldScoreLargeStraight(){
        assertEquals(20, yatzyGame.score(YatzyCategory.LARGE_STRAIGHT, new int[] {3, 5, 6, 4, 2}));
        assertEquals(20, yatzyGame.score(YatzyCategory.LARGE_STRAIGHT, new int[] {4, 3, 2, 5, 6}));
    }

    @Test
    void shouldScoreFullHouse(){
        assertEquals(19, yatzyGame.score(YatzyCategory.FULL_HOUSE, new int[] {3, 5, 3, 3, 5}));
        assertEquals(18, yatzyGame.score(YatzyCategory.FULL_HOUSE, new int[] {6, 2, 2, 2, 6}));
    }

    @Test
    void shouldScoreChance(){
        assertEquals(20, yatzyGame.score(YatzyCategory.CHANCE, new int[] {4, 5, 3, 3, 5}));
        assertEquals(28, yatzyGame.score(YatzyCategory.CHANCE, new int[] {6, 4, 6, 6, 6}));
    }








}
