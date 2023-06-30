# PokerJava

This is a simple card game implemented in Java. The game allows players to draw a hand of 5 cards from a shuffled deck, replace some of the cards, and evaluate the final hand to determine the winning combination.


Getting Started

To play the game, follow these steps:

Clone the repository or download the source code files.
Open the project in your favorite Java development environment.
Compile the Java files to generate the executable bytecode.
Run the GameTest class, which contains the main method, to start the game.

Game Rules

The game starts by creating a deck of cards and shuffling it.
The player is then prompted to draw a hand of 5 cards from the deck.
The player can choose to redraw some of the cards in their hand. They are asked which card to redraw, and they can choose to redraw any number of cards.
After the redraw, the hand is sorted, and the player's hand is displayed.
The game evaluates the hand to determine the winning combination or the highest card.
The player is given the option to play again. If they choose to play again, the game restarts from step 1.
Class Descriptions

Player Class

This class represents a player in the game.
It contains two methods:
draw(Deck deck): Draws 5 cards from the deck and returns the hand.
redraw(int counter, Deck deck): Allows the player to redraw a card at the specified position in the hand and returns the new card.
GameTest Class
This class contains the main method and is used to start the game.
It creates a Game object and calls its play method to start the game.

Game Class

This class represents the game and contains the main logic.
It has several methods:
play(): Starts the game and contains the main game loop.
makeHand(): Creates a predefined hand for testing purposes (can be uncommented and modified).
checkHand(): Displays the cards in the player's hand.
redraw(): Allows the player to redraw selected cards in their hand.
evaluate(): Evaluates the player's hand to determine the winning combination or highest card.
royalFlush(), straightFlush(), fourOfaKind(), fullHouse(), flush(), straight(), triple(), twoPairs(), pair(), highCard(): Helper methods to check for specific winning combinations.
again(): Asks the player if they want to play again.
display(Card card): Displays a single card from the player's hand.

Deck Class

This class represents a deck of cards.
It contains methods to fill the deck, shuffle the cards, deal a hand, draw the next card, and refresh the deck position.

Card Class

This class represents a single playing card.
It implements the Comparable interface to allow sorting based on the card's rank.
It contains methods to get and set the suit and rank of the card.
Customize the Game
You can customize the game by modifying the game logic in the Game class or adding new features. For example, you can add more winning combinations, implement multiplayer functionality, or improve the user interface.

Enjoy playing the game!
