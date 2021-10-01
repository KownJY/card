package Ch03;

import java.sql.SQLOutput;

public class Ifexample {

    public static void main(String[] args) {
      /*  int score = 94;

        if(score >= 90)
        {
            if((score - 90) >= 8)
            {
                System.out.println("등급은 A+입니다.");
            }
            else if((score - 90) <=3)
            {
                System.out.println("등급은 A-입니다.");
            }else
            {
                System.out.println("등급은 A입니다.");
            }


        }else if(score >= 80)
        {
            if((score - 80) >= 6)
            {
                System.out.println("등급은 B+입니다.");
            }
            else
            {
                System.out.println("등급은 B-입니다.");
            }
        }else if(score >= 70)
        {
            if((score - 70) >= 6)
            {
                System.out.println("등급은 c+입니다.");
            }
            else
            {
                System.out.println("등급은 c-입니다.");
            }
        }
        else
        {
            System.out.println("70점 미만이라서 D 입니다.");
        }
*/

        int score = (int)(Math.random() * 41) + 60;
        char grade = 'D';
        char pm = ' ';
        System.out.println("점수는 : " + score);
        if(score >= 90)
        {
            grade = 'A';
        }
        else if(score >= 80)
        {
            grade = 'B';

        }else if(score >= 70)
        {
            grade = 'C';
        }

        if(score >=70){

            int mVal = score % 10;
            if(mVal >=8 || mVal == 100)
            {
                pm = '+';
            }
            else if(mVal <=3)
            {
                pm = '-';
            }

        }

        System.out.printf("%c%c",grade,pm);


       /* for(int i = 0 ; i<100;i++)
        {
           // int num2 = (int)(Math.random() * 6) + 2;
            //System.out.println(num2);
            // 2 ~ 7 만 나오면댐

            int num3 = (int)(Math.random() * 54) + 55;
            System.out.println(num3);
            //55 - 108 사이의 수
        }*/

    }




}
