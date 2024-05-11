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


import com.dao.DiscussfeipinhuishouDao;
import com.entity.DiscussfeipinhuishouEntity;
import com.service.DiscussfeipinhuishouService;
import com.entity.vo.DiscussfeipinhuishouVO;
import com.entity.view.DiscussfeipinhuishouView;

@Service("discussfeipinhuishouService")
public class DiscussfeipinhuishouServiceImpl extends ServiceImpl<DiscussfeipinhuishouDao, DiscussfeipinhuishouEntity> implements DiscussfeipinhuishouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfeipinhuishouEntity> page = this.selectPage(
                new Query<DiscussfeipinhuishouEntity>(params).getPage(),
                new EntityWrapper<DiscussfeipinhuishouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfeipinhuishouEntity> wrapper) {
		  Page<DiscussfeipinhuishouView> page =new Query<DiscussfeipinhuishouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfeipinhuishouVO> selectListVO(Wrapper<DiscussfeipinhuishouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfeipinhuishouVO selectVO(Wrapper<DiscussfeipinhuishouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfeipinhuishouView> selectListView(Wrapper<DiscussfeipinhuishouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfeipinhuishouView selectView(Wrapper<DiscussfeipinhuishouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
