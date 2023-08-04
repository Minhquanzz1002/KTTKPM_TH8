# KIẾN TRÚC THIẾT KẾ PHẦN MỀM THỰC HÀNH 8
* Thực hành Decorator design pattern
* Thực hành Adapter design pattern
* Thực hành Facade design pattern
## Decorator
Hệ thống khách sạn gồm nhiều loại phòng: Normal, Corner Suite, Deluxe,...<br>
Ngoài các dịch vụ chung thì các loại phòng còn có các dịch vụ riêng biệt

![decorator](https://github.com/Minhquanzz1002/KTTKPM_TH8/blob/main/demo/decorator-architecture.png)

## Adapter
Hệ thống dịch thuật từ tiếng Việt sang tiếng Nhật<br>
Trong tình huống cả class Vietnamese và Japanese đều không thể thay đổi thì phải tạo Adapter đóng vai trò chuyển đổi giữa 2 ngôn ngữ

![adapter](https://github.com/Minhquanzz1002/KTTKPM_TH8/blob/main/demo/adapter-architecture.png)

## Facade
Khi xây dựng 1 hệ thống bán hàng bằng spring boot. Khi có order sẽ phải get user, thông báo qua email, thông báo đơn vị vận chuyển,...<br>
Mỗi lần có request sẽ phải khỏi tạo nhiều Service và gọi các hàm cần thiết. Thay vì vậy ta tạo ra một lớp Facade gôm các Service cần cho nghiệp vụ đặt hàng lại. Khi có request đặt hàng chỉ cần gọi hàm trong Facade thôi

![facade](https://github.com/Minhquanzz1002/KTTKPM_TH8/blob/main/demo/facade-architecture.png)
