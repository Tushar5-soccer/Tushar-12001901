import java.util.*;
abstract class Cal {
    public abstract double add(double x, double y);
    public abstract double add(double x, double y, double z);
    public abstract double sub(double x, double y);
    public abstract long fac(long l);
}
public class polymorphism {
    static Scanner sc= new Scanner(System.in);
    static String s;
    double add(double x, double y){
        return x+y;
    }
    double add(double x, double y, double z){
        return x+y+z;
    }
    double sub(double x, double y) {
        if (x > y)
            return x - y;
        else
            return y - x;
    }
    long fac(int l){
        long b=1;
        for(int i=2;i<=l;i++){
            b=i*b;
        }
        return b;
    }

    public static void main(String[] args){
        polymorphism ob= new polymorphism();
        System.out.println("Enter Your Name ");
        s= sc.nextLine();
        System.out.println("Welcome "+s);
        System.out.println("Press 1 For Addition of 2 Nos. ");
        System.out.println("Press 2 For Addition of 3 Nos. ");
        System.out.println("Press 3 For Subtraction of 2 Nos. ");
        System.out.println("Press 4 For Factorial of a Number ");
        int a=sc.nextInt();
        switch(a){
            case 1:
                System.out.println("Enter the 1st number");
                double k =sc.nextInt();
                System.out.println("Enter the 2nd number");
                double m =sc.nextInt();
                m= ob.add(k,m);
                System.out.println("Your Answer = "+m);
                break;
            case 2:
                System.out.println("Enter the 1st number");
                double g =sc.nextInt();
                System.out.println("Enter the 2nd number");
                double h =sc.nextInt();
                System.out.println("Enter the 3rd number");
                double j =sc.nextInt();
                h=ob.add(g,h,j);
                System.out.println("Your Answer = "+h);
                break;
            case 3:
                System.out.println("Enter the 1st number");
                double f =sc.nextInt();
                System.out.println("Enter the 2nd number");
                double e =sc.nextInt();
                f=ob.sub(f,e);
                System.out.println("Your Answer = "+f);
                break;
            case 4:
                System.out.println("Enter the number");
                long d =ob.fac(sc.nextInt());
                System.out.println("Your Answer = "+d);
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }

    }
}
