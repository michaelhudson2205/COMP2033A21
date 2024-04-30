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

/**
 * 
 */
public class Book 
{
	private String title;
	private String author;
	private String genre;
	private int pageCount;
	private int publicationYear;
	private int edition;
	private String rating; // Assume one of: G, PG, PG-13, R
	
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
	}

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

	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public void setPageCount(int pageCount)
	{
		this.pageCount = pageCount;
	}

	public void setPublicationYear(int publicationYear)
	{
		this.publicationYear = publicationYear;
	}

	public void setEdition(int edition)
	{
		this.edition = edition;
	}

	public void setRating(String rating)
	{
		this.rating = rating;
	}
	
} // ==========end of class Book==========
