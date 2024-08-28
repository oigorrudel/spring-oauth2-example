# api-one

- Step 1: docker run 
```
docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:25.0.0 start-dev
```
- Step 2: criar realm (Ex: first-realm)
- Step 3: criar usuario para o novo realm (admin usa o default realm)
- Step 4: criar client para o novo realm (Ex: first-client)
- Step 5: testar em https://www.keycloak.org/app/

Em "Client Details" no submenu "Capability config" 
    toogle de "Client Authetication" habilita a aba Credentials
    e o box "Service accounts roles" habilita token pelo client

