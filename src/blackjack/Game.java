package blackjack;

import java.util.Scanner;

public class Game {
    public void play()
    {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();

        Scanner scan = new Scanner(System.in);

        for(int i = 0 ; i < 2 ; i++)
        {
            dealer.receiveCard(cd.getCard());
            gamer.receiveCard(cd.getCard());
        }
        dealer.moreCard(cd);

        System.out.println("나의 카드 리스트");
        gamer.showAllMyCards();

        while (true)
        {
            System.out.print("카드를 더 뽑으시겠습니까? (y/n) :  ");
            String yn = scan.next();

            if("n".equals(yn))
            {
                break;
            }
            gamer.receiveCard(cd.getCard());
        }

        rule.getWinner(dealer,gamer);
    }
}
