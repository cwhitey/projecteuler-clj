;; The prime factors of 13195 are 5, 7, 13 and 29.
;; What is the largest prime factor of the number 600851475143?

(def certainty 5)

(defn prime? [n]
  (.isProbablePrime (BigInteger/valueOf n) certainty))

(defn primes
  "Use ceiling if supplied, otherwise use infinite seq."
  ([]
   (primes nil))
  ([c]
   (for [x (if c (range 2 c) (range))
         :when (prime? x)]
     x)))

(defn factor-of?
  "Is x a factor of y?"
  [x y]
  (zero? (rem y x)))

(defn prime-factors-of [n]
  (for [x (primes n)
        :when (factor-of? x n)]
    x))

(defn largest-prime-factor-of [n]
  (apply max (prime-factors-of n)))

(largest-prime-of 13195)

(defn problem3 []
  (largest-prime-of 600851475143))

;; too slow?
(problem3)
