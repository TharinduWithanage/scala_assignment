object Functions_and_data_Q1 extends App{
  val x = new Rational(8,9)
  val y = new Rational(2,8)
  val z = new Rational(3,7)
   
  println("x-y-z ="+x.sub(y).sub(z))
}

class Rational(n:Int,d:Int){
  def numer = n/GCD(n,d)
  def denom = d/GCD(n,d)
  
  def neg_of_rational = new Rational(-this.numer,this.denom) 
  
  def +(r:Rational) = new Rational(this.numer*r.denom + r.numer*this.denom,denom*r.denom)
  
  def sub(r:Rational) = this+r.neg_of_rational
  
  private def GCD(x:Int,y:Int):Int = if(y==0) x else GCD(y,x%y)

  override def toString = numer+"/"+denom
}
