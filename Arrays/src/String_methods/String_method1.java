package String_methods;

import java.util.Scanner;

public class String_method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/**1.equals()
		2.equalIgnore()
		
		
		*/
		Scanner in=new Scanner(System.in);
		System.out.println("enter the username");
		String uname=in.nextLine();
		
		System.out.println("enter the password");
		String pass=in.nextLine();
		
	
		
if(uname.equalsIgnoreCase("Admin")&&pass.equals("Admin@123")) {
	System.out.println("login success");
	
}else {
	System.out.println("invalid");
}
System.out.println("password" +pass.length());
char last=pass.charAt(pass.length()-1);
System.out.println("last string " + last);
System.out.println(" username as uppercase " + uname.toUpperCase());
System.out.println(" password as uppercase " + pass.toUpperCase());

System.out.println(" username as lowercase " + uname.toLowerCase());
System.out.println(" password as lowercase " + pass.toLowerCase());

if(pass.contains("@123"))	{
	System.out.println("password matches the admin password");
}
else {
	System.out.println("not a match");
}
	
	

}
}