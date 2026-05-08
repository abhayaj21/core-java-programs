class StringDemo
{
	public static void main(String[] args) {
		/*String myName = "Abhay" Create String in SCP;
		String name = new String("Abhay");
		String nameee = new String("Abhay") Create in heap memory;
		myName = myName.concat(" jadhav");
		System.out.println(myName);*/

		System.out.println("Abhay".length()); //Return the length of string 5
		System.out.println("Abhay".charAt(4));//Spacific Charcter At index
		System.out.println("Abhay".equals("Abhay"));//it's Return True
		System.out.println("Abhay".equalsIgnoreCase("abhay"));//it's Return true
		System.out.println("Abhay".compareTo("Abhay"));//It's Return int if to String are Equals then it reutrn 0 and if not euquals then return -1 
		System.out.println("Abhay jadhav".contains("adhav"));//if contains spacific stirng then true
		System.out.println("Abhay Jadhav".startsWith("Abhay"));//if check string with string if availabel then true
		System.out.println("Abhay Jadhav".endsWith("dhav"));//if spacific string end with given the return true
		System.out.println("abhay".indexOf("a"));//Return index no of spacific char and string
		System.out.println("abhay".lastIndexOf("a"));//Return last index no of spacific char and string
		System.out.println("   Abhay  ".trim());//Remove Unwanted white space
		System.out.println("abHay".replace('H','h'));//repalce spacific char to new char
		//System.out.println("Abhay Jadhav".split(" "));Split on space regex and return string array
		System.out.println("Abhay".isEmpty());//if Check string is ematy or not
		//valueOf Convets charcter array into string
		//toCharArray Converts string into char array return char[]

		System.out.println("Abhay".substring(2));//Return string from spacific index no to last end; 
		System.out.println("Abhay".substring(0,3));//reutrn string from spacific index to spacifc no last no is excluding in string

	}
}