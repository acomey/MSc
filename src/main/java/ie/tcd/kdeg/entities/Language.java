package ie.tcd.kdeg.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.apache.tapestry5.beaneditor.Validate;

@Entity
public class Language extends BaseEntity {
	
	
	private String langUsage;
	private String langObjectPart;
	private String langDisplayLabel;
	private String langAltRepGroup;
	private String langLang;
	private String langXmlLang;
	private String langScript;
	private String langTransliteration;
	
	@Validate("required")
	private String languageTermText;
	@Validate("required")
	private String languageTermTypeText;
	@Validate("required")
	private String languageTermCode;
	@Validate("required")
	private String languageTermTypeCode;
	@Validate("required")
	private String langTermAuthority;
	private String langTermAuthorityUri;
	private String langTermValueUri;
	private String languageTermTextLang;
	private String languageTermTextXmlLang;
	private String languageTermTextScript;
	private String languageTermTextTransliteration;
	private String languageTermCodeLang;
	private String languageTermCodeXmlLang;
	private String languageTermCodeScript;
	private String languageTermCodeTransliteration;
	
	private String languageTerm2;
	private String languageTermText2;
	private String languageTermTypeText2;
	private String languageTermCode2;
	private String languageTermTypeCode2;
	private String langTermAuthority2;
	private String langTermAuthorityUri2;
	private String langTermValueUri2;
	private String languageTermTextLang2;
	private String languageTermTextXmlLang2;
	private String languageTermTextScript2;
	private String languageTermTextTransliteration2;
	private String languageTermCodeLang2;
	private String languageTermCodeXmlLang2;
	private String languageTermCodeScript2;
	private String languageTermCodeTransliteration2;
	
	
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;
	
	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	
	//attributes

	public String getLangUsage() {
		return langUsage;
	}

	public void setLangUsage(String langUsage) {
		this.langUsage = langUsage;
	}

	
	
	
	public String getLangObjectPart() {
		return langObjectPart;
	}

	public void setLangObjectPart(String langObjectPart) {
		this.langObjectPart = langObjectPart;
	}

	public String getLangDisplayLabel() {
		return langDisplayLabel;
	}

	public void setLangDisplayLabel(String langDisplayLabel) {
		this.langDisplayLabel = langDisplayLabel;
	}

	public String getLangAltRepGroup() {
		return langAltRepGroup;
	}

	public void setLangAltRepGroup(String langAltRepGroup) {
		this.langAltRepGroup = langAltRepGroup;
	}

	public String getLangLang() {
		return langLang;
	}

	public void setLangLang(String langLang) {
		this.langLang = langLang;
	}

	public String getLangXmlLang() {
		return langXmlLang;
	}

	public void setLangXmlLang(String langXmlLang) {
		this.langXmlLang = langXmlLang;
	}

	public String getLangScript() {
		return langScript;
	}

	public void setLangScript(String langScript) {
		this.langScript = langScript;
	}

	public String getLangTransliteration() {
		return langTransliteration;
	}

	public void setLangTransliteration(String langTransliteration) {
		this.langTransliteration = langTransliteration;
	}
	
	
	@Transient
	public boolean hasLangAttributes() {
		if(getLangUsage() == null)
				if(getLangObjectPart() == null)
					if(getLangAltRepGroup() == null)
						if(getLangDisplayLabel() == null)
								if(getLangLang() == null)
									if(getLangXmlLang() == null)
										if(getLangScript() == null)
											if(getLangTransliteration() == null)
													return false;
		return true;
	}

	public void removeLangAttributes() {
		this.langUsage = null;
		this.langObjectPart = null;
		this.langAltRepGroup = null;
		this.langDisplayLabel = null;
		this.langLang = null;
		this.langXmlLang = null;
		this.langScript = null;
		this.langTransliteration = null;
	}
	
	
	
	
	
	//LanguageTerm 
	

	public String getLanguageTermText() {
		return languageTermText;
	}

	public void setLanguageTermText(String languageTermText) {
		this.languageTermText = languageTermText;
	}

	public String getLanguageTermTypeText() {
		return languageTermTypeText;
	}

	public void setLanguageTermTypeText(String languageTermTypeText) {
		this.languageTermTypeText = languageTermTypeText;
	}

	public String getLanguageTermCode() {
		return languageTermCode;
	}

	public void setLanguageTermCode(String languageTermCode) {
		this.languageTermCode = languageTermCode;
	}

	public String getLanguageTermTypeCode() {
		return languageTermTypeCode;
	}

