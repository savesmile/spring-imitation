package com.f_lin.imitation.beans.io;

import java.net.URL;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
public class ResourceLoader {

    public Resource getResource(String location) {
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }

}
