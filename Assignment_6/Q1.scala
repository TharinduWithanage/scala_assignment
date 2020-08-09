object q1 extends App{
	val p1 = Point(5,3)
	val p2 = Point(4,7)
	
	println("Addition of "+p1+" and "+p2+" is "+p1.add(p2))
	
}

case class Point(p:Int,q:Int){
	def x:Int = p
	def y:Int = q
	
	def add(that:Point) = Point(this.x+that.x,this.y+that.y)
}