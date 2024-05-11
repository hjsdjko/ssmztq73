package com.entity.view;

import com.entity.FeipindingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 废品订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-16 20:10:39
 */
@TableName("feipindingdan")
public class FeipindingdanView  extends FeipindingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FeipindingdanView(){
	}
 
 	public FeipindingdanView(FeipindingdanEntity feipindingdanEntity){
 	try {
			BeanUtils.copyProperties(this, feipindingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
