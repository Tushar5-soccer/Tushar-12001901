import java.util.Scanner;
//Stack implementation
public class Array {
    static Scanner sc= new Scanner(System.in);
    static int ar[]=new int[10];
    static int r=0;
    public static void main(String[] args){
        Array ob= new Array();
        boolean b=true;
        while(b) {
            System.out.println("Press 1 to push");
            System.out.println("Press 2 to pop");
            System.out.println("Press 3 to exit");
            int a=sc.nextInt();
            if (a == 1) {
                ob.push();
            } else if (a == 2) {
                ob.pop();
            } else if (a == 3) {
                b = false;
            } else
                System.out.println("Wrong Input");
        }
    }
    void push(){
        System.out.println("Enter Value to Push");
        int p=sc.nextInt();
        if(r==ar.length){
            System.out.println("No space to Push");
        }
        else{
            ar[r]=p;
            r++;
            System.out.println(p+" Is Pushed");
        }
    }
    void pop(){
        if(r==0){
            System.out.println("No element to pop");
        }
        else{
            System.out.println(ar[r-1]+" Is Poped");
            r--;
        }
    }
}
