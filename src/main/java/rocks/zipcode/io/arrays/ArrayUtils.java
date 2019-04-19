package rocks.zipcode.io.arrays;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {

        List<Integer> list = new ArrayList<>();

        for(int i= start; i<=end; i++){
            list.add(i);
        }
        return list.toArray(new Integer[list.size()]);

//
//        if(end < start)
//            return null;
//
//        Integer[] ret = new Integer[++end - start];
//        for (int i=0; start < end; )
//            ret[i++] = start++;
//        return ret;

    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {

        char[] unbox = new char[array.length];
        for (int i=0; i<unbox.length; i++){
            unbox[i] = array[i];
        }


        return unbox;

    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {

        Character[] box = new Character[array.length];
        for(int i=0; i<box.length; i++){
            box[i] = array[i];
        }

        return box;
    }
}
