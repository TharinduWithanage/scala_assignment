object Functions_and_data_Q1 extends App{
	val r1=new Rational(4,7)
	val r2=new Rational(5,9)
	
	println("Rational number:- "+r1)
	println("Neg value of Rational number:- "+r1.neg_Of_Rational)
	
	println("Rational number:- "+r2)
	println("Neg value of Rational number:- "+r2.neg_Of_Rational)
}

class Rational(n:Int,d:Int){
	def numer = n
	def denom = d
	
	def neg_Of_Rational = new Rational(-this.numer,this.denom)
	
	override def toString = numer+"/"+denom 
}
