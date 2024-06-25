public class Main {
    public static void main(String[] args) {
        // Reverse the String
       String message = "Stay Hard!";

       StringBuilder newString = new StringBuilder();

       for (int i = message.length() - 1; i >= 0; i--) {
           char addChar = message.charAt(i);
           newString.append(addChar);
       }

        System.out.println(newString);
    }
}