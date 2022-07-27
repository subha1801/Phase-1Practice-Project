package regx;
import java.util.regex.*;
public class RegEx {

	public static void main(String[] args) {

		String pattern = "[a-z]+";
		String check = "Find Anything";
		Pattern a = Pattern.compile(pattern);
		Matcher b = a.matcher(check);
		
		while (b.find())
	      	System.out.println( check.substring( b.start(), b.end() ) );
		}
	}


