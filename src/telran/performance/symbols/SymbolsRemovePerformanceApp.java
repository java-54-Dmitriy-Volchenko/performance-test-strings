package telran.performance.symbols;

import java.util.Random;


import telran.symbols.RemoveSymbol;
import telran.symbols.SymbolsRemoveCharArray;
import telran.symbols.SymbolsRemoveStandart;

public class SymbolsRemovePerformanceApp {
	private static final int N_SYMBOLS = 1000000;
	private static final int N_RUNS = 100;

	public static void main(String[] args) {
		String str =  getRandomAsciiString(N_SYMBOLS);
		char symbol = getRandomAsciiSymbol(); 

		SymbolRemovePerformance testRemoveCharArray = getTest("test of SymbolsRemoveCharArray", N_RUNS, new SymbolsRemoveCharArray(), str,symbol);
		SymbolRemovePerformance testRemoveStandart = getTest("test of SymbolRemoveStandart", N_RUNS, new SymbolsRemoveStandart(), str, symbol);
				
		testRemoveCharArray.run();
		testRemoveStandart.run();
	}
	
	private static SymbolRemovePerformance getTest(String displayName, int nRuns,  
	        RemoveSymbol symbolRemove, String str, char symbol) {      
	    return new SymbolRemovePerformance(displayName, nRuns, symbolRemove, str, symbol);
	}
	
	
	//got from chatGPT
	public static String getRandomAsciiString(int length) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);       
        for (int i = 0; i < length; i++) {
            char randomChar = (char) (random.nextInt(126 - 32 + 1) + 32);
            stringBuilder.append(randomChar);
        }

        return stringBuilder.toString();
    }
	
	  public static char getRandomAsciiSymbol() {
	        Random random = new Random();
	        int randomNumber = random.nextInt(126 - 32 + 1) + 32;
	        return (char) randomNumber;
}

}