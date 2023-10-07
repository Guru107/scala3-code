inline val pi = 3.14
inline val two = 2
@main def hello() = {
  println(s"Macros: ${pi + two}") //evaluated during compile time
}
