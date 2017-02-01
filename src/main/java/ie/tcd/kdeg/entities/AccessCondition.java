package ie.tcd.kdeg.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.apache.tapestry5.beaneditor.Validate;
	
@Entity
public class AccessCondition extends BaseEntity{
	
	@Validate("required")
	private String accessCondition;
	private String accessType;
	private String accessDisplayLabel;
	private String accessAltRepGroup;
	private String accessAltFormat;
	private String accessContentType;
	private String accessXlink;
	private String accessLang;
	private String accessXmlLang;
	private String accessScript;
	private String accessTransliteration;
	
	@Validate("required")
	private String accessCondition1;
	@Validate("required")
	private String accessType1;
	private String accessDisplayLabel1;
	private String accessAltRepGroup1;
	private String accessAltFormat1;
	private String accessContentType1;
	private String accessXlink1;
	private String accessLang1;
	private String accessXmlLang1;
	private String accessScript1;
	private String accessTransliteration1;
	
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;
	
	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	

	public String getAccessCondition() {
		return accessCondition;
	}

	public void setAccessCondition(String accessCondition) {
		this.accessCondition = accessCondition;
	}

	public String getAccessType() {
		return accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public String getAccessDisplayLabel() {
		return accessDisplayLabel;
	}

	public void setAccessDisplayLabel(String accessDisplayLabel) {
		this.accessDisplayLabel = accessDisplayLabel;
	}

	public String getAccessAltRepGroup() {
		return accessAltRepGroup;
	}

	public void setAccessAltRepGroup(String accessAltRepGroup) {
		this.accessAltRepGroup = accessAltRepGroup;
	}

	public String getAccessAltFormat() {
		return accessAltFormat;
	}

	public void setAccessAltFormat(String accessAltFormat) {
		this.accessAltFormat = accessAltFormat;
	}

	public String getAccessContentType() {
		return accessContentType;
	}

	public void setAccessContentType(String accessContentType) {
		this.accessContentType = accessContentType;
	}

	public String getAccessXlink() {
		return accessXlink;
	}

	public void setAccessXlink(String accessXlink) {
		this.accessXlink = accessXlink;
	}

	public String getAccessLang() {
		return accessLang;
	}

	public void setAccessLang(String accessLang) {
		this.accessLang = accessLang;
	}

	public String getAccessXmlLang() {
		return accessXmlLang;
	}

	public void setAccessXmlLang(String accessXmlLang) {
		this.accessXmlLang = accessXmlLang;
	}

	public String getAccessScript() {
		return accessScript;
	}

	public void setAccessScript(String accessScript) {
		this.accessScript = accessScript;
	}

	public String getAccessTransliteration() {
		return accessTransliteration;
	}

	public void setAccessTransliteration(String accessTransliteration) {
		this.accessTransliteration = accessTransliteration;
	}

	@Transient
	public boolean hasAttributes() {
				if(getAccessDisplayLabel() == null)
					if(getAccessAltRepGroup() == null)
						if(getAccessAltFormat() == null)
							if(getAccessContentType() == null)
								if(getAccessXlink() == null)
									if(getAccessLang() == null)
										if(getAccessXmlLang() == null)
											if(getAccessScript() == null)
												if(getAccessTransliteration() == null)
													return false;
		return true;
	}

	public void Attributes() {
		this.accessDisplayLabel = null;
		this.accessAltRepGroup = null;
		this.accessAltFormat = null;
		this.accessContentType = null;
		this.accessXlink = null;
		this.accessLang = null;
		this.accessXmlLang = null;
		this.accessScript = null;
		this.accessTransliteration = null;
	}
	
	
	
	
	
	
	
	
	
	public String getAccessCondition1() {
		return accessCondition1;
	}

	public void setAccessCondition1(String accessCondition1) {
		this.accessCondition1 = accessCondition1;
	}

	public String getAccessType1() {
		return accessType1;
	}

	public void setAccessType1(String accessType1) {
		this.accessType1 = accessType1;
	}

	public String getAccessDisplayLabel1() {
		return accessDisplayLabel1;
	}

	public void setAccessDisplayLabel1(String accessDisplayLabel1) {
		this.accessDisplayLabel1 = accessDisplayLabel1;
	}

	public String getAccessAltRepGroup1() {
		return accessAltRepGroup1;
	}

	public void setAccessAltRepGroup1(String accessAltRepGroup1) {
		this.accessAltRepGroup1 = accessAltRepGroup1;
	}

	public String getAccessAltFormat1() {
		return accessAltFormat1;
	}

	public void setAccessAltFormat1(String accessAltFormat1) {
		this.accessAltFormat1 = accessAltFormat1;
	}

	public String getAccessContentType1() {
		return accessContentType1;
	}

	public void setAccessContentType1(String accessContentType1) {
		this.accessContentType1 = accessContentType1;
	}

	public String getAccessXlink1() {
		return accessXlink1;
	}

	public void setAccessXlink1(String accessXlink1) {
		this.accessXlink1 = accessXlink1;
	}

	public String getAccessLang1() {
		return accessLang1;
	}

	public void setAccessLang1(String accessLang1) {
		this.accessLang1 = accessLang1;
	}

	public String getAccessXmlLang1() {
		return accessXmlLang1;
	}

	public void setAccessXmlLang1(String accessXmlLang1) {
		this.accessXmlLang1 = accessXmlLang1;
	}

	public String getAccessScript1() {
		return accessScript1;
	}

	public void setAccessScript1(String accessScript1) {
		this.accessScript1 = accessScript1;
	}

	public String getAccessTransliteration1() {
		return accessTransliteration1;
	}

	public void setAccessTransliteration1(String accessTransliteration1) {
		this.accessTransliteration1 = accessTransliteration1;
	}
	
	@Transient
	public boolean hasAttributes1() {
				if(getAccessDisplayLabel1() == null)
					if(getAccessAltRepGroup1() == null)
						if(getAccessAltFormat1() == null)
							if(getAccessContentType1() == null)
								if(getAccessXlink1() == null)
									if(getAccessLang1() == null)
										if(getAccessXmlLang1() == null)
											if(getAccessScript1() == null)
												if(getAccessTransliteration1() == null)
													return false;
		return true;
	}

	public void Attributes1() {
		this.accessDisplayLabel1 = null;
		this.accessAltRepGroup1 = null;
		this.accessAltFormat1 = null;
		this.accessContentType1 = null;
		this.accessXlink1 = null;
		this.accessLang1 = null;
		this.accessXmlLang1 = null;
		this.accessScript1 = null;
		this.accessTransliteration1 = null;
	}
	
		

}
