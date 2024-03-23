package telran.symbols;

public class SymbolsRemoveStandard implements RemoveSymbol {

	@Override
	public String removeSymbol(String str, char symbol) {
		
		  return str.replaceAll(String.valueOf(symbol), "");
		
	}

}
