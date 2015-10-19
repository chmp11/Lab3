package pokerBase;

import static org.junit.Assert.*;

import org.junit.Test;

import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Joker_Test {

	@Test
	public void Decktest() {
		Deck f = new Deck(3);
		assertTrue(f.getTotalCards()==55);
	}
	@Test 
	public void EvalTest(){
		//really checks to see if the explode method works in the eval method
		Deck d = new Deck(2);
		Hand h = new Hand();
		h.AddCardToHand(new Card(eSuit.JOKER,eRank.JOKER,0));
		h.AddCardToHand(new Card(eSuit.CLUBS,eRank.TEN,0));
		h.AddCardToHand(new Card(eSuit.CLUBS,eRank.TEN,0));
		h.AddCardToHand(new Card(eSuit.CLUBS,eRank.TEN,0));
		h.AddCardToHand(new Card(eSuit.CLUBS,eRank.TEN,0));
		h=Hand.EvalHand(h);
		
		assertTrue(h.getHandStrength() == eHandStrength.FiveOfAKind.getHandStrength());
		
	}
}

