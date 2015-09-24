;;A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

;;a^2 + b^2 = c^2
;;For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

;;There exists exactly one Pythagorean triplet for which a + b + c = 1000.
;;Find the product abc.

(defn square [x] (* x x))

(defn pythagorean? [a b c]
  (= (+ (square a) (square b))
     (square c)))

;; Horribly slow
(time (apply * (first
                (for [a   (range 1 1000)
                      b   (range 2 1001)
                      c   (range 3 1002)
                      :when (and (< a b c)
                                 (= 1000 (+ a b c))
                                 (pythagorean? a b c))]
                  [a b c]))))
