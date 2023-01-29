import java.util.Scanner;

public class dataType_Variable_Conditional {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Your Basic Pay ");
        double bp = sc.nextDouble();
        double hra = 0.0;
        double da = 0.0;
        double gp = 0.0;
        if (bp >= 5000.0) {
            hra = 0.1 * bp;
            da = 0.2 * bp;
        } else {
            hra = 0.2 * bp;
            da = 0.3 * bp;
        }
        gp = hra + da + bp;
        System.out.println("HRA " + hra + " DA " + da + " Gross Pay " + gp);
    }
}
