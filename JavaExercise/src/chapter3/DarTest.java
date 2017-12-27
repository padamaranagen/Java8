package chapter3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Padamara Nagendra Reddy
 *
 */
class DarTest
{
	public static void main(String args[ ]) //throws Exception
	{
      try
      {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int [ ][ ]  x= new int[2][2];
		int [ ][ ]  y= new int[2][2];
		int [ ][ ]  z= new  int[2][2];
		System.out.println("\t\t\t\t\tTHIS IS MATRIX OPERATION");		
		for(int i=0;i<x.length;i++)
		{
			
			for(int j=0;j<x.length;j++)
			{
				System.out.print("Enter the "+(i+1)+"ST row "+(j+1)+"ST column of the first matrix:");
				x[i][j]=Integer.parseInt(br.readLine());
				
			}
		}
		for(int i=0;i<y.length;i++)
		{
			
			for(int j=0;j<y.length;j++)
			{
				System.out.print("Enter the "+(i+1)+"ST row "+(j+1)+"ST column of the second matrix:");
				y[i][j]=Integer.parseInt(br.readLine());
				
			}
		}
		System.out.println("THE ADDITION OF MATRIX IS.....");
		for(int i=0;i<z.length;i++)
		{
				
			for(int j=0;j<z.length;j++)
			{
			
				System.out.print(z[i][j]=x[i][j]+y[i][j]);
				System.out.print("\t");
			}	
			 System.out.println("\n");
		}
  }
  catch(Exception ex)
  {
      System.out.println("Enter valid input");
  }
  finally
    {
      System.out.println("This statement always execute!");
    }
		
		
	}


}

		