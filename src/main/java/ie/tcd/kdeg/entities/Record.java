package ie.tcd.kdeg.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.apache.tapestry5.beaneditor.Validate;

@Entity
public class Record extends BaseEntity {

	//private boolean isModsCollection = false;
	
	//private boolean isModsRecord = false;
	
	@Validate("required")
	private int drisUnique;

	@Validate("required")
	private String drisPageNo;
	
	@Validate("required")
	private String drisDocumentNo;
	
	@Validate("required")
	private int folderNo;
	
	@Validate("required")
	private String ProjectNo;
	
	@Validate("required")
	private String digitalRootNo;
	
	//@Validate("required")
	//private String digitalObjectIdentifier;

	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
	private List<TitleInfo> titleInfos = new ArrayList<TitleInfo>();
	
	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
	private List<Name> names = new ArrayList<Name>();
	
	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
	private List<Tor> tors = new ArrayList<Tor>();
	
	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
	private List<Genre> genres = new ArrayList<Genre>();
	
	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
	private List<Language> languages = new ArrayList<Language>();
	
	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
	private List<AbstractSection> abstractSections = new ArrayList<AbstractSection>();
	
	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
	private List<Toc> tocs = new ArrayList<Toc>();
	
	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
	private List<Note> notes = new ArrayList<Note>();
	
	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
	private List<Classification> classifications = new ArrayList<Classification>();
	
	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
	private List<Identifier> identifiers = new ArrayList<Identifier>();
	
	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
	private List<AccessCondition> accessConditions = new ArrayList<AccessCondition>();
	
	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
	private List<RelatedItem> relatedItems = new ArrayList<RelatedItem>();
	
	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
	private List<SubjectSection> subjectSections = new ArrayList<SubjectSection>();
	
	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
	private List<SubjectSection2> subjectSections2 = new ArrayList<SubjectSection2>();
	
	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
	private List<Location> locations = new ArrayList<Location>();
	
	@OneToMany(mappedBy = "record", cascade = CascadeType.ALL)
	private List<RecordInfo> recordInfos = new ArrayList<RecordInfo>();
	
	

	/*public boolean isModsCollection() {
		return isModsCollection;
	}

	public void setModsCollection(boolean isModsCollection) {
		this.isModsCollection = isModsCollection;
	}*/

	//public boolean isModsRecord() {
		//return isModsRecord;
	//}

	//public void setModsRecord(boolean isModsRecord) {
		//this.isModsRecord = isModsRecord;
	//}

	public int getDrisUnique() {
		return drisUnique;
	}
	
	public void setDrisUnique(int drisUnique) {
		this.drisUnique = drisUnique;
	}

	public String getDrisPageNo() {
		return drisPageNo;
	}

	public void setDrisPageNo(String drisPageNo) {
		this.drisPageNo = "page_" + drisPageNo;
	}

	public String getDrisDocumentNo() {
		return drisDocumentNo;
	}

	public void setDrisDocumentNo(String drisDocumentNo) {
		this.drisDocumentNo = drisDocumentNo;
	}

	public int getFolderNo() {
		return folderNo;
	}

	public void setFolderNo(int folderNo) {
		this.folderNo = folderNo;
	}

	public String getProjectNo() {
		return ProjectNo;
	}

	public void setProjectNo(String projectNo) {
		ProjectNo = "project " + projectNo;
	}

	public String getDigitalRootNo() {
		return digitalRootNo;
	}

	public void setDigitalRootNo(String digitalRootNo) {
		this.digitalRootNo = digitalRootNo;
	}

	/*public String getDigitalObjectIdentifier() {
		return digitalObjectIdentifier;
	}

	public void setDigitalObjectIdentifier(String digitalObjectIdentifier) {
		this.digitalObjectIdentifier = digitalObjectIdentifier;
	}
*/
	public List<TitleInfo> getTitleInfos() {
		return titleInfos;
	}

	public void setTitleInfos(List<TitleInfo> titleInfos) {
		this.titleInfos = titleInfos;
	}
	
	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}
//	
//	public List<NamePartAndRole> getNamePartAndRoles() {
//		return namePartAndRoles;
//	}
//
//	public void setNamePartAndRoles(List<NamePartAndRole> namePartAndRoles) {
//		this.namePartAndRoles = namePartAndRoles;
//	}
	
	
	public List<Tor> getTors() {
		return tors;
	}

	public void setTors(List<Tor> tors) {
		this.tors = tors;
	}
	
	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}
	
	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
	
	public List<AbstractSection> getAbstractSections() {
		return abstractSections;
	}

	public void setAbstractSections(List<AbstractSection> abstractSections) {
		this.abstractSections = abstractSections;
	}
	
	public List<Toc> getTocs() {
		return tocs;
	}

	public void setTocs(List<Toc> tocs) {
		this.tocs = tocs;
	}
	
	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	
	public List<Classification> getClassifications() {
		return classifications;
	}

	public void setClassifications(List<Classification> classifications) {
		this.classifications = classifications;
	}
	
	public List<Identifier> getIdentifiers() {
		return identifiers;
	}

	public void setIdentifiers(List<Identifier> identifiers) {
		this.identifiers = identifiers;
	}
	
	public List<AccessCondition> getAccessConditions() {
		return accessConditions;
	}

	public void setAccessConditions(List<AccessCondition> accessConditions) {
		this.accessConditions = accessConditions;
	}
	
	public List<RelatedItem> getRelatedItems() {
		return relatedItems;
	}

	public void setRelatedItems(List<RelatedItem> relatedItems) {
		this.relatedItems = relatedItems;
	}
	
	public List<SubjectSection> getSubjectSections() {
		return subjectSections;
	}

	public void setSubjectSections(List<SubjectSection> subjectSections) {
		this.subjectSections = subjectSections;
	}
	
	public List<SubjectSection2> getSubjectSections2() {
		return subjectSections2;
	}

	public void setSubjectSections2(List<SubjectSection2> subjectSections2) {
		this.subjectSections2 = subjectSections2;
	}
	
	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	
	public List<RecordInfo> getRecordInfos() {
		return recordInfos;
	}

	public void setRecordInfos(List<RecordInfo> recordInfos) {
		this.recordInfos = recordInfos;
	}
	
	
	
	
	
	
	
}
