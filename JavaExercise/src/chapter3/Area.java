package chapter3;
/*
 * @author Padamara Nagendra Prasad
 */
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