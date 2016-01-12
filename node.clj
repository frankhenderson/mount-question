(require 'cljs.build.api)

(cljs.build.api/build "src"
  {:main 'mount-question.core
   :output-to "main.js"
   :target :nodejs})
