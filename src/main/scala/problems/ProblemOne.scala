/*
Multiples of 3 and 5
Problem 1
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/

package problems

object ProblemOne extends App {

  val limit = 1 to 999 
  
  def f (num : Int) : Boolean = {
	num match {
	
		case num if num % 5 ==0 => true
		case num if num % 3 ==0 => true
		case _ => false
	}

      }

  val filtered =  limit.filter(f)
  println(filtered)
  println(filtered.sum)
}
