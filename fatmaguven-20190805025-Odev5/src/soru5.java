
public class soru5 {

	public static void main(String[] args) {
		String originalText = "FatmaGUVEN";
        String charactersToRemove = "aeiouAEIOU"; 
        String squeezedText = squeeze(originalText, charactersToRemove);
        System.out.println(squeezedText);

	}
	 public static String squeeze(String text, String charactersToRemove) {
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < text.length(); i++) {
	            char c = text.charAt(i);

	            if (charactersToRemove.indexOf(c) == -1) {
	                result.append(c);
	            }
	        }

	        return result.toString();
	    }
	
}
