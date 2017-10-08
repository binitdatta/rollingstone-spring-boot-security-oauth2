package com.rollingstone.springboot.oauth2.jwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.rollingstone.springboot.oauth2.jwt.domain.User;

/**
 * Created by bdatta on 10/08/17.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
