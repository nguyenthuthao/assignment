/*
1.Câu lệnh Insert:
- Chèn DL
- Cú pháp:
+, Cách 1: Insert Into tenbang(cot 1,cot 2)
				Values(giatri 1,giatri 2)
+, Cách 2: Insert Into tenbang values (gia tri cac cot cua bang)
2. Câu lệnh Delete
- Xóa DL trong bảng
- Cú pháp: 
	Delete from tenbang
3.Mô hình ERD:
*
- Khi gặp các bất thường như thêm, sửa, xóa, cập nhật dữ liệu
- Mục đích của việc chuẩn hóa: loại bỏ các bất thường của một quan hệ để có được các quan hệ có cấu trúc tốt hơn, nhỏ hơn.
* Quá trình thiết kế CSDL
- Ý tưởng--> Thiết kế ERD--> LƯợc đồ quan hệ--> HQT CSDL
- Các cách tiếp cận CSDL:
+, Tiếp cận từ trên xuống
+, Tiếp cận từ dưới lên
* Khái niệm thực thể, thuộc tính, quan hệ:
- Thuộc tính là những đặc tính riêng biệt của tập thực thể
+, Thuộc tính đơn: không thể tách nhỏ ra được. Ví dụ:tên, năm sinh...
+, Thuộc tính kết hợp: có thể  tách nhiều thuộc tính nhỏ hơn.
+, Thuộc tính đơn trị: có giá trị duy nhất của một thực thể. Ví dụ: số CMT; mã SV; mã NV...
+, Thuộc tính đa trị: có nhiều giá trị khác nhau ở cùng một thực thể. Ví dụ: số điện thoại...
+, Thuộc tính suy diễn: giá trị của nó được suy diễn từ thuộc tính khác(không bao giờ tồn tại trong thực thể chỉ xuát hiện khi tính hoặc suy diễn nos!)
- Thuộc tính khóa:
++,Khóa ngoại:
+. Có thể chứa giá trị Null
+. Một cột trong bảng mà nó có quan hệ với một bảng khác ở đó cột quan hệ là cột khóa chính
+. Mỗi bảng có thể có nhiều khoá ngoại
4. Lược đồ ERD
- Hình thoi: mối quan hệ
- Các thực thể: hình chữ nhật
- Các thuộc tính: hình ovan
5. Các dạng chuẩn
* Dạng chuẩn 1NF:
- Loại bỏ thuộc tính lặp và đa trị
_ Ví dụ: PHONGBAN(mapb; tenpb; diadiem-thuộc tính đa trị--> vậy phải tách địa điểm ra một thực thể đặt tên trụ sở)
====>sửa đúng: PHONGBAN(mapb; tenpb; matruso)
* Dạng chuẩn 2NF:
- Loại bỏ phụ thuộc hàm
- Một bảng đạt chuẩn 2NF khi thỏa mãn 1NF và phụ thuộc hàm đầy đủ vào khóa chính
* Dạng chuẩn 3NF:
- Đạt chuẩn 2NF
- Không phụ thuộc bắc cầu vào khóa chính