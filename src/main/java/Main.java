

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

       // obj.name= "Vishal";
        //  name has private access in RWOnly
         obj.setName("Vishal");

        System.out.println( obj.getName());
    }

}