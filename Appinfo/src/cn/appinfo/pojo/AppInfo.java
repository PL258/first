package cn.appinfo.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AppInfo {
	private int id;      //主键id
	private String softwareName; //软件名称
	private String APKName;   //APK名称（唯一）
	private String supportROM;   //支持ROM
	private String interfaceLanguage;  //界面语言
	private BigDecimal softwareSize;  //软件大小（单位：M）
	private Date updateDate;  //更新日期
	private int devId;    //开发者id（来源于：dev_user表的开发者id）
	private String appInfo; //应用简介
	private int status;   //状态（来源于：data_dictionary，1 待审核 2 审核通过 3 审核不通过 4 已上架 5 已下架）
	private Date onSaleDate;   //上架时间
	private Date offSaleDate;  //下架时间
	private int flatformId;   //所属平台（来源于：data_dictionary，1 手机 2 平板 3 通用）
	private int categoryLevel3;  //所属三级分类（来源于：data_dictionary）
	private int downloads;  //下载量（单位：次）
	private int createdBy;  //创建者（来源于dev_user开发者信息表的用户id）
	private Date creationDate; //创建时间
	private int modifBy;     //更新者（来源于dev_user开发者信息表的用户id）
	private Date modifyDate;   //最新更新时间
	private int categoryLevel1;  //所属一级分类（来源于：data_dictionary）
	private int categoryLevel12;  //所属二级分类（来源于：data_dictionary）
	private String logoPicPath;  //LOGO图片url路径
	private String logoLocPath;  //LOGO图片的服务器存储路径
	private int versionId;   //最新的版本id
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public String getAPKName() {
		return APKName;
	}
	public void setAPKName(String aPKName) {
		APKName = aPKName;
	}
	public String getSupportROM() {
		return supportROM;
	}
	public void setSupportROM(String supportROM) {
		this.supportROM = supportROM;
	}
	public String getInterfaceLanguage() {
		return interfaceLanguage;
	}
	public void setInterfaceLanguage(String interfaceLanguage) {
		this.interfaceLanguage = interfaceLanguage;
	}
	public BigDecimal getSoftwareSize() {
		return softwareSize;
	}
	public void setSoftwareSize(BigDecimal softwareSize) {
		this.softwareSize = softwareSize;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public int getDevId() {
		return devId;
	}
	public void setDevId(int devId) {
		this.devId = devId;
	}
	public String getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getOnSaleDate() {
		return onSaleDate;
	}
	public void setOnSaleDate(Date onSaleDate) {
		this.onSaleDate = onSaleDate;
	}
	public Date getOffSaleDate() {
		return offSaleDate;
	}
	public void setOffSaleDate(Date offSaleDate) {
		this.offSaleDate = offSaleDate;
	}
	public int getFlatformId() {
		return flatformId;
	}
	public void setFlatformId(int flatformId) {
		this.flatformId = flatformId;
	}
	public int getCategoryLevel3() {
		return categoryLevel3;
	}
	public void setCategoryLevel3(int categoryLevel3) {
		this.categoryLevel3 = categoryLevel3;
	}
	public int getDownloads() {
		return downloads;
	}
	public void setDownloads(int downloads) {
		this.downloads = downloads;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getModifBy() {
		return modifBy;
	}
	public void setModifBy(int modifBy) {
		this.modifBy = modifBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public int getCategoryLevel1() {
		return categoryLevel1;
	}
	public void setCategoryLevel1(int categoryLevel1) {
		this.categoryLevel1 = categoryLevel1;
	}
	public int getCategoryLevel12() {
		return categoryLevel12;
	}
	public void setCategoryLevel12(int categoryLevel12) {
		this.categoryLevel12 = categoryLevel12;
	}
	public String getLogoPicPath() {
		return logoPicPath;
	}
	public void setLogoPicPath(String logoPicPath) {
		this.logoPicPath = logoPicPath;
	}
	public String getLogoLocPath() {
		return logoLocPath;
	}
	public void setLogoLocPath(String logoLocPath) {
		this.logoLocPath = logoLocPath;
	}
	public int getVersionId() {
		return versionId;
	}
	public void setVersionId(int versionId) {
		this.versionId = versionId;
	}
	
}
