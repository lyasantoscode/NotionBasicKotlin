fun main (args: Array < String>) {

//exemplo basico

     if (false) {
        println ("Verdadeiro")
     }else{
          println ("False")
     }
}

============================================

  fun main (args: Array < String>) {

    var idade = 17 

     if (idade >= 18) {
        println ("Usuario é maior de idade")
     }else{
          println ("Usuario é menor de idade")
     }
}

  //resultado: O usuario é menor de idade.
============================================

  
  fun main (args: Array < String>) {

//    var idade = 8
 //   var iddade = 10
  //    var idade = 11
        //var idade = 17
     var idade = 18

     if (idade <= 10) {  // 8 é menor que dez, true nesse caso. 8 nao é igual a dez, entao false
        println ("Criança") // se é 8 é menor então é criança
     }else if(idade <=17){
          println ("Adolescente")
     }else{
       printl ("Adulto")
}
