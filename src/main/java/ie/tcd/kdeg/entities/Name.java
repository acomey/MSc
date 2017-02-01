package ie.tcd.kdeg.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

//import org.apache.tapestry5.annotations.InjectComponent;
//import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.beaneditor.Validate;
//import org.apache.tapestry5.corelib.components.Zone;

@Entity
public class Name extends BaseEntity  {
	
	private String nameType;
	private String authority;
	private String authorityUri;
	private String valueUri;

	private String nameDisplayLabel;
	
	private String nameUsage;
	private String nameTitleGroup;
	private String nameAltRepGroup;
	private String nameXlink;
	private String nameId;
	private String nameLang;
	private String nameXmlLang;
	private String nameScript;
	private String nameTransliteration;
	private String nameEtal;
	
	@Validate("required")
	private String namePart;
	private String namePartType;
	private String namePartLang;
	private String namePartXmlLang;
	private String namePartScript;
	private String namePartTransliteration;
	
	private String roleTermText;
	private String roleTermTypeText;
	private String roleTermCode;
	private String roleTermTypeCode;
	private String rtAuthority;
	private String rtAuthorityUri;
	private String rtValueUri;
	private String roleTermTextLang;
	private String roleTermTextXmlLang;
	private String roleTermTextScript;
	private String roleTermTextTransliteration;
	private String roleTermCodeLang;
	private String roleTermCodeXmlLang;
	private String roleTermCodeScript;
	private String roleTermCodeTransliteration;
	
	@Validate("required")
	private String namePart2;
	private String namePartType2;
	private String namePartLang2;
	private String namePartXmlLang2;
	private String namePartScript2;
	private String namePartTransliteration2;
	
	private String role2;
	private String roleTermText2;
	private String roleTermTypeText2;
	private String roleTermCode2;
	private String roleTermTypeCode2;
	private String rtAuthority2;
	private String rtAuthorityUri2;
	private String rtValueUri2;
	private String roleTermTextLang2;
	private String roleTermTextXmlLang2;
	private String roleTermTextScript2;
	private String roleTermTextTransliteration2;
	private String roleTermCodeLang2;
	private String roleTermCodeXmlLang2;
	private String roleTermCodeScript2;
	private String roleTermCodeTransliteration2;
	
	
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;
	
	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	
	
	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	public String getAuthorityUri() {
		return authorityUri;
	}

	public void setAuthorityUri(String authorityUri) {
		this.authorityUri = authorityUri;
	}

	public String getValueUri() {
		return valueUri;
	}

	public void setValueUri(String valueUri) {
		this.valueUri = valueUri;
	}	

	
	public String getNamePart() {
		return namePart;
	}

	public void setNamePart(String namePart) {
		this.namePart = namePart;
	}
	
	//2
	
	public String getNamePart2() {
		return namePart2;
	}

	public void setNamePart2(String namePart2) {
		this.namePart2 = namePart2;
	}
	
	public String getRole2() {
		return role2;
	}

	public void setRole2(String role2) {
		this.role2 = role2;
	}
	
	
	
	
	
	@Transient
	public boolean isAuthorityLocal() {
		return authority != null && "local".equals(authority);
	}
	@Transient
	public boolean isAuthorityDib() {
		return authority != null && "dib".equals(authority);
	}
	@Transient
	public boolean isAuthorityNaf() {
		return authority != null && "naf".equals(authority);
	}
	@Transient
	public boolean isAuthorityUnbis() {
		return authority != null && "unbis".equals(authority);
	}
	@Transient
	public boolean isAuthorityUlan() {
		return authority != null && "ulan".equals(authority);
	}
	@Transient
	public boolean isAuthorityViaf() {
		return authority != null && "viaf".equals(authority);
	}
	
	//nameAttribute
	
	public String getNameUsage() {
		return nameUsage;
	}

	public void setNameUsage(String nameUsage) {
		this.nameUsage = nameUsage;
	}

	public String getNameTitleGroup() {
		return nameTitleGroup;
	}

	public void setNameTitleGroup(String nameTitleGroup) {
		this.nameTitleGroup = nameTitleGroup;
	}

	
	
	public String getNameId() {
		return nameId;
	}
	
	public void setNameId(String nameId) {
		this.nameId = nameId;
	}
	
	

	public String getNameType() {
		return nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}

	public String getNameDisplayLabel() {
		return nameDisplayLabel;
	}

	public void setNameDisplayLabel(String nameDisplayLabel) {
		this.nameDisplayLabel = nameDisplayLabel;
	}

	public String getNameAltRepGroup() {
		return nameAltRepGroup;
	}

