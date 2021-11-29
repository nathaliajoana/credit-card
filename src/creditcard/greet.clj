(ns creditcard.greet
  (:require [creditcard.db :as c.db]
            [creditcard.logic.resumo :as c.l.resumo]
            [creditcard.logic.gastos-categoria :as c.l.categoria]
            [creditcard.logic.fatura :as c.l.fatura]))

(println "Nubank - Sistema básico de cartão de crédito")

(let [resumo    (c.l.resumo/resumo (c.db/compras))
      categoria (c.l.categoria/gasto-por-categoria (c.db/compras))
      fatura    (c.l.fatura/fatura-do-mes (c.db/compras))]

  (println "____________________________________________ \n")
  (println "Olá," (get (first resumo) :usuario "cliente!") ":)")
  (println "Você fez um total" (get (first resumo) :numero-de-compras 0)  "compras no seu cartão.")
  (println "Até hoje, seu gasto no cartão de crédito foi de R$" (get (first resumo) :valor-total 0) "...")
  (println "Por categoria:" (get (first categoria) :valor-por-categoria "Nenhum gasto por categoria encontrado!"))
  (println "Sua fatura do mês: R$" (c.l.resumo/formatacao (first fatura))))

; Listagem de compras realizadas: (c.db/compras))
