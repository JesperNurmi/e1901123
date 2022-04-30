package e1901123.maveproject;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testAdd()
    {
    	int sum = App.add(6, 4);
    	assertEquals(10, sum);
    }
    @Test
    public void testAdd2()
    {
    	int sum = App.add(0, 0);
    	assertEquals(0, sum);
    }
    @Test
    public void testAdd3()
    {
    	int sum = App.add(-6, 6);
    	assertEquals(0, sum);
    }
	@Test
    public void testDivide()
    {
    	double result = App.divide(4, 3);
    	assertEquals(1.33, result,0.01);
    }
	@Test
    public void testDivide2()
    {
    	double result = App.divide(0, 1);
    	assertEquals(0, result,0.001);
    }
	@Test
    public void testDivide3()
    {
    	double result = App.divide(1, 0);
    	assertEquals(null,result,0.01);
    	}
	@Test
    public void test2chars()
    {
    	String result = App.returnTwoChars("qwerty");
    	assertEquals("qw",result);
    	}
	@Test
    public void test2chars2()
    {
    	String result = App.returnTwoChars("VA");
    	assertEquals("VA",result);
    	}
	@Test
    public void test2chars3()
    {
    	String result = App.returnTwoChars("");
    	assertEquals("",result);
    	}
	
}
