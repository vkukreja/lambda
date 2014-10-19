-- sample program with functions and lambda abstraction
-- Compile as
-- ghc --make Calc.hs -o calc

module Main where

-- define a higher order function
calc a b f = f a b

-- user defined function
add a b = a + b

main = do putStrLn "Higher Order function demo"
          putStrLn "Library function +"
          print ( calc 2 3 (+) )
          putStrLn "User defined function "
          print ( calc 5 3 add )
          putStrLn "Lambda Expression anonymous function "
          print ( calc 4 3 (\x y -> x+y) )
