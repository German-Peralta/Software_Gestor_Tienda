-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-12-2021 a las 05:37:37
-- Versión del servidor: 10.1.37-MariaDB
-- Versión de PHP: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tienda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `ID_CATEGORIA` int(2) NOT NULL,
  `NOMBRE_CATEGORIA` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `DNI` varchar(9) COLLATE utf8_spanish2_ci NOT NULL,
  `NOMBRE` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `APELLIDOS` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `TELEFONO` int(9) NOT NULL,
  `CALLE` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `NUMERO` int(3) NOT NULL,
  `CODIGO POSTAL` int(5) NOT NULL,
  `CIUDAD` varchar(10) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `REGISTRO COMPRA` int(11) NOT NULL,
  `CIF` varchar(9) COLLATE utf8_spanish2_ci NOT NULL,
  `FECHA` date NOT NULL,
  `ID_USUARIO` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle compra`
--

CREATE TABLE `detalle compra` (
  `REGISTRO COMPRA` int(2) NOT NULL,
  `CODIGO DE BARRAS` bigint(12) NOT NULL,
  `CANTIDAD` int(2) NOT NULL,
  `PRECIO UNITARIO` decimal(5,2) NOT NULL,
  `TIPO DE IVA` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Disparadores `detalle compra`
--
DELIMITER $$
CREATE TRIGGER `actualiza_stock_compra_INSERT` AFTER INSERT ON `detalle compra` FOR EACH ROW UPDATE productos SET productos.STOCK=productos.STOCK+NEW.CANTIDAD
WHERE productos.`CODIGO DE BARRAS`= NEW.`CODIGO DE BARRAS`
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `actualiza_stock_compra_UPDATE` AFTER UPDATE ON `detalle compra` FOR EACH ROW UPDATE productos SET productos.STOCK=productos.STOCK+NEW.CANTIDAD 
WHERE productos.`CODIGO DE BARRAS`=NEW.`CODIGO DE BARRAS`
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle venta`
--

