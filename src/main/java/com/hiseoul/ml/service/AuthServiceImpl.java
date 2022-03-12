package com.hiseoul.ml.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hiseoul.ml.enumpkg.ServiceResult;
import com.hiseoul.ml.model.Auth;
import com.hiseoul.ml.model.ErrorResponse;
import com.hiseoul.ml.model.Result;
import com.hiseoul.ml.repositories.AuthRepository;

@Service
public class AuthServiceImpl implements AuthService{
	private static final org.apache.logging.log4j.Logger 
	logger = LogManager.getLogger(AuthServiceImpl.class);
	@Autowired
	AuthRepository repository;
	
	public Result updateAuth(Auth auth) {
		Optional<Auth> search = repository.findById(auth.getAuthUuid());
		Result result = new Result();
		if(search.isPresent()) {
			auth = repository.save(auth);
			result.setPayload(auth);
		}else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}
	
	public Result deleteAuth(String authUuid) {
		Result result = new Result();
		boolean isPresent = repository.findById(authUuid).isPresent();
		if(!isPresent) {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}else {
			repository.deleteById(authUuid);
		}
		return result;
	}
	
	@Override
	public Result createAuth(Auth auth) {
		auth = repository.save(auth);
		Result result = new Result();
		result.setPayload(auth);
		return result;
	}
	
	@Override
	public Result retrieveAuthList() {
		List<Auth> list = repository.findAllByOrderByAuthUuidDesc();
		Result result = new Result();
		result.setPayload(list);
		return result;
	}
	
	@Override
	public Result retrieveAuth(String authUuid) {
		Optional<Auth> optionalAuth = repository.findById(authUuid);
		Result result = new Result();
		if(optionalAuth.isPresent()) {
			result.setPayload(optionalAuth.get());
		}else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}
}