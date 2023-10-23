-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 24, 2022 at 05:53 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `webdidong`
--

-- --------------------------------------------------------

--
-- Table structure for table `chi_tiet_hoa_don`
--

CREATE TABLE IF NOT EXISTS `chi_tiet_hoa_don` (
`ma_chi_tiet_hoa_don` int(11) NOT NULL,
  `ma_hoa_don` int(11) NOT NULL,
  `ma_san_pham` varchar(20) NOT NULL,
  `so_luong` int(11) NOT NULL,
  `don_gia` double NOT NULL,
  `giam_gia` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chi_tiet_hoa_don`
--

INSERT INTO `chi_tiet_hoa_don` (`ma_chi_tiet_hoa_don`, `ma_hoa_don`, `ma_san_pham`, `so_luong`, `don_gia`, `giam_gia`) VALUES
(1, 0, '0', 3, 12, 5),
(2, 0, '0', 6, 12, 5),
(3, 0, '0', 4, 12, 5),
(4, 0, '0', 3, 12, 5),
(5, 0, '0', 2, 12, 5),
(6, 0, '0', 10, 12, 5),
(10, 0, '2', 4, 30, 10),
(11, 0, '0', 2, 12, 5),
(12, 0, '2', 5, 30, 10),
(13, 0, '0', 3, 12, 5),
(14, 0, '2', 5, 30, 10),
(15, 0, '0', 2, 12, 5),
(16, 0, '0', 3, 12, 5),
(17, 0, '14', 4, 20, 5);

-- --------------------------------------------------------

--
-- Table structure for table `danhmuc`
--

CREATE TABLE IF NOT EXISTS `danhmuc` (
`ma_danh_muc` int(11) NOT NULL,
  `ten_danh_muc` varchar(255) NOT NULL,
  `danh_muc_cha` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `danhmuc`
--

INSERT INTO `danhmuc` (`ma_danh_muc`, `ten_danh_muc`, `danh_muc_cha`) VALUES
(1, 'Điện Thoại', 0),
(2, 'Iphone6', 1),
(3, 'Iphone7', 1),
(4, 'Lattop', 0),
(5, 'dell1', 4),
(6, 'DELL 2', 4),
(7, 'Ti Vi', 0),
(8, 'ti vi sony', 7);

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE IF NOT EXISTS `hoadon` (
`ma_hoa_don` int(11) NOT NULL,
  `ma_tai_khoan` int(11) NOT NULL,
  `dia_chi_giao_hang` varchar(255) NOT NULL,
  `phuong_thuc_thanh_toan` varchar(255) NOT NULL,
  `ngay_mua_hang` datetime NOT NULL,
  `tinh_trang_don_hang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE IF NOT EXISTS `taikhoan` (
`ma_tai_khoan` int(11) NOT NULL,
  `ten_tai_khoan` varchar(25) NOT NULL,
  `ten_dang_nhap` varchar(25) NOT NULL,
  `mat_khau` varchar(255) NOT NULL,
  `quyen_truy_cap` int(11) NOT NULL,
  `tinh_trang` bit(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`ma_tai_khoan`, `ten_tai_khoan`, `ten_dang_nhap`, `mat_khau`, `quyen_truy_cap`, `tinh_trang`) VALUES
(2, 'Trần Ngọc Tuấn', 'faker2kvip@gmail.com', '81dc9bdb52d04dc20036dbd8313ed055', 1, b'1'),
(3, 'Ngọc Tuấn', 'admin@gmail.com', '202cb962ac59075b964b07152d234b70', 1, b'1'),
(5, 'Mỹ Linh', 'linhlinh@gmail.com', 'c4ca4238a0b92382dcc509a6f75849b', 1, b'1'),
(8, 'Tuấn Trần', 'anhtuan@gmail.com', 'c4ca4238a0b92382dcc509a6f75849b', 1, b'1'),
(9, 'hhy', 'tuan@gmail.com', 'c4ca4238a0b92382dcc509a6f75849b', 0, b'0'),
(10, 'Tuấn Trần', 'anhtuan1@gmail.com', 'c4ca4238a0b92382dcc509a6f75849b', 0, b'0');

-- --------------------------------------------------------

--
-- Table structure for table `tblsanpham`
--

CREATE TABLE IF NOT EXISTS `tblsanpham` (
  `ma_san_pham` varchar(20) NOT NULL,
  `ma_danh_muc` varchar(20) NOT NULL,
  `ten_san_pham` varchar(255) NOT NULL,
  `hinh_anh` varchar(255) NOT NULL,
  `so_luong` int(11) NOT NULL,
  `mo_ta` longtext NOT NULL,
  `don_gia` double NOT NULL,
  `giam_gia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblsanpham`
--

INSERT INTO `tblsanpham` (`ma_san_pham`, `ma_danh_muc`, `ten_san_pham`, `hinh_anh`, `so_luong`, `mo_ta`, `don_gia`, `giam_gia`) VALUES
('1', '2', 'du', 'product6.jpg', 12, 'cd', 12, 5),
('10', '5', 'de', 'product2.jpg', 6, 'edccc', 203, 20),
('11', '8', 'tivisony 29ing', 'product5.jpg', 6, 'đệp chất lượng', 20, 5),
('13', '8', 'tivisony 29ing', 'product5.jpg', 6, 'đệp chất lượng', 20, 5),
('14', '7', 'tivisony 29ing', 'product5.jpg', 6, 'đệp chất lượng', 20, 5),
('15', '7', 'tivisony 29ing', 'product5.jpg', 6, 'đệp chất lượng', 20, 5),
('16', '7', 'tivisony 29ing', 'product5.jpg', 6, 'đệp chất lượng', 20, 5),
('17', '7', 'tivisony 29ing', 'product5.jpg', 6, 'đệp chất lượng', 20, 5),
('18', '7', 'tivisony 29ing', 'product5.jpg', 6, 'đệp chất lượng', 20, 5),
('2', '5', 'Máy tính dell45', 'product5.jpg', 6, 'cdgnn', 30, 10),
('3', '7', 'tivisony 29ing', 'product5.jpg', 6, 'đệp chất lượng', 20, 5),
('4', '7', 'tivisony 29ing', 'product5.jpg', 6, 'đệp chất lượng', 20, 5),
('5', '7', 'tivisony 29ing', 'product5.jpg', 6, 'đệp chất lượng', 20, 5),
('6', '7', 'tivisony 29ing', 'product5.jpg', 6, 'đệp chất lượng', 20, 5),
('7', '7', 'tivisony 29ing', 'product5.jpg', 6, 'đệp chất lượng', 20, 5),
('8', '8', 'tivisony 29ing', 'product5.jpg', 6, 'đệp chất lượng', 20, 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chi_tiet_hoa_don`
--
ALTER TABLE `chi_tiet_hoa_don`
 ADD PRIMARY KEY (`ma_chi_tiet_hoa_don`);

--
-- Indexes for table `danhmuc`
--
ALTER TABLE `danhmuc`
 ADD PRIMARY KEY (`ma_danh_muc`), ADD KEY `ten_danh_muc` (`ten_danh_muc`(191),`danh_muc_cha`,`ma_danh_muc`), ADD KEY `ma_danh_muc` (`ma_danh_muc`);

--
-- Indexes for table `hoadon`
--
ALTER TABLE `hoadon`
 ADD PRIMARY KEY (`ma_hoa_don`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
 ADD PRIMARY KEY (`ma_tai_khoan`), ADD KEY `ma_tai_khoan` (`ma_tai_khoan`), ADD KEY `ma_tai_khoan_2` (`ma_tai_khoan`), ADD KEY `ma_tai_khoan_3` (`ma_tai_khoan`);

--
-- Indexes for table `tblsanpham`
--
ALTER TABLE `tblsanpham`
 ADD PRIMARY KEY (`ma_san_pham`), ADD KEY `ma_danh_muc` (`ma_danh_muc`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chi_tiet_hoa_don`
--
ALTER TABLE `chi_tiet_hoa_don`
MODIFY `ma_chi_tiet_hoa_don` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT for table `danhmuc`
--
ALTER TABLE `danhmuc`
MODIFY `ma_danh_muc` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `hoadon`
--
ALTER TABLE `hoadon`
MODIFY `ma_hoa_don` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `taikhoan`
--
ALTER TABLE `taikhoan`
MODIFY `ma_tai_khoan` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
