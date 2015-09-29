;Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
;If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

;For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

;Evaluate the sum of all the amicable numbers under 10000.


(defn evenly-divisible? [x y]
  (zero? (rem x y)))

(defn sum [a]
  (apply + a))

(defn proper-divisors [n]
  (for [x (range 1 n)
        :when (evenly-divisible? n x)]
    x))

(defn count-proper-divisors [n]
  (sum (proper-divisors n)))

(defn amicable-numbers? [x y]
  (and (not= x y)
       (= (count-proper-divisors x) y)
       (= (count-proper-divisors y) x)))

(defn roof-amicable-numbers [roof]
  (for [x (range 1 roof)
        y (range 1 roof)
        :when (amicable-numbers? x y)]
    [x y]))

(defn count-amicable-numbers [roof]
  (sum (roof-amicable-numbers roof)))


;; Too slow :()
;(roof-amicable-numbers 2000)
