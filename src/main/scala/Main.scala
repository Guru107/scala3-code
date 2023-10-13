inline val pi = 3.14
inline val two = 2

inline def log[T](level: Int, message: => String)(inline op: T): T = {
  println(s"[$level] Computing $message")
  val res = op
  println(s"[$level] Result of $message: $res")
  res
}
@main def hello() = {
  println(s"Macros: ${pi + two}") //evaluated during compile time
  def message() = "Sum"
  def sum(a: Int, b: Int) = a + b

  //Calling inline method
  log(1, message()) {
    sum(4,5)
  }
}
