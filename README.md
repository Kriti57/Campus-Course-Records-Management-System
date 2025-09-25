# Campus Course & Records Manager (CCRM)

The **Campus Course & Records Manager (CCRM)** is a robust, console-based Java application for managing academic records. This project demonstrates core Java principles, including object-oriented programming (OOP), modern I/O with **NIO.2**, **JDBC** for database connectivity, and **design patterns**. It connects to an Oracle database for data persistence.

The application's command-line interface (CLI) provides administrators with the tools to manage:

* **Students:** Add, list, and update student records.
* **Courses:** Create and manage courses, including instructor assignments.
* **Enrollments:** Enroll and unenroll students, with automated enforcement of academic rules.
* **Grading & Transcripts:** Record grades and generate academic transcripts.  
* **File Operations**: Import and export data in CSV format, and create timestamped backups of all application data.

This project showcases a deep understanding of core Java principles, object-oriented programming (OOP), modern I/O with NIO.2, JDBC for database connectivity, and the application of fundamental design patterns.

To get the application up and running, you need **JDK 11+** and an **Oracle Database**.

## **Steps on how to Run the Application:**

1. **Clone the Repository**:  
   git clone https://github.com/Kriti57/Campus-Course-Records-Management-System.git

2. Compile the Application:  
   From the root directory of the project, run the following command. This compiles all source files and places the .class files in the bin directory, including the Oracle JDBC driver in the classpath.  
   ```bash
   javac -d bin -cp "lib/ojdbc17.jar" src/edu/ccrms/cli/*.java src/edu/ccrms/config/*.java src/edu/ccrms/domain/*.java src/edu/ccrms/exception/*.java src/edu/ccrms/io/*.java src/edu/ccrms/service/*.java src/edu/ccrms/util/*.java
    ```
3. **Set up the Database**: Ensure your Oracle database is running.

4. Run the Application:  
   Once compiled, run the application with this command, ensuring the bin folder and the JDBC driver are on the classpath.  
   ```bash
   java -cp "bin;lib/ojdbc17.jar" edu.ccrms.cli.Main
    ```
The application will then start, and you will see the main menu displayed in the console.


## **Creating the CCRM User**

1. **Connect to your database** as a user with administrative privileges (e.g., SYSTEM).  
2. **Create the ccrm\_user**: Execute the following SQL commands:  
    ```SQL
   CREATE USER ccrm_user IDENTIFIED BY ccrm_pass;  
   GRANT CONNECT, RESOURCE, DBA TO ccrm_user;
    ```
   This creates a user named ccrm_user with the password ccrm_pass.

## **Initializing the Schema**

The application handles schema creation automatically. The first time you run the Main.java application, it will detect that the tables are missing and execute the database\_setup.sql script to create them.

## **Evolution of Java**

This is a timeline of key Java releases and their major features.

| Year | Version | Key Features |
| :--- | :--- | :--- |
| 1995 | Java 1.0 | Initial release with applets |
| 1997 | Java 1.1 | Inner classes, JDBC, RMI |
| 1998 | Java 1.2 | Collections framework, Swing |
| 2000 | Java 1.3 | HotSpot JVM, JNDI |
| 2002 | Java 1.4 | Assertions, NIO, XML processing |
| 2004 | Java 5.0 | Generics, annotations, enums, autoboxing |
| 2006 | Java 6 | Scripting support, JDBC 4.0 |
| 2011 | Java 7 | Try-with-resources, NIO.2, diamond operator |
| 2014 | Java 8 | Lambda expressions, Streams API, Date/Time API |
| 2017 | Java 9 | Modules, JShell |
| 2018 | Java 10 | Local variable type inference |
| 2018 | Java 11 | LTS, HTTP client, var keyword |
| 2021 | Java 17 | LTS, sealed classes, pattern matching |
| 2023 | Java 21 | LTS, virtual threads, pattern matching for switch |

## **Java ME vs. SE vs. EE**

| Feature | Java ME (Micro Edition) | Java SE (Standard Edition) | Java EE (Enterprise Edition) |
| :---- | :---- | :---- | :---- |
| **Primary Use** | Mobile devices, embedded systems, and other resource-constrained devices. | Desktop applications, servers, and console applications. | Large-scale, distributed, and web-based enterprise applications. |
| **APIs** | A subset of Java SE APIs, with additional libraries for mobile development. | The core Java platform, including the JVM, core libraries, and development tools. | A superset of Java SE, with additional APIs for enterprise features like servlets and JSPs. |
| **Target Audience** | Developers for mobile phones and embedded devices. | General-purpose Java developers. | Enterprise application developers. |

## **JDK vs. JRE vs. JVM**

* **JVM (Java Virtual Machine)**: An abstract machine that provides a runtime environment in which Java bytecode can be executed. It is platform-dependent.  
* **JRE (Java Runtime Environment)**: A software package that contains the JVM, necessary libraries, and other components to *run* Java applications.  
* **JDK (Java Development Kit)**: A superset of the JRE that includes everything needed to *develop* Java applications, including the compiler (javac), debugger, and other tools.

## **IDE Setup**

While the application is designed to be run from the command line, you can also set it up in an IDE for development.

## **Eclipse IDE Setup**

1. **Import Project**: File \> Import \> General \> Existing Projects into Workspace.  
2. **Add JDBC Driver**: Right-click the project \> Build Path \> Configure Build Path. Go to the Libraries tab, select Classpath, click Add JARs..., and add the lib/ojdbc17.jar file.

## **Visual Studio Code Setup**

1. **Install Extension**: Install the "Extension Pack for Java" from Microsoft.  
2. **Open Project**: Go to File \> Open Folder... and select the project's root directory.  
3. **Add JDBC Driver**: In the "JAVA PROJECTS" explorer view, find "Referenced Libraries," click the \+ icon, and add the lib/ojdbc17.jar file.


## **Mapping of Syllabus Topics to Project Files**

| Syllabus Topic | File/Class/Method Where Demonstrated |
| :---- | :---- |
| **Encapsulation** | Student.java, Course.java (private fields with public getters/setters) |
| **Inheritance** | Person.java (abstract base class for Student and Instructor) |
| **Polymorphism** | TranscriptService.java (using Person references) |
| **Abstraction** | Person.java (abstract class with abstract methods) |
| **Interfaces** | Searchable.java (functional interface for searching) |
| **NIO.2 and Streams** | ImportExportService.java, BackupService.java (for file I/O) |
| **Lambda Expressions** | CourseService.java (used for filtering courses with predicates) |
| **Singleton Design Pattern** | AppConfig.java (ensuring a single configuration instance) |
| **Builder Design Pattern** | Course.java (nested Builder class for object construction) |
| **Custom Exceptions** | DuplicateEnrollmentException.java, MaxCreditLimitExceededException.java |

## **Enabling Assertions**

To enable assertions when running from the command line, use the \-ea (or \-enableassertions) flag:
```bash
java -ea -cp "bin;lib/ojdbc17.jar" edu.ccrms.cli.Main
```
In an IDE, add \-ea to the "VM arguments" in your run configuration.



