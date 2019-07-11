package com.vcs.git;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AidasTest {
Aidas aidas;
	@BeforeEach
	void setUp() throws Exception {
		aidas = new Aidas();
	}

	@Test
	void test_getGreeting() {
		//setup
		
		// test
		String strName = aidas.getGreeting("Julia Roberts");
		System.out.println(strName);
		//assert
		assertTrue(strName.contains("Julia Roberts"));
	}

}
