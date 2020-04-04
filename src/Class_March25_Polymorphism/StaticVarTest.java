package Class_March25_Polymorphism;

public class StaticVarTest {
    public static void main(String[] args) {
        StaticVar o1= new StaticVar(); //b1 & a
        StaticVar.getA();
        o1.getB();
        StaticVar o2= new StaticVar(); //b2 & a
        StaticVar.getA();
        o2.getB();
        StaticVar o3= new StaticVar(); //b3 & a
        StaticVar.getA();
        o3.getB();

        /*
        System.out.println("b="+o1.b);
        System.out.println("a="+StaticVar.a);
        System.out.println("b="+o2.b);
        System.out.println("a="+StaticVar.a);

        StaticVar.getA();
        o1.getB();
        StaticVar.getA();
        o2.getB();

         */


    }
}
