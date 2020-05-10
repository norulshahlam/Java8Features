/*
this show what is method reference and what does it do
usually we call by value eg print(variables) but here we can use a method as input for another method (call by method) 	
how u can use the current method as well as your own custom method (this class)
 */

package MethodReference;

//interface is used instead of class cos interface can change its implementation unlike class, once implemented, becomes static
interface Parser{
	String parse(String s);
}

class StringParser{ //this is the logic part where you customize a method
	public static String convert(String s){
		if(s.length()>=5)
			s=s.toUpperCase();
		else
			s=s.toLowerCase();		
		return s;
	}
}
class MyPrinter{
	public void print(String str, Parser p){
		str=p.parse(str);
		System.out.println(str);
	}
}

public class MethodRef2 {

	public static void main(String[] args) {

		String name = "norul shahlam";
		MyPrinter mp = new MyPrinter();
		mp.print(name, StringParser::convert); 
		//StringParser is a static method so we dont need to creeate an object. we can call right away
	}
}
/*
how it works
1.
mp.print(name, new Parser() {
	public String parse(String s) {
		return StringParser.convert(s);
			}
		});	
2.since it is func interface, we dont need to state the method name add return method. just define right away using lambda

mp.print(name, (String s)-> 
StringParser.convert(s)			
);

3. remove argument type (since it has only 1 argument, so we dont need to specify again

mp.print(name, s-> StringParser.convert(s));

4. remove variable s so we can use method reference. so whatever value comes, it will convert

mp.print(name, StringParser::convert);

 */












