;;By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

;;What is the 10 001st prime number?

(def certainty 5)

(defn prime? [n]
  (.isProbablePrime (BigInteger/valueOf n) certainty))

(defn primes []
  (for [x (range)
        :when (prime? x)]
    x))

(defn problem7 []
  (last (take 10001 (primes))))

(time (problem7))
