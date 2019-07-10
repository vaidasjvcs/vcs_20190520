import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.vcs.git.DominykasK;

public class DominykasKTest {

	@Test
	public void test_gitDone() {

		DominykasK test = new DominykasK();

		String rez = test.gitDone("Antonio");

		// true
		assertEquals("Hello, Antonio, I am Dominykas, it is nice to meet you!", rez);
	}
}
