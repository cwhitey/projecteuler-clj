(require '[clojure.string :as s])

(defn palindrome? [x] (= (str x) (s/reverse (str x))))

(time
 (apply max (filter identity
                         (for [x (range 100 1000)
                               y (range 100 1000)
                               :while (>= x y)
                               :let [z (* x y)]
                               :when (palindrome? z)]
                           z))))
