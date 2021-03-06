(ns clockwork-electron-front.init
  (:require [figwheel.client :as fw :include-macros true]
            [clockwork-electron-front.core :as core]
            [clockwork-electron-front.conf :as conf]
            [devtools.core :as devtools]
            ))

(enable-console-print!)
(devtools/install!)

(fw/watch-and-reload
 :websocket-url   "ws://localhost:3449/figwheel-ws"
 :jsload-callback 'start-descjop!)

(defn start-descjop! []
  (core/init! conf/setting))

(start-descjop!)
