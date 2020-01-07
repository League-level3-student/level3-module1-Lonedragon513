package _05_String_Integer_Pair;

public class test {
public static void main(String[] args) {
	int[] a = new int[3];
	for (int i = 0; i < a.length; i++) {
		a[i]=100000+i;
		
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		System.out.println(i);
	}
	
	System.out.println(a.length);
}
}
