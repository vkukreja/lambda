object Test {

	class Calc {
		  def exec(a:Int,b:Int,f:(Int,Int)=>Int) = f(a,b)
	}

	def main(args:Array[String])  = {
	 val c1 = new Calc
	 val res1 = c1.exec(1,2,_+_)
	 println("res1 = " + res1 )
	 val res2 = c1.exec(1,2,(a,b)=>a+b)
	 println("res2 = " + res1 )
	 val mult = (a:Int,b:Int) => a * b
	 val res3 = c1.exec(1,2,mult)
	 println("res3 = " + res3)

	 val res4 = c1.exec(1,2,Math.max)
	 println("res4 = " + res4)
	}
}
