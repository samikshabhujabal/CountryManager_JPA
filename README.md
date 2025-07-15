# CountryManager_JPA


 A simple Java console application that performs CRUD operations on countries and regions tables using Hibernate with JPA (Java Persistence API).





🛠️ Technologies Used



* Java
* 
* Hibernate (JPA)
* 
* PostgreSQL
* 
* Maven





###### ✅ Features



* Add a Country
* 
* Update Country by ID
* 
* Delete Country by ID
* 
* List All Countries
* 
* Search Country by Name
* 
* Exit
* 







###### 🔧  Project Structure



CountryManager\_JPA

├── src/

│     ├── entity/

│     │     ├── CountryEntity.java

│     │     └── RegionEntity.java

│     │

│     ├── service/

│     │    ├── CountryService.java

│     │    └── RegionService.java

│     │

│     └── app/

│         ├── HibernateUtil.java

│         └── Main.java

│   

├── resources/ 

│       └── META-INF/

│             └── persistence.xml

└── pom.xml





###### 📄 pom.xml Dependencies


           <dependencies>
          <!-- ✅ Hibernate Core 7.x -->
            <dependency>
            <groupId>org.hibernate.orm</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>7.0.5.Final</version>
               </dependency>

                <!-- ✅ Jakarta Persistence API (JPA 3.2) -->
                 <dependency>
                   <groupId>jakarta.persistence</groupId>
                <artifactId>jakarta.persistence-api</artifactId>
                 <version>3.2.0</version>
               </dependency>
               
             <!-- ✅ postgreSQL JDBC Driver -->
                 <dependency>
           <dependency>
               <groupId>org.postgresql</groupId>
           <artifactId>postgresql</artifactId>
            <version>42.7.7</version>
         </dependency>
           </dependencies>
           





📌 Contact Details

Name: Samiksha Bhujbal

Email: samikshabhujabal@gmail.com

