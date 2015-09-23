;; 1
(+ (reduce + (filter #(or (= 0 (mod % 3))(= 0 (mod % 5))) (range 1000))))

;; 2 (preferred)
(reduce + (distinct (into (range 0 1000 3)
                          (range 0 1000 5))))

;; 3
(defn foo []
  (loop [sum 0
         c 0]
    (if (= c 1000)
      sum
      (if (or (= 0 (mod c 3)) (= 0 (mod c 5)))
        (recur (+ sum c)(inc c))
        (recur sum (inc c))))))

(foo)
