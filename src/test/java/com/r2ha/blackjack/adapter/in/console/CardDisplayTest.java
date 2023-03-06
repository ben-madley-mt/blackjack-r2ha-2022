package com.r2ha.blackjack.adapter.in.console;

import com.r2ha.blackjack.adapter.in.console.ConsoleCard;
import com.r2ha.blackjack.domain.Card;
import com.r2ha.blackjack.domain.Rank;
import com.r2ha.blackjack.domain.Suit;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardDisplayTest {

    @Test
    public void displayTenAsString() {
        var card = new Card(Suit.HEARTS, Rank.TEN);
        assertThat(ConsoleCard.display(card))
                .isEqualTo("\u001B[31m┌─────────┐\u001B[1B\u001B[11D│10       │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│    ♥    │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│       10│\u001B[1B\u001B[11D└─────────┘");
    }

    @Test
    public void displayNonTenAsString() {
        var card = new Card(Suit.DIAMONDS, Rank.TWO);
        assertThat(ConsoleCard.display(card))
                .isEqualTo("\u001B[31m┌─────────┐\u001B[1B\u001B[11D│2        │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│    ♦    │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│        2│\u001B[1B\u001B[11D└─────────┘");
    }

    @Test
    public void displayFaceCardAsString() {
        var card = new Card(Suit.CLUBS, Rank.KING);
        assertThat(ConsoleCard.display(card))
                .isEqualTo("\u001B[30m┌─────────┐\u001B[1B\u001B[11D│K        │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│    ♣    │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│        K│\u001B[1B\u001B[11D└─────────┘");
    }
}
