public class comp{
	public static void main(String[] args){
		int x = "ram" .compareTo("sam");
		System.out.println("x: "+x);
		int  y = "ram".compareTo("Ram");
		System.out.println("y: "+y);
		int  z = "ram".compareTo("ram");
		System.out.println("z: "+z);
		int l = "ram".compareTo("ramchandra");
		System.out.println("l: "+l);
	}
}