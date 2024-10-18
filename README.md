# Desafio ToDoList

## Tecnologias Utilizadas

- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **SpringDoc OpenAPI 3**
- **MySQL**

## Práticas Adotadas

- **SOLID**
- **DRY**
- **YAGNI**
- **KISS**

## Descrição

Este projeto é uma API REST para gerenciamento de tarefas (ToDoList) desenvolvida com **Spring Boot**. Ele utiliza **Spring Data JPA** para acesso ao banco de dados **MySQL** e **Swagger** para documentação automática da API, gerada através do **SpringDoc OpenAPI 3**. A API permite a criação, listagem, atualização e remoção de tarefas.

## Como Executar

1. **Clonar o Repositório**

   Clone este repositório para sua máquina local:

   ```bash
   git clone <URL do repositório>
   cd todolist
Construir o Projeto

Use o Maven Wrapper para construir o projeto:

bash
Copiar código
./mvnw clean package
Executar a Aplicação

Execute a aplicação com o comando:

bash

java -jar target/todolist-0.0.1-SNAPSHOT.jar
Acessar a API

A API estará disponível em localhost:8080.

A documentação Swagger pode ser visualizada em: localhost:8080/swagger-ui.html

Endpoints da API
Para fazer as requisições HTTP, utilizamos a ferramenta httpie:

1. Criar Tarefa
bash

http POST :8080/todos nome="Todo 1" descricao="Desc Todo 1" prioridade=1
Resposta:

json

[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
2. Listar Tarefas
bash
Copiar código
http GET :8080/todos
Resposta:

json
Copiar código
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
3. Atualizar Tarefa
bash
Copiar código
http PUT :8080/todos/1 nome="Todo 1 Up" descricao="Desc Todo 1 Up" prioridade=2
Resposta:

json
Copiar código
[
  {
    "descricao": "Desc Todo 1 Up",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }
]
4. Remover Tarefa
bash
Copiar código
http DELETE :8080/todos/1
Resposta: Status 200 OK (sem conteúdo)

Contribuindo
Sinta-se à vontade para fazer contribuições. Se você encontrar um problema ou tiver uma sugestão de melhoria, abra um issue ou envie um pull request.

