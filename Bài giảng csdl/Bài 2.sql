--Lesson 2
/* Các bước xâu dựng cơ sở dữ liệu
1.Các bước thiết kế CSDL quan hệ:
* Thiết kế CSDL mức khái niệm:
- Là sự trừu tượng hóa của thế giới thực
- Trong DBMS sơ đồ thực thể-liên kết(ERD)được mô tả lược đồ CSDL mức khái niệm:
+ Các thành phần cơ bản: Thực thể, thuộc tính, mối quan hệ, quy tắc nghiệp vụ, dữ liệu giao nhau
*Thiết kế CSDL mức logic: 
-Là quá trình chuyển CSDL mức khái niệm sang mô hình lược đồ quan hệ và chuẩn đoán các quan hệ
* Thiết kế CSDL mức vật lí:
- CSDL vật lí là sự cài đặt cụ thể của CSDL mức khái niệm
- CSDL vật lí bao gồm: bảng và mối quan hệ(relationship) giữa các bảng này
- Một bộ dữ liệu được biểu diễn là 1 hàng
2.Thuộc tính thực thể
* Thực thể:
- là một đối tượng, địa điểm, con người trong thế giới thực được lưu trữ thông tin trong CSDL
- Mỗi thực thể được biểu diễn bằng 1 bảng
*THuộc tính
- là những đặc tính riêng biệt của tập thực thể
- Là tính chất của thực thể cần được quản lý
-Chi quan tâm đến tính chất có liên quan đến ứng dụng
- Thuộc tính của thực thể khi chuyển qua lược đồ quan hệ sẽ trở thành 1 cột trong bảng
3. Mối quan hệ
- Quan hệ là sự liên kết giữa 2 hay nhiều tập thực thể
- Có 4 loại quan hệ: 1-1;1-n;n-1;n-n
- Giữa 2 tập thực thể có thể có nhiều hơn 1 quan hệ
- Phân loại:
+, Quan hệ 1-1: Là quan hệ giữa 2 tập thực thể trong dó mỗi thực thể tập này chỉ có liên kết với nhiều nhất với 1 thực thể tập kia là ngược lại  
+, Quan hệ 1-n: là quan hệ giữa 2 tập thực thể trong đó mỗi thực thể tập này quan hệ với nhiều thực thể tập còn lại
+, Quan hệ n-n: một thực thể tập có thể liên kết với 0,1 hoặc nhiều thực thể tập kia và ngược lại
4. Quy tắc nghiệp vụ
- Là các thủ tục hay các chuẩn phải tham gia
- Các quy tắc này thể hiện trong CSDL là các ràng buộc(constraint)
Ví dụ: 
- điểm của môn học phải làm trong khoảng 0 đến 10
- Số điện thoại phải chứa các ký tự số bắt đầu bằng số 0
-Tuổi của nhân viên phải >=18.
5. Kiểu dữ liệu và khóa
* Kiểu dữ liệu
- Là kiểu dữ liệu của một cột trong một bảng dữ liệu như dạng số, ký tự, ngày tháng năm, giờ phút giây
*Khóa
- Khóa chính:
+ Thuộc tính được xác định duy nhất một bộ dữ liệu trong quan hệ
+ Cách tạo khóa chính: 
	"Constraint PK tenbang primary key (tentruong)"
- Khóa ngoại: 
+ là cột mà nó là khóa chính của một cột khác
+ Cách tạo khóa chính:
	"Constraint FK_bang1_bang2 foreign key(tentruong) references tenbang"
6. Các khái niệm mục vật lý: 
* Ràng buộc toàn vẹn:
- Not null: bắt buộc phải nhập dữ liệu
- Check: Kiểm tra dữ liệu nhập vào
***Tạo database: Create Database ten CSDL
****Tạo bảng:
- Kiểm tra sự tồn tại của bảng: IF Object_ID(table_name)is not null
- Drop Table tenbang
- Go
- Create Table tenbang
(tentruong1 kieuDL,)
(tentruong2 kieuDL,)
(PK or FK)
*/