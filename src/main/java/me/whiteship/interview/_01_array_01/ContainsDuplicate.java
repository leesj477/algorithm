package me.whiteship.interview._01_array_01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.solution3(new int[]{1, 2, 3, 4, 5}));
    }

    /**
     *
     * 배열은 조회가 O(1) , 추가및 삭제가 O(n) 조회는 빠르고 추가 및 삭제는 느리다.
     * 자바에서는 배열을 만들 때 크기를 정해야 하고, 추가 및 삭제 기능이 없다.
     * 가장 기본적인 데이터 구조다.
     *
     *
     * TODO 숫자로 구성된 배열이 주어졌을 때 그 배열에 중복된 숫자가 있는지 확인하는 함수를 작성하라. 중복된 숫자가 있다면 true 없다면 false.
     *  예) 1 2 3 4 5 6 => false
     *  예) 1 1 2 2 3 1 => true
     */


    private boolean solution3(int[] numbers) {

        //trade off  공간복잡도를 좀 크게 하더라도, 시간복잡도를 줄일 수 있음 (반대도 마찬가지 개념)

       Set<Integer> numberSet = new HashSet<>();
       for(int num : numbers){
           if(numberSet.contains(num)){ // contains 조회 : O(1)
               return true;
           } else {
               numberSet.add(num);
           }
       }
        return false;
    }

    private boolean solution2(int[] numbers) {

        // solution1은 시간이 매우 걸림, for loop이 2번.
        // 정렬 후 찾는게 더 빠름
        Arrays.sort(numbers); // Quick Sort  -> 시간복잡도 : O(NlogN)  공간복잡도 : O(logN)

        for(int i=0; i< numbers.length -1  ; i++){
            if(numbers[i] == numbers[i+1]){
                return true;
            }
        }
        return false;
    }

    private boolean solution1(int[] numbers) {

        //1.
        // 주어진 배열이 정렬되어 있는지 확인
        // 중복된 숫자가 2개 이상일 수 있는지 확인

        //가장 단순한 방법
        //시간복잡도 : O(n²)
        //공간복잡도 : O(1)
        for(int i=0; i< numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }




}
