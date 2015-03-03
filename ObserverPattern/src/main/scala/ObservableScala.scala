import scala.collection.mutable.ListBuffer

/**
 * Created by Shilpika on 3/2/2015.
 */
trait ObservableScala {

 /* type ObserverCallback = ObservableEvent => Unit
  val observers = ListBuffer[ObserverCallback]()
  def changed = {
    val event = ObservableEvent(this)
    observers.foreach(_(event))
  }
}
case class SharePriceWatcher(val share:String) extends ObserverScala{
  private var _value:Double = 0.0
  def value = _value
  def  value_(value:Double):Unit = {
    _value = value
    changed
  }
  override def toString():String = "current value : "+ _value*/
}