	public void setNameAltRepGroup(String nameAltRepGroup) {
		this.nameAltRepGroup = nameAltRepGroup;
	}

	public String getNameXlink() {
		return nameXlink;
	}

	public void setNameXlink(String nameXlink) {
		this.nameXlink = nameXlink;
	}

	public String getNameLang() {
		return nameLang;
	}

	public void setNameLang(String nameLang) {
		this.nameLang = nameLang;
	}

	public String getNameXmlLang() {
		return nameXmlLang;
	}

	public void setNameXmlLang(String nameXmlLang) {
		this.nameXmlLang = nameXmlLang;
	}

	public String getNameScript() {
		return nameScript;
	}

	public void setNameScript(String nameScript) {
		this.nameScript = nameScript;
	}

	public String getNameTransliteration() {
		return nameTransliteration;
	}

	public void setNameTransliteration(String nameTransliteration) {
		this.nameTransliteration = nameTransliteration;
	}

	public String getNameEtal() {
		return nameEtal;
	}

	public void setNameEtal(String nameEtal) {
		this.nameEtal = nameEtal;
	}
	
	
	
	@Transient
	public boolean hasNameAttributes() {
		if(getNameUsage() == null)
				if(getNameTitleGroup() == null)
					if(getNameAltRepGroup() == null)
						if(getNameXlink() == null)
							if(getNameId() == null)
								if(getNameLang() == null)
									if(getNameXmlLang() == null)
										if(getNameScript() == null)
											if(getNameTransliteration() == null)
												if(getNameEtal() == null)
													return false;
		return true;
	}

	public void removeNameAttributes() {
		this.nameUsage = null;
		this.nameTitleGroup = null;
		this.nameAltRepGroup = null;
		this.nameXlink = null;
		this.nameId = null;
		this.nameLang = null;
		this.nameXmlLang = null;
		this.nameScript = null;
		this.nameTransliteration = null;
		this.nameEtal = null;
	}
	
	
	//namePart
	
	public String getNamePartType() {
		return namePartType;
	}

	public void setNamePartType(String namePartType) {
		this.namePartType = namePartType;
	}
	
	public String getNamePartLang() {
		return namePartLang;
	}

	public void setNamePartLang(String namePartLang) {
		this.namePartLang = namePartLang;
	}

	public String getNamePartXmlLang() {
		return namePartXmlLang;
	}

	public void setNamePartXmlLang(String namePartXmlLang) {
		this.namePartXmlLang = namePartXmlLang;
	}

	public String getNamePartScript() {
		return namePartScript;
	}

	public void setNamePartScript(String namePartScript) {
		this.namePartScript = namePartScript;
	}

	public String getNamePartTransliteration() {
		return namePartTransliteration;
	}

	public void setNamePartTransliteration(String namePartTransliteration) {
		this.namePartTransliteration = namePartTransliteration;
	}
	
	@Transient
	public boolean hasNamePartAttributes() {
		if(getNamePartLang() == null)
			if(getNamePartXmlLang() == null)
				if(getNamePartScript() == null)
					if(getNamePartTransliteration() == null)
						return false;
		return true;
	}

	public void removePartNameAttributes() {
		this.namePartLang = null;
		this.namePartXmlLang = null;
		this.namePartScript = null;
		this.namePartTransliteration = null;
	}
	
	
	//role
	
	public String getRoleTermText() {
		return roleTermText;
	}

	public void setRoleTermText(String roleTermText) {
		this.roleTermText = roleTermText;
	}
	
	public String getRoleTermTypeText() {
		return roleTermTypeText;
	}

	public void setRoleTermTypeText(String roleTermTypeText) {
		this.roleTermTypeText = roleTermTypeText;
	}
	
	public String getRoleTermCode() {
		return roleTermCode;
	}

	public void setRoleTermCode(String roleTermCode) {
		this.roleTermCode = roleTermCode;
	}
	
	public String getRoleTermTypeCode() {
		return roleTermTypeCode;
	}

	public void setRoleTermTypeCode(String roleTermTypeCode) {
		this.roleTermTypeCode = roleTermTypeCode;
	}
	
	public String getRtAuthority() {
		return rtAuthority;
	}

	public void setRtAuthority(String rtAuthority) {
		this.rtAuthority = rtAuthority;
	}
	
	public String getRtAuthorityUri() {
		return rtAuthorityUri;
	}

	public void setRtAuthorityUri(String rtAuthorityUri) {
		this.rtAuthorityUri = rtAuthorityUri;
	}
	
	public String getRtValueUri() {
		return rtValueUri;
	}

	public void setRtValueUri(String rtValueUri) {
		this.rtValueUri = rtValueUri;
	}
	
