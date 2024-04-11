package com.SpringbootPractice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringbootPractice.Entity.logininfo;
import com.SpringbootPractice.Repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired // '생성자/setter/필드' 의존성 주입?????
	private LoginRepository LoginRepository;
	
	public void LoginInsert(logininfo LoginInfo) {
		LoginRepository.save(LoginInfo);
	}
	
	public List<logininfo> viewlist()
	{
		return LoginRepository.findAll();
	}

}
