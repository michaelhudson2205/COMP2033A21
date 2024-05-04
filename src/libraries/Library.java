/**
* File:         Library.java
* Description:  Project 1: Sorting Algorithms
* Author:       Michael Hudson
* Student ID:   110369255
* Email ID:     hudmy010@mymail.unisa.edu.au
* AI Tool Used: ChatGPT4
* This is my own work as defined by
*    the University's Academic Integrity Policy.
**/
package libraries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class Library 
{
	public static void main(String[] args)
	{
		// Create Book objects.
		Book bk01 = new Book("e", "a", "Fiction", 1, 1925, 2, "PG");
		Book bk02 = new Book("d", "a", "Fiction", 2, 1960, 4, "R");
		Book bk03 = new Book("The Big L", "a", "Fantasy", 3, 1997, 1, "PG-13");
		Book bk04 = new Book("1984", "a", "Dystopian", 4, 1949, 1, "PG");
		Book bk05 = new Book("Z", "a", "Romance", 5, 1813, 3, "PG");
		Book bk06 = new Book("ahort", "Jane Austen", "Romance", 432, 1813, 3, "PG");
		Book bk07 = new Book("ahort", "Jane Austen", "Romance", 432, 1813, 1, "PG");
		Book bk08 = new Book("Ahort", "Jane Austen", "Romance", 432, 1813, 2, "PG");
		Book bk09 = new Book("The Ahort", "Jane Austen", "Romance", 432, 1813, 4, "PG");
		Book bk10 = new Book("Pride and Prejudice", "Jane Austen", "Romance", 432, 1813, 3, "PG");
		Book bk11 = new Book("The Pride and Prejudice", "Jane Austen", "Romance", 432, 1813, 3, "PG");
		Book bk12 = new Book("zhort", "Jane Austen", "Romance", 432, 1813, 3, "PG");
		Book bk13 = new Book("The zhort", "Jane Austen", "Romance", 432, 1813, 1, "PG");
		Book bk14 = new Book("Zhort", "Jane Austen", "Romance", 432, 1813, 2, "PG");
		Book bk15 = new Book("Zhort", "Jane Austen", "Romance", 432, 1813, 4, "PG");
		
		// Create Multimedia objects.
		Multimedia mm01 = new Multimedia("Inception", "Christopher Nolan", "DVD", 148, 2010, 1, "PG-13");
		Multimedia mm02 = new Multimedia("The Dark Knight", "Christopher Nolan", "DVD", 152, 2008, 2, "PG-13");
		Multimedia mm03 = new Multimedia("Abbey Road", "The Beatles", "CD", 47, 1969, 3, "G");
		Multimedia mm04 = new Multimedia("The Godfather", "Francis Ford Coppola", "DVD", 175, 1972, 2, "R");
		Multimedia mm05 = new Multimedia("The Shawshank Redemption", "Frank Darabont", "DVD", 142, 1994, 3, "R");
		Multimedia mm06 = new Multimedia("The Great Gatsby", "F. Scott Fitzgerald", "DVD", 180, 1925, 1, "PG-13");
		Multimedia mm07 = new Multimedia("The Long Run", "The Eagles", "CD", 43, 1979, 1, "PG");
		
		// Create ArrayList containing both books and multimedia.
		ArrayList<Object> libraryList = new ArrayList<Object>();
		libraryList.add(bk01);
		libraryList.add(bk02);
		libraryList.add(bk03);
		libraryList.add(bk04);
		libraryList.add(bk05);
		libraryList.add(bk06);
		libraryList.add(bk07);
		libraryList.add(bk08);
		libraryList.add(bk09);
		libraryList.add(bk10);
		libraryList.add(bk11);
		libraryList.add(bk12);
		libraryList.add(bk13);
		libraryList.add(bk14);
		libraryList.add(bk15);
		libraryList.add(mm01);
		libraryList.add(mm02);
		libraryList.add(mm03);
		libraryList.add(mm04);
		libraryList.add(mm05);
		libraryList.add(mm06);
		libraryList.add(mm07);
		
		// Create ArrayList containing only books.
		ArrayList<Book> books_al = new ArrayList<Book>();
		books_al.add(bk01);
		books_al.add(bk02);
		books_al.add(bk03);
		books_al.add(bk04);
		books_al.add(bk05);
		books_al.add(bk06);
		books_al.add(bk07);
		books_al.add(bk08);
		books_al.add(bk09);
		books_al.add(bk10);
		books_al.add(bk11);
		books_al.add(bk12);
		books_al.add(bk13);
		books_al.add(bk14);
		books_al.add(bk15);
		
		// Create ArrayList containing only multimedia.
		ArrayList<Multimedia> multimedia_al = new ArrayList<Multimedia>();
		multimedia_al.add(mm01);
		multimedia_al.add(mm02);
		multimedia_al.add(mm03);
		multimedia_al.add(mm04);
		multimedia_al.add(mm05);
		multimedia_al.add(mm06);
		multimedia_al.add(mm07);
		
		// Comparator used for **book** sorting rule 1
		// (lexicographical ordering by Title, then by Edition).
		Comparator<Book> book_sort_1 = new Comparator<Book>()
		{
			public int compare(Book bk1, Book bk2)
			{
				int result = 0;
				
				if (bk1.getTitle().compareTo(bk2.getTitle()) < 0)
				{
					result = -1;
				}
				else if (bk1.getTitle().compareTo(bk2.getTitle()) > 0)
				{
					result = 1;
				}
				else
				{
					result = bk1.getEdition() - bk2.getEdition();
				}
				
				return result;
			}
		};
				
		// Comparator used for **multimedia** sorting rule 1
		// (lexicographical ordering by Title, then by Edition).
		Comparator<Multimedia> multimedia_sort_1 = new Comparator<Multimedia>()
		{
			public int compare(Multimedia mm1, Multimedia mm2)
			{
				int result = 0;
				
				if (mm1.getTitle().compareTo(mm2.getTitle()) < 0)
				{
					result = -1;
				}
				else if (mm1.getTitle().compareTo(mm2.getTitle()) > 0)
				{
					result = 1;
				}
				else
				{
					result = mm1.getEdition() - mm2.getEdition();
				}
				
				return result;
			}
		};
		
		// Comparator used for **book** sorting rule 2
		// (reverse lexicographical ordering by Author, then by Rating).
		Comparator<Book> book_sort_2 = new Comparator<Book>()
		{
			public int compare(Book bk1, Book bk2)
			{
				int result = 0;
				
				if (bk1.getAuthor().compareTo(bk2.getAuthor()) > 0)
				{
					result = -1;
				}
				else if (bk1.getAuthor().compareTo(bk2.getAuthor()) < 0)
				{
					result = 1;
				}
				else if (bk1.getRating().compareTo(bk2.getRating()) > 0)
				{
					result = -1;
				}
				else if (bk1.getRating().compareTo(bk2.getRating()) < 0)
				{
					result = 1;
				}
				
				return result;
			}
		};
		
		// Comparator used for **multimedia** sorting rule 2
		// (reverse lexicographical ordering by Author/Publisher, then by Rating).
		Comparator<Multimedia> multimedia_sort_2 = new Comparator<Multimedia>()
		{
			public int compare(Multimedia mm1, Multimedia mm2)
			{
				int result = 0;
				
				if (mm1.getAuthorPublisher().compareTo(mm2.getAuthorPublisher()) > 0)
				{
					result = -1;
				}
				else if (mm1.getAuthorPublisher().compareTo(mm2.getAuthorPublisher()) < 0)
				{
					result = 1;
				}
				else if (mm1.getRating().compareTo(mm2.getRating()) > 0)
				{
					result = -1;
				}
				else if (mm1.getRating().compareTo(mm2.getRating()) < 0)
				{
					result = 1;
				}
				
				return result;
			}
		};
		
		// A simple menu system for searching and sorting.
		// User choice
		int choice;
		
		// Display menu
		System.out.println("M E N U");
		System.out.println("===================================================");
		System.out.println("1. Search (lex. by Title and then by Edition)");
		System.out.println("2. Search (reverse lex. by Author then by Rating)");
		System.out.println("---------------------------------------------------");
		System.out.println("3. Search (not sorted - combined list)");
		System.out.println("---------------------------------------------------");
		System.out.println("4. Show All (lex. by Title and then by Edition)");
		System.out.println("5. Show All (reverse lex. by Author then by Rating)");
		System.out.println("---------------------------------------------------");
		System.out.println("6. Exit");
		System.out.println("===================================================");
		System.out.print("Enter choice: ");
		
		// Setup Scanner
		Scanner in = new Scanner(System.in);
		
		// Get choice from user
		choice = in.nextInt();
		
		// Menu loop
		while (choice != 6)
		{
			// Check choice value
			if (choice == 1)
			{
				System.out.println("You are about to run 1. Search lex Title/Edition");
				Collections.sort(books_al, book_sort_1);
				Collections.sort(multimedia_al, multimedia_sort_1);
				SearchAll(books_al, multimedia_al);
			}
			else if (choice == 2)
			{
				System.out.println("You are about to run 2. Search reverse lex Author/Rating");
				Collections.sort(books_al, book_sort_2);
				Collections.sort(multimedia_al, multimedia_sort_2);
				SearchAll(books_al, multimedia_al);
			}
			else if (choice == 3)
			{
				System.out.println("You are about to run the Search not sorted");
				SearchNotSorted(libraryList);
			}
			else if (choice == 4)
			{
				System.out.println("You are about to run 4. Show All Lex");
				
				System.out.println();
				System.out.println("\n>>>>> sorting books in lex. order by Title then Edition <<<<<");
				Collections.sort(books_al, book_sort_1);
				for (Book bk : books_al)
				{
					System.out.print(bk);
				}
				
				System.out.println();
				System.out.println("\n>>>>> sorting multimedia in lex. order by Title then Edition <<<<<");
				Collections.sort(multimedia_al, multimedia_sort_1);
				for (Multimedia mm : multimedia_al)
				{
					System.out.print(mm);
				}
			}
			else if (choice == 5)
			{
				System.out.println("You chose 5. Show All reverse lex Author/Rating");
				
				System.out.println();
				System.out.println("\n>>>>> sorting books in reverse lex. order by Author then Rating <<<<<");
				Collections.sort(books_al, book_sort_2);
				for (Book bk : books_al)
				{
					System.out.print(bk);
				}
				
				System.out.println();
				System.out.println("\n>>>>> sorting multimedia in reverse lex. order by Author then Rating <<<<<");
				Collections.sort(multimedia_al, multimedia_sort_2);
				for (Multimedia mm : multimedia_al)
				{
					System.out.print(mm);
				}
			}
			
			// Display menu
			System.out.println("\n\nM E N U");
			System.out.println("===================================================");
			System.out.println("1. Search (lex. by Title and then by Edition)");
			System.out.println("2. Search (reverse lex. by Author then by Rating)");
			System.out.println("---------------------------------------------------");
			System.out.println("3. Search (not sorted - combined list)");
			System.out.println("---------------------------------------------------");
			System.out.println("4. Show All (lex. by Title and then by Edition)");
			System.out.println("5. Show All (reverse lex. by Author then by Rating)");
			System.out.println("---------------------------------------------------");
			System.out.println("6. Exit");
			System.out.println("===================================================");
			System.out.print("Enter choice: ");
			
			// Get choice from user
			choice = in.nextInt();
		}
		System.out.println("Goodbye. Thank you for using the Library.");
		
	} // ==========end of psvm==========
	
	
	/**
	 * Prints result of searching ArrayList combing books and multimedia.
	 * 
	 * This method is little more than a demonstration of how different
	 * objects can be stored in a single ArrayList.
	 * 
	 * @param theArrayList the ArrayList that combines books and multimedia
	 */
	public static void SearchNotSorted(ArrayList<Object> theArrayList)
	{
		// Searching the libraryList that contains both books and multimedia
				String fragmentToSearch = "The";
				
				System.out.println("Searching for Titles that start with: \"" + fragmentToSearch + "\"");
				System.out.println("\nResults:");
				
				for (Object item : theArrayList)
				{
					if (item instanceof Book)
					{
						Book book = (Book) item;
						if (book.getTitle().startsWith(fragmentToSearch))
						{
//							System.out.println("Book found:");
							System.out.print(book);
//							break;
						}
					}
					else if (item instanceof Multimedia)
					{
						Multimedia multimedia = (Multimedia) item;
						if (multimedia.getTitle().startsWith(fragmentToSearch))
						{
//							System.out.println("Multimedia found:");
							System.out.print(multimedia);
//							break;
						}
					}
				} // ==========end of for loop (combined search)==========
	}
	
	/**
	 * Prints the result of searching the books ArrayList and the multimedia ArrayList.
	 * 
	 * @param theBookAL the ArrayList that stores book objects only
	 * @param theMultimediaAL the ArrayList that stores multimedia objects only
	 */
	public static void SearchAll(ArrayList<Book> theBookAL, ArrayList<Multimedia> theMultimediaAL)
	{
		String FragmentToSearch = "The";
		
		// Searching the books_al that contains only books
		System.out.println();
		System.out.println("\nSearching for Book Titles that start with: \"" + FragmentToSearch + "\"");
		System.out.println("\nBook Results:");
		
		for (Book item : theBookAL)
		{
			if (item.getTitle().startsWith(FragmentToSearch))
			{
				System.out.print(item);
			}
		}
		
		// Searching the multimedia_al that contains only multimedia
		System.out.println();
		System.out.println("\nSearching for Multimedia Titles that start with: \"" + FragmentToSearch + "\"");
		System.out.println("\nMultimedia Results:");
		
		for (Multimedia item : theMultimediaAL)
		{
			if (item.getTitle().startsWith(FragmentToSearch))
			{
				System.out.print(item);
			}
		}
	} // ==========end of SearchAll method==========
	
	
	
} // ==========end of Class Library==========
