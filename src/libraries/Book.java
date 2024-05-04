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

import java.util.Objects;

/**
 * 
 */
public class Book implements Comparable<Book>
{
	private String title;
	private String author;
	private String genre;
	private int pageCount;
	private int publicationYear;
	private int edition;
	private String rating; // Assume one of: G, PG, PG-13, R
	
	// Constructor
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
	 * This is the doc for the compareTo() method in Book class.
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
		return "\nBook [title=" + title + ", author=" + author + ", genre=" + genre + ", pageCount=" + pageCount
				+ ", publicationYear=" + publicationYear + ", edition=" + edition + ", rating=" + rating + "]";
	}
	
} // ==========end of class Book==========
