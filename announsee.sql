-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 20-Nov-2018 às 00:06
-- Versão do servidor: 5.7.19
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `announsee`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `imovel`
--

DROP TABLE IF EXISTS `imovel`;
CREATE TABLE IF NOT EXISTS `imovel` (
  `imo_id` int(11) NOT NULL AUTO_INCREMENT,
  `imo_usu_id` int(11) NOT NULL,
  `imo_categoria` varchar(60) NOT NULL,
  `imo_preco` varchar(100) NOT NULL,
  `imo_bairro` varchar(100) NOT NULL,
  `imo_rua` varchar(200) NOT NULL,
  `imo_descricao` varchar(500) NOT NULL,
  `imo_telContato` varchar(12) NOT NULL,
  `imo_nome` varchar(200) DEFAULT NULL,
  `imo_faceContato` varchar(200) NOT NULL,
  `imo_foto` longblob,
  `imo_path` varchar(900) DEFAULT NULL,
  PRIMARY KEY (`imo_id`),
  KEY `fk_imo_usu_id` (`imo_usu_id`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `imovel`
--


DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `usu_id` int(11) NOT NULL AUTO_INCREMENT,
  `usu_nome` varchar(100) NOT NULL,
  `usu_sobrenome` varchar(100) DEFAULT NULL,
  `usu_telefone` varchar(11) DEFAULT NULL,
  `usu_email` varchar(100) NOT NULL,
  `usu_senha` varchar(100) NOT NULL,
  PRIMARY KEY (`usu_id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

INSERT INTO `usuario` (`usu_id`, `usu_nome`, `usu_sobrenome`, `usu_telefone`, `usu_email`, `usu_senha`) VALUES
(2, 'Vinicius', 'Komninaki', '11991797261', 'Vinicius_k2013@hotmail.com', 'komninakis123');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
