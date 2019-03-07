package com.model;

/**
 * TLiuyan generated by MyEclipse Persistence Tools
 */

public class TLiuyan implements java.io.Serializable
{

	// 留言板模型层

	private Integer liuyanId;

	private String liuyanTitle;//留言板

	private String liuyanContent;//留言内容
	
	private String liuyanDate;//留言日期
	
	private String liuyanUser;//留言人



	
	public TLiuyan()
	{
	}

	/** full constructor */
	public TLiuyan(String liuyanTitle, String liuyanContent)
	{
		this.liuyanTitle = liuyanTitle;
		this.liuyanContent = liuyanContent;
	}

	// Property accessors

	public Integer getLiuyanId()
	{
		return this.liuyanId;
	}

	public void setLiuyanId(Integer liuyanId)
	{
		this.liuyanId = liuyanId;
	}

	public String getLiuyanTitle()
	{
		return this.liuyanTitle;
	}

	public String getLiuyanUser()
	{
		return liuyanUser;
	}

	public void setLiuyanUser(String liuyanUser)
	{
		this.liuyanUser = liuyanUser;
	}

	public String getLiuyanDate()
	{
		return liuyanDate;
	}

	public void setLiuyanDate(String liuyanDate)
	{
		this.liuyanDate = liuyanDate;
	}

	public void setLiuyanTitle(String liuyanTitle)
	{
		this.liuyanTitle = liuyanTitle;
	}

	public String getLiuyanContent()
	{
		return this.liuyanContent;
	}

	public void setLiuyanContent(String liuyanContent)
	{
		this.liuyanContent = liuyanContent;
	}

}