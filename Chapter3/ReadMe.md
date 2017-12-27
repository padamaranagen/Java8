# The Primitive Types

Java defines eight 'primitive' types of data, **byte**, **short**,
**int**, **long**, **chat**, **float**, **double** and **boolean**. The
primitives types are also commonly referred to as *simple* types.

-   **Integer** : byte, short, int and long
-   **Floating-point numbers** : float and double
-   **Characters** : char
-   **Boolean** : boolean

Integers
--------

Java defines four integer types: **byte**,**short**,**int**, and **long**. All of these are signed,positive and negative values. 

|Name|Width|Range|
|----|-----|-----|
|**long**| 64|-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807|
|**int**|32|-2,147,483,648 to 2,147,483,647|
|**short**|16|-32,768 to 32767|
|**byte**|8|-128 to 127|

>Light.java
```
//compute distance light travels using long variables
class Light{
  public static void main(String args[]){
    int lightspeed;
    long days;
    long seconds;
    long distance;

    //approximate speed of light in miles per second
    lightspeed=186000;

    days=1000;// specify number of days here

    seconds=days*24*60*60;// convert to seconds

    distance =lightspeed * seconds;//Compute distance

    System.out.print("In "+days);
    System.out.print(" days light will travel about ");
    System.out.print(distance+" miles.");
  }
}
```


Floating-Point Types
--------------------

|Name|Width|Range|
|----|-----|-----|
|**double**|64|49e-324 to 1.8e+308|
|**float**|32|-1.4e-045 to 304e+038|

> Area.java
```
//Compute the area of a circle.
class Area{
  public static void main(String args[]){
    double pi, r, a;

    r=10.8; // radius of circle
    pi= 3.1416; // pi, approximately

    a=pi*r*r;

    System.out.println("Area of circle is "+a);
  }
}
```
Characters
----------


**Char** in java is not the same as char in C or C++. In C/C++, **char** is8 bits wide. This is not the case in java. Instead, Java uses *Unicode* to represent characters. Unicode requires 16bits.

>CharDemo.java

```
class CharDemo{
  public static void main(String args[]){
    char ch1,ch2;

    ch1=88; //code for x
    ch2='Y';

    System.out.print("ch1 and ch2 :");
    System.out.println(ch1+ " "+ch2);
  }
}

Output:

ch1 and ch2 :X Y

```
> CharDemo2.java

```
class CharDemo2{
  public static void main(String args[]){
    char ch1,ch2;

    ch1='x'; 
    System.out.println("ch1 :"+ch1);
    
    ch1++;    
    System.out.println("ch1 :"+ch1);
  }
}

Output: 

ch1 :x
ch1 :y
```

**Note**

In the formal specification for Java, **char** is referred to as an integral type, which means that it is in the same general category as **int**, **short**, **long** and **byte**. 

Booleans
--------

```
//Demonstrate boolean values
class BoolTest{
  public static void main(String args[]){
    boolean b;

    b=false;
    System.out.println("b is "+b);
    b=true;
    System.out.println("b is "+b);

    //a boolean value can control the if statement
    if(b)
      System.out.println("This is executed.");
    b=false;

    if(b)
      System.out.println("This is not executed.");

    //Outcome of a relational operator is a boolean value
    System.out.println("10 > 9 is "+ (10>9));

  }
}

Output:

b is false
b is true
This is executed.
10 > 9 is true

```

# Type Conversion and Casting

An *automatic type conversion* will take place if the following two conditions are met :
* The two types are compatible.
* The destination type is larger than the source type.

When these conditions are met, a ***widening conversion*** takes place.

***Narrowing conversion*** takes place if the destination type is smaller than the source type.

***widening conversions are..***

From a byte to a short, an int, a long, a float, or a double
From a short to an int, a long, a float, or a double
From a char to an int, a long, a float, or a double
From an int to a long, a float, or a double
From a long to a float or a double
From a float to a double

***Narrow conversions are..***

From a byte to a char
From a short to a byte or a char
From a char to a byte or a short
From an int to a byte, a short, or a char
From a long to a byte, a short, a char, or an int
From a float to a byte, a short, a char, an int, or a long
From a double to a byte, a short, a char, an int, a long, or a float

