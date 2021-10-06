package blackjack;

import java.util.*;
public class Card {

    private String pattern; //무늬저장
    private String denomination; //숫자

   public Card()
    {

    }

    public Card(String pattern, String denomination)
    {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern()
    {
        return this.pattern;
    }

    public String getDenomination()
    {
        return this.denomination;
    }
    public int getPoint()
    {
        //denimination 값이 a 면 1
        // 숫자는 숫자
        // kqj 는 10

//        if(denomination.equals('A'))
//        {
//           return  1;
//        }
//
//        else if(Integer.parseInt(denomination) > 1 && Integer.parseInt(denomination) <11)
//        {
//           return Integer.parseInt(denomination);
//        }
//        else
//        {
//           return 10;
//        }

        switch (denomination)
        {
            case "A" :
                return 1;
            case "J" : case "Q" : case "K" :
                return 10;
            default:
                return Integer.parseInt(denomination);
        }

    }

    @Override
    public String toString()
    {
        //return String.valueOf(this.pattern + "," +this.denomination);
        return String.format("%s - %s" , this.pattern,this.denomination);
    }

}
