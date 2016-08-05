package com.cc.dubbo.provider;

import java.util.List;

/**
 * 
 * @since 1.0.0
 * @version $Id$
 */
public interface DemoService {
    
    String sayHello(String name);

    List getUsers();
}
