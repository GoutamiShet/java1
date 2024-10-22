class Student{
    private String name;
    private String post;
    public String votes(int votes){
         
    }
    public Student(String name,String post){
        this.name=name;
        this.post=post;
    }
public String getName(){
    return name;

}
public String getPost(){
    return post;
}
}
class Election{
   public  String cname;
    public String date;
    Election(String cname1,String date1){
        this.cname=cname1;
        this.date=date1;
       
    }}

     
        
        
        
     
        
public class G11 {
    public static void main (String[] args ){
        System.out.println("Elections ");
        Student anurag=new Student("Anurag Rao ","Precident");
        Student udupa=new Student("Ramachandra","techcoorr");
        Election e1=new Election("28 sep 24","SMVITM");
        System.out.println(anurag.getName() +" has applied for" + anurag.getPost());
    }
    
    
}
