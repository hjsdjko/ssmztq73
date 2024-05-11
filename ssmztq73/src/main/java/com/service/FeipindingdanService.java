package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FeipindingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FeipindingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FeipindingdanView;


/**
 * 废品订单
 *
 * @author 
 * @email 
 * @date 2022-03-16 20:10:39
 */
public interface FeipindingdanService extends IService<FeipindingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeipindingdanVO> selectListVO(Wrapper<FeipindingdanEntity> wrapper);
   	
   	FeipindingdanVO selectVO(@Param("ew") Wrapper<FeipindingdanEntity> wrapper);
   	
   	List<FeipindingdanView> selectListView(Wrapper<FeipindingdanEntity> wrapper);
   	
   	FeipindingdanView selectView(@Param("ew") Wrapper<FeipindingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeipindingdanEntity> wrapper);
   	

}

