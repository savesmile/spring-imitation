package com.f_lin.imitation.beans.support;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PropertyValue {
    private String name;
    private Object value;
}
