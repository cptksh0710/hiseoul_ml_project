package com.hiseoul.ml.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiseoul.ml.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
	public List<Member> findAllByOrderByNoDesc();
}