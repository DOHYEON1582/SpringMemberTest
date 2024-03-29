package com.itwillbs.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO mdao;
	
	
	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);

	@Override
	public void MemberJoin(MemberVO vo) {
		logger.debug("s : MemberJoin() ");
		
		mdao.insertMember(vo);
	
	}

	@Override
	public MemberVO MemberLogin(MemberVO vo) {
		logger.debug("s: MemberLogin()");
		
		return mdao.loginMember(vo);
		
	}

	@Override
	public MemberVO MemberInfo(String userid) {
		logger.debug("s: MemberInfo()");
		
		return mdao.getMember(userid);
		
	}

	@Override
	public int MemberUpdate(MemberVO vo) {
		logger.debug("s: MemberUpdate(String userid)");
		
		return mdao.updateMember(vo);
		
	}

	@Override
	public int MemberDelete(MemberVO vo) {
		logger.debug("s: MemberDelete(MemberVO vo)");
		
		return mdao.deleteMember(vo);
	}

	@Override
	public List<MemberVO> MemberList() {
		logger.debug("s: memberList()");
		
		List<MemberVO> mList = mdao.getMemberList();
		
		return mList;
	}
	
	
	
	
	
	
	
	

}// service
