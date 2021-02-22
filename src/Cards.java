public class Cards {

    public static void dealCards(int n, int players) {
        String[] rantCards = {"6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suit = {"\u2664", "\u2661", "\u2667", "\u2662"};

        int cardsInDeck = 36;
        int currentPosition = 0;
        String[] deck = new String[cardsInDeck];
        //TODO добавить проверку кол-ва пользователей

        for (int i = 0; i < rantCards.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck[currentPosition] = rantCards[i] + suit[j];
                currentPosition++;
            }
        }
        for (int i = 0; i < deck.length; i++) {
            int randomCard = (int) (Math.random() * cardsInDeck - i) + i;

            String temp = deck[randomCard];
            deck[randomCard] = deck[i];
            deck[i] = temp;
        }
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(deck[j + n * i] + " ");
            }
            System.out.println("\n");
        }
    }
}