```
public class Conversion {
  public static void main(String[] args) {
    byte b;
    int i=257;
    double d=323.142;
    
    System.out.println("\nConversion of int to byte");
    b=(byte)i;
    System.out.println("i and b "+i+" "+b);
    
    System.out.println("\nConversion of double to int");
    i=(int)d;
    System.out.println("d and i "+d+" "+i);

    System.out.println("\nConversion of double to byte");
    b=(byte)d;
    System.out.println("d and b "+d+" "+b);    
  }
}

Output:

Conversion of int to byte
i and b 257 1

Conversion of double to int
d and i 323.142 323

Conversion of double to byte
d and b 323.142 67
```

Type Promotion Rule
=
Java defines several *type promotion* rules that apply to expressions. They are as follows. 

* ***byte***, ***short***, and ***char*** values are promoted to ***int***.
* if one operand is a ***long***, the whole expression is promoted to ***long***
* If one operand is a ***float***, the entire expression is promoted to ***float***
* If any operands are ***double***, the result is ***double***.

```
public class Promote {
  public static void main(String[] args) {
    byte b=42;
    char c='a';
    short s=1024;
    int i=50000;
    float f=5.67f;
    double d=.1234;
    double result=(f*b)+(i/c)-(d*s);
    System.out.println("(f*b): "+(f*b)+" + (i/c): "+(i/c)+" - (d*s): "+(d*s));
    System.out.println("result ="+result);    
  }
}

Output:

(f*b): 238.14 + (i/c): 515 - (d*s): 126.3616
result =626.7784146484375

```

Arrays
=

### What is an Array?
 
An ordered collection of primitives or objects. When you declare an array, you specify the element type,  and the resulting array can contain only elements of that type.

### What is an array element?

Each item stored in an array is considered an element of the array. Each array element must be the same type as the array itself. For example, an int array contains some number of int array elements.

***Note:***
*   All arrays are ***immutable***. If you have an array with six elements in it and you want it to hold seven, you must create a new array. An array is not meant to be a dynamically sized collection type, so don’t try to use it that way.
* Think about the main method that you have been working with so far:
>public static void main(String[] args)

Earlier, you learned that the parameter to this method is in fact an array of String objects. Each element in this array is one argument passed on the command line to the class that holds this main method. What is the length of that array? You have no way to answer that right now, do you? Until you actually pass the command-line arguments, there is no way of telling. If you pass two arguments, the length of args will be two. If you pass zero arguments, the length will be zero. This demonstrates an array’s length being determined at runtime. Once the array length is determined, however, it cannot change.

What really happens when you pass command-line arguments is that the JVM creates a new array and populates it with each of the arguments that you passed (if any).

*  Arrays contain multiple items.
*  Each item in an array is called an element.
*  All the elements in an array must be the same type.
*  The length of an array is determined at runtime.
*  The length of an array can never change.
*  The contents of an array can be changed dynamically.
*  All arrays are objects, regardless of their content type.
*  Array indexes start at zero and go to (length – 1).

So far you have been using System.out.printn() to output messages to the command line. When you output error messages, you should normally use System.err.println() instead. This outputs the message to the standard error of your system. This is normally just the command line, but using System.err ensures that all error messages go to the right place.

### Array initializer:

A special variation to creating an array that does not require you to explicitly set the length. Instead, the contents of the array are put right inside a pair of braces ({}), and a comma separates each element. The resulting array’s length equals the number of elements listed between the braces.

String [] names={"nagendra","Suzane","kathy","Lee","Sean"};

System.out.println("There are "+names.length+ " names in the address book.");     

