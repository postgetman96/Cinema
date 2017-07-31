package org.postgetman.cinema.app.controller;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {

    @Autowired
    public Mapper mapper;

    protected <T,R> R convert(T source, Class<R> resultClass) {
         return mapper.map(source,resultClass);
    }
}
