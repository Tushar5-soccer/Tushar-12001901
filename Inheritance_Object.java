interface A {
    int a=5;
    void print();
}

interface B extends A {
    int b=a+a;

}
interface C extends A {
    int c=2+a;
}
interface D extends B, C {
    int s= c+b;
}
public class Inheritance_Object implements D{
    public void print(){
        System.out.println("a "+a);
        System.out.println("b "+b);
        System.out.println("c "+c);
        System.out.println("s "+s);
    }
    public static void main(String[] args){
        Inheritance_Object ob = new Inheritance_Object();
        ob.print();
    }
}
