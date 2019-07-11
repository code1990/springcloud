package springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.entities.Dept;
import springcloud.service.DeptClientService;

import java.util.List;

/*
* 测试URL如下
* http://localhost:8080/consumer/dept/get/2
http://localhost:8080/consumer/dept/list
http://localhost:8080/consumer/dept/add?dname=AI
*
* */
@RestController
public class DeptControllerConsumer
{
	@Autowired
	private DeptClientService service;

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id)
	{
		return this.service.get(id);
	}

	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list()
	{
		return this.service.list();
	}

	@RequestMapping(value = "/consumer/dept/add")
	public Object add(Dept dept)
	{
		return this.service.add(dept);
	}
}