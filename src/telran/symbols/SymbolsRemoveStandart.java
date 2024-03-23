package telran.symbols;

public class SymbolsRemoveStandart implements RemoveSymbol {

	@Override
	public String removeSymbol(String str, char symbol) {
		
		  return str.replaceAll(String.valueOf(symbol), "");
		
	}

}
