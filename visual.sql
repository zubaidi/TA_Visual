-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 04, 2013 at 02:57 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `visual`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbampu`
--

CREATE TABLE IF NOT EXISTS `tbampu` (
  `nip` varchar(20) NOT NULL,
  `kode_mapel` varchar(10) NOT NULL,
  `mapel` varchar(255) NOT NULL,
  `kelas` varchar(9) NOT NULL,
  PRIMARY KEY (`nip`),
  KEY `kode_mapel` (`kode_mapel`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbampu`
--

INSERT INTO `tbampu` (`nip`, `kode_mapel`, `mapel`, `kelas`) VALUES
('196205311982012003', 'MP001', 'Pendidikan Agama Islam', 'Kelas 2'),
('196704251988062001', 'MP001', 'Pendidikan Agama Islam', 'Kelas 2'),
('19890119197719101002', 'MP001', 'Pendidikan Agama Islam', 'Kelas 3');

-- --------------------------------------------------------

--
-- Table structure for table `tbguru`
--

CREATE TABLE IF NOT EXISTS `tbguru` (
  `nip` varchar(20) NOT NULL,
  `nama_guru` varchar(25) NOT NULL,
  `ttl_guru` date NOT NULL,
  `jekel` varchar(10) NOT NULL,
  `alamat_guru` varchar(30) NOT NULL,
  `agama_guru` varchar(10) NOT NULL,
  `jabatan_guru` varchar(15) NOT NULL,
  PRIMARY KEY (`nip`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbguru`
--

INSERT INTO `tbguru` (`nip`, `nama_guru`, `ttl_guru`, `jekel`, `alamat_guru`, `agama_guru`, `jabatan_guru`) VALUES
('196205311982012003', 'Purwanti, S.Pd. SD', '1962-05-31', 'Perempuan', 'Pekalongan', 'ISLAM', 'Guru Pendidik'),
('196704251988062001', 'Tri Lestari, S. Pd.', '1967-04-24', 'Perempuan', 'Magelang', 'ISLAM', 'Kepala Sekolah'),
('19890119197719101002', 'Sri Kapan Koe Bali', '1977-10-10', 'Perempuan', 'Gunung Hwakwo', 'ISLAM', 'Kepala Sekolah');

-- --------------------------------------------------------

--
-- Table structure for table `tbjadwal`
--

CREATE TABLE IF NOT EXISTS `tbjadwal` (
  `kode_mapel` varchar(10) NOT NULL,
  `nip` varchar(10) NOT NULL,
  `idruang` varchar(5) NOT NULL,
  `idkelas` varchar(5) NOT NULL,
  `waktu` varchar(4) NOT NULL,
  `hari` varchar(6) NOT NULL,
  `mapel` varchar(10) NOT NULL,
  `jam` varchar(4) NOT NULL,
  PRIMARY KEY (`kode_mapel`,`nip`,`idruang`,`idkelas`,`waktu`,`hari`,`jam`),
  KEY `idruang` (`idruang`),
  KEY `nip` (`nip`),
  KEY `idkelas` (`idkelas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbkelas`
--

CREATE TABLE IF NOT EXISTS `tbkelas` (
  `idkelas` varchar(8) NOT NULL,
  `namakelas` varchar(5) NOT NULL,
  `jumlahsiswa` varchar(5) NOT NULL,
  PRIMARY KEY (`idkelas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbmapel`
--

CREATE TABLE IF NOT EXISTS `tbmapel` (
  `nourut` char(11) NOT NULL,
  `kode_mapel` varchar(10) NOT NULL,
  `mapel` varchar(255) NOT NULL,
  `jumlah_pertemuan` varchar(3) NOT NULL,
  PRIMARY KEY (`kode_mapel`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbmapel`
--

INSERT INTO `tbmapel` (`nourut`, `kode_mapel`, `mapel`, `jumlah_pertemuan`) VALUES
('1', 'MP001', 'Pendidikan Agama Islam', '24'),
('2', 'MP002', 'PKn', '24'),
('3', 'MP003', 'Matematika', '24');

-- --------------------------------------------------------

--
-- Table structure for table `tbortu`
--

CREATE TABLE IF NOT EXISTS `tbortu` (
  `nis` int(5) NOT NULL,
  `nama_ortu` varchar(255) NOT NULL,
  `pekerjaan` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `telfon` int(13) NOT NULL,
  PRIMARY KEY (`nis`),
  KEY `nis` (`nis`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbortu`
--

INSERT INTO `tbortu` (`nis`, `nama_ortu`, `pekerjaan`, `alamat`, `telfon`) VALUES
(5095, 'Bapake', 'PNS', 'Pekalongan', 6776777),
(5099, 'Bapake', 'PNS', 'Pekalongan', 6776777),
(5100, 'Bapake', 'Wiraswasta', 'Pemalang', 9817234);

-- --------------------------------------------------------

--
-- Table structure for table `tbruang`
--

CREATE TABLE IF NOT EXISTS `tbruang` (
  `idruang` varchar(5) NOT NULL,
  `kapasitass` int(2) NOT NULL,
  PRIMARY KEY (`idruang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbsiswa`
--

CREATE TABLE IF NOT EXISTS `tbsiswa` (
  `nis` int(5) NOT NULL,
  `idkelas` varchar(8) NOT NULL,
  `th_angkatan` year(4) NOT NULL,
  `nama_siswa` varchar(255) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `alamat_siswa` varchar(255) NOT NULL,
  `jenis_kelamin` varchar(1) NOT NULL,
  `agama_siswa` varchar(10) NOT NULL,
  PRIMARY KEY (`nis`),
  KEY `idkelas` (`idkelas`),
  KEY `idkelas_2` (`idkelas`),
  KEY `idkelas_3` (`idkelas`),
  KEY `idkelas_4` (`idkelas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbsiswa`
--

INSERT INTO `tbsiswa` (`nis`, `idkelas`, `th_angkatan`, `nama_siswa`, `tanggal_lahir`, `alamat_siswa`, `jenis_kelamin`, `agama_siswa`) VALUES
(5095, 'Kelas 6', 2013, 'Zubaidi', '1992-01-26', 'Pekalongan', 'L', 'ISLAM'),
(5099, 'Kelas 6', 2013, 'Kyoya', '1200-07-10', 'Jepang', 'L', 'ISLAM'),
(5100, 'Kelas 6', 2013, 'Suprayogi', '1983-12-28', 'Pemalang', 'L', 'ISLAM');

-- --------------------------------------------------------

--
-- Table structure for table `tbuser`
--

CREATE TABLE IF NOT EXISTS `tbuser` (
  `user` varchar(16) NOT NULL,
  `password` varchar(32) NOT NULL,
  `id` int(1) NOT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbuser`
--

INSERT INTO `tbuser` (`user`, `password`, `id`) VALUES
('admin', 'admin', 1),
('Zubaidi', 'zubaidi', 2);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbampu`
--
ALTER TABLE `tbampu`
  ADD CONSTRAINT `tbampu_ibfk_1` FOREIGN KEY (`nip`) REFERENCES `tbguru` (`nip`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbampu_ibfk_2` FOREIGN KEY (`kode_mapel`) REFERENCES `tbmapel` (`kode_mapel`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbjadwal`
--
ALTER TABLE `tbjadwal`
  ADD CONSTRAINT `tbjadwal_ibfk_1` FOREIGN KEY (`kode_mapel`) REFERENCES `tbmapel` (`kode_mapel`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbjadwal_ibfk_2` FOREIGN KEY (`idruang`) REFERENCES `tbruang` (`idruang`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbjadwal_ibfk_3` FOREIGN KEY (`nip`) REFERENCES `tbampu` (`nip`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbjadwal_ibfk_4` FOREIGN KEY (`idkelas`) REFERENCES `tbkelas` (`idkelas`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbortu`
--
ALTER TABLE `tbortu`
  ADD CONSTRAINT `tbortu_ibfk_1` FOREIGN KEY (`nis`) REFERENCES `tbsiswa` (`nis`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
