public class OddEven {

    public Integer odd = 0;
    public Integer even = 0;
    private Integer[] arr;

    public OddEven(Integer odd, Integer even) {
        this.even = even;
        this.odd = odd;
    }

    public OddEven(Integer[] arr) {
        this.arr = arr;
    }
     public void numberOfEvenOdd(){
        for (Integer e : arr){
            if (e % 2 == 0){
                even = even + 1;
            }else{
                odd = odd + 1;
            }
        }
     }

     public Integer getEvenNum(){
        return even;
     }

     public Integer getOddNum(){
        return odd;
     }




}
