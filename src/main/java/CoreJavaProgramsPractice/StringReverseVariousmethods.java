package CoreJavaProgramsPractice;

public class StringReverseVariousmethods {
	
	public static void main(String[] args) {
		String str="Harsha Vardhan";
		String reversed="";
	//	str=str.replaceAll(str,"");
		for(int j=str.length()-1;j>=0;j--)
		{
			reversed=reversed+str.charAt(j);
		}
		System.out.println(reversed);
		
		
		StringBuffer reverse=new StringBuffer();
		
		for(int i=str.length()-1;i>=0;i--)
		{  
			reverse.append(str.charAt(i));
		}
		System.out.println(reverse.toString());
		
		char[] c=str.toCharArray();
		reverse=new StringBuffer();
		for( int k=c.length-1;k>=0;k--)
		{
			reverse.append(c[k]);
		}
		System.out.println(reverse);
	}

}
