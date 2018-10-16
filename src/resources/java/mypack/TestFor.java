package mypack;

public class TestFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFor obj = new TestFor();
		// obj.add();
		// obj.monthWithSwitch(1);
		obj.testWhile();

	}

	public void add() {
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}

		}
	}

	public void month(int a) {

		if (a == 1) {
			System.out.println("january");
		}

		else if (a == 2) {
			System.out.println("fabruary");
		} else if (a == 3) {
			System.out.println("march");
		} else if (a == 4) {
			System.out.println("april");
		} else if (a == 5) {
			System.out.println("may");
		} else if (a == 6) {
			System.out.println("june");
		} else if (a == 7) {
			System.out.println("july");
		} else if (a == 8) {
			System.out.println("august");
		} else if (a == 9) {
			System.out.println("septemeber");
		} else if (a == 10) {
			System.out.println("october");
		} else if (a == 11) {
			System.out.println("november");
		} else if (a == 12) {
			System.out.println("december");
		} else {
			System.out.println("invalid number");
		}

	}

	public void monthWithSwitch(int a) {

		switch (a) {
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("august");
			break;
		case 9:
			System.out.println("september");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("november");
			break;
		case 12:
			System.out.println("december");
			break;
		default:
			System.out.println("invlid number");

		}
	}

	public void testWhile() {
		int i = 10;
		do {
			System.out.println("do this when while is true" +i);
			i--;
		} while (i >= 0);
	}
}
