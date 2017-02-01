package ie.tcd.kdeg.entities;

import java.beans.Transient;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.tapestry5.beaneditor.Validate;

@Entity
public class SubjectSection extends BaseEntity {
	
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;
	
	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	
	
	
	@Validate("required")
	private String subAuthority;
	private String subAuthorityUri;
	private String subValueUri;
	private String subDisplayLabel;
	private String subUsage;
	private String subAltRepGroup;
	private String subXlink;
	private String subId;
	private String subLang;
	private String subXmlLang;
	private String subScript;
	private String subTransliteration;
	
	public String getSubAuthority() {
		return subAuthority;
	}
	public void setSubAuthority(String subAuthority) {
		this.subAuthority = subAuthority;
	}
	public String getSubAuthorityUri() {
		return subAuthorityUri;
	}
	public void setSubAuthorityUri(String subAuthorityUri) {
		this.subAuthorityUri = subAuthorityUri;
	}
	public String getSubValueUri() {
		return subValueUri;
	}
	public void setSubValueUri(String subValueUri) {
		this.subValueUri = subValueUri;
	}
	public String getSubDisplayLabel() {
		return subDisplayLabel;
	}
	public void setSubDisplayLabel(String subDisplayLabel) {
		this.subDisplayLabel = subDisplayLabel;
	}
	public String getSubUsage() {
		return subUsage;
	}
	public void setSubUsage(String subUsage) {
		this.subUsage = subUsage;
	}
	public String getSubAltRepGroup() {
		return subAltRepGroup;
	}
	public void setSubAltRepGroup(String subAltRepGroup) {
		this.subAltRepGroup = subAltRepGroup;
	}
	public String getSubXlink() {
		return subXlink;
	}
	public void setSubXlink(String subXlink) {
		this.subXlink = subXlink;
	}
	public String getSubId() {
		return subId;
	}
	public void setSubId(String subId) {
		this.subId = subId;
	}
	public String getSubLang() {
		return subLang;
	}
	public void setSubLang(String subLang) {
		this.subLang = subLang;
	}
	public String getSubXmlLang() {
		return subXmlLang;
	}
	public void setSubXmlLang(String subXmlLang) {
		this.subXmlLang = subXmlLang;
	}
	public String getSubScript() {
		return subScript;
	}
	public void setSubScript(String subScript) {
		this.subScript = subScript;
	}
	public String getSubTransliteration() {
		return subTransliteration;
	}
	public void setSubTransliteration(String subTransliteration) {
		this.subTransliteration = subTransliteration;
	}
	
	
		@Transient
		public boolean hasAttributes() {
							if(getSubAltRepGroup() == null)
								if(getSubDisplayLabel() == null)
									if(getSubXlink() == null)
										if(getSubId() == null)
											if(getSubLang() == null)
												if(getSubXmlLang() == null)
													if(getSubScript() == null)
														if(getSubTransliteration() == null)
																return false;
			return true;
		}
	
		public void Attributes() {
			this.subId = null;
			this.subXlink = null;
			this.subAltRepGroup = null;
			this.subDisplayLabel = null;
			this.subLang = null;
			this.subXmlLang = null;
			this.subScript = null;
			this.subTransliteration = null;
		}
		
		
		//topic
		private String subTopic;
		@Validate("required")
		private String subTopicAuthority;
		private String subTopicAuthorityUri;
		private String subTopicValueUri;
		private String subTopicLang;
		private String subTopicXmlLang;
		private String subTopicScript;
		private String subTopicTransliteration;

		
		public String getSubTopic() {
			return subTopic;
		}
		public void setSubTopic(String subTopic) {
			this.subTopic = subTopic;
		}
		public String getSubTopicAuthority() {
			return subTopicAuthority;
		}
		public void setSubTopicAuthority(String subTopicAuthority) {
			this.subTopicAuthority = subTopicAuthority;
		}
		public String getSubTopicAuthorityUri() {
			return subTopicAuthorityUri;
		}
		public void setSubTopicAuthorityUri(String subTopicAuthorityUri) {
			this.subTopicAuthorityUri = subTopicAuthorityUri;
		}
		public String getSubTopicValueUri() {
			return subTopicValueUri;
		}
		public void setSubTopicValueUri(String subTopicValueUri) {
			this.subTopicValueUri = subTopicValueUri;
		}
		public String getSubTopicLang() {
			return subTopicLang;
		}
		public void setSubTopicLang(String subTopicLang) {
			this.subTopicLang = subTopicLang;
		}
		public String getSubTopicXmlLang() {
			return subTopicXmlLang;
		}
		public void setSubTopicXmlLang(String subTopicXmlLang) {
			this.subTopicXmlLang = subTopicXmlLang;
		}
		public String getSubTopicScript() {
			return subTopicScript;
		}
		public void setSubTopicScript(String subTopicScript) {
			this.subTopicScript = subTopicScript;
		}
		public String getSubTopicTransliteration() {
			return subTopicTransliteration;
		}
		public void setSubTopicTransliteration(String subTopicTransliteration) {
			this.subTopicTransliteration = subTopicTransliteration;
		}
		
		
		
