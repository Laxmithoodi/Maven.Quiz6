package rocks.zipcode.io.fundamentals;


import java.util.*;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {


        // get length of string

        // get power-set of range
    // for every set in power-set
        // uppercase indices of string using set
        //array will place in out binary representation
        // of our choices
        int lengthOfInput = string.length();

        int numberOfPermut = (int) Math.pow(2, lengthOfInput);
        String[] choices = new String[numberOfPermut];

        // get range of length
        for (int i = 0; i < numberOfPermut; i++) {
            choices[i] = String.format("%0" + lengthOfInput+"d",
                    Integer.parseInt(Integer.toBinaryString(i)));
        }

        Collection<String> returnCollection = new TreeSet<>();
        for (String choice : choices) {
            // String stringToAdd = "";
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < lengthOfInput; i++) {
                if (choice.charAt(i) == '0') {

                    sb.append(Character.toLowerCase(string.charAt(i)));

                } else {
                    sb.append(Character.toUpperCase(string.charAt(i)));
                }
            }
            returnCollection.add(sb.toString());
        }
        System.out.println(returnCollection.toString());

        return returnCollection;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        String result = "";
        List<Integer> indexes = Arrays.asList(indices);
        for (int i = 0; i < string.length(); i++) {
            if (indexes.contains(i))
                result += Character.toUpperCase(string.charAt(i));
            else {
                result += string.charAt(i);
            }
        }

        return result;
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        StringBuffer sb = new StringBuffer(stringToBeManipulated);
        sb.insert(index, valueToBeInserted);
        return sb.toString();
    }


    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        StringBuffer sb = new StringBuffer(stringToBeManipulated);
        sb.setCharAt(index, replacementValue);
        return String.valueOf(sb);
    }
}