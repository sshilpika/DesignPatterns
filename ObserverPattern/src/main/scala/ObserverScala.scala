/**
 * Created by Shilpika on 3/2/2015.
 */
trait ObserverScala[S]{
  def receiveUpdate(subject: S)
}

class AccountReporter extends ObserverScala[Account]{
  override def receiveUpdate(subject: Account): Unit = {
    println("Current Balance is "+subject.getBalance)
  }
}