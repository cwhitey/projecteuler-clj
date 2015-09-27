;n! means n × (n − 1) × ... × 3 × 2 × 1

;For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
;and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

;Find the sum of the digits in the number 100!

(defn fac [number]
  (reduce #(bigint (* %1 %2)) (range 1 (inc number))))

(defn sum-digits [number]
  (reduce + (map read-string (map str (str number)))))

(sum-digits (fac 100))
