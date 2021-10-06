package CH06;

public class Primiti {
    public static void main(String[] args) {

//        int val = 10;
//        Box box = new Box();
//        box.val = 10;
//
//        Box box2 = box;
//        box2.val =20;
//
//        box2 = new Box();
//
//        System.out.println("val : " + val);
//        chanageVal(val);
//        System.out.println("val : " + val);
//
//        System.out.println("-------------------");
//
//        System.out.println("box.val : " + box2.val);
//        chanageVal(box);
//        System.out.println("box.val : " + box2.val);
//
//    }
//
//
//    public  static void chanageVal(int val)
//    {
//        val = 30;
//    }
//    public  static void chanageVal(Box box)
//    {
//        box.val = 30;
//    }
        String name = new String("김영태");
        System.out.println(name);
       name =  changeName(name);
        System.out.println(name);



}

public static String changeName (String a)
{
    a = "안녕하세여";
    return a;
}
}


class Box{

    public int val;



}
