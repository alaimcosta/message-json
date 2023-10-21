# Aplicação Web Json

### Documentação

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web)

#### DB
Banco de dados utilizado é o PostgreSQL na versão 12.


### Orientações de execução
#### Criação da imagem e container

Na raiz do projeto execute:
`docker compose up` no qual fará a execução da imagem do projeto e suas dependências.

### Testes

Método POST para persistir uma mensagem

* Rota: `http://localhost:8080/menssage`

Parâmetros:
`{
"menssage":"Mensagem de teste"
}`

<br/>

Método GET para obter a mensagem passando o id

* Rota: `http://localhost:8080/menssage/{id}`


* [Link](http://localhost:8080/menssage)

