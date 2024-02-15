package com.itwillbs.web;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.service.MemberService;

@Controller
@RequestMapping(value = "/member/*")
public class MemberController {
	
	@Inject
	private MemberService mService;
	
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//http://localhost:8088/member/join
	// 회원가입GET
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public void joinGET() {
		logger.debug("join() 실행");
		logger.debug("회원가입 페이지로 이동");
	}
	
	// 회원가입POST
	@RequestMapping(value = "/join",method = RequestMethod.POST)
	public String joinPOST(MemberVO vo) {
		logger.debug("join(MemberVO vo) 실행");
		
		mService.MemberJoin(vo);
		
		logger.debug("회원 가입 완료! -> 로그인 페이지로 이동");
		
		return "redirect:/member/login";
	}
	
	
	
	
	
	
	
	

}// controller
