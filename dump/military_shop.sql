DROP DATABASE IF EXISTS military_shop ;
CREATE DATABASE military_shop  ;
USE military_shop ;
SET SQL_SAFE_UPDATES = 0;

CREATE TABLE IF NOT EXISTS zamovlennya (
  `id_zamovlennya` int(10) NOT NULL PRIMARY KEY,
  `id_prodavcya` int(10) default null,
  `id_pocupcya` int(10) default null,
  `nazva_zamovlennya` varchar(255) DEFAULT NULL,
  `vartist_zamovlennya` int(10) default null,
  `data_zamovlennya` varchar(255) default null
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;


CREATE TABLE IF NOT EXISTS prodavci (

  `id_prodavcya` int(10) NOT NULL PRIMARY KEY,
  `id_pocupcya` int(10) default null, 
  `imya` varchar(255) DEFAULT NULL,
  `kod` int(10) DEFAULT NULL,
  `reiting` int(10) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;


CREATE TABLE IF NOT EXISTS pocupci (

  `id_pokupcya` int(10) NOT NULL PRIMARY KEY,
  `imya` varchar(255) DEFAULT NULL,
  `misto` varchar(255) default null
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

 ALTER TABLE zamovlennya
  ADD CONSTRAINT `FK_zamovlennya_prodavci` FOREIGN KEY (`id_prodavcya`) REFERENCES prodavci(`id_prodavcya`),
  ADD CONSTRAINT `FK_zamovlennya_pocupci` FOREIGN KEY (`id_pocupcya`)  REFERENCES pocupci (`id_pokupcya`);



insert into `prodavci` (id_prodavcya, imya, kod, reiting) values (1, 'oleg', 21890, 5);
insert into  `prodavci` (id_prodavcya, imya, kod, reiting) values (2, 'andriy', 22980, 5);
insert into  `prodavci` (id_prodavcya, imya, kod, reiting) values (3, 'danil', 45679, 7);
insert into  `prodavci` (id_prodavcya, imya, kod, reiting) values (4, 'kostyantin', 34568, 8);
insert into  `prodavci` (id_prodavcya, imya, kod, reiting) values (5, 'olexander', 32456, 9);
insert into  `prodavci` (id_prodavcya, imya, kod, reiting) values (6, 'svyatoslav',56789, 10);
insert into  `prodavci` (id_prodavcya, imya, kod, reiting) values (7, 'oleg', 34560, 10);
insert into  `prodavci` (id_prodavcya, imya, kod, reiting) values (8, 'dmytro', 35678, 10);
insert into  `prodavci` (id_prodavcya, imya, kod, reiting) values (9, 'kiril', 33560, 9);
insert into  `prodavci` (id_prodavcya, imya, kod, reiting) values (10, 'andriy',89670, 8);



insert into `pocupci` (`id_pokupcya`, imya, misto) values (1, 'rostislav', 'lviv');
insert into `pocupci` (`id_pokupcya`, imya, misto) values (2, 'andryi', 'luck');
insert into `pocupci` (`id_pokupcya`, imya, misto) values (3, 'andriy', 'lviv');
insert into `pocupci` (`id_pokupcya`, imya, misto) values (4, 'dmytro', 'lviv');
insert into `pocupci` (`id_pokupcya`, imya, misto) values (5, 'rostislav', 'kyiv');
insert into `pocupci` (`id_pokupcya`, imya, misto) values (6, 'oleg', 'hmelnick');
insert into `pocupci` (`id_pokupcya`, imya, misto) values (7,'danil', 'harkiv');
insert into `pocupci` (`id_pokupcya`, imya, misto) values (8, 'danil', 'kyiv');
insert into `pocupci` (`id_pokupcya`, imya, misto) values (9, 'viktor', 'harkiv');
insert into `pocupci` (`id_pokupcya`, imya, misto) values (10, 'kiril', 'kyiv');

insert into `zamovlennya` (id_zamovlennya, id_prodavcya, id_pocupcya, nazva_zamovlennya, vartist_zamovlennya, data_zamovlennya) values (1, 1, 1,  'forma', 3000, 17/08/15);
insert into `zamovlennya` (id_prodavcya, id_pocupcya, id_zamovlennya, nazva_zamovlennya, vartist_zamovlennya, data_zamovlennya) values (2, 2, 2, 'zbroya', 10000, 20/08/15);
insert into `zamovlennya` (id_prodavcya, id_pocupcya, id_zamovlennya, nazva_zamovlennya, vartist_zamovlennya, data_zamovlennya) values (3, 3, 3, 'naboyi', 1000, 20/08/15);
insert into `zamovlennya` (id_prodavcya, id_pocupcya, id_zamovlennya, nazva_zamovlennya, vartist_zamovlennya, data_zamovlennya) values (4, 4, 4, 'berci', 2000, 17/08/15);
insert into `zamovlennya` (id_prodavcya, id_pocupcya, id_zamovlennya, nazva_zamovlennya, vartist_zamovlennya, data_zamovlennya) values (5, 5, 5, 'rozgruzka', 1500, 22/09/2015);
insert into `zamovlennya` (id_prodavcya, id_pocupcya, id_zamovlennya, nazva_zamovlennya, vartist_zamovlennya, data_zamovlennya) values (6,6, 6, 'taktichni_okulyari', 1000, 22/08/15);
insert into `zamovlennya` (id_prodavcya, id_pocupcya, id_zamovlennya, nazva_zamovlennya, vartist_zamovlennya, data_zamovlennya) values (7, 7, 7,  'magazin_dlya_AKS', 400, 23/08/15);
insert into `zamovlennya` (id_prodavcya, id_pocupcya, id_zamovlennya, nazva_zamovlennya, vartist_zamovlennya, data_zamovlennya) values (8, 8, 8, 'podsumok', 150, 23/09/15);
insert into `zamovlennya` (id_prodavcya, id_pocupcya, id_zamovlennya, nazva_zamovlennya, vartist_zamovlennya, data_zamovlennya) values (9, 9, 9, 'kaska', 5000, 23/09/15);
insert into `zamovlennya` (id_prodavcya, id_pocupcya, id_zamovlennya, nazva_zamovlennya, vartist_zamovlennya, data_zamovlennya) values (10, 10, 10, 'bronik', 15000,25/10/15); 
  

select * from prodavci inner join zamovlennya on zamovlennya.id_prodavcya = prodavci.id_prodavcya  inner join pocupci on zamovlennya.id_pocupcya = pocupci.id_pokupcya where vartist_zamovlennya > 100;

select vartist_zamovlennya from zamovlennya where vartist_zamovlennya > (select AVG (vartist_zamovlennya) from zamovlennya );
 



  
  
 
  
 
  
  