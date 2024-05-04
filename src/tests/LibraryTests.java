package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import libraries.Book;

class LibraryTests
{
	@Test
	void testToString() // Test that toString method returns correct string.
	{
	// given
	Book testBook1 = new Book("A", "B", "C", 1, 2, 3, "D");
	
	// when
	String result = testBook1.toString();
	String expected = "\nBook [A by B, C, pages: 1, Year: 2, ed: 3, rating: D]";
	
	// then
	assertEquals(expected, result);
	}
	
	@Test
	void testtestBookAL() // Test that testBookAL returns correct ArrayList.
	{
		// given
		Book testBk1 = new Book("Big Bunny", "C", "D", 2, 3, 4, "E");
		Book testBk2 = new Book("Big Puppy", "F", "G", 5, 6, 7, "H");
		Book testBk3 = new Book("Big Bunyip", "I", "J", 8, 9, 10, "K");
		
		ArrayList<Book> thisTest = new ArrayList<Book>();
		thisTest.add(testBk1);
		thisTest.add(testBk2);
		thisTest.add(testBk3);
		
		ArrayList<Book> thisOutcome = new ArrayList<Book>();
		thisOutcome.add(testBk1);
		thisOutcome.add(testBk3);
		
		
		// when
		ArrayList<Book> result = new ArrayList<Book>();
		String fragmentToSearch = "Big Bun";
		for (Book item : thisTest)
		{
			if (item.getTitle().startsWith(fragmentToSearch))
			{
				result.add(item);
			}
		}
		ArrayList<Book> expected  = thisOutcome;
		
		// then
		assertEquals(expected, result);
		
	}
}
