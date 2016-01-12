(require 'cljs.build.api)

(cljs.build.api/build "src"
  {:main 'system-servers.core
   :output-to "main.js"
   :target :nodejs})
