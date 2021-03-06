(defproject core.cache "0.6.4-SNAPSHOT"
  :description "Cache library for Clojure."
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/data.priority-map "0.0.2"]]
  :profiles {:1.2   {:dependencies [[org.clojure/clojure "1.2.0"]]}
             :1.2.1 {:dependencies [[org.clojure/clojure "1.2.1"]]}
             :1.3   {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.4   {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5   {:dependencies [[org.clojure/clojure "1.5.0"]]}
             :1.5.1 {:dependencies [[org.clojure/clojure "1.5.1"]]}}
  :plugins [[lein-swank "1.4.4"]
            [lein-marginalia "0.7.1"]]
  :repositories {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"}
  :source-paths ["src/main/clojure"]
  :test-paths   ["src/test/clojure"])
