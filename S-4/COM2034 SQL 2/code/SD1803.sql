--1
create database QUANLYNHANSU1
use QUANLYNHANSU1
go
CREATE TABLE PHONGBAN(
    MAPB VARCHAR(100) NOT NULL,
    TENPB VARCHAR(100),

    PRIMARY KEY (MAPB)
)
CREATE TABLE NHANVIEN (
    MANV VARCHAR(100) NOT NULL,
    HOTEN VARCHAR(100),
    GIOITINH VARCHAR(100),
    LUONG FLOAT,
    MAPB VARCHAR(100) NOT NULL,

    PRIMARY KEY (MANV),
    FOREIGN KEY (MAPB) REFERENCES PHONGBAN(MAPB)
)
CREATE TABLE CHAMCONG (
    MACONG VARCHAR(100) NOT NULL,
    MANV VARCHAR(100) NOT NULL,
    THANG INT,
    SONGAYLV INT,
    NGPHEP INT,
    NGKPHEP INT,

    PRIMARY KEY (MACONG),
    FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV)
)
GO
--2
CREATE PROCEDURE INSERTTHONGTIN
AS
BEGIN
END

GO
INSERT INTO PHONGBAN VALUES
('1','Phong ban A'),
('2','Phong ban B'),
('3','Phong ban C')
INSERT INTO NHANVIEN VALUES
('1','Hoang Quy Long','Nam',10000000,'1'),
('2','Nguyen Khanh Minh','Nu',20000000,'2'),
('3','Duong Gia Minh','Nam',30000000,'3')
INSERT INTO CHAMCONG VALUES
('1','1',1,10,1,1),
('2','2',2,20,2,2),
('3','3',3,30,3,3)
GO
SELECT * FROM PHONGBAN
SELECT * FROM NHANVIEN
SELECT * FROM CHAMCONG
GO



--3
CREATE FUNCTION NHAPTHONGTINNHANVIEN (
    @MANV VARCHAR(100),
    @HOTEN VARCHAR(100),
    @GIOITINH VARCHAR(100),
    @LUONG FLOAT,
    @MAPB VARCHAR(100)
    )
RETURNS
    VARCHAR(100)
AS
BEGIN
    INSERT INTO NHANVIEN(@MANV, @HOTEN, @GIOITINH, @LUONG, @MAPB)
    RETURNS MANV
END

EXEC (4,'Ta Quang The Dan','Nam',40000000,1)
EXEC (5,'Pham Ha Anh','Nu',50000000,2)
EXEC (6,'Pham Quynh Trang','Nu',60000000,3)

--4
CREATE VIEW TOP2PHONGBANDONGNHAT
AS
SELECT TOP 2 PB.MAPB, PB.TENPB, COUNT(NV.MANV) AS SOLUONGNHANVIENTRENPHONGBAN
FROM PHONGBAN PB JOIN NHANVIEN NV ON PB.MAPB = NV.MAPB
GROUP BY PB.MAPB, PB.TENPB
ORDER BY SOLUONGNHANVIENTRENPHONGBAN DESC

SELECT * FROM TOP2PHONGBANDONGNHAT

--5
CREATE PROCEDURE XOATHONGTINCHAMCONG
(@NGPHEP INT, @SONGAYQUYDINH INT)
AS
BEGIN
    IF (@NGPHEP > @SONGAYQUYDINH)
    BEGIN
        UPDATE CHAMCONG
        DELETE ROW 
    END
END