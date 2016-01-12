(ns mount-question.config
  (:require-macros [mount.core :refer [defstate]])
  (:require [cljs.nodejs :as node]
            [clojure.string :as str]))

(comment
  ;; ANALYSIS ERROR: Unable to resolve var: cleanup-if-dirty in this context at line 12 of this file unless we include this :refer in the ns :require expression
  [mount.core :refer [cleanup-if-dirty]])

(defn load [] :todo)

(defstate config :start (load))