	public void setLanguageTermTypeCode(String languageTermTypeCode) {
		this.languageTermTypeCode = languageTermTypeCode;
	}

	public String getLangTermAuthority() {
		return langTermAuthority;
	}

	public void setLangTermAuthority(String langTermAuthority) {
		this.langTermAuthority = langTermAuthority;
	}

	public String getLangTermAuthorityUri() {
		return langTermAuthorityUri;
	}

	public void setLangTermAuthorityUri(String langTermAuthorityUri) {
		this.langTermAuthorityUri = langTermAuthorityUri;
	}

	public String getLangTermValueUri() {
		return langTermValueUri;
	}

	public void setLangTermValueUri(String langTermValueUri) {
		this.langTermValueUri = langTermValueUri;
	}
	
	
	//LTT attributes

	public String getLanguageTermTextLang() {
		return languageTermTextLang;
	}

	public void setLanguageTermTextLang(String languageTermTextLang) {
		this.languageTermTextLang = languageTermTextLang;
	}

	public String getLanguageTermTextXmlLang() {
		return languageTermTextXmlLang;
	}

	public void setLanguageTermTextXmlLang(String languageTermTextXmlLang) {
		this.languageTermTextXmlLang = languageTermTextXmlLang;
	}

	public String getLanguageTermTextScript() {
		return languageTermTextScript;
	}

	public void setLanguageTermTextScript(String languageTermTextScript) {
		this.languageTermTextScript = languageTermTextScript;
	}

	public String getLanguageTermTextTransliteration() {
		return languageTermTextTransliteration;
	}

	public void setLanguageTermTextTransliteration(String languageTermTextTransliteration) {
		this.languageTermTextTransliteration = languageTermTextTransliteration;
	}
	
	
	@Transient
	public boolean hasLanguageTermTextAttributes() {
		if(getLanguageTermTextLang() == null)
			if(getLanguageTermTextXmlLang() == null)
				if(getLanguageTermTextScript() == null)
					if(getLanguageTermTextTransliteration() == null)
						return false;
		return true;
	}

	public void removeLanguageTermTextAttributes() {
		this.languageTermTextLang = null;
		this.languageTermTextXmlLang = null;
		this.languageTermTextScript = null;
		this.languageTermTextTransliteration = null;
	}
	
	
// LTC attributes
	
	public String getLanguageTermCodeLang() {
		return languageTermCodeLang;
	}

	public void setLanguageTermCodeLang(String languageTermCodeLang) {
		this.languageTermCodeLang = languageTermCodeLang;
	}

	public String getLanguageTermCodeXmlLang() {
		return languageTermCodeXmlLang;
	}

	public void setLanguageTermCodeXmlLang(String languageTermCodeXmlLang) {
		this.languageTermCodeXmlLang = languageTermCodeXmlLang;
	}

	public String getLanguageTermCodeScript() {
		return languageTermCodeScript;
	}

	public void setLanguageTermCodeScript(String languageTermCodeScript) {
		this.languageTermCodeScript = languageTermCodeScript;
	}

	public String getLanguageTermCodeTransliteration() {
		return languageTermCodeTransliteration;
	}

	public void setLanguageTermCodeTransliteration(String languageTermCodeTransliteration) {
		this.languageTermCodeTransliteration = languageTermCodeTransliteration;
	}
	
	public String getLanguageTerm2() {
		return languageTerm2;
	}

	public void setLanguageTerm2(String languageTerm2) {
		this.languageTerm2 = languageTerm2;
	}

	@Transient
	public boolean hasLanguageTermCodeAttributes() {
		if(getLanguageTermCodeLang() == null)
			if(getLanguageTermCodeXmlLang() == null)
				if(getLanguageTermCodeScript() == null)
					if(getLanguageTermCodeTransliteration() == null)
						return false;
		return true;
	}

	public void removeLanguageTermCodeAttributes() {
		this.languageTermCodeLang = null;
		this.languageTermCodeXmlLang = null;
		this.languageTermCodeScript = null;
		this.languageTermCodeTransliteration = null;
	}
	
	
	//LangTerm 2

	public String getLanguageTermText2() {
		return languageTermText2;
	}

	public void setLanguageTermText2(String languageTermText2) {
		this.languageTermText2 = languageTermText2;
	}

	public String getLanguageTermTypeText2() {
		return languageTermTypeText2;
	}

	public void setLanguageTermTypeText2(String languageTermTypeText2) {
		this.languageTermTypeText2 = languageTermTypeText2;
	}

