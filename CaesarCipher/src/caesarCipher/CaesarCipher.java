package caesarCipher;

public class CaesarCipher {
	
	public static String cipher(String input, int key) {
		StringBuilder encrypted = new StringBuilder("");
		String alphabetCapital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alphabetLowerCase = "abcdefghijklmnopqrstuvwxyz";
		String shiftedAlphabetCapital = alphabetCapital.substring(key) + alphabetCapital.substring(0,  key);
		String shiftedAlphabetLowerCase = alphabetLowerCase.substring(key) + alphabetLowerCase.substring(0,  key);
		
		for (int i = 0; i < input.length();i++) {
			int indexCapital = alphabetCapital.indexOf(input.charAt(i));
			int indexLowerCase = alphabetLowerCase.indexOf(input.charAt(i));
			
			if (indexCapital != -1) {
				encrypted.append(shiftedAlphabetCapital.charAt(indexCapital));
			} else if (indexLowerCase != -1){
				encrypted.append(shiftedAlphabetLowerCase.charAt(indexLowerCase));
			} else {
				encrypted.append(input.charAt(i));
			}
			
		}
		return (encrypted.toString());
	}

}
