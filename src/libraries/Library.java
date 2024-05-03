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
import java.util.List;

/**
 * 
 */
public class Library 
{
	public static void main(String[] args)
	{
		Book bk1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 180, 1925, 1, "PG-13");
		Book bk2 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", 281, 1960, 4, "PG");
		Book bk3 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy", 320, 1997, 1, "PG");
		Book bk4 = new Book("1984", "George Orwell", "Dystopian", 328, 1949, 1, "R");
		Book bk5 = new Book("Pride and Prejudice", "Jane Austen", "Romance", 432, 1813, 3, "PG");
		
		Multimedia mm1 = new Multimedia("Inception", "Christopher Nolan", "DVD", 148, 2010, 1, "PG-13");
		Multimedia mm2 = new Multimedia("The Dark Knight", "Christopher Nolan", "DVD", 152, 2008, 2, "PG-13");
		Multimedia mm3 = new Multimedia("Abbey Road", "The Beatles", "CD", 47, 1969, 3, "G");
		Multimedia mm4 = new Multimedia("The Godfather", "Francis Ford Coppola", "DVD", 175, 1972, 2, "R");
		Multimedia mm5 = new Multimedia("The Shawshank Redemption", "Frank Darabont", "DVD", 142, 1994, 3, "R");
		
		ArrayList<Object> libraryList = new ArrayList<Object>();
		libraryList.add(mm5);
		libraryList.add(mm4);
		libraryList.add(mm3);
		libraryList.add(mm2);
		libraryList.add(mm1);
		libraryList.add(bk5);
		libraryList.add(bk4);
		libraryList.add(bk3);
		libraryList.add(bk2);
		libraryList.add(bk1);
		
//		System.out.println(bk1.getTitle());
		
//		String titleToSearch = "Abbey Road";
//		
//		for (Object item : libraryList)
//		{
//			if (item instanceof Book)
//			{
//				Book book = (Book) item;
//				if (book.getTitle().equals(titleToSearch))
//				{
//					System.out.println("Book found:");
//					System.out.println(book);
//					break;
//				}
//			}
//			else if (item instanceof Multimedia)
//			{
//				Multimedia multimedia = (Multimedia) item;
//				if (multimedia.getTitle().equals(titleToSearch))
//				{
//					System.out.println("Multimedia found:");
//					System.out.println(multimedia);
//					break;
//				}
//			}
//		} // ==========end of for loop==========
		
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
	}
}
