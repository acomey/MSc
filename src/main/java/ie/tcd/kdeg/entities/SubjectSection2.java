package ie.tcd.kdeg.entities;

import java.beans.Transient;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.tapestry5.beaneditor.Validate;

@Entity
public class SubjectSection2 extends BaseEntity{
	
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;
	
	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
		
	
	private String subjectCoordinates;
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
		}
		
		
		
		private String subjectScale;
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
			}
			
			
			
			private String subjectProjection;
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
		
	
	
	
	
	
	
	//code
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
	}
	

}
