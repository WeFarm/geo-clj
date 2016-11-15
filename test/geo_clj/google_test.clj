(ns geo-clj.google-test
  (:require [clojure.test :refer :all]
            [geo-clj.google :refer :all]))



(def county-tests [{:name "county bomgoma" :pin {:lat 0.5695252, :lng 34.5583766}}
                   {:name "county bomot" :pin {:lat 30.080174, :lng -94.1265562}}
                   {:name "county bondo" :pin {}}
                   {:name "county bongoma" :pin {:lat 0.5695252, :lng 34.5583766}}
                   {:name "county borabu" :pin {:lat 15.9872056, :lng 103.1279039}}
                   {:name "county bormet" :pin {}}
                   {:name "county btmgoma" :pin {}}
                   {:name "county bubaale" :pin {}}
                   {:name "county bubaare" :pin {}}
                   {:name "county bubulo" :pin {:lat 46.6623963, :lng -92.23484669999999}}
                   {:name "county bubulo east" :pin {:lat 46.6623963, :lng -92.23484669999999}}
                   {:name "county bubulo east uganda" :pin {}}
                   {:name "county bubulo manafwa" :pin {:lat 0.9063599, :lng 34.28660910000001}}
                   {:name "county bubulo town council" :pin {:lat 0.9481282999999999, :lng 34.272721}}
                   {:name "county bubulo wast county" :pin {}}
                   {:name "county bugoma bt current am at uasin gishu county" :pin {:lat 0.5143472, :lng 35.2697119}}])



(deftest geocode-test
  (testing "Testing GeoCoding."
    (doseq [county-map county-tests]
      (let [res (geocode (:name county-map))]
        (println "county: " (:name county-map) " = " res)
        (is (= (:lat res) (:lat (:pin county-map))))))))


