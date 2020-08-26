package no.kristiania.yatzy;

public class YatzyGame {

    public int score(YatzyCatagory ones, int[] dice) {
        int result = 0;
        for (int die : dice) {
            if(die == 1){
                result += 1;
            }
        }
        return result;
    }
}