	public String getLanguageTermCode2() {
		return languageTermCode2;
	}

	public void setLanguageTermCode2(String languageTermCode2) {
		this.languageTermCode2 = languageTermCode2;
	}

	public String getLanguageTermTypeCode2() {
		return languageTermTypeCode2;
	}

	public void setLanguageTermTypeCode2(String languageTermTypeCode2) {
		this.languageTermTypeCode2 = languageTermTypeCode2;
	}

	public String getLangTermAuthority2() {
		return langTermAuthority2;
	}

	public void setLangTermAuthority2(String langTermAuthority2) {
		this.langTermAuthority2 = langTermAuthority2;
	}

	public String getLangTermAuthorityUri2() {
		return langTermAuthorityUri2;
	}

	public void setLangTermAuthorityUri2(String langTermAuthorityUri2) {
		this.langTermAuthorityUri2 = langTermAuthorityUri2;
	}

	public String getLangTermValueUri2() {
		return langTermValueUri2;
	}

	public void setLangTermValueUri2(String langTermValueUri2) {
		this.langTermValueUri2 = langTermValueUri2;
	}

	
	
	// LTT2 attributes
	
	public String getLanguageTermTextLang2() {
		return languageTermTextLang2;
	}

	public void setLanguageTermTextLang2(String languageTermTextLang2) {
		this.languageTermTextLang2 = languageTermTextLang2;
	}

	public String getLanguageTermTextXmlLang2() {
		return languageTermTextXmlLang2;
	}

	public void setLanguageTermTextXmlLang2(String languageTermTextXmlLang2) {
		this.languageTermTextXmlLang2 = languageTermTextXmlLang2;
	}

	public String getLanguageTermTextScript2() {
		return languageTermTextScript2;
	}

	public void setLanguageTermTextScript2(String languageTermTextScript2) {
		this.languageTermTextScript2 = languageTermTextScript2;
	}

	public String getLanguageTermTextTransliteration2() {
		return languageTermTextTransliteration2;
	}

	public void setLanguageTermTextTransliteration2(String languageTermTextTransliteration2) {
		this.languageTermTextTransliteration2 = languageTermTextTransliteration2;
	}
	
	@Transient
	public boolean hasLanguageTermText2Attributes() {
		if(getLanguageTermTextLang2() == null)
			if(getLanguageTermTextXmlLang2() == null)
				if(getLanguageTermTextScript2() == null)
					if(getLanguageTermTextTransliteration2() == null)
						return false;
		return true;
	}

	public void removeLanguageTermText2Attributes() {
		this.languageTermTextLang2 = null;
		this.languageTermTextXmlLang2 = null;
		this.languageTermTextScript2 = null;
		this.languageTermTextTransliteration2 = null;
	}
	
	
	//LTC2 attributes

	public String getLanguageTermCodeLang2() {
		return languageTermCodeLang2;
	}

	public void setLanguageTermCodeLang2(String languageTermCodeLang2) {
		this.languageTermCodeLang2 = languageTermCodeLang2;
	}

	public String getLanguageTermCodeXmlLang2() {
		return languageTermCodeXmlLang2;
	}

	public void setLanguageTermCodeXmlLang2(String languageTermCodeXmlLang2) {
		this.languageTermCodeXmlLang2 = languageTermCodeXmlLang2;
	}

	public String getLanguageTermCodeScript2() {
		return languageTermCodeScript2;
	}

	public void setLanguageTermCodeScript2(String languageTermCodeScript2) {
		this.languageTermCodeScript2 = languageTermCodeScript2;
	}

	public String getLanguageTermCodeTransliteration2() {
		return languageTermCodeTransliteration2;
	}

	public void setLanguageTermCodeTransliteration2(String languageTermCodeTransliteration2) {
		this.languageTermCodeTransliteration2 = languageTermCodeTransliteration2;
	}
	
	@Transient
	public boolean hasLanguageTermCode2Attributes() {
		if(getLanguageTermCodeLang2() == null)
			if(getLanguageTermCodeXmlLang2() == null)
				if(getLanguageTermCodeScript2() == null)
					if(getLanguageTermCodeTransliteration2() == null)
						return false;
		return true;
	}

	public void removeLanguageTermCode2Attributes() {
		this.languageTermCodeLang2 = null;
		this.languageTermCodeXmlLang2 = null;
		this.languageTermCodeScript2 = null;
		this.languageTermCodeTransliteration2 = null;
	}

	

}
