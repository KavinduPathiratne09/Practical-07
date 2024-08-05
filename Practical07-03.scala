object PrimeFilter {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primes = filterPrime(numbers)
    println(primes)
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    val isPrime: Int => Boolean = (num: Int) => {
      if (num <= 1) false
      else if (num == 2) true
      else !(2 to Math.sqrt(num).toInt).exists(x => num % x == 0)
    }
    numbers.filter(isPrime)
  }
}