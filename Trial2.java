package uses;
//
/* NAME:KYEYUNE RASHID
 * REGNO:2021/A/KCS/1736/G/F
   The first step is creating and naming a java project.
 * A package is created in the project created followed by a number of classes created in the package.
 * For example in this program a project called course work has been created and in the project course work a package uses in which classes
 * such as Trial2,trial3 have been created.
 * language can be used to do different tasks such as storing and manipulating
 * of data.
 */
// This can also be  used as a section for documenting and also an area of importing other packages to be used by the program.
import java.util.*;
import java.math.*;

// You can add as many import statements as you can basing on what you want to import and access from other packages.

public class Trial2 {
//This is the main method that MUST be included on all java programs.
public static void main(String[]args) {
//We can use the main method to do different computations basing on the programmer's wish.
/* There are different types of numbers that can be used in a java program which include;
 * Integers called "int" in a java program 
 * Doubles called "double" in a java program
 * Floats called "float" Long called "long" and very many others.
 * We can add, subtract, multiply, divide and do very many operations on numbers in a java program. 
 * Example shown below is adding to numbers.
 * */
// We start by declaring the two variables (numbers) basing on their type.
/*A variable is simply a storage location.
 *  It can be a string which is a sequence of characters.
 *  It can be an integer, double,long,short etc */		
int x,y,sum1,z,h,sum2;
//Then initialize x and y to a certain values
x=5;
y=7;
// The sum is initialized to x+y
sum1=x+y;
//We then output the sum of the two integers to the console using an inbuilt function shown below
System.out.println("The sum is"+sum1);
//We can also prompt the user to input the values of x and y from the key board using the scanner object.
 Scanner scanner=new Scanner(System.in);
 System.out.println("Enter the value of h");
 h=scanner.nextInt();
 System.out.println("Enter the value of z");
 z=scanner.nextInt();
 sum2=h+z;
 System.out.println("The sum is"+sum2);
 // We can also print names of people or even prompt them to enter their names using a keyboard.
 //We declare a variable known as string first.
 /*Java can be used to carry out a wide range of computations such as:
  *  finding areas of shapes
  *  distance around  shapes
  *  finding volumes of shapes
  *  calculating simple interest
  *  and many others*/
 String name1,name2;
 name1="KYEYUNE";
 System.out.println(name1);
 System.out.println("ENTER name2");
 name2=scanner.next();
//Java can also be used to concatenate or join the two names.
 System.out.println("MY NAME IS" +" "+name1+" "+name2);
 //using a predefined function we can find out the length of the strings
 System.out.println("The string name1 has:"+name1.length()+"characters");
 System.out.println("The string name2 has:"+name2.length()+"characters");
 //Java predefined function can also be used to print a subsection of a string
 System.out.println(name1.substring(0,4));
 // We can also generate the current date using a simple java program.
 // We use a class called Date which is in the java utility package.
 Date today;
 //We then create an instance of the date
 today=new Date();
 // We then print the date onto the console.
 System.out.println(today.toString());
 //We can also do control statements using java as shown below.
 int p,q,k;
 System.out .println("ENTER THE VALUE OF p");
 p=scanner.nextInt();
 System.out .println("ENTER THE VALUE OF q");
 q=scanner.nextInt();
 System.out .println("ENTER THE VALUE OF k");
 k=scanner.nextInt();
 if(p>q) {
 System.out.println("P IS BIGGER THAN Q");
}else if(p>q) {
System.out.println("P IS BIGGER THAN ALL");}
else {System.out.println("P IS SMALLEST");}
//We can also use Arrays in java to store related data as shown below.
int[] marks= {95,97,87,84,85};
//Using a for loop we can print onto the console the marks stored in the array.
for(int a=0;a<marks.length;a++) {
System.out.println("The student's mark is"+marks[a]);	
}
 
 
}
}
