package com.rollingstone.springboot.oauth2.jwt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rollingstone.springboot.oauth2.jwt.domain.Stock;
import com.rollingstone.springboot.oauth2.jwt.domain.User;
import com.rollingstone.springboot.oauth2.jwt.domain.UserStock;
import com.rollingstone.springboot.oauth2.jwt.repository.StockRepository;
import com.rollingstone.springboot.oauth2.jwt.repository.UserRepository;
import com.rollingstone.springboot.oauth2.jwt.repository.UserStockRepository;
import com.rollingstone.springboot.oauth2.jwt.service.SpringBootOAuth2JwtService;

/**
 * Created by bdatta on 10/08/17.
 */
@Service
public class SpringBootOAuth2JwtServiceImpl implements SpringBootOAuth2JwtService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private StockRepository stockRepository;
    
    @Autowired
    private UserStockRepository userSockRepository;


    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>)userRepository.findAll();
    }

 
	@Override
	public List<Stock> findAllStocks() {
		 return (List<Stock>)stockRepository.findAll();
		
	}

	@Override
	public List<UserStock> findAllUserStocks() {
		 return (List<UserStock>)userSockRepository.findAll();
	}
}
