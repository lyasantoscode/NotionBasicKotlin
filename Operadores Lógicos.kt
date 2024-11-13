fun main (args: Array<String>) {

//operadores lógicos
  // &&     e
  // ||      OU,  Nome desse símbolo é pipes*  



  //  true     &&     true
  if (20 == 20 && 10 < 20) {

    println ("Verdadeiro")

  }else{
    println("Falso")

}

  //resultou em: Verdadeiro
=====================================================

fun main (args: Array<String>) {

//operadores lógicos
  // &&     e
  // ||      OU,  Nome desse símbolo é pipes*  



  //  true     &&     false
  if (20 == 20 && 20 < 20) {

    println ("Verdadeiro")

  }else{
    println("Falso")

}

  //resultou em: Falso
=====================================================
  fun main (args: Array<String>) {

//operadores lógicos
  // &&     e
  // ||      OU,  Nome desse símbolo é pipes*  



  //  true     &&     true
  if (20 == 20 && 10 < 20) {

    println ("Verdadeiro")

  }else{
    println("Falso")

}

  //resultou em: Falso

  //lembrando se um deles, for falso, ja cai na condição "Falso" do else
=====================================================
      fun main (args: Array<String>) {

//operadores lógicos
  // &&     e
  // ||      OU,  Nome desse símbolo é pipes*  



  //  false     &&    false
  if (10 == 20 && 20 < 20) {

    println ("Verdadeiro")

  }else{
    println("Falso")

}

  //resultou em: Falso
  //se ambos forem false, entao falso.

  //lembrando se um deles, for falso, ja cai na condição "Falso" do else
  =====================================================
      fun main (args: Array<String>) {

//operadores lógicos
  // &&     e
  // ||      OU,  Nome desse símbolo é pipes*  



  //  false   &&    false  &&  true
  if (10 == 20 && 20 < 20 && 50 > 30) {

    println ("Verdadeiro")

  }else{
    println("Falso")

}

  //resultou em: Falso
  //se ambos forem false, entao falso.

  //lembrando se um deles, for falso, ja cai na condição "Falso" do else

  =====================================================
      fun main (args: Array<String>) {

//operadores lógicos
  // &&     e
  // ||      OU,  Nome desse símbolo é pipes*  



  //  false   &&   true  &&  true
  if (10 == 20 && 10 < 20 && 50 > 30) {

    println ("Verdadeiro")

  }else{
    println("Falso")

}
// para dar verdadeiro, todos os lados devem ser verdadeiro.
  //resultou em: Falso
  //se ambos forem false, entao falso.

  //lembrando se um deles, for falso, ja cai na condição "Falso" do else
   =====================================================
  fun main (args: Array<String>) {

//operadores lógicos
  // &&     e
  // ||      OU,  Nome desse símbolo é pipes*  



  //  true   &&   true  &&  true
  if (20 == 20 && 10 < 20 && 50 > 30) {

    println ("Verdadeiro")

  }else{
    println("Falso")

}
// para dar verdadeiro, todos os lados devem ser verdadeiro.
  //resultou em: Verdadeiro
  //se ambos forem false, entao falso.

  //lembrando se um deles, for falso, ja cai na condição "Falso" do else
     =====================================================
  fun main (args: Array<String>) {

//operadores lógicos
  // &&     e
  // ||      OU,  Nome desse símbolo é pipes*  

  //  true   OU   true 
  if (20 == 20 || 10 < 20) {

    println ("Verdadeiro")

  }else{
    println("Falso")

}

  //RESULTOU EM VERDADEIRO

  =====================================================
  fun main (args: Array<String>) {

//operadores lógicos
  // &&     e
  // ||      OU,  Nome desse símbolo é pipes*  

  //  true   OU   false 
  if (20 == 20 || 20 < 20) {

    println ("Verdadeiro")

  }else{
    println("Falso")

}

  //RESULTOU EM VERDADEIRO
  // se um dos lados for verdadeiro, o resultado vai ser verdadeiro, vai retornar verdadeiro em nossa condição
// para dar falso, todos os lados precisma ser falso
  =====================================================
  fun main (args: Array<String>) {

//operadores lógicos
  // &&     e
  // ||      OU,  Nome desse símbolo é pipes*  

  //  false   OU   false 
  if (10 == 20 || 20 < 20) {

    println ("Verdadeiro")

  }else{
    println("Falso")

}

  //RESULTOU EM falso, ele caiu no else, por isso mostra falso
// para dar falso, todos os lados precisam ser falso
