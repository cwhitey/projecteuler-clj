(defn problem2 []
  (loop [one 1
         two 2
         sum 0]
    (if (> two 4000000)
      sum
      (if (even? two)
        (recur two (+ one two) (+ sum two))
        (recur two (+ one two) sum)))))

(problem2)
