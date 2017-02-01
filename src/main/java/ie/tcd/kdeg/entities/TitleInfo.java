package ie.tcd.kdeg.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.apache.tapestry5.beaneditor.Validate;

@Entity
public class TitleInfo extends BaseEntity {
	
	@Validate("required")
	private String tiType;
	private String authority;
	private String uri;
	private String valueUri;
	private String uniformAuthority;
	private String uniformUri;
	private String uniformValueUri;
	
	private String tiDisplayLabel;
	
	private String tiUsage;
	private String tiSupplied;
	private String tiNameTitleGroup;
	private String tiAltRepGroup;
	private String tiAltFormat;
	private String tiContentType;
	private String tiXlink;
	private String tiId;
	private String tiLang; 
	private String tiXmlLang; 
	private String tiScript;
	private String tiTransliteration;
	private String tiOtherType;
	
	private String nonSort;
	private String nonSortLang;
	private String nonSortXmlLang;
	private String nonSortScript;
	private String nonSortTransliteration;
	private String nonSortXmlSpace;
	
	@Validate("required")
	private String title;
	private String titleLang;
	private String titleXmlLang;
	private String titleScript;
	private String titleTransliteration;
	
	private String subtitle;
	private String subtitleLang;
	private String subtitleXmlLang;
	private String subtitleScript;
	private String subtitleTransliteration;
	
	private String partNumber;
	private String partNumberLang;
	private String partNumberXmlLang;
	private String partNumberScript;
	private String partNumberTransliteration;
	
	private String partName;
	private String partNameLang;
	private String partNameXmlLang;
	private String partNameScript;
	private String partNameTransliteration;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;

	public String getTiType() {
		return tiType;
	}

