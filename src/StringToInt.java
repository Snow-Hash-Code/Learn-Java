
public class StringToInt {

	public static void main(String[] args) {
		String s = "102";
		int n = Integer.parseInt(s);
		System.out.println(n + 4);
		
		int n1 = 8;
		System.out.println(Integer.toString(n1) + 1);
		
		String a = "age: 20";
		a = a.replaceAll("\\D+","");
		
		int age = Integer.parseInt(a);
		
		System.out.println(age + 2);
	}

}