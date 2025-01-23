import java.util.*;
public class Main{
	public static void main(String args[]){
		try (Scanner ps = new Scanner(System.in)) {
			int a = ps.nextInt();
			int b = ps.nextInt();
			System.out.println(a > b?"A is greater then B":"B is greater than A");
			System.out.println("Thank you");
		}
	}
}
