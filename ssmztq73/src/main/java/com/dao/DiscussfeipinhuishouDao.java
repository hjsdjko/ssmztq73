package com.dao;

import com.entity.DiscussfeipinhuishouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfeipinhuishouVO;
import com.entity.view.DiscussfeipinhuishouView;


/**
 * 废品回收评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-16 20:10:39
 */
public interface DiscussfeipinhuishouDao extends BaseMapper<DiscussfeipinhuishouEntity> {
	
	List<DiscussfeipinhuishouVO> selectListVO(@Param("ew") Wrapper<DiscussfeipinhuishouEntity> wrapper);
	
	DiscussfeipinhuishouVO selectVO(@Param("ew") Wrapper<DiscussfeipinhuishouEntity> wrapper);
	
	List<DiscussfeipinhuishouView> selectListView(@Param("ew") Wrapper<DiscussfeipinhuishouEntity> wrapper);

	List<DiscussfeipinhuishouView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfeipinhuishouEntity> wrapper);
	
	DiscussfeipinhuishouView selectView(@Param("ew") Wrapper<DiscussfeipinhuishouEntity> wrapper);
	

}
