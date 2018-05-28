(ns Partial._foreign)

(defn crashWith []
  (fn [msg]
    (throw (RuntimeException. msg))))
