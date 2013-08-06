def calc(a,b,fn) {
	fn(a,b)
}

res  = calc(1,3,{a,b->a+b})
println "1 + 3 = $res"

def sub = {a,b -> a-b}

res  = calc(1,3,sub)
println "1 - 3 = $res"

res = calc(1,3) {a,b ->
	a * b
}

println "1 * 3 = $res"

res = calc(2,5,Math.&max)
println "max(2,5) = $res"

