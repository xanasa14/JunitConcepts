import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringHelperTest {
	StringHelper helper = new StringHelper();

	@Test
	public void TesttruncateAInFirst2Positions_AinFirstTwoPositions() {
		// expected actual
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	@Test
	public void TesttruncateAInFirst2Positions_AinFirstTwoPositions_AinOnlyFirstPosition() {
		// expected actual
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));		
	}
	
	@Test 
	public void TestareFirstAndLastTwoCharactersTheSame() {
		boolean actualValue = helper.areFirstAndLastTwoCharactersTheSame("ABCD"); 
		boolean expectedValue = false; 
		assertEquals(expectedValue, actualValue);
	}

}
