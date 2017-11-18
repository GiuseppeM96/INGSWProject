import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MinTests {
	
	private static TestingClass istance;
	
	@BeforeClass
	public static void init() {
		istance=new TestingClass(8);
	}
	
	@After
	public void clear() {
		for (int i = 0; i < istance.array.length; i++) {
			(istance.array)[i]=0;
		}
	}
	
	@Test
	public void minWorks() {
		int[] a={8,2,6,9,4,5,3,7};
		istance.array=a;
		Assert.assertEquals(2,istance.min());
	}
	
	@Test
	public void minOccWorks() {
		int[] a={8,2,6,9,2,5,3,7};
		istance.array=a;
		Assert.assertEquals(4,istance.min());
	}
}
