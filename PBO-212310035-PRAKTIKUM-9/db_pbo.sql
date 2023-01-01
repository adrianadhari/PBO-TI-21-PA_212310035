-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 01 Jan 2023 pada 18.36
-- Versi server: 10.1.36-MariaDB
-- Versi PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(10) NOT NULL,
  `fullname` varchar(30) NOT NULL,
  `phone` varchar(13) NOT NULL,
  `gender` varchar(1) NOT NULL,
  `citizenship` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id`, `email`, `password`, `fullname`, `phone`, `gender`, `citizenship`) VALUES
(1, 'adrianadhari@protonmail.com', 'pekacu663', 'Admin', '0000000000', 'M', 'Indonesia'),
(2, '212310035@student.ibik.ac.id', '212310035', 'Adrian Adhari', '083819601297', 'M', 'Indonesia'),
(3, 'test@mail.com', 'test', 'testuser', '000', 'F', 'Indonesia');

-- --------------------------------------------------------

--
-- Struktur dari tabel `students`
--

CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `npm` varchar(15) NOT NULL,
  `fullname` varchar(30) NOT NULL,
  `score` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `students`
--

INSERT INTO `students` (`id`, `npm`, `fullname`, `score`) VALUES
(1, '212310035', 'Adrian Adhari', 'A'),
(2, '212310034', 'Raden Rayyan Pratama Rakhmadie', 'A'),
(3, '212310017', 'Muhammad Alfan', 'C'),
(4, '212310006', 'Mahesa Alghifari', 'B'),
(5, '212310015', 'Dyas Tri Apriliansyah', 'B'),
(6, '212310025', 'Aditya Putra', 'D'),
(7, '212310043', 'M. Angga Parulian Harahap', 'E'),
(8, '212310048', 'Nagasa Anandes Putra Ramadhan', 'D'),
(9, '69696969', 'TEST', 'F');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `students`
--
ALTER TABLE `students`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
