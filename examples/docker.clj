(require '[babashka.pods :as pods])

(pods/load-pod 'lispyclouds/docker "0.1.0")

(require '[pod.lispyclouds.docker :as docker])

(def images (docker/client {:category :images
                            :conn     {:uri "unix:///var/run/docker.sock"}}))