package com.itwillbs.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.itwillbs.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sqlsession;
	
	
	private static final Logger logger = LoggerFactory.getLogger(MemberDAOImpl.class);
	
	private static final String NAMESPACE = "com.itwillbs.mapper.MemberMapper.";

	@Override
	public void insertMember(MemberVO vo) {
		logger.debug("DAO : insertMember 실행");
		
		sqlsession.insert(NAMESPACE+"insertMember",vo);
		

	}

	@Override
	public int deleteMember(MemberVO vo) {
		return 0;
	}

	@Override
	public MemberVO getMember(MemberVO vo) {
		return null;
	}

	@Override
	public void updateMember(MemberVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public MemberVO loginMember(MemberVO vo) {
		return null;
	}

	@Override
	public List<MemberVO> getMemberList() {
		return null;
	}

}
