package blackjack;

import CH06.Car;
import javafx.scene.chart.CategoryAxis;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {

    private List<Card> cards;


    public CardDeck()
    {
       init();

    }

    private void init()
    {
       String[] patters = new String[]{"스페이드","하드","클럽","다이아몬드"};
        cards = new ArrayList<>();

        for(int i= 0 ; i<patters.length ; i++)
        {
            for(int z = 1 ; z <= 13 ; z++)
            {
                String denomination = String.valueOf(z);
                switch (z)
                {
                    case 1 :
                        denomination = "A";
                        break;
                    case 11 :
                        denomination = "J";
                        break;
                    case 12 :
                        denomination = "Q";
                        break;
                    case 13 :
                        denomination = "K";
                        break;

                    default: denomination = String.valueOf(z);
                }
                Card c = new Card(patters[i],denomination);
                cards.add(c);

            }
        }


    }

    //항상 랜덤한 카드를 준다.
    public Card getCard()
    {
        int rIdx = (int)(Math.random() * cards.size());
        return cards.remove(rIdx);
    }

    public void  showAllCards()
    {
//        for(int i = 0 ; i <cards.size() ; i++)
//        {
//            Card c = cards.get(i);
//            System.out.println(c);
//        }

        for(Card c : cards)
        {
            System.out.println(c);
        }
    }
}
