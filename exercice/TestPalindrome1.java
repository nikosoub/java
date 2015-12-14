package exercice;

public class TestPalindrome1 {

		public static void main(String[] args) {
			TestPalindrome1 testPalindrome = new TestPalindrome1();
			System.out.println("Doivent etre palindrome");
			testPalindrome.testChaine("kayak");
			testPalindrome.testChaine("radar");
			testPalindrome.testChaine("y");
			testPalindrome.testChaine("oo");
			testPalindrome.testChaine("Esope reste ici et se repose");

			System.out.println("Ne doivent pas etre un palindrome");
			testPalindrome.testChaine("chien");
			testPalindrome.testChaine("maison");

		}

		public void testChaine(String chaine) {
			Palindrome1 palindrome = new Palindrome1();

			boolean result = palindrome.estPalindrome(chaine);
			if (result == true) {
				System.out.println(chaine + ": est un palindrome");
			} else {
				System.out.println(chaine + ": n'est pas un palindrome");
			}

		}

	}
