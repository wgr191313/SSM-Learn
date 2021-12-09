package com.anno;

import org.springframework.stereotype.Component;

/**
 * @author wangguanru
 * @date 2021-12-08
 */

@Component("target")
public class Target implements TargetInterface {

    @Override
    public void save() {
        System.out.println("save running...");
        //int i=1/0;
    }

}
