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

        if(category == YatzyCategory.PAIR){ //Trenger hjelp
            int[] frequencies = new int[7];
            for (int die : dice) {
                frequencies[die]++;
            }

            for(int value = frequencies.length - 1; value >= 0; value--){
                if(frequencies[value] == 2){
                    return value * 2;
                }
            }

        }
        return result;
    }
}
