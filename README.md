[![Build Status](https://travis-ci.org/Relesi/cucumber-java.svg?branch=master)](https://travis-ci.org/Relesi/cucumber-java)

# Password-Manager-API       

	* under development
 
### Dependencies 

* Java 8
* jUnit 5 (org.junit.jupiter.api, org.junit.jupiter.engine and org.junit.jupiter.params - 5.4.0)
* Log4j (1.2.17)
* Joda Time (2.10.3)
* Coveralls (4.3.0)
* Jacoco (0.7.9)

### Git hub

*Referências para o desenvolvimento do modelo de testes.



### Travis-CI

	Utilizo o travis-ci para integração continua.
	
	* https://travis-ci.org/


### Swagger

* swagger.json: `http://127.0.0.1:8080/v2/api-docs`

* swagger-ui: `http://127.0.0.1:8080/swagger-ui.html`

![Demo-Api](swagger-ui.png)

### Como executar a aplicação

	Certifique-se de ter o Maven instalado e adicionado ao PATH de seu sistema operacional, assim como o Git.
	
	
	cd /path/to/your/repo
	mvn spring-boot:run





### Importando o projeto no Eclipse, STS 

	No terminal, execute a seguinte operação:
	
	mvn eclipse:eclipse
	
	No Eclipse/STS, importe o projeto como projeto Maven.
	
	Depois que o projeto estiver importado, mude o application para test e execute os seguintes comandos. 
	
	mvn clean install
	mvn install 
	
	maven - update project


