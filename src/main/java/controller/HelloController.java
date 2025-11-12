package controller;

import java.sql.Connection;
import java.sql.Statement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.DBConnectiom;

@RestController
public class HelloController {
	@RequestMapping("/")
	String hello() {
		return "Web API 已啟用";
	}
	@RequestMapping("/spring_client")
	String DB() {
		//連線訊息
		String DBMassage;
		try {
			Connection conn=DBConnectiom.getConnection();
			DBMassage ="spring_client連線成功!";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			DBMassage ="spring_client連線不成功!";
		}
		return DBMassage;
	}
}
