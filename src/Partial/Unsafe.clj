(ns Partial.Unsafe._foreign)

(defn unsafePartial [f]
  (f nil))
