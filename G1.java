import java.util.Scanner;
class Stack{
    int top;
    int stk[]=new int[10];
    Stack(){
        top=-1;}
    void push(int item){
        if (stk.length-1==top){
            System.out.println("stack overflow");}
        else{
            top=top+1;
            stk[top]=item;}}
    void pop(){
        if(top==-1){
            System.out.println("stack underflow");}
            else{
                    int item=stk[top];
                    System.out.println("item is poped"+item);
                    top=top-1;
                    }
                    }
    void display(){
            if (top==-1)
            {
                System.out.println("stack is empty no items to display");}
            else{
                    System.out.println("items in the stack are" );
                    for( int i=top;i>=0;i--){
                        System.out.println(stk[i]);}}
            
                
                
                    
                    
                    
                    }
                        
                        }
            
        
            
        
    

/**
 *
 * @author smv
 */
public class G1 {
    public static void main(String[] args) {
        int ch;
Stack stack1=new Stack();
Scanner sc1=new Scanner(System.in);
while(true){
System.out.println("1.push: 2.pop:3.dispaly: 4.exit");
ch=sc1.nextInt();
switch(ch){
    case 1:
        System.out.println("enter the items to be pushed");
        int item=sc1.nextInt();
        stack1.push(item);
    break;
    case 2:
        stack1.pop();
        break;
    case 3:
        stack1.display();
        break;
    case 4:
        System.exit(0);
    default:
        System.out.println("enter the valid choice");
        
    }
            
        
}
    }
    
}
