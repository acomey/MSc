package ie.tcd.kdeg.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.apache.tapestry5.beaneditor.Validate;

@Entity
public class Toc extends BaseEntity {
	
	@Validate("required")
	private String tableOfContents;
	
	private String tocShareable;
	private String tocType;
	private String tocDisplayLabel;
	private String tocAltRepGroup;
	private String tocAltFormat;
	private String tocContentType;
	private String tocXlink;
	private String tocLang;
	private String tocXmlLang;
	private String tocScript;
	private String tocTransliteration;
	

	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;
	
	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	
	

	public String getTableOfContents() {
		return tableOfContents;
	}

	public void setTableOfContents(String tableOfContents) {
		this.tableOfContents = tableOfContents;
	}

	public String getTocShareable() {
		return tocShareable;
	}

	public void setTocShareable(String tocShareable) {
		this.tocShareable = tocShareable;
	}

	public String getTocType() {
		return tocType;
	}

	public void setTocType(String tocType) {
		this.tocType = tocType;
	}

	public String getTocDisplayLabel() {
		return tocDisplayLabel;
	}

	public void setTocDisplayLabel(String tocDisplayLabel) {
		this.tocDisplayLabel = tocDisplayLabel;
	}

	public String getTocAltRepGroup() {
		return tocAltRepGroup;
	}

	public void setTocAltRepGroup(String tocAltRepGroup) {
		this.tocAltRepGroup = tocAltRepGroup;
	}

	public String getTocAltFormat() {
		return tocAltFormat;
	}

	public void setTocAltFormat(String tocAltFormat) {
		this.tocAltFormat = tocAltFormat;
	}

	public String getTocContentType() {
		return tocContentType;
	}

	public void setTocContentType(String tocContentType) {
		this.tocContentType = tocContentType;
	}

	public String getTocXlink() {
		return tocXlink;
	}

	public void setTocXlink(String tocXlink) {
		this.tocXlink = tocXlink;
	}

	public String getTocLang() {
		return tocLang;
	}

	public void setTocLang(String tocLang) {
		this.tocLang = tocLang;
	}

	public String getTocXmlLang() {
		return tocXmlLang;
	}

	public void setTocXmlLang(String tocXmlLang) {
		this.tocXmlLang = tocXmlLang;
	}

	public String getTocScript() {
		return tocScript;
	}

	public void setTocScript(String tocScript) {
		this.tocScript = tocScript;
	}

	public String getTocTransliteration() {
		return tocTransliteration;
	}

	public void setTocTransliteration(String tocTransliteration) {
		this.tocTransliteration = tocTransliteration;
	}
	
	
	@Transient
	public boolean hasAttributes() {
		if(getTocShareable() == null)
			if(getTocType() == null)
				if(getTocDisplayLabel() == null)
					if(getTocAltRepGroup() == null)
						if(getTocAltFormat() == null)
							if(getTocContentType() == null)
								if(getTocXlink() == null)
									if(getTocLang() == null)
										if(getTocXmlLang() == null)
											if(getTocScript() == null)
												if(getTocTransliteration() == null)
													return false;
		return true;
	}

	public void Attributes() {
		this.tocShareable = null;
		this.tocType = null;
		this.tocDisplayLabel = null;
		this.tocAltRepGroup = null;
		this.tocAltFormat = null;
		this.tocContentType = null;
		this.tocXlink = null;
		this.tocLang = null;
		this.tocXmlLang = null;
		this.tocScript = null;
		this.tocTransliteration = null;
	}
		

}
