package Ch05;

public class ArrTest01 {
    public static void main(String[] args) {

        int[] scores =  {100,87,5556,23,28,98,30,32};
        int odd_num = 0;

        for(int i = 0 ; i < scores.length ; i++)
        {
            if(scores[i] % 2 == 0)
            {
                System.out.println("짝수인 숫자들은" + scores[i]);
            }
            else
            {
                odd_num =  odd_num + scores[i];
            }
        }

        System.out.println("홀수들의 합은 : " + odd_num);


    }
}
