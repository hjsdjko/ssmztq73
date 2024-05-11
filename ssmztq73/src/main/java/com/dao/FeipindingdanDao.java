package com.dao;

import com.entity.FeipindingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FeipindingdanVO;
import com.entity.view.FeipindingdanView;


/**
 * 废品订单
 * 
 * @author 
 * @email 
 * @date 2022-03-16 20:10:39
 */
public interface FeipindingdanDao extends BaseMapper<FeipindingdanEntity> {
	
	List<FeipindingdanVO> selectListVO(@Param("ew") Wrapper<FeipindingdanEntity> wrapper);
	
	FeipindingdanVO selectVO(@Param("ew") Wrapper<FeipindingdanEntity> wrapper);
	
	List<FeipindingdanView> selectListView(@Param("ew") Wrapper<FeipindingdanEntity> wrapper);

	List<FeipindingdanView> selectListView(Pagination page,@Param("ew") Wrapper<FeipindingdanEntity> wrapper);
	
	FeipindingdanView selectView(@Param("ew") Wrapper<FeipindingdanEntity> wrapper);
	

}
