object q2 extends App{
	val p = Point(4,2)
	
	println(p)
	println("The point, after moving : "+p.move(1,7))
}

case class Point(x:Int,y:Int){
	
	def move(dx:Int,dy:Int)= Point(this.x+dx,this.y+dy)
}