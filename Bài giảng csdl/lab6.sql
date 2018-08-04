/* Bài 6: Ngôn ngữ truy vấn dữ liệu trên nhiều bảng
1.SELECT trên nhiều bảng
- kết nối trong: sử dụng mệnh đề WHERE hoặc từ khóa JOINT trong mệnh đề FROM
+, VÍ dụ: hiển thị tên nhân viên và tên phòng ban
--> cách 1: SELECT TENNV,TENPHONGBAN
			FROM NHANVIEN,PHONGBAN
			WHERE NHANVIEN.MAPB = PHONGBAN.MAPB
--> cách 2: SELECT TENNV,TENPHONGBAN
			FROM NHANVIEN JOINT PHONGBAN
			ON NHANVIEN.MAPB = PHONGBAN.MAPB
-kết nối ngoại: 
>>>>> cách 1: SELECT TENNV,TENPHONGBAN
			FROM NHANVIEN LEFT OUTER JOINT PHONGBAN
			ON NHANVIEN.MAPB=PHONGBAN.MAPB