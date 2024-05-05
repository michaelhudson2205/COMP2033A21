/**
* File:         Multimedia.java
* Description:  Project 1: Sorting Algorithms - Multimedia Class
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
 * Class that represents a multimedia item.
 */
public class Multimedia implements Comparable<Multimedia>
{
	// Data Fields
	private String title;
	private String authorPublisher;
	private String type;
	private int duration;
	private int publicationYear;
	private int edition;
	private String rating;
	
	// Methods
	/**
	 * Initialises a Multimedia object with all properties specified.
	 * @param title The title, or name, of the multimedia item.
	 * @param authorPublisher The author or publisher.
	 * @param type The type of multimedia item (e.g. CD, DVD, Audio, Video)
	 * @param duration The duration in minutes.
	 * @param publicationYear The year published or released.
	 * @param edition The edition of the item.
	 * @param rating The applicable rating (G, PG, PG-13, R)
	 */
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
	public int compareTo(Multimedia o)
	{
		
		return 0;
	}
	
	@Override
	public String toString()
	{
//		return "\nMultimedia [" + title + " by " + authorPublisher + ", " + type + ", mins: "
//				+ duration + ", Year: " + publicationYear + ", ed: " + edition + ", rating: " + rating
//				+ "]";
		return String.format("\nMultimedia  %-30s%-25s%-10s%7d%6d%5d%7s", title, authorPublisher, type, 
				duration, publicationYear, edition, rating);
	}
	
} // ==========end of class Multimedia==========
