import java.util.Scanner;
public class G13 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //int usn=01;
        int i;
        System.out.println("the num is ");
        int num=scanner.nextInt();
        System.out.println("the num1 is ");
        int num1=scanner.nextInt();
        String usn2="";
        for(i=num;i<=num1;i++){
            usn2=String.format("%03d",i);
            System.out.println("4MW23CS"+usn2);
        }
    }
    
}
