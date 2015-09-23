(defn evenly-divisible? [x y]
  (zero? (rem x y)))

(defn all-evenly-divisible? [x r]
  (every? (partial evenly-divisible? x) r))

(all-evenly-divisible? 6000 '(1 2 3 4 5 6))

;; unfortunately a little slow (4.662 secs)
(with-out-str (time
               (first (for [x     (range 20 300000000 20)
                            :when (all-evenly-divisible? x (range 1 21))]
                        x))))


;; so much better! 0.08ms!!!!
(defn gcd [x y]
  (if (zero? y)
    x
    (gcd y (mod x y))))

(defn lcd [x y]
  (if (or (zero? x) (zero? y))
    0
    (* (/ x (gcd x y)) y)))

(with-out-str (time
               (reduce lcd (range 1 21))))
