package exercice;

import java.util.Scanner;

public class TestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir un mot :");

		String str = sc.nextLine();
		Palindrome p= new Palindrome(str);
		System.out.println(p.getExpression()+" est un palindrome? "+p.estPalindrome());
	
		
	}

}
