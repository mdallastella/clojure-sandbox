(defproject graphs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [aysylu/loom "0.5.0"]
                 [com.tinkerpop/gremlin-core "3.0.0.M7"]
                 [com.tinkerpop/tinkergraph-gremlin "3.0.0.M7"]]
  :main ^:skip-aot graphs.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
