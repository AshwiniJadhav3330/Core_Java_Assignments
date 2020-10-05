import java.util.Arrays; 
import java.util.Collections; 
public class Q23 
{
	public static void main(String args[])
	{
		int max;
		int count = 0;
		String[] arr = {"ziva","ashu","abhishek","shravani"};
		
		 Arrays.sort(arr, Collections.reverseOrder()); 
		  
	        System.out.printf(Arrays.toString(arr)); 
		
	}
}