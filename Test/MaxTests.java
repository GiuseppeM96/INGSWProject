import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class MaxTests {
	
	private static TestingClass istance;
	private int[] a;
	private int result;
	
	public MaxTests(int[] a) {
		this.a=a;
	}
	@BeforeClass
	public static void init() {
		istance=new TestingClass(8);
	}
	
	@Before
	public void intArrays() {
		int[] b=new int[a.length-1];
		for (int i = 0; i < b.length; i++) {
			b[i]=a[i];
		}
		result=a[a.length-1];
		a=b;
		System.out.println(a+" "+result);
		
	}
	
	@After
	public void clear() {
		for (int i = 0; i < istance.array.length; i++) {
			(istance.array)[i]=0;
		}
	}
	
	@Test
	public void maxWorks() {
		istance.array=a;
		Assert.assertEquals(result,istance.max());
	}
	
	@Parameters
	public static List<Object[]> data(){
		int[] a={1,2,3,4,5,5};
		int[] b={3,2,1,6,4,6};
		return Arrays.asList(new Object[][]{
				{a},{b}
			});
	}
}
