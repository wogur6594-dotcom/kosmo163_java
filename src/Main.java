import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		int i = 0;

		while (flag) {
			String str = sc.nextLine();
			System.out.println(str);
			i++;
			if (i >= 100) {
				flag = false;
			}
		}
	}
}