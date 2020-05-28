object recursions extends App{
	
	//1st question
	def GCD (num_1: Int, num_2: Int):Int = num_2 match{
		case 0 => num_1;
		case num_2 if(num_2>num_1) => GCD(num_2, num_1);
		case num_2 => GCD(num_2, num_1%num_2);
	}
	
	def isprime(num : Int, d: Int=2): Boolean = num match{
		
		case num if(d==num)=>true;
		case num if GCD(num,d)>1 =>false
		case num => isprime(num, d+1)
	
	}
	println("\n1st question, check the prime or not \n");
	println(isprime(7));
	println(isprime(8));
	
	//2nd question
	def prime(p : Int, n : Int=2): Any ={
		if(p>=n){if(isprime(n)) println(n);
					prime(p, n+1)};
		
	}
	println("\n2st question, prints all prime number which less than n(given number) \n");
	prime(10);
	
	//3 rd question
	def sum(number : Int) : Int ={
		if(number == 1)  1;
		
		else  (number + sum(number-1));
	}
	println("\n3rd question, addition of numbers from 1 to n \n");
	println(sum(5));
	
	//4th question
	def IsEven(num : Int): Boolean = num match{
		case 0 => true
		case _ => IsOdd(num-1)
	}
	def IsOdd(num : Int):Boolean = !(IsEven(num));
	
	println("\n4th question, determine even and odd \n");
	println(IsEven(10));
	println(IsEven(9));
	println(IsOdd(7));
	println(IsOdd(4));
	
	
	//5th question
	def create_less_num(num : Int) : Int = {
		if(num%2 == 0) add_even_num(num-2);
		else add_even_num(num-1);
	}
	def add_even_num(num : Int) : Int=num match{
		case 0 => 0;
		case 1 => 0;
		case num if(num<0) => 0;
		case num => (num + add_even_num(num-2));
	}
	println("\n5th question, get the addition of all even numbers less than given n \n");
	println(create_less_num(9));
	println(create_less_num(10));
	
	//6th question
	def fibonacci(num : Int) : Int = num match{
		case 0 => 0;
		case 1 => 1;
		case num => fibonacci(num-1)+fibonacci(num-2);
	}
	def fibonacci_sequence(num : Int): Unit = {
		if(num>0) fibonacci_sequence(num-1);
		println(fibonacci(num));
	}
	println("\n5th question, print fist n Fibonacci numbers for given n \n"); 
	fibonacci_sequence(12);
}