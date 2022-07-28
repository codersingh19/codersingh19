/**** exceptionDemo.java ****/
import java.util.Scanner;
class exceptionDemo {
 static void test(int age) throws Practical4 {
 if (age < 18)
 throw new Practical4(age);
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter Age: ");
 int age = sc.nextInt();
 try {
 test(age);
 System.out.println("Test Successful");
 } catch (Practical4 e) {
 System.err.println(e.getMessage());
 System.out.println("Test Unsuccessful");
 } finally {
 sc.close();
 }
 }
}