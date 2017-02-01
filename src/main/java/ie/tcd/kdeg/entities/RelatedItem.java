package ie.tcd.kdeg.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.apache.tapestry5.beaneditor.Validate;

@Entity
public class RelatedItem extends BaseEntity {
	
	@Validate("required")
	private String relatedType;
	private String relatedDisplayLabel;
	private String relatedXlinkHref;
	private String relatedId;
	private String relatedOtherType;
	private String relatedOtherTypeAuth;
	private String relatedOtherTypeAuthUri;
	private String relatedOtherTypeUri;
	
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;
	
	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	
	
	public String getRelatedType() {
		return relatedType;
	}
	public void setRelatedType(String relatedType) {
		this.relatedType = relatedType;
	}
	public String getRelatedDisplayLabel() {
		return relatedDisplayLabel;
	}
	public void setRelatedDisplayLabel(String relatedDisplayLabel) {
		this.relatedDisplayLabel = relatedDisplayLabel;
	}
	public String getRelatedXlinkHref() {
		return relatedXlinkHref;
	}
	public void setRelatedXlinkHref(String relatedXlinkHref) {
		this.relatedXlinkHref = relatedXlinkHref;
	}
	public String getRelatedId() {
		return relatedId;
	}
	public void setRelatedId(String relatedId) {
		this.relatedId = relatedId;
	}
	public String getRelatedOtherType() {
		return relatedOtherType;
	}
	public void setRelatedOtherType(String relatedOtherType) {
		this.relatedOtherType = relatedOtherType;
	}
	public String getRelatedOtherTypeAuth() {
		return relatedOtherTypeAuth;
	}
	public void setRelatedOtherTypeAuth(String relatedOtherTypeAuth) {
		this.relatedOtherTypeAuth = relatedOtherTypeAuth;
	}
	public String getRelatedOtherTypeAuthUri() {
		return relatedOtherTypeAuthUri;
	}
	public void setRelatedOtherTypeAuthUri(String relatedOtherTypeAuthUri) {
		this.relatedOtherTypeAuthUri = relatedOtherTypeAuthUri;
	}
	public String getRelatedOtherTypeUri() {
		return relatedOtherTypeUri;
	}
	public void setRelatedOtherTypeUri(String relatedOtherTypeUri) {
		this.relatedOtherTypeUri = relatedOtherTypeUri;
	}
	
	
	@Transient
	public boolean hasAttributes() {
				if(getRelatedDisplayLabel() == null)
					if(getRelatedXlinkHref() == null)
						if(getRelatedId() == null)
							if(getRelatedOtherType() == null)
								if(getRelatedOtherTypeAuth() == null)
									if(getRelatedOtherTypeAuthUri() == null)
										if(getRelatedOtherTypeUri() == null)
													return false;
		return true;
	}

	public void Attributes() {
		this.relatedDisplayLabel = null;
		this.relatedXlinkHref = null;
		this.relatedId = null;
		this.relatedOtherType = null;
		this.relatedOtherTypeAuth = null;
		this.relatedOtherTypeAuthUri = null;
		this.relatedOtherTypeUri = null;
	}
	
	
	
	

}
