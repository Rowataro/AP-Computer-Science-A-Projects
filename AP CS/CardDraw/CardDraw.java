

/**
 * Write a description of class CardDraw here.
 * Name: Jon Reyrao
 * Date: 10/10/17
 * Period: 8
 * Program Name: CardDraw
 * Program Description: A statistics program whose main process calculates the average number of cards needed
 * to be drawn to get all 4 suits of a standard deck of 52 cards.
 */
public class CardDraw
{
    private static final int deckLength= 52;
    
    //the four suits
    private static final int CLUBS = 0;
    private static final int DIAMONDS = 1;
    private static final int HEARTS = 2;
    private static final int SPADES = 3;
    private static final int TOTALSUITS = 4;
    
    //determines how many events will be simulated and therefore how many outcomes will be produced
    private static final int totalEvents = 100;
    
    public static void main(String[] args)
    {
        //event: drawing of cards through randomly shuffled deck (shuffled each iteration)
        //outcome: how many cards it takes to draw all suits 
        int[] cardsDrawn = findOutcomeOfEvents();
        System.out.println
        (
        "\nTotal events: " + totalEvents +
        "\nAverage number of cards needed to be drawn to get all 4 suits: " + calculateAverage(cardsDrawn)
        );
    }
   
    //fills a deck of cards with 4 suits (each suit corresponds to a constant, with 13 ranks/cards per suit) 
    //totals to 52 cards
    private static int[] createDeck()
    {     
        int[] deck = new int[deckLength];
      
        final int RANKSPERSUIT = 13;
        int index = 0;
        
        for(int suits = 0; suits < TOTALSUITS; ++suits)
        {
            
            //no reinitialization of index, as it goes through the whole array
            //suits start at 1 because otherwise the multiplication of suits*ranksPerSuit doesn't work
            for( ; index < (suits+1)*RANKSPERSUIT; ++index)
            {
                deck[index] = suits;
            }
        }
        
        return deck;
    }
    
    //randomly swaps indexes (which corresponds to the order) of the deck
    private static void shuffle(int[] deck)
    {
       for(int index = 0; index < deckLength; ++index)
       {
           int temp = deck[index];
           //formula for random number generation: min + (int)(Math.random() * (max-min+1));
           //min = 0
           //max = endIndex = deckLength - 1;
           int randomIndex = (int)(Math.random() * (deckLength));
           deck[index] = deck[randomIndex];
           deck[randomIndex] = temp;
       }
    }
    
    //finds how many cards are drawn before all suits are drawn
    //total of 100 trials
    public static int[] findOutcomeOfEvents()
    {
       int[] deck = createDeck();
       //holds the outcomes of each event
       int cardsDrawn[] = new int[totalEvents];
       
       //minimum of outcome/ cards drawn
       final int minimumCardsDrawn = 4;
       
       //outer loop is the number of trials
       for(int event = 0; event < totalEvents; ++event)
       {    
           boolean[] hasBeenDrawn = {false, false, false, false};
           boolean allSuitsDrawn = false;
           
           //ensures random outcome for each event.
           shuffle(deck);
          
           //inner loop is deck drawing and checking of suits
           for(int index = 0; index < deckLength; ++index)
           {
               if(!hasBeenDrawn[deck[index]])
               {
                   hasBeenDrawn[deck[index]] = true;
               }
               //-1 because the index starts from 0
               if(index >= minimumCardsDrawn-1)
               {
                   //checks if all states are true 
                   for(int suit = 0; suit < hasBeenDrawn.length; ++suit)
                   {
                       if(!hasBeenDrawn[suit])
                       {
                           break;
                       }
                       //if suit has been drawn and the loop has had the chance to check all states
                       else if(suit == hasBeenDrawn.length - 1)
                       {
                           allSuitsDrawn = true;
                       }
                   }
               }
               if(allSuitsDrawn)
               {
                   //index+1 (because it starts at 0) is how many cards it took to draw all 4 suits.
                   cardsDrawn[event] = index+1;
                   break;
               }
           }
       }   
       
       return cardsDrawn;
    }
    
    public static double calculateAverage(final int[] cardsDrawn)
    {
        int sum = 0;
        
        for(int index = 0; index < totalEvents; ++index)
        {
            sum += cardsDrawn[index];
        }
        
        double average = (double)sum/totalEvents;
        return average;
    }
}
