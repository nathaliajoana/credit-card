(ns creditcard.logic.resumo)

(defn total-das-compras
  [detalhes]
  (->> detalhes
       (map :valor)
       (reduce +)))

(defn formatacao
  [valor]
  (->> valor
       (format  "%.2f")))

(defn conta-por-cliente
  [[dados detalhes-compras]]
  {:usuario (get dados :nome "Nome nao encontrado")
   :numero-de-compras (count detalhes-compras)
   :valor-total (->> detalhes-compras
                     (map :compra)
                     (total-das-compras)
                     (formatacao))})

(defn resumo
  [compras]
  (->> compras
       (group-by :cliente)
       (map conta-por-cliente)))