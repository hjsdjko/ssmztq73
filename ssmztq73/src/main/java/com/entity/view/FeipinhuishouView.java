package com.entity.view;

import com.entity.FeipinhuishouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 废品回收
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-16 20:10:39
 */
@TableName("feipinhuishou")
public class FeipinhuishouView  extends FeipinhuishouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FeipinhuishouView(){
	}
 
 	public FeipinhuishouView(FeipinhuishouEntity feipinhuishouEntity){
 	try {
			BeanUtils.copyProperties(this, feipinhuishouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
