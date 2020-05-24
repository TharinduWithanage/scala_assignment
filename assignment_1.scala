object Assignment_1 extends App{

  //1st question, convert celsias into Fahrenhei
  def cel_to_fahr(x: Double) = x*1.8+32;
    println("1st question, convert celsias into Fahrenhei :-")
	println(cel_to_fahr(35));

  //2nd question, calculate volume of a sphere
  def 	volume_of_a_sphere(r: Double) = (4/3)*3.14*math.pow(r,3);
	println("2nd question, calculate volume of a sphere :-")
	println(volume_of_a_sphere(5));
	
  //3rd question, calculate wholesale cost
  def wholesale_cost(n: Int): Double ={
	if(n>50)(((24.95*60/100)*n)+3+(n-50)*0.75);
	
	else ((24.95*60/100)*n+3);

 }
 println("3rd question, calculate wholesale cost :-")
 println(wholesale_cost(60));
}