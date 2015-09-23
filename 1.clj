(def any? (complement not-any?))

(defn evenly-divisible? [x y]
  (zero? (rem x y)))

(defn any-evenly-divisible? [x r]
  (any? (partial evenly-divisible? x) r))

;; 1 
(time
 (+ (reduce + (filter #(any-evenly-divisible? % [3 5]) (range 1000)))))

;; 2 (most readable)
(time
 (reduce + (distinct (into (range 0 1000 3)
                           (range 0 1000 5)))))

;; 3 (fastest)
(defn foo []
  (loop [sum 0
         c 0]
    (if (= c 1000)
      sum
      (if (any-evenly-divisible? c [3 5])
        (recur (+ sum c)(inc c))
        (recur sum (inc c))))))

(time (foo))
