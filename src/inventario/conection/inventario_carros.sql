-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-04-2023 a las 16:16:06
-- Versión del servidor: 10.4.17-MariaDB
-- Versión de PHP: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventario_carros`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cat_motor`
--

CREATE TABLE `cat_motor` (
  `id_motor` int(11) NOT NULL,
  `tipo_motor` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cat_motor`
--

INSERT INTO `cat_motor` (`id_motor`, `tipo_motor`) VALUES
(4, 'diesel'),
(6, 'gasolina'),
(7, 'gas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cat_tipo_vehi`
--

CREATE TABLE `cat_tipo_vehi` (
  `id_tipo_vehi` int(11) NOT NULL,
  `tipo_vehiculo` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cat_tipo_vehi`
--

INSERT INTO `cat_tipo_vehi` (`id_tipo_vehi`, `tipo_vehiculo`) VALUES
(1, 'sedan'),
(2, 'SUV'),
(3, 'Hatchback'),
(4, 'Descapotab'),
(5, 'Todoterren'),
(6, 'Pick-up'),
(7, 'Cupé');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `loguin`
--

CREATE TABLE `loguin` (
  `id_loguin` int(11) NOT NULL,
  `usuario` varchar(8) DEFAULT NULL,
  `clave` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `loguin`
--

INSERT INTO `loguin` (`id_loguin`, `usuario`, `clave`) VALUES
(1, 'admin', 'abc123'),
(2, 'sergio', 'ser123'),
(3, 'alex', '12345');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marca`
--

CREATE TABLE `marca` (
  `id_marca` int(11) NOT NULL,
  `nombre_marca` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `marca`
--

INSERT INTO `marca` (`id_marca`, `nombre_marca`) VALUES
(1, 'BMW'),
(2, 'KIA'),
(3, 'HYUNDAI'),
(4, 'TOYOTA'),
(5, 'NISSAN');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reg_usuario`
--

CREATE TABLE `reg_usuario` (
  `id_loguin` int(11) DEFAULT NULL,
  `id_rol` int(11) DEFAULT NULL,
  `nombres` varchar(140) DEFAULT NULL,
  `alias_empleado` varchar(8) DEFAULT NULL,
  `area` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `reg_usuario`
--

INSERT INTO `reg_usuario` (`id_loguin`, `id_rol`, `nombres`, `alias_empleado`, `area`) VALUES
(1, 2, 'admin', 'admin', 1),
(2, 1, 'Sergio', 'sergio', 1),
(NULL, 2, 'Alexander', 'alex', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `id_vehiculo` int(11) NOT NULL,
  `id_tipo_vehi` int(11) DEFAULT NULL,
  `id_motor` int(11) DEFAULT NULL,
  `id_marca` int(11) DEFAULT NULL,
  `transmision` int(11) DEFAULT NULL,
  `modelo` varchar(15) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `año` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `vehiculo`
--

INSERT INTO `vehiculo` (`id_vehiculo`, `id_tipo_vehi`, `id_motor`, `id_marca`, `transmision`, `modelo`, `precio`, `año`) VALUES
(1, 1, 6, 1, 1, '323I', 35, '2000'),
(2, 6, 4, 4, 1, 'Hilux', 15000, '2010'),
(3, 3, 6, 2, 2, 'rio', 5000, '2018'),
(4, 1, 6, 5, 2, 'versa', 7000, '2013'),
(5, 1, 6, 3, 2, 'tiburon', 8000, '2009'),
(6, 6, 4, 4, 1, 'hilux', 3000, '2004'),
(7, 4, 6, 4, 2, 'copue', 6500, '1990'),
(8, 5, 4, 4, 2, 'runner', 11000, '1990'),
(9, 5, 4, 3, 2, 'santa fe', 7000, '2010');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cat_motor`
--
ALTER TABLE `cat_motor`
  ADD PRIMARY KEY (`id_motor`);

--
-- Indices de la tabla `cat_tipo_vehi`
--
ALTER TABLE `cat_tipo_vehi`
  ADD PRIMARY KEY (`id_tipo_vehi`);

--
-- Indices de la tabla `loguin`
--
ALTER TABLE `loguin`
  ADD PRIMARY KEY (`id_loguin`),
  ADD KEY `id_loguin` (`id_loguin`);

--
-- Indices de la tabla `marca`
--
ALTER TABLE `marca`
  ADD PRIMARY KEY (`id_marca`);

--
-- Indices de la tabla `reg_usuario`
--
ALTER TABLE `reg_usuario`
  ADD KEY `id_rol` (`id_rol`),
  ADD KEY `id_loguin` (`id_loguin`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`id_vehiculo`),
  ADD KEY `id_tipo_vehi` (`id_tipo_vehi`),
  ADD KEY `id_motor` (`id_motor`),
  ADD KEY `id_marca` (`id_marca`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cat_motor`
--
ALTER TABLE `cat_motor`
  MODIFY `id_motor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `cat_tipo_vehi`
--
ALTER TABLE `cat_tipo_vehi`
  MODIFY `id_tipo_vehi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `loguin`
--
ALTER TABLE `loguin`
  MODIFY `id_loguin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `marca`
--
ALTER TABLE `marca`
  MODIFY `id_marca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  MODIFY `id_vehiculo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `reg_usuario`
--
ALTER TABLE `reg_usuario`
  ADD CONSTRAINT `reg_usuario_ibfk_1` FOREIGN KEY (`id_rol`) REFERENCES `roles` (`id_rol`),
  ADD CONSTRAINT `reg_usuario_ibfk_2` FOREIGN KEY (`id_loguin`) REFERENCES `loguin` (`id_loguin`);

--
-- Filtros para la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD CONSTRAINT `vehiculo_ibfk_1` FOREIGN KEY (`id_tipo_vehi`) REFERENCES `cat_tipo_vehi` (`id_tipo_vehi`),
  ADD CONSTRAINT `vehiculo_ibfk_2` FOREIGN KEY (`id_motor`) REFERENCES `cat_motor` (`id_motor`),
  ADD CONSTRAINT `vehiculo_ibfk_3` FOREIGN KEY (`id_marca`) REFERENCES `marca` (`id_marca`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
