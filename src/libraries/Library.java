/**
* File:         Assessment 2.1
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

/**
 * 
 */
public class Library 
{
	public static void main(String[] args)
	{
		Book bk01 = new Book("e", "a", "Fiction", 1, 1925, 2, "PG");
		Book bk02 = new Book("d", "a", "Fiction", 2, 1960, 4, "R");
		Book bk03 = new Book("e", "a", "Fantasy", 3, 1997, 1, "PG");
		Book bk04 = new Book("1984", "a", "Dystopian", 4, 1949, 1, "PG");
		Book bk05 = new Book("Z", "a", "Romance", 5, 1813, 3, "PG");
//		Book bk06 = new Book("ahort", "Jane Austen", "Romance", 432, 1813, 3, "PG");
//		Book bk07 = new Book("ahort", "Jane Austen", "Romance", 432, 1813, 1, "PG");
//		Book bk08 = new Book("Ahort", "Jane Austen", "Romance", 432, 1813, 2, "PG");
//		Book bk09 = new Book("Ahort", "Jane Austen", "Romance", 432, 1813, 4, "PG");
//		Book bk10 = new Book("Pride and Prejudice", "Jane Austen", "Romance", 432, 1813, 3, "PG");
//		Book bk11 = new Book("Pride and Prejudice", "Jane Austen", "Romance", 432, 1813, 3, "PG");
//		Book bk12 = new Book("zhort", "Jane Austen", "Romance", 432, 1813, 3, "PG");
//		Book bk13 = new Book("zhort", "Jane Austen", "Romance", 432, 1813, 1, "PG");
//		Book bk14 = new Book("Zhort", "Jane Austen", "Romance", 432, 1813, 2, "PG");
//		Book bk15 = new Book("Zhort", "Jane Austen", "Romance", 432, 1813, 4, "PG");
		
		Multimedia mm01 = new Multimedia("Inception", "Christopher Nolan", "DVD", 148, 2010, 1, "PG-13");
		Multimedia mm02 = new Multimedia("The Dark Knight", "Christopher Nolan", "DVD", 152, 2008, 2, "PG-13");
		Multimedia mm03 = new Multimedia("Abbey Road", "The Beatles", "CD", 47, 1969, 3, "G");
		Multimedia mm04 = new Multimedia("The Godfather", "Francis Ford Coppola", "DVD", 175, 1972, 2, "R");
		Multimedia mm05 = new Multimedia("The Shawshank Redemption", "Frank Darabont", "DVD", 142, 1994, 3, "R");
		Multimedia mm06 = new Multimedia("The Great Gatsby", "F. Scott Fitzgerald", "DVD", 180, 1925, 1, "PG-13");
		
		ArrayList<Object> libraryList = new ArrayList<Object>();
		libraryList.add(mm05);
		libraryList.add(mm04);
		libraryList.add(mm03);
		libraryList.add(mm02);
		libraryList.add(mm01);
		libraryList.add(bk05);
		libraryList.add(bk04);
		libraryList.add(bk03);
		libraryList.add(bk02);
		libraryList.add(bk01);
		libraryList.add(mm06);
		
		Book books[] =
			{
					new Book("d", "Jane Austen", "Romance", 432, 1813, 4, "PG"),
					new Book("c", "Jane Austen", "Romance", 432, 1813, 3, "PG"),
					new Book("1984", "Jane Austen", "Romance", 432, 1813, 2, "PG"),
					new Book("Z", "Jane Austen", "Romance", 432, 1813, 1, "PG"),
			};
		
		ArrayList<Book> books_al = new ArrayList<Book>();
		books_al.add(bk01);
		books_al.add(bk02);
		books_al.add(bk03);
		books_al.add(bk04);
		books_al.add(bk05);
		
		ArrayList<Multimedia> multimedia_al = new ArrayList<Multimedia>();
		multimedia_al.add(mm01);
		multimedia_al.add(mm02);
		multimedia_al.add(mm03);
		multimedia_al.add(mm04);
		multimedia_al.add(mm05);
		multimedia_al.add(mm06);
		
		// Print the books
		System.out.println("Book choices:");
		for (int ii = 0; ii < books.length; ii++)
		{
			System.out.println("   " + books[ii]);
		}
		
		// Find the first book in the list
		Book first = books[0];
		for (int jj = 1; jj < books.length; jj++)
		{
			if (books[jj].compareTo(first) < 0)
			{
				first = books[jj];
			}
		}
		
		System.out.println();
		System.out.println("The first book is " + first);
		
		String fragmentToSearch = "The";
		
		for (Object item : libraryList)
		{
			if (item instanceof Book)
			{
				Book book = (Book) item;
				if (book.getTitle().startsWith(fragmentToSearch))
				{
//					System.out.println("Book found:");
					System.out.println(book);
//					break;
				}
			}
			else if (item instanceof Multimedia)
			{
				Multimedia multimedia = (Multimedia) item;
				if (multimedia.getTitle().startsWith(fragmentToSearch))
				{
//					System.out.println("Multimedia found:");
					System.out.println(multimedia);
//					break;
				}
			}
		} // ==========end of for loop==========
		
		System.out.println("==================================================");
//		System.out.println(Arrays.toString(books));
		bookBubbleSort(books);
//		System.out.println(Arrays.toString(books));
		
//		System.out.println("--------------------------------------------------");
//		bookBubbleSort_al(books_al);
		
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
		
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>> using comparator book_sort_1<<<<<<<<<<<<<<<<<<<<");
		Collections.sort(books_al, book_sort_1);
		for (Book bk : books_al)
		{
			System.out.print(bk);
		}
		
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>> using comparator book_sort_2<<<<<<<<<<<<<<<<<<<<");
		Collections.sort(books_al, book_sort_2);
		for (Book bk : books_al)
		{
			System.out.print(bk);
		}
		
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>> using comparator multimedia_sort_1<<<<<<<<<<<<<<<<<<<<");
		Collections.sort(multimedia_al, multimedia_sort_1);
		for (Multimedia mm : multimedia_al)
		{
			System.out.print(mm);
		}
		
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>> using comparator multimedia_sort_2<<<<<<<<<<<<<<<<<<<<");
		Collections.sort(multimedia_al, multimedia_sort_2);
		for (Multimedia mm : multimedia_al)
		{
			System.out.print(mm);
		}
		
		
		
	} // ==========end of psvm==========
	
