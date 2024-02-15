package com.itwillbs.persistence;

import java.util.List;

import com.itwillbs.domain.MemberVO;

public interface MemberDAO {
	
	// 회원가입
	public void insertMember(MemberVO vo);
	
	// 회원 삭제
	public int deleteMember(MemberVO vo);
	
	// 정보 가져오기
	public MemberVO getMember(String userid);
	
	// 정보 수정하기
	public void updateMember(MemberVO vo);
	
	// 로그인 메서드
	public MemberVO loginMember(MemberVO vo);
	
	// 회원 리스트 가져오기
	public List<MemberVO> getMemberList();

}
