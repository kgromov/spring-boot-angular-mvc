package com.examples.angular.handlers;

import com.examples.angular.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.core.annotation.*;

@Slf4j
@RepositoryEventHandler(User.class)
public class UserEventHandler {

    @HandleBeforeCreate
    public void handleUserBeforeCreate(User user){
        log.info("Inside User Before Create ....");
    }

    @HandleBeforeDelete
    public void handleUserBeforeDelete(User user){
        log.info("Inside User Before Delete ....");
    }

    @HandleBeforeSave
    public void handleUserBeforeSave(User user){
        log.info("Inside User Before Save ....");
    }

    @HandleBeforeLinkDelete
    public void handleUserBeforeLinkDelete(User user){
        log.info("Inside User HandleBeforeLinkDelete ....");
    }

    @HandleBeforeLinkSave
    public void handleUserBeforeLinkSave(User user){
        log.info("Inside User HandleBeforeLinkSave ....");
    }


    @HandleAfterDelete
    public void handleUserAfterCreate(User user){
        log.info("Inside User Before Create ....");
    }

    @HandleAfterDelete
    public void handleUserAfterDelete(User user){
        log.info("Inside User Before Delete ....");
    }

    @HandleAfterSave
    public void handleUserAfterSave(User user){
        log.info("Inside User Before Save ....");
    }

    @HandleAfterLinkDelete
    public void handleUserAfterLinkDelete(User user){
        log.info("Inside User HandleAfterLinkDelete ....");
    }

    @HandleAfterLinkSave
    public void handleUserAfterLinkSave(User user){
        log.info("Inside User HandleAfterLinkSave....");
    }
}
