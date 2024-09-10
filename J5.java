import java.util.Scanner;
public class J5{
public static void main(String[] args){
  int N=Integer.parseInt(args[0]);
  int [][] matrix1=new int[N][N];
  int[][] matrix2=new int[N][N];
  Scanner scanner=new Scanner(System.in);
  System.out.print("enter the elements of first matrix:");
  for(int i=0;i<N;i++){
      for(int j=0;j<N;j++){
          matrix1[i][j]=scanner.nextInt();}}
System.out.println("the matrix is ");
for(int i=0;i<N;i++){
   for(int j=0;j<N;j++){
      System.out.print(matrix1[i][j]);}}

System.out.println("enter second matrix");
for(int i=0;i<N;i++){
   for(int j=0;j<N;j++){
      matrix2[i][j]=scanner.nextInt();}}
int[][] summatrix=new int[N][N];
for(int i=0;i<N;i++){
   for(int j=0;j<N;j++){
      summatrix[i][j]=matrix1[i][j] + matrix2[i][j];}}
System.out.println("the sum of two matrix is");
for(int i=0;i<N;i++){
   for(int j=0;j<N;j++){
      System.out.print(summatrix[i][j] + "   ");
}
System.out.println();
}
}
} 