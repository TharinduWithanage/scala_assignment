class Account(id:String, n:Int, b:Double) {
	val nic:String = id;
	val acc_number:Int = n;
	var balance:Double = b;
	
    def transfer(account: Account, amount: Double): Unit = {
		if(this.balance>amount)
		{
			this.balance -= amount;
			account.balance += amount;
			println("transfer the amount successfully. \n Your new balance is :-"+ this.balance);
		}
		else
		{
			println("Your account balnce is not sufficient.");
		}
      
    }
	def final_balance(interest: Double): Unit = this.balance += this.balance * interest;

	override def toString: String = s"[Account No:- $acc_number, NIC:- $nic, Balance:- RS $balance /=]";
  }


object Account {

  def negativeAccounts(accounts: List[Account]): List[Account] = accounts.filter(_.balance < 0)

  def sum_of_all_acc_balance(accounts: List[Account]): Double = accounts.map(_.balance).sum

}


object Bank_Account extends App {

  val account_details: List[Account] = List(new Account("975416745v", 4851, 5984510.5), new Account("970415785v", 1005, 156127.3), new Account("971570309v", 9823, -12000), new Account("995594302v", 2387, -250.5));

  println("account details");
  account_details.foreach(println);

  println("List of Accounts with negative balances");
  Account.negativeAccounts(account_details).foreach(println);

  println("sum of all account balances");
  val sum_of_balance = Account.sum_of_all_acc_balance(account_details);
  println(sum_of_balance);

  println("final balances of all accounts after apply the interest");
  account_details.foreach(x => if (x.balance > 0) x.final_balance(0.05) else x.final_balance(0.1));
  account_details.foreach(println);

}


