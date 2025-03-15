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
<p align="center">
  <img src="[https://github.com/user-attachments/assets/ccc241a5-217a-40e9-a73b-0ffc9e98354e](https://github.com/user-attachments/assets/ccc241a5-217a-40e9-a73b-0ffc9e98354e)" width="400">
</p>
🔹 Second_Activity - Hiển thị kết quả
<p align="center">
  <img src="[https://github.com/user-attachments/assets/ccc241a5-217a-40e9-a73b-0ffc9e98354e](https://github.com/user-attachments/assets/40791fcb-8a6f-448f-9c3d-e5a7b1dd0d21)" width="400">
</p>

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
