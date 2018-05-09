-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 08, 2018 at 10:55 PM
-- Server version: 5.7.22-0ubuntu0.17.10.1
-- PHP Version: 7.1.15-0ubuntu0.17.10.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `empresa`
--

-- --------------------------------------------------------

--
-- Table structure for table `clientes`
--

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `rua` varchar(50) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `complemento` varchar(50) NOT NULL,
  `cpfcnpj` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `compra`
--

CREATE TABLE `compra` (
  `id` int(15) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `valor` double NOT NULL,
  `quantidade` int(30) NOT NULL,
  `data` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `compraFeita`
--

CREATE TABLE `compraFeita` (
  `idCompraFeita` int(30) NOT NULL,
  `clienteCompraFeita` varchar(50) NOT NULL,
  `nomeCompraFeita` varchar(50) NOT NULL,
  `valorCompraFeita` double NOT NULL,
  `quantidadeCompraFeita` int(30) NOT NULL,
  `mesCompraFeita` varchar(10) NOT NULL,
  `marcaCompraFeita` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `compraFeita`
--

INSERT INTO `compraFeita` (`idCompraFeita`, `clienteCompraFeita`, `nomeCompraFeita`, `valorCompraFeita`, `quantidadeCompraFeita`, `mesCompraFeita`, `marcaCompraFeita`) VALUES
(54, 'Nome do Cliente', 'chave de fenda', 123, 1, '03/2018', 'Tigre'),
(55, 'Nome do Cliente', 'cacaca', 26, 2, '03/2018', 'Tigre'),
(56, 'Nome do Cliente', 'dasda', 123.99, 1, '03/2018', 'Tigre'),
(57, 'Nome do Cliente', 'testeProduto', 29.99, 1, '03/2018', 'Tigre'),
(58, 'Nome do Cliente', 'dasda', 123.99, 1, '03/2018', 'Tigre'),
(59, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre'),
(60, 'Nome do Cliente', 'cacaca', 26, 2, '03/2018', 'Tigre'),
(61, 'Nome do Cliente', 'testeProduto', 29.99, 1, '03/2018', 'Tigre'),
(62, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre'),
(63, 'Nome do Cliente', 'dasda', 123.99, 1, '03/2018', 'Tigre'),
(64, 'Nome do Cliente', 'testeProduto', 29.99, 1, '03/2018', 'Tigre'),
(65, 'Nome do Cliente', 'cacaca', 26, 2, '03/2018', 'Tigre'),
(66, 'Nome do Cliente', 'cacaca', 26, 2, '03/2018', 'Tigre'),
(67, 'Nome do Cliente', 'testeProduto', 29.99, 1, '03/2018', 'Tigre'),
(68, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre'),
(69, 'Nome do Cliente', 'dasda', 123.99, 1, '03/2018', 'Tigre'),
(70, 'Nome do Cliente', 'dasda', 123.99, 1, '03/2018', 'Tigre'),
(71, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre'),
(72, 'Nome do Cliente', 'dasda', 123.99, 1, '03/2018', 'Tigre'),
(73, 'Nome do Cliente', 'cacaca', 26, 2, '03/2018', 'Tigre'),
(74, 'Nome do Cliente', 'cacaca', 26, 2, '03/2018', 'Tigre'),
(75, 'Nome do Cliente', 'dasda', 123.99, 1, '03/2018', 'Tigre'),
(76, 'Nome do Cliente', 'testeProduto', 29.99, 1, '03/2018', 'Tigre'),
(77, 'Nome do Cliente', 'cacaca', 26, 2, '03/2018', 'Tigre'),
(78, 'Nome do Cliente', 'testeProduto', 29.99, 1, '03/2018', 'Tigre'),
(79, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre'),
(80, 'Nome do Cliente', 'testeProduto', 29.99, 1, '03/2018', 'Tigre'),
(81, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre'),
(82, 'Nome do Cliente', 'testeProduto', 29.99, 1, '03/2018', 'Tigre'),
(83, 'Nome do Cliente', 'testeProduto', 29.99, 1, '03/2018', 'Tigre'),
(84, 'Nome do Cliente', 'dasda', 123.99, 1, '03/2018', 'Tigre'),
(85, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre'),
(86, 'Nome do Cliente', 'testeProduto', 29.99, 1, '03/2018', 'Tigre'),
(87, 'Nome do Cliente', 'testeProduto', 29.99, 1, '03/2018', 'Tigre'),
(88, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre'),
(89, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre'),
(90, 'Nome do Cliente', 'dasda', 123.99, 1, '03/2018', 'Tigre'),
(91, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre'),
(92, 'Nome do Cliente', 'Tubo', 32.99, 1, '03/2018', 'Amanco'),
(93, 'Nome do Cliente', 'dasda', 123.99, 1, '03/2018', 'Tigre'),
(94, 'Nome do Cliente', 'cacaca', 26, 2, '03/2018', 'Tigre'),
(95, 'Nome do Cliente', 'dasda', 123.99, 1, '03/2018', 'Tigre'),
(96, 'Nome do Cliente', 'Tubo', 32.99, 1, '03/2018', 'Amanco'),
(97, 'Nome do Cliente', 'dasda', 123.98, 1, '03/2018', 'Tigre'),
(98, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre'),
(99, 'Nome do Cliente', 'dasda', 123.9800033569336, 1, '03/2018', 'Tigre'),
(100, 'Nome do Cliente', 'dasda', 123.9800033569336, 1, '03/2018', 'Tigre'),
(101, 'Nome do Cliente', 'dasda', 123.9800033569336, 1, '03/2018', 'Tigre'),
(102, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre'),
(103, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre'),
(104, 'Nome do Cliente', 'dasda', 247.9600067138672, 2, '03/2018', 'Tigre'),
(105, 'Nome do Cliente', 'Tubo', 32.9900016784668, 1, '03/2018', 'Amanco'),
(106, 'Nome do Cliente', 'dasda', 123.9800033569336, 1, '03/2018', 'Tigre'),
(107, 'Nome do Cliente', 'cacaca', 26, 2, '03/2018', 'Tigre'),
(108, 'Nome do Cliente', 'dasda', 247.96, 2, '03/2018', 'Tigre'),
(109, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre'),
(110, 'Nome do Cliente', 'testeDouble', 123, 1, '03/2018', 'Tigre'),
(111, 'Nome do Cliente', 'Tubo', 32.99, 1, '03/2018', 'Amanco'),
(112, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre'),
(113, 'Nome do Cliente', 'testeDouble', 123, 1, '03/2018', 'Tigre'),
(114, 'Nome do Cliente', 'Tubo', 32.99, 1, '03/2018', 'Amanco'),
(115, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre'),
(116, 'Nome do Cliente', 'Teste Ultimo Produto', 123, 1, '03/2018', 'Amanco'),
(117, 'Nome do Cliente', 'testeDouble', 123, 1, '03/2018', 'Tigre'),
(118, 'Nome do Cliente', 'Tubo', 32.99, 1, '03/2018', 'Amanco'),
(119, 'Nome do Cliente', 'Teste Ultimo Produto', 123, 1, '03/2018', 'Amanco'),
(120, 'Nome do Cliente', 'testeDouble', 123, 1, '03/2018', 'Tigre'),
(121, 'Nome do Cliente', 'cacaca', 13, 1, '03/2018', 'Tigre');

-- --------------------------------------------------------

--
-- Table structure for table `funcionarios`
--

CREATE TABLE `funcionarios` (
  `id` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `senha` varchar(50) NOT NULL,
  `cargo` varchar(15) NOT NULL,
  `ramal` int(50) NOT NULL,
  `nomecompleto` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `rua` varchar(50) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `cpf` bigint(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `funcionarios`
--

INSERT INTO `funcionarios` (`id`, `usuario`, `senha`, `cargo`, `ramal`, `nomecompleto`, `email`, `rua`, `bairro`, `cpf`) VALUES
(1, 'admin', '123', 'Administrador', 999999999, 'luiz', 'vinicius', 'caio', 'Aboliçâo', 1908987);

-- --------------------------------------------------------

--
-- Table structure for table `marca`
--

CREATE TABLE `marca` (
  `Id` int(30) NOT NULL,
  `nome` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marca`
--

INSERT INTO `marca` (`Id`, `nome`) VALUES
(1, 'Amanco'),
(2, 'Tigre');

-- --------------------------------------------------------

--
-- Table structure for table `produtos`
--

CREATE TABLE `produtos` (
  `id` int(10) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `valor` double NOT NULL,
  `estoque` int(11) NOT NULL,
  `marca` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `produtos`
--

INSERT INTO `produtos` (`id`, `nome`, `tipo`, `valor`, `estoque`, `marca`) VALUES
(2, 'cacaca', 'Hidráulicos', 13, 7, 'Tigre'),
(4, 'Tubo', 'Hidráulicos', 32.99, 8, 'Amanco'),
(5, 'testeDouble', 'Hidráulicos', 123, 7, 'Tigre'),
(6, 'Teste Ultimo Produto', 'Hidráulicos', 123, 7, 'Amanco'),
(7, 'Testando Quantidade 1', 'Hidráulicos', 123, 1, 'Tigre'),
(8, 'Teste Quantidade 2', 'Hidráulicos', 1234, 1, 'Tigre');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `compraFeita`
--
ALTER TABLE `compraFeita`
  ADD PRIMARY KEY (`idCompraFeita`);

--
-- Indexes for table `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `marca`
--
ALTER TABLE `marca`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `compra`
--
ALTER TABLE `compra`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `compraFeita`
--
ALTER TABLE `compraFeita`
  MODIFY `idCompraFeita` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=122;
--
-- AUTO_INCREMENT for table `funcionarios`
--
ALTER TABLE `funcionarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `marca`
--
ALTER TABLE `marca`
  MODIFY `Id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `produtos`
--
ALTER TABLE `produtos`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
