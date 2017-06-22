import java.util.*;


public class Order {
  public static String order(String string) {
		List<Character> numbers = new ArrayList<Character>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
		StringTokenizer st = new StringTokenizer(string);
		String[] stringWords = new String[st.countTokens()];
		
		while (st.hasMoreTokens()) {
			String currentWord = st.nextToken();
			for (int i = 0; i < currentWord.length(); i++) {
				if (numbers.contains(currentWord.charAt(i))) {
					stringWords[numbers.indexOf(currentWord.charAt(i))] = currentWord;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (String s: stringWords) {
			sb.append(s + ' ');
		}
		return sb.toString().trim();
    }

}
