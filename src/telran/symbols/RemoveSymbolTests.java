package telran.symbols;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class RemoveSymbolTests {

	@Test
	void SymbolRemoveTest() {		
		
		 SymbolsRemoveCharArray symbolsRemoveCharArray = new SymbolsRemoveCharArray();
	
		 assertEquals("Hllo!", symbolsRemoveCharArray.removeSymbol("Hello!", 'e') );
		 assertEquals("Heo!", symbolsRemoveCharArray.removeSymbol("Hello!", 'l') );
		 assertEquals("Hello!", symbolsRemoveCharArray.removeSymbol("Hello!", ' ') );
		 assertEquals("Hello!", symbolsRemoveCharArray.removeSymbol("Hello!", '@') );
		 assertEquals("Hello!", symbolsRemoveCharArray.removeSymbol("Hello!", 'E') );
		 assertEquals("Hello!", symbolsRemoveCharArray.removeSymbol("Hello!", '3') );
		 assertEquals("Hello!", symbolsRemoveCharArray.removeSymbol("Hello3!", '3') );
		 
		 SymbolsRemoveStandart symbolsRemoveStandart = new SymbolsRemoveStandart();
			
		 assertEquals("Hllo!", symbolsRemoveStandart.removeSymbol("Hello!", 'e') );
		 assertEquals("Heo!", symbolsRemoveStandart.removeSymbol("Hello!", 'l') );
		 assertEquals("Hello!", symbolsRemoveStandart.removeSymbol("Hello!", ' ') );
		 assertEquals("Hello!", symbolsRemoveStandart.removeSymbol("Hello!", '@') );
		 assertEquals("Hello!", symbolsRemoveStandart.removeSymbol("Hello!", 'E') );
		 assertEquals("Hello!", symbolsRemoveStandart.removeSymbol("Hello!", '3') );
		 assertEquals("Hello!", symbolsRemoveStandart.removeSymbol("Hello3!", '3') );
	}

}
