(ns geo-clj.google
  (:require [clj-http.client :as client])
  (:require [clojure.data.json :as json]))


(defn geocode 
  ([address] (geocode address nil))
  ([address region]
   "Uses google geocode api to geocode address. Returns lat / lng."
   (let [apikey (System/getenv "GOOGLE_APIKEY")
         url "https://maps.googleapis.com/maps/api/geocode/json"
         params (if (nil? region)
                  {"key" apikey "address" address}
                  {"key" apikey "address" address "region" region})]

     (if (nil? apikey)
       (println "Unable to read environment variable `GOOGLE_APIKEY`. Please make sure it is set and try again.")
       (-> url
           (client/get {:query-params params})
           (:body)
           (json/read-str :key-fn keyword)
           (:results)
           (first)
           (:geometry)
           (:location))))))


