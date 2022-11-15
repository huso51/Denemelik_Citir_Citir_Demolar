import com.test.Abc

object Demo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  var nums = List(4, 6, true, "Huseyin");System.out.println("""nums  : List[Any] = """ + $show(nums ));$skip(33); 
  for (a <- nums)
    println(a);$skip(33); 

  var nums2 = List(4, 6, 7, 9);System.out.println("""nums2  : List[Int] = """ + $show(nums2 ));$skip(39); 
  nums2.foreach {f: Int => println(f)};$skip(25); val res$0 = 

  nums.drop(2).take(3);System.out.println("""res0: List[Any] = """ + $show(res$0));$skip(21); val res$1 = 
  nums drop 2 take 3;System.out.println("""res1: List[Any] = """ + $show(res$1));$skip(25); 
  var res2 = nums take 1;System.out.println("""res2  : List[Any] = """ + $show(res2 ));$skip(25); 
  var res3 = nums drop 1
  case class Student(var id: Int, var name: String, var surname: String);System.out.println("""res3  : List[Any] = """ + $show(res3 ));$skip(226); 

  val students = List(Student(1, "Huseyin", "Aydin"), Student(2, "Yasin", "Aydin"), Student(3, "Rumeysa", "Aydin"), Student(4, "Omer Faruk", "Aydin"));System.out.println("""students  : List[Demo.Student] = """ + $show(students ));$skip(29); 
  val first = students.head;System.out.println("""first  : Demo.Student = """ + $show(first ));$skip(33); ;
  val rest = students.tail.head;System.out.println("""rest  : Demo.Student = """ + $show(rest ));$skip(47); ;
  val toppers = students.filter(s => s.id > 2);System.out.println("""toppers  : List[Demo.Student] = """ + $show(toppers ));$skip(73); 
  //toppers = 5
  val (part1, part2) = students.partition(p => p.id > 2);System.out.println("""part1  : List[Demo.Student] = """ + $show(part1 ));System.out.println("""part2  : List[Demo.Student] = """ + $show(part2 ));$skip(21); 

  var num1: Int = 8;System.out.println("""num1  : Int = """ + $show(num1 ));$skip(20); 
  var num2: Int = 7;System.out.println("""num2  : Int = """ + $show(num2 ));$skip(12); 
  num1 = 23;$skip(27); 
  var result: Int = 8.+(7);System.out.println("""result  : Int = """ + $show(result ));$skip(23); 
  println(num1 + num2)

  case class Araba(var id: Int = 1, var name: String = "Renault Broadway") {
    def show() = println("selam")
    def >(a: Araba): Boolean = a.id > id
    def yaz(){
    	println("merhaba")
    }
  };$skip(242); 

  var araba = Araba(1, "Fiat Doblo");System.out.println("""araba  : Demo.Araba = """ + $show(araba ));$skip(15); 
  araba.show();$skip(25); val res$2 = 
  araba.>(Araba(5, "A"));System.out.println("""res2: Boolean = """ + $show(res$2));$skip(17); 
	var i : Int = 0;System.out.println("""i  : Int = """ + $show(i ))}
}
