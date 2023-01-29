import java.util.Scanner;

public class Encapsulation {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        flipkart ob=new flipkart();
        System.out.println("Enter Amount ");
        double x=sc.nextInt();
        double payAmt= ob.transaction(x);
        System.out.println("The Total Amount to be paid is = "+payAmt);

    }
}
class flipkart {
    double transaction(double amt) {
        phonePay obj = new phonePay();
        amt= amt+(amt*obj.getTax());
        return amt;
    }
}


class phonePay{
    private double tax=0.5;
    public double getTax(){
        return tax;
    }

}

