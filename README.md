# ChatApp - Spring Boot WebSocket Chat Application

This is a simple real-time chat application built with **Spring Boot** and **WebSocket (STOMP over SockJS)**.  
It allows multiple users to connect, send, and receive messages instantly in a chat room.

---

##  Features
- Real-time messaging using **Spring WebSocket**
- Publish/Subscribe model with **STOMP**
- In-memory message storage (no database required)
- Simple **Thymeleaf UI** for chat interface
- Easily extendable to use **JPA + PostgreSQL/MySQL** for persistence

---

## Tech Stack
- **Java 17+**
- **Spring Boot 3+**
- **Spring WebSocket / STOMP**
- **Thymeleaf**
- **Maven**



## Project Structure
```
chatapp/
├─ src/main/java/com/excercise/chatapp/
│ ├─ controller/ # REST + WebSocket controllers
│ ├─ model/ # ChatMessage model
│ ├─ service/ # ChatService (business logic)
│ └─ ChatApp.java # Main Spring Boot application
├─ src/main/resources/
│ ├─ templates/ # Thymeleaf templates (chat.html)
│ └─ application.properties
└─ pom.xml
```
