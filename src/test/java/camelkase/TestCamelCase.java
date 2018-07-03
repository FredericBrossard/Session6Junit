package camelkase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCamelCase {

	@Test
	public void TransfoCamelNull() {
		
		assertEquals(null, CamelCase.TransfoCamelNull(null));
		
	}

	@Test
	public void TransfoCamelVide() {
		
		assertEquals(null, CamelCase.TransfoCamelNull(" "));
		
	}
	
	@Test
	public void TransfoCamelTiret() {
				
		assertEquals("FranceBresil", CamelCase.TransfoCamelNull("FRANCE-BRESIL"));

	}
	
	@Test
	public void TransfoCamel3mots() {
				
		assertEquals("FranceBresilEndemifinal", CamelCase.TransfoCamelNull("FRANCE BRESIL endemifinal"));

	}
}
