public class StringManipulator { 
	public String trimAndConcat(String cadena1, String cadena2) {
		cadena1 = cadena1.trim();
		cadena2 = cadena2.trim();
		return cadena1 + cadena2;
	}

	public int getIndexOrNull(String cadena, char letra) {
		return cadena.indexOf(letra);
	}

	public int getIndexOrNull(String cadena, String subCadena) {
		return cadena.indexOf(subCadena);
	}

	public String concatSubstring(String cadena, int inicio, int fin, String cadena2) {
		return cadena.substring(inicio, fin) + cadena2;
	}

}