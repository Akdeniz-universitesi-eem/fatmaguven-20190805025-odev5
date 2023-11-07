
public class soru4 {

	public static void main1(String[] args) {
		
	}
    public static String changeCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String originalText = "AKdenİZunİVERsiteSi";
        String newText = changeCase(originalText);
        System.out.println(newText); 
    }

}
