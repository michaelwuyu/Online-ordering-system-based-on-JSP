package com.model;

/**
 * TGoods generated by MyEclipse Persistence Tools
 */

public class TGoods implements java.io.Serializable
{

	// ��Ʒ����ϸ����ģ�Ͳ�

	private Integer goodsId;
	private String goodsName;
	private String goodsMiaoshu;
	private String goodsPic;

	private Integer goodsShichangjia;
	private Integer goodsTejia;
	private String goodsIsnottejia;
	private String goodsIsnottuijian;

	private Integer goodsCatelogId;
	private String goodsDel;
	
	private TCatelog catelog;


	public Integer getGoodsId()
	{
		return goodsId;
	}


	public void setGoodsId(Integer goodsId)
	{
		this.goodsId = goodsId;
	}


	public String getGoodsName()
	{
		return goodsName;
	}


	public void setGoodsName(String goodsName)
	{
		this.goodsName = goodsName;
	}


	public String getGoodsMiaoshu()
	{
		return goodsMiaoshu;
	}


	public void setGoodsMiaoshu(String goodsMiaoshu)
	{
		this.goodsMiaoshu = goodsMiaoshu;
	}


	public TCatelog getCatelog()
	{
		return catelog;
	}


	public void setCatelog(TCatelog catelog)
	{
		this.catelog = catelog;
	}


	public String getGoodsPic()
	{
		return goodsPic;
	}


	public void setGoodsPic(String goodsPic)
	{
		this.goodsPic = goodsPic;
	}


	public Integer getGoodsShichangjia()
	{
		return goodsShichangjia;
	}


	public void setGoodsShichangjia(Integer goodsShichangjia)
	{
		this.goodsShichangjia = goodsShichangjia;
	}


	public Integer getGoodsTejia()
	{
		return goodsTejia;
	}


	public void setGoodsTejia(Integer goodsTejia)
	{
		this.goodsTejia = goodsTejia;
	}


	public String getGoodsIsnottejia()
	{
		return goodsIsnottejia;
	}


	public void setGoodsIsnottejia(String goodsIsnottejia)
	{
		this.goodsIsnottejia = goodsIsnottejia;
	}


	public String getGoodsIsnottuijian()
	{
		return goodsIsnottuijian;
	}


	public void setGoodsIsnottuijian(String goodsIsnottuijian)
	{
		this.goodsIsnottuijian = goodsIsnottuijian;
	}


	public Integer getGoodsCatelogId()
	{
		return goodsCatelogId;
	}


	public void setGoodsCatelogId(Integer goodsCatelogId)
	{
		this.goodsCatelogId = goodsCatelogId;
	}


	public String getGoodsDel()
	{
		return goodsDel;
	}


	public void setGoodsDel(String goodsDel)
	{
		this.goodsDel = goodsDel;
	}
	
}