DROP DATABASE if exists `freshmart`;
CREATE DATABASE `freshmart`;
USE `freshmart`;
/* Users table to store users data where Is_Admin = 1 denotes admin is logged into the system*/
CREATE TABLE `users` (
   `User_ID` int NOT NULL AUTO_INCREMENT ,
   `First_Name` varchar(20) NOT NULL,
   `Last_Name` varchar(20) NOT NULL,
   `Email` varchar(30) NOT NULL,
   `Password` varchar(20) NOT NULL,
   `Country_Code` varchar(20) NOT NULL,
   `Phone_Number` varchar(15) DEFAULT NULL,
   `Is_Admin`  BIT(1),
   `Subscription`  BIT(1),
   PRIMARY KEY (`User_ID`),
   UNIQUE KEY `Email` (`Email`),
   UNIQUE KEY `Phone_Number` (`Phone_Number`)

   )DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
   
    CREATE TABLE `products` (
   `Product_ID` int NOT NULL AUTO_INCREMENT ,
   `Product_Name` varchar(20) NOT NULL,
   `Description` varchar(50) DEFAULT NULL,
   `Category` varchar(10) NOT NULL,
   `Available_Quantity` int DEFAULT NULL,
   `Price` long NOT NULL,
   
   PRIMARY KEY (`Product_ID`),
   UNIQUE KEY `Product_Name` (`Product_Name`)
   
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
 
 
 
  CREATE TABLE `orders` (
   `Order_ID` int NOT NULL AUTO_INCREMENT,
   `Date_Placed` datetime DEFAULT CURRENT_TIMESTAMP,
   `Delivery_Expected` timestamp NOT NULL DEFAULT (CURRENT_TIMESTAMP + 3),
   `Payment_Confirmation` varchar(10) NOT NULL,
   `Total_Price` float NOT NULL,
   `User_ID` INT NOT NULL,
   PRIMARY KEY (`Order_ID`),
   KEY `User_ID`(`User_ID`),
   FOREIGN KEY(`User_ID`) REFERENCES `users` (`User_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

  CREATE TABLE `items_table` (
   `Rand_ID` int NOT NULL AUTO_INCREMENT,
   `Product_ID` int NOT NULL,
   `Quantity` timestamp NOT NULL DEFAULT (CURRENT_TIMESTAMP + 3),
   `Order_ID` INT NOT NULL,
   `User_ID` INT DEFAULT NULL,
   PRIMARY KEY (`Rand_ID`),
   FOREIGN KEY(`Product_ID`) REFERENCES `products` (`Product_ID`),
   FOREIGN KEY(`Order_ID`) REFERENCES `orders` (`Order_ID`),
   FOREIGN KEY(`User_ID`) REFERENCES `users` (`User_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

create table `subscription table`(
`Prime_Key` int not null auto_increment,
`Subscription_Period` varchar(20) DEFAULT NULL,
`User_ID` INT DEFAULT NULL,
`isActive` boolean DEFAULT false,
primary key(`Prime_Key`),
FOREIGN KEY(`User_ID`) REFERENCES `users` (`User_ID`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


select * from orders;


drop table users;
