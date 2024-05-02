package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class SongsDatabaseTest {
	
	private SongsDatabase db;
	
	@Before
	public void setUp() {
		db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Country", "Sweet Alabama");
		db.addSong("Jazz", "Always There");
	}
	
	@Test
	public void testAddSong() {
		db.addSong("Rap", "a lot");
		Set<String> rapSongs = db.getSongs("Rap");
		
		assertEquals(2, rapSongs.size());
		assertEquals(true, rapSongs.contains("Savage"));
		assertEquals(true, rapSongs.contains("a lot"));
	}
	
	@Test
	public void testGetSongs() {
		Set<String> rapSongs = db.getSongs("Rap");
		assertEquals(1, rapSongs.size());
		assertEquals(true, rapSongs.contains("Savage"));
		
		Set<String> countrySongs = db.getSongs("Country");
		assertEquals(1, countrySongs.size());
		assertEquals(true, countrySongs.contains("Sweet Alabama"));
		
		Set<String> jazzSongs = db.getSongs("Jazz");
		assertEquals(1, jazzSongs.size());
		assertEquals(true, jazzSongs.contains("Always There"));
		
		Set<String> rockSongs = db.getSongs("Rock");
		assertEquals(0, rockSongs.size());
	}

	@Test
	public void testGetGenreOfSong() {
		assertEquals("Rap", db.getGenreOfSong("Savage"));
		assertEquals("Country", db.getGenreOfSong("Sweet Alabama"));
		assertEquals("Jazz", db.getGenreOfSong("Always There"));
		assertNull(db.getGenreOfSong("After Hours"));
	}
	
	@Test
	public void testAddSongToNewGenre() {
		db.addSong("Pop", "After Hours");
		Set<String> popSongs = db.getSongs("Pop");
		assertEquals(1, popSongs.size());
		assertEquals(true, popSongs.contains("After Hours"));
	}
	
	@Test
	public void testGetSOngsForNonexistentGenre() {
		Set<String> classicalSongs = db.getSongs("Classical");
		assertEquals(0, classicalSongs.size());
	}
	
	@Test
	public void testGetGenreOfNonexistentSong() {
		assertNull(db.getGenreOfSong("Love, Love, Love"));
	}
	
	@Test
	public void testAddDuplicateSong() {
		db.addSong("Rap", "Savage");
		Set<String> rapSongs = db.getSongs("Rap");
		assertEquals(2, rapSongs.size());
		assertEquals(true, rapSongs.contains("Savage"));
	}
	
	@Test
	public void testGetSongsReturnsCopy() {
		Set<String> popSongs = db.getSongs("Pop");
		popSongs.add("After Hours");
		Set<String> updatedPopSongs = db.getSongs("Pop");
		assertEquals(1, updatedPopSongs.size());
		assertEquals(false, updatedPopSongs.contains("After Hours"));
	}
}
