package me.whiteship.interview._01_array_03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumSolutions {

    public static void main(String[] args) {
        TwoSumSolutions twoSumSolutions = new TwoSumSolutions();
        System.out.println(Arrays.toString(twoSumSolutions.solution2(new int[]{2, 3, 4, 7}, 6)));
    }

    private int[] solution1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return null;
    }

    private int[] solution2(int[] numbers, int target) {
        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int numberToFind = target - numbers[i];
            if (numberMap.containsKey(numberToFind) && numberMap.get(numberToFind) != i) {
                return new int[] {i, numberMap.get(numberToFind)};
            }

            numberMap.put(numbers[i], i);
        }

        return null;
    }

    private int[] solution3(int[] numbers, int target) {
//        문제, 3SUM
//
//        숫자로 구성된 배열 numbers와 target 숫자 하나가 주어졌을 때 numbers 배열에 들어있는 수 세개를 더해서 target 숫자를 만들 수 있는 인덱스를 찾는 함수를 작성하라.
//
//        예) numbers = [2, 3, 5, 7] target = 10, 10을 만들 수 있는 2, 3, 5의 인덱스인 0, 1, 2를 배열로 리턴해야 한다.
//
        Map<Integer, Integer> numberMap = new HashMap<>();
        Map<Integer, Integer> numberMap2 = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            numberMap.put(numbers[i], i);
            numberMap2.put(numbers[i], i);
        }


        for (int i = 0; i < numbers.length; i++) {
            int numberToFind1 = target - numbers[i]; // 10 - 2  = 8
            numberMap.containsValue(target - numbers[i] - numberToFind1); // 10 - 2 - 8

            if (numberMap.containsKey(numberToFind1) && numberMap.get(numberToFind1) != i  ){
                return new int[] {i, numberMap.get(numberToFind1)};
            }

        }

        return null;
    }

}
