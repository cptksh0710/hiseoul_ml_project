package com.hiseoul.ml.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiseoul.ml.model.Auth;

@Repository
public interface AuthRepository extends JpaRepository<Auth, String> {
	public List<Auth> findAllByOrderByAuthUuidDesc();
}