		@Transient
		public boolean hasTopicAttributes() {
			if(getSubTopicAuthority() == null)
					if(getSubTopicAuthorityUri() == null)
						if(getSubTopicValueUri() == null)
							if(getSubTopicLang() == null)
								if(getSubTopicXmlLang() == null)
									if(getSubTopicScript() == null)
										if(getSubTopicTransliteration() == null)
												return false;
			return true;
		}
	
		public void TopicAttributes() {
			this.subTopicAuthority = null;
			this.subTopicAuthorityUri = null;
			this.subTopicValueUri = null;
			this.subTopicLang = null;
			this.subTopicXmlLang = null;
			this.subTopicScript = null;
			this.subTopicTransliteration = null;
		}
		
		
		//geo
		private String subGeographic;
		@Validate("required")
		private String subGeographicAuthority;
		private String subGeographicAuthorityUri;
		private String subGeographicValueUri;
		private String subGeographicLang;
		private String subGeographicXmlLang;
		private String subGeographicScript;
		private String subGeographicTransliteration;
		
		public String getSubGeographic() {
			return subGeographic;
		}
		public void setSubGeographic(String subGeographic) {
			this.subGeographic = subGeographic;
		}
		public String getSubGeographicAuthority() {
			return subGeographicAuthority;
		}
		public void setSubGeographicAuthority(String subGeographicAuthority) {
			this.subGeographicAuthority = subGeographicAuthority;
		}
		public String getSubGeographicAuthorityUri() {
			return subGeographicAuthorityUri;
		}
		public void setSubGeographicAuthorityUri(String subGeographicAuthorityUri) {
			this.subGeographicAuthorityUri = subGeographicAuthorityUri;
		}
		public String getSubGeographicValueUri() {
			return subGeographicValueUri;
		}
		public void setSubGeographicValueUri(String subGeographicValueUri) {
			this.subGeographicValueUri = subGeographicValueUri;
		}
		public String getSubGeographicLang() {
			return subGeographicLang;
		}
		public void setSubGeographicLang(String subGeographicLang) {
			this.subGeographicLang = subGeographicLang;
		}
		public String getSubGeographicXmlLang() {
			return subGeographicXmlLang;
		}
		public void setSubGeographicXmlLang(String subGeographicXmlLang) {
			this.subGeographicXmlLang = subGeographicXmlLang;
		}
		public String getSubGeographicScript() {
			return subGeographicScript;
		}
		public void setSubGeographicScript(String subGeographicScript) {
			this.subGeographicScript = subGeographicScript;
		}
		public String getSubGeographicTransliteration() {
			return subGeographicTransliteration;
		}
		public void setSubGeographicTransliteration(String subGeographicTransliteration) {
			this.subGeographicTransliteration = subGeographicTransliteration;
		}
		
		
		@Transient
		public boolean hasGeographicAttributes() {
			if(getSubGeographicAuthority() == null)
					if(getSubGeographicAuthorityUri() == null)
						if(getSubGeographicValueUri() == null)
							if(getSubGeographicLang() == null)
								if(getSubGeographicXmlLang() == null)
									if(getSubGeographicScript() == null)
										if(getSubGeographicTransliteration() == null)
												return false;
			return true;
		}
	
