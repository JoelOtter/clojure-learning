; My solutions to the problems on 4Clojure
; (http://www.4clojure.com).
; Leaving out the ludicrously easy ones.

; 15: Double Down
#(* % 2)

; 16: Hello World
#(str "Hello, " % "!")

; 19: Last element
; Restrictions: last
#(nth % (- (count %) 1))

; 20: Penultimate element
#(nth % (- (count %) 2))

; 21: Nth element
; Restrictions: nth
(fn [x, y] ((vec x) y))

; 22: Count a sence
; Restrictions: count
#(reduce (fn [x, %] (inc x)) 0 %)

; 23: Reverse a sence
; Restrictions: reverse, rseq
#(reduce conj '() %)

; 24: Sum It All Up
#(reduce + %)

; 25: Find the odd numbers
#(filter odd? %)
