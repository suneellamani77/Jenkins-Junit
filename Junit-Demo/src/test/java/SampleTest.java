import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleTest {
	
	boolean isPunched=false;
	
	@Before
	public  void executeFirst() {
		System.out.println("before method");
	}
	
	@Test
	public void tes3() {
		int a=3;
		int b=3;
		Assert.assertEquals("Its not true",6,a+b);
	}
	

	@Test
	public void tes1() {
		double a=2.5;
		int b=3;
		int res=(int) (a+b);
		Assert.assertEquals("ghanta true hai",true, res==5);
	}	
	
	@Test
	public void tes2() {
		Assert.assertEquals("Both are not equal","Suneel","Suneel");
	}
	
	@Test
	public void tes4() {
		Assert.assertEquals("Both are not equal","Suneel","Suneel");
	}
	
	@BeforeClass
	public static void executebeforeClass() {
		System.err.println("before class");
	}
	
}
