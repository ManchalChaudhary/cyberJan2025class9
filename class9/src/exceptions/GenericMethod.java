package exceptions;



public class GenericMethod {

	public static void main(String[] args) {
		int a = 10;
		String b = "hello";
		char c = 'A';
		Integer[] d =  {20, 10};
		String[] e =  {"hello", "apple"};
		test1(a);
		test2(b);
		test3(c);
		test(d);
		test(e);
		//test(c);
	}
	
	public static void test1(int a) {System.out.println(a);}
	public static void test2(String a) {System.out.println(a);}
	public static void test3(char a) {System.out.println(a);}
	
	public static <E> void test(E[] g) {
		for (E x : g);
		System.out.println(g[1]);
		System.out.println(g[0]);
	}

}
