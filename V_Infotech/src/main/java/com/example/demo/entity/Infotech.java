package com.example.demo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@jakarta.persistence.Entity
@Table(name = "infotech")
public class Infotech {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String username;
	String password;
	String message;
}
 