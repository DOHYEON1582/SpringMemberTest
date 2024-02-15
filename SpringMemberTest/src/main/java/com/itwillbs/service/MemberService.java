package com.itwillbs.service;

import java.util.List;

import com.itwillbs.domain.MemberVO;

public interface MemberService {
	
		// 회원가입
		public void MemberJoin(MemberVO vo);
		
		// 회원 삭제
		public int MemberDelete(MemberVO vo);
		
		// 정보 가져오기
		public MemberVO MemberInfo(String userid);
		
		// 정보 수정하기
		public int MemberUpdate(MemberVO vo);
		
		// 로그인 메서드
		public MemberVO MemberLogin(MemberVO vo);
		
		// 회원 리스트 가져오기
		public List<MemberVO> MemberList();
}
