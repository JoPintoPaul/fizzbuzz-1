class FizzBuzzOne {
  def generate(start: Int, end: Int): List[String] = {
    (start to end map {
      case fizzbuzz if fizzbuzz % 15 == 0 => "fizzbuzz"
      case number => number.toString
    }).toList
  }
}
