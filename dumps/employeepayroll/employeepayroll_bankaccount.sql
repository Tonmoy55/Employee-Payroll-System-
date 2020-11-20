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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-20 20:51:54
