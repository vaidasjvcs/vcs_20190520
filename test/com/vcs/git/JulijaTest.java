package com.vcs.git;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JulijaTest {

	@Test
	public void test_sayHello() {
		// setup
		Julija object = new Julija();

		// test
		String result = object.sayHello("Rytis");

		// assertions
		assertEquals("Hello, Rytis, I am Julija, it is nice to meet you!", result);
	}
//	
	
}
