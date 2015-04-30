(ns graphs.core
  (:use [loom.graph :only [graph]]
        [loom.io :only [view]])
  (:gen-class))

(def g (graph [1 2] [2 3] {3 [4] 5 [6 7]} 7 8 9))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (view g))
