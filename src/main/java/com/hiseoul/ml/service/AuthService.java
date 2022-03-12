package com.hiseoul.ml.service;

import com.hiseoul.ml.model.Auth;
import com.hiseoul.ml.model.Result;

public interface AuthService {
	public Result createAuth(Auth auth);
	public Result retrieveAuthList();
	public Result retrieveAuth(String authUuid);
	public Result updateAuth(Auth auth);
	public Result deleteAuth(String authUuid);
}