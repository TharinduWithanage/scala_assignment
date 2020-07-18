object Caesar_cipher extends App{
	
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	val text = "UniversityOfColombo"
	val Encryption = (c:Char, key:Int, s:String)=>s ((s.indexOf(c.toUpper)+key)%s.size)
	val Decryption = (c:Char, key:Int, s:String)=>s ((s.indexOf(c.toUpper)-key+26)%s.size)
	val ciper = (algo:(Char,Int,String)=>Char,s1:String, key:Int, s:String )=>s1.map(algo(_,key,s))
	
	println("Encryption :-  "+ciper(Encryption,text,8,alphabet))
	println("Decryption :-  "+ciper(Decryption,text,8,alphabet))
}