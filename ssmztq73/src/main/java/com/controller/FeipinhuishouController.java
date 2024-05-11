package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FeipinhuishouEntity;
import com.entity.view.FeipinhuishouView;

import com.service.FeipinhuishouService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 废品回收
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-16 20:10:39
 */
@RestController
@RequestMapping("/feipinhuishou")
public class FeipinhuishouController {
    @Autowired
    private FeipinhuishouService feipinhuishouService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FeipinhuishouEntity feipinhuishou, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			feipinhuishou.setShangjiabianhao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FeipinhuishouEntity> ew = new EntityWrapper<FeipinhuishouEntity>();
		PageUtils page = feipinhuishouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, feipinhuishou), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FeipinhuishouEntity feipinhuishou, 
		HttpServletRequest request){
        EntityWrapper<FeipinhuishouEntity> ew = new EntityWrapper<FeipinhuishouEntity>();
		PageUtils page = feipinhuishouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, feipinhuishou), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FeipinhuishouEntity feipinhuishou){
       	EntityWrapper<FeipinhuishouEntity> ew = new EntityWrapper<FeipinhuishouEntity>();
      	ew.allEq(MPUtil.allEQMapPre( feipinhuishou, "feipinhuishou")); 
        return R.ok().put("data", feipinhuishouService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FeipinhuishouEntity feipinhuishou){
        EntityWrapper< FeipinhuishouEntity> ew = new EntityWrapper< FeipinhuishouEntity>();
 		ew.allEq(MPUtil.allEQMapPre( feipinhuishou, "feipinhuishou")); 
		FeipinhuishouView feipinhuishouView =  feipinhuishouService.selectView(ew);
		return R.ok("查询废品回收成功").put("data", feipinhuishouView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FeipinhuishouEntity feipinhuishou = feipinhuishouService.selectById(id);
        return R.ok().put("data", feipinhuishou);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FeipinhuishouEntity feipinhuishou = feipinhuishouService.selectById(id);
        return R.ok().put("data", feipinhuishou);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FeipinhuishouEntity feipinhuishou, HttpServletRequest request){
    	feipinhuishou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(feipinhuishou);

        feipinhuishouService.insert(feipinhuishou);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FeipinhuishouEntity feipinhuishou, HttpServletRequest request){
    	feipinhuishou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(feipinhuishou);

        feipinhuishouService.insert(feipinhuishou);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FeipinhuishouEntity feipinhuishou, HttpServletRequest request){
        //ValidatorUtils.validateEntity(feipinhuishou);
        feipinhuishouService.updateById(feipinhuishou);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        feipinhuishouService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<FeipinhuishouEntity> wrapper = new EntityWrapper<FeipinhuishouEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			wrapper.eq("shangjiabianhao", (String)request.getSession().getAttribute("username"));
		}

		int count = feipinhuishouService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
