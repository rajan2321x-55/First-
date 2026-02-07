
public class asci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("translated method example");
		String s6="hello\\nWorld";
		
		System.out.println(s6.translateEscapes());
		System.out.println(s6.strip());// remove both front and back spaces
		System.out.println(s6.stripLeading());//remove front spaces`
		System.out.println(s6.stripTrailing()); // remove back spaces
		System.out.println(s6.subSequence(0, 10));
		System.out.println(s6.repeat(8)); //repeat method   
		
		System.out.println(s6.regionMatches(0, s6,11,23));
		
		System.out.println();      
		
		
		
		
	}

}
