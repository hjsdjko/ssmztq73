package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FeipinhuishouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FeipinhuishouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FeipinhuishouView;


/**
 * 废品回收
 *
 * @author 
 * @email 
 * @date 2022-03-16 20:10:39
 */
public interface FeipinhuishouService extends IService<FeipinhuishouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeipinhuishouVO> selectListVO(Wrapper<FeipinhuishouEntity> wrapper);
   	
   	FeipinhuishouVO selectVO(@Param("ew") Wrapper<FeipinhuishouEntity> wrapper);
   	
   	List<FeipinhuishouView> selectListView(Wrapper<FeipinhuishouEntity> wrapper);
   	
   	FeipinhuishouView selectView(@Param("ew") Wrapper<FeipinhuishouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeipinhuishouEntity> wrapper);
   	

}

