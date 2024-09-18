class Shape{
    public void draw(){
        System.out.println("Drawing a shape");}
    public void erase(){
        System.out.println("erasing shape");}}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("darwing a circle");}
    public void erase(){
        System.out.println("erasing a circle");}}
class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("drawing a triangle");}
    public void erase(){
        System.out.println("erasing a triangle");}}

 class Square extends Shape{
     @Override
     public void draw(){
         System.out.println("drawing a square");}
     public void erase(){
         System.out.println("erasing a square");}}


public class G4 {
    public static void main(String[] args){
        Shape[] shape=new Shape[3];
        shape[0]=new Circle();
        shape[1]=new Triangle();
        shape[2]=new Square();
        for(int i=0;i<shape.length;i++){
            shape[i].draw();
            shape[i].erase();
            System.out.println("--------");}
        }
}
