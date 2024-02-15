package com.itwillbs.web;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

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
	
	//http://localhost:8088/member/login
	// 로그인GET
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void memberLoginGET() {
		logger.debug("memberLoginGET() 실행");
		logger.debug("로그인 페이지로 이동");
		
	}
	
	// 로그인POST
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String memberLoginPOST(MemberVO vo, HttpSession session) {
		logger.debug("memberLoginPOST(MemberVO vo) 실행");
		MemberVO resultVO = mService.MemberLogin(vo);
		
		if(resultVO != null) {
			logger.debug("회원 정보 확인 완료!");
			logger.debug("페이지 이동");
			session.setAttribute("resultVO", resultVO);
			return "redirect:/member/main";
		}
		logger.debug("회원정보 없음!");
		return "/member/login";
	}
	
	
	
	

}// controller
