(ns creditcard.logic.gastos-categoria
  (:require [creditcard.logic.resumo :as c.l.resumo]))

(defn organizacao-categoria
  [[categoria detalhes-categoria]]
  {categoria (c.l.resumo/total-das-compras detalhes-categoria)})

(defn total-por-categoria
  [detalhes-compras]
  (->> detalhes-compras
       (map :compra)
       (group-by :categoria)
       (map organizacao-categoria)))

(defn subtotal-categorias
  [[_ detalhes-compras]]
  {:valor-por-categoria (total-por-categoria detalhes-compras)})

(defn gasto-por-categoria
  [compras]
  (->> compras
       (group-by :cliente)
       (map subtotal-categorias)))