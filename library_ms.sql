-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 06, 2023 at 06:32 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library_ms`
--

-- --------------------------------------------------------

--
-- Table structure for table `book_details`
--

CREATE TABLE `book_details` (
  `book_id` int(11) NOT NULL,
  `book_name` varchar(250) DEFAULT NULL,
  `author` varchar(100) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `book_details`
--

INSERT INTO `book_details` (`book_id`, `book_name`, `author`, `quantity`) VALUES
(1, 'JAVA', 'James Gosling', 1),
(2, 'Python', 'Guido Van Rossum', 2),
(3, 'php', 'jdbc', 4);

-- --------------------------------------------------------

--
-- Table structure for table `issue_book_details`
--

CREATE TABLE `issue_book_details` (
  `id` int(11) NOT NULL,
  `book_id` int(11) DEFAULT NULL,
  `book_name` varchar(150) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `student_name` varchar(50) DEFAULT NULL,
  `issue_date` date DEFAULT NULL,
  `due_date` date DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `issue_book_details`
--

INSERT INTO `issue_book_details` (`id`, `book_id`, `book_name`, `student_id`, `student_name`, `issue_date`, `due_date`, `status`) VALUES
(1, 1, 'JAVA', 1, 'pratama', '2023-12-06', '2023-12-07', 'returned'),
(2, 1, 'JAVA', 1, 'pratama', '2023-12-06', '2023-12-07', 'returned'),
(3, 1, 'JAVA', 1, 'pratama', '2023-12-06', '2023-12-07', 'returned'),
(4, 1, 'JAVA', 1, 'pratama', '2023-12-06', '2023-12-07', 'returned'),
(5, 1, 'JAVA', 1, 'pratama', '2023-12-06', '2023-12-07', 'returned'),
(6, 1, 'JAVA', 1, 'pratama', '2023-12-06', '2023-12-14', 'returned'),
(7, 1, 'JAVA', 1, 'pratama', '2023-12-06', '2023-12-07', 'returned'),
(8, 1, 'JAVA', 1, 'pratama', '2023-12-05', '2023-12-07', 'returned'),
(9, 1, 'JAVA', 1, 'pratama', '2023-12-06', '2023-12-07', 'returned'),
(10, 1, 'JAVA', 1, 'pratama', '2023-12-06', '2023-12-07', 'returned'),
(11, 1, 'JAVA', 1, 'pratama', '2023-12-05', '2023-12-08', 'pending'),
(12, 3, 'php', 1, 'pratama', '2023-12-06', '2023-12-07', 'pending');

-- --------------------------------------------------------

--
-- Table structure for table `student_details`
--

CREATE TABLE `student_details` (
  `student_id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `course` varchar(100) DEFAULT NULL,
  `branch` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student_details`
--

INSERT INTO `student_details` (`student_id`, `name`, `course`, `branch`) VALUES
(1, 'pratama', 'FST', 'SI'),
(2, 'Putra', 'FAHUM', 'TL'),
(3, 'sendi', 'FPK', 'BIO');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `contact` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `password`, `email`, `contact`) VALUES
(1, 'admin', 'admin', 'admin', 'admin'),
(2, 'sidik ', 'sidik', 'sidik', 'sidik'),
(3, 'sidik ', 'sidik', 'sidik', 'sidik'),
(4, 'Ageng Putra Pratama', '', 'cfsdf', 'afda'),
(5, 'Ageng Putra Pratama', '', 'cfsdf', 'afda'),
(6, 'ageng', 'dadq', 'aju@gmail.com', '123'),
(7, 'terbang', 'terbang', 'terbang@gmail.co', 'terbang'),
(8, 'laptop', 'laptop', 'laptop@gmail.com', 'laptop');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book_details`
--
ALTER TABLE `book_details`
  ADD PRIMARY KEY (`book_id`);

--
-- Indexes for table `issue_book_details`
--
ALTER TABLE `issue_book_details`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student_details`
--
ALTER TABLE `student_details`
  ADD PRIMARY KEY (`student_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `book_details`
--
ALTER TABLE `book_details`
  MODIFY `book_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `issue_book_details`
--
ALTER TABLE `issue_book_details`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `student_details`
--
ALTER TABLE `student_details`
  MODIFY `student_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
