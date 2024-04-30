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
	private List<Object> items;
	
	public Library()
	{
		items = new ArrayList<>();
	}
	
	public void addItem(Object item)
	{
		items.add(item);
	}
}
