import org.junit.jupiter.api.Test;

import com.example.Cessar3;
import com.example.Cessar5;
import com.example.Cryptographer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CrTest {
	@Test
	public void testCrCes5_1(){
		Cryptographer cg = new Cryptographer(new Cessar5());
		assertEquals("fgh",cg.encrypt("abc"));
	}

	@Test
	public void testCrCes5_2(){
		Cryptographer cg = new Cryptographer(new Cessar5());
		assertEquals("cde", cg.encrypt("xyz"));
	}

	@Test
	public void testDeCrCes5_1(){
		Cryptographer cg = new Cryptographer(new Cessar5());
		assertEquals("abc", cg.deEncrypt("fgh"));
	}

	@Test
	public void testDeCrCes5_2(){
		Cryptographer cg = new Cryptographer(new Cessar5());
		assertEquals("xyz", cg.deEncrypt("cde"));
	}

	@Test
	public void testCrCes3_1(){
		Cryptographer cg = new Cryptographer(new Cessar3());
		assertEquals("def",cg.encrypt("abc"));
	}

	@Test
	public void testCrCes3_2(){
		Cryptographer cg = new Cryptographer(new Cessar3());
		assertEquals("abc", cg.encrypt("xyz"));
	}

	@Test
	public void testDeCrCes3_1(){
		Cryptographer cg = new Cryptographer(new Cessar3());
		assertEquals("abc", cg.deEncrypt("def"));
	}

	@Test
	public void testDeCrCes3_2(){
		Cryptographer cg = new Cryptographer(new Cessar3());
		assertEquals("xyz", cg.deEncrypt("abc"));
	}
}
