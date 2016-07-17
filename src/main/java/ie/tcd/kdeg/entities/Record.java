package ie.tcd.kdeg.entities;

import javax.persistence.Entity;

import org.apache.tapestry5.beaneditor.Validate;

@Entity
public class Record extends BaseEntity {

	private boolean isModsCollection = false;
	
	private boolean isModsRecord = false;
	
	@Validate("required")
	private String drisUnique;

	@Validate("required")
	private Integer drisPageNo;
	
	@Validate("required")
	private Integer drisDocumentNo;
	
	@Validate("required")
	private Integer folderNo;
	
	@Validate("required")
	private Integer ProjectNo;
	
	@Validate("required")
	private Integer digitalRootNo;
	
	@Validate("required")
	private String digitalObjectIdentifier;

	public boolean isModsCollection() {
		return isModsCollection;
	}

	public void setModsCollection(boolean isModsCollection) {
		this.isModsCollection = isModsCollection;
	}

	public boolean isModsRecord() {
		return isModsRecord;
	}

	public void setModsRecord(boolean isModsRecord) {
		this.isModsRecord = isModsRecord;
	}

	public String getDrisUnique() {
		return drisUnique;
	}

	public void setDrisUnique(String drisUnique) {
		this.drisUnique = drisUnique;
	}

	public Integer getDrisPageNo() {
		return drisPageNo;
	}

	public void setDrisPageNo(Integer drisPageNo) {
		this.drisPageNo = drisPageNo;
	}

	public Integer getDrisDocumentNo() {
		return drisDocumentNo;
	}

	public void setDrisDocumentNo(Integer drisDocumentNo) {
		this.drisDocumentNo = drisDocumentNo;
	}

	public Integer getFolderNo() {
		return folderNo;
	}

	public void setFolderNo(Integer folderNo) {
		this.folderNo = folderNo;
	}

	public Integer getProjectNo() {
		return ProjectNo;
	}

	public void setProjectNo(Integer projectNo) {
		ProjectNo = projectNo;
	}

	public Integer getDigitalRootNo() {
		return digitalRootNo;
	}

	public void setDigitalRootNo(Integer digitalRootNo) {
		this.digitalRootNo = digitalRootNo;
	}

	public String getDigitalObjectIdentifier() {
		return digitalObjectIdentifier;
	}

	public void setDigitalObjectIdentifier(String digitalObjectIdentifier) {
		this.digitalObjectIdentifier = digitalObjectIdentifier;
	}
	

}
