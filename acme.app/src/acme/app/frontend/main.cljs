(ns ^:figwheel-hooks acme.app.frontend.main)

(js/console.log "Hello, world")

;; This is called once
(defonce init
  (do (set! (.-innerHTML (js/document.getElementById "app"))
            "<p>Loaded app!</p>
            <p>Edit <strong><code>src/acme/app/frontend/main.cljs</code></strong> to change this message.</p>")
      true))

;; This is called every time you make a code change
(defn ^:after-load reload []
  (set! (.-innerText (js/document.getElementById "app")) "Hot Reloaded app!"))
