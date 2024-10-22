class Timetable{
    int year;
    String[]day={"mon","tue","wed","thur","fri","sat"};
    int[]period={1,2,3,4,5,6,7};
    String[]batch={"4MW24CS","4MW23CS","4MW22CS","4MW21CS"};
    String[]subject={"OOPJ"};
    String[]faculty={"kuthyar sir","Kuthyar sir","Chaitra mam"};
    String[]sections={"A","B","C"};
    boolean isLab;
    String section;
    Timetable(int y1,String s1){
        this.year=y1;
        this.section=s1;}
    public void printTimetable(){
        String heading =year+"-"+batch[year-1];
        System.out.println("time table of year "+heading+"section "+section);}}
       

public class G16 {
    public static void main(String[] args){
        Timetable tt2A=new Timetable(2,"A");
        Timetable tt2B=new Timetable(2,"B");
        tt2A.printTimetable();
        tt2B.printTimetable();}}
   
