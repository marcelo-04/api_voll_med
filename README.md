# api_voll_med
Desenvolvendo uma API Rest em Java!

### Spring Boot 3: desenvolva uma API Rest em Java!
* Objetivos
* Desenvolvimento de uma API Rest
* CRUD (Create, Read, Update e Delete)
* Validações
* Paginação e ordenação
* O objetivo neste curso é usarmos o Spring Boot para desenvolvermos uma API Rest, com algumas funcionalidades. 
* A ideia é desenvolver um CRUD, sendo as quatro operações fundamentais das aplicações: cadastro, listagem, atualização e exclusão de informações.

### Isto é, aprenderemos a desenvolver um CRUD de uma API Rest usando o Spring Boot.
* Vamos ver também como aplicar validações das informações que chegam na nossa API, usando o Bean Validation. Depois, vamos aprender a utilizar o conceito 
* de paginação e ordenação das informações que a nossa API vai devolver.
### Tecnologias
*	Spring Boot 3
*	Java 17
*	Lombok
*	MySQL/ Flyway
*	JPA/Hibernate
*	Maven
*	Insomnia
* Faremos tudo isso usando algumas tecnologias, como Spring Boot 3, sendo a última versão disponibilizada pelo framework. Usaremos, 
* também, o Java 17 sendo a última versão LTS (Long-term support, em português "Suporte de longo prazo") que possui maior tempo de suporte disponível para o Java. 
* Aprenderemos a usar alguns recursos das últimas versões do Java para deixarmos o nosso código mais simples. Utilizaremos em conjunto com o projeto o Lombok, responsável  * por fazer a geração de códigos repetitivos, como getters, setters, toString, entre outros. Tudo via anotações para o código ficar menos verboso.
* Usaremos o banco de dados MySQL para armazenar as informações da API e junto com ele utilizaremos a biblioteca Flyway. Isso para termos o controle do histórico de 
* evolução do banco de dados, um conceito que chamamos de Migration. 
* A camada de persistência da nossa aplicação será feita com a JPA (Java Persistence API), com o Hibernate como implementação dessa especificação e usando os módulos do
* Spring Boot, para tornar esse processo o mais simples possível.
* Usaremos o Maven para gerenciar as dependências do projeto, e também para gerar o build da nossa aplicação. Por último, como focaremos na API Rest (apenas no Back-end), 
* não teremos interface gráfica, como páginas HTML e nem Front-end e aplicativo mobile. 
* Mas para testarmos a API, usaremos o Insomnia, sendo uma ferramenta usada para testes em API. Com ela, conseguimos simular a requisição para a API e verificar se as
* funcionalidades implementadas estão funcionando.

### Essas são as tecnologias que usaremos ao longo deste curso.
# Qual é o nosso projeto?
 
* Trabalharemos em um projeto de uma clínica médica fictícia. Temos uma empresa chamada Voll Med, que possui uma clínica que precisa de um aplicativo para monitorar o
* cadastro de médicos, pacientes e agendamento de consultas.
* Será um aplicativo com algumas opções, em que a pessoa que for usar pode fazer o CRUD, tanto de médicos quanto de pacientes e o agendamento e cancelamento das consultas.
* Vamos disponibilizar esse protótipo, mas lembrando que é somente para consultas, para visualizarmos como seria o Front-end. Isso porque o foco deste curso é o Back-end.
* A documentação das funcionalidades do projeto ficará em um quadro do Trello com cada uma das funcionalidades. Em cada cartão teremos a descrição de cada funcionalidade,
* com as regras e validações que vamos implementar ao longo do projeto.
* Esse é o nosso objetivo neste curso, aprender a usar o Spring Boot na versão 3 para desenvolvermos o projeto dessa clínica médica, utilizando as tecnologias mencionadas 
* anteriormente.

### Padrão DAO
* O padrão de projeto DAO, conhecido também por Data Access Object, é utilizado para persistência de dados, onde seu principal objetivo é separar regras de negócio de regras de acesso a banco de dados. Nas classes que seguem esse padrão, isolamos todos os códigos que lidam com conexões, comandos SQLs e funções diretas ao banco de dados, para que assim tais códigos não se espalhem por outros pontos da aplicação, algo que dificultaria a manutenção do código e também a troca das tecnologias e do mecanismo de persistência.
* Em alguns projetos em Java, dependendo da tecnologia escolhida, é comum encontrarmos classes que seguem o padrão DAO, utilizado para isolar o acesso aos dados. Entretanto, neste curso utilizaremos um outro padrão, conhecido como Repository.

### Aplicando boas práticas e proteja uma API Rest! Com objetivos.
* Boas práticas na API
* Tratamento de erros
* Autenticação/Autorização
* Tokens JWT
* Os objetivos deste segundo curso são: aprender boas práticas na API referente ao protocolo HTTP. Faremos ajustes na classe controller, para seguir as boas práticas do protocolo HTTP quanto ao retorno dos códigos HTTP e das respostas que a API devolve. 
* Logo após, realizaremos tratamento de erros. Eventualmente, pode ocorrer um erro na API, e precisamos entender o que o Spring faz ao ocorrer uma exception enquanto o programa é executado, o que é devolvido como resposta para o cliente da API.
* Assim, vamos personalizar esses retornos para tratar esses erros da melhor forma possível.
* Após isso, focaremos na segurança, no controle de autenticação e de autorização da API. No curso anterior não abordamos isso, logo a nossa API está pública - qualquer pessoa pode enviar requisições para remover, atualizar ou alterar informações da API. 
* Mas não é dessa forma que desejamos, precisamos ter um controle. Isso será feito na aplicação front-end, porém, na API precisamos ter um código que permite o usuário se autenticar, e também ter um controle de acesso de informações públicas e privadas.
* Aprenderemos a aplicar isso com o Spring Security, sendo um módulo do Spring responsável por monitorar esse controle.
* No caso, usaremos a autenticação fundamentada em tokens com o padrão JSON Web Token (JWT).

### O que aprendemos?
* Utilizar a classe ResponseEntity, do Spring, para personalizar os retornos dos métodos de uma classe Controller;
* Modificar o código HTTP devolvido nas respostas da API;
* Adicionar cabeçalhos nas respostas da API;
* Utilizar os códigos HTTP mais apropriados para cada operação realizada na API.
* Funcionamento do processo de autenticação e autorização em uma API Rest.
* Adicionando o Spring Security ao projeto.
* O comportamento padrão do Spring Security em uma aplicação;
* A implementação e o processo de autenticação na API, de maneira Stateless, utilizando as classe e configurações so Spring Security.



