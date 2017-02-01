package ie.tcd.kdeg.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.apache.tapestry5.beaneditor.Validate;

@Entity
public class Identifier extends BaseEntity{
	
	@Validate("required")
	private String identifier;
	private String identType;
	
	private String identInvalid;
	private String identDisplayLabel;
	private String identAltRepGroup;
	private String identLang;
	private String identXmlLang;
	private String identScript;
	private String identTransliteration;
	private String identTypeUri;
	

	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;
	
	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	
	
	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getIdentType() {
		return identType;
	}

	public void setIdentType(String identType) {
		this.identType = identType;
	}

	public String getIdentInvalid() {
		return identInvalid;
	}

	public void setIdentInvalid(String identInvalid) {
		this.identInvalid = identInvalid;
	}

	public String getIdentDisplayLabel() {
		return identDisplayLabel;
	}

	public void setIdentDisplayLabel(String identDisplayLabel) {
		this.identDisplayLabel = identDisplayLabel;
	}

	public String getIdentAltRepGroup() {
		return identAltRepGroup;
	}

	public void setIdentAltRepGroup(String identAltRepGroup) {
		this.identAltRepGroup = identAltRepGroup;
	}

	public String getIdentLang() {
		return identLang;
	}

	public void setIdentLang(String identLang) {
		this.identLang = identLang;
	}

	public String getIdentXmlLang() {
		return identXmlLang;
	}

	public void setIdentXmlLang(String identXmlLang) {
		this.identXmlLang = identXmlLang;
	}

	public String getIdentScript() {
		return identScript;
	}

	public void setIdentScript(String identScript) {
		this.identScript = identScript;
	}

	public String getIdentTransliteration() {
		return identTransliteration;
	}

	public void setIdentTransliteration(String identTransliteration) {
		this.identTransliteration = identTransliteration;
	}

	public String getIdentTypeUri() {
		return identTypeUri;
	}

	public void setIdentTypeUri(String identTypeUri) {
		this.identTypeUri = identTypeUri;
	}

	@Transient
	public boolean hasAttributes() {
				if(getIdentDisplayLabel() == null)
					if(getIdentAltRepGroup() == null)
								if(getIdentLang() == null)
									if(getIdentXmlLang() == null)
										if(getIdentScript() == null)
											if(getIdentTransliteration() == null)
												if(getIdentTypeUri() == null)
													return false;
		return true;
	}

	public void Attributes() {
		this.identDisplayLabel = null;
		this.identAltRepGroup = null;
		this.identTypeUri = null;
		this.identLang = null;
		this.identXmlLang = null;
		this.identScript = null;
		this.identTransliteration = null;
	}

	
	
	
	
	
	
	
}
