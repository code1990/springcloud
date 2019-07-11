package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*引入 Ribbon相关*/
@EnableEurekaClient
@EnableFeignClients(basePackages= {"springcloud"})
@ComponentScan("springcloud")
public class DeptConsumerFeignApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumerFeignApp.class, args);
	}
}
