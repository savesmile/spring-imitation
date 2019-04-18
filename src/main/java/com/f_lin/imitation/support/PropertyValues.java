package com.f_lin.imitation.support;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
@NoArgsConstructor
public class PropertyValues {
    @Getter
    private final List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>();

    /**
     * 添加配置值
     * 此处可以做一些操作，譬如说去重？
     */
    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }
}
