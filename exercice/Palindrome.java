package exercice;

public class Palindrome {


	private String expression;

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public Palindrome(String expression) {
		super();
		this.expression = expression;
	}


	public boolean estPalindrome(){
		String expression1=this.getExpression();
		String expression2;
		expression2= expression1.reverse();
		if (expression1.contains(" ")){
			String exp1 = expression1.replaceAll(" ", "");
			String exp2 = expression2.replaceAll(" ", "");
			expression1=exp1;
			expression2=exp2;
		}
		if (expression1.equals(expression2)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String reverse(){
		
		String expression1 = this.getExpression();
		char[] caracteres= expression1.toCharArray();
		String expression2 = "";
		for (int i=caracteres.length-1;i>=0;i--)
		{        
			expression2 += caracteres[i];
		}	
		return expression2;
		
		
	}
}
