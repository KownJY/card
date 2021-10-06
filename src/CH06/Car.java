package CH06;

public class Car {
    public String getNm() {
        return nm;
    }

    Car(String nm, String brand) {
        this.nm = "안녕";
        this.brand = "너의차";
    }


    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String nm;
    private String brand;



    public void  drive()
    {
        System.out.printf("%s 의 %s 가 달린다.\n",nm,brand);
    }
    public void  stop()
    {
        System.out.printf("%s 의 %s 가 멈춘다.\n",nm,brand);
    }


}
