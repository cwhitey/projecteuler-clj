;A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

;a^2 + b^2 = c^2
;For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

;There exists exactly one Pythagorean triplet for which a + b + c = 1000.
;Find the product abc.

(defn square [x] (* x x))

;; Horribly inefficient
(doseq [a (range 1 1000)
        b (range 2 1001)
        c (range 3 1002)]
  (if (and (= (+ (square a) (square b))
              (square c))
           (= 1000 (+ a b c)))
    (println (* a b c))))
