package org.word.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WordDAOTest {

	WordDAO dao;
	
	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void test() {
		assertNotNull(dao);
		
		Word word = dao.getWords()[0];
		assertEquals(word.getAnswer(), "experience");
		assertEquals(word.getDesc(), "∞Ê«Ë");
		
		fail("Not yet implemented");
	}

}
