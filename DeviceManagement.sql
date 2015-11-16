-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 16, 2015 at 01:07 AM
-- Server version: 5.6.26
-- PHP Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `DeviceManagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `AccessControl`
--

CREATE TABLE IF NOT EXISTS `AccessControl` (
  `ObjectInstanceID` int(30) NOT NULL,
  `ObjectID` int(30) NOT NULL,
  `ACL` int(60) NOT NULL,
  `AccessControlOwner` int(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `AccessControl`
--

INSERT INTO `AccessControl` (`ObjectInstanceID`, `ObjectID`, `ACL`, `AccessControlOwner`) VALUES
(23, 0, 300, 123),
(12, 12, 12, 12),
(13, 13, 13, 13);

-- --------------------------------------------------------

--
-- Table structure for table `Attributes`
--

CREATE TABLE IF NOT EXISTS `Attributes` (
  `ObjectID` int(30) NOT NULL,
  `ObjectInstanceID` int(30) NOT NULL,
  `ResourceID` int(30) NOT NULL,
  `MinPeriod` int(30) NOT NULL,
  `MaxPeriod` int(30) NOT NULL,
  `Greaterthan` int(30) NOT NULL,
  `LesserThan` int(30) NOT NULL,
  `Step` int(30) NOT NULL,
  `Cancel` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Attributes`
--

INSERT INTO `Attributes` (`ObjectID`, `ObjectInstanceID`, `ResourceID`, `MinPeriod`, `MaxPeriod`, `Greaterthan`, `LesserThan`, `Step`, `Cancel`) VALUES
(1, 2, 3, 4, 5, 6, 7, 8, 9),
(0, 0, 0, 11, 2, 3, 4, 5, 6),
(0, 0, 0, 1, 1, 1, 1, 1, 1),
(0, 0, 0, 1, 1, 1, 1, 1, 1),
(1, 2, 3, 1, 1, 1, 1, 1, 1),
(1, 2, 3, 4, 5, 6, 7, 8, 9),
(1, 2, 3, 5, 6, 5, 5, 5, 5),
(1, 2, 3, 4, 5, 6, 7, 8, 9),
(1, 1, 1, 1, 1, 1, 1, 1, 1),
(23, 23, 23, 23, 23, 23, 23, 23, 23);

-- --------------------------------------------------------

--
-- Table structure for table `Location`
--

CREATE TABLE IF NOT EXISTS `Location` (
  `ObjectInstanceID` int(20) NOT NULL,
  `ObjectID` int(30) NOT NULL,
  `Latitude` double NOT NULL,
  `Longitude` double NOT NULL,
  `Altitude` int(20) NOT NULL,
  `Uncertainty` double NOT NULL,
  `Velocity` double NOT NULL,
  `Timestamp` time(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Location`
--

INSERT INTO `Location` (`ObjectInstanceID`, `ObjectID`, `Latitude`, `Longitude`, `Altitude`, `Uncertainty`, `Velocity`, `Timestamp`) VALUES
(12, 6, 12.3, 32.4, 123, 12.4, 12.5, '00:12:34.000000');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
