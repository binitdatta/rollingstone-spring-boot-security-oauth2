package com.rollingstone.springboot.oauth2.jwt.repository;

import org.springframework.data.repository.CrudRepository;

import com.rollingstone.springboot.oauth2.jwt.domain.Role;

/**
 * Created by bdatta on 10/08/17.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
}
