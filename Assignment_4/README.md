`Assignment 4`:  
`Title`:  
Write a menu-driven Java Program for the following:
1. There are 52 cards in a deck, each of which belongs to one of four suits and one of 13
ranks. Represent a deck of cards as an array of Objects (*you may use the Vector class)
2. Use integers to encode the ranks and suits.
3. Have suitable default & parameterized constructors.
4. All data members to have private access. The class' Card' to have the following
methods: createDeck(), printCard(), printDeck (),sameCard(),compareCard(), sortCard(), findCard() which searches through an array or vector of Cards to see whether it contains a specific card, dealCards() function: to print 5 random cards from the existing deck.

### `Card` class:
- **Fields**:
  - `rank`: An integer representing the rank of the card.
  - `suit`: A string representing the suit of the card.

- **Constants**:
  - `suits`: An array of strings representing the four suits in a standard deck of cards.
  - `ranks`: An array of strings representing the ranks of cards from Ace to King.

- **Constructor**:
  - `Card(int rank, String suit)`: Initializes a `Card` object with a given rank and suit.

- **Methods**:
  - `getRank()`: Returns the rank of the card.
  - `getSuit()`: Returns the suit of the card.
  - `toString()`: Returns a string representation of the card in the format "Rank of Suit".
  - `compareTo(Card other)`: Compares this card with another card based on their ranks and suits.
  - `equals(Object obj)`: Checks if this card is equal to another object.

### `Deck` class:
- **Fields**:
  - `Deck`: A vector (dynamic array) of `Card` objects representing the deck.

- **Constructor**:
  - `Deck()`: Initializes an empty deck of cards.

- **Methods**:
  - `createDeck()`: Populates the deck with 52 standard playing cards.
  - `displayMenu()`: Displays a menu of options for interacting with the deck.
  - `printDeck()`: Prints all cards in the deck.
  - `shuffleDeck()`: Shuffles the cards in the deck.
  - `drawCard()`: Removes and returns the last card from the deck.
  - `emptyDeck()`: Removes all cards from the deck.
  - `printCard()`: Prints the card at a specified index in the deck.
  - `compareCard()`: Compares two cards in the deck based on their indices.
  - `sameCard()`: Checks if two cards in the deck are the same.
  - `findCard()`: Finds a card in the deck based on its rank and suit.
  - `dealHand()`: Deals a hand of five cards from the deck.
  - `sortCards()`: Sorts the cards in the deck based on their ranks and suits.

### `Main` class:
- **Main method**:
  - `main(String[] args)`: Entry point of the program; creates a `Deck` object, populates it with cards, and displays the menu for user interaction.
