package no.kristiania.yatzy;

import java.util.Arrays;

public class YatzyGame {

    public int score(YatzyCategory category, int[] dice) {
        int result = 0;

        int[] frequencies = new int[7];
        for (int die : dice) {
            frequencies[die]++;
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
            int temp;
            int[] smallStraight = {1,2,3,4,5};
            for (int i = 0; i < dice.length ; i++) {
                for (int j = i + 1; j < dice.length ; j++) {
                    if(dice[i] > dice[j]){
                        temp = dice[i];
                        dice[i] = dice[j];
                        dice[j] = temp;
                    }
                }
            }

            if(Arrays.equals(dice,smallStraight)){
                return 15;
            }
        }

        if(category == YatzyCategory.ONES){
            return frequencies[1];
        }

        if(category == YatzyCategory.TWOS ){
            return frequencies[2] * 2;
        }

        return result;
    }
}
