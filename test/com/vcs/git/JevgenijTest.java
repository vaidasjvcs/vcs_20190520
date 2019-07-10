package com.vcs.git;

import static org.junit.Assert.assertSame;
import org.junit.jupiter.api.Test;

public class JevgenijTest {

	@Test
	void test_helloNamen() {
		// setup
		Jevgenij jevgenij = new Jevgenij();
		
		String name = "Cthulhu";
		
		//test && assertions
		assertSame("Cthulhu", jevgenij.helloName(name));

		
		
}
}
