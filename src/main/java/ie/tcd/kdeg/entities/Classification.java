package ie.tcd.kdeg.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.apache.tapestry5.beaneditor.Validate;

@Entity
public class Classification extends BaseEntity{
	
	@Validate("required")
	private String classification;
	@Validate("required")
	private String classAuthority;
	private String classAuthorityUri;
	private String classEdition;
	
	private String classValueUri;
	private String classDisplayLabel;
	private String classAltRepGroup;
	private String classUsage;
	private String classLang;
	private String classXmlLang;
	private String classScript;
	private String classTransliteration;
	private String classGenerator;
	

	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;
	
	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getClassValueUri() {
		return classValueUri;
	}

	public void setClassValueUri(String classValueUri) {
		this.classValueUri = classValueUri;
	}

	public String getClassDisplayLabel() {
		return classDisplayLabel;
	}

	public void setClassDisplayLabel(String classDisplayLabel) {
		this.classDisplayLabel = classDisplayLabel;
	}

	public String getClassAltRepGroup() {
		return classAltRepGroup;
	}

	public void setClassAltRepGroup(String classAltRepGroup) {
		this.classAltRepGroup = classAltRepGroup;
	}

	public String getClassUsage() {
		return classUsage;
	}

	public void setClassUsage(String classUsage) {
		this.classUsage = classUsage;
	}

	public String getClassLang() {
		return classLang;
	}

	public void setClassLang(String classLang) {
		this.classLang = classLang;
	}

	public String getClassXmlLang() {
		return classXmlLang;
	}

	public void setClassXmlLang(String classXmlLang) {
		this.classXmlLang = classXmlLang;
	}

	public String getClassScript() {
		return classScript;
	}

	public void setClassScript(String classScript) {
		this.classScript = classScript;
	}

	public String getClassTransliteration() {
		return classTransliteration;
	}

	public void setClassTransliteration(String classTransliteration) {
		this.classTransliteration = classTransliteration;
	}

	public String getClassGenerator() {
		return classGenerator;
	}

	public void setClassGenerator(String classGenerator) {
		this.classGenerator = classGenerator;
	}
	
	@Transient
	public boolean hasAttributes() {
			if(getClassValueUri() == null)
				if(getClassDisplayLabel() == null)
					if(getClassAltRepGroup() == null)
						if(getClassUsage() == null)
								if(getClassLang() == null)
									if(getClassXmlLang() == null)
										if(getClassScript() == null)
											if(getClassTransliteration() == null)
												if(getClassGenerator() == null)
													return false;
		return true;
	}

	public void Attributes() {
		this.classValueUri = null;
		this.classUsage = null;
		this.classDisplayLabel = null;
		this.classAltRepGroup = null;
		this.classGenerator = null;
		this.classLang = null;
		this.classXmlLang = null;
		this.classScript = null;
		this.classTransliteration = null;
	}

	public String getClassAuthority() {
		return classAuthority;
	}

	public void setClassAuthority(String classAuthority) {
		this.classAuthority = classAuthority;
	}

	public String getClassAuthorityUri() {
		return classAuthorityUri;
	}

	public void setClassAuthorityUri(String classAuthorityUri) {
		this.classAuthorityUri = classAuthorityUri;
	}

	
	@Transient 
	public boolean isClassAuthorityDdc() { 
		return classAuthority !=null && "ddc".equals(classAuthority); 
		}
	
	@Transient 
	public boolean isClassAuthorityNlm() { 
		return classAuthority !=null && "nlm".equals(classAuthority); 
		}
	
	@Transient 
	public boolean isClassAuthorityLocal() { 
		return classAuthority !=null && "local".equals(classAuthority); 
		}
	
	
	
	
	
	public String getClassEdition() {
		return classEdition;
	}

	public void setClassEdition(String classEdition) {
		this.classEdition = classEdition;
	}
	
	
	
	

}
