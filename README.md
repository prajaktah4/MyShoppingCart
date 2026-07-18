# 🛒 Shopping Cart Application

A simple Shopping Cart application developed using **Spring Boot**, **Spring MVC**, **Spring Data JPA**, **Thymeleaf**, **Bootstrap 5**, and **PostgreSQL**.

##  Features

- View all shopping cart items
- Add a new item
- Edit an existing item
- Remove an item
- Store data in PostgreSQL database
- Responsive user interface using Bootstrap 5

##  Technologies Used

- Java 17
- Spring Boot
- Spring web
- Spring Data JPA
- Spring Boot Dev Tools
- Thymeleaf
- PostgreSQL
- Bootstrap 5
- Maven

##  Project Structure

```
ShoppingCart
│
├── src/main/java
│   ├── controller
│   ├── entity
│   ├── repository
│   ├── service
│   └── MyShoppingCartTaskApplication.java
│
├── src/main/resources
│   ├── templates
│   │   ├── cart.html
│   │   ├── add-item.html
│   │   └── edit-item.html
│   └── application.properties
│
└── pom.xml
```

##  How to Run

1. Clone the repository.

```bash
git clone https://github.com/prajaktah4/MyShoppingCart.git
```

2. Create a PostgreSQL database.

```sql
CREATE DATABASE shoppingcart;
```

3. Configure the database in `application.properties`.

```properties
spring.application.name=MyShoppingCartTask

# PostgreSQL Database
spring.datasource.url=jdbc:postgresql://localhost:5432/shoppingcart
spring.datasource.username=postgres
spring.datasource.password=postres123

spring.datasource.driver-class-name=org.postgresql.Driver

#hibernate/jpa
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

server.port=8080

```

4. Run the Spring Boot application.

5. Open your browser and visit:

```
http://localhost:8080/
```

##  Application Screens

- Shopping Cart List
- Add Item Form
- Edit Item Form

##  CRUD Operations

- ✅ Create Item
- ✅ Read Items
- ✅ Update Item
- ✅ Delete Item

##  Author

**Prajakta Anil Hole**

GitHub: https://github.com/prajaktah4
