package me.seungjun;

import java.util.HashMap;
import java.util.Locale;

/**

 */
public class Question8 {

    public static void main(String[] args) {

        Question8 q = new Question8();

        String new_id = "=.=";


        System.out.println(q.solution(new_id));

    }


    public String solution(String new_id) {
        String answer = "";

        //1단계
        new_id = new_id.toLowerCase(Locale.ROOT);


        //2단계
        new_id = new_id.replaceAll("[^a-z\\d\\-_.]*", ""); // a-z : 영어, \\d : 숫자 \\-_. : 특수문자

        //3단계
        new_id = new_id.replaceAll("\\.{2,}", "."); //    \\. : 마침표 , {2,} : 2회이상

        //4단계
        new_id = new_id.replaceAll("^[.]|[.]$","");   // ^ : 문자의 시작 [.] : 마침표 , | : 또는 , [.]$ : 마침표로 끝나는것

        //5단계
       if(new_id.length() == 0){
           new_id = "a";
       }
        if(new_id.length() >= 16){
             new_id = new_id.substring(0,15);

             new_id = new_id.replaceAll("[.]$","");
        } else if(new_id.length() <= 2){
            String lastWord = new_id.substring(new_id.length()-1);

            while(new_id.length() <= 2 ){
                new_id = new_id.concat(lastWord);

            }

        }
        answer = new_id;


        return answer;
    }





}
