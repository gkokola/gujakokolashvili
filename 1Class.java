package davaleba2;


public class FirstClass implements SecondClass {
	int a = 55;
	int b = 344;


	@Override
	public void betweenNumbers() {
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
	}


	@Override
	public void separators() {
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				System.out.println(i);
			}
		}
	}


	public int primeCheck(int x) {
		int y = 0;
		
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				y++;
			}
		}
		
		if (y == 2) {
			return 1;
		} else {
			return 0;
		}
	}


	@Override
	public void primeSeparators() {
		for (int i = 1; i <= b; i++) {
			if (b % i == 0 && primeCheck(i)) {
				System.out.println(i);
			}
		}
	}
	
	@Override
	public char commonNumber() {
		return 0;
	}
}