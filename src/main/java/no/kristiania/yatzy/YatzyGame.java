package no.kristiania.yatzy;

public class YatzyGame {

    public int score(YatzyCategory category, int[] dice) {
        int result = 0;

        int[] frequencies = new int[7];
        for (int die : dice) {
            frequencies[die]++;
        }

        if(category == YatzyCategory.ONES){
            return frequencies[1];
        }

        if(category == YatzyCategory.TWOS ){
            return frequencies[2] * 2;
        }

        if(category == YatzyCategory.THREES){
            return frequencies[3] * 3;
        }

        if(category == YatzyCategory.FOURS){
            return  frequencies[4] * 4;
        }

        if(category == YatzyCategory.FIVES){
            return  frequencies[5] * 5;
        }

        if(category == YatzyCategory.SIXES){
            return  frequencies[6] * 6;
        }

        if(category == YatzyCategory.PAIR){ //Trenger hjelp

            for(int value = frequencies.length - 1; value >= 0; value--){
                if(frequencies[value] == 2){
                    return value * 2;
                }
            }

        }

        if(category == YatzyCategory.TWO_PAIRS){ //Egenlaget

            for(int value = frequencies.length - 1; value >= 0; value--){
                if(frequencies[value] == 2){
                    result += value * 2;
                }
            }
        }

        if(category == YatzyCategory.THREE_OF_A_KIND){ //Trenger hjelp

            for(int value = frequencies.length - 1; value >= 0; value--){
                if(frequencies[value] == 3){
                    return value * 3;
                }
            }

        }

        if(category == YatzyCategory.FOUR_OF_A_KIND){

            for(int value = frequencies.length - 1; value >= 0; value--){
                if(frequencies[value] == 4){
                    return value * 4;
                }
            }

        }

        if(category == YatzyCategory.YATZY){

            for(int value = frequencies.length - 1; value >= 0; value--){
                if(frequencies[value] == 5){
                    return 50;
                }
            }
        }

        if(category == YatzyCategory.SMALL_STRAIGHT){

            if(frequencies[1] >= 1 && frequencies[2] >= 1 && frequencies[3] >= 1 && frequencies[4] >= 1 && frequencies[5] >= 1){
                return 15;
            }
        }

        if(category == YatzyCategory.LARGE_STRAIGHT){
            if(frequencies[2] >= 1 && frequencies[3] >= 1 && frequencies[4] >= 1 && frequencies[5] >= 1 && frequencies[6] >= 1){
                return 20;
            }
        }

        if(category == YatzyCategory.FULL_HOUSE){

            for(int value = frequencies.length - 1; value >= 0; value--){
                if(frequencies[value] == 3){
                    result += value * 3;
                }
            }
            for(int value = frequencies.length - 1; value >= 0; value--){
                if(frequencies[value] == 2){
                    result += value * 2;
                }
            }
        }

        if(category == YatzyCategory.CHANCE){
            for (int die : dice) {
                result += die;
            }
        }



        return result;
    }
}
