🏥 ClinicaSpringBootApellidos

Sistema de Gestión de Clínica Médica desarrollado con Spring Boot, JPA y relaciones 1:1

Mostrar imagen
Mostrar imagen
Mostrar imagen
Mostrar imagen
📋 Descripción
Proyecto académico desarrollado para la asignatura de Programación Backend I (POO, Spring Boot & JPA). El sistema modela el dominio de una clínica médica implementando entidades con relaciones uno a uno (1:1) utilizando Spring Boot y JPA.
🎯 Objetivos del Proyecto
✔️ Crear un proyecto Spring Boot con Maven
✔️ Modelar entidades del dominio médico
✔️ Implementar relaciones 1:1 entre entidades
✔️ Configurar conexión a base de datos (MySQL/H2)
✔️ Aplicar buenas prácticas de POO y JPA
🏗️ Estructura del Proyecto
ClinicaSpringBootApellidos/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── clinica/
│       │               ├── modelos/
│       │               │   ├── Paciente.java
│       │               │   ├── HistoriaClinica.java
│       │               │   ├── Medico.java
│       │               │   └── TarjetaProfesional.java
│       │               └── ClinicaSpringBootApellidosApplication.java
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md
🗂️ Entidades del Sistema
1️⃣ Paciente 👤
Representa a un paciente de la clínica con sus datos personales y médicos básicos.
Atributos:

id (Long) - Identificador único
nombre (String) - Nombre del paciente
apellido (String) - Apellido del paciente
documento (String) - Documento de identidad
fechaNacimiento (LocalDate) - Fecha de nacimiento
email (String) - Correo electrónico
telefono (String) - Número de teléfono
direccion (String) - Dirección de residencia
tipoSangre (String) - Tipo de sangre
seguroMedico (boolean) - ¿Tiene seguro médico?
peso (BigDecimal) - Peso en kg

Relación: 1:1 con HistoriaClinica (dueño de la relación)
2️⃣ HistoriaClinica 📋
Contiene el historial médico completo de un paciente.
Atributos:

id (Long) - Identificador único
numeroHistoria (String) - Número de historia clínica
fechaCreacion (LocalDate) - Fecha de creación
alergias (String) - Alergias del paciente
enfermedadesCronicas (String) - Enfermedades crónicas
cirugiasPrevias (String) - Cirugías realizadas
medicamentosActuales (String) - Medicamentos que toma
altura (BigDecimal) - Altura en metros
grupoSanguineo (String) - Grupo sanguíneo
fumador (boolean) - ¿Es fumador?
observaciones (String) - Observaciones generales

Relación: 1:1 inversa con Paciente (no es dueño de la relación)
3️⃣ Medico 👨‍⚕️
Representa a un médico que trabaja en la clínica.
Atributos:

id (Long) - Identificador único
nombre (String) - Nombre del médico
apellido (String) - Apellido del médico
documento (String) - Documento de identidad
especialidad (String) - Especialidad médica
email (String) - Correo electrónico
telefono (String) - Número de teléfono
fechaIngreso (LocalDate) - Fecha de ingreso a la clínica
salario (BigDecimal) - Salario mensual
activo (boolean) - ¿Está activo?
direccionConsultorio (String) - Dirección del consultorio

Relación: 1:1 con TarjetaProfesional (dueño de la relación)
4️⃣ TarjetaProfesional 🎓
Contiene la información de la tarjeta profesional del médico.
Atributos:

id (Long) - Identificador único
numeroTarjeta (String) - Número de tarjeta profesional
fechaExpedicion (LocalDate) - Fecha de expedición
fechaVencimiento (LocalDate) - Fecha de vencimiento
universidadEgresado (String) - Universidad de egreso
anioGraduacion (int) - Año de graduación
paisExpedicion (String) - País donde se expidió
vigente (boolean) - ¿Está vigente?
entidadEmisora (String) - Entidad que emitió la tarjeta
especialidades (String) - Especialidades certificadas
certificaciones (String) - Certificaciones adicionales

Relación: 1:1 inversa con Medico (no es dueño de la relación)
🔗 Relaciones Implementadas
El sistema implementa dos relaciones 1:1:
Relación 1: Paciente ↔ HistoriaClinica
Paciente (OWNER) ──[1:1]──> HistoriaClinica

Paciente es el dueño de la relación (tiene la FK)
Usa @OneToOne con @JoinColumn
HistoriaClinica usa mappedBy = "historiaClinica"

