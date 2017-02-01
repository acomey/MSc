package ie.tcd.kdeg.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.apache.tapestry5.beaneditor.Validate;

@Entity
public class Location extends BaseEntity {
	
	
	private String locDisplayLabel;
	private String locAltRepGroup;
	private String locLang;
	private String locXmlLang;
	private String locScript;
	private String locTransliteration;
	
	private String plDisplayLabel;
	private String plType;
	private String plAuthority;
	private String plAuthorityUri;
	private String plValueUri;
	private String plXlink;
	private String plLang;
	private String plXmlLang;
	private String plScript;
	private String plTransliteration;
	private String physicalLocation;
	
	private String locationUrl;
	private String urlDisplayLabel;
	private String urlDateLastAccessed;
	private String urlNote;
	private String urlAccess;
	private String urlUsage;
	

	
	
	
	
	
	
	
	
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;
	
	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	
	
	
	
	
	public String getLocDisplayLabel() {
		return locDisplayLabel;
	}

	public void setLocDisplayLabel(String locDisplayLabel) {
		this.locDisplayLabel = locDisplayLabel;
	}


	public String getLocAltRepGroup() {
		return locAltRepGroup;
	}

	public void setLocAltRepGroup(String locAltRepGroup) {
		this.locAltRepGroup = locAltRepGroup;
	}


	public String getLocLang() {
		return locLang;
	}

	public void setLocLang(String locLang) {
		this.locLang = locLang;
	}


	public String getLocXmlLang() {
		return locXmlLang;
	}

	public void setLocXmlLang(String locXmlLang) {
		this.locXmlLang = locXmlLang;
	}


	public String getLocScript() {
		return locScript;
	}

	public void setLocScript(String locScript) {
		this.locScript = locScript;
	}


	public String getLocTransliteration() {
		return locTransliteration;
	}

	public void setLocTransliteration(String locTransliteration) {
		this.locTransliteration = locTransliteration;
	}
	
	
	@Transient
	public boolean hasAttributes() {
					if(getLocAltRepGroup() == null)
						if(getLocDisplayLabel() == null)
								if(getLocLang() == null)
									if(getLocXmlLang() == null)
										if(getLocScript() == null)
											if(getLocTransliteration() == null)
													return false;
		return true;
	}

	public void Attributes() {
		this.locAltRepGroup = null;
		this.locDisplayLabel = null;
		this.locLang = null;
		this.locXmlLang = null;
		this.locScript = null;
		this.locTransliteration = null;
	}
	
	
	
	
	
	


	public String getPlDisplayLabel() {
		return plDisplayLabel;
	}

	public void setPlDisplayLabel(String plDisplayLabel) {
		this.plDisplayLabel = plDisplayLabel;
	}


	public String getPlType() {
		return plType;
	}

	public void setPlType(String plType) {
		this.plType = plType;
	}


	public String getPlAuthority() {
		return plAuthority;
	}

	public void setPlAuthority(String plAuthority) {
		this.plAuthority = plAuthority;
	}


	public String getPlAuthorityUri() {
		return plAuthorityUri;
	}

	public void setPlAuthorityUri(String plAuthorityUri) {
		this.plAuthorityUri = plAuthorityUri;
	}


	public String getPlValueUri() {
		return plValueUri;
	}

	public void setPlValueUri(String plValueUri) {
		this.plValueUri = plValueUri;
	}


	public String getPlXlink() {
		return plXlink;
	}

	public void setPlXlink(String plXlink) {
		this.plXlink = plXlink;
	}


	public String getPlLang() {
		return plLang;
	}

	public void setPlLang(String plLang) {
		this.plLang = plLang;
	}


	public String getPlXmlLang() {
		return plXmlLang;
	}

	public void setPlXmlLang(String plXmlLang) {
		this.plXmlLang = plXmlLang;
	}


	public String getPlScript() {
		return plScript;
	}

	public void setPlScript(String plScript) {
		this.plScript = plScript;
	}


	public String getPlTransliteration() {
		return plTransliteration;
	}

	public void setPlTransliteration(String plTransliteration) {
		this.plTransliteration = plTransliteration;
	}


	public String getPhysicalLocation() {
		return physicalLocation;
	}

	public void setPhysicalLocation(String physicalLocation) {
		this.physicalLocation = physicalLocation;
	}
	
	
	@Transient
	public boolean hasPlAttributes() {
		if(getPlValueUri() == null)
			if(getPlXlink() == null)
						if(getPlDisplayLabel() == null)
								if(getPlLang() == null)
									if(getPlXmlLang() == null)
										if(getPlScript() == null)
											if(getPlTransliteration() == null)
													return false;
		return true;
	}

	public void PlAttributes() {
		this.plValueUri = null;
		this.plXlink = null;
		this.plDisplayLabel = null;
		this.plLang = null;
		this.plXmlLang = null;
		this.plScript = null;
		this.plTransliteration = null;
	}
	
	@Transient public boolean getPlAuthorityOclcorg() { return "oclcorg".equals(plAuthority); }
	@Transient public boolean getPlAuthorityMarcorg() { return "marcorg".equals(plAuthority); }
	@Transient public boolean getPlAuthorityNone() { return "None".equals(plAuthority); }

	


	public String getUrlDisplayLabel() {
		return urlDisplayLabel;
	}

	public void setUrlDisplayLabel(String urlDisplayLabel) {
		this.urlDisplayLabel = urlDisplayLabel;
	}


	public String getUrlDateLastAccessed() {
		return urlDateLastAccessed;
	}

	public void setUrlDateLastAccessed(String urlDateLastAccessed) {
		this.urlDateLastAccessed = urlDateLastAccessed;
	}

	public String getUrlNote() {
		return urlNote;
	}

	public void setUrlNote(String urlNote) {
		this.urlNote = urlNote;
	}

	public String getUrlAccess() {
		return urlAccess;
	}

	public void setUrlAccess(String urlAccess) {
		this.urlAccess = urlAccess;
	}

	public String getUrlUsage() {
		return urlUsage;
	}

	public void setUrlUsage(String urlUsage) {
		this.urlUsage = urlUsage;
	}
	
	
	@Transient
	public boolean hasUrlAttributes() {
						if(getUrlDisplayLabel() == null)
								if(getUrlNote() == null)
									if(getUrlDateLastAccessed() == null)
													return false;
		return true;
	}

	public void UrlAttributes() {
		this.urlNote = null;
		this.urlDateLastAccessed = null;
		this.urlDisplayLabel = null;
		
	}

	public String getLocationUrl() {
		return locationUrl;
	}

	public void setLocationUrl(String locationUrl) {
		this.locationUrl = locationUrl;
	}


	
	
	
	
	
	

}
