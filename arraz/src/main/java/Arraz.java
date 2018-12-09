import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arraz {
    public Integer sumValuesOfArray(Integer[] arrExample) {
        Integer sum =0;
        for (Integer e: arrExample ){
            sum += e;
        }
        return sum;
    }
        // different way of doing it
    public double sumDoubleOfArray(double[] doubleAr) {
        double sum = 0;
        for(int i =0; i < doubleAr.length; i++){
            sum += doubleAr[i];
        }
        return sum;
    }

    public Integer averageOfArray(Integer[] intarr) {
        return sumValuesOfArray(intarr)/ intarr.length;
    }

    public double doubleAverageOfArray(double[] arr) {
      double value =(sumDoubleOfArray(arr)/arr.length);
      return value;
    }

    public boolean containsValue(Integer[] arr, Integer number) {
        for(Integer e : arr){
            if (e.equals(number)){
                return true;
            }
        }
        return false;
    }

    public Integer[] reverseArray(Integer[] arr) {
        Integer[] array  = new Integer[arr.length];
        for(int i=0; i < arr.length; i++){
            array[i] = arr[arr.length-1-i];
        }
        return array;
    }


    public Integer[] removeDuplicates(Integer[] arr) {
        return Stream.of(arr)
                .distinct()
                .toArray(Integer[]::new);
    }

    public double secondLargestDouble(Double[] arr) {
        TreeSet<Double> set = new TreeSet(Arrays.asList(arr));
        ArrayList<Double> list = new ArrayList(set);
        return list.get(list.size()-2);
    }

    public Integer findIndexOfValue(Integer[] arr, Integer value) {
        Integer saveIndex = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equals(value)){
                saveIndex = i;
            }
        }
        return saveIndex;
    }

    public Integer[] copyArrayByIterator(Integer[] arr) {
        Integer[] arr2 = new Integer[arr.length];
        Iterator<Integer> iterator = Arrays.asList(arr).iterator();
        int counter =0;
        while(iterator.hasNext()){
            arr2[counter] = iterator.next();
            counter++;
        }

        return arr2;
    }

    public Integer[] copyArrayByLoop(Integer[] arr) {
        Integer[] arr2 = new Integer[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public String[] removeElementFromArray(String[] arr, String element) {
        String[] arr2 = new String[arr.length-1];
        for (int i=0; i < arr.length; i++){
            if (!arr[i].equalsIgnoreCase(element)){
                arr2[i] = arr[i];
            }
        }
        return arr2;
    }

    public Integer[] insertIntoArayAt(Integer[] arr, Integer index, Integer numberToInsert) {
        arr[index] = numberToInsert;
        return arr;
    }


    public Integer[] makeArrayListToArray(ArrayList<Integer> al) {
      return  al.stream()
                .toArray(Integer[]::new);
    }

    public Integer[] evenFirstOddSecond(Integer[] arr) {
        Integer counter =0;
        Integer[] arr2 = new Integer[arr.length];
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] % 2 == 0){
                arr2[i] = arr[i];
            }

                arr2[i] = arr[i];


        }
        return arr2;
    }
}
