## 📘 Project Architecture: Exam Control System

This project is a Spring Boot microservices-based architecture designed for managing an online examination system. It includes modular and independently scalable services to handle users, courses, exams, and answers.

### 🧩 Core Components

#### 1. Microservices
- **User Service**: Manages user authentication and profiles.
- **Course Service**: Manages courses and assignments.
- **Exam Service**: Handles exam scheduling and question management.
- **Answer Service**: Manages submissions and evaluations.

Each service has its own dedicated database.

#### 2. API Gateway
Acts as a single entry point for clients, managing routing, security, and monitoring.

#### 3. Eureka Service Discovery
Allows services to dynamically register and discover each other.

#### 4. CI/CD with GitHub Actions
Automated build, test, and deployment pipeline for each microservice.

#### 5. Database Per Service
Each microservice maintains its own schema to ensure data isolation and loose coupling.

---

### 🎭 Actor Flow
- The client interacts via the API Gateway.
- Requests are routed to appropriate services and responses returned.
- Internal communication is via REST.

---

### 📄 Architecture Diagram (PDF)
[📂 View Architecture PDF](./Docs/pa.png)
[📂 Download Architecture PDF](/Docs/Project architecture.pdf)
