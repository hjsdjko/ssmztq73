package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfeipinhuishouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfeipinhuishouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfeipinhuishouView;


/**
 * 废品回收评论表
 *
 * @author 
 * @email 
 * @date 2022-03-16 20:10:39
 */
public interface DiscussfeipinhuishouService extends IService<DiscussfeipinhuishouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfeipinhuishouVO> selectListVO(Wrapper<DiscussfeipinhuishouEntity> wrapper);
   	
   	DiscussfeipinhuishouVO selectVO(@Param("ew") Wrapper<DiscussfeipinhuishouEntity> wrapper);
   	
   	List<DiscussfeipinhuishouView> selectListView(Wrapper<DiscussfeipinhuishouEntity> wrapper);
   	
   	DiscussfeipinhuishouView selectView(@Param("ew") Wrapper<DiscussfeipinhuishouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfeipinhuishouEntity> wrapper);
   	

}

