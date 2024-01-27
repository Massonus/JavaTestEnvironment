package org.test.lesson9.p2;

public class TwoDimensional {
    public static void main(String[] args) {
//        int[][] numbers = new int[4][5];

//        int[][] numbers;
//        numbers = new int[4][5];

        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                numbers[i][j] = i + j;
//            }
//        }


        char[] cards = {'A', 'K', 'Q', 'J', 'T', '9', '8', '7', '6', '5', '4', '3', '2'};
        char[] suit = {'s', 'o'};

        String[][] allCardsCombination = new String[13][13];

        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                for (int k = 0; k < suit.length; k++) {
                    if (i == j) {
                        allCardsCombination[i][j] = " " + cards[i] + cards[i];
                    } else if (i > j){
                        allCardsCombination[i][j] = " " + cards[j] + cards[i] + suit[k];
                    }else {
                        allCardsCombination[i][j] = " " + cards[i] + cards[j] + suit[k];
                    }
                }
            }
        }
//
//        for (int i = 0; i < allCardsCombination.length; i++) {
//            for (int j = 0; j < allCardsCombination[i].length; j++) {
//                System.out.print(allCardsCombination[i][j]);
//            }
//            System.out.println();
//        }
    }
}
