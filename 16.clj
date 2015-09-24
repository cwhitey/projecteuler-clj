;2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

;What is the sum of the digits of the number 2^1000?

(defn exp
  "Use bigint to avoid an integer overflow!"
  [x n]
  (reduce * (repeat n (bigint x))))

(defn sum-exp-digits [x n]
  (reduce + (for [d (str (exp x n))]
              (read-string (str d)))))

(sum-exp-digits 2 1000)
