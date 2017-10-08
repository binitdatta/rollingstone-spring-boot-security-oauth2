package com.rollingstone.springboot.oauth2.jwt.repository;

import org.springframework.data.repository.CrudRepository;

import com.rollingstone.springboot.oauth2.jwt.domain.Stock;

/**
 * Created by bdatta on 10/08/17.
 */
public interface StockRepository extends CrudRepository<Stock, Long> {
}
