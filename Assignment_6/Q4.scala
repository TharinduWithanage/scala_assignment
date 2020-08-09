object q4 extends App{
	val p = Point(7,9)
	
	println("Inverse of "+p+" is "+p.invert)
}

case class Point(p:Int,q:Int){
	def x:Int = p
	def y:Int = q
	 
	def invert = Point(y,x)
	
}