package cn.appinfo.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AppInfo {
	private int id;      //����id
	private String softwareName; //��������
	private String APKName;   //APK���ƣ�Ψһ��
	private String supportROM;   //֧��ROM
	private String interfaceLanguage;  //��������
	private BigDecimal softwareSize;  //������С����λ��M��
	private Date updateDate;  //��������
	private int devId;    //������id����Դ�ڣ�dev_user���Ŀ�����id��
	private String appInfo; //Ӧ�ü��
	private int status;   //״̬����Դ�ڣ�data_dictionary��1 ����� 2 ���ͨ�� 3 ��˲�ͨ�� 4 ���ϼ� 5 ���¼ܣ�
	private Date onSaleDate;   //�ϼ�ʱ��
	private Date offSaleDate;  //�¼�ʱ��
	private int flatformId;   //����ƽ̨����Դ�ڣ�data_dictionary��1 �ֻ� 2 ƽ�� 3 ͨ�ã�
	private int categoryLevel3;  //�����������ࣨ��Դ�ڣ�data_dictionary��
	private int downloads;  //����������λ���Σ�
	private int createdBy;  //�����ߣ���Դ��dev_user��������Ϣ�����û�id��
	private Date creationDate; //����ʱ��
	private int modifBy;     //�����ߣ���Դ��dev_user��������Ϣ�����û�id��
	private Date modifyDate;   //���¸���ʱ��
	private int categoryLevel1;  //����һ�����ࣨ��Դ�ڣ�data_dictionary��
	private int categoryLevel12;  //�����������ࣨ��Դ�ڣ�data_dictionary��
	private String logoPicPath;  //LOGOͼƬurl·��
	private String logoLocPath;  //LOGOͼƬ�ķ������洢·��
	private int versionId;   //���µİ汾id
	
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