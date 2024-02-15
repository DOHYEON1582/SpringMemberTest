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
		logger.debug("DAO : deleteMember 실행");
		
		return sqlsession.delete(NAMESPACE+"deleteMember",vo);
	
	}

	@Override
	public MemberVO getMember(String userid) {
		logger.debug("DAO : getMember 실행");
		
		return sqlsession.selectOne(NAMESPACE+"getMember", userid);
		
	}

	@Override
	public int updateMember(MemberVO vo) {
		logger.debug("DAO : updateMember 실행");
		
		return sqlsession.update(NAMESPACE+"updateMember", vo);

	}

	@Override
	public MemberVO loginMember(MemberVO vo) {
		logger.debug("DAO : loginMember() 실행");
		
		return sqlsession.selectOne(NAMESPACE+"loginMember", vo);
	}

	@Override
	public List<MemberVO> getMemberList() {
		logger.debug("DAO : getMemberList() 실행");
		
		return sqlsession.selectList(NAMESPACE+"getMemberList");
	}

}
