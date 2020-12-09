(ns rkn.cgt.song
  (:require [clojure.string :as str]))

(def lyrics
  (->  "Celebrate good times, come on!"
       (str/split #" ")
       (->> (map-indexed vector)
            shuffle)))
