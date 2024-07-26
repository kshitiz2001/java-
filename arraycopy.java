public class arraycopy{
	public static void main(String[] args){
		/*int[] a = {11,22,33,44,55};
		int[] b = new int[a.length];
		for(int i=0;i<a.length;i++){
			b[i] = a[i];
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+"......."+b[i]);
		}*/
		Integer a[] = {11,22,33,44,55};
		Integer b[] = new Integer[a.length];
		System.arraycopy(a, 2, b, 3, 3);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+"......."+b[i]);
		}
	}
}