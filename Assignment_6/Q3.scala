object q3 extends App{
	val p1 = Point(3,4)
	val p2 = Point(4,6)
	
	println("Distance between "+p1+" and "+p2+" is "+p1.distance(p2))
}

case class Point(p:Int,q:Int){
	def x:Int = p
	def y:Int = q
	
	def distance(that:Point)= math.sqrt((this.x-that.x)*(this.x-that.x)+(this.y-that.y)*(this.y-that.y))
}