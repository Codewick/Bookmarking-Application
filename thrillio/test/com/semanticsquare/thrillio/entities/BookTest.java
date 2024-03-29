package com.semanticsquare.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.semanticsquare.thrillio.constants.BookGenre;
import com.semanticsquare.thrillio.managers.BookmarkManager;

public class BookTest {

	@Test
	public void testIsKidFriendlyEligible() {
		
		// Test 1: Philosophy in genre -- false
		Book book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",	new String[] {"Henry David Thoreau"}, BookGenre.PHILOSOPHY, 4.3);
		boolean isKidFriendlyEligible = book.isKidFriendlyEligible();
		assertFalse("For Philosophy in genre, isKidFriendlyEligible() is false", isKidFriendlyEligible);
		
		//Test 2: Self-help in genre -- false
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",	new String[] {"Henry David Thoreau"}, BookGenre.SELF_HELP, 4.3);
		isKidFriendlyEligible = book.isKidFriendlyEligible();
		assertFalse("For Self-help in genre, isKidFriendlyEligible() is false", isKidFriendlyEligible);
	}

}
