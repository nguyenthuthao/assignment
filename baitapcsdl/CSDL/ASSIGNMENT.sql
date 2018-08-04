-----TACGIA
------KIEMTRA
IF OBJECT_ID('TACGIA') IS NOT NULL
DROP TABLE TACGIA
GO
CREATE TABLE TACGIA
(
MATG VARCHAR(45) NOT NULL,
TENTG NVARCHAR(45) NOT NULL,
QUEQUAN NVARCHAR(45) NOT NULL,
QUOCTICH NVARCHAR(45) NOT NULL,
---KHOACHINH
 CONSTRAINT PK_TACGIA PRIMARY KEY(MATG)
)

-----THELOAI
------KIEMTRA
IF OBJECT_ID('THELOAI') IS NOT NULL
DROP TABLE THELOAI
GO
CREATE TABLE THELOAI
(
MATL VARCHAR(45) NOT NULL,
TENTL NVARCHAR(45) NOT NULL,
---KHOACHINH
 CONSTRAINT PK_THELOAI PRIMARY KEY(MATL)
)

-----NHAXUATBAN
------KIEMTRA
IF OBJECT_ID('NHAXUATBAN') IS NOT NULL
DROP TABLE NHAXUATBAN
GO
CREATE TABLE NHAXUATBAN
(
MANXB VARCHAR(45) NOT NULL,
TENNHAXB NVARCHAR(45) NOT NULL,
DIACHI NVARCHAR(45) NOT NULL,
---KHOACHINH
 CONSTRAINT PK_NHAXUATBAN PRIMARY KEY(MANXB)
)

-----SACH
------KIEMTRA
IF OBJECT_ID('SACH') IS NOT NULL
DROP TABLE SACH
GO
CREATE TABLE SACH
(
MASACH VARCHAR(45) NOT NULL,
TIEUDE NVARCHAR(45) NOT NULL,
SOTRANG INT,
SOLUONGBANSAO INT,
GIA MONEY,
NGAYNHAP DATE,
VITRIDAT NVARCHAR(45) NOT NULL,
MANXB VARCHAR (45) NOT NULL,
MATL VARCHAR (45) NOT NULL,
---KHOACHINH
 CONSTRAINT PK_SACH PRIMARY KEY(MASACH),
 CONSTRAINT FK_SACH_NHAXUATBAN FOREIGN KEY (MANXB) REFERENCES NHAXUATBAN,
 CONSTRAINT FK_SACH_THELOAI FOREIGN KEY (MATL) REFERENCES THELOAI,
)

-----SACH_TACGIA
------KIEMTRA
IF OBJECT_ID('SACH_TACGIA') IS NOT NULL
DROP TABLE SACH_TACGIA
GO
CREATE TABLE SACH_TACGIA
(
MATGS VARCHAR(45) NOT NULL,
MATG VARCHAR(45) NOT NULL,
MASACH VARCHAR(45) NOT NULL,
-----KHOANGOAI
CONSTRAINT FK_SACH_TACGIA_TACGIA FOREIGN KEY (MATG) REFERENCES TACGIA,
CONSTRAINT FK_SACH_TACGIA_SACH FOREIGN KEY (MASACH) REFERENCES SACH,
 CONSTRAINT PK_TACGIASACH PRIMARY KEY(MATGS),
)

-----NGANH
------KIEMTRA
IF OBJECT_ID('NGANH') IS NOT NULL
DROP TABLE NGANH
GO
CREATE TABLE NGANH
(
MANGANH VARCHAR(45) NOT NULL,
TENNGANH NVARCHAR(45) NOT NULL,
MALOP NVARCHAR(45) NOT NULL,
---KHOACHINH
 CONSTRAINT PK_NGANH PRIMARY KEY(MANGANH),
)

-----LOP
------KIEMTRA
IF OBJECT_ID('LOP') IS NOT NULL
DROP TABLE LOP
GO
CREATE TABLE LOP
(
MALOP VARCHAR(45) NOT NULL,
TENLOP NVARCHAR(45) NOT NULL,
MANGANH VARCHAR(45) NOT NULL,
---KHOACHINH
 CONSTRAINT PK_LOP PRIMARY KEY(MALOP),
 CONSTRAINT FK_LOP_NGANH FOREIGN KEY (MANGANH) REFERENCES NGANH
 )

 -----SINHVIEN
------KIEMTRA
IF OBJECT_ID('SINHVIEN') IS NOT NULL
DROP TABLE SINHVIEN
GO
CREATE TABLE SINHVIEN
(
MASV VARCHAR(45) NOT NULL,
MATHESV VARCHAR(45) NOT NULL,
TEN NVARCHAR(45) NOT NULL,
DIACHI NVARCHAR(45) NOT NULL,
EMAIL NVARCHAR(45) NOT NULL,
SODT NVARCHAR(45) NOT NULL,
MANGANH VARCHAR(45) NOT NULL,
---KHOACHINH
 CONSTRAINT PK_SINHVIEN PRIMARY KEY(MASV),
 CONSTRAINT FK_SINHVIEN_NGANH FOREIGN KEY (MANGANH) REFERENCES NGANH
)

-----PHIEUMUON
------KIEMTRA
IF OBJECT_ID('PHIEUMUON') IS NOT NULL
DROP TABLE PHIEUMUON
GO
CREATE TABLE PHIEUMUON
(
MAPM VARCHAR(45) NOT NULL,
NGAYMUON DATE,
MASV VARCHAR(45) NOT NULL,
MANGANH VARCHAR(45) NOT NULL,
---KHOACHINH
 CONSTRAINT PK_PHIEUMUON PRIMARY KEY(MAPM),
 CONSTRAINT FK_PHIEUMUON_NGANH FOREIGN KEY (MANGANH) REFERENCES NGANH,
 CONSTRAINT FK_PHIEUMUON_SINHVIEN FOREIGN KEY (MASV) REFERENCES SINHVIEN
 )

 IF OBJECT_ID('PMCHITIET') IS NOT NULL
DROP TABLE PMCHITIET
GO
CREATE TABLE PMCHITIET
(
MAPM VARCHAR(45) NOT NULL,
MASACH VARCHAR(45) NOT NULL,
MAPMCT VARCHAR(45) NOT NULL,
-----KHOANGOAI
CONSTRAINT FK_PMCHITIET_PHIEUMUON FOREIGN KEY (MAPM) REFERENCES PHIEUMUON,
CONSTRAINT FK_PMCHITIET_SACH FOREIGN KEY (MASACH) REFERENCES SACH,
 CONSTRAINT PK_PMCHITIET PRIMARY KEY(MAPMCT)
)