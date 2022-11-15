import com.test.Abc

object Demo {
  var nums = List(4, 6, true, "Huseyin")          //> nums  : List[Any] = List(4, 6, true, Huseyin)
  for (a <- nums)
    println(a)                                    //> 4
                                                  //| 6
                                                  //| true
                                                  //| Huseyin

  var nums2 = List(4, 6, 7, 9)                    //> nums2  : List[Int] = List(4, 6, 7, 9)
  nums2.foreach {f: Int => println(f)}            //> 4
                                                  //| 6
                                                  //| 7
                                                  //| 9

  nums.drop(2).take(3)                            //> res0: List[Any] = List(true, Huseyin)
  nums drop 2 take 3                              //> res1: List[Any] = List(true, Huseyin)
  var res2 = nums take 1                          //> res2  : List[Any] = List(4)
  var res3 = nums drop 1                          //> res3  : List[Any] = List(6, true, Huseyin)
  case class Student(var id: Int, var name: String, var surname: String)

  val students = List(Student(1, "Huseyin", "Aydin"), Student(2, "Yasin", "Aydin"), Student(3, "Rumeysa", "Aydin"), Student(4, "Omer Faruk", "Aydin"))
                                                  //> students  : List[Demo.Student] = List(Student(1,Huseyin,Aydin), Student(2,Ya
                                                  //| sin,Aydin), Student(3,Rumeysa,Aydin), Student(4,Omer Faruk,Aydin))
  val first = students.head;                      //> first  : Demo.Student = Student(1,Huseyin,Aydin)
  val rest = students.tail.head;                  //> rest  : Demo.Student = Student(2,Yasin,Aydin)
  val toppers = students.filter(s => s.id > 2)    //> toppers  : List[Demo.Student] = List(Student(3,Rumeysa,Aydin), Student(4,Ome
                                                  //| r Faruk,Aydin))
  //toppers = 5
  val (part1, part2) = students.partition(p => p.id > 2)
                                                  //> part1  : List[Demo.Student] = List(Student(3,Rumeysa,Aydin), Student(4,Omer 
                                                  //| Faruk,Aydin))
                                                  //| part2  : List[Demo.Student] = List(Student(1,Huseyin,Aydin), Student(2,Yasin
                                                  //| ,Aydin))

  var num1: Int = 8                               //> num1  : Int = 8
  var num2: Int = 7                               //> num2  : Int = 7
  num1 = 23
  var result: Int = 8.+(7)                        //> result  : Int = 15
  println(num1 + num2)                            //> 30

  case class Araba(var id: Int = 1, var name: String = "Renault Broadway") {
    def show() = println("selam")
    def >(a: Araba): Boolean = a.id > id
    def yaz(){
    	println("merhaba")
    }
  }

  var araba = Araba(1, "Fiat Doblo")              //> araba  : Demo.Araba = Araba(1,Fiat Doblo)
  araba.show()                                    //> selam
  araba.>(Araba(5, "A"))                          //> res2: Boolean = true
	var i : Int = 0                           //> i  : Int = 0
}