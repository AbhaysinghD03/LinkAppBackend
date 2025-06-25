# 🔗 Link Management Application

A full-stack web application built with **Angular** for the frontend and **Spring Boot** for the backend. It allows users to **register**, **login**, **add links**, and **view their link dashboard**.

---

## 🚀 Features

- User Registration and Login (with form validation)
- Add new links (with title and URL)
- View saved links in a dashboard
- Secure routing (protected routes after login)
- Responsive Bootstrap UI

---

## 🛠️ Tech Stack

### Frontend:
- Angular 15+
- Bootstrap 4
- HTML/CSS
- Angular Router
- HTTPClient Module

### Backend:
- Java 17+
- Spring Boot
- Spring MVC
- JPA/Hibernate
- MySQL (or H2)
- REST API

---

## 📂 Project Structure

### Angular (Frontend)
/src
├── /app
│ ├── loginpage/
│ ├── registrationpage/
│ ├── linkdashboard/
│ ├── addlink/
│ ├── services/
│ └── app-routing.module.ts
│ └── app.module.ts
├── index.html
└── styles.css

### Spring Boot (Backend)
/src/main/java/com/example/
├── controller/
├── model/
├── repository/
├── service/
└── Application.java

---

## ⚙️ Setup Instructions

### Backend (Spring Boot)
1. Open the backend in your IDE.
2. Configure `application.properties` (DB, port, etc.).
3. Run the Spring Boot app.
4. Backend runs on: `http://localhost:8080`

### Frontend (Angular)
1. Open the Angular project.
2. Run `npm install` to install dependencies.
3. Run `ng serve` to start the app.
4. Visit: `http://localhost:4200`

---

## 🧪 API Endpoints

### Auth Controller
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | `/user/register-user` | Register a new user |
| POST   | `/user/login-user`    | Login with credentials |

### Link Controller
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/link/get-all-links` | Fetch all saved links |
| POST   | `/link/add-link`      | Save a new link |

---

## 📸 Screenshots

- ✅ Login Page  
- ✅ Registration Page  
- ✅ Dashboard  
- ✅ Add New Link  


![LoginForm](https://github.com/user-attachments/assets/e088a472-9ede-4712-a2bb-07eee782c683)
![RegistrationForm](https://github.com/user-attachments/assets/2fa3773f-b1e4-469b-8cac-7956b11cd838)
![LinksDashboard](https://github.com/user-attachments/assets/aa10c33c-13dd-45b3-8f56-f4acc231f702)
![AddLink Page](https://github.com/user-attachments/assets/13491c83-c82d-44be-97c4-d3d37eeba30a)
