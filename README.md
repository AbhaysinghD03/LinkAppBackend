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


