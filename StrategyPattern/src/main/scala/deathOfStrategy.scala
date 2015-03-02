object deathOfStrategy extends App{
  def add(a:Int, b:Int) = a+b
  def sub(a:Int,b:Int) = a-b
  def mul(a:Int,b:Int)= a*b

  def executeStrategyLike(callback:(Int,Int)=>Int, a:Int,b:Int)= callback(a,b)
  println("Add: "+ executeStrategyLike(add,3,4))
  println("Subtract: "+ executeStrategyLike(sub,10,4))
  println("Multiply: "+ executeStrategyLike(mul,3,4))

}