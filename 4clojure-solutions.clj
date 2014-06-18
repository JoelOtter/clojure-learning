; My solutions to the problems on 4Clojure
; (http://www.4clojure.com).
; Leaving out the ludicrously easy ones.

; 15: Double Down
(fn [x] (* x 2))

; 16: Hello World
(fn [x] (str "Hello, " x "!"))

; 19: Last element
; Restrictions: last
#(nth % (- (count %) 1))

; 20: Penultimate element
#(nth % (- (count %) 2))

; 21: Nth element
; Restrictions: nth
(fn [x, y] ((vec x) y))

; 22: Count a sequence
; Restrictions: count
(fn [coll] (reduce (fn [x, coll] (inc x)) 0 coll))


