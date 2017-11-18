import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class MinTest {

	private static TestingClass tester;

	@BeforeClass
	public static void init() {
		tester = new TestingClass(10);
		Assert.assertEquals(10, tester.array.length);
	}

	@Before
	public void clear() {
		for (int i = 0; i < 10; i++)
			tester.array[i] = 0;
	}

	@Test
	public void test_min() {
		System.out.println("testo il min");
		
		for (int i = 0; i < 10; i++)
			tester.array[i] = i;
		Assert.assertEquals(0, tester.min_zav());
	}
	
	@Test
	public void test_min_with_negative() {
		System.out.println("testo il min con i negativi");

		for(int i=0;i<10;i++)
			tester.array[i]=i-100;
		Assert.assertEquals(-100, tester.min_zav());
	}
	
	@Test
	public void test_with_big_number() {
		System.out.println("testo il min con i numeri enormi");

		for(int i=0;i<10;i++)
			tester.array[i]=(-i)*10000;
		Assert.assertEquals(tester.min_zav(),10000*(-9));
	}

	
}