Relación 2: Medico ↔ TarjetaProfesional
Medico (OWNER) ──[1:1]──> TarjetaProfesional

Medico es el dueño de la relación (tiene la FK)
Usa @OneToOne con @JoinColumn
TarjetaProfesional usa mappedBy = "tarjetaProfesional"

🛠️ Tecnologías Utilizadas
TecnologíaVersiónDescripción☕ Java17Lenguaje de programación🍃 Spring Boot3.2.0Framework de desarrollo🗄️ JPA/Hibernate6.xORM para persistencia🐬 MySQL8.xBase de datos (opción 1)💾 H2 Database2.xBase de datos en memoria (opción 2)📦 Maven4.0.0Gestor de dependencias
⚙️ Configuración
Opción 1: MySQL

Crear la base de datos:

sqlCREATE DATABASE clinica_db;

Configurar en application.properties:

propertiesspring.datasource.url=jdbc:mysql://localhost:3306/clinica_db
spring.datasource.username=root
spring.datasource.password=tu_password_aqui
Opción 2: H2 (Base de datos en memoria)

Descomentar en application.properties:

propertiesspring.datasource.url=jdbc:h2:mem:clinicadb
spring.h2.console.enabled=true

Acceder a la consola H2: http://localhost:8080/h2-console

🚀 Instalación y Ejecución
Prerrequisitos

✅ JDK 17 o superior
✅ Maven 3.6 o superior
✅ MySQL 8.x (si usas MySQL)
✅ IDE (IntelliJ IDEA, Eclipse, VS Code)

Pasos para ejecutar

Clonar el repositorio

bashgit clone https://github.com/tu-usuario/ClinicaSpringBootApellidos.git
cd ClinicaSpringBootApellidos

Configurar la base de datos (editar application.properties)
Compilar el proyecto

bashmvn clean install

Ejecutar la aplicación

bashmvn spring-boot:run
O desde tu IDE, ejecutar la clase ClinicaSpringBootApellidosApplication.java

Verificar que funciona

✅ Aplicación ClinicaSpringBoot iniciada correctamente
📊 Estructura de Base de Datos
Al ejecutar la aplicación, se crearán automáticamente las siguientes tablas:
sql-- Tabla pacientes
CREATE TABLE pacientes (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    documento VARCHAR(20) UNIQUE NOT NULL,
    -- ... otros campos
    historia_clinica_id BIGINT UNIQUE,
    FOREIGN KEY (historia_clinica_id) REFERENCES historias_clinicas(id)
);

-- Tabla historias_clinicas
CREATE TABLE historias_clinicas (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    numero_historia VARCHAR(50) UNIQUE NOT NULL,
    fecha_creacion DATE NOT NULL,
    -- ... otros campos
);

-- Tabla medicos
CREATE TABLE medicos (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    documento VARCHAR(20) UNIQUE NOT NULL,
    -- ... otros campos
    tarjeta_profesional_id BIGINT UNIQUE,
    FOREIGN KEY (tarjeta_profesional_id) REFERENCES tarjetas_profesionales(id)
);

-- Tabla tarjetas_profesionales
CREATE TABLE tarjetas_profesionales (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    numero_tarjeta VARCHAR(50) UNIQUE NOT NULL,
    fecha_expedicion DATE NOT NULL,
    -- ... otros campos
);
📝 Anotaciones JPA Utilizadas
AnotaciónPropósito@EntityDefine una clase como entidad JPA@TableEspecifica el nombre de la tabla@IdMarca el campo como clave primaria@GeneratedValueGenera automáticamente el ID@ColumnConfigura propiedades de la columna@OneToOneDefine relación uno a uno@JoinColumnEspecifica la columna de unión (FK)
🎓 Conceptos Aplicados
✨ Programación Orientada a Objetos (POO)

Encapsulamiento
Getters y Setters
Constructores

✨ Java Persistence API (JPA)

Mapeo objeto-relacional
Relaciones entre entidades
Estrategias de generación de IDs

✨ Spring Boot

Configuración automática
Inyección de dependencias
Gestión de transacciones

👩‍💻 Autora
Tatiana Poddubnyak

Este proyecto es un trabajo académico para fines educativos.
🙏 Agradecimientos

🎓 Profesor/a de Programación Backend I Juan Jose Gallego
📚 Documentación oficial de Spring Boot
💡 Comunidad de desarrolladores


⭐ Si te sirvió este proyecto, dale una estrella en GitHub ⭐
Hecho con ❤️ y ☕ por una desarrolladora backend en formación
