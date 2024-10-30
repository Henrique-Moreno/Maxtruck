# Documentação Maxtruck

## Introdução
Maxtruck é uma aplicação web desenvolvida para ajudar caminhoneiros a encontrarem rotas seguras na cidade de São Paulo, evitando pontes baixas e ruas estreitas. O usuário insere as dimensões do caminhão e a rota desejada, e a aplicação calcula um trajeto seguro, exibido em um mapa interativo.

## Sumário
- [Introdução](#introdução)
- [Recursos](#recursos)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Requisitos](#requisitos)
- [Desenvolvimento](#desenvolvimento)
- [Como Rodar a Aplicação Localmente](#como-rodar-a-aplicação-localmente)

## Recursos
A aplicação oferece os seguintes recursos:
- Inserção das dimensões do caminhão pelo usuário
- Cálculo de rotas seguras, evitando pontes baixas e ruas pequenas
- Exibição de rotas em um mapa interativo
- Autenticação segura com JWT
- Integração com a API do Mapbox para mapas dinâmicos

## Tecnologias Utilizadas
As principais tecnologias usadas no desenvolvimento da aplicação foram:
- **Java 17 ou superior** - para o desenvolvimento do back-end, utilizando uma linguagem orientada a objetos que traz segurança no desenvolvimento
- **Spring Framework** - para produtividade e facilidade com anotações e gerenciamento de dependências
- **MySQL** - para armazenamento de dados de usuários, pontes e rotas
- **React.js** - para o front-end da aplicação
- **Mapbox API** - para a criação de mapas dinâmicos e interativos
- **Axios** - para realizar chamadas à API de forma simples e eficiente

## Requisitos
- **Java JDK 17 ou superior** - compatível com o Spring Boot
- **MySQL** - configurado e em execução para o armazenamento de dados
- **Node.js** - para executar o front-end em React
- **Conta na API do Mapbox** - para integração com mapas

## Desenvolvimento
A aplicação foi organizada em camadas, facilitando a manutenção e separando responsabilidades. A estrutura do back-end inclui:
- **Controllers** - gerenciam as requisições HTTP
- **Services** - contêm a lógica de negócios
- **Entities** - representam as entidades do banco de dados
- **DTOs** - transferem dados entre as camadas
- **Repositories** - realizam operações com o banco de dados

A API inclui endpoints para:
- Criação e autenticação de usuários com JWT, com senhas criptografadas para segurança
- Consulta de dados sobre pontes baixas no banco de dados MySQL, em integração com a API do Mapbox para rotas seguras

No front-end, o React.js usa chamadas de API para interagir com o back-end. A estrutura inclui:
- **API** - para interações com o back-end
- **Pages** - com páginas de cadastro, autenticação e o painel principal (dashboard)
- **Dashboard** - inclui o formulário onde o usuário insere as dimensões do caminhão e o mapa interativo para guiar o trajeto seguro

## Como Rodar a Aplicação Localmente

### Configuração do Back-End
1. Clone o repositório.
2. No arquivo `application.properties`, configure o banco de dados MySQL e outros parâmetros do sistema:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/nomedobanco
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    security.token.secret=teste
    security.token.secret.user=teste
    security.mapbox.maps.api.key=seu_token_mapbox
    ```
3. Compile e inicie a aplicação com o comando:
    ```bash
    ./mvnw spring-boot:run
    ```

### Configuração do Front-End
1. No diretório do front-end, crie um arquivo `.env` para configurar o token do Mapbox e outras variáveis de ambiente:
    ```dotenv
    VITE_MAPBOX_ACCESS_TOKEN=seu_token_mapbox
    ```
2. Instale as dependências do projeto com:
    ```bash
    npm install
    ```
3. Inicie a aplicação React com o comando:
    ```bash
    npm run dev
    ```
4. Acesse o endereço fornecido pelo console para interagir com a aplicação.
