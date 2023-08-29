package wrapperDemo;

public class Conversion {

	public static void main(String[] args) {
		//AUTOBOXING: automatic conversion from primitive data type into its corresponding wrapper class
		
		//manual conversion
		int num=60;
		//convert from int to Integer
		Integer in=Integer.valueOf(num);
		System.out.println(in);
		
		//AUTOBOXING: automatic conversion
		int a=80;
		Integer i=a;	//Integer.valueOf(num);
		
		float f=56.8f;
		//Float f=Float.valueOf(f);
		Float obj=f;
		
		boolean b=false;
		Boolean bObj=b;
		
		//UNBOXING: automatic conversion from wrapper type into its corresponding primitive type
		
		//manual conversion
		Integer inObj=new Integer(34);
		int n=inObj.intValue();
		
		//automatic conversion
		int nn=inObj;	//inObj.intValue();

	}

}
