-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 30/11/2023 às 03:30
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `pixelbattle`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `battle`
--

CREATE TABLE `battle` (
  `id_battle` int(11) NOT NULL,
  `status` varchar(255) NOT NULL,
  `datetime` datetime NOT NULL DEFAULT current_timestamp(),
  `winner` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `item`
--

CREATE TABLE `item` (
  `id_item` int(4) NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` text NOT NULL,
  `character` varchar(255) NOT NULL,
  `price` int(10) NOT NULL,
  `bonus_attack` int(10) NOT NULL,
  `bonus_defense` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `item`
--

INSERT INTO `item` (`id_item`, `name`, `description`, `character`, `price`, `bonus_attack`, `bonus_defense`) VALUES
(1, 'Espada dourada', 'Uma espada feita de ouro. Garante poder de ataque extra', 'Guerreiro', 10, 0, 0),
(2, 'Escudo divino', 'Um escudo forjado por Hefesto, Deus da Forja. Garante proteção extra.', 'Guerreiro', 10, 0, 0),
(3, 'Cajado do ancião', 'Cajado feito do tronco de Prometheus, a árvore mais velha da Terra.', 'Mago', 10, 0, 0),
(4, 'Bola de cristal', 'Com seu poder o usuário poderá ver segundos do futuro e se esquivar de um ataque.', 'Mago', 10, 0, 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `mage`
--

CREATE TABLE `mage` (
  `id_mage` int(2) NOT NULL,
  `name` varchar(255) NOT NULL,
  `health_points` int(100) NOT NULL,
  `attack_points` int(100) NOT NULL,
  `defense_points` int(100) NOT NULL,
  `knowledge_points` int(10) NOT NULL,
  `regeneration_points` int(10) NOT NULL,
  `item` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `warrior`
--

CREATE TABLE `warrior` (
  `id_warrior` int(2) NOT NULL,
  `name` varchar(255) NOT NULL,
  `health_points` int(100) NOT NULL,
  `attack_points` int(100) NOT NULL,
  `defense_points` int(100) NOT NULL,
  `strength_points` int(10) NOT NULL,
  `speed_points` int(10) NOT NULL,
  `Item` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `battle`
--
ALTER TABLE `battle`
  ADD PRIMARY KEY (`id_battle`);

--
-- Índices de tabela `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`id_item`);

--
-- Índices de tabela `mage`
--
ALTER TABLE `mage`
  ADD PRIMARY KEY (`id_mage`);

--
-- Índices de tabela `warrior`
--
ALTER TABLE `warrior`
  ADD PRIMARY KEY (`id_warrior`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `battle`
--
ALTER TABLE `battle`
  MODIFY `id_battle` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `item`
--
ALTER TABLE `item`
  MODIFY `id_item` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `mage`
--
ALTER TABLE `mage`
  MODIFY `id_mage` int(2) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `warrior`
--
ALTER TABLE `warrior`
  MODIFY `id_warrior` int(2) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
