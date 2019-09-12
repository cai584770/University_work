package nursery_Work;

public class nursery_while {
	public static void main(String[] args) {
		put1();
	}
	
	public static void put1() {
		int a=99;
		int b=0;
		
		while (b < a){
			if(a > 1) {
				System.out.printf(a + " bottles of beer on the wall.");
				System.out.println(a + " bottles of beer.");
				put2();
				if (a > 2) {
					System.out.println(a - 1 + " bottles of beer on the wall.");
				}
				else {
					System.out.println(a- 1 + " bottle of beer on the wall.");
				}
			}
			else {
				System.out.println(a + " bottle of beer on the wall." +
								a + " bottle of beer.");
				put2();
				System.out.println("No more bottles on the wall.");
			}
			a--;
		}
	}
	
	public static void put2() {
		System.out.println("Take one down.");
		System.out.println("Pass it around.");
	}
}
