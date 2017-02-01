package ie.tcd.kdeg.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.apache.tapestry5.beaneditor.Validate;

@Entity
public class RecordInfo extends BaseEntity {
	
	private String ridisplayLabel;
	private String rialtRepGroup;
	private String rilang;
	private String rixmlLang;
	private String riscript;
	private String ritransliteration;
	
	private String recordContentSource;
	private String rcsAuthority;
	private String rcsAuthorityUri;
	private String rcsValueUri;
	
	private String recordCreationDate;
	private String rcdencoding;
	private String rcdpoint;
	private String rcdkeydate;
	private String rcdqualifier;
	private String rcdlang;
	private String rcdxmlLang;
	private String rcdscript;
	private String rcdtransliteration;
	
	private String recordChangeDate;
	private String rchdencoding;
	private String rchdpoint;
	private String rchdkeydate;
	private String rchdqualifier;
	private String rchdlang;
	private String rchdxmlLang;
	private String rchdscript;
	private String rchdtransliteration;
	
	private int riRecordIdentifier;
	@Validate("required")
	private String ririsource;
	private String ririlang;
	private String ririxmlLang;
	private String ririscript;
	private String riritransliteration;
	
	private String recordOrigin;
	private String rolang;
	private String roxmlLang;
	private String roscript;
	private String rotransliteration;
	
	private String locatobjectPart;
	private String locatusage;
	private String locatdisplayLabel;
	private String locataltRepGroup;
	
	private String locatlangUsage;
	private String locatlangObjectPart;
	private String locatlangDisplayLabel;
	private String locatlangAltRepGroup;
	
	@Validate("required")
	private String locatlanguageTermText;
	@Validate("required")
	private String locatlanguageTermTypeText;
	@Validate("required")
	private String locatlanguageTermCode;
	@Validate("required")
	private String locatlanguageTermTypeCode;
	@Validate("required")
	private String locatlangTermAuthority;
	private String locatlangTermAuthorityUri;
	private String locatlangTermValueUri;
	private String locatlanguageTermTextLang;
	private String locatlanguageTermTextXmlLang;
	private String locatlanguageTermTextScript;
	private String locatlanguageTermTextTransliteration;
	private String locatlanguageTermCodeLang;
	private String locatlanguageTermCodeXmlLang;
	private String locatlanguageTermCodeScript;
	private String locatlanguageTermCodeTransliteration;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;
	
	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	
	@Transient
	public boolean isRcsAuthorityMarcorg() {
		return rcsAuthority != null && "marcorg".equals(rcsAuthority);
	}
	@Transient
	public boolean isRcsAuthorityNone() {
		return rcsAuthority != null && "none".equals(rcsAuthority);
	}
	
	//ri

	public String getRidisplayLabel() {
		return ridisplayLabel;
	}

	public void setRidisplayLabel(String ridisplayLabel) {
		this.ridisplayLabel = ridisplayLabel;
	}

	public String getRialtRepGroup() {
		return rialtRepGroup;
	}

	public void setRialtRepGroup(String rialtRepGroup) {
		this.rialtRepGroup = rialtRepGroup;
	}

	public String getRilang() {
		return rilang;
	}

	public void setRilang(String rilang) {
		this.rilang = rilang;
	}

	public String getRixmlLang() {
		return rixmlLang;
	}

	public void setRixmlLang(String rixmlLang) {
		this.rixmlLang = rixmlLang;
	}

	public String getRiscript() {
		return riscript;
	}

	public void setRiscript(String riscript) {
		this.riscript = riscript;
	}

	public String getRitransliteration() {
		return ritransliteration;
	}

	public void setRitransliteration(String ritransliteration) {
		this.ritransliteration = ritransliteration;
	}
	
	@Transient
	public boolean hasRiAttributes() {
					if(getRialtRepGroup() == null)
						if(getRidisplayLabel() == null)
								if(getRilang() == null)
									if(getRixmlLang() == null)
										if(getRiscript() == null)
											if(getRitransliteration() == null)
													return false;
		return true;
	}

