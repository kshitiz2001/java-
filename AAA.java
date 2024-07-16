class AAA{
	static int a = 111;
	static int b = 222;
	public static void main(String[] s){
		AAA obj1 = new AAA();
		AAA obj2 = new AAA();
		System.out.println("obj1: " +obj1.a+"..."+obj1.b);
		System.out.println("obj2: " +obj2.a+"..."+obj2.b);
		obj1.a = 888;
		obj1.b = 999;
		System.out.println("---------------------------");
		System.out.println("obj1: " +obj1.a+"..."+obj1.b);
		System.out.println("obj2: " +obj2.a+"..."+obj2.b);
		obj2.a = 4545;
		obj2.b = 5454;
		System.out.println("---------------------------");
		System.out.println("obj1: " +obj1.a+"..."+obj1.b);
		System.out.println("obj2: " +obj2.a+"..."+obj2.b);

	}

}