	public void setTiType(String type) {
		this.tiType = type;
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

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
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
	
	public String getTiDisplayLabel() {
		return tiDisplayLabel;
	}

	public void setTiDisplayLabel(String tiDisplayLabel) {
		this.tiDisplayLabel = tiDisplayLabel;
	}

	public String getTiSupplied() {
		return tiSupplied;
	}

	public void setTiSupplied(String tiSupplied) {
		this.tiSupplied = tiSupplied;
	}

	public String getTiNameTitleGroup() {
		return tiNameTitleGroup;
	}

	public void setTiNameTitleGroup(String tiNameTitleGroup) {
		this.tiNameTitleGroup = tiNameTitleGroup;
	}

	public String getTiAltRepGroup() {
		return tiAltRepGroup;
	}

	public void setTiAltRepGroup(String tiAltRepGroup) {
		this.tiAltRepGroup = tiAltRepGroup;
	}

	public String getTiAltFormat() {
		return tiAltFormat;
	}

	public void setTiAltFormat(String tiAltFormat) {
		this.tiAltFormat = tiAltFormat;
	}

	public String getTiContentType() {
		return tiContentType;
	}

	public void setTiContentType(String tiContentType) {
		this.tiContentType = tiContentType;
	}

	public String getTiXlink() {
		return tiXlink;
	}

	public void setTiXlink(String tiXlink) {
		this.tiXlink = tiXlink;
	}

	public String getTiXmlLang() {
		return tiXmlLang;
	}

	public void setTiXmlLang(String tiXmlLang) {
		this.tiXmlLang = tiXmlLang;
	}

	public String getTiScript() {
		return tiScript;
	}

	public void setTiScript(String tiScript) {
		this.tiScript = tiScript;
	}

	public String getTiTransliteration() {
		return tiTransliteration;
	}

	public void setTiTransliteration(String tiTransliteration) {
		this.tiTransliteration = tiTransliteration;
	}

	public String getTiOtherType() {
		return tiOtherType;
	}

	public void setTiOtherType(String tiOtherType) {
		this.tiOtherType = tiOtherType;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	
	@Transient
	public boolean hasTitleInfoType() {
		return tiType != null && !"".equals(tiType);
	}
	
	@Transient
	public boolean isTypeUniform() {
		return tiType != null && "uniform".equals(tiType);
	}
	@Transient
	public boolean isTypeAbbreviated() {
		return tiType != null && "abbreviated".equals(tiType);
	}
	@Transient
	public boolean isTypeAlternative() {
		return tiType != null && "alternative".equals(tiType);
	}
	@Transient
	public boolean isTypeTranslated() {
		return tiType != null && "translated".equals(tiType);
	}
	
	//abbreviated
	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
	public String getValueUri() {
		return valueUri;
	}

	public void setValueUri(String valueUri) {
		this.valueUri = valueUri;
	}
	
	@Transient public boolean getAuthorityDnlm() { return "dnlm".equals(authority); }
	@Transient public boolean getAuthorityHlasja() { return "hlasja".equals(authority); }
	@Transient public boolean getAuthorityInisaljt() { return "inisaljt".equals(authority); }
	@Transient public boolean getAuthorityIssnkey() { return "issnkey".equals(authority); }
	
	//uniform
	
	public String getUniformAuthority() {
		return uniformAuthority;
	}

	public void setUniformAuthority(String uniformAuthority) {
		this.uniformAuthority = uniformAuthority;
	}

	public String getUniformUri() {
		return uniformUri;
	}

	public void setUniformUri(String uniformUri) {
		this.uniformUri = uniformUri;
	}
	
	public String getUniformValueUri() {
		return uniformValueUri;
	}

	public void setUniformValueUri(String uniformValueUri) {
		this.uniformValueUri = uniformValueUri;
	}
	
	@Transient public boolean getAuthorityNaf() { return "naf".equals(authority); }
	@Transient public boolean getAuthorityViaf() { return "viaf".equals(authority); }
	@Transient public boolean getAuthorityUnbisn() { return "unbisn".equals(authority); }
	@Transient public boolean getAuthorityUlan() { return "ulan".equals(authority); }
	
	
	//tiAttribute
	
	public String getTiUsage() {
		return tiUsage;
	}

	public void setTiUsage(String tiUsage) {
		this.tiUsage = tiUsage;
	}

	
	public String getTiId() {
		return tiId;
	}
	
	public void setTiId(String tiId) {
		this.tiId = tiId;
	}
	
	public String getTiLang() {
		return tiLang;
	}

	public void setTiLang(String tiLang) {
		this.tiLang = tiLang;
	}

	
	
	@Transient
	public boolean hasAttributes() {
		if(getTiUsage() == null)
			if(getTiSupplied() == null)
				if(getTiNameTitleGroup() == null)
					if(getTiAltRepGroup() == null)
						if(getTiAltFormat() == null)
							if(getTiContentType() == null)
								if(getTiXlink() == null)
									if(getTiId() == null)
										if(getTiLang() == null)
											if(getTiXmlLang() == null)
												if(getTiScript() == null)
													if(getTiTransliteration() == null)
														if(getTiOtherType() == null)
															return false;
		return true;
	}

	public void Attributes() {
		this.tiUsage = null;
		this.tiSupplied = null;
		this.tiNameTitleGroup = null;
		this.tiAltRepGroup = null;
		this.tiAltFormat = null;
		this.tiContentType = null;
		this.tiXlink = null;
		this.tiId = null;
		this.tiLang = null;
		this.tiXmlLang = null;
		this.tiScript = null;
		this.tiTransliteration = null;
		this.tiOtherType = null;
	}
	
	//nonSort
	public String getNonSortLang() {
		return nonSortLang;
	}

	public void setNonSortLang(String nonSortLang) {
		this.nonSortLang = nonSortLang;
	}

	public String getNonSortXmlLang() {
		return nonSortXmlLang;
	}

	public void setNonSortXmlLang(String nonSortXmlLang) {
		this.nonSortXmlLang = nonSortXmlLang;
	}

	public String getNonSortScript() {
		return nonSortScript;
	}

	public void setNonSortScript(String nonSortScript) {
		this.nonSortScript = nonSortScript;
	}

	public String getNonSortTransliteration() {
		return nonSortTransliteration;
	}

	public void setNonSortTransliteration(String nonSortTransliteration) {
		this.nonSortTransliteration = nonSortTransliteration;
	}
	
	public String getNonSortXmlSpace() {
		return nonSortXmlSpace;
	}
	
	public void setNonSortXmlSpace(String nonSortXmlSpace) {
		this.nonSortXmlSpace = nonSortXmlSpace;
	}
	
	@Transient
	public boolean hasNonSortAttributes() {
		if(getNonSortLang() == null)
			if(getNonSortXmlLang() == null)
				if(getNonSortScript() == null)
					if(getNonSortTransliteration() == null)
						if(getNonSortXmlSpace() == null)
						return false;
		return true;
	}

	public void removeNonSortAttributes() {
		this.nonSortLang = null;
		this.nonSortXmlLang = null;
		this.nonSortScript = null;
		this.nonSortTransliteration = null;
		this.nonSortXmlSpace = null;
	}
	
	//title
	public String getTitleLang() {
		return titleLang;
	}

	public void setTitleLang(String titleLang) {
		this.titleLang = titleLang;
	}

	public String getTitleXmlLang() {
		return titleXmlLang;
	}

	public void setTitleXmlLang(String titleXmlLang) {
		this.titleXmlLang = titleXmlLang;
	}

	public String getTitleScript() {
		return titleScript;
	}

	public void setTitleScript(String titleScript) {
		this.titleScript = titleScript;
	}

	public String getTitleTransliteration() {
		return titleTransliteration;
	}

	public void setTitleTransliteration(String titleTransliteration) {
		this.titleTransliteration = titleTransliteration;
	}

	@Transient
	public boolean hasTitleAttributes() {
		if(getTitleLang() == null)
			if(getTitleXmlLang() == null)
				if(getTitleScript() == null)
					if(getTitleTransliteration() == null)
						return false;
		return true;
	}

	public void removeTitleAttributes() {
		this.titleLang = null;
		this.titleXmlLang = null;
		this.titleScript = null;
		this.titleTransliteration = null;
	}
	
	//subtitle
		public String getSubtitleLang() {
			return subtitleLang;
		}

		public void setSubtitleLang(String subtitleLang) {
			this.subtitleLang = subtitleLang;
		}

		public String getSubtitleXmlLang() {
			return subtitleXmlLang;
		}

		public void setSubtitleXmlLang(String subtitleXmlLang) {
			this.subtitleXmlLang = subtitleXmlLang;
		}

		public String getSubtitleScript() {
			return subtitleScript;
		}

		public void setSubtitleScript(String subtitleScript) {
			this.subtitleScript = subtitleScript;
		}

		public String getSubtitleTransliteration() {
			return subtitleTransliteration;
		}

		public void setSubtitleTransliteration(String subtitleTransliteration) {
			this.subtitleTransliteration = subtitleTransliteration;
		}

		@Transient
		public boolean hasSubtitleAttributes() {
			if(getSubtitleLang() == null)
				if(getSubtitleXmlLang() == null)
					if(getSubtitleScript() == null)
						if(getSubtitleTransliteration() == null)
							return false;
			return true;
		}

		public void removeSubtitleAttributes() {
			this.subtitleLang = null;
			this.subtitleXmlLang = null;
			this.subtitleScript = null;
			this.subtitleTransliteration = null;
		}
		
		//partNumber
		public String getPartNumberLang() {
			return partNumberLang;
		}

		public void setPartNumberLang(String partNumberLang) {
			this.partNumberLang = partNumberLang;
		}

		public String getPartNumberXmlLang() {
			return partNumberXmlLang;
		}

		public void setPartNumberXmlLang(String partNumberXmlLang) {
			this.partNumberXmlLang = partNumberXmlLang;
		}

		public String getPartNumberScript() {
			return partNumberScript;
		}

		public void setPartNumberScript(String partNumberScript) {
			this.partNumberScript = partNumberScript;
		}

		public String getPartNumberTransliteration() {
			return partNumberTransliteration;
		}

		public void setPartNumberTransliteration(String partNumberTransliteration) {
			this.partNumberTransliteration = partNumberTransliteration;
		}
		
		@Transient
		public boolean hasPartNumberAttributes() {
			if(getPartNumberLang() == null)
				if(getPartNumberXmlLang() == null)
					if(getPartNumberScript() == null)
						if(getPartNumberTransliteration() == null)
							return false;
			return true;
		}

		public void removePartNumberAttributes() {
			this.partNumberLang = null;
			this.partNumberXmlLang = null;
			this.partNumberScript = null;
			this.partNumberTransliteration = null;
		}
	
		//partName
		public String getPartNameLang() {
			return partNameLang;
		}

		public void setPartNameLang(String partNameLang) {
			this.partNameLang = partNameLang;
		}

		public String getPartNameXmlLang() {
			return partNameXmlLang;
		}

		public void setPartNameXmlLang(String partNameXmlLang) {
			this.partNameXmlLang = partNameXmlLang;
		}

		public String getPartNameScript() {
			return partNameScript;
		}

		public void setPartNameScript(String partNameScript) {
			this.partNameScript = partNameScript;
		}

		public String getPartNameTransliteration() {
			return partNameTransliteration;
		}

		public void setPartNameTransliteration(String partNameTransliteration) {
			this.partNameTransliteration = partNameTransliteration;
		}
		
		@Transient
		public boolean hasPartNameAttributes() {
			if(getPartNameLang() == null)
				if(getPartNameXmlLang() == null)
					if(getPartNameScript() == null)
						if(getPartNameTransliteration() == null)
							return false;
			return true;
		}

		public void removePartNameAttributes() {
			this.partNameLang = null;
			this.partNameXmlLang = null;
			this.partNameScript = null;
			this.partNameTransliteration = null;
		}

	
		
		
	
		
			
		
		
		
		
		
		
		
}
