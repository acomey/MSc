package ie.tcd.kdeg.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.apache.tapestry5.beaneditor.Validate;

@Entity
public class AbstractSection extends BaseEntity {
	
	@Validate("required")
	private String abstractText;
	
	private String abShareable;
	private String abType;
	private String abDisplayLabel;
	private String abAltRepGroup;
	private String abAltFormat;
	private String abContentType;
	private String abXlink;
	private String abLang;
	private String abXmlLang;
	private String abScript;
	private String abTransliteration;
	

	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;
	
	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	
	

	public String getAbstractText() {
		return abstractText;
	}

	public void setAbstractText(String abstractText) {
		this.abstractText = abstractText;
	}

	public String getAbShareable() {
		return abShareable;
	}

	public void setAbShareable(String abShareable) {
		this.abShareable = abShareable;
	}

	public String getAbType() {
		return abType;
	}

	public void setAbType(String abType) {
		this.abType = abType;
	}

	public String getAbDisplayLabel() {
		return abDisplayLabel;
	}

	public void setAbDisplayLabel(String abDisplayLabel) {
		this.abDisplayLabel = abDisplayLabel;
	}

	public String getAbAltRepGroup() {
		return abAltRepGroup;
	}

	public void setAbAltRepGroup(String abAltRepGroup) {
		this.abAltRepGroup = abAltRepGroup;
	}

	public String getAbAltFormat() {
		return abAltFormat;
	}

	public void setAbAltFormat(String abAltFormat) {
		this.abAltFormat = abAltFormat;
	}

	public String getAbContentType() {
		return abContentType;
	}

	public void setAbContentType(String abContentType) {
		this.abContentType = abContentType;
	}

	public String getAbXlink() {
		return abXlink;
	}

	public void setAbXlink(String abXlink) {
		this.abXlink = abXlink;
	}

	public String getAbLang() {
		return abLang;
	}

	public void setAbLang(String abLang) {
		this.abLang = abLang;
	}

	public String getAbXmlLang() {
		return abXmlLang;
	}

	public void setAbXmlLang(String abXmlLang) {
		this.abXmlLang = abXmlLang;
	}

	public String getAbScript() {
		return abScript;
	}

	public void setAbScript(String abScript) {
		this.abScript = abScript;
	}

	public String getAbTransliteration() {
		return abTransliteration;
	}

	public void setAbTransliteration(String abTransliteration) {
		this.abTransliteration = abTransliteration;
	}
	
	
	@Transient
	public boolean hasAttributes() {
		if(getAbShareable() == null)
			if(getAbType() == null)
				if(getAbDisplayLabel() == null)
					if(getAbAltRepGroup() == null)
						if(getAbAltFormat() == null)
							if(getAbContentType() == null)
								if(getAbXlink() == null)
									if(getAbLang() == null)
										if(getAbXmlLang() == null)
											if(getAbScript() == null)
												if(getAbTransliteration() == null)
													return false;
		return true;
	}

	public void Attributes() {
		this.abShareable = null;
		this.abType = null;
		this.abDisplayLabel = null;
		this.abAltRepGroup = null;
		this.abAltFormat = null;
		this.abContentType = null;
		this.abXlink = null;
		this.abLang = null;
		this.abXmlLang = null;
		this.abScript = null;
		this.abTransliteration = null;
	}
	
	

}