	public void removeRiAttributes() {
		this.ridisplayLabel = null;
		this.rialtRepGroup = null;
		this.rilang = null;
		this.rixmlLang = null;
		this.riscript = null;
		this.ritransliteration = null;
	}
	
	
	
	//rcs

	public String getRecordContentSource() {
		return recordContentSource;
	}

	public void setRecordContentSource(String recordContentSource) {
		this.recordContentSource = recordContentSource;
	}

	public String getRcsAuthority() {
		return rcsAuthority;
	}

	public void setRcsAuthority(String rcsAuthority) {
		this.rcsAuthority = rcsAuthority;
	}
	
	public String getRcsAuthorityUri() {
		return rcsAuthorityUri;
	}

	public void setRcsAuthorityUri(String rcsAuthorityUri) {
		this.rcsAuthorityUri = rcsAuthorityUri;
	}

	public String getRcsValueUri() {
		return rcsValueUri;
	}

	public void setRcsValueUri(String rcsValueUri) {
		this.rcsValueUri = rcsValueUri;
	}
	
	//rcd

	public String getRcdencoding() {
		return rcdencoding;
	}

	public void setRcdencoding(String rcdencoding) {
		this.rcdencoding = rcdencoding;
	}

	public String getRcdpoint() {
		return rcdpoint;
	}

	public void setRcdpoint(String rcdpoint) {
		this.rcdpoint = rcdpoint;
	}

	public String getRcdkeydate() {
		return rcdkeydate;
	}

	public void setRcdkeydate(String rcdkeydate) {
		this.rcdkeydate = rcdkeydate;
	}

	public String getRcdqualifier() {
		return rcdqualifier;
	}

	public void setRcdqualifier(String rcdqualifier) {
		this.rcdqualifier = rcdqualifier;
	}

	public String getRcdlang() {
		return rcdlang;
	}

	public void setRcdlang(String rcdlang) {
		this.rcdlang = rcdlang;
	}

	public String getRcdxmlLang() {
		return rcdxmlLang;
	}

	public void setRcdxmlLang(String rcdxmlLang) {
		this.rcdxmlLang = rcdxmlLang;
	}

	public String getRcdscript() {
		return rcdscript;
	}

	public void setRcdscript(String rcdscript) {
		this.rcdscript = rcdscript;
	}

	public String getRcdtransliteration() {
		return rcdtransliteration;
	}

	public void setRcdtransliteration(String rcdtransliteration) {
		this.rcdtransliteration = rcdtransliteration;
	}
	
	@Transient
	public boolean hasRcdAttributes() {
					if(getRcdencoding() == null)
						if(getRcdpoint() == null)
								if(getRcdlang() == null)
									if(getRcdxmlLang() == null)
										if(getRcdscript() == null)
											if(getRcdtransliteration() == null)
												if(getRcdkeydate() == null)
													if(getRcdqualifier() == null)
													return false;
		return true;
	}

	public void removeRcdAttributes() {
		this.rcdencoding = null;
		this.rcdpoint = null;
		this.rcdkeydate = null;
		this.rcdqualifier = null;
		this.rcdlang = null;
		this.rcdxmlLang = null;
		this.rcdscript = null;
		this.rcdtransliteration = null;
	}
	
	
	//rchd

	public String getRecordChangeDate() {
		return recordChangeDate;
	}

	public void setRecordChangeDate(String recordChangeDate) {
		this.recordChangeDate = recordChangeDate;
	}

	public String getRchdencoding() {
		return rchdencoding;
	}

	public void setRchdencoding(String rchdencoding) {
		this.rchdencoding = rchdencoding;
	}

	public String getRchdpoint() {
		return rchdpoint;
	}

	public void setRchdpoint(String rchdpoint) {
		this.rchdpoint = rchdpoint;
	}

	public String getRchdkeydate() {
		return rchdkeydate;
	}

	public void setRchdkeydate(String rchdkeydate) {
		this.rchdkeydate = rchdkeydate;
	}

	public String getRchdqualifier() {
		return rchdqualifier;
	}

