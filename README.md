# springcloud

-------------------

## 1.rest工程搭建

1.创建父类project springcloud

2.创建子类module 公共api
2.1创建 Dept文件 执行maven clean maven install

3.创建子类module 部门服务provider

4.创建子类module 部门服务consumer

#Eureka注册中心搭建

1.创建注册中心server端，创建完成后 启动项目
页面访问localhost：7001

2.修改部门服务provider 将其作为注册中心client端，
先启动Eureka7001 再启动provider8001 页面访问localhost：7001 可以发现provider注册到服务中心

3.主机名称:服务名称修改
修改yml文件添加instance-id 
先启动Eureka7001 再启动provider8001 页面访问localhost：7001 可以发现provider的服务名称被修改

4.

