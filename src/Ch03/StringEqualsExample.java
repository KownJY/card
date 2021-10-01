package Ch03;

public class StringEqualsExample {
    public static void main(String[] args) {
        //문자열값 비교에 == 으로 하면 안됨

       String position = new String("대리");

       switch (position)
       {
           case "부장" :
               System.out.println("월급이 700만원");
               break;
           case "과장":
               System.out.println("월급이 500만원");
               break;
           default:
               System.out.println("월급이 300만원");
               break;


       }

    }
}
