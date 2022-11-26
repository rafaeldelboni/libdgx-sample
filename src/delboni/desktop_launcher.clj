(ns delboni.desktop-launcher
  (:require [delboni.core :as core])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main []
  (LwjglApplication. (core/game) "demo" 800 600)
  (Keyboard/enableRepeatEvents true))
