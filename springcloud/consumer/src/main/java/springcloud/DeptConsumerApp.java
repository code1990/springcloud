package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
/*引入 Ribbon相关*/
@EnableEurekaClient
public class DeptConsumerApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumerApp.class, args);
	}
}
