package patmat
import patmat.Huffman._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 

  println("aaac");$skip(16); val res$0 = 
  decodedSecret;System.out.println("""res0: List[Char] = """ + $show(res$0));$skip(32); 
  val test: List[Bit] = List(0);System.out.println("""test  : List[patmat.Huffman.Bit] = """ + $show(test ));$skip(7); val res$1 = 
  test;System.out.println("""res1: List[patmat.Huffman.Bit] = """ + $show(res$1));$skip(23); val res$2 = 

  convert(frenchCode);System.out.println("""res2: patmat.Huffman.CodeTable = """ + $show(res$2));$skip(102); val res$3 = 
  quickEncode(frenchCode)(List('h', 'u', 'f', 'f', 'm', 'a', 'n', 'e', 's', 't', 'c', 'o', 'o', 'l'));System.out.println("""res3: List[patmat.Huffman.Bit] = """ + $show(res$3));$skip(29); val res$4 = 
  combine(List(Leaf('a',1)));System.out.println("""res4: List[patmat.Huffman.CodeTree] = """ + $show(res$4))}

}
