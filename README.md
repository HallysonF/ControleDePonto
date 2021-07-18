# Projeto API REST Ponto de Acesso

Repositório da  API Rest para controle de ponto e acesso dos usuários de uma empresa. Utilizaremos Java, Spring Boot, Hibernate Envers e lombok além de documentar toda a API com Swagger.Desenvolvimento no bootcamp Santander Fullstack

## Documentação

* [Documentação API-REST](http://localhost:8081/swagger-ui.html)

## Download do projeto

Faça o clone do projeto:

```bash
$ git clone https://github.com/HallysonF/ControleDePonto 
$ cd ControleDePonto
```
### Atualizações realizadas para o funcionamento

Durante o desenvolvimento o professor Rodolfo Gomes utilizou as dependências jackson-dataformat-xml, hibernate-envers e hibernate-validator nas versões 2.9.7, 5.4.17 e 6.1.5 repectivamente e foram atualizadas para as versões 2.12.4, 5.5.3 e 6.2.0 coforme abaixo.

versões utilizadas no projeto
```
  compile group: 'com.fasterxml.jackson.dataformat', name: 'jackson-dataformat-xml', version: '2.9.7'
  compile group: 'org.hibernate', name: 'hibernate-envers', version: '5.4.17.Final'
  compile group: 'org.hibernate', name: 'hibernate-validator', version: '6.1.5.Final'
```

versões Atualizadas no projeto
```
  // https://mvnrepository.com/artifact/com.fasterxml.jackson.dataformat/jackson-dataformat-xml
	implementation group: 'com.fasterxml.jackson.dataformat', name: 'jackson-dataformat-xml', version: '2.12.4'
  // https://mvnrepository.com/artifact/org.hibernate/hibernate-envers
	implementation group: 'org.hibernate', name: 'hibernate-envers', version: '5.5.3.Final'
  // https://mvnrepository.com/artifact/org.hibernate.validator/hibernate-validator
	implementation group: 'org.hibernate.validator', name: 'hibernate-validator', version: '6.2.0.Final'
```

### Desenvolvimento da API-REST

Para o desenvolvimento da API foi utilizado Java, Spring Boot, Hibernate Envers e Lombok e para documentação da Api foi utilizado o Swagger

- Java

  Um projeto Java é composto por classes e essas classes possui tipos, modicadores de acesso, interfaces etcc.

- Spring Boot
  
  O Spring Boot facilita a criação de aplicativos autônomos baseados em Spring de nível de produção que você pode "simplesmente executar".

- Hibernate

  O Hibernate é um framework para o mapeamento objeto-relacional escrito na linguagem Java, mas também é disponível em .Net com o nome NHibernate. Wikipédia
- Envers

  O módulo Envers é um modelo central do Hibernate que funciona tanto com o Hibernate quanto com o JPA. Na verdade, você pode usar Envers em qualquer lugar que o Hibernate funcione, seja autônomo, dentro do WildFly ou JBoss AS, Spring, Grails, etc.

  O módulo Envers visa fornecer uma solução fácil de auditoria / controle de versão para classes de entidade. Hibernate.
- Lombok

  Uma biblioteca java que se conecta automaticamente ao seu editor e ferramentas de construção, aprimorando o seu java.
Nunca escreva outro método getter ou equals novamente, com uma anotação sua classe tem um construtor completo, Automatiza suas variáveis ​​de registro e muito mais.
  
- Swagger

  Traduzido do inglês-Swagger é uma linguagem de descrição de interface para descrever APIs RESTful expressas usando JSON. O Swagger é usado junto com um conjunto de ferramentas de software de código aberto para projetar, construir, documentar e usar serviços da Web RESTful. Wikipedia (inglês)

##IDE para desenvolvimento

Para Desenvolvimento de todo o projeto foi utilizado o IDE InteliJ para mais informações
* [Jet Brains](https://www.jetbrains.com/pt-br/idea/)
## Banco de Dados

Para o Banco de dados SQL foi utilizado o SGBD H2 - é um sistema de gerenciamento de banco de dados relacional escrito em Java. Ele pode ser incorporado em aplicativos Java ou executado no modo cliente-servidor. O software está disponível como software de código aberto Mozilla Public License 2.0 ou Eclipse Public License original. Wikipedia (inglês)

## Realização de Testes
Para realização de testes foi utilizado o Postman - um API Client que facilita aos desenvolvedores criar, compartilhar, testar e documentar APIs. Isso é feito, permitindo aos usuários criar e salvar solicitações HTTP e HTTPs simples e complexas, bem como ler suas respostas. Mais informações
* [Postman](https://www.postman.com/)
