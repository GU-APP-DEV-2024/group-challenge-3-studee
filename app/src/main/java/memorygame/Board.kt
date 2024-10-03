package memorygame

class Board( ) {
    //Constructor to create board of different sizes.
    // Assign
    private val cards: Array<Card> = arrayOf<Card>(Card('c', "a"),
        Card('h', "10"),
        Card('h', "10"),
        Card('d', "3"),
        Card('c', "a"),
        Card('d', "3"))

    fun getValueAt(index:Int): Card {
        return cards[index]
    }

    data class Card(val suit: Char, val rank: String) {

    }
}