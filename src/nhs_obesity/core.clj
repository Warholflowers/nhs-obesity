(ns nhs-obesity.core
  (:require [incanter.io :as i]
            [incanter.datasets :as d]))

(def stats (i/read-dataset "https://catalogue.ic.nhs.uk/publications/public-health/obesity/obes-phys-acti-diet-eng-2013/obes-phys-acti-diet-eng-2013-csv-tab.csv"))

(take 12 (drop 59 (:rows stats)))
