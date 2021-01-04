package com.examples.angular.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(
        name = "customizedUser",
        types = {User.class})
public interface UserProjection {
    @Value("#{target.id}")
    long getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.email}")
    String getEmail();
}
