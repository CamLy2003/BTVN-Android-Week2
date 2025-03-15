# BTVN-Android-Week2
Group 5: Cẩm Ly - Duy Mạnh

Ứng dụng Máy Tính Đơn Giản

Giới thiệu
Ứng dụng Android cho phép người dùng nhập hai số và thực hiện các phép tính cơ bản:
➕ Cộng
➖ Trừ
✖️ Nhân
➗ Chia

Ứng dụng sử dụng Intent và Bundle để truyền dữ liệu giữa hai Activity.
- Cách hoạt động:
1. Người dùng nhập hai số vào MainActivity.
2. Nhấn nút Submit, dữ liệu sẽ được gửi sang Second_Activity.
3. Tại Second_Activity, người dùng có thể thực hiện các phép tính.
4. Kết quả hiển thị trên màn hình.
5. Nhấn Back để quay lại màn hình chính.

🔹 Giao diện nhập số (MainActivity)
![image](https://github.com/user-attachments/assets/9c050ecb-6722-488d-ba0f-312101212a38)


🔹 Giao diện thực hiện phép tính (Second_Activity)
![image](https://github.com/user-attachments/assets/70de67f6-62fe-4926-a06a-4be215614da5)

- Cấu trúc code chính:
  
📂 MainActivity.java
1. Nhận dữ liệu từ người dùng:
2. Tạo Intent để gửi dữ liệu sang Second_Activity
  
📂 Second_Activity.java
1. Nhận dữ liệu từ MainActivity
2. Thực hiện các phép tính (Cộng, Trừ, Nhân, Chia)
3. Hiển thị kết quả
