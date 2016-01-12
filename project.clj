(defproject mount-question "0.1.0-SNAPSHOT"

  :dependencies [[org.clojure/clojure        "1.7.0"   ]
                 [org.clojure/clojurescript  "1.7.170" ]
                 [org.clojure/core.async     "0.2.374" ]
                 [cljsjs/moment              "2.10.6-0"]
                 [mount                      "0.1.9-SNAPSHOT"   ]]

  :plugins      [[lein-cljsbuild             "1.1.2"   ]
                 [lein-figwheel              "0.5.0-2" ]
                 [lein-doo                   "0.1.6"   ]]

  :clean-targets ^{:protect false} ["target"]

  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src"]
                        :figwheel true
                        :compiler {:main mount-question.core
                                   :output-to "target/server_out/mount_question_with_figwheel.js"
                                   :target :nodejs
                                   :optimizations :none
                                   :source-map true }}
                       {:id "test"
                        :source-paths ["src" "test"]
                        :figwheel true
                        :compiler {:main mount-question.runner
                                   :output-to "target/testable.js"
                                   :target :nodejs
                                   :optimizations :none
                                   :pretty-print true }}
                       {:id "prod"
                        :source-paths ["src"]
                        :figwheel false
                        :compiler {:main mount-question.core
                                   :output-to "target/server_out/mount_question.js"
                                   :output-dir "target/server_out"
                                   :target :nodejs
                                   :optimizations :none
                                   :source-map "target/server_out/mount_question.js.map" }}]
              :test-commands {"unit-tests" ["nodejs" :runner
                                            "window.literal_js_was_evaluated=true"
                                            "target/testable.js"]}}

  :figwheel {})
;; todo boot instead of lein
