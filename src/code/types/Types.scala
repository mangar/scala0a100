package code.types


class MyTypes {

  def isRoda(input: String) = {
    if (input == "roda") Some(s"$input OK") else None
  }

  def tryOther() = {
    "agora sim..."
  }


  def darPartida(param:Int) = {
    if (param >= 1) Right("ok") else Left("nok")
  }

  def partida1() { "Ligado" }             //Unit
  def partida2() = { "Ligado" }           //Infered
  def partida3() = "Ligado"               //Infered
  def partida4() : String = { "Ligado" }  //Definido

}





object Types extends App {

  val myTypes = new MyTypes()


  // Option, Some e None
  val item = "porta"
  println(myTypes.isRoda(item).getOrElse(myTypes.tryOther()))

  // Either
  val partida = myTypes.darPartida(1)
  partida match  {
    case Right(ok) => println(s"[Right] Carro funcionano: $ok")
    case Left(nok) => println(s"[Erro ] Problemas ao dar partida no carro: $nok")
  }


  // Tipo de Retorno...
  println("-" * 50)
  println("Tipo de Retorno")
  println(s"--> ${myTypes partida1() getClass}")
  println(s"--> ${myTypes partida2() getClass}")
  println(s"--> ${myTypes partida3() getClass}")
  println(s"--> ${myTypes partida4() getClass}")



}







