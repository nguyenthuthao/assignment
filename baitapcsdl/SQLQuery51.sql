﻿------KHACHHANG
--KIEMTRA
USE QLBH
IF OBJECT_ID('KHACHHANG') IS NOT NULL
DROP TABLE KHACHHANG 
GO
CREATE TABLE KHACHHANG
(
 MAKH NVARCHAR(10) NOT NULL,
 HOTEN NVARCHAR(50) NULL,
 DIACHI NVARCHAR(100) NULL,
 EMAIL NVARCHAR(100) NULL,
 DIENTHOAI NVARCHAR(50)NULL,
 --KHOA CHINH
 CONSTRAINT PK_KHACHHANG PRIMARY KEY(MAKH)
)

------SANPHAM
--KIEMTRA
IF OBJECT_ID('SANPHAM') IS NOT NULL
DROP TABLE SANPHAM
GO
CREATE TABLE SANPHAM
(
 MASP NVARCHAR(10) NOT NULL,
 MOTA NVARCHAR(50) NULL,
 GIA MONEY,
 SOLUONG INT,
 TENSANPHAM NVARCHAR(20)NULL,
 --KHOA CHINH
 CONSTRAINT PK_SANPHAM PRIMARY KEY(MASP)
)

------HOADON
--KIEMTRA
IF OBJECT_ID('HOADON') IS NOT NULL
DROP TABLE HOADON
GO
CREATE TABLE HOADON
(
 MAHD NVARCHAR(10) NOT NULL,
 NGAYMUA DATE,
 MAKH NVARCHAR(10),
 TRANGTHAI NVARCHAR(50),
 --KHOA CHINH
 CONSTRAINT PK_HOADON PRIMARY KEY(MAHD),
 CONSTRAINT FK_HOADON_KHACHHANG FOREIGN KEY (MAKH) REFERENCES KHACHHANG
)


