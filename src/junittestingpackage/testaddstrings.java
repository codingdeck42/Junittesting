package junittestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstrings {

	@Test
	public void test() {
		junitfunction junit=new junitfunction();
		String result=junit.addstr("abc","def");
		assertEquals ("abcdef",result);
	}

}
