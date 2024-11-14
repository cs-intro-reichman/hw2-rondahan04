// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheers = args[0];
            int times= Integer.parseInt(args[1]);
            int cheersLength = cheers.length();
            char currentLetter = ' ';
            int exists;
            String badWords = "AEFHILMNORSX";
            for (int i = 0 ; i < cheersLength; i++){
                currentLetter = cheers.charAt(i);
                currentLetter=Character.toUpperCase(currentLetter);
                exists = badWords.indexOf(currentLetter);
                  if (exists>=0) {
                        System.out.println("Give me an " +  currentLetter +": " +currentLetter + "!");
                }
                if (exists<0){
                        System.err.println("Give me a  " +  currentLetter +": " +currentLetter + "!");
                }
            }
            System.out.println("What does that spell?");
            cheers = cheers.toUpperCase();
            for (int i=0;i<times;i++){
                System.out.println(cheers + "!!!");
                  }
        }
}
