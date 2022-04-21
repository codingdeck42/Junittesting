package junittestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		junitfunction junit=new junitfunction();
		int result=junit.addnumber(100, 200);
		assertEquals (300,result);
	}

}
