import static org.junit.Assert.*;
import org.junit.Test;

public class testVecteur {

	@Test
	public void testVecteur() {
		
		// fail("Not yet implemented");
		boolean test = false;
		// test/1
		vecteur v = new vecteur(1,1);
		test = ( v.getx()==1 && v.gety()==1 ) ;
		assertTrue(test);
	}

	@Test
	public void testNorme() {
		//fail("Not yet implemented");
		boolean test = false;
		// test/2
		vecteur v = new vecteur(1, 1);
		test = ( ( Math.sqrt(2) - v.norme() ) < 1E-10 );
		assertTrue( test );
	}

}
