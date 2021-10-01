package Ch05;

public class ArrExample {
    public static void main(String[] args) {

        int[] arr =  new int[7];
        int Mult = 100;
        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            sum = sum+ Mult;
            arr[i] =  sum;
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
