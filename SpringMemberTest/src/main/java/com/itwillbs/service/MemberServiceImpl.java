package com.itwillbs.service;

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
	
	
	
	
	
	
	
	

}// service
