;; The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
;; Find the sum of all the primes below two million.

;; Admittedly used a little help from http://stackoverflow.com/questions/960980/fast-prime-number-generation-in-clojure
;; My solution was massively too slow

(def certainty 5)

(defn prime? [n]
  (.isProbablePrime (BigInteger/valueOf n) certainty))

(defn problem10 []
  (for [x (range 1 2000000)
        :when (prime? x)]
    x))

(time
 (apply + (problem10)))
