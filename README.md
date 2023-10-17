# Aplicação Web Json

### Documentação
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web)

### Orientações de execução
#### Criação da imagem

Na raiz do projeto é feito build do projeto e criado a imagem:
`docker build -t app:1.0 .` o 1.0 é  criado uma tag para essa imagem que será gerada.


Em seguida é executado a imagem criada especificando a porta que rodará a aplicação: `docker run -it -p 8080:8080 app:1.0 `



