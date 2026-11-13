# My Java Learning Hub

A personalized Java-backend learning platform starter.

## Stack
- Frontend: React + TypeScript + Vite + Tailwind CSS + React Router + Recharts + Lucide
- Backend: Java 21 + Spring Boot 3 + Spring Web + Spring Data JPA
- Database: PostgreSQL (Docker Compose)

## Included in this starter
- Responsive dark dashboard and sidebar navigation
- 16-module Java backend roadmap with topic tracking
- Topic lesson view with explanations, runnable-style examples, exercises and completion control
- Notes CRUD (persisted in browser localStorage in this MVP)
- Daily quiz with score calculation
- Progress derived from completed topics; no fabricated user scores
- Spring Boot REST API scaffold for modules, topics, progress and notes
- PostgreSQL Docker configuration

## Run locally

### 1. Database
```bash
docker compose up -d db
```

### 2. Backend
Requires Java 21 and Maven.
```bash
cd backend
mvn spring-boot:run
```
Backend runs at `http://localhost:8080`.

### 3. Frontend
Requires Node.js 20+.
```bash
cd frontend
npm install
npm run dev
```
Open the URL printed by Vite (usually `http://localhost:5173`).

## Configuration
Backend environment variables:
- `DB_URL` (default `jdbc:postgresql://localhost:5432/javahub`)
- `DB_USERNAME` (default `javahub`)
- `DB_PASSWORD` (default `javahub`)

Frontend API base URL: `VITE_API_BASE_URL` (defaults to `http://localhost:8080/api`).

## Important implementation notes
This is a runnable MVP foundation, not a claim that every advanced feature in the full specification is complete.
- Browser learning progress and notes currently persist in localStorage so the learning workflow works immediately without requiring login.
- Spring Boot exposes persistence-ready REST endpoints and JPA entities; connect the frontend to these endpoints and add user-scoped authentication before multi-user production deployment.
- The code-practice screen is a practice workspace, not a remote Java execution sandbox. Do not execute arbitrary code on the application server. Add a separately isolated execution service (container/VM sandbox with resource limits) before enabling Run/Submit.
- AI assistance is shown as an integration-ready screen. Configure a server-side AI provider and keep API keys out of frontend code.
- Remaining syllabus modules have structured topic outlines; detailed lesson content is seeded for Java Fundamentals, OOP and Collections and can be expanded over time.

## Suggested next steps
1. Add Spring Security + JWT and user-scoped data access.
2. Connect frontend progress/notes to the REST API.
3. Add an isolated code runner.
4. Expand lesson content and question banks.
5. Add spaced repetition, mock interviews, analytics and admin content import.
