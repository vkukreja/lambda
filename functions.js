
// tested with node.js, to use browser replace console.log with alert

// higher order function - function passed as arg
function calc(a,b,fn) {
return fn(a,b);
}

// anonymous function passed
var res = calc(1,2,function(a,b) { return a*b;});
console.log("1 + 2 = " + res);

// function assigned to a variable
var sub = function(a,b) { return a-b;};
res = calc(1,2,sub);
console.log("1 - 2 = " + res);

res = calc(10,2,Math.max)
console.log("max(10,2) = " + res);


