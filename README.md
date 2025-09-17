# Projeto ADO 1 (Estrutura de dados) - MDS Tennis ProShop

Este projeto foi desenvolvido como atividade do primeiro ADO da disciplina de Programação Orientada a Objetos, aplicando conceitos das aulas 02 e 03 sobre arrays e manipulação de dados.

## Descrição

A loja MDS Tennis ProShop é um negócio familiar que realiza cadastro manual de clientes e pedidos, o que gera lentidão e erros no controle. Para melhorar a organização, este sistema simples automatiza o cadastro dos clientes, registrando informações como nome, telefone, modelo da raquete, tipo de corda, libragem e data de entrega.

O sistema permite:

- Adicionar novos clientes e pedidos
- Pesquisar clientes por posição no vetor
- Alterar informações dos clientes
- Excluir clientes cadastrados
- Listar todos os clientes cadastrados

Todas as operações são feitas utilizando arrays para armazenar os dados, aplicando os conceitos básicos de manipulação de vetores estudados em aula, sem utilizar estruturas como ArrayList.

## Tecnologias

- Java
- Programação Orientada a Objetos
- Manipulação de Arrays

## Como executar

1. Baixe ou clone o repositório
2. Compile as classes Java (`TenisMDS.java`, `VetorTenis.java` e `TesteTenis.java`)
3. Execute a classe `TesteTenis` para iniciar o sistema no terminal
4. Utilize o menu interativo para manipular os dados

---

## Estrutura do projeto

- **TenisMDS.java**: Classe que representa o cliente/pedido, com atributos e métodos getters/setters.
- **VetorTenis.java**: Classe que implementa o vetor (array) de clientes e métodos para manipulação dos dados (adicionar, buscar, remover, listar).
- **TesteTenis.java**: Classe principal com menu para interação com o usuário e controle das operações.

---
