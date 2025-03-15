# BTVN-Android-Week2
Group 5: Cẩm Ly - Duy Mạnh

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

![image](https://github.com/user-attachments/assets/b51f9695-9aa0-4ea5-b3e5-4ccb013db62e)


🔹 Second_Activity - Hiển thị kết quả

![image](https://github.com/user-attachments/assets/9d90c125-e096-4423-84b8-91f6f63354af)


Cấu trúc code chính:

📂 MainActivity.java
+ Nhận dữ liệu từ người dùng (các giá trị a, b, c).
+ Tạo Intent để gửi dữ liệu sang Second_Activity.
+ Đóng gói dữ liệu bằng Bundle.
+ Gửi dữ liệu và chuyển sang màn hình kết quả.

📂 Second_Activity.java
+ Nhận dữ liệu từ MainActivity.
+ Tính toán nghiệm của phương trình bậc hai:
     + Nếu Delta < 0: Phương trình vô nghiệm.
     + Nếu Delta = 0: Phương trình có nghiệm kép x1 = x2.
     + Nếu Delta > 0: Phương trình có hai nghiệm phân biệt x1, x2.
+ Hiển thị kết quả lên màn hình.Nhấn nút Back để quay lại màn hình nhập liệu.
