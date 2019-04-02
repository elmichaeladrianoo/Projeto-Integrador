CREATE DATABASE `projetoproduto`;

USE `projetoproduto`;

CREATE TABLE `alteracao` (
  `idalteracao` int(11) NOT NULL,
  `idProduto` int(11) NOT NULL,
  `nomeCampo` varchar(45) NOT NULL,
  `dataAlteracao` date NOT NULL,
  `valor` varchar(45) NOT NULL,
  `alteracaocol` varchar(45) NOT NULL,
  PRIMARY KEY (`idalteracao`),
  KEY `FKProduto` (`idProduto`),
  CONSTRAINT `FKProduto` FOREIGN KEY (`idProduto`) REFERENCES `produto` (`idproduto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `atributo` (
  `idatributo` int(11) NOT NULL,
  `nomeAtributo` varchar(45) NOT NULL,
  PRIMARY KEY (`idatributo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `categoria` (
  `idcategoria` int(11) NOT NULL,
  `nomeCategoria` varchar(45) NOT NULL,
  PRIMARY KEY (`idcategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `marca` (
  `idmarca` int(11) NOT NULL,
  `nomeMarca` varchar(45) NOT NULL,
  PRIMARY KEY (`idmarca`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `modelo` (
  `idmodelo` int(11) NOT NULL,
  `nomeModelo` varchar(45) NOT NULL,
  PRIMARY KEY (`idmodelo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `produto` (
  `idproduto` int(11) NOT NULL,
  `nomeProduto` varchar(45) NOT NULL,
  `precoProduto` varchar(45) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `modelo` varchar(45) NOT NULL,
  `categoria` varchar(45) NOT NULL,
  `dataCadastro` date NOT NULL,
  `descricao` varchar(100) NOT NULL,
  PRIMARY KEY (`idproduto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `produtoatributo` (
  `idprodutoAtributo` int(11) NOT NULL,
  `idProduto` int(11) NOT NULL,
  `idAtributo` int(11) NOT NULL,
  `valor` varchar(45) NOT NULL,
  PRIMARY KEY (`idprodutoAtributo`),
  KEY `FKProduto2` (`idProduto`),
  KEY `FKAtributo` (`idAtributo`),
  CONSTRAINT `FKAtributo` FOREIGN KEY (`idAtributo`) REFERENCES `atributo` (`idatributo`),
  CONSTRAINT `FKProduto2` FOREIGN KEY (`idProduto`) REFERENCES `produto` (`idproduto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;