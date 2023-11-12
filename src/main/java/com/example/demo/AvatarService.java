package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

public class AvatarService {

    public Collection<Avatar> find(int page, int pageSize){

        private final static Logger logger = LoggerFactory.getLogger(StudentService.class);

        logger.info("add method was invoked ");

        return avatarRepository.findAll(PageRequest.of(page, pageSize)).getContent();
    }
}
