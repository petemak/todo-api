(ns main-test
  (:require [main]
            [clojure.test :as test]
            [io.pedestal.http :as http]
            [io.pedestal.test :as ptest]))

(ptest/response-for
 (http/service-fn @main/server)
 :get "/todo")

(def echo "")
