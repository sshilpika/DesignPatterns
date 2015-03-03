/**
 * Created by Shilpika on 3/2/2015.
 */
trait SubjectScala[S] {
  this: S =>
  private var observers: List[ObserverScala[S]] = Nil
  def addObserver(observer: ObserverScala[S])= observers = observer :: observers
  def removeObserver(observer: ObserverScala[S])= {
    val observerIndex = observers.indexOf(observer)
    observers = observers.filter(_ != observer)
    println("observer at index "+observerIndex+1+" removed")
  }

  def notifyObservers() = observers.foreach(_.receiveUpdate(this))
}

class Account(initialBalance:Double){
  private var currentBalance = initialBalance

  def getBalance = currentBalance
  def deposit(depositAmount:Double) = currentBalance+=depositAmount
  def withdraw(withdrawalAmount:Double) = currentBalance-=withdrawalAmount
}

class ObservedAccount(initialBalance:Double) extends Account(initialBalance) with SubjectScala[Account]{
  override def deposit(depositAmount:Double): Unit ={
    super.deposit(depositAmount)
    notifyObservers()
  }
  override def withdraw(withdrawalAmount:Double): Unit ={
    super.deposit(withdrawalAmount)
    notifyObservers()
  }

}

