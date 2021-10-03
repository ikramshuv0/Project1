package nonprimitive;

public class StringManipulation {
	
	public static void main(String[] args) {
//	String str = "My name is shuvo";
//		
//	System.out.println(str.indexOf("is"));
//	System.out.println(str.charAt(20));
//	
//	String stri = "I am Ikram";
//	
//	System.out.println(stri.indexOf("Ikram"));
//	
//	String strn = "how are you";
//	System.out.println(strn.indexOf("you"));
		String word = "how are you";
		System.out.println(word.charAt(5));
		System.out.println(word.codePointAt(4));
		System.out.println(word.codePointBefore(7));
		System.out.println(word.endsWith("me"));
		System.out.println(word.concat("?"));
		System.out.println(word.contains("H"));
		System.out.println(word.replace("are", "they"));
	
	}

}