	public void setRchdqualifier(String rchdqualifier) {
		this.rchdqualifier = rchdqualifier;
	}

	public String getRchdlang() {
		return rchdlang;
	}

	public void setRchdlang(String rchdlang) {
		this.rchdlang = rchdlang;
	}

	public String getRchdscript() {
		return rchdscript;
	}

	public void setRchdscript(String rchdscript) {
		this.rchdscript = rchdscript;
	}

	public String getRchdxmlLang() {
		return rchdxmlLang;
	}

	public void setRchdxmlLang(String rchdxmlLang) {
		this.rchdxmlLang = rchdxmlLang;
	}

	public String getRchdtransliteration() {
		return rchdtransliteration;
	}

	public void setRchdtransliteration(String rchdtransliteration) {
		this.rchdtransliteration = rchdtransliteration;
	}
	
	@Transient
	public boolean hasRchdAttributes() {
					if(getRchdencoding() == null)
						if(getRchdpoint() == null)
								if(getRchdlang() == null)
									if(getRchdxmlLang() == null)
										if(getRchdscript() == null)
											if(getRchdtransliteration() == null)
												if(getRchdkeydate() == null)
													if(getRchdqualifier() == null)
													return false;
		return true;
	}

	public void removeRchdAttributes() {
		this.rchdencoding = null;
		this.rchdpoint = null;
		this.rchdkeydate = null;
		this.rchdqualifier = null;
		this.rchdlang = null;
		this.rchdxmlLang = null;
		this.rchdscript = null;
		this.rchdtransliteration = null;
	}
	
	
	
	
	//ri

	public String getRirisource() {
		return ririsource;
	}

	public void setRirisource(String ririsource) {
		this.ririsource = ririsource;
	}

	public String getRirilang() {
		return ririlang;
	}

	public void setRirilang(String ririlang) {
		this.ririlang = ririlang;
	}

	public String getRirixmlLang() {
		return ririxmlLang;
	}

	public void setRirixmlLang(String ririxmlLang) {
		this.ririxmlLang = ririxmlLang;
	}

	public String getRiriscript() {
		return ririscript;
	}

	public void setRiriscript(String ririscript) {
		this.ririscript = ririscript;
	}

	public String getRiritransliteration() {
		return riritransliteration;
	}

	public void setRiritransliteration(String riritransliteration) {
		this.riritransliteration = riritransliteration;
	}
	
	@Transient
	public boolean hasRiriAttributes() {
								if(getRirilang() == null)
									if(getRirixmlLang() == null)
										if(getRiriscript() == null)
											if(getRiritransliteration() == null)
													return false;
		return true;
	}

	public void removeRiriAttributes() {
		this.ririlang = null;
		this.ririxmlLang = null;
		this.ririscript = null;
		this.riritransliteration = null;
	}
	
	//ro

	public String getRecordOrigin() {
		return recordOrigin;
	}

	public void setRecordOrigin(String recordOrigin) {
		this.recordOrigin = recordOrigin;
	}

	public String getRolang() {
		return rolang;
	}

	public void setRolang(String rolang) {
		this.rolang = rolang;
	}

	public String getRoxmlLang() {
		return roxmlLang;
	}

	public void setRoxmlLang(String roxmlLang) {
		this.roxmlLang = roxmlLang;
	}

	public String getRoscript() {
		return roscript;
	}

	public void setRoscript(String roscript) {
		this.roscript = roscript;
	}

	public String getRotransliteration() {
		return rotransliteration;
	}

	public void setRotransliteration(String rotransliteration) {
		this.rotransliteration = rotransliteration;
	}
	
	@Transient
	public boolean hasRoAttributes() {
								if(getRolang() == null)
									if(getRoxmlLang() == null)
										if(getRoscript() == null)
											if(getRotransliteration() == null)
													return false;
		return true;
	}

	public void removeRoAttributes() {
		this.rolang = null;
		this.roxmlLang = null;
		this.roscript = null;
		this.rotransliteration = null;
	}
	
	//locat

