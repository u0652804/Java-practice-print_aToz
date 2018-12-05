package StringPrint1;

/***
 * @author Bo-Xun Liao
 * 
 ***/

public class StringPrint {
	
	public StringPrint() {
		
		String str = "";
		
		// init. str = "a1"~"z1"
		for(char i = 'a'; i <= 'z'; i ++)
			if(i == 'z')
				str = str + i + ' ';
			else
				str = str + i + ',';
			
		System.out.print("The String : " + str + "\n");
			
		System.out.println("print as below : ");
		// print a1 b1 c1...
		for(int i = 0; i < str.toCharArray().length; i += 2)
			System.out.println(str.charAt(i) + "" + '1');
	}

}
