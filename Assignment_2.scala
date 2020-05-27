object Assignment_2 extends App{
	
	//1st question, calculate monthly salary of an employee
	def nor_hou(no_ho : Int) = 150*4*no_ho; //*4 for monthly salary
	def OT_hou(ot_ho : Int) = 75*4*ot_ho; //*4 for monthly salary
	def salary (no_ho : Int, ot_ho : Int): Double = (nor_hou(no_ho)+OT_hou(ot_ho))*90/100;
	
	println(salary(40,20));
	
	//2st question, find out the best ticket price
	def No_of_people(ticket_price : Int) = (120 + (15 - ticket_price)*20/5 );
	def Cost(ticket_price : Int) = (No_of_people(ticket_price)*3 + 500);
	def Income(ticket_price : Int) = (No_of_people(ticket_price)*ticket_price);
	def Profit(ticket_price : Int) = Income(ticket_price)- Cost(ticket_price);
	
	println(Profit(15));
}