	public static void bookBubbleSort(Book[] bookArray)
	{
		System.out.println("This is the bookArray before the Bubble Sort");
		System.out.println(Arrays.toString(bookArray));
		for (int ii = bookArray.length - 1; ii > 0; ii--)
		{
			for (int jj = 0; jj < ii; jj++)
			{
				if (bookArray[jj].compareTo(bookArray[jj + 1]) > 0)
				{
					Book temp = bookArray[jj];
					bookArray[jj] = bookArray[jj + 1];
					bookArray[jj + 1] = temp;
				}
			}
		}
		System.out.println("This is the bookArray after the Bubble Sort");
		System.out.println(Arrays.toString(bookArray));
	}
	
	public static void bookBubbleSort_al(ArrayList<Book> bookArrayList)
	{
		System.out.println("--------------------------------------------------");
		System.out.println("This is the bookArrayList before the Bubble Sort");
		System.out.println(bookArrayList);
		for (int ii = bookArrayList.size() - 1; ii > 0; ii--)
		{
			for (int jj = 0; jj < ii; jj++)
			{
				if (bookArrayList.get(jj).compareTo(bookArrayList.get(jj + 1)) > 0)
				{
					Book temp = bookArrayList.get(jj);
					bookArrayList.set(jj, bookArrayList.get(jj + 1));
					bookArrayList.set(jj + 1, temp);
				}
			}
		}
		System.out.println("--------------------------------------------------");
		System.out.println("This is the bookArrayList after the Bubble Sort");
		System.out.println(bookArrayList);
	}
	
	
	
	
} // ==========end of Class Library==========
