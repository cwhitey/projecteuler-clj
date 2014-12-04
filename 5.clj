;2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

;What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

(first(filter #(and (not (nil? (second %))) (= 19 (count (second %)))) (for [x (range 2520 100000000)
      :let[y (filter #(= 0 (mod x %)) (range 1 21))]]
       [x y]))
)
