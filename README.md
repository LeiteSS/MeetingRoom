# Meeting Room

An app to register and manager meetings in a room.

| Features                             |
| ------------------------------------ |
| Register a meeting                   |
| Delete a meeting using its id number |
| List all meetings                    |
| Update a meeting                     |
| Detail a meeting                     |

## Running

To run the API use the command:

```bash
./mvnw spring-boot:run
```

When the API started in the localhost, then it's time to start the front-end using this command:

```bash
ng serve
```

The API runs in 8080 port and the front-end runs in the port 4200.  

## Testing
To test using **Postman** just use this [collection](https://documenter.getpostman.com/view/14979428/TzJx8c4u) and send request. To test the **H2** Database use the url: [http://localhost:8080/h2](http://localhost:8080/h2) using the datasource's url:`jdbc:h2:mem:file:~/test` and username `sa` and password in blank. Finally, make a `select * from meeting_room` or `insert into some values in the table`.

## Dependencies

This project uses [**Lombok**](https://projectlombok.org/), [**Springdoc OpenAPI UI**](https://www.baeldung.com/spring-rest-openapi-documentation), [**H2 Database**](https://www.h2database.com/html/main.html),  **Spring Boot JPA**, [**Jakarta Validation**](https://beanvalidation.org/).
