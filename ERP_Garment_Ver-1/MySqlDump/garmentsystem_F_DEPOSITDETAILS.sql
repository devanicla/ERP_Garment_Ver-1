CREATE DATABASE  IF NOT EXISTS `garmentsystem` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `garmentsystem`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: itp2016ver1fdgd.cht0bvbob1wj.us-west-2.rds.amazonaws.com    Database: garmentsystem
-- ------------------------------------------------------
-- Server version	5.6.27-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `F_DEPOSITDETAILS`
--

DROP TABLE IF EXISTS `F_DEPOSITDETAILS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `F_DEPOSITDETAILS` (
  `Cheque_No` varchar(45) NOT NULL DEFAULT '',
  `Customer ID` varchar(45) DEFAULT NULL,
  `BankName` varchar(45) DEFAULT NULL,
  `Branch Name` varchar(45) DEFAULT NULL,
  `Deposit Date` date DEFAULT NULL,
  `Amount` float DEFAULT NULL,
  PRIMARY KEY (`Cheque_No`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `F_DEPOSITDETAILS`
--

LOCK TABLES `F_DEPOSITDETAILS` WRITE;
/*!40000 ALTER TABLE `F_DEPOSITDETAILS` DISABLE KEYS */;
INSERT INTO `F_DEPOSITDETAILS` VALUES ('789256','cus1e3ce9767','Peoples Bank','piliyandala','2017-05-02',250000),('789489','cus1234','BOC','piliyandala','2017-05-08',40000),('7985478','cus1e38422','UNION','ampara','2017-05-04',12000),('852369','cus1e3cf14f4','Peoples Bank','kollupitiyae','2017-05-07',170000),('869222','cus98752h52','HNB ','mathara','2017-05-05',5000),('891746','cus1e3cf966a','Peoples Bank','maharagama','2017-05-04',300000);
/*!40000 ALTER TABLE `F_DEPOSITDETAILS` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-08 17:48:18
