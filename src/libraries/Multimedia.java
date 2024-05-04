/**
* File:         Multimedia.java
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
public class Multimedia implements Comparable<Multimedia>
{
	private String title;
	private String authorPublisher;
	private String type; // Assume one of: CD, DVD, Audio, Video
	private int duration; // Minutes
	private int publicationYear;
	private int edition;
	private String rating; // Assume one of: G, PG, PG-13, R
	
	// Constructor
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

	@Override
	public int hashCode()
	{
		return Objects.hash(authorPublisher, duration, edition, publicationYear, rating, title, type);
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
		Multimedia other = (Multimedia) obj;
		return Objects.equals(authorPublisher, other.authorPublisher) && duration == other.duration
				&& edition == other.edition && publicationYear == other.publicationYear
				&& Objects.equals(rating, other.rating) && Objects.equals(title, other.title)
				&& Objects.equals(type, other.type);
	}
	
	@Override
	public String toString()
	{
		return "\nMultimedia [title=" + title + ", authorPublisher=" + authorPublisher + ", type=" + type + ", duration="
				+ duration + ", publicationYear=" + publicationYear + ", edition=" + edition + ", rating=" + rating
				+ "]";
	}

	@Override
	public int compareTo(Multimedia o)
	{
		
		return 0;
	}
	
} // ==========end of class Multimedia==========
