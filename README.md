# API REST - Produtos

API REST desenvolvida com Java 21 e Spring Boot como exercício de aprendizado e prática dos conceitos de desenvolvimento Backend.

O projeto foi inspirado na primeira aula da série de Spring Boot do Souza Dev.

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MariaDB
- Maven
- Lombok
- Bean Validation

## Funcionalidades

- Listar produtos;
- Cadastrar produtos;
- Atualizar produtos;
- Excluir produtos;
- Validar dados recebidos;
- Tratar exceções globalmente.

## Endpoints

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/v1/produtos` | Listar produtos |
| POST | `/v1/produtos` | Cadastrar produto |
| PUT | `/v1/produtos/{id}` | Atualizar produto |
| DELETE | `/v1/produtos/{id}` | Excluir produto |

## Configuração

É necessário ter Java 21 e MariaDB instalados.

Configure as seguintes variáveis de ambiente:

```env
DATABASE_USERNAME=seu_usuario
DATABASE_PASSWORD=sua_senha
```

Crie o banco de dados `produtos` ou permita que o Hibernate o crie conforme a configuração da aplicação.

## Executando o projeto

Clone o repositório:

```bash
git clone URL_DO_REPOSITORIO
```

Entre na pasta:

```bash
cd spring-boot-produtos-api
```

Execute a aplicação:

```bash
./mvnw spring-boot:run
```

## Aprendizado

Este projeto faz parte dos meus estudos de Backend Java. Pretendo continuar aprimorando a aplicação e explorando novos recursos do Spring Boot.
