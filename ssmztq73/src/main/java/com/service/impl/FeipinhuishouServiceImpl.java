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


import com.dao.FeipinhuishouDao;
import com.entity.FeipinhuishouEntity;
import com.service.FeipinhuishouService;
import com.entity.vo.FeipinhuishouVO;
import com.entity.view.FeipinhuishouView;

@Service("feipinhuishouService")
public class FeipinhuishouServiceImpl extends ServiceImpl<FeipinhuishouDao, FeipinhuishouEntity> implements FeipinhuishouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FeipinhuishouEntity> page = this.selectPage(
                new Query<FeipinhuishouEntity>(params).getPage(),
                new EntityWrapper<FeipinhuishouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FeipinhuishouEntity> wrapper) {
		  Page<FeipinhuishouView> page =new Query<FeipinhuishouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FeipinhuishouVO> selectListVO(Wrapper<FeipinhuishouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FeipinhuishouVO selectVO(Wrapper<FeipinhuishouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FeipinhuishouView> selectListView(Wrapper<FeipinhuishouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FeipinhuishouView selectView(Wrapper<FeipinhuishouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
