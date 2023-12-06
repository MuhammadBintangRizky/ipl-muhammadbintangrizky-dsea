-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 06, 2023 at 04:39 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Database: `dbimpal`
--

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `idMember` int(11) NOT NULL,
  `namaMember` varchar(25) NOT NULL,
  `status` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `pesan`
--

CREATE TABLE `pesan` (
  `idPesan` int(11) NOT NULL,
  `idPenerima` int(11) NOT NULL,
  `idPengirim` int(11) NOT NULL,
  `Judul` varchar(25) NOT NULL,
  `TextPesan` varchar(25) NOT NULL,
  `WktPesan` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pesan`
--

INSERT INTO `pesan` (`idPesan`, `idPenerima`, `idPengirim`, `Judul`, `TextPesan`, `WktPesan`) VALUES
(11001, 22001, 33001, 'Cahaya Bintang', 'Cahaya bintang dilangit', '2023-12-06'),
(11002, 22002, 33002, 'Pantai', 'Pantai yang indah', '2023-12-07'),
(11003, 22003, 33003, 'Tips Cara Memasak', 'Ini adalah isinya', '2023-12-08'),
(11004, 22004, 33004, 'Rumahku', 'Suasana rumahku', '2023-12-09'),
(11005, 22005, 33005, 'Matematika', 'Kelas 6 SD', '2023-12-10'),
(11006, 22006, 33006, 'SKI', 'Sistem Keamanan Informasi', '2023-12-11');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`idMember`);

--
-- Indexes for table `pesan`
--
ALTER TABLE `pesan`
  ADD PRIMARY KEY (`idPesan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `member`
--
ALTER TABLE `member`
  MODIFY `idMember` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pesan`
--
ALTER TABLE `pesan`
  MODIFY `idPesan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11008;
COMMIT;
