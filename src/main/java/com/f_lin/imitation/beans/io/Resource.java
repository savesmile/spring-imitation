package com.f_lin.imitation.beans.io;

import java.io.InputStream;

/**
 * Resource是spring内部定位资源的接口。
 * @author F_lin
 * @since 2019/4/18
 **/
public interface Resource {

    InputStream getInputStream() throws Exception;

}
