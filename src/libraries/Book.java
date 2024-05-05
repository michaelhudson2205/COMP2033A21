/**
* File:         Book.java
* Description:  Project 1: Sorting Algorithms - Book Class
* Author:       Michael Hudson
* Student ID:   110369255
* Email ID:     hudmy010@mymail.unisa.edu.au
* AI Tool Used: ChatGPT4
* This is my own work as defined by
*    the University's Academic Integrity Policy.
**/
package libraries;

import java.util.Objects;

/**
 * Class that represents a book.
 */
public class Book implements Comparable<Book>
{
	// Data fields
	private String title;
	private String author;
	private String genre;
	private int pageCount;
	private int publicationYear;
	private int edition;
	private String rating;
	
	// Methods
	/**
	 * Initalises a Book object with all properties specified.
	 * 
	 * @param title The title, or name, of the book.
	 * @param author The author's name.
	 * @param genre The genre that book belongs in.
	 * @param pageCount The number of pages.
	 * @param publicationYear The year the book was published.
	 * @param edition The edition of the book.
	 * @param rating The applicable rating (G, PG, PG-13, R).
	 */
	public Book(String title, String author, String genre, int pageCount, int publicationYear, int edition,
			String rating) 
	{
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pageCount = pageCount;
		this.publicationYear = publicationYear;
		this.edition = edition;
		this.rating = rating;
	} // ==========end of Book constructor==========

	public String getTitle()
	{
		return title;
	}

	public String getAuthor()
	{
		return author;
	}

	public String getGenre()
	{
		return genre;
	}

	public int getPageCount()
	{
		return pageCount;
	}

	public int getPublicationYear()
	{
		return publicationYear;
	}

	public int getEdition()
	{
		return edition;
	}

	public String getRating()
	{
		return rating;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(author, edition, genre, pageCount, publicationYear, rating, title);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && edition == other.edition && Objects.equals(genre, other.genre)
				&& pageCount == other.pageCount && publicationYear == other.publicationYear
				&& Objects.equals(rating, other.rating) && Objects.equals(title, other.title);
	}
	
	/**
	 * This compareTo() method is not used.
	 */
	@Override
	public int compareTo(Book o)
	{
		int result = 0;
		
		if (this.title.compareTo(o.getTitle()) < 0)
		{
			result = -1;
		}
		else if (this.title.compareTo(o.getTitle()) > 0)
		{
			result = 1;
		}
		else
		{
			result = this.edition - o.getEdition();
		}
		
		return result;
	}
	
	@Override
	public String toString()
	{
//		return "\nBook [" + title + " by " + author + ", " + genre + ", pages: " + pageCount
//				+ ", Year: " + publicationYear + ", ed: " + edition + ", rating: " + rating + "]";
		return String.format("\nBook        %-30s%-25s%-10s%7d%6d%5d%7s", title, author, genre, 
				pageCount, publicationYear, edition, rating);
	}
	
} // ==========end of class Book==========
