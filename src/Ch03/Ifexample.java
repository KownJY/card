package Ch03;

public class Ifexample {

    public static void main(String[] args) {
        int score = 10;

        if(score >= 90)
        {
            if((score - 90) >= 6)
            {
                System.out.println("등급은 A+입니다.");
            }
            else
            {
                System.out.println("등급은 A-입니다.");
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




    }

}
