package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 废品回收
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-16 20:10:39
 */
@TableName("feipinhuishou")
public class FeipinhuishouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FeipinhuishouEntity() {
		
	}
	
	public FeipinhuishouEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 废品名称
	 */
					
	private String feipinmingcheng;
	
	/**
	 * 废品类型
	 */
					
	private String feipinleixing;
	
	/**
	 * 废品图片
	 */
					
	private String feipintupian;
	
	/**
	 * 商家编号
	 */
					
	private String shangjiabianhao;
	
	/**
	 * 商家名称
	 */
					
	private String shangjiamingcheng;
	
	/**
	 * 商家地址
	 */
					
	private String shangjiadizhi;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 回收价格
	 */
					
	private Float huishoujiage;
	
	/**
	 * 计量单位
	 */
					
	private String jiliangdanwei;
	
	/**
	 * 回收时间
	 */
					
	private String huishoushijian;
	
	/**
	 * 废品详细
	 */
					
	private String feipinxiangxi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：废品名称
	 */
	public void setFeipinmingcheng(String feipinmingcheng) {
		this.feipinmingcheng = feipinmingcheng;
	}
	/**
	 * 获取：废品名称
	 */
	public String getFeipinmingcheng() {
		return feipinmingcheng;
	}
	/**
	 * 设置：废品类型
	 */
	public void setFeipinleixing(String feipinleixing) {
		this.feipinleixing = feipinleixing;
	}
	/**
	 * 获取：废品类型
	 */
	public String getFeipinleixing() {
		return feipinleixing;
	}
	/**
	 * 设置：废品图片
	 */
	public void setFeipintupian(String feipintupian) {
		this.feipintupian = feipintupian;
	}
	/**
	 * 获取：废品图片
	 */
	public String getFeipintupian() {
		return feipintupian;
	}
	/**
	 * 设置：商家编号
	 */
	public void setShangjiabianhao(String shangjiabianhao) {
		this.shangjiabianhao = shangjiabianhao;
	}
	/**
	 * 获取：商家编号
	 */
	public String getShangjiabianhao() {
		return shangjiabianhao;
	}
	/**
	 * 设置：商家名称
	 */
	public void setShangjiamingcheng(String shangjiamingcheng) {
		this.shangjiamingcheng = shangjiamingcheng;
	}
	/**
	 * 获取：商家名称
	 */
	public String getShangjiamingcheng() {
		return shangjiamingcheng;
	}
	/**
	 * 设置：商家地址
	 */
	public void setShangjiadizhi(String shangjiadizhi) {
		this.shangjiadizhi = shangjiadizhi;
	}
	/**
	 * 获取：商家地址
	 */
	public String getShangjiadizhi() {
		return shangjiadizhi;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：回收价格
	 */
	public void setHuishoujiage(Float huishoujiage) {
		this.huishoujiage = huishoujiage;
	}
	/**
	 * 获取：回收价格
	 */
	public Float getHuishoujiage() {
		return huishoujiage;
	}
	/**
	 * 设置：计量单位
	 */
	public void setJiliangdanwei(String jiliangdanwei) {
		this.jiliangdanwei = jiliangdanwei;
	}
	/**
	 * 获取：计量单位
	 */
	public String getJiliangdanwei() {
		return jiliangdanwei;
	}
	/**
	 * 设置：回收时间
	 */
	public void setHuishoushijian(String huishoushijian) {
		this.huishoushijian = huishoushijian;
	}
	/**
	 * 获取：回收时间
	 */
	public String getHuishoushijian() {
		return huishoushijian;
	}
	/**
	 * 设置：废品详细
	 */
	public void setFeipinxiangxi(String feipinxiangxi) {
		this.feipinxiangxi = feipinxiangxi;
	}
	/**
	 * 获取：废品详细
	 */
	public String getFeipinxiangxi() {
		return feipinxiangxi;
	}

}
