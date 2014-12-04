(require '[clojure.string :as s])

(apply max (filter #(not (nil? %))
  (for [x (range 100 1000)
        y (range 100 1000)
        :let [mul (* x y)]]
    (if (palindrome? mul)
      mul
    )
  )
))


(defn palindrome? [x] (= (str x) (s/reverse (str x))))
