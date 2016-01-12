(ns ^:figwheel-always mount-question.core
  (:require [mount-question.config :as config]
            [cljs.nodejs :as node]))

(node/enable-util-print!)

(defn -main [& args]
  (.log js/console "main is running"))

(set! *main-cli-fn* -main)
