import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MaxTest {

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
	public void test_max() {
		
		System.out.println("testo il max");

		for (int i = 0; i < 10; i++) {

			Assert.assertEquals(tester.array[i], 0);
			tester.array[i] = i;
		}
		Assert.assertEquals(9, tester.max());
	}

	@Test
	public void test_with_negative() {
		System.out.println("testo il max con i negativi");

		for (int i = 0; i < 10; i++) {
			Assert.assertEquals(tester.array[i], 0);
			tester.array[i] = i - 5;
		}
		Assert.assertEquals(4, tester.max_zav());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void add_no_space() {
		System.out.println("testo l'aggiunta non consentita");
		tester.array[10] = 1;
	}

}
