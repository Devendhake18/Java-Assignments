package Assignment2_part3;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Converter {
    public static List<String> arrayToArrayList(String[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static String[] arrayListToArray(List<String> arrayList) {
        return arrayList.toArray(new String[0]);
    }
}