DAO JDBC

Projeto em Java com JDBC puro utilizando o padrão DAO (Data Access Object) para praticar acesso a banco de dados relacional, organização em camadas e mapeamento manual de entidades.

Sobre o projeto

Este projeto foi desenvolvido com o objetivo de consolidar fundamentos importantes de backend Java, aplicando operações de CRUD e consultas sobre entidades como Seller e Department.

Durante a implementação, foram praticados conceitos como:

JDBC

padrão DAO

SQL

tratamento de exceções

separação de responsabilidades

mapeamento objeto-relacional manual

Tecnologias

Java 17

JDBC

Maven

MySQL

MySQL Connector/J

IntelliJ IDEA

Estrutura do projeto
src/main/java/io/github/devpedropavanello
├── application
├── db
└── model
    ├── dao
    │   └── impl
    └── entities
Arquitetura

O projeto está organizado em camadas simples:

application

Execução e testes da aplicação.

db

Conexão com banco e tratamento de exceções.

model.entities

Entidades do domínio.

model.dao

Contratos de acesso aos dados.

model.dao.impl

Implementações JDBC dos DAOs.

Padrão DAO

O padrão DAO foi utilizado para encapsular a lógica de persistência e evitar SQL espalhado pela aplicação.

Interfaces principais

SellerDao

DepartmentDao

Implementações

SellerDaoJDBC

DepartmentDaoJDBC

Funcionalidades praticadas

Buscar por ID

Buscar todos os registros

Inserir dados

Atualizar dados

Deletar dados

Relacionamento entre entidades

Tratamento de exceções de integridade e acesso ao banco

Configuração do banco

Exemplo de URL JDBC utilizada:

jdbc:mysql://localhost:3306/coursejdbc

Também é necessário configurar:

usuário

senha

porta

banco de dados

Como executar
1. Clone o repositório
git clone https://github.com/devpedropavanello/dao-jdbc.git
2. Abra o projeto em uma IDE Java
3. Configure o banco de dados MySQL
4. Ajuste os dados de conexão
5. Execute as classes de teste em application
Aprendizados

Este projeto foi importante para reforçar minha base em:

acesso a banco de dados com Java

JDBC na prática

modelagem orientada a objetos aplicada à persistência

arquitetura em camadas

uso do padrão DAO em aplicações Java
