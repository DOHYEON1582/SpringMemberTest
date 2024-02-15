package com.itwillbs.web;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"}
		)
public class MemberDAOTest {
			 // => Controller + Action페이지 동작
			 
	// DAO 객체 생성 => 주입
	@Inject
	private MemberDAO mdao;
	//MemberDAO mdao = new MemberDAOImpl();
	
	// 로그 처리 객체
	//private static final Logger logger = 
	//				LoggerFactory.getLogger(MemberDAOTest.class);
	
	private static final Logger logger = LoggerFactory.getLogger(MemberDAOTest.class);
	
	
	
	
	//@Test
	public void 회원가입테스트() {
		logger.debug("회원가입테스트() 실행");
		logger.debug("DAO 회원가입 메서드 호출");
		
		// 임시 회원정보 객체 생성
		MemberVO vo = new MemberVO();
		vo.setUserid("adminkkksss");
		vo.setUserpw("123");
		vo.setUsername("관리자");
		vo.setUseremail("admin@admin.com");
		
		mdao.insertMember(vo);
		
		logger.debug("회원가입 완료@@@@@@@@@@@@@@@@@");
		
	}
	
	//@Test
	public void 로그인테스트() {
		logger.debug("로그인테스트() 실행");
		
		//임시 사용자 계정
		MemberVO vo = new MemberVO();
		vo.setUserid("admin");
		vo.setUserpw("123");
		
		MemberVO resultVO = mdao.loginMember(vo);
		
		if(resultVO != null) {
			logger.debug("로그인 성공!");
			logger.debug("메인페이지로 이동");
		}else{
			logger.debug("로그인 실패!");
		}
		
	}
	
	//@Test
	public void 회원정보조회() {
		logger.debug(" 특정 사용자의 정보를 조회하는 메서드 실행! ");
		logger.debug(" id : admin, pw : 123 계정정보 사용");
		
		
		MemberVO vo = mdao.getMember("admin");
		logger.debug("vo : "+vo);
		
	}
//	
	// 회원정보 수정 - admin/123 계정의 이름, updatedate 변경
	//@Test
	public void 회원정보수정() {
		logger.debug("회원정보수정() 메서드 실행");
		
		MemberVO uvo = new MemberVO();
		uvo.setUserid("admin");
		uvo.setUserpw("123");
		uvo.setUsername("관리자");
		
		mdao.updateMember(uvo);
		
		
	}
//	
//	// 회원정보 삭제 - admin/123 계정정보 삭제
	//@Test
	public void 회원정보삭제() {
		logger.debug("회원정보삭제() 메서드 실행");
		
		MemberVO dvo = new MemberVO();
		dvo.setUserid("admin1");
		dvo.setUserpw("123");
		
		int result = -1;
		
		result = mdao.deleteMember(dvo);
		if(result == 1) logger.debug("회원정보 삭제 완료!");
		else logger.debug("회원정보 삭제 실패!");
	}
	
	@Test
	public void 회원목록출력() {
		logger.debug("회원목록출력() 확인");
		List<MemberVO> mList = mdao.getMemberList();
		
		logger.debug("mList : "+mList);
	}
	
	
	
	
	
	
	

}//MemberDAOTest
