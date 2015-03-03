/**
 * Created by Shilpika on 3/2/2015.
 */
object TestObserverScala extends App{
  val oa = new ObservedAccount(100.0)

   val ar = new AccountReporter

  oa.addObserver(ar)

  oa.deposit(40.0)

  oa.withdraw(40.0)

}
