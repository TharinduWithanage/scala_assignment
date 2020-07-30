object Bank_Account extends App {

  class Account(id:String, n:Int, b:Double) {
	val nic:String = id;
	val acc_number:Int = n;
	var balance:Double = b;
	
    def transfer(account: Account, amount: Double): Unit = {
		if(this.balance>amount)
		{
			this.balance -= amount
			account.balance += amount
			println("transfer the amount successfully. \n Your new balance is :-"+ this.balance);
		}
		else
		{
			println("Your account balnce is not sufficient.");
		}
      
    }

  }

  val a1 = new Account("970415785v", 1005, 156127.3)
  val a2 = new Account("975416745v", 4851, 5984510.5)

  a1.transfer(a2, 1000)
}
