(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
    {:main 'hello-world.core
     :output-to "out/hello_world.js"
     :output-dir "out"
     :verbose true :optimizations :advanced})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))