CREATE TABLE `detalle venta` (
  `REGISTRO VENTA` int(2) NOT NULL,
  `CODIGO DE BARRAS` bigint(12) NOT NULL,
  `CANTIDAD` int(2) NOT NULL,
  `PRECIO UNITARIO` decimal(5,2) NOT NULL,
  `TIPO DE IVA` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Disparadores `detalle venta`
--
DELIMITER $$
CREATE TRIGGER `actualiza_stock_venta_INSERT` AFTER INSERT ON `detalle venta` FOR EACH ROW UPDATE productos SET productos.STOCK=productos.STOCK-NEW.CANTIDAD WHERE productos.`CODIGO DE BARRAS`= NEW.`CODIGO DE BARRAS`
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `actualiza_stock_venta_UPDATE` AFTER UPDATE ON `detalle venta` FOR EACH ROW UPDATE productos SET productos.STOCK=productos.STOCK-NEW.CANTIDAD WHERE productos.`CODIGO DE BARRAS`= NEW.`CODIGO DE BARRAS`
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `CODIGO DE BARRAS` bigint(12) NOT NULL,
  `STOCK` int(3) NOT NULL,
  `NOMBRE` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `DESCRIPCION` text COLLATE utf8_spanish2_ci NOT NULL,
  `PRECIO COMPRA` decimal(5,2) NOT NULL,
  `PRECIO VENTA` decimal(5,2) NOT NULL,
  `TIPO IVA SOPORTADO` int(2) NOT NULL,
  `TIPO IVA REPERCUTIDO` int(2) NOT NULL,
  `CATEGORIA` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE `proveedores` (
  `CIF` varchar(9) COLLATE utf8_spanish2_ci NOT NULL,
  `RAZON SOCIAL` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `TELEFONO` varchar(9) COLLATE utf8_spanish2_ci NOT NULL,
  `WEB` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `CALLE` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `NUMERO` varchar(3) COLLATE utf8_spanish2_ci NOT NULL,
  `CODIGO POSTAL` varchar(5) COLLATE utf8_spanish2_ci NOT NULL,
  `CIUDAD` varchar(10) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo usuario`
--

CREATE TABLE `tipo usuario` (
  `ID_TIPO_USUARIO` int(2) NOT NULL,
  `NOMBRE_TIPO_USUARIO` varchar(25) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `tipo usuario`
--

INSERT INTO `tipo usuario` (`ID_TIPO_USUARIO`, `NOMBRE_TIPO_USUARIO`) VALUES
(1, 'Encargado'),
(2, 'Vendedor');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `ID_USUARIO` int(2) NOT NULL,
  `NOMBRE_USUARIO` varchar(25) COLLATE utf8_spanish2_ci NOT NULL,
  `CONTRASEÑA` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `ID_TIPO_USUARIO` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID_USUARIO`, `NOMBRE_USUARIO`, `CONTRASEÑA`, `ID_TIPO_USUARIO`) VALUES
(1, 'System', '753159', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `REGISTRO VENTA` int(2) NOT NULL,
  `DNI` varchar(9) COLLATE utf8_spanish2_ci NOT NULL,
  `FECHA` date NOT NULL,
  `ID_USUARIO` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`ID_CATEGORIA`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`DNI`),
  ADD KEY `DNI` (`DNI`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`REGISTRO COMPRA`),
  ADD KEY `REGISTRO COMPRA` (`REGISTRO COMPRA`),
  ADD KEY `CIF` (`CIF`),
  ADD KEY `FK_USUARIO_COMPRA` (`ID_USUARIO`);

--
-- Indices de la tabla `detalle compra`
--
ALTER TABLE `detalle compra`
  ADD PRIMARY KEY (`REGISTRO COMPRA`,`CODIGO DE BARRAS`),
  ADD KEY `REGISTRO COMPRA` (`REGISTRO COMPRA`),
  ADD KEY `CODIGO DE BARRAS` (`CODIGO DE BARRAS`);

--
-- Indices de la tabla `detalle venta`
--
ALTER TABLE `detalle venta`
  ADD PRIMARY KEY (`REGISTRO VENTA`,`CODIGO DE BARRAS`) USING BTREE,
  ADD KEY `REGISTRO VENTA` (`REGISTRO VENTA`),
  ADD KEY `CODIGO DE BARRAS` (`CODIGO DE BARRAS`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`CODIGO DE BARRAS`),
  ADD KEY `CODIGO DE BARRAS` (`CODIGO DE BARRAS`),
  ADD KEY `FK_CATEGORIA` (`CATEGORIA`);

--
-- Indices de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  ADD PRIMARY KEY (`CIF`),
  ADD KEY `CIF` (`CIF`);

--
-- Indices de la tabla `tipo usuario`
--
ALTER TABLE `tipo usuario`
  ADD PRIMARY KEY (`ID_TIPO_USUARIO`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ID_USUARIO`),
  ADD KEY `FK_TIPO_USUARIO` (`ID_TIPO_USUARIO`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`REGISTRO VENTA`),
  ADD KEY `REGISTRO VENTA` (`REGISTRO VENTA`),
  ADD KEY `FK_VENTA_CLIENTES` (`DNI`),
  ADD KEY `FK_USUARIO_VENTA` (`ID_USUARIO`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `REGISTRO COMPRA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `FK_COMPRA_PROVEEDORES` FOREIGN KEY (`CIF`) REFERENCES `proveedores` (`CIF`) ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_USUARIO_COMPRA` FOREIGN KEY (`ID_USUARIO`) REFERENCES `usuario` (`ID_USUARIO`);

--
-- Filtros para la tabla `detalle compra`
--
ALTER TABLE `detalle compra`
  ADD CONSTRAINT `FK_DETALLE_COMPRA` FOREIGN KEY (`REGISTRO COMPRA`) REFERENCES `compra` (`REGISTRO COMPRA`) ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_DETALLE_COMPRA_PRODUCTO` FOREIGN KEY (`CODIGO DE BARRAS`) REFERENCES `productos` (`CODIGO DE BARRAS`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalle venta`
--
ALTER TABLE `detalle venta`
  ADD CONSTRAINT `FK_DETALLE_VENTA` FOREIGN KEY (`REGISTRO VENTA`) REFERENCES `venta` (`REGISTRO VENTA`) ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_DETALLE_VENTA_PRODUCTO` FOREIGN KEY (`CODIGO DE BARRAS`) REFERENCES `productos` (`CODIGO DE BARRAS`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `FK_CATEGORIA` FOREIGN KEY (`CATEGORIA`) REFERENCES `categoria` (`ID_CATEGORIA`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `FK_TIPO_USUARIO` FOREIGN KEY (`ID_TIPO_USUARIO`) REFERENCES `tipo usuario` (`ID_TIPO_USUARIO`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `FK_USUARIO_VENTA` FOREIGN KEY (`ID_USUARIO`) REFERENCES `usuario` (`ID_USUARIO`),
  ADD CONSTRAINT `FK_VENTA_CLIENTES` FOREIGN KEY (`DNI`) REFERENCES `clientes` (`DNI`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
