object encry_decry extends App{

  // define alphabet 
  val a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  // get shift as a user input and shift out plain text by this much
  val shift = (scala.io.StdIn.readLine("Enter shift By :- ").toInt + a.size) % a.size
  // code that we encrypt or decrypt 
  val text = scala.io.StdIn.readLine("Message :- ")

  // let's encrypt or decrypt that
  val output_text = text.map( (c:Char) => {

    // then find the c char in our allowed alphabet
    val n = a.indexOf(c.toUpper)

    // if the c char in our alphabet then we encrypt it and if its not then leave 
    if(n == -1)
    {
      c
    }
    else{
      a( (n + shift ) % a.size)
    }

  });

  // print the result
  println(output_text);

}
