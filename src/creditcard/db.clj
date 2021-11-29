(ns creditcard.db
  (:require [java-time :as time]))

(def compra1 {:cliente {:nome "Fulano Silva", :cpf "111.222.333-00", :email "fulanosilva@gmail.com"}
              :cartao  {:numero "0000 0000 0000 0000", :cvv "123", :validade "05/2025", :limite 5000.00}
              :compra  {:data            (time/local-date 2021 10 29)
                        :valor           54.99
                        :estabelecimento "Hamburgueria A"
                        :categoria       "Alimentação"}})

(def compra2 {:cliente {:nome "Fulano Silva", :cpf "111.222.333-00", :email "fulanosilva@gmail.com"}
              :cartao  {:numero "0000 0000 0000 0000", :cvv "123", :validade "05/2025", :limite 5000.00}
              :compra  {:data            (time/local-date 2021 11 03)
                        :valor           100.20
                        :estabelecimento "Farmacia B"
                        :categoria       "Saúde"}})

(def compra3 {:cliente {:nome "Fulano Silva", :cpf "111.222.333-00", :email "fulanosilva@gmail.com"}
              :cartao  {:numero "0000 0000 0000 0000", :cvv "123", :validade "05/2025", :limite 5000.00}
              :compra  {:data            (time/local-date 2021 11 05)
                        :valor           599.50
                        :estabelecimento "Faculdade C"
                        :categoria       "Educação"}})

(def compra4 {:cliente {:nome "Fulano Silva", :cpf "111.222.333-00", :email "fulanosilva@gmail.com"}
              :cartao  {:numero "0000 0000 0000 0000", :cvv "123", :validade "05/2025", :limite 5000.00}
              :compra  {:data            (time/local-date 2021 11 11)
                        :valor           550.99
                        :estabelecimento "Mercado D"
                        :categoria       "Alimentação"}})

(def compra5 {:cliente {:nome "Fulano Silva", :cpf "111.222.333-00", :email "fulanosilva@gmail.com"}
              :cartao  {:numero "0000 0000 0000 0000", :cvv "123", :validade "05/2025", :limite 5000.00}
              :compra  {:data            (time/local-date 2021 11 20)
                        :valor           400.00
                        :estabelecimento "Consultorio E"
                        :categoria       "Saúde"}})

(def compra6 {:cliente {:nome "Fulano Silva", :cpf "111.222.333-00", :email "fulanosilva@gmail.com"}
              :cartao  {:numero "0000 0000 0000 0000", :cvv "123", :validade "05/2025", :limite 5000.00}
              :compra  {:data            (time/local-date 2021 11 25)
                        :valor           145.90
                        :estabelecimento "Curso F"
                        :categoria       "Educação"}})

(defn compras []
 [compra1, compra2, compra3, compra4, compra5, compra6])