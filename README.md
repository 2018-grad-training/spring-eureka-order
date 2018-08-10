# spring-eureka-product

### 添加步骤

1. 增加依赖

   ```groovy
   # build.gradle
   
   ...
   compile('org.springframework.cloud:spring-cloud-starter-netflix-eureka-client')
   compile('org.springframework.cloud:spring-cloud-starter-openfeign')
   ...
   ```

   

2. 配置项

   ```yaml
   # application.yml
   server:
     port: 8081
   spring:
     application:
       name: order-service
   eureka:
     client:
       serviceUrl:
         defaultZone: http://localhost:8761/eureka/
   ```

   

3. 增加注解

   ```java
   // Application.java
   
   @EnableEurekaClient
   @EnableFeignClients
   ...
   ```

4. 其他业务逻辑