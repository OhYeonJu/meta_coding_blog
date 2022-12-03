package com.cos.blog.repository;

import com.cos.blog.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

// DAO
// 자동으로 bean등록이 된다.
public interface UserRepository extends JpaRepository<Users, Integer> { // 해당 jpa레퍼지터리는 User테이블이 관리하는 repo다. User테이블의 primary키는 integer형이다.

}
