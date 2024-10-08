# spring-oauth2-example
```
    Swaggers: 
        http://localhost:9001/swagger-ui/index.html
        http://localhost:9002/swagger-ui/index.html
        http://localhost:9003/swagger-ui/index.html
    
    Keycloak: http://localhost:8080/
    
    Others requests: .http/requests.http
```

## Setup Keycloak

- Step 1: docker run
```
docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:25.0.0 start-dev
```
- Step 2: criar realm (Ex: first-realm)
- Step 3: criar client para o novo realm (Ex: first-client)
- Step 4: testar em https://www.keycloak.org/app/
- Step 5: habilitar autenticacao por client_credentials

![img.png](.imgs/img1.png)

![img.png](.imgs/img2.png)

![img.png](.imgs/img3.png)

## api-one
Com seguranca na camada <b>WEB</b>, utilizando Spring Security autenticando no Keycloak (Autenticação OAuth2 Bearer JWT).

## api-two
Sem segurança na camada <b>WEB</b>, solicitando token para consumir via rest a ```api-one``` utilizando Feign.

## api-three
Com seguranca na camada <b>WEB</b>, propagando o token ao consumir via rest a ```api-one``` utilizando Feign.