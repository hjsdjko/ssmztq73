package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FeipindingdanDao;
import com.entity.FeipindingdanEntity;
import com.service.FeipindingdanService;
import com.entity.vo.FeipindingdanVO;
import com.entity.view.FeipindingdanView;

@Service("feipindingdanService")
public class FeipindingdanServiceImpl extends ServiceImpl<FeipindingdanDao, FeipindingdanEntity> implements FeipindingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FeipindingdanEntity> page = this.selectPage(
                new Query<FeipindingdanEntity>(params).getPage(),
                new EntityWrapper<FeipindingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FeipindingdanEntity> wrapper) {
		  Page<FeipindingdanView> page =new Query<FeipindingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FeipindingdanVO> selectListVO(Wrapper<FeipindingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FeipindingdanVO selectVO(Wrapper<FeipindingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FeipindingdanView> selectListView(Wrapper<FeipindingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FeipindingdanView selectView(Wrapper<FeipindingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
