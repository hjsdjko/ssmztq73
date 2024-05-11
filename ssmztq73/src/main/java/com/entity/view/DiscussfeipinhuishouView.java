package com.entity.view;

import com.entity.DiscussfeipinhuishouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 废品回收评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-16 20:10:39
 */
@TableName("discussfeipinhuishou")
public class DiscussfeipinhuishouView  extends DiscussfeipinhuishouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfeipinhuishouView(){
	}
 
 	public DiscussfeipinhuishouView(DiscussfeipinhuishouEntity discussfeipinhuishouEntity){
 	try {
			BeanUtils.copyProperties(this, discussfeipinhuishouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
