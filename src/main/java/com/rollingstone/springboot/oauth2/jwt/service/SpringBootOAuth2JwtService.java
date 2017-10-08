package com.rollingstone.springboot.oauth2.jwt.service;

import java.util.List;

import com.rollingstone.springboot.oauth2.jwt.domain.Stock;
import com.rollingstone.springboot.oauth2.jwt.domain.User;
import com.rollingstone.springboot.oauth2.jwt.domain.UserStock;

/**
 * Created by bdatta on 10/08/17.
 */
public interface SpringBootOAuth2JwtService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<Stock> findAllStocks();
    
    List<UserStock> findAllUserStocks();

}