		public void GeographicAttributes() {
			this.subGeographicAuthority = null;
			this.subGeographicAuthorityUri = null;
			this.subGeographicValueUri = null;
			this.subGeographicLang = null;
			this.subGeographicXmlLang = null;
			this.subGeographicScript = null;
			this.subGeographicTransliteration = null;
		}
		
		
		
		
		//temporal
		private String subTemporal;
		private String subTemporalEncoding;
		private String subTemporalPoint;
		private String subTemporalKeydate;
		@Validate("required")
		private String subTemporalAuthority;
		private String subTemporalAuthorityUri;
		private String subTemporalValueUri;
		private String subTemporalLang;
		private String subTemporalXmlLang;
		private String subTemporalScript;
		private String subTemporalTransliteration;
		
		
		public String getSubTemporal() {
			return subTemporal;
		}
		public void setSubTemporal(String subTemporal) {
			this.subTemporal = subTemporal;
		}
		public String getSubTemporalEncoding() {
			return subTemporalEncoding;
		}
		public void setSubTemporalEncoding(String subTemporalEncoding) {
			this.subTemporalEncoding = subTemporalEncoding;
		}
		public String getSubTemporalPoint() {
			return subTemporalPoint;
		}
		public void setSubTemporalPoint(String subTemporalPoint) {
			this.subTemporalPoint = subTemporalPoint;
		}
		
		public String getSubTemporalKeydate() {
			return subTemporalKeydate;
		}
		public void setSubTemporalKeydate(String subTemporalKeydate) {
			this.subTemporalKeydate = subTemporalKeydate;
		}
		public String getSubTemporalAuthority() {
			return subTemporalAuthority;
		}
		public void setSubTemporalAuthority(String subTemporalAuthority) {
			this.subTemporalAuthority = subTemporalAuthority;
		}
		public String getSubTemporalAuthorityUri() {
			return subTemporalAuthorityUri;
		}
		public void setSubTemporalAuthorityUri(String subTemporalAuthorityUri) {
			this.subTemporalAuthorityUri = subTemporalAuthorityUri;
		}
		public String getSubTemporalValueUri() {
			return subTemporalValueUri;
		}
		public void setSubTemporalValueUri(String subTemporalValueUri) {
			this.subTemporalValueUri = subTemporalValueUri;
		}
		public String getSubTemporalLang() {
			return subTemporalLang;
		}
		public void setSubTemporalLang(String subTemporalLang) {
			this.subTemporalLang = subTemporalLang;
		}
		public String getSubTemporalXmlLang() {
			return subTemporalXmlLang;
		}
		public void setSubTemporalXmlLang(String subTemporalXmlLang) {
			this.subTemporalXmlLang = subTemporalXmlLang;
		}
		public String getSubTemporalScript() {
			return subTemporalScript;
		}
		public void setSubTemporalScript(String subTemporalScript) {
			this.subTemporalScript = subTemporalScript;
		}
		public String getSubTemporalTransliteration() {
			return subTemporalTransliteration;
		}
		public void setSubTemporalTransliteration(String subTemporalTransliteration) {
			this.subTemporalTransliteration = subTemporalTransliteration;
		}
		
		@Transient
		public boolean hasTemporalAttributes() {
			if(getSubTemporalEncoding() == null)
					if(getSubTemporalPoint() == null)
						if(getSubTemporalKeydate() == null)
							if(getSubTemporalAuthority() == null)
									if(getSubTemporalAuthorityUri() == null)
										if(getSubTemporalValueUri() == null)
											if(getSubTemporalLang() == null)
												if(getSubTemporalXmlLang() == null)
													if(getSubTemporalScript() == null)
														if(getSubTemporalTransliteration() == null)
												return false;
			return true;
		}
	
		public void TemporalAttributes() {
			this.subTemporalEncoding = null;
			this.subTemporalPoint = null;
			this.subTemporalKeydate = null;
			this.subTemporalAuthority = null;
			this.subTemporalAuthorityUri = null;
			this.subTemporalValueUri = null;
			this.subTemporalLang = null;
			this.subTemporalXmlLang = null;
			this.subTemporalScript = null;
			this.subTemporalTransliteration = null;
		}
		
		
		//hg
		//private String subHierarchicalGeographic;
		private String subHierarchicalGeographicAuthority;
		private String subHierarchicalGeographicAuthorityUri;
		private String subHierarchicalGeographicValueUri;
		
			
			@Transient
			public boolean hasHierarchicalGeographicAttributes() {
				if(getSubHierarchicalGeographicAuthority() == null)
						if(getSubHierarchicalGeographicAuthorityUri() == null)
							if(getSubHierarchicalGeographicValueUri() == null)
													return false;
				return true;
			}
		
			public void HierarchicalGeographicAttributes() {
				this.subHierarchicalGeographicAuthority = null;
				this.subHierarchicalGeographicAuthorityUri = null;
				this.subHierarchicalGeographicValueUri = null;
			}
		
		
		
		private String hgCountry;
		private String hgCountryLevel;
		private String hgCountryPeriod;
		private String hgCountryAuthority;
		private String hgCountryAuthorityUri;
		private String hgCountryValueUri;
		private String hgCountryLang;
		private String hgCountryXmlLang;
		private String hgCountryScript;
		private String hgCountryTransliteration;
		
			
			
