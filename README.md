# Matchmydev - Profile service :woman_technologist:

## General description

As part of my training, I participated in the implementation of this project. <br>
Together with my group, we worked on designing and developing the **Profile service** of this application.<br>
The main goal of this project is to **streamline developers mobility** and help managers **find** developer and tech lead profiles that meet the **needs of their projects.**

## Microservice

The application was divided in **3 microservices.**

**Microservices** is a style of software **architecture** from which a complex set of applications is decomposed into **several independent**, loosely coupled processes, often **specialized in a single task.** Independent processes communicate with each other using language-independent programming interfaces. Spliting the application into several features (one for each responsability identified) allows to split the work into several teams: 

- **Profiles service** is mainly about displaying and searching for user informations. For instance, this service works on features as **searching, initializing, updating or recommending** a profil.

- **Projects service** enables managers to **create project sheets**, **modify** them, and **consult** them; a developer can **read and examine** them and eventually add a project to her/his favorite.

- **Authentication service** takes care of the user's authentication and the managment of password and mail.

## Three-layers architecture

Each service has been divided in a 3 layers architecture to clearly seperate responsibilities for each:

- **Presentation layer** represents the interface that will be displayed to the user to allow him to **access and interact** with the application.For this, we implemented a **SPA** which is a frontend architecture based on a single HTML page wich imports several components. This ensures better performance and a better user experience.

- **Business layer** responds to the user input and use the **business rules** to performs the workflow and manages communication with the database. This layer is based on **API Rest** (Representational State Transfer) which is an architecture style using HTTP and allowing two systems to **communicate** with each others. It is based on the **relationship client/server.** Client asks for ressources and the server sends backs responses in a format accepted by the client (Json).

-  **Data layer** to **store** and make the data accessible.
