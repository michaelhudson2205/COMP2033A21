package libraries;

import java.util.ArrayList;

public class DriverApp
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
		
//		System.out.println(bk1);
//		System.out.println(mm1);
		
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
		
		System.out.println(libraryList.get(0));
		System.out.println(libraryList.get(1));
		System.out.println(libraryList.get(2));
		System.out.println(libraryList.get(3));
		System.out.println(libraryList.get(4));
		System.out.println(libraryList.get(5));
		System.out.println(libraryList.get(6));
		System.out.println(libraryList.get(7));
		System.out.println(libraryList.get(8));
		System.out.println(libraryList.get(9));
	}

}