			@Transient
			public boolean hasHgCountryAttributes() {
				if(getHgCountryLevel() == null)
					if(getHgCountryPeriod() == null)
						if(getHgCountryAuthority() == null)
								if(getHgCountryAuthorityUri() == null)
									if(getHgCountryValueUri() == null)
										if(getHgCountryLang() == null)
											if(getHgCountryXmlLang() == null)
												if(getHgCountryScript() == null)
													if(getHgCountryTransliteration() == null)
															return false;
				return true;
			}
		
			public void HgCountryAttributes() {
				this.hgCountryLevel = null;
				this.hgCountryPeriod = null;
				this.hgCountryAuthority = null;
				this.hgCountryAuthorityUri = null;
				this.hgCountryValueUri = null;
				this.hgCountryLang = null;
				this.hgCountryXmlLang = null;
				this.hgCountryScript = null;
				this.hgCountryTransliteration = null;
			}
		
		
		
		
		private String hgRegion;
		private String hgRegionLevel;
		private String hgRegionPeriod;
		private String hgRegionAuthority;
		private String hgRegionAuthorityUri;
		private String hgRegionValueUri;
		private String hgRegionLang;
		private String hgRegionXmlLang;
		private String hgRegionScript;
		private String hgRegionTransliteration;
			
			
			@Transient
			public boolean hasHgRegionAttributes() {
				if(getHgRegionLevel() == null)
					if(getHgRegionPeriod() == null)
						if(getHgRegionAuthority() == null)
								if(getHgRegionAuthorityUri() == null)
									if(getHgRegionValueUri() == null)
										if(getHgRegionLang() == null)
											if(getHgRegionXmlLang() == null)
												if(getHgRegionScript() == null)
													if(getHgRegionTransliteration() == null)
															return false;
				return true;
			}
		
			public void HgRegionAttributes() {
				this.hgRegionLevel = null;
				this.hgRegionPeriod = null;
				this.hgRegionAuthority = null;
				this.hgRegionAuthorityUri = null;
				this.hgRegionValueUri = null;
				this.hgRegionLang = null;
				this.hgRegionXmlLang = null;
				this.hgRegionScript = null;
				this.hgRegionTransliteration = null;
			}
		
		
		
		private String hgCounty;
		private String hgCountyLevel;
		private String hgCountyPeriod;
		private String hgCountyAuthority;
		private String hgCountyAuthorityUri;
		private String hgCountyValueUri;
		private String hgCountyLang;
		private String hgCountyXmlLang;
		private String hgCountyScript;
		private String hgCountyTransliteration;
		
		
			@Transient
			public boolean hasHgCountyAttributes() {
				if(getHgCountyLevel() == null)
					if(getHgCountyPeriod() == null)
						if(getHgCountyAuthority() == null)
								if(getHgCountyAuthorityUri() == null)
									if(getHgCountyValueUri() == null)
										if(getHgCountyLang() == null)
											if(getHgCountyXmlLang() == null)
												if(getHgCountyScript() == null)
													if(getHgCountyTransliteration() == null)
															return false;
				return true;
			}
		
			public void HgCountyAttributes() {
				this.hgCountyLevel = null;
				this.hgCountyPeriod = null;
				this.hgCountyAuthority = null;
				this.hgCountyAuthorityUri = null;
				this.hgCountyValueUri = null;
				this.hgCountyLang = null;
				this.hgCountyXmlLang = null;
				this.hgCountyScript = null;
				this.hgCountyTransliteration = null;
			}
		
		
		
		private String hgCity;
		private String hgCityLevel;
		private String hgCityPeriod;
		private String hgCityAuthority;
		private String hgCityAuthorityUri;
		private String hgCityValueUri;
		private String hgCityLang;
		private String hgCityXmlLang;
		private String hgCityScript;
		private String hgCityTransliteration;
		
			@Transient
			public boolean hasHgCityAttributes() {
				if(getHgCityLevel() == null)
					if(getHgCityPeriod() == null)
						if(getHgCityAuthority() == null)
								if(getHgCityAuthorityUri() == null)
									if(getHgCityValueUri() == null)
										if(getHgCityLang() == null)
											if(getHgCityXmlLang() == null)
												if(getHgCityScript() == null)
													if(getHgCityTransliteration() == null)
															return false;
				return true;
			}
		
