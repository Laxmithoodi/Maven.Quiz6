package rocks.zipcode.io.fundamentals;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {

        return new String(chars);
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        StringBuffer sb = new StringBuffer();
        for(Character c :chars){
            sb.append(c);
        }

        return String.valueOf(sb);
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {

        return string.replaceAll("[AEIOUaeiou]", "");
    }

//        StringBuffer sb = new StringBuffer();
//        for(int i=0; i<string.length(); i++){
//            char c = string.charAt(i);
//                if(!isVowel(c)){
//                    sb.append(c);
//                }
//            }
//
//        return sb.toString();
//    }
//
//    private static boolean isVowel(char c) {
//
//        char[] vowels = {"a", "e", "i", "o", "u"}
//    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {

         return  string.replaceAll("[" + charactersToRemove + "]", "");


    }
}
