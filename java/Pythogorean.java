import java.io.*;

class Pythogorean
{

	public static void main(String args[]) 
	throws IOException

	{


	System.out.println("Enter three integers from 2 to 100");

	DataInputStream din = new DataInputStream(System.in);

	String i=din.readLine();

	String j=din.readLine();

	String k=din.readLine();

	int i1=Integer.parseInt(i);

	int j1=Integer.parseInt(j);

	int k1=Integer.parseInt(k);


	if(k1*k1==(i1*i1+j1*j1)||j1*j1==(i1*i1+k1*k1)||i1*i1==(k1*k1+j1*j1))

	System.out.println("Yes....the values form a Pythogorean triplet");

	
	else

	System.out.println("The value you have entered did not satisfy Pythogorean theorem");

	
	}

}
