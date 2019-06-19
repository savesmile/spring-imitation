package com.f_lin.imitation.beans.io;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
public class UrlResource implements Resource {

    private final URL url;

    public UrlResource(URL url) {
        this.url = url;
    }

    public InputStream getInputStream() throws Exception {
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