			public void HgCityAttributes() {
				this.hgCityLevel = null;
				this.hgCityPeriod = null;
				this.hgCityAuthority = null;
				this.hgCityAuthorityUri = null;
				this.hgCityValueUri = null;
				this.hgCityLang = null;
				this.hgCityXmlLang = null;
				this.hgCityScript = null;
				this.hgCityTransliteration = null;
			}
			
			
			
			public String getSubHierarchicalGeographicAuthority() {
				return subHierarchicalGeographicAuthority;
			}
			public void setSubHierarchicalGeographicAuthority(String subHierarchicalGeographicAuthority) {
				this.subHierarchicalGeographicAuthority = subHierarchicalGeographicAuthority;
			}
			public String getSubHierarchicalGeographicAuthorityUri() {
				return subHierarchicalGeographicAuthorityUri;
			}
			public void setSubHierarchicalGeographicAuthorityUri(String subHierarchicalGeographicAuthorityUri) {
				this.subHierarchicalGeographicAuthorityUri = subHierarchicalGeographicAuthorityUri;
			}
			public String getSubHierarchicalGeographicValueUri() {
				return subHierarchicalGeographicValueUri;
			}
			public void setSubHierarchicalGeographicValueUri(String subHierarchicalGeographicValueUri) {
				this.subHierarchicalGeographicValueUri = subHierarchicalGeographicValueUri;
			}
			public String getHgCountry() {
				return hgCountry;
			}
			public void setHgCountry(String hgCountry) {
				this.hgCountry = hgCountry;
			}
			public String getHgCountryLevel() {
				return hgCountryLevel;
			}
			public void setHgCountryLevel(String hgCountryLevel) {
				this.hgCountryLevel = hgCountryLevel;
			}
			public String getHgCountryPeriod() {
				return hgCountryPeriod;
			}
			public void setHgCountryPeriod(String hgCountryPeriod) {
				this.hgCountryPeriod = hgCountryPeriod;
			}
			public String getHgCountryAuthority() {
				return hgCountryAuthority;
			}
			public void setHgCountryAuthority(String hgCountryAuthority) {
				this.hgCountryAuthority = hgCountryAuthority;
			}
			public String getHgCountryAuthorityUri() {
				return hgCountryAuthorityUri;
			}
			public void setHgCountryAuthorityUri(String hgCountryAuthorityUri) {
				this.hgCountryAuthorityUri = hgCountryAuthorityUri;
			}
			public String getHgCountryValueUri() {
				return hgCountryValueUri;
			}
			public void setHgCountryValueUri(String hgCountryValueUri) {
				this.hgCountryValueUri = hgCountryValueUri;
			}
			public String getHgCountryLang() {
				return hgCountryLang;
			}
			public void setHgCountryLang(String hgCountryLang) {
				this.hgCountryLang = hgCountryLang;
			}
			public String getHgCountryXmlLang() {
				return hgCountryXmlLang;
			}
			public void setHgCountryXmlLang(String hgCountryXmlLang) {
				this.hgCountryXmlLang = hgCountryXmlLang;
			}
			public String getHgCountryScript() {
				return hgCountryScript;
			}
			public void setHgCountryScript(String hgCountryScript) {
				this.hgCountryScript = hgCountryScript;
			}
			public String getHgCountryTransliteration() {
				return hgCountryTransliteration;
			}
			public void setHgCountryTransliteration(String hgCountryTransliteration) {
				this.hgCountryTransliteration = hgCountryTransliteration;
			}
			public String getHgRegion() {
				return hgRegion;
			}
			public void setHgRegion(String hgRegion) {
				this.hgRegion = hgRegion;
			}
			public String getHgRegionLevel() {
				return hgRegionLevel;
			}
			public void setHgRegionLevel(String hgRegionLevel) {
				this.hgRegionLevel = hgRegionLevel;
			}
			public String getHgRegionPeriod() {
				return hgRegionPeriod;
			}
			public void setHgRegionPeriod(String hgRegionPeriod) {
				this.hgRegionPeriod = hgRegionPeriod;
			}
			public String getHgRegionAuthority() {
				return hgRegionAuthority;
			}
			public void setHgRegionAuthority(String hgRegionAuthority) {
				this.hgRegionAuthority = hgRegionAuthority;
			}
			public String getHgRegionAuthorityUri() {
				return hgRegionAuthorityUri;
			}
			public void setHgRegionAuthorityUri(String hgRegionAuthorityUri) {
				this.hgRegionAuthorityUri = hgRegionAuthorityUri;
			}
			public String getHgRegionValueUri() {
				return hgRegionValueUri;
			}
			public void setHgRegionValueUri(String hgRegionValueUri) {
				this.hgRegionValueUri = hgRegionValueUri;
			}
			public String getHgRegionLang() {
				return hgRegionLang;
			}
			public void setHgRegionLang(String hgRegionLang) {
				this.hgRegionLang = hgRegionLang;
			}
			public String getHgRegionXmlLang() {
				return hgRegionXmlLang;
			}
			public void setHgRegionXmlLang(String hgRegionXmlLang) {
				this.hgRegionXmlLang = hgRegionXmlLang;
			}
			public String getHgRegionScript() {
				return hgRegionScript;
			}
			public void setHgRegionScript(String hgRegionScript) {
				this.hgRegionScript = hgRegionScript;
			}
			public String getHgRegionTransliteration() {
				return hgRegionTransliteration;
			}
			public void setHgRegionTransliteration(String hgRegionTransliteration) {
				this.hgRegionTransliteration = hgRegionTransliteration;
			}
			public String getHgCounty() {
				return hgCounty;
			}
			public void setHgCounty(String hgCounty) {
				this.hgCounty = hgCounty;
			}
			public String getHgCountyLevel() {
				return hgCountyLevel;
			}
			public void setHgCountyLevel(String hgCountyLevel) {
				this.hgCountyLevel = hgCountyLevel;
			}
			public String getHgCountyPeriod() {
				return hgCountyPeriod;
			}
			public void setHgCountyPeriod(String hgCountyPeriod) {
				this.hgCountyPeriod = hgCountyPeriod;
			}
			public String getHgCountyAuthority() {
				return hgCountyAuthority;
			}
			public void setHgCountyAuthority(String hgCountyAuthority) {
				this.hgCountyAuthority = hgCountyAuthority;
			}
			public String getHgCountyAuthorityUri() {
				return hgCountyAuthorityUri;
			}
			public void setHgCountyAuthorityUri(String hgCountyAuthorityUri) {
				this.hgCountyAuthorityUri = hgCountyAuthorityUri;
			}
			public String getHgCountyValueUri() {
				return hgCountyValueUri;
			}
			public void setHgCountyValueUri(String hgCountyValueUri) {
				this.hgCountyValueUri = hgCountyValueUri;
			}
			public String getHgCountyLang() {
				return hgCountyLang;
			}
			public void setHgCountyLang(String hgCountyLang) {
				this.hgCountyLang = hgCountyLang;
			}
			public String getHgCountyXmlLang() {
				return hgCountyXmlLang;
			}
			public void setHgCountyXmlLang(String hgCountyXmlLang) {
				this.hgCountyXmlLang = hgCountyXmlLang;
			}
			public String getHgCountyScript() {
				return hgCountyScript;
			}
			public void setHgCountyScript(String hgCountyScript) {
				this.hgCountyScript = hgCountyScript;
			}
			public String getHgCountyTransliteration() {
				return hgCountyTransliteration;
			}
			public void setHgCountyTransliteration(String hgCountyTransliteration) {
				this.hgCountyTransliteration = hgCountyTransliteration;
			}
			public String getHgCity() {
				return hgCity;
			}
			public void setHgCity(String hgCity) {
				this.hgCity = hgCity;
			}
			public String getHgCityLevel() {
				return hgCityLevel;
			}
			public void setHgCityLevel(String hgCityLevel) {
				this.hgCityLevel = hgCityLevel;
			}
			public String getHgCityPeriod() {
				return hgCityPeriod;
			}
			public void setHgCityPeriod(String hgCityPeriod) {
				this.hgCityPeriod = hgCityPeriod;
			}
			public String getHgCityAuthority() {
				return hgCityAuthority;
			}
			public void setHgCityAuthority(String hgCityAuthority) {
				this.hgCityAuthority = hgCityAuthority;
			}
			public String getHgCityAuthorityUri() {
				return hgCityAuthorityUri;
			}
			public void setHgCityAuthorityUri(String hgCityAuthorityUri) {
				this.hgCityAuthorityUri = hgCityAuthorityUri;
			}
			public String getHgCityValueUri() {
				return hgCityValueUri;
			}
			public void setHgCityValueUri(String hgCityValueUri) {
				this.hgCityValueUri = hgCityValueUri;
			}
			public String getHgCityLang() {
				return hgCityLang;
			}
			public void setHgCityLang(String hgCityLang) {
				this.hgCityLang = hgCityLang;
			}
			public String getHgCityXmlLang() {
				return hgCityXmlLang;
			}
			public void setHgCityXmlLang(String hgCityXmlLang) {
				this.hgCityXmlLang = hgCityXmlLang;
			}
			public String getHgCityScript() {
				return hgCityScript;
			}
			public void setHgCityScript(String hgCityScript) {
				this.hgCityScript = hgCityScript;
			}
			public String getHgCityTransliteration() {
				return hgCityTransliteration;
			}
			public void setHgCityTransliteration(String hgCityTransliteration) {
				this.hgCityTransliteration = hgCityTransliteration;
			}
			
			
			
			
//TODO Below are the rest of the Subject elements that, for some reason, will not work unless they are in a separate form (SubjectSection2). 
			//These need to be added to SubjectSection so that SubjectSeciton2 can be deleted.			
			
			
			
			
		/*	private String subjectCoordinates;
			private String coordinatesLang;
			private String coordinatesXmlLang;
			private String coordinatesScript;
			private String coordinatesTransliteration;
			
			@Transient
			public boolean hasCoordinatesAttributes() {
										if(getCoordinatesLang() == null)
											if(getCoordinatesXmlLang() == null)
												if(getCoordinatesScript() == null)
													if(getCoordinatesTransliteration() == null)
															return false;
				return true;
			}

			public String getCoordinatesLang() {
				return coordinatesLang;
			}

			public void setCoordinatesLang(String coordinatesLang) {
				this.coordinatesLang = coordinatesLang;
			}

			public String getSubjectCoordinates() {
				return subjectCoordinates;
			}

			public void setSubjectCoordinates(String subjectCoordinates) {
				this.subjectCoordinates = subjectCoordinates;
			}

			public String getCoordinatesXmlLang() {
				return coordinatesXmlLang;
			}

			public void setCoordinatesXmlLang(String coordinatesXmlLang) {
				this.coordinatesXmlLang = coordinatesXmlLang;
			}

			public String getCoordinatesScript() {
				return coordinatesScript;
			}

			public void setCoordinatesScript(String coordinatesScript) {
				this.coordinatesScript = coordinatesScript;
			}

			public String getCoordinatesTransliteration() {
				return coordinatesTransliteration;
			}

			public void setCoordinatesTransliteration(String coordinatesTransliteration) {
				this.coordinatesTransliteration = coordinatesTransliteration;
			}
		
			public void coordinatesAttributes() {
				this.coordinatesLang = null;
				this.coordinatesXmlLang = null;
				this.coordinatesScript = null;
				this.coordinatesTransliteration = null;
			}*/
			
			
			
