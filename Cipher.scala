class caesar_cipher(phrase: String, offset: Int){
	//use all the ASCII table
	val maxChar = 127

	def apply_cipher: String = {
		var newPhrase = ""
		for(c <- this.phrase){
			var newChar = c + this.offset

			if(newChar > maxChar){
				newChar -= maxChar + 1
			}


			//yield newChar.toChar;
			newPhrase += newChar.toChar
		} 

		newPhrase

	}

}

object Cipher{
	def main(args: Array[String]): Unit = {

		val cipher = new caesar_cipher(args(0), args(1).toInt)
		val newPhrase = cipher.apply_cipher
		println(newPhrase)
	}
}