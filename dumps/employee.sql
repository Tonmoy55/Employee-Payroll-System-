-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: employeepayroll
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bankaccount`
--

DROP TABLE IF EXISTS `bankaccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bankaccount` (
  `id` int NOT NULL AUTO_INCREMENT,
  `accounttype` varchar(200) DEFAULT NULL,
  `accountname` varchar(200) DEFAULT NULL,
  `accountno` varchar(200) DEFAULT NULL,
  `balance` int DEFAULT NULL,
  `bankname` varchar(200) DEFAULT NULL,
  `branchname` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bankaccount`
--

LOCK TABLES `bankaccount` WRITE;
/*!40000 ALTER TABLE `bankaccount` DISABLE KEYS */;
INSERT INTO `bankaccount` VALUES (1,'Savings','Mrs. Josna Akter','000111222009',0,'Dhaka Bank','Uttara'),(7,'Savings','IBCS-PRIMAX Software(Bangladesh)','000111222333',-1497000,'Dhaka Bank','Uttara'),(8,'Current','Ahsan Habib Himel','000111222001',0,'Dutch Bangla Bank','Dhanmondi'),(9,'Current','Tarequl Robin','000111222002',27000,'Dhaka Bank','Uttara'),(10,'Current','Asif Chowdhury','000111222003',20250,'Dhaka Bank','Jashimuddin'),(11,'Savings','Hasan Sakib Afrin','000111222004',0,'Dhaka Bank','Uttara'),(12,'Savings','Md. Ishti','000111222005',27000,'Dhaka Bank','Uttara'),(13,'Savings','Md. Sirazul Munir','000111222006',0,'Dhaka Bank','Uttara Khan'),(15,'Savings','Md. Jahid Bhuiyan','000111222007',0,'Dhaka Bank','Uttara Khan'),(16,'Savings','Md. Sayed Abdullah','000111222008',0,'Dhaka Bank','Uttara Khan'),(24,'Savings','Mrs. Risha Naznin','000111222010',0,'Dutch Bangla Bank','Dhanmondi');
/*!40000 ALTER TABLE `bankaccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` int(4) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `employeename` varchar(200) DEFAULT NULL,
  `gradeid` int DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `mobileno` varchar(12) DEFAULT NULL,
  `accountid` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `gradeid_idx` (`gradeid`),
  KEY `accountid_fk_idx` (`accountid`),
  CONSTRAINT `accountid_fk` FOREIGN KEY (`accountid`) REFERENCES `bankaccount` (`id`),
  CONSTRAINT `gradeid_fk` FOREIGN KEY (`gradeid`) REFERENCES `grade` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (0009,'Tarequl Robin',2,'Bashundhara R/A, Block: F, Road: 11,Holding:443, Dhaka, Bangladesh','+01745454551',9),(0011,'Ahsan Habib Himel',1,'Bashundhara R/A, Block: F, Road: 11,Holding:443, Dhaka, Bangladesh','+11746942158',8),(0012,'Asif Chowdhury',21,'Bashundhara R/A, Block: F, Road: 11,Holding:443, Dhaka, Bangladesh','+01746000000',10),(0013,'Hasan Sakib Afrin',21,'Bashundhara R/A, Block: F, Road: 11,Holding:443, Dhaka, Bangladesh','+01746000001',11),(0014,'Md. Ishti',22,'Bashundhara R/A, Block: F, Road: 11,Holding:443, Dhaka, Bangladesh','+01746000002',12),(0015,'Md. Sirazul Munir',22,'Bashundhara R/A, Block: F, Road: 11,Holding:443, Dhaka, Bangladesh','+01746000003',13),(0016,'Md. Jahid Bhuiyan',23,'Bashundhara R/A, Block: F, Road: 11,Holding:443, Dhaka, Bangladesh','+01746000004',15),(0017,'Md. Sayed Abdullah',23,'Bashundhara R/A, Block: F, Road: 11,Holding:443, Dhaka, Bangladesh','+01746000005',16),(0018,'Mrs. Risha Naznin',24,'Bashundhara R/A, Block: F, Road: 11,Holding:443, Dhaka, Bangladesh','+01746000006',24),(0019,'Mrs. Josna Akter',24,'Bashundhara R/A, Block: F, Road: 11,Holding:443, Dhaka, Bangladesh','+01746000007',1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grade`
--

DROP TABLE IF EXISTS `grade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grade` (
  `id` int NOT NULL AUTO_INCREMENT,
  `gradename` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grade`
--

LOCK TABLES `grade` WRITE;
/*!40000 ALTER TABLE `grade` DISABLE KEYS */;
INSERT INTO `grade` VALUES (1,'Grade-1'),(2,'Grade-2'),(21,'Grade-3'),(22,'Grade-4'),(23,'Grade-5'),(24,'Grade-6');
/*!40000 ALTER TABLE `grade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `age` int DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (6,27,'Abul','Abul','Kalam','1'),(7,25,'Rahim','Karim','Karim','111'),(8,25,'Rahim','Karim','Karim','111'),(18,25,'New ','New','new','123'),(19,25,'Abul','Tareq','Bhai amar 22','655');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-20 20:53:25
