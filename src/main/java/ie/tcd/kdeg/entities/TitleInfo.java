package ie.tcd.kdeg.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.apache.tapestry5.beaneditor.Validate;

@Entity
public class TitleInfo extends BaseEntity {

	private String type;

	private String displayLabel;
	private String displayLabelLang;
	private String displayLabelXmlLang;
	private String displayLabelScript;
	private String displayLabelTranslation;
	
	private String nonSort;
	
	@Validate("required")
	private String title;
	
	private String subTitle;
	
	private String partNumber;
	
	private String partName;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDisplayLabel() {
		return displayLabel;
	}

	public void setDisplayLabel(String displayLabel) {
		this.displayLabel = displayLabel;
	}

	public String getNonSort() {
		return nonSort;
	}

	public void setNonSort(String nonSort) {
		this.nonSort = nonSort;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	public String getDisplayLabelLang() {
		return displayLabelLang;
	}

	public void setDisplayLabelLang(String displayLabelLang) {
		this.displayLabelLang = displayLabelLang;
	}

	public String getDisplayLabelXmlLang() {
		return displayLabelXmlLang;
	}

	public void setDisplayLabelXmlLang(String displayLabelXmlLang) {
		this.displayLabelXmlLang = displayLabelXmlLang;
	}

	public String getDisplayLabelScript() {
		return displayLabelScript;
	}

	public void setDisplayLabelScript(String displayLabelScript) {
		this.displayLabelScript = displayLabelScript;
	}

	public String getDisplayLabelTranslation() {
		return displayLabelTranslation;
	}

	public void setDisplayLabelTranslation(String displayLabelTranslation) {
		this.displayLabelTranslation = displayLabelTranslation;
	}

	@Transient
	public boolean hasDisplayLabelAttributes() {
		if(getDisplayLabelLang() == null)
			if(getDisplayLabelXmlLang() == null)
				if(getDisplayLabelScript() == null)
					if(getDisplayLabelTranslation() == null)
						return false;
		return true;
	}

	public void removeDisplayAttributes() {
		this.displayLabelLang = null;
		this.displayLabelXmlLang = null;
		this.displayLabelScript = null;
		this.displayLabelTranslation = null;
	}
	
}
