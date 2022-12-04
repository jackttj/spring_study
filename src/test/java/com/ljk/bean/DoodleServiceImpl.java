// DoodleServiceImpl
package com.ljk.bean;

import com.ljk.core.annotation.Service;

@Service
public class DoodleServiceImpl implements DoodleService{
    @Override
    public String helloWord() {
        return "hello word";
    }
}