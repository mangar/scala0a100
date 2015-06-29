package code.types


/**
 * Created by mg on 6/27/15.
 */
class Pneu(val modelo: String) {
  override def toString = s"Pneu modelo: $modelo"
}

class Modelo15XP9 (override val modelo: String) extends Pneu(modelo) {
  override def toString = s"Pneu 15XP9 modelo: $modelo"
}




object Run extends App {

  def loopPneus(pneus:Array[Pneu]) = {
    pneus.map( p => println(p) )
  }

  def loopTodosPneus[T <: Pneu](pneus:Array[T]) = {
    pneus.map( p => println(p) )
  }



  val pneusOriginais = Array(new Pneu("frente 1"),
                             new Pneu("frente 2"),
                             new Pneu("tras 1"),
                             new Pneu("tras 2"))
  loopPneus(pneusOriginais)


  println("-- " * 20)



  val pneus15XP9 = Array(new Modelo15XP9("frente 1"),
                        new Modelo15XP9("frente 2"),
                        new Modelo15XP9("tras 1"),
                        new Modelo15XP9("tras 2"))
//  loopPneus(pneus15XP9) //erro
  loopTodosPneus(pneus15XP9)



  println("--- " * 15)


  def copyPneus[T, S >: T](from:Array[T], to:Array[S]) = {
    val _new = from ++ to
    _new.map( println(_))
  }
  copyPneus(pneus15XP9, pneusOriginais)



}