	public String getLocatobjectPart() {
		return locatobjectPart;
	}

	public void setLocatobjectPart(String locatobjectPart) {
		this.locatobjectPart = locatobjectPart;
	}

	public String getLocatusage() {
		return locatusage;
	}

	public void setLocatusage(String locatusage) {
		this.locatusage = locatusage;
	}

	public String getLocatdisplayLabel() {
		return locatdisplayLabel;
	}

	public void setLocatdisplayLabel(String locatdisplayLabel) {
		this.locatdisplayLabel = locatdisplayLabel;
	}

	public String getLocataltRepGroup() {
		return locataltRepGroup;
	}

	public void setLocataltRepGroup(String locataltRepGroup) {
		this.locataltRepGroup = locataltRepGroup;
	}

	public String getLocatlangUsage() {
		return locatlangUsage;
	}

	public void setLocatlangUsage(String locatlangUsage) {
		this.locatlangUsage = locatlangUsage;
	}

	public String getLocatlangObjectPart() {
		return locatlangObjectPart;
	}

	public void setLocatlangObjectPart(String locatlangObjectPart) {
		this.locatlangObjectPart = locatlangObjectPart;
	}

	public String getLocatlangDisplayLabel() {
		return locatlangDisplayLabel;
	}

	public void setLocatlangDisplayLabel(String locatlangDisplayLabel) {
		this.locatlangDisplayLabel = locatlangDisplayLabel;
	}

	public String getLocatlangAltRepGroup() {
		return locatlangAltRepGroup;
	}

	public void setLocatlangAltRepGroup(String locatlangAltRepGroup) {
		this.locatlangAltRepGroup = locatlangAltRepGroup;
	}
	
	@Transient
	public boolean hasLocatlangAttributes() {
		if(getLocatusage() == null)
				if(getLocatobjectPart() == null)
					if(getLocataltRepGroup() == null)
						if(getLocatdisplayLabel() == null)
								return false;
		return true;
	}

	public void removeLocallangAttributes() {
		this.locatusage = null;
		this.locatobjectPart = null;
		this.locataltRepGroup = null;
		this.locatdisplayLabel = null;
	}
	
	
	//lang term

	public String getLocatlanguageTermText() {
		return locatlanguageTermText;
	}

	public void setLocatlanguageTermText(String locatlanguageTermText) {
		this.locatlanguageTermText = locatlanguageTermText;
	}

	public String getLocatlanguageTermTypeText() {
		return locatlanguageTermTypeText;
	}

	public void setLocatlanguageTermTypeText(String locatlanguageTermTypeText) {
		this.locatlanguageTermTypeText = locatlanguageTermTypeText;
	}

	public String getLocatlanguageTermCode() {
		return locatlanguageTermCode;
	}

	public void setLocatlanguageTermCode(String locatlanguageTermCode) {
		this.locatlanguageTermCode = locatlanguageTermCode;
	}

	public String getLocatlanguageTermTypeCode() {
		return locatlanguageTermTypeCode;
	}

	public void setLocatlanguageTermTypeCode(String locatlanguageTermTypeCode) {
		this.locatlanguageTermTypeCode = locatlanguageTermTypeCode;
	}

	public String getLocatlangTermAuthority() {
		return locatlangTermAuthority;
	}

	public void setLocatlangTermAuthority(String locatlangTermAuthority) {
		this.locatlangTermAuthority = locatlangTermAuthority;
	}

	public String getLocatlangTermAuthorityUri() {
		return locatlangTermAuthorityUri;
	}

	public void setLocatlangTermAuthorityUri(String locatlangTermAuthorityUri) {
		this.locatlangTermAuthorityUri = locatlangTermAuthorityUri;
	}

	public String getLocatlangTermValueUri() {
		return locatlangTermValueUri;
	}

	public void setLocatlangTermValueUri(String locatlangTermValueUri) {
		this.locatlangTermValueUri = locatlangTermValueUri;
	}

	
	//attributes
	public String getLocatlanguageTermTextLang() {
		return locatlanguageTermTextLang;
	}

