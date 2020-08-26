package no.kristiania.yatzy;

public class YatzyGame {

    public int score(YatzyCategory category, int[] dice) {
        int result = 0;
        for (int die : dice) {
            if(die == 1 && category == YatzyCategory.ONES){
                result += die;
            }else if(die == 2 && category == YatzyCategory.TWOS ){
                result += die;
            }
        }
        return result;
    }
}
