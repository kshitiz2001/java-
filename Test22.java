public class Test22{
	public static void main(String[] args){
		String s = "Internationalization";
		char[] c = new char[s.length()];
		System.out.println(c.length);
		s.getChars(5, 12, c , 0);
		for(char c1 : c){
			System.out.println(c1);
		}
		System.out.println("==============");
		s.getChars(0, 20, c , 0);
		for(char c1 : c){
			System.out.println(c1+" ");
		}
		System.out.println("================");
		byte b1[] = new byte[s.length()];
		s.getBytes(0,5,b1,0);
		for(byte b2:b1){
			System.out.println(b2+" ");
		}
	}
}