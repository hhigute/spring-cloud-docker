package com.h3b.investment.preload.dto.transformation;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.BeanUtils;

public class ListUtils<T> {
	
	
    @SuppressWarnings("unchecked")
	public void copyList(Object obj, List<T> list2, Class<T> classObj) {
        if ((!Objects.isNull(obj)) && (!Objects.isNull(list2))) {
            @SuppressWarnings("rawtypes")
			List list1 = (List) obj;
            list1.forEach(item -> {
                try {
                    @SuppressWarnings("deprecation")
					T data = classObj.newInstance();
                    BeanUtils.copyProperties(item, data);
                    list2.add(data);
                } catch (InstantiationException e) {
                } catch (IllegalAccessException e) {
                }


            });
        }
    }
}