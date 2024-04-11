package com.SpringbootPractice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringbootPractice.Entity.logininfo;

@Repository
public interface LoginRepository extends JpaRepository<logininfo, String>{
// JpaRepository<Entity, PK키의 타입>
// repository는 save, findAll, get 등을 사용할 수 있게 해줌.
}