	public void setLocatlanguageTermTextLang(String locatlanguageTermTextLang) {
		this.locatlanguageTermTextLang = locatlanguageTermTextLang;
	}

	public String getLocatlanguageTermTextXmlLang() {
		return locatlanguageTermTextXmlLang;
	}

	public void setLocatlanguageTermTextXmlLang(String locatlanguageTermTextXmlLang) {
		this.locatlanguageTermTextXmlLang = locatlanguageTermTextXmlLang;
	}

	public String getLocatlanguageTermTextScript() {
		return locatlanguageTermTextScript;
	}

	public void setLocatlanguageTermTextScript(String locatlanguageTermTextScript) {
		this.locatlanguageTermTextScript = locatlanguageTermTextScript;
	}

	public String getLocatlanguageTermTextTransliteration() {
		return locatlanguageTermTextTransliteration;
	}

	public void setLocatlanguageTermTextTransliteration(String locatlanguageTermTextTransliteration) {
		this.locatlanguageTermTextTransliteration = locatlanguageTermTextTransliteration;
	}
	
	@Transient
	public boolean hasLocatlanguageTermTextAttributes() {
		if(getLocatlanguageTermTextLang() == null)
			if(getLocatlanguageTermTextXmlLang() == null)
				if(getLocatlanguageTermTextScript() == null)
					if(getLocatlanguageTermTextTransliteration() == null)
						return false;
		return true;
	}

	public void removeLocatlanguageTermTextAttributes() {
		this.locatlanguageTermTextLang = null;
		this.locatlanguageTermTextXmlLang = null;
		this.locatlanguageTermTextScript = null;
		this.locatlanguageTermTextTransliteration = null;
	}
	
//attributes
	
	public String getLocatlanguageTermCodeLang() {
		return locatlanguageTermCodeLang;
	}

	public void setLocatlanguageTermCodeLang(String locatlanguageTermCodeLang) {
		this.locatlanguageTermCodeLang = locatlanguageTermCodeLang;
	}

	public String getLocatlanguageTermCodeXmlLang() {
		return locatlanguageTermCodeXmlLang;
	}

	public void setLocatlanguageTermCodeXmlLang(String locatlanguageTermCodeXmlLang) {
		this.locatlanguageTermCodeXmlLang = locatlanguageTermCodeXmlLang;
	}

	public String getLocatlanguageTermCodeScript() {
		return locatlanguageTermCodeScript;
	}

	public void setLocatlanguageTermCodeScript(String locatlanguageTermCodeScript) {
		this.locatlanguageTermCodeScript = locatlanguageTermCodeScript;
	}

	public String getLocatlanguageTermCodeTransliteration() {
		return locatlanguageTermCodeTransliteration;
	}

	public void setLocatlanguageTermCodeTransliteration(String locatlanguageTermCodeTransliteration) {
		this.locatlanguageTermCodeTransliteration = locatlanguageTermCodeTransliteration;
	}
	
	@Transient
	public boolean hasLocatlanguageTermCodeAttributes() {
		if(getLocatlanguageTermCodeLang() == null)
			if(getLocatlanguageTermCodeXmlLang() == null)
				if(getLocatlanguageTermCodeScript() == null)
					if(getLocatlanguageTermCodeTransliteration() == null)
						return false;
		return true;
	}

	public void removeLocatlanguageTermCodeAttributes() {
		this.locatlanguageTermCodeLang = null;
		this.locatlanguageTermCodeXmlLang = null;
		this.locatlanguageTermCodeScript = null;
		this.locatlanguageTermCodeTransliteration = null;
	}

	public String getRecordCreationDate() {
		return recordCreationDate;
	}

	public void setRecordCreationDate(String recordCreationDate) {
		this.recordCreationDate = recordCreationDate;
	}

	public int getRiRecordIdentifier() {
		return riRecordIdentifier;
	}

	public void setRiRecordIdentifier(int riRecordIdentifier) {
		this.riRecordIdentifier = riRecordIdentifier;
	}
	


	
	
	

}
