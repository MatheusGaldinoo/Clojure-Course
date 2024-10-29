(defn length
  ([s] (length s 0))
  ([s cont] 
   (if (empty? s)
    cont
    (length (rest s) (inc cont)) 
   )
  )  
)

(defn value_at
  ([s i] (value_at s i 0))
  ([s i cont]
    (if (empty? s)
      nil
      (if (= cont i)
        (first s)
        (value_at (rest s) i (inc cont))
      )
    )  
  )
)

(defn index
  ([s v] (index s v 0))
  ([s v i]
    (if (empty? s)
      -1 
      (if (= v (first s))
        i
        (index (rest s) v (inc i))  
      )
    )
  )
)

(assert (= 0 (length "")))
(assert (= 1 (length "a")))
(assert (= 4 (length "abcd")))

(assert (= 6 (value_at [5 6 8] 1)))
(assert (= 1 (value_at [1] 0)))
(assert (= nil (value_at [1 2 3 4] 10)))

(assert (= 1 (index [5 6 8] 6)))
(assert (= 0 (index [1] 1)))
(assert (= -1 (index [1 2 3 4] 5)))
