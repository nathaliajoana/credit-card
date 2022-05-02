# Credit Card v0
Projeto em Clojure simulando (de forma básica) o cartão de crédito de um cliente Nubank

## Funcionalidades
* Representação dos dados do cliente (nome, cpf, email)
* Representação dos dados do cartão (número, cvv, validade, limite)
* Listagem de compras realizadas (data, valor, estabelecimento, categoria)
* Valor dos gastos agrupados por categoria
* Cálculo do valor da fatura do mês

## Utilização
* Toda funcionalidade está disponível para visualização no arquivo **greet.clj**
* Para verificar a listagem de compras realizadas, rode:
>     (creditcard.db/compras)
* O cálculo da fatura refere-se aos gastos do primeiro ao último dia do mês atual

## Autora
* **Nathália Joana**: @nathaliajoana (https://github.com/nathaliajoana)
* **Nubank** Yes, She Codes! Alura Bootcamp - Week 1
