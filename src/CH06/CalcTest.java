package CH06;

public class CalcTest {
    public static void main(String[] args) {

        int result = StaticCalc.sum(10,20);
        System.out.println("static sum : " + result);

        Calc cal = new Calc();
        cal.n1 = 10;
        cal.n2 = 20;





        int result2 = cal.sum();
        System.out.println("imstamce sum : " + result2);
    }
}
