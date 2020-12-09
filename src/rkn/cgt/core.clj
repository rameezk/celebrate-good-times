(ns rkn.cgt.core
  (:require
   [clojure.string :as str]
   [rkn.cgt.song :as song]))

(defn sing
  "Sing the song of our people"
  [lyrics]
  (reduce
    (fn [res [_ word]] (str res word " ")) "" lyrics))
