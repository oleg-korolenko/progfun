package funsets

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(33); 
  
  def f : Int=>Boolean=x=>x>0;System.out.println("""f: => Int => Boolean""");$skip(32); 
  def n : Int=>Boolean=x=>!f(x);System.out.println("""n: => Int => Boolean""")}
}
