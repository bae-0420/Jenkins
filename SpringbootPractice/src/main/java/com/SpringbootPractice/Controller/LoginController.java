package com.SpringbootPractice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SpringbootPractice.Entity.logininfo;
import com.SpringbootPractice.Service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService LoginService;
	
	@RequestMapping("/login") // 로그인 페이지
	public String Login()
	{
		return "login";
	}
	
	// html의 ID, PW 가져옴
	/*@ResponseBody
	@PostMapping("/test")
	public String LoginTrue(String ID, String PW)
	{
		System.out.println(ID + ",,,,,," + PW);
		return "good";
	}*/
	
	// @RequestParam url변수 전달
	@ResponseBody // View가 html이 아닌 return 값 그대로 출력.
	@PostMapping("/test") // DB에 저장
	public String LoginTrue(logininfo LoginInfo) {
		System.out.println(LoginInfo.getID() + "/" + LoginInfo.getPW());
		LoginService.LoginInsert(LoginInfo);
		return "good";
	}
	
	@RequestMapping("/list")
	public String viewlist(Model model) {
		model.addAttribute("list", LoginService.viewlist());
		return "view";
	}
}
