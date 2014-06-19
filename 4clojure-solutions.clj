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
#((vec %1) %2)

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

; 26: N Fibonacci numbers
(fn [n]
  (letfn [(fib [i]
            (if (>= 2 i)
              1
              (+ (fib (dec i)) (fib (- i 2)))))]
    (map fib (take n (iterate #(inc %) 1)))))

; 27: Palindrome detector
#(= (seq %) (reverse %))

; 28: Flatten a sequence
#(filter (complement sequential?) (rest (tree-seq sequential? seq %)))

; 29: Get the caps
#(reduce str (re-seq #"[A-Z]" %))

; 30: Compress a string
#(map first (partition-by identity %))

; 31: Pack a sequence
#(partition-by identity %)

; 32: Duplicate a sequence
(fn [s] (mapcat #(repeat 2 %) s))

; 33: Replicate a sequence
(fn [s, n] (mapcat #(repeat n %) s))

; 34: Implement range
; Restrictions: range
#(take (- %2 %1) (iterate inc %1))

; 36: Let it be
[x 7 y 3 z 1]

; 37: Regular expressions
"ABC"

; 38: Maximum value
; Restrictions: max, max-key
#(last (sort %&))

; 39: Interleave two seqs
; Restrictions: interleave

