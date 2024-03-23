package telran.performance.symbols;

import java.util.Random;
import telran.performance.PerformanceTest;
import telran.symbols.RemoveSymbol;

public class SymbolRemovePerformance extends PerformanceTest {
    String str;
    char symbol;
    RemoveSymbol symbolRemove;

    public SymbolRemovePerformance(String displayName, int nRuns,
            RemoveSymbol symbolRemove, String str) {
        super(displayName, nRuns);
        this.symbolRemove = symbolRemove;
        this.str = str;
        this.symbol = getRandomAsciiSymbol();
    }

    @Override
    protected void runTest() {
        symbolRemove.removeSymbol(str, symbol);
    }
//got method from chatGPT
    private char getRandomAsciiSymbol() {
        Random random = new Random();
        int randomNumber = random.nextInt(126 - 32 + 1) + 32;
        return (char) randomNumber;
    }
}