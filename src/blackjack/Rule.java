package blackjack;
import java.util.*;

public class Rule {
    //승패판단
    //점수측정

    public int  getScore(List<Card> cards)
    {
        int sumPoint = 0;
        for(int i = 0 ; i <cards.size();i++)
        {
            Card c = cards.get(i);
            sumPoint += c.getPoint();

        }

        return sumPoint;
    }

    public void getWinner(Dealer dealer, Gamer gamer)
    {
        int dealerScore = getScore(dealer.openCard());
        int gamerScore = getScore(gamer.openCard());

        System.out.println("dealer score :" + dealerScore);
        System.out.println("gaemer score : " + gamerScore);

        if(dealerScore == gamerScore || (dealerScore> 21 && gamerScore > 21))
        {
            System.out.println("점수가 같아서 비겼습니다");
        }else if((dealerScore < 21 && gamerScore > 21 ) ||(dealerScore < 21 && dealerScore>gamerScore))
        {
            System.out.println("딜러가 이겼습니다");
        }
        else
        {
            System.out.println("게이머가 이겼습니다.");
        }
    }




}
