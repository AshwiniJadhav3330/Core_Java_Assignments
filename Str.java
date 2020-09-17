import java.util.Scanner;
class Str
{
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the values here...");
	String s1 = scan.nextLine();
	int len = s1.length();
	System.out.println("length is:"+len);
	for(int i = 0; i <= len; i++)
	{
		count[s1.CharAt(i)]++;
		int max = -1;  
        		char result = ' ';   
       
       
       		 for (int i = 0; i < len; i++) { 
           			 if (max < count[s1.charAt(i)]) { 
               			 max = count[s1.charAt(i)]; 
                			result = s1.charAt(i); 
            } 
	}
}

	
}
}