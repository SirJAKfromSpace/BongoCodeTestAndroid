package q1_Anagram;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean IsAnagram(String str1, String str2) {
		// remove spaces and ignore case before anagram check
		char[] cs = str1.toUpperCase().replaceAll("\\s+","").toCharArray();
		char[] cs2 = str2.toUpperCase().replaceAll("\\s+","").toCharArray();
		
		// immediately return false if lengths of test strings don't match
		if(cs.length!=cs2.length) return false;
		
		// traverse every element in each char array
		for(int i=0; i<cs2.length; i++) {
			for (int j=0; j<cs.length; j++) {
				
				// and set matching elements as ZERO
				if (cs2[i]==cs[j]) {
					cs[j] = '0';
					cs2[i] = '0';
					continue;
				}
			}
		}
		
		// if all match and become zeroes both arrays should be equal
		if(Arrays.equals(cs, cs2)) return true;
		// if 
		return false;
	}
	
	public static void TestAnagram() {
		String str1 = "goats bleat";
		String str2 = "table top";
		System.out.println(str1+" | "+str2+" ? "+IsAnagram(str1,str2));
		
		str1 = "i am lord voldemort";
		str2 = "tom marvolo riddle";
		System.out.println(str2+" | "+str1+" ? "+IsAnagram(str1,str2));
	}
	
	public static void ManualTestAnagram() {
		System.out.println("Hello World");
		String str1, str2; 
		Scanner sc = new Scanner(System.in);
 		System.out.print("Refer str: "); 
 		str1 = sc.nextLine();  
 		System.out.print("Test str: "); 
 		str2 = sc.nextLine();
 		sc.close();
		System.out.println("Is Anagram? " + IsAnagram(str1,str2));
	}
}
