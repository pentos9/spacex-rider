package com.spacex.framework.test;


import com.spacex.framework.annotation.Inject;
import com.spacex.framework.annotation.Service;

@Service
public class TestService {

    @Inject
    private TestBean testBean;
}
