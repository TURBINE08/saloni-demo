package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Infotech;
import com.example.demo.repo.Vinfitechrepo;

@Service
public class Serviceimpl {

	@Autowired
	private Vinfitechrepo vinfitechrepo;
	
	public ResponseEntity<?> loginapi(Infotech infotech) {
		Infotech get = vinfitechrepo.findByUsername(infotech.getUsername());
		if(get!=null)
		{return ResponseEntity.status(200).body("username allready present");}
		Infotech rtn = vinfitechrepo.save(infotech);
		if(rtn==null)
		{
			return ResponseEntity.status(409).body("details not save");
		}else
		{
			return ResponseEntity.status(200).body("details save sucessfully");
		}
		
	}

	public ResponseEntity<?> Logindetails(Infotech infotech) {
		Infotech rtn = vinfitechrepo.findByUsernameAndPassword(infotech.getUsername(),infotech.getPassword());
		if(rtn==null)
		{
			return ResponseEntity.status(409).body("login failed");
		}else
		{
			return ResponseEntity.status(200).body(rtn.getMessage());
		}
	}

}
