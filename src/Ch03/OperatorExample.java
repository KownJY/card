package Ch03;

public class OperatorExample {
    public static void main (String[] args){

        int n1 = 10;
        int n2 = 3;

        int result = n1+n2;
        System.out.printf("%d+%d = %d\n", n1,n2, result);
        System.out.println(n1 + "+" + n2 + " =" + result);

        boolean b = n1<n2;
        System.out.println(b);
    }
}
