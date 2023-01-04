-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 31, 2022 at 12:44 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `misistemagestion`
--

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `razonSocial` varchar(100) NOT NULL,
  `CuilCuit` int(20) NOT NULL,
  `telefono` int(20) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `contacto` varchar(100) NOT NULL,
  `fecha` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`id`, `razonSocial`, `CuilCuit`, `telefono`, `direccion`, `correo`, `contacto`, `fecha`) VALUES
(1, 'Angel Garban', 95732040, 1127683316, 'palomar', 'angelrgarbanc@gmail.com', 'angel garban', '2022-11-19 21:32:00'),
(4, 'Angie Garban', 95732039, 1127683340, 'palomar', 'angie@garban.com', 'roscete', '2022-11-23 23:19:24');

-- --------------------------------------------------------

--
-- Table structure for table `controlproduccion`
--

CREATE TABLE `controlproduccion` (
  `id` int(11) NOT NULL,
  `fecha` datetime NOT NULL,
  `40Lts` int(3) NOT NULL,
  `60Lts` int(3) NOT NULL,
  `90Lts` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `pedido`
--

CREATE TABLE `pedido` (
  `id` int(5) NOT NULL,
  `nPedido` int(6) NOT NULL,
  `cliente` varchar(100) DEFAULT NULL,
  `modelo40` int(6) NOT NULL,
  `modelo60` int(6) NOT NULL,
  `modelo90` int(6) NOT NULL,
  `saldo40` int(6) NOT NULL,
  `saldo60` int(6) NOT NULL,
  `saldo90` int(6) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pedido`
--

INSERT INTO `pedido` (`id`, `nPedido`, `cliente`, `modelo40`, `modelo60`, `modelo90`, `saldo40`, `saldo60`, `saldo90`, `status`) VALUES
(1, 1000, 'Angel Garban', 10, 20, 30, -10, -20, -30, 'Pendiente'),
(2, 1000, 'Angie Garban', 30, 50, 60, -30, -50, -60, 'Pendiente');

-- --------------------------------------------------------

--
-- Table structure for table `produccion`
--

CREATE TABLE `produccion` (
  `id` int(5) NOT NULL,
  `fecha` date NOT NULL,
  `modelo40` int(5) NOT NULL,
  `modelo60` int(5) NOT NULL,
  `modelo90` int(5) NOT NULL,
  `total` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `produccion`
--

INSERT INTO `produccion` (`id`, `fecha`, `modelo40`, `modelo60`, `modelo90`, `total`) VALUES
(1, '2022-12-02', 20, 30, 40, 90),
(2, '2022-12-03', 30, 40, 50, 120),
(3, '2022-12-05', 30, 60, 30, 120),
(4, '2022-12-06', 50, 40, 60, 150),
(5, '2022-12-07', 10, 5, 2, 17),
(6, '2022-12-08', 60, 20, 30, 110),
(7, '2022-12-09', 20, 5, 70, 95),
(8, '2022-12-12', 15, 10, 3, 28),
(9, '2022-12-07', 20, 30, 40, 90),
(10, '2022-12-08', 5, 2, 45, 52),
(11, '2022-12-12', 20, 30, 50, 100),
(12, '2022-12-19', 20, 30, 40, 90),
(13, '2022-12-06', 200, 300, 400, 900),
(14, '2022-12-12', 50, 50, 30, 130),
(15, '2022-12-12', 30, 2, 80, 112),
(16, '2022-12-12', 800, 600, 200, 1600),
(17, '2022-12-13', 20, 60, 300, 380),
(18, '2022-12-02', 200, 100, 50, 350),
(19, '2022-12-14', 300, 200, 200, 700);

-- --------------------------------------------------------

--
-- Table structure for table `proveedor`
--

CREATE TABLE `proveedor` (
  `id` int(11) NOT NULL,
  `razonSocial` varchar(100) NOT NULL,
  `CuilCuit` int(20) NOT NULL,
  `telefono` int(20) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `contacto` varchar(100) NOT NULL,
  `fecha` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `proveedor`
--

INSERT INTO `proveedor` (`id`, `razonSocial`, `CuilCuit`, `telefono`, `direccion`, `correo`, `contacto`, `fecha`) VALUES
(1, 'Gonvarri', 9878965, 5555555, 'Pacheco', 'gonvarri@gonvarri.com', 'vendedor', '2022-11-27 12:14:51');

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`id`, `nombre`, `correo`, `password`) VALUES
(1, 'Angel Garban', 'admin', '12321'),
(2, 'Diego Rodriguez', 'prueba@gmail.com', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `controlproduccion`
--
ALTER TABLE `controlproduccion`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `produccion`
--
ALTER TABLE `produccion`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `controlproduccion`
--
ALTER TABLE `controlproduccion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pedido`
--
ALTER TABLE `pedido`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `produccion`
--
ALTER TABLE `produccion`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
