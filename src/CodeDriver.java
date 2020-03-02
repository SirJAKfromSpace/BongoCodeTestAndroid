import java.util.Arrays;
import java.util.Scanner;

public class CodeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		String str1, str2; 
		Scanner sc = new Scanner(System.in);
 		System.out.print("Refer str: "); 
 		str1 = sc.nextLine();  
 		System.out.print("Test str: "); 
 		str2 = sc.nextLine();
 		
		//remove all spaces and ignore case before anagram check
		System.out.println("Is Anagram?\n"
				+IsAnagram(str1.toUpperCase().replaceAll("\\s+","").toCharArray(),
						str2.toUpperCase().replaceAll("\\s+","").toCharArray())); 
		sc.close();
	}
	
	public static boolean IsAnagram(char[] cs, char[] cs2) {
		if(cs.length!=cs2.length) return false;
		for(int i=0; i<cs2.length; i++) {
			for (int j=0; j<cs.length; j++) {
				if (cs2[i]==cs[j]) {
					cs[j] = '0';
					cs2[i] = '0';
					continue;
				}
			}
		}
		if(Arrays.equals(cs, cs2)) return true;
		return false;
	}

}
