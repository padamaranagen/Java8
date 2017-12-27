package chapter3;

/**
 * @author Padamara Nagendra Reddy
 *
 */
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