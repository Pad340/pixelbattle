-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3304
-- Tempo de geração: 31-Out-2023 às 14:53
-- Versão do servidor: 10.4.28-MariaDB
-- versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_pixelbattle`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_battle`
--

CREATE TABLE `tb_battle` (
  `id_battle` int(11) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `fk_player` int(11) NOT NULL,
  `datetime` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_item`
--

CREATE TABLE `tb_item` (
  `id_item` int(11) NOT NULL,
  `description` varchar(255) NOT NULL,
  `character` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `price` int(11) NOT NULL,
  `bonus_attack` int(11) NOT NULL,
  `bonus_defense` int(11) NOT NULL
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_mage`
--

CREATE TABLE `tb_mage` (
  `id_mage` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `health_points` int(11) NOT NULL,
  `attack_points` int(11) NOT NULL,
  `defense_points` int(11) NOT NULL,
  `knowledge_points` int(11) NOT NULL,
  `regeneration_points` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_warrior`
--

CREATE TABLE `tb_warrior` (
  `id_warrior` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `health_points` int(11) NOT NULL,
  `attack_points` int(11) NOT NULL,
  `defense_points` int(11) NOT NULL,
  `strength_points` int(11) NOT NULL,
  `speed_points` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tb_battle`
--
ALTER TABLE `tb_battle`
  ADD KEY `fk_player` (`fk_player`);

--
-- Índices para tabela `tb_item`
--
ALTER TABLE `tb_item`
  ADD PRIMARY KEY (`id_item`);

--
-- Índices para tabela `tb_mage`
--
ALTER TABLE `tb_mage`
  ADD PRIMARY KEY (`id_mage`);

--
-- Índices para tabela `tb_warrior`
--
ALTER TABLE `tb_warrior`
  ADD PRIMARY KEY (`id_warrior`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tb_item`
--
ALTER TABLE `tb_item`
  MODIFY `id_item` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `tb_mage`
--
ALTER TABLE `tb_mage`
  MODIFY `id_mage` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `tb_warrior`
--
ALTER TABLE `tb_warrior`
  MODIFY `id_warrior` int(11) NOT NULL AUTO_INCREMENT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
