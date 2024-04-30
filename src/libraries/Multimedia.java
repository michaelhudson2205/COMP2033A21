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
public class Multimedia 
{
	private String title;
	private String authorPublisher;
	private String type; // Assume one of: CD, DVD, Audio, Video
	private int duration; // Minutes
	private int publicationYear;
	private int edition;
	private String rating; // Assume one of: G, PG, PG-13, R
	
	public Multimedia(String title, String authorPublisher, String type, int duration, int publicationYear, int edition,
			String rating) 
	{
		this.title = title;
		this.authorPublisher = authorPublisher;
		this.type = type;
		this.duration = duration;
		this.publicationYear = publicationYear;
		this.edition = edition;
		this.rating = rating;
	}

	public String getTitle()
	{
		return title;
	}

	public String getAuthorPublisher()
	{
		return authorPublisher;
	}

	public String getType()
	{
		return type;
	}

	public int getDuration()
	{
		return duration;
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

	public void setAuthorPublisher(String authorPublisher)
	{
		this.authorPublisher = authorPublisher;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public void setDuration(int duration)
	{
		this.duration = duration;
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
	
	
	
	
	
} // ==========end of class Multimedia==========
