package entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
@Entity
@Table(name="bookinfo")

//建立實體類別
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;  //主鍵
	@Column(length=100,nullable=false)
	private String title; //書名
	@Column(length=100,nullable=false)
	private String author; //作者
	@Column(name="bookConcern" ,length=100,nullable=false)
	private String bookConcern;//出版社
	@Column(nullable=false)
	private LocalDate publishDate; //出版日期
	@Column(columnDefinition = "decimal(6,2)")
	private Float price;
	
	private Integer inventory; //庫存
	@Column(length=500)
	private String brief; //簡介
	
	
	
}
