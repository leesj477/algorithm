package me.seungjun;

/**

 */
public class Question6 {

    public static void main(String[] args) {

        Question6 q = new Question6();

        int[] result = q.plusOne(new int[]{9,9,9,9});

        for (int i = 0; i < result.length; i++) {
            int i1 = result[i];
            System.out.println("i1 = " + i1);

        }
    }


    public int[] plusOne(int[] nums) {

        StringBuilder s = new StringBuilder();


        int digit = 0;
        for (int i = nums.length-1 ; i >= 0; i--) {

            int num = nums[i];

            if(nums.length-1 == i){
                num++;
            }
            // num = 1 , digit = 0
            if(digit > 0){
                num = num + 1;
                digit = 0;
            }
            if(num > 9 ){
                digit = 1;
                num = num - 10;
            }

            s.append(num);
            if(i==0 && digit != 0){
                s.append(digit);
            }
        }


        s = s.reverse();

        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i]  = s.charAt(i) - '0';
        }


        return result;
    }



}
