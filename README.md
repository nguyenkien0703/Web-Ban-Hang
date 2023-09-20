# Web-Ban-Hang


Trang web bán hàng thực phẩm


## Công nghệ sử dụng

**Server:** Springboot, mysql


## Cài đặt
### Cài đặt backend
#### Yêu cầu môi trường
Môi trường yêu cầu để chạy backend:

* Java >= 11
* mysql:5.7

Chạy springboot

```bash
  mvn spring-boot:run
```

## Cấu trúc thư mục

```
|  
|   README.md
|  
|   
|           
+---backend  
|   +---.mvn
|   |   \---wrapper
|   |           maven-wrapper.jar
|   |           maven-wrapper.properties
|   \---src
|       \---main
|           +---java
|           |   \---com
|           |       \---app
|           |           \---my_app
|           |               |   MyAppApplication.java
|           |               |   
|           |               +---config
|           |               |   |   AppConfig.java
|           |               |   |   DomainConfig.java
|           |               |   |   ModelMapperConfig.java
|           |               |   |   OpenAPI30Configuration.java
|           |               |   |   WebConfig.java
|           |               |   |   WebSecurityConfig.java
|           |               |   |   
|           |               |   \---jwt
|           |               |           JwtAuthenticationEntryPoint.java
|           |               |           JwtRequestFilter.java
|           |               |           JwtTokenUtil.java
|           |               |           
|           |               +---domain
|           |               |       CartItem.java
|           |               |       Category.java
|           |               |       Order.java
|           |               |       OrderItem.java
|           |               |       OrderStatus.java
|           |               |       Product.java
|           |               |       User.java
|           |               |       
|           |               +---model
|           |               |       CartItemDTO.java
|           |               |       CategoryDTO.java
|           |               |       JwtRequest.java
|           |               |       JwtResponse.java
|           |               |       OrderDTO.java
|           |               |       OrderItemDTO.java
|           |               |       OrderStatusDTO.java
|           |               |       ProductDTO.java
|           |               |       UserDetailsImpl.java
|           |               |       UserDTO.java
|           |               |       
|           |               +---repos
|           |               |       CartItemRepository.java
|           |               |       CategoryRepository.java
|           |               |       OrderItemRepository.java
|           |               |       OrderRepository.java
|           |               |       OrderStatusRepository.java
|           |               |       ProductRepository.java
|           |               |       UserRepository.java
|           |               |       
|           |               +---rest
|           |               |       AuthResource.java
|           |               |       CartItemResource.java
|           |               |       CategoryResource.java
|           |               |       OrderItemResource.java
|           |               |       OrderResource.java
|           |               |       OrderStatusResource.java
|           |               |       ProductResource.java
|           |               |       UserResource.java
|           |               |       
|           |               \---service
|           |                       AuthService.java
|           |                       CartItemService.java
|           |                       CategoryService.java
|           |                       OrderItemService.java
|           |                       OrderService.java
|           |                       OrderStatusService.java
|           |                       ProductService.java
|           |                       UserService.java
|           |                       
|           \---resources
|               |   application.properties

|           
\---seed
        product.sql
        

```

#### Thư mục backend chưa code springboot


**config** Chứa các cấu hình cho springboot

**domain** Chứa các lơp dùng để định nghia các đối tượng tương ứng với các bảng trong sql

**model** Chứa các lớp dùng để trao đổi dữ liệu như DTO

**repos** Dùng định nghĩa các hàm thao tác với csdl

**rest** Định nghĩa các restAPI

**service** Định nghĩa các service

**resources** Định nghia resources

**application.properties** Chứa các thuộc tính cấu hình cho springboot

```




