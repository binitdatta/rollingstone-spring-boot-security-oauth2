package com.rollingstone.springboot.oauth2.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rollingstone.springboot.oauth2.jwt.domain.Stock;
import com.rollingstone.springboot.oauth2.jwt.domain.User;
import com.rollingstone.springboot.oauth2.jwt.domain.UserStock;
import com.rollingstone.springboot.oauth2.jwt.service.SpringBootOAuth2JwtService;

/**
 * Created by bdatta on 10/08/17.
 */
@RestController
@RequestMapping("/springbootoauth2jwt")
public class ResourceController {
    @Autowired
    private SpringBootOAuth2JwtService springbootOAuth2JwtService;

    @RequestMapping(value ="/stocks")
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('GENERAL_USER')")
    public List<Stock> getStocks(){
        return springbootOAuth2JwtService.findAllStocks();
    }

    @RequestMapping(value ="/users", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<User> getUsers(){
        return springbootOAuth2JwtService.findAllUsers();
    }
    
    @RequestMapping(value ="/usersstock", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<UserStock> getUserStocks(){
        return springbootOAuth2JwtService.findAllUserStocks();
    }
}
