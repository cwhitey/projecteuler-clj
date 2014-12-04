;2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

;What is the sum of the digits of the number 2^1000?


;(use 'clojure.contrib.math)
(defn exp [x n]
  (reduce * (repeat n x)))

(defn sum-exp-digits [x n]
  (reduce + (for [d (str (exp x n))]
              (read-string (str d)))))

(sum-exp-digits 2 10)
