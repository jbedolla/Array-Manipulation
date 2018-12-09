import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrazTest {

    Arraz az = new Arraz();

    @Test
    public void testSumValuesOfArray(){

        Arraz arrayClass = new Arraz();
        Integer[] arrExample = {5,5};
        int expected = 10;
        int actual = arrayClass.sumValuesOfArray(arrExample);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test2SumVauesOfArray(){

        Arraz arrayClass = new Arraz();
        Integer[] arrExample = {20,78,67,73,78};
        int expected = 316;
        int actual = arrayClass.sumValuesOfArray(arrExample);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSumDoublesOfArray(){

        Arraz arrayClass = new Arraz();
        double[] doubleAr = {2.0,2.1};
        double expected = 4.1;
        double actual = arrayClass.sumDoubleOfArray(doubleAr);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test2SumOfDoublesOfArray(){

        Arraz rClass = new Arraz();
        double[] dNum = {2.0,2.1,3.4,3.1};
        double expected = 10.6;
        double actual = rClass.sumDoubleOfArray(dNum);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testAvarageOfArray(){
        Arraz rClass =  new Arraz();
        Integer[] intarr = {3,6,3};
        Integer expected = 4;
        Integer actual = rClass.averageOfArray(intarr);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test2AverageOfArray(){
        Arraz rClass =  new Arraz();
        Integer[] intarr = {20,66,90,24};
        Integer expected = 50;
        Integer actual = rClass.averageOfArray(intarr);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testDoubleAverageOfArray(){
        Arraz ac = new Arraz();
        double[] arr = {2.1,2.8,1.9,9.0,5.3};
        double expected = 21.1/5;
        double actual = ac.doubleAverageOfArray(arr);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void test2DoubleAverageOfArray(){

        Arraz ac = new Arraz();
        double[] arr = {2.1,5.8,4.9,6.7,9.5,8.7};
        double expected = 37.7/6;
        double actual = ac.doubleAverageOfArray(arr);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testContainsValue(){
        Integer[] arr = {1,2,4,5,3};
        Integer number = 5;
        boolean expected = true;
        boolean actual = az.containsValue(arr,number);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void test2ContainsValue(){
        Integer[] arr = {2,4,5,6,8,9};
        Integer number = 3;
        boolean expected = false;
        boolean actual = az.containsValue(arr,number);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testReverseArray(){
        Integer[] arr = {1,2,3,4,5};
        Integer[] expected = {5,4,3,2,1};
        Integer[] actual = az.reverseArray(arr);
        Assert.assertTrue(Arrays.equals(expected,actual));
    }

    @Test
    public void test2ReverseArray(){
        Integer[] arr = {1,2,3,4,5,6,7};
        Integer[] expected = {7,6,5,4,3,2,1};
        Integer[] actual = az.reverseArray(arr);
        Assert.assertTrue(Arrays.equals(expected,actual));
    }

    @Test
    public void testgetOdd(){
        Integer[] arr = {2,3,5,7,8};
        Integer expected = 3;
        OddEven oddEven = new OddEven(arr);
        oddEven.numberOfEvenOdd();
        Integer actual = oddEven.getOddNum();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testgetEven(){
        Integer[] arr = {2,3,5,7,8};
        Integer expected = 2;
        OddEven oddEven = new OddEven(arr);
        oddEven.numberOfEvenOdd();
        Integer actual = oddEven.getEvenNum();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testRemoveDuplicates(){
        Integer[] arr = {1,1,2,2,3,3,4,4};
        Integer[] expected = {1,2,3,4};
        Integer[] actual = az.removeDuplicates(arr);
        Assert.assertTrue(Arrays.equals(expected,actual));
    }
    @Test
    public void test2RemoveDuplicates(){
        Integer[] arr = {1,3,3,3,3,3,3,3,3,3,3,3,3,3,4,4,4};
        Integer[] expected = {1,3,4};
        Integer[] actual = az.removeDuplicates(arr);
        Assert.assertTrue(Arrays.equals(expected,actual));
    }

    @Test
    public void testSecondLargestDouble() {
        Double[] arr = {1.5, 5.5, 3.2};
        Double expected = 3.2;
        Double actual = az.secondLargestDouble(arr);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test2SecondLargestDouble() {
        Double[] arr = {1.5, 5.5, 3.2,6.7,5.8};
        Double expected = 5.8;
        Double actual = az.secondLargestDouble(arr);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindIndexOfValue(){
        Integer[] arr = {1,2,3,4,5};
        Integer value =3;
        Integer expectedIndex = 2;
        Integer actual = az.findIndexOfValue(arr,value);
        Assert.assertEquals(expectedIndex,actual);
    }
    @Test
    public void testFindIndexOfValue2(){
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        Integer value =8;
        Integer expectedIndex = 7;
        Integer actual = az.findIndexOfValue(arr,value);
        Assert.assertEquals(expectedIndex,actual);
    }
    @Test
    public void testCopyArrayByIterator(){
        Integer[] arr = {1,2,3,4,5};
        Integer[] expected = {1,2,3,4,5};
        Integer[] actual = az.copyArrayByIterator(arr);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testCopyArrayByLoop(){
        Integer[] arr = {1,2,3,4,5};
        Integer[] expected = {1,2,3,4,5};
        Integer[] actual = az.copyArrayByLoop(arr);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeElementFromArray(){
        String[] arr = {"hola","me", "llamo", "jose"};
        String element = "jose";
        String[] expected = {"hola","me","llamo"};
        String[] actual = az.removeElementFromArray(arr,element);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testInsertIntoArrayAt(){
        Integer[] arr = {1,2,3,4,5};
        Integer index = 2;
        Integer numberToInsert = 10;
        Integer[] expected = {1,2,10,4,5};
        Integer[] actual = az.insertIntoArayAt(arr,index,numberToInsert);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void findMaxNumOfArray(){
        Integer[] arr = {12,34,5,767,85,34,1,34,34,1,767};
        MaxMin m = new MaxMin(arr);
        Integer expected = 767;
        m.findMaxMin(arr);
        Integer actual = m.getMax();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void findMinNumOfArray(){
        Integer[] arr = {12,34,5,767,85,34,1,34,34,1,767};
        MaxMin m = new MaxMin(arr);
        Integer expected = 1;
        m.findMaxMin(arr);
        Integer actual = m.getMin();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void makeArrayListArray(){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(4);
        Integer[] expected = {3,4};
        Integer[] actual = az.makeArrayListToArray(al);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void putAllEvenFirstOddAfter(){
        Integer[] arr = {5,7,11,2,4,6};
        Integer[] expected = {2,4,6,5,7,11};
        Integer[] actual = az.evenFirstOddSecond(arr);
        Assert.assertEquals(expected,actual);
    }

}