			/*private String subjectScale;
			private String scaleLang;
			private String scaleXmlLang;
			private String scaleScript;
			private String scaleTransliteration;
			
			@Transient
			public boolean hasScaleAttributes() {
										if(getScaleLang() == null)
											if(getScaleXmlLang() == null)
												if(getScaleScript() == null)
													if(getScaleTransliteration() == null)
															return false;
				return true;
			}

			public String getScaleLang() {
				return scaleLang;
			}

			public void setScaleLang(String scaleLang) {
				this.scaleLang = scaleLang;
			}

			public String getSubjectScale() {
				return subjectScale;
			}

			public void setSubjectScale(String subjectScale) {
				this.subjectScale = subjectScale;
			}

			public String getScaleXmlLang() {
				return scaleXmlLang;
			}

			public void setScaleXmlLang(String scaleXmlLang) {
				this.scaleXmlLang = scaleXmlLang;
			}

			public String getScaleScript() {
				return scaleScript;
			}

			public void setScaleScript(String scaleScript) {
				this.scaleScript = scaleScript;
			}

			public String getScaleTransliteration() {
				return scaleTransliteration;
			}

			public void setScaleTransliteration(String scaleTransliteration) {
				this.scaleTransliteration = scaleTransliteration;
			}
		
			public void scaleAttributes() {
				this.scaleLang = null;
				this.scaleXmlLang = null;
				this.scaleScript = null;
				this.scaleTransliteration = null;
			}*/
			
			
			
