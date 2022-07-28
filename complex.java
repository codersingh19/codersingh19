/* Design a class complex having a real part and an imaginary part.
Provide methods to perform the following operations on complex numbers :
a) Add two numbers.
b) Multiply two complex numbers.
c) toString() method to display complex numbers in the form of : x+iy. */

public class Practical1 {
    private int x;
 private int y;
 // Parameterized constructor of complex class
 public Practical1(int real,int imaginary){
 this.x=real;
 this.y=imaginary;
 }
 // Add two complex objects
 public Practical1 add(Practical1 o){
 return new Practical1(
 this.x+o.x,
 this.y+o.y
 );
 }
 // Multiply two complex objcts
 public Practical1 multiply(Practical1 o){
 return new Practical1(
 this.x*o.x-this.y*o.y,
 this.x*o.y+o.x*this.y
 );
 }
 // type conversion to string
 public String toString(){
 return x+"+ i "+y;
 }
 public static void main(String[] args) {
 Practical1 c1=new Practical1(1,2);
 Practical1 c2=new Practical1(3,4);
 System.out.println("Complex 1: "+c1);
 System.out.println("Complex 2: "+c2);
 System.out.println("Sum : "+c1.add(c2));
 System.out.println("Product : "+c1.multiply(c2));
 }
} 

    

