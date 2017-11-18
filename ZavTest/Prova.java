import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Prova {

	private int i;
	private int j;

	public Prova(int i, int j) {
		this.i = i;
		this.j = j;

	}

	public boolean check() {
		return i == j;
	}
	
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 
        	{ 0, 0 }, { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 }, { 5, 5 }, { 6, 6 }  
           });
    }
    
    @Test
    public void check_all() {
    	Assert.assertTrue(check());
    }
    
}
