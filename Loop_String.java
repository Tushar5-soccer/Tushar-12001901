import java.util.Scanner;

public class Loop_String {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a String");
        String st =sc.nextLine();
        String s= st.toLowerCase();
        int c =0;
        int b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u')
                c++;
            if(s.charAt(i)==' ')
                b++;
        }
        System.out.println("Num of vowels in your string = "+c);
        System.out.println("Num of consonents in your string = "+(st.length()-(c+b)));
    }
}
