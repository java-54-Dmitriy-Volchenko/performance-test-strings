package telran.performance.symbols;


import telran.performance.PerformanceTest;
import telran.symbols.RemoveSymbol;

public class SymbolRemovePerformance extends PerformanceTest {
    String str;
    char symbol;
    RemoveSymbol symbolRemove;

    public SymbolRemovePerformance(String displayName, int nRuns,
            RemoveSymbol symbolRemove, String str, char symbol) {
        super(displayName, nRuns);
        this.symbolRemove = symbolRemove;
        this.str = str;
        this.symbol = symbol;
    }

    @Override
    protected void runTest() {
        symbolRemove.removeSymbol(str, symbol);
    }

}