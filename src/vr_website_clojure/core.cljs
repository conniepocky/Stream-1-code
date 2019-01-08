(ns vr-website-clojure.core
    (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(println "This text is printed from src/vr-website-clojure/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))


(defn hello-world []
  [:div
   [:a-scene
    [:a-assets
     [:img {:src "https://res.cloudinary.com/dexhx07lb/image/upload/v1546795428/photo-1528818955841-a7f1425131b5.jpg" :id "sky"}]
     [:img {:src "https://res.cloudinary.com/dexhx07lb/image/upload/v1546795740/3365ddb45759f21c3e89437155b46135.png" :id "snowman"}]
     [:img {:src "https://res.cloudinary.com/dexhx07lb/image/upload/v1546796195/5f04362c457e10a553b36bc43b45df7e.jpg" :id "tree"}] 
     [:img {:src "https://res.cloudinary.com/dexhx07lb/image/upload/v1546795268/25598471-white-snow-texture-in-frozen-winter-day.jpg" :id "snow"}]]
    [:a-sky  {:src "#sky"}]
    [:a-box {:src "#snowman" :position "0 1 -4"}]
    [:a-box {:src "#tree" :position "3 1 3"}]
    [:a-box {:src "#tree" :position "-5 1 -8"}]
    [:a-box {:src "#tree" :position "20 1 -10"}]
    [:a-box {:src "#tree" :position "-20 1 16"}]
    [:a-box {:src "#tree" :position "10 1 -17"}]
    [:a-box {:src "#tree" :position "3 1 -1"}]
    [:a-plane {:src "#snow" :position "0 0 -4" :rotation "-90 0 0":width "126" :height "124"}]]]) 


(reagent/render-component [hello-world]
                          (. js/document (getElementById "app")))

(defn on-js-reload [])
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)

