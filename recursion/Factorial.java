public class Factorial {
	
	public static void main(String[] args){
		Factorial fact = new Factorial();
		System.out.println("Iterative Factorial 5: "+fact.iterativeFactorial(5));
		System.out.println("Recursive Factorial 5: "+fact.recursiveFactorial(5));
		System.out.println("Tail Recursive Factorial 5: "+fact.tailRecursionFactorial(5,1));
		
	}
	
	public int iterativeFactorial(final int num){
		int result = 1;
		for(int i=2;i<=num;i++){
			result*= i;
		}
		return result;
	}
	
	public int recursiveFactorial(final int num){
		
		if(num<=1)
			return 1;
		//It's not the tail-recursion because here last statement is doing multiplication of the result not returning as it is
		return num* recursiveFactorial(num-1);
		
	}
	
		
	public int tailRecursionFactorial(final int num, final int factResult){
		if(num<=1)
			return factResult;
		
		//This is tail-recursion here we are returning result directly.
		return tailRecursionFactorial(num-1,factResult*num);
	}
}