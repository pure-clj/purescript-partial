(ns Partial._foreign)

(defn crashWith [& _]
  (fn [msg]
    (throw (RuntimeException. msg))))