![Array Initializer](https://github.com/nagendramca2011/Java8/blob/master/JavaExercise/Images/chapter3/initalizer.png)


### Java Array Default Values
*  byte – default value is zero
*  short – default value is zero
*  int – default value is zero
*  long – default value is zero, 0L.
*  float – default value is zero, 0.0f.
*  double – default value is zero, 0.0d.
*  char – default value is null, ‘\u0000′.
*  boolean – default value is false.
*  reference types – default value is null.

#### One-dimensional program..
```
class ArTest
{
  public static void main(String args[])
  {
    //Array defines two ways
    //1
    /*int[] ar;
    ar=new int[10];*/
    
    //int[] a=new int[size];

    //2
    int ar[];
    ar=new int[10];
    
    /*incompatible types int, int[]
    int ar;
    ar=new int[10];*/

    for(int i=0;i<10;i++)
    {ar[i]=i+10;
      System.out.println(" the output"+ar[i]);
    }
    /*/for(int i=0;i<10;i++)
    {
      System.out.println(ar[i]);
    }*/
  }
}
```


#### Two-dimensional program..

```
class DarTest {
  public static void main(String args[]) // throws Exception
  {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(
          System.in));
      int[][] x = new int[2][2];
      int[][] y = new int[2][2];
      int[][] z = new int[2][2];
      System.out.println("\t\t\t\t\tTHIS IS MATRIX OPERATION");
      for (int i = 0; i < x.length; i++) {

        for (int j = 0; j < x.length; j++) {
          System.out.print("Enter the " + (i + 1) + "ST row "
              + (j + 1) + "ST column of the first matrix:");
          x[i][j] = Integer.parseInt(br.readLine());

        }
      }
      for (int i = 0; i < y.length; i++) {

        for (int j = 0; j < y.length; j++) {
          System.out.print("Enter the " + (i + 1) + "ST row "
              + (j + 1) + "ST column of the second matrix:");
          y[i][j] = Integer.parseInt(br.readLine());

        }
      }
      System.out.println("THE ADDITION OF MATRIX IS.....");
      for (int i = 0; i < z.length; i++) {

        for (int j = 0; j < z.length; j++) {

          System.out.print(z[i][j] = x[i][j] + y[i][j]);
          System.out.print("\t");
        }
        System.out.println("\n");
      }
    } catch (Exception ex) {
      System.out.println("Enter valid input");
    } finally {
      System.out.println("This statement always execute!");
    }
  }
}    

Output:

THIS IS MATRIX OPERATION
Enter the 1ST row 1ST column of the first matrix:1
Enter the 1ST row 2ST column of the first matrix:1
Enter the 2ST row 1ST column of the first matrix:1
Enter the 2ST row 2ST column of the first matrix:1
Enter the 1ST row 1ST column of the second matrix:2
Enter the 1ST row 2ST column of the second matrix:2
Enter the 2ST row 1ST column of the second matrix:2
Enter the 2ST row 2ST column of the second matrix:2
THE ADDITION OF MATRIX IS.....
3  3  

3  3  

This statement always execute!

```
#### Multidimensinoal arrays

```
class ThreeDMatrix 
{
  
  public static void main(String args[]) 
  {
    int threeD[][][] = new int[3][4][5];
    int i, j, k;
    for(i=0; i<3; i++)
    for(j=0; j<4; j++)
    for(k=0; k<5; k++)
      threeD[i][j][k] = i * j * k;
    for(i=0; i<3; i++) 
    {
      for(j=0; j<4; j++) 
      {
        for(k=0; k<5; k++)
          System.out.print(threeD[i][j][k] + " ");
          System.out.println();
      }
      System.out.println();
    }
  }
} 

Output:

0 0 0 0 0 
0 0 0 0 0 
0 0 0 0 0 
0 0 0 0 0 

0 0 0 0 0 
0 1 2 3 4 
0 2 4 6 8 
0 3 6 9 12 

0 0 0 0 0 
0 2 4 6 8 
0 4 8 12 16 
0 6 12 18 24 
```

#### Jagged arrays
```
class JarTest
{
  public static void main(String args[])
  {
    //Define a jogged Array
    int [][] jar;
    jar=new int[4][];
    
    jar[0]=new int[6];//oth row has 6 columns
    jar[1]=new int[4];//1st row has 4 columns
    jar[2]=new int[2];//2nd row has 2 columns  
    jar[3]=new int[7];//3rd row has 7 columns
    for (byte i=0;i<jar.length;i++)
    {
         for(byte j=0;j<jar[i].length;j++)
      {
        jar[i][j]=i+j;
      }
    }
    for (byte i=0;i<jar.length;i++)
    {
         for(byte j=0;j<jar[i].length;j++)
      {
        System.out.print(jar[i][j]+"\t");
      }
      System.out.println();
    }
  }
}    

Output:

0  1  2  3  4  5  
1  2  3  4  
2  3  
3  4  5  6  7  8  9  
```
