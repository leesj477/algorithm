package me.seungjun;

import java.util.Locale;

/**
 orders 배열의 크기는 2 이상 20 이하입니다.
 orders 배열의 각 원소는 크기가 2 이상 10 이하인 문자열입니다.
 각 문자열은 알파벳 대문자로만 이루어져 있습니다.
 각 문자열에는 같은 알파벳이 중복해서 들어있지 않습니다.
 course 배열의 크기는 1 이상 10 이하입니다.
 course 배열의 각 원소는 2 이상 10 이하인 자연수가 오름차순으로 정렬되어 있습니다.
 course 배열에는 같은 값이 중복해서 들어있지 않습니다.
 정답은 각 코스요리 메뉴의 구성을 문자열 형식으로 배열에 담아 사전 순으로 오름차순 정렬해서 return 해주세요.
 배열의 각 원소에 저장된 문자열 또한 알파벳 오름차순으로 정렬되어야 합니다.
 만약 가장 많이 함께 주문된 메뉴 구성이 여러 개라면, 모두 배열에 담아 return 하면 됩니다.
 orders와 course 매개변수는 return 하는 배열의 길이가 1 이상이 되도록 주어집니다.
 [입출력 예]
 orders	course	result
 ["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"]	[2,3,4]	["AC", "ACDE", "BCFG", "CDE"]
 ["ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"]	[2,3,5]	["ACD", "AD", "ADE", "CD", "XYZ"]
 ["XYZ", "XWY", "WXA"]	[2,3,4]	["WX", "XY"]
 입출력 예에 대한 설명
 */
public class Question9 {

    public static void main(String[] args) {

        Question9 q = new Question9();

        String new_id = "=.=";

        System.out.println("q.solution(new String[\"ABCDE\",\"AC\",\"CDE\",\"BCFG\",\"ACDEH\"]) = " + q.solution(new String[]{"ABCFG","AC","CDE","BCFG","ACDEH"},new int[]{2,3,4}));


    }


    public String[] solution(String[] orders , int[] course) {


        return null;

    }





}
