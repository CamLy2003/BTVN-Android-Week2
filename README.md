# BTVN-Android-Week2
Group 5: 
1. 21200374 - Mai Thị Cẩm Ly 
2. 21200312 - Nguyễn Đặng Duy Mạnh

Ứng dụng Giải Phương Trình Bậc Hai

Giới thiệu

Ứng dụng Android cho phép người dùng nhập các hệ số của phương trình bậc hai và tính toán nghiệm dựa trên công thức Delta.
Ứng dụng sử dụng Intent và Bundle để truyền dữ liệu giữa hai Activity.

Cách hoạt động:
1. Người dùng nhập các hệ số a, b, c vào MainActivity.
2. Nhấn nút "Submit", dữ liệu sẽ được gửi sang Second_Activity.
3. Tại Second_Activity, ứng dụng sẽ tính toán nghiệm của phương trình bậc hai.
4. Hiển thị kết quả lên màn hình.
5. Nhấn nút "Back" để quay lại màn hình chính.

Giao diện ứng dụng

🔹 MainActivity - Nhập hệ số phương trình

🔹 Second_Activity - Hiển thị kết quả

<div style="display: flex; justify-content: space-around;">
  <img src="https://github.com/user-attachments/assets/b51f9695-9aa0-4ea5-b3e5-4ccb013db62e" alt="MainActivity" width="200"/>
  <img src="https://github.com/user-attachments/assets/9d90c125-e096-4423-84b8-91f6f63354af" alt="SecondActivity" width="200"/>
       <img src="https://github.com/user-attachments/assets/d69e78ca-9604-4218-aa79-780d1fe7f9dc" alt="First Image" width="200"/>
  <img src="https://github.com/user-attachments/assets/cb5a94ee-64c2-4da9-91de-a06ece052eb1" alt="Second Image" width="200"/>
</div>


Cấu trúc code chính:

📂 MainActivity.java
+ Nhận dữ liệu từ người dùng (các giá trị a, b, c).
+ Tạo Intent để gửi dữ liệu sang Second_Activity.
+ Đóng gói dữ liệu bằng Bundle.
+ Gửi dữ liệu và chuyển sang màn hình kết quả.
+ Clear giá trị cũ để nhập giá trị mới

📂 Second_Activity.java
+ Nhận dữ liệu từ MainActivity.
+ Tính toán nghiệm của phương trình bậc hai:
     + Nếu Delta < 0: Phương trình vô nghiệm.
     + Nếu Delta = 0: Phương trình có nghiệm kép x1 = x2.
     + Nếu Delta > 0: Phương trình có hai nghiệm phân biệt x1, x2.
+ Hiển thị kết quả lên màn hình.Nhấn nút Back để quay lại màn hình nhập liệu.
