/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj41;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import pkg2.Tools3;
public class G34 {
    public static void main(String[] args)throws FileNotFoundException {
        File f1=new File("names.txt");
        Scanner sc1=new Scanner(f1);
        String name=" ";
        Tools3 t1=new Tools3();
        for(int i=0;i<3;i++)
        {
             name=sc1.nextLine();
        System.out.println(t1.reverse(name));
        }
        
    
}
}
