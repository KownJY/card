package blackjack;

import java.util.LinkedList;
import  java.util.*;

public class Gamer {
    //추가로 카드를 받는다. 뽑은 카드를  소유한다. 카드를 오픈한다.

    protected List<Card> myCards = new LinkedList<>();

    public Gamer()
    {
        init();
    }

    private void init()
    {
        myCards = new LinkedList<>();
    }

    public void receiveCard(Card c)
    {
        myCards.add(c);
    }

    public List<Card> openCard()
    {
        return myCards;
    }

    public void showAllMyCards()
    {
        for(Card c : myCards)
        {
            System.out.println(c);
        }
    }

}
