# Aplicação Web Json

### Documentação

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web)
* [Docker Swarm 1](https://www.cherryservers.com/blog/docker-swarm-tutorial-container-orchestration)
* [Docker Swarm 2](https://fabriciosanchez.com.br/distribuindo-containers-com-swarm-parte-2/)
* [Docker docs](https://docs.docker.com/engine/reference/commandline/node_ls/)

#### DB
Banco de dados utilizado é o PostgreSQL na versão 12.

### Configuração 

* Criando multiplas instâncias do serviço app, permitindo aumentar a capacidade da aplicação.

``` 
message_app:
    depends_on:
        - db
    image: app
    build: .
    ports:
        - "8081:8080" #Específica a porta que será expostas no host (8081), porém no container expondo a porta 8080.
    environment:
        - DATABASE_URL=jdbc:postgresql://db:5432/postgres
        - DATABASE_USERNAME=postgres
        - DATABASE_PASSWORD=12345
    deploy:
        replicas: 3 #N° de replicas que será criada do serviço message_app
volumes:
pgdata: {} 
```

### Orientações de execução
#### Criação da imagem e container

Na raiz do projeto execute:
`docker compose up` no qual fará a execução da imagem do projeto e suas dependências.

### Clusterização do serviço
#### No exemplo é utilizando o Docker Swarm como orquestrador de containers. O Swarm é nativo do Docker. 
Inicialmente é executado o seguinte comando para iniciar o Swarm.

`sudo docker swarm init`

No teste é utilizado o Docker Swarm por meio do arquivo, já criado, docker-compose. Na rais do projeto é executado os seguintes comandos:

`docker stack deploy -c docker-compose.yml nome_exemplo_xx`

Dessa forma, o Swarm distribuirá automaticamente as solicitações entre as réplicas do serviço.

Para visualizar os serviços:

`docker service ls` 

Para visualizar um serviço:

`docker service ps nome_exemplo_xx_message_app`

Para inspecionar um serviço:

`docker service inspect nome_exemplo_xx_message_app`

### Testes

Para realizar os testes é necessário utilizar o IP local do host, que é mostrado na inicialização do Swarm. Outra forma para obter o IP, execute o seguinte comando `docker inspect codigo_gerado_na_inicialização_swarm`, e acesse o IP local.   

Método POST para persistir uma mensagem

* Rota: `http://ip:8081/menssage`

Parâmetros:

`{
"menssage":"Mensagem de teste"
}`

<br/>

Método GET para obter a mensagem passando o id

* Rota: `http://ip:8081/menssage/{id}`


* [Link](http://ip:8081/menssage)

É possivel também fazer o escalonamento automático da aplicação já criada ` docker service update nome_exemplo_xx --replicas-max-per-node x`, onde x é o número máximo de replicas da aplicação.