	//roleTerm Text
	
	public String getRoleTermTextLang() {
		return roleTermTextLang;
	}

	public void setRoleTermTextLang(String roleTermTextLang) {
		this.roleTermTextLang = roleTermTextLang;
	}

	public String getRoleTermTextXmlLang() {
		return roleTermTextXmlLang;
	}

	public void setRoleTermTextXmlLang(String roleTermTextXmlLang) {
		this.roleTermTextXmlLang = roleTermTextXmlLang;
	}

	public String getRoleTermTextScript() {
		return roleTermTextScript;
	}

	public void setRoleTermTextScript(String roleTermTextScript) {
		this.roleTermTextScript = roleTermTextScript;
	}

	public String getRoleTermTextTransliteration() {
		return roleTermTextTransliteration;
	}

	public void setRoleTermTextTransliteration(String roleTermTextTransliteration) {
		this.roleTermTextTransliteration = roleTermTextTransliteration;
	}
	
	@Transient
	public boolean hasRoleTermTextAttributes() {
		if(getRoleTermTextLang() == null)
			if(getRoleTermTextXmlLang() == null)
				if(getRoleTermTextScript() == null)
					if(getRoleTermTextTransliteration() == null)
						return false;
		return true;
	}

	public void removeRoleTermTextAttributes() {
		this.roleTermTextLang = null;
		this.roleTermTextXmlLang = null;
		this.roleTermTextScript = null;
		this.roleTermTextTransliteration = null;
	}
	
	//roleTerm Code
	
	public String getRoleTermCodeLang() {
		return roleTermCodeLang;
	}

	public void setRoleTermCodeLang(String roleTermCodeLang) {
		this.roleTermCodeLang = roleTermCodeLang;
	}

	public String getRoleTermCodeXmlLang() {
		return roleTermCodeXmlLang;
	}

	public void setRoleTermCodeXmlLang(String roleTermCodeXmlLang) {
		this.roleTermCodeXmlLang = roleTermCodeXmlLang;
	}

	public String getRoleTermCodeScript() {
		return roleTermCodeScript;
	}

	public void setRoleTermCodeScript(String roleTermCodeScript) {
		this.roleTermCodeScript = roleTermCodeScript;
	}

	public String getRoleTermCodeTransliteration() {
		return roleTermCodeTransliteration;
	}

	public void setRoleTermCodeTransliteration(String roleTermCodeTransliteration) {
		this.roleTermCodeTransliteration = roleTermCodeTransliteration;
	}
	
	@Transient
	public boolean hasRoleTermCodeAttributes() {
		if(getRoleTermCodeLang() == null)
			if(getRoleTermCodeXmlLang() == null)
				if(getRoleTermCodeScript() == null)
					if(getRoleTermCodeTransliteration() == null)
						return false;
		return true;
	}

	public void removeRoleTermCodeAttributes() {
		this.roleTermCodeLang = null;
		this.roleTermCodeXmlLang = null;
		this.roleTermCodeScript = null;
		this.roleTermCodeTransliteration = null;
	}
	
	
	
	
	
	//namePart2
	
		public String getNamePartType2() {
			return namePartType2;
		}

		public void setNamePartType2(String namePartType2) {
			this.namePartType2 = namePartType2;
		}
		
		public String getNamePartLang2() {
			return namePartLang2;
		}

		public void setNamePartLang2(String namePartLang2) {
			this.namePartLang2 = namePartLang2;
		}

		public String getNamePartXmlLang2() {
			return namePartXmlLang2;
		}

		public void setNamePartXmlLang2(String namePartXmlLang2) {
			this.namePartXmlLang2 = namePartXmlLang2;
		}

		public String getNamePartScript2() {
			return namePartScript2;
		}

		public void setNamePartScript2(String namePartScript2) {
			this.namePartScript2 = namePartScript2;
		}

		public String getNamePartTransliteration2() {
			return namePartTransliteration2;
		}

		public void setNamePartTransliteration2(String namePartTransliteration2) {
			this.namePartTransliteration2 = namePartTransliteration2;
		}
		
		@Transient
		public boolean hasNamePartAttributes2() {
			if(getNamePartLang2() == null)
				if(getNamePartXmlLang2() == null)
					if(getNamePartScript2() == null)
						if(getNamePartTransliteration2() == null)
							return false;
			return true;
		}

		public void removePartNameAttributes2() {
			this.namePartLang2 = null;
			this.namePartXmlLang2 = null;
			this.namePartScript2 = null;
			this.namePartTransliteration2 = null;
		}
		
		
		//role
		
		public String getRoleTermText2() {
			return roleTermText2;
		}

