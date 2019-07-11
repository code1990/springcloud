# springcloud

-------------------

## 1.rest工程搭建

1.创建父类project springcloud

2.创建子类module 公共api
2.1创建 Dept文件 执行maven clean maven install

3.创建子类module 部门服务provider

4.创建子类module 部门服务consumer

## 2.Eureka注册中心搭建

1.创建注册中心server端，创建完成后 启动项目
页面访问localhost：7001

2.修改部门服务provider 将其作为注册中心client端，
先启动Eureka7001 再启动provider8001 页面访问localhost：7001 可以发现provider注册到服务中心

--------------------------------
3.主机名称:服务名称修改
修改yml文件添加instance-id 
先启动Eureka7001 再启动provider8001 页面访问localhost：7001 可以发现provider的服务名称被修改

4.访问信息有IP信息提示
修改yml文件添加prefer-ip-address: true   
先启动Eureka7001 再启动provider8001 页面访问localhost：7001 可以发现provider的服务可以显示ip信息

5.微服务info内容详细信息配置
修改provider的pom.xml添加actuator监控信息完善 
修改总父类工程可以编译$
修改provider的yml 添加配置info配置信息
先编译总的父类项目**否则显示为字符串没有编译上**
再启动Eureka7001 再启动provider8001 页面访问localhost：7001 可以查看provider的服务描述信息被修改

---------------------------------------

6.搭建Eureka集群 分别创建7002 7003
7001的pom.xml文件 修改atrifactId 
复制yml 修改server端口
修改provider的访问集群的URL
修改主启动类为7002 7003
修改hosts的
127.0.0.1  eureka7001.com
127.0.0.1  eureka7002.com
127.0.0.1  eureka7003.com

分别启动7001 7002 7003 
再启动provider 页面分别访问7001 7002 7003

-----------------------

## Ribbon客户端负载均衡

1修改Consumer客户端pomxml添加ribbon支持
2.修改Consumer客户端yml添加ribbon支持
3.添加@loadbalanced注解 开启支持
4.主启动类添加@EnableEurekaClient

分别启动7001 7002 7003 注册中心集群
启动provider注册到eureka
启动consumer消费服务

----------------------------

客户端负载均衡访问服务provider集群

复制provider项目分别设置为provider8002，provider8003

创建不同的库clouddb02,clouddb03

修改各自的端口号为8002，服务名称8002，数据库clouddb02

首先启动eureka7001，eureka7002，eureka7003
再启动provider8001，provider8002，provider8003
页面测试
启动consumer
页面测试

---------------------------

8002 8003module移动项目时候存在目录结构出现异常 暂时先移除
只要不影响后面的功能点开发

## Feign 基于webserver接口的负载均衡

1.api module层添加interface

2.consumer新增controller 来调用service

3.分别启动Eureka provider consumer

http://localhost:8060/consumer/dept/list 正常访问

表名基于Feign 的webservice服务成功

------------------------






