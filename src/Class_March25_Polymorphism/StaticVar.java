package Class_March25_Polymorphism;

public class StaticVar {
    static int a=0; // a is not part of the object
    int b=0;        // b is part of the object
    public StaticVar(){
        this.a++;
        this.b++;
    }
    public static void getA(){
        System.out.println("a= " + a);
    }
    public void getB(){
        System.out.println("b= " + this.b);
    }

}
