package pkgempty;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pkgempty.MyInteger;

public class TestMyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInteger() {
		MyInteger integer1 = new MyInteger(17);
		boolean a= false;
		boolean b= true;
		boolean c= true;
		
		assertEquals(integer1.isEven(),a);
		assertEquals(integer1.isOdd(),b);
		assertEquals(integer1.isPrime(),c);
		
		MyInteger integer2= new MyInteger(44);
		boolean d= true;
		boolean e= false;
		boolean f= false;
		
		assertEquals(integer2.isEven(),d);
		assertEquals(integer2.isOdd(),e);
		assertEquals(integer2.isPrime(),f);
	}

}