------HOADONCHITIET
--KIEMTRA
IF OBJECT_ID('HOADONCHITIET') IS NOT NULL
DROP TABLE HOADONCHITIET
GO
CREATE TABLE HOADONCHITIET
(
 MAHD NVARCHAR(10) NOT NULL,
 MASP NVARCHAR (10) NOT NULL,
 SOLUONGBAN INT,
 TRANGTHAI NVARCHAR(50),
 CONSTRAINT FK_HOADONCHITIET_HOADON FOREIGN KEY (MAHD) REFERENCES HOADON,
 CONSTRAINT FK_HOADONCHITIET_SANPHAM FOREIGN KEY (MASP) REFERENCES SANPHAM,
 CONSTRAINT PK_HOADONCHITIET PRIMARY KEY (MASP,MAHD),
)
--NHẬP DỮ LIỆU VÀO BẢNG
DELETE FROM HOADONCHITIET
GO
DELETE FROM SANPHAM
GO
DELETE FROM HOADON
GO
DELETE FROM KHACHHANG
GO
INSERT INTO KHACHHANG(MAKH,HOTEN,DIACHI,EMAIL,DIENTHOAI) 
VALUES (N'PH01',N'NGUYỄN THU THẢO',N'PHÚ MINH-PHÚC LÝ-MINH KHAI-BẮC TỪ LIÊM-HÀ NỘI',N'THAONTPH06790@FPT.EDU.VN','01673502523')
GO
INSERT INTO KHACHHANG(MAKH,HOTEN,DIACHI,EMAIL,DIENTHOAI) 
VALUES (N'PH02',N'TRẦN VĂN MINH',N'LA KHÊ-HÀ ĐÔNG-HÀ NỘI',N'MINHTV2409@GMAIL.COM','01699860112')
GO
INSERT INTO KHACHHANG(MAKH,HOTEN,DIACHI,EMAIL,DIENTHOAI) 
VALUES (N'PH03',N'LÊ THỊ HUYỀN',N'VĂN TRÌ-MINH KHAI-BẮC TỪ LIÊM-HÀ NỘI',N'HUYENLT2401@GMAIL.COM','01642543440')
GO
INSERT INTO KHACHHANG(MAKH,HOTEN,DIACHI,EMAIL,DIENTHOAI) 
VALUES (N'PH04',N'NGUYỄN THỌ VŨ',N'PHÚ ĐÔ-MỸ ĐÌNH-HÀ NỘI',N'VUNT1909@GMAIL.COM','0988606689')
GO
INSERT INTO KHACHHANG(MAKH,HOTEN,DIACHI,EMAIL,DIENTHOAI) 
VALUES (N'PH05',N'PHẠM CHI MAI',N'CIPUTRA-TÂY HỒ-HÀ NỘI',N'MAIPC2907@GMAIL.COM','0973657350')
GO 
INSERT INTO SANPHAM(MASP,TENSANPHAM,MOTA,GIA,SOLUONG) VALUES (N'DG1',N'BÀN LÀM VIỆC',N'RỘNG 1M2-MÀU XÁM',1050000,100)
GO
INSERT INTO SANPHAM(MASP,TENSANPHAM,MOTA,GIA,SOLUONG) VALUES (N'DG2',N'GHẾ GIÁM ĐỐC',N'MÀU ĐEN',3500000,10)
GO
INSERT INTO SANPHAM(MASP,TENSANPHAM,MOTA,GIA,SOLUONG) VALUES (N'DG3',N'BÀN GẤP',N'MÀU VÀNG',600000,50)
GO
INSERT INTO SANPHAM(MASP,TENSANPHAM,MOTA,GIA,SOLUONG) VALUES (N'DG4',N'BÀN TRANG ĐIỂM',N'MÀU TRẮNG',5000000,30)
GO
INSERT INTO SANPHAM(MASP,TENSANPHAM,MOTA,GIA,SOLUONG) VALUES (N'DG5',N'BÀN LÀM VIỆC KIỂU L',N'RỘNG 1M2-MÀU ĐEN',7800000,50)
GO
INSERT INTO HOADON(MAHD,MAKH,NGAYMUA,TRANGTHAI) VALUES (N'HD01',N'PH01',N'2018-09-29',N'ĐÃ THANH TOÁN')
GO
INSERT INTO HOADON(MAHD,MAKH,NGAYMUA,TRANGTHAI) VALUES (N'HD02',N'PH02',N'2018-07-18',N'ĐÃ THANH TOÁN')
GO
INSERT INTO HOADON(MAHD,MAKH,NGAYMUA,TRANGTHAI) VALUES (N'HD03',N'PH03',N'2018-06-06',N'ĐÃ THANH TOÁN')
GO
INSERT INTO HOADON(MAHD,MAKH,NGAYMUA,TRANGTHAI) VALUES (N'HD04',N'PH04',N'2018-01-24',N'ĐÃ THANH TOÁN')
GO
INSERT INTO HOADON(MAHD,MAKH,NGAYMUA,TRANGTHAI) VALUES (N'HD05',N'PH05',N'2018-10-17',N'ĐÃ THANH TOÁN')
GO
INSERT INTO HOADONCHITIET(MAHD,MASP,SOLUONGBAN,TRANGTHAI) VALUES (N'HD01',N'SP01',10,N'ĐÃ THANH TOÁN')
GO
INSERT INTO HOADONCHITIET(MAHD,MASP,SOLUONGBAN,TRANGTHAI) VALUES (N'HD02',N'SP02',1,N'ĐÃ THANH TOÁN')
GO
INSERT INTO HOADONCHITIET(MAHD,MASP,SOLUONGBAN,TRANGTHAI) VALUES (N'HD03',N'SP03',2,N'ĐÃ THANH TOÁN')
GO
INSERT INTO HOADONCHITIET(MAHD,MASP,SOLUONGBAN,TRANGTHAI) VALUES (N'HD04',N'SP04',5,N'ĐÃ THANH TOÁN')
GO
INSERT INTO HOADONCHITIET(MAHD,MASP,SOLUONGBAN,TRANGTHAI) VALUES (N'HD05',N'SP05',1,N'ĐÃ THANH TOÁN')
SELECT * FROM KHACHHANG
SELECT * FROM SANPHAM
SELECT * FROM HOADON
SELECT * FROM HOADONCHITIET


-----a
SELECT * FROM KHACHHANG
-----b
SELECT MAKH,HOTEN,EMAIL,DIENTHOAI
FROM KHACHHANG
-----c
SELECT MASP,TENSANPHAM,TONGTIENTONKHO AS GIA * SOLUONG
FROM SANPHAM

-----d



-----e


-----f



-----g
SELECT * FROM HOADON
WHERE TRANGTHAI LIKE 'CH%' AND YEAR(NGAYMUA)=2017

-----h
SELECT * FROM HOADON
WHERE MAKH = 'PH01' OR MAKH = 'PH02' OR MAKH = 'PH03'

-----BAI2
--a
SELECT COUNT (*) AS TONGSOKH FROM KHACHHANG
---B
SELECT MAX (DONGGIA) FROM SANPHAM
---C
SELECT MIN (SLTON) FROM SANPHAM
---D 
SELECT SUM(SLTON) FROM SANPHAM
---E
SELECT * FROM HOADON
WHERE MONTH (NGAYMUA) = 11 AND YEAR(NGAYMUA)=2017 AND TRANGTHAI LIKE 'CH%'
----F
SELECT MAHD, MASP, COUNT(MASP) FROM HOADONCHITIET
GROUP BY MAHD,MASP
----G
SELECT MAHD, MASP, COUNT(MASP) FROM HOADONCHITIET
GROUP BY MAHD
HAVING COUNT (MASP)>=2
---H
 SELECT MAHD,NGAYMUA,MAKH
 FROM HOADON
 ORDER BY NGAYMUA DESC