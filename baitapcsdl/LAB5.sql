/* Bài 5: Ngôn ngữ SQL
1. Ngôn ngữ SQL
- Có thể chia làm 4 nhóm lệnh:
+, DQL: select
+, DDL: Create, Drop, ALter
+, DML: Insert, Delete, Update
+, DCL: Grant, Revoke
2. Lệnh Alter table:
- Thêm ràng buộc kiểm tra- Check
ALTER TABLE NHANVIEN
ADD CONSTRAINT CHK_SALARY_MIN
CHECK(SALARY>=100)
- Thêm ràng buộc khóa chính - Primary Key
ALTER TABLE NHANVIEN
ADD CONSTRAINT PRI_NHANVIEN PRIMARY KEY (ID_NHANVIEN)
3. Câu lệnh update:
- Cập nhật lại dữ liệu trong bảng
- Cú pháp: 
UPDATE tên bảng
SET tên cột = giá trị
[WHERE điều kiện]
4. Câu lệnh SELECT: 
- Cú pháp: 
SELECT [DISTINCT] tencot
FROM tenbang
[WHERE DK]
----CHÚ Ý: distinct có thể là các giá trị:
+, ALL: trả về mọi bản ghi tìm thấy
+, DISTINCT : trả về các bản ghi không trùng lặp nhau
+, TOP: trả về n (hay %) bản ghi tìm thấy từ trên xuống
VÍ DỤ: SELECT DISTINCT (mệnh đề trả về các bản ghi không trùng lặp nhau)
5. Câu lệnh select đơn giản: 
* Truy vấn chịn tất cả các hàng và cột
SELECT * FROM TENBANG
* Truy vấn lựa chọn một số cột: 
SELECT COT1,COT2...
FROM TENBANG
6. Mệnh đề WHERE
* Công dụng: 
- Các điều kiện truy vấn theo cột
- Cho phép sắp xếp dữ liệu theo hàng
* Cú pháp
SELECT [DISTINCT] TENCOT
FROM TENBANG
[WHERE DK]
* Chú ý: 
- Toán tử like: dùng để thực hiệ pjeps so sanh dành cho kiểu chuỗi ký tự
- Đại diện 1 ký tự: _
- Đại diện 1 xâu ký tự: %
Between .... and .... : lấy giá trị trong khoảng và cận 2 đầu

VÍ DỤ: 
1. Lấy dữ liêu tất cả các cột trong bảng Persons có giá trị cột fristname là Petter and lastname là Jackson
SELECT * FROM PERSONS
WHERE FIRSTNAME ='PETER' AND LASTNAME = 'JACKSON'
2. Lấy tất cả DL trong bảng Persons có giá trị Firstname là Petter
SELECT * FROM PERSONS
WHERE FIRSTNAME ='PETER'
3. Lấy tất cả các item có item_desc chứa chuỗi 'CHOCO' ở đầu chuỗi và các ký tự sau chứ gì cũng được
SELECT * FROM TENBANG
WHERE ITEM_DESC LIKE 'CHOCO%'
4. Lấy các hàng từ bảng Contest chỉ lấy hàng thỏa mnax dk giá trị ở cột COntestdate >='05/25/2006'
SELECT * FROM CONTEST
WHERE CONTESTDATE >='05/25/2006'
5.Hiển thị tất cả DL trong bảng Sale với ngày trong khoảng từ '10/12/2005' đến '01/01/2006'
SELECT * FROM SALES
WHERE DATE BETWEEN '01/01/2005' AND '01/01/2006'


7. Các hàm tổng hợp:
-Max(tencot)
-Min(tencot)
-Avg(tencot)
- Count(tencot)
VÍ DỤ: 
- Tìm mức lương cao nhất của các nhân viên
SELECT MAX(SALARY)
FROM EMPLOYEES
- Hiển thị mức lương cao nhất và thấp nhất của bảng nhân viên
SELECT MIN(SALARY),MAX(SALARY)
FROM EMPLOYEES
- Đếm số lương nhân viên
SELECT COUNT(*)--->COUNT (*): ĐẠI DIỆN CHO CÁC CỘT
FROM EMPLOYEES
- LẤY tổng giá trị của cột price trong bảng sale
SELECT SUM(PRICE)
FROM SALES
8. Mệnh đề Group by: 
- Nhóm các hàng DL có giạ trị giống nhau thành 1 nhóm
- Các tính toán(thường sử dụng các hàm tổng hơp)sẽ được tính trên nhóm
VD: Tìm mức lương CN của các nhân viên của từng bộ phận
SELECT DEPARTMENT_ID,MAX(SALARY)
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
9. Mệnh đề Having
-Đi kèm với mệnh đề Group by
-Đê loại bỏ các nhóm không thỏa mãn đk
10. Mệnh đề Order by: 
-DÙng để sắp xếp dữ liệu
-Cúc pháp: 
SELECT 
FROM
ORDER BY TENCOT[ASC/DESC]
* CHÚ Ý: 
- ASC: sắp xếp tăng dần
- DESC: sắp xếp giảm dần
