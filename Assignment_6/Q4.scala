object q4 extends App{
	val p = Point(7,9)
	
	println("Inverse of "+p+" is "+p.invert)
}

case class Point(x:Int,y:Int){
	
	def invert = Point(y,x)
	
}