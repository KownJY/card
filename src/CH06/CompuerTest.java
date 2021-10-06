package CH06;

public class CompuerTest {
    public static void main(String[] args) {

        Computer.brand = "삼성"; //스태틱이기 대문에 바로  값에 널을 수 있다.
        System.out.println("computer brand :" + Computer.brand);

        Computer c1 = new Computer();
            c1.cpu = 10;
        System.out.println("c1.brand :" + c1.brand);

        Computer c2 = new Computer();
        c2.brand = "애플";
        c2.cpu = 20;

        System.out.println(c2);


    }
}
