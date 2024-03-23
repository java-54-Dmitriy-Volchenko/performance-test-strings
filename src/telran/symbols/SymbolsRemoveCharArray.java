package telran.symbols;

public class SymbolsRemoveCharArray implements RemoveSymbol {

	@Override
	public String removeSymbol(String str, char symbol) {
		  char[] arrayFromString = str.toCharArray();
		  char[] newArray = new char[arrayFromString.length];
		  int index = 0;
		  
		  for (int i = 0; i<arrayFromString.length; i++) {
			  if (arrayFromString[i] != symbol) {
	                newArray[index] = arrayFromString[i];
	                index++;
	            }
		  }
		return new String(newArray, 0, index);
	}

}
