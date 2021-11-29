(ns creditcard.logic.fatura
  (:require [java-time :as time]
            [creditcard.logic.resumo :as c.l.resumo]))

(defn valores
  [[_ detalhes]]
  (c.l.resumo/total-das-compras detalhes))

(defn mes-atual?
  [[data _]]
  (= (time/as data :month-of-year) (time/as (time/local-date) :month-of-year)))

(defn compras-do-mes
  [[_ detalhes-compras]]
  (->> detalhes-compras
       (map :compra)
       (group-by :data)
       (filter mes-atual?)
       (map valores)
       (reduce +)))

(defn fatura-do-mes
  [compras]
  (->> compras
       (group-by :cliente)
       (map compras-do-mes)))