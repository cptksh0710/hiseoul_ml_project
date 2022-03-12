package com.hiseoul.ml.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hiseoul.ml.enumpkg.ServiceResult;
import com.hiseoul.ml.model.Member;
import com.hiseoul.ml.model.ErrorResponse;
import com.hiseoul.ml.model.Result;
import com.hiseoul.ml.repositories.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService{
	private static final org.apache.logging.log4j.Logger 
	logger = LogManager.getLogger(MemberServiceImpl.class);
	@Autowired
	MemberRepository repository;
	
	public Result updateMember(Member member) {
		Optional<Member> search = repository.findById(member.getMemberNo());
		Result result = new Result();
		if(search.isPresent()) {
			member = repository.save(member);
			result.setPayload(member);
		}else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}
	
	public Result deleteMember(int memberno) {
		Result result = new Result();
		boolean isPresent = repository.findById(memberno).isPresent();
		if(!isPresent) {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}else {
			repository.deleteById(memberno);
		}
		return result;
	}
	
	@Override
	public Result createMember(Member member) {
		member = repository.save(member);
		Result result = new Result();
		result.setPayload(member);
		return result;
	}
	
	@Override
	public Result retrieveMemberList() {
		List<Member> list = repository.findAllByOrderByMemberNoDesc();
		Result result = new Result();
		result.setPayload(list);
		return result;
	}
	
	@Override
	public Result retrieveMember(int memberno) {
		Optional<Member> optionalmember = repository.findById(memberno);
		Result result = new Result();
		if(optionalmember.isPresent()) {
			result.setPayload(optionalmember.get());
		}else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}
}