		public void setRoleTermText2(String roleTermText2) {
			this.roleTermText2 = roleTermText2;
		}
		
		public String getRoleTermTypeText2() {
			return roleTermTypeText2;
		}

		public void setRoleTermTypeText2(String roleTermTypeText2) {
			this.roleTermTypeText2 = roleTermTypeText2;
		}
		
		public String getRoleTermCode2() {
			return roleTermCode2;
		}

		public void setRoleTermCode2(String roleTermCode2) {
			this.roleTermCode2 = roleTermCode2;
		}
		
		public String getRoleTermTypeCode2() {
			return roleTermTypeCode2;
		}

		public void setRoleTermTypeCode2(String roleTermTypeCode2) {
			this.roleTermTypeCode2 = roleTermTypeCode2;
		}
		
		public String getRtAuthority2() {
			return rtAuthority2;
		}

		public void setRtAuthority2(String rtAuthority2) {
			this.rtAuthority2 = rtAuthority2;
		}
		
		public String getRtAuthorityUri2() {
			return rtAuthorityUri2;
		}

		public void setRtAuthorityUri2(String rtAuthorityUri2) {
			this.rtAuthorityUri2 = rtAuthorityUri2;
		}
		
		public String getRtValueUri2() {
			return rtValueUri2;
		}

		public void setRtValueUri2(String rtValueUri2) {
			this.rtValueUri2 = rtValueUri2;
		}
		
		//roleTerm Text
		
		public String getRoleTermTextLang2() {
			return roleTermTextLang2;
		}

		public void setRoleTermTextLang2(String roleTermTextLang2) {
			this.roleTermTextLang2 = roleTermTextLang2;
		}

		public String getRoleTermTextXmlLang2() {
			return roleTermTextXmlLang2;
		}

		public void setRoleTermTextXmlLang2(String roleTermTextXmlLang2) {
			this.roleTermTextXmlLang2 = roleTermTextXmlLang2;
		}

		public String getRoleTermTextScript2() {
			return roleTermTextScript2;
		}

		public void setRoleTermTextScript2(String roleTermTextScript2) {
			this.roleTermTextScript2 = roleTermTextScript2;
		}

		public String getRoleTermTextTransliteration2() {
			return roleTermTextTransliteration2;
		}

		public void setRoleTermTextTransliteration2(String roleTermTextTransliteration2) {
			this.roleTermTextTransliteration2 = roleTermTextTransliteration2;
		}
		
		@Transient
		public boolean hasRoleTermTextAttributes2() {
			if(getRoleTermTextLang2() == null)
				if(getRoleTermTextXmlLang2() == null)
					if(getRoleTermTextScript2() == null)
						if(getRoleTermTextTransliteration2() == null)
							return false;
			return true;
		}

		public void removeRoleTermTextAttributes2() {
			this.roleTermTextLang2 = null;
			this.roleTermTextXmlLang2 = null;
			this.roleTermTextScript2 = null;
			this.roleTermTextTransliteration2 = null;
		}
		
		//roleTerm Code
		
		public String getRoleTermCodeLang2() {
			return roleTermCodeLang2;
		}

		public void setRoleTermCodeLang2(String roleTermCodeLang2) {
			this.roleTermCodeLang2 = roleTermCodeLang2;
		}

		public String getRoleTermCodeXmlLang2() {
			return roleTermCodeXmlLang2;
		}

		public void setRoleTermCodeXmlLang2(String roleTermCodeXmlLang2) {
			this.roleTermCodeXmlLang2 = roleTermCodeXmlLang2;
		}

		public String getRoleTermCodeScript2() {
			return roleTermCodeScript2;
		}

		public void setRoleTermCodeScript2(String roleTermCodeScript2) {
			this.roleTermCodeScript2 = roleTermCodeScript2;
		}

		public String getRoleTermCodeTransliteration2() {
			return roleTermCodeTransliteration2;
		}

		public void setRoleTermCodeTransliteration2(String roleTermCodeTransliteration2) {
			this.roleTermCodeTransliteration2 = roleTermCodeTransliteration2;
		}
		
		@Transient
		public boolean hasRoleTermCodeAttributes2() {
			if(getRoleTermCodeLang2() == null)
				if(getRoleTermCodeXmlLang2() == null)
					if(getRoleTermCodeScript2() == null)
						if(getRoleTermCodeTransliteration2() == null)
							return false;
			return true;
		}

		public void removeRoleTermCodeAttributes2() {
			this.roleTermCodeLang2 = null;
			this.roleTermCodeXmlLang2 = null;
			this.roleTermCodeScript2 = null;
			this.roleTermCodeTransliteration2 = null;
		}

	
		
			
	
}
