package com.semanticsquare.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.semanticsquare.thrillio.constants.MovieGenre;
import com.semanticsquare.thrillio.managers.BookmarkManager;

public class MovieTest {

	@Test
	public void testIsKidFriendlyEligible() {
		// Test 1: Horror in Genre -- False
		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.HORROR,
				8.5);
		boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();
		assertFalse("For horror in genre, isKidFriendlyEligible() must return false ", isKidFriendlyEligible);
		
		// Test 2: Thriller in Genre -- False
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.THRILLERS,
				8.5);
		isKidFriendlyEligible = movie.isKidFriendlyEligible();
		assertFalse("For thriller in genre, isKidFriendlyEligible() must return false ", isKidFriendlyEligible);
	}

}
