package org.howard.edu.lsp.oopfinal.question1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {

	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();

	/* Add a song title to a genre */
	public void addSong(String genre, String songTitle) {
		// Code it!!
		if (!map.containsKey(genre)) 
		{
			map.put(genre,  new HashSet<String>());
		}
		
		map.get(genre).add(songTitle);
	}

	/* Return genre, i.e., jazz, given a song title */
	public String getGenreOfSong(String songTitle) {
		// Code it!!
		for (Map.Entry<String, Set<String>> entry : map.entrySet())
		{
			if (entry.getValue().contains(songTitle))
			{
				return entry.getKey();
			}
		}
		
		return null;
	}

		    
	/* Return the Set that contains all songs for a genre */
	public Set<String> getSongs(String genre) {
		// Code it!!
		return map.getOrDefault(genre, null);
	}


}
