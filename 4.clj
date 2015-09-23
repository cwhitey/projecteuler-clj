(require '[clojure.string :as s])

(defn palindrome? [x] (= (str x) (s/reverse (str x))))

(apply max (filter identity
                   (for [x (range 100 1000)
                         y (range 100 1000)
                         :when (palindrome? (* x y))]
                     mul)))
