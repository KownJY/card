package blackjack;
import java.util.*;
public class Dealer extends Gamer{


    public  void moreCard(CardDeck cd)
    {
        //본인의 카드가 2장인지 확인
        //2장의 카드의 점수가 16잠 이하인지 확인
        //16징 이하 이 면 카드를 한 장 더 뽑기.

        if(myCards.size() == 2)
        {
            int sumPoint = 0;
            for(int i = 0 ; i < 2;i++)
            {
                Card c = myCards.get(i);
                sumPoint += c.getPoint();

            }

            if(sumPoint <= 16)
            {
                //카드를 뽑는다.
                Card c = cd.getCard();

                receiveCard(c);
            }

        }



    }
}
