package enumeration;

enum Color{
	RED,BLUE,GREEN
}

public class Enums{
public static void main(String args[]) {
	
	
	//the enums in java is a datatype which conatins a fixed set of constant,
	// naming convention :all enums constant in capital letter
	// java enums constants are static and final implicitly
	//syntax->enum enum-name{constant 1,constant 2,.....constant n};
	// enum program {html,css,bootstrap,js,java,mysql};
	
	Color c=Color.GREEN;
	System.out.println(c);
	
}
}
