package quest;

/*From Manjusha CJC to Everyone:  06:06 PM
Q4. Check calling true or false*/
public class A
{
	public String m1()
	{
		return "CJC";
	}
	public Object m2()
	{
		return "karvenagar" ;
	}
	public int m3()
	{
		return 10;
	}
	public double m4()
	{
		return 10d;
	}
	public byte m5()
	{
		return 25;
	}
	
	public static void main(String[] args) 
	{
		A a=new A();
        String s=(String)a.m1();
        Object o=a.m1();
        //double d=(double)a.m1();  /*m1() returns string value and
                                //we r typesast into double there is no relation b/w String & double
                                 //hence we get error
		                    
		Object o1=a.m2();
		//String s1=(int)a.m2();// Error no relation b/w int & String ,
		String s2=(String)a.m2();

		long l=a.m3();
		//byte b=a.m3();// Error , u cant store int value in byte value int>byte
		short s3=(short)a.m3();

		double d1=a.m4();
		//String s4=(String)a.m4();// Error , no relation b/w double & String
		
	
		byte b1=a.m5();
		int i=a.m5();
	}
}

