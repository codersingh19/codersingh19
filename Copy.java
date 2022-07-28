// import java.io.*;
// public class Practical6 {
//  public static void main(String[] args) throws Exception {
//  if (args.length != 2) {
//  System.err.println("Usage: java Copy <src> <dest>");
//  } else {
//  int i;
//  FileInputStream fin = new FileInputStream(args[0]);
//  FileOutputStream fout = new FileOutputStream(args[1]);
//  while ((i = fin.read()) != -1) {
//  fout.write(i);
//  }
//  fin.close();
//  fout.close();
//  System.out.println(
// "Copied contents of" + args[0] + " to " + args[1]
// );
//  }
//  }
// }
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Copy
{
    public static void main(String[] args) throws Exception 
    {
    Scanner scan = new Scanner(System.in) ;
    System.out.print("Provide source file name :");  
    String sfie = scan.next();
    System.out.print("Provide destination file name");
    String dfile = scan.next();
    if (args.length!=2)
     {
        System.err.println("Usage : java copy <src><dest>");
    } 
    else
    {
        int i;
        FileInputStream r = new FileInputStream(sfie);
        FileOutputStream w = new FileOutputStream(dfile);
        while ((i= r.read())!=-1)
         {
          w.write(i);  
        }
        r.close();
        w.close();
        System.out.println("Copied");
    }
    }
}
