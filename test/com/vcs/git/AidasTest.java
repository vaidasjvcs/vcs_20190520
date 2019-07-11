package com.vcs.git;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AidasTest {
	Aidas aidas;

	@BeforeEach
	void setUp() throws Exception {
		aidas = new Aidas();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test_GetGreeting() {
		// setup
		
		// test
		String aidasSet = aidas.getGreeting("Julia ROberts");
		// assertion
		assertTrue("Pasisveikino", aidasSet.contains("Julia ROberts"));
		System.out.println(aidasSet);
	}

}
