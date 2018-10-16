package stepdefinition;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "tutorials point";
		String[] try1 = input.split(" ");
		char[] name = try1[0].toCharArray();
		char out1 = name[0];
		System.out.println(out1 + " "+try1[1]);
	}
}