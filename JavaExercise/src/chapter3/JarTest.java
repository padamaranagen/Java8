package chapter3;

/**
 * @author Padamara Nagendra Reddy
 *
 */
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