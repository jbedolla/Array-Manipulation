import java.util.*;

public class MaxMin {

    Integer[] arr;
    Integer max=0;
    Integer min=0;

    public MaxMin(Integer[] arr) {
    this.arr=arr;
    }

    public MaxMin(Integer max, Integer min) {
        this.max = max;
        this.min = min;
    }

    public void findMaxMin(Integer[] arr){
        Arrays.sort(arr);
        max = arr[arr.length-1];
        min = arr[0];
    }

    public Integer getMax() {
        return max;
    }

    public Integer getMin() {
        return min;
    }
}
