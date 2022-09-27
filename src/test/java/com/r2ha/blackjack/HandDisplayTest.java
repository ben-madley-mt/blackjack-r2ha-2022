package com.r2ha.blackjack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class HandDisplayTest {

    @Test
    void displayFaceUpCardReturnsAsCorrectString() throws Exception {
        List<Card> cards = List.of(
                new Card(Suit.HEARTS, Rank.ACE),
                new Card(Suit.CLUBS, Rank.JACK));
        Hand hand = new Hand(cards);

        assertThat(ConsoleHand.displayFaceUpCard(hand))
                .isEqualTo("\u001B[31m┌─────────┐\u001B[1B\u001B[11D│A        │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│    ♥    │\u001B[1B\u001B[11D│         │\u001B[1B\u001B[11D│        A│\u001B[1B\u001B[11D└─────────┘");
    }

    @Test
    void displayHandAsCorrectString() throws Exception {
        List<Card> cards = List.of(
                new Card(Suit.HEARTS, Rank.ACE),
                new Card(Suit.CLUBS, Rank.JACK));
        Hand hand = new Hand(cards);

        assertThat(hand.cardsAsString())
                .isEqualTo("[31m┌─────────┐[1B[11D│A        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        A│[1B[11D└─────────┘[6A[1C[30m┌─────────┐[1B[11D│J        │[1B[11D│         │[1B[11D│    ♣    │[1B[11D│         │[1B[11D│        J│[1B[11D└─────────┘");
    }

}