		/*	private String subjectProjection;
			private String projectionLang;
			private String projectionXmlLang;
			private String projectionScript;
			private String projectionTransliteration;
				
			@Transient
			public boolean hasProjectionAttributes() {
										if(getProjectionLang() == null)
											if(getProjectionXmlLang() == null)
												if(getProjectionScript() == null)
													if(getProjectionTransliteration() == null)
															return false;
				return true;
			}

			public String getProjectionLang() {
				return projectionLang;
			}

			public void setProjectionLang(String projectionLang) {
				this.projectionLang = projectionLang;
			}

			public String getSubjectProjection() {
				return subjectProjection;
			}

			public void setSubjectProjection(String subjectProjection) {
				this.subjectProjection = subjectProjection;
			}

			public String getProjectionXmlLang() {
				return projectionXmlLang;
			}

			public void setProjectionXmlLang(String projectionXmlLang) {
				this.projectionXmlLang = projectionXmlLang;
			}

			public String getProjectionScript() {
				return projectionScript;
			}

			public void setProjectionScript(String projectionScript) {
				this.projectionScript = projectionScript;
			}

			public String getProjectionTransliteration() {
				return projectionTransliteration;
			}

			public void setProjectionTransliteration(String projectionTransliteration) {
				this.projectionTransliteration = projectionTransliteration;
			}
		
			public void projectionAttributes() {
				this.projectionLang = null;
				this.projectionXmlLang = null;
				this.projectionScript = null;
				this.projectionTransliteration = null;
			}
	*/
			
			
		/*	//code
			private String subGeographicCode;
			@Validate("required")
			private String subGeographicCodeAuthority;
			private String subGeographicCodeAuthorityUri;
			private String subGeographicCodeValueUri;
			private String subGeographicCodeLang;
			private String subGeographicCodeXmlLang;
			private String subGeographicCodeScript;
			private String subGeographicCodeTransliteration;
			
			

			@Transient
			public boolean hasGeographicCodeAttributes() {
								if(getSubGeographicCodeAuthority() == null)
										if(getSubGeographicCodeAuthorityUri() == null)
											if(getSubGeographicCodeValueUri() == null)
												if(getSubGeographicCodeLang() == null)
													if(getSubGeographicCodeXmlLang() == null)
														if(getSubGeographicCodeScript() == null)
															if(getSubGeographicCodeTransliteration() == null)
													return false;
				return true;
			}

			public void GeographicCodeAttributes() {
				this.subGeographicCodeAuthority = null;
				this.subGeographicCodeAuthorityUri = null;
				this.subGeographicCodeValueUri = null;
				this.subGeographicCodeLang = null;
				this.subGeographicCodeXmlLang = null;
				this.subGeographicCodeScript = null;
				this.subGeographicCodeTransliteration = null;
			}
			
			public String getSubGeographicCodeAuthority() {
				return subGeographicCodeAuthority;
			}
			public void setSubGeographicCodeAuthority(String subGeographicCodeAuthority) {
				this.subGeographicCodeAuthority = subGeographicCodeAuthority;
			}
			public String getSubGeographicCodeAuthorityUri() {
				return subGeographicCodeAuthorityUri;
			}
			public void setSubGeographicCodeAuthorityUri(String subGeographicCodeAuthorityUri) {
				this.subGeographicCodeAuthorityUri = subGeographicCodeAuthorityUri;
			}
			public String getSubGeographicCodeValueUri() {
				return subGeographicCodeValueUri;
			}
			public void setSubGeographicCodeValueUri(String subGeographicCodeValueUri) {
				this.subGeographicCodeValueUri = subGeographicCodeValueUri;
			}
			public String getSubGeographicCodeLang() {
				return subGeographicCodeLang;
			}
			public void setSubGeographicCodeLang(String subGeographicCodeLang) {
				this.subGeographicCodeLang = subGeographicCodeLang;
			}
			public String getSubGeographicCodeXmlLang() {
				return subGeographicCodeXmlLang;
			}
			public void setSubGeographicCodeXmlLang(String subGeographicCodeXmlLang) {
				this.subGeographicCodeXmlLang = subGeographicCodeXmlLang;
			}
			public String getSubGeographicCodeScript() {
				return subGeographicCodeScript;
			}
			public void setSubGeographicCodeScript(String subGeographicCodeScript) {
				this.subGeographicCodeScript = subGeographicCodeScript;
			}
			public String getSubGeographicCodeTransliteration() {
				return subGeographicCodeTransliteration;
			}
			public void setSubGeographicCodeTransliteration(String subGeographicCodeTransliteration) {
				this.subGeographicCodeTransliteration = subGeographicCodeTransliteration;
			}
			
			public String getSubGeographicCode() {
				return subGeographicCode;
			}

			public void setSubGeographicCode(String subGeographicCode) {
				this.subGeographicCode = subGeographicCode;
			}*/
			
			
			
			
			
			
			
			
			

		
	

}
