package com.dao;

import com.entity.FeipinhuishouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FeipinhuishouVO;
import com.entity.view.FeipinhuishouView;


/**
 * 废品回收
 * 
 * @author 
 * @email 
 * @date 2022-03-16 20:10:39
 */
public interface FeipinhuishouDao extends BaseMapper<FeipinhuishouEntity> {
	
	List<FeipinhuishouVO> selectListVO(@Param("ew") Wrapper<FeipinhuishouEntity> wrapper);
	
	FeipinhuishouVO selectVO(@Param("ew") Wrapper<FeipinhuishouEntity> wrapper);
	
	List<FeipinhuishouView> selectListView(@Param("ew") Wrapper<FeipinhuishouEntity> wrapper);

	List<FeipinhuishouView> selectListView(Pagination page,@Param("ew") Wrapper<FeipinhuishouEntity> wrapper);
	
	FeipinhuishouView selectView(@Param("ew") Wrapper<FeipinhuishouEntity> wrapper);
	

}
