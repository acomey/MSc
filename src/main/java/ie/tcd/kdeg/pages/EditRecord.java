package ie.tcd.kdeg.pages;


import java.util.List;

//import java.util.Arrays;

//import javax.persistence.Enumerated;

//import org.apache.tapestry5.Block;
//import org.apache.tapestry5.SelectModel;
import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
//import org.apache.tapestry5.annotations.SetupRender;
import org.apache.tapestry5.beaneditor.Validate;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
//import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;
//import org.apache.tapestry5.services.Request;
//import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
//import org.apache.tapestry5.util.EnumSelectModel;
import org.hibernate.Session;
//import org.hibernate.mapping.List;

import ie.tcd.kdeg.entities.TypeOfResource;
import ie.tcd.kdeg.entities.AbstractSection;
//import ie.tcd.kdeg.entities.CarMaker;
import ie.tcd.kdeg.entities.Genre;
import ie.tcd.kdeg.entities.GenreAuthorities;
import ie.tcd.kdeg.entities.Name;
import ie.tcd.kdeg.entities.Record;
import ie.tcd.kdeg.entities.TitleInfo;
import ie.tcd.kdeg.entities.Tor;
import ie.tcd.kdeg.entities.Language;
import ie.tcd.kdeg.entities.Toc;
import ie.tcd.kdeg.entities.Note;
import ie.tcd.kdeg.entities.Classification;
import ie.tcd.kdeg.entities.Identifier;
import ie.tcd.kdeg.entities.AccessCondition;
import ie.tcd.kdeg.entities.RelatedItem;
import ie.tcd.kdeg.entities.SubjectSection;
import ie.tcd.kdeg.entities.SubjectSection2;
import ie.tcd.kdeg.entities.Location;
import ie.tcd.kdeg.entities.RecordInfo;

public class EditRecord extends BasePage {

	@Property
	private Record record;

	@Inject
	private Session session;

	@Property
	private TitleInfo titleInfo;

	@Property
	private TitleInfo newTitleInfo;

	@Property
	private Name name;

	@Property
	private Name newName;
	
	@Property
	private Tor tor;

	@Property
	private Tor newTor;
	
	@Property
	private Genre genre;

	@Property
	private Genre newGenre;
	
	@Property
	private Language language;

	@Property
	private Language newLanguage;
	
	@Property
	private AbstractSection abstractSection;

	@Property
	private AbstractSection newAbstractSection;
	
	@Property
	private Toc toc;

	@Property
	private Toc newToc;
	
	@Property
	private Note note;

	@Property
	private Note newNote;
	
	@Property
	private Classification classification;

	@Property
	private Classification newClassification;
	
	@Property
	private Identifier identifier;

	@Property
	private Identifier newIdentifier;
	
	@Property
	private AccessCondition accessCondition;

	@Property
	private AccessCondition newAccessCondition;
	
	@Property
	private RelatedItem relatedItem;

	@Property
	private RelatedItem newRelatedItem;
	
	@Property
	private SubjectSection subjectSection;

	@Property
	private SubjectSection newSubjectSection;
	
	@Property
	private SubjectSection2 subjectSection2;

	@Property
	private SubjectSection2 newSubjectSection2;
	
	@Property
	private Location location;

	@Property
	private Location newLocation;
	
	@Property
	private RecordInfo recordInfo;

	@Property
	private RecordInfo newRecordInfo;
	
	
	


	
	//enums
	
	@Property
	@Persist
	@Validate("required")
	private TypeOfResource typeOfResource;
	
	@Property
	@Persist
	@Validate("required")
	private GenreAuthorities genreAuthorities;
	
    

	// fields for changing the information
	@InjectComponent private Zone headerZone;

	// fields for changing the title information
	@InjectComponent private Zone titleInfoZone;
	@InjectComponent private Zone updateTitleInfoZone;
	@InjectComponent private Zone typeZone;
	@InjectComponent private Zone displayLabelZone;
	@InjectComponent private Zone nonSortZone;
	@InjectComponent private Zone titleZone;
	@InjectComponent private Zone subtitleZone;
	@InjectComponent private Zone partNumberZone;
	@InjectComponent private Zone partNameZone;
	@InjectComponent private Zone titleInfoAttributeZone;
	@Component private Form updateTitleInfo;
	
	// name fields
	@InjectComponent private Zone nameZone;
	@InjectComponent private Zone updateNameZone;
	@InjectComponent private Zone nameTypeZone;
	@InjectComponent private Zone nameAuthorityZone;
	@InjectComponent private Zone nameDisplayLabelZone;
	@InjectComponent private Zone namePartZone;
	@InjectComponent private Zone roleZone;
	@InjectComponent private Zone roleTermTextZone;
	@InjectComponent private Zone roleTermCodeZone;
	@InjectComponent private Zone namePartZone2;
	@InjectComponent private Zone roleZone2;
	@InjectComponent private Zone roleTermTextZone2;
	@InjectComponent private Zone roleTermCodeZone2;
	@InjectComponent private Zone nameAttributeZone;
	@Component private Form updateName;
	
	
	//Type of Resource Fields
	@InjectComponent private Zone torZone;
	@InjectComponent private Zone updateTorZone;
	@InjectComponent private Zone typeOfResourceZone;
	@InjectComponent private Zone torAttributeZone;
	@Component private Form updateTor;
	
	//Genre Fields
	@InjectComponent private Zone genreZone;
	@InjectComponent private Zone updateGenreZone;
	@InjectComponent private Zone genreChoiceZone;
	@InjectComponent private Zone genreAuthorityZone;
	@Component private Form updateGenre;
	
	//Language Fields
	@InjectComponent private Zone languageZone;
	@InjectComponent private Zone updateLanguageZone;
	@InjectComponent private Zone languageTermZone;
	@InjectComponent private Zone languageTermTextAttributesZone;
	@InjectComponent private Zone languageTermCodeAttributesZone;
	@InjectComponent private Zone languageTerm2Zone;
	@InjectComponent private Zone languageTermTextAttributesZone2;
	@InjectComponent private Zone languageTermCodeAttributesZone2;
	@InjectComponent private Zone languageAttributeZone;
	@Component private Form updateLanguage;
	
	//abstract fields
	@InjectComponent private Zone abstractZone;
	@InjectComponent private Zone updateAbstractZone;
	@InjectComponent private Zone abstractTextZone;
	//@InjectComponent private Zone abstractAttributeZone;
	@Component private Form updateAbstractSection;
	
	//toc fields
	@InjectComponent private Zone tocZone;
	@InjectComponent private Zone updateTocZone;
	@InjectComponent private Zone tocTextZone;
	@Component private Form updateToc;
	
	//note fields
	@InjectComponent private Zone noteZone;
	@InjectComponent private Zone updateNoteZone;
	@InjectComponent private Zone noteTextZone;
	@Component private Form updateNote;
	
	//classification fields
	@InjectComponent private Zone classificationZone;
	@InjectComponent private Zone updateClassificationZone;
	@InjectComponent private Zone classificationTextZone;
	@InjectComponent private Zone classificationAuthorityZone;
	@Component private Form updateClassification;
	
	//identifier fields
	@InjectComponent private Zone identifierZone;
	@InjectComponent private Zone updateIdentifierZone;
	@InjectComponent private Zone identifierTextZone;
	@InjectComponent private Zone identifierTypeZone;
	@Component private Form updateIdentifier;
	
	
	//access condition fields
	@InjectComponent private Zone accessConditionTextZone1;
	@InjectComponent private Zone accessConditionTypeZone1;
	@InjectComponent private Zone accessConditionZone;
	@InjectComponent private Zone updateAccessConditionZone;
	@InjectComponent private Zone accessConditionTextZone;
	@InjectComponent private Zone accessConditionTypeZone;
	@Component private Form updateAccessCondition;
	
	
	//Related Item
	@InjectComponent private Zone relatedItemZone;
	@InjectComponent private Zone updateRelatedItemZone;
	@InjectComponent private Zone relatedItemAttributeZone;
	@InjectComponent private Zone relatedItemTypeZone;
	@InjectComponent private Zone relatedItemTitleZone;
	@InjectComponent private Zone relatedItemIdentifierZone;
	@Component private Form updateRelatedItem;
	
	
	//Subject
	@InjectComponent private Zone subjectSectionZone;
	@InjectComponent private Zone updateSubjectSectionZone;
	@Component private Form updateSubjectSection;
	
	@InjectComponent private Zone subjectAttributeZone;
	@InjectComponent private Zone subAuthorityZone;
	
	@InjectComponent private Zone subjectTopicZone;
	@InjectComponent private Zone subjectGeographicZone;
	@InjectComponent private Zone subjectTemporalZone;
	
	@InjectComponent private Zone subjectHierarchicalGeographicZone;
	@InjectComponent private Zone hgCountryZone;
	@InjectComponent private Zone hgRegionZone;
	@InjectComponent private Zone hgCountyZone;
	@InjectComponent private Zone hgCityZone;
	@InjectComponent private Zone hgAttributeZone;
	
	//Subject 2
	
	@InjectComponent private Zone subjectSection2Zone;
	@InjectComponent private Zone updateSubjectSection2Zone;
	@Component private Form updateSubjectSection2;
	
	@InjectComponent private Zone subjectCartographicsZone;
	@InjectComponent private Zone coordinatesZone;
	@InjectComponent private Zone scaleZone;
	@InjectComponent private Zone projectionZone;
	
	@InjectComponent private Zone subjectGeographicCodeZone;
	
	@InjectComponent private Zone subjectTitleInfoZone;
	@InjectComponent private Zone subjectNameZone;

	//Location
	@InjectComponent private Zone locationZone;
	@InjectComponent private Zone updateLocationZone;
	@InjectComponent private Zone locationAttributeZone;
	@InjectComponent private Zone physicalLocationZone;
	@InjectComponent private Zone urlZone;
	@Component private Form updateLocation;
	
	
	//Record Info
	@InjectComponent private Zone recordInfoZone;
	@InjectComponent private Zone updateRecordInfoZone;
	@InjectComponent private Zone recordInfoAttributeZone;
	@InjectComponent private Zone locatAttributeZone;
	@InjectComponent private Zone locatLanguageTermZone;
	@InjectComponent private Zone recordContentSourceZone;
	@InjectComponent private Zone recordCreationDateZone;
	@InjectComponent private Zone recordChangeDateZone;
	@InjectComponent private Zone riRecordIdentifierZone;
	@InjectComponent private Zone recordOriginZone;
	@Component private Form updateRecordInfo;
	
	
	void onActivate(long id) {
		// Get the record when page loads...
		record = (Record) session.get(Record.class, id);
	}

	Object[] onPassivate() {
		return new Object[] { record.getId() };
	}

	@CommitAfter
	public Object onSuccessFromEditHeader(long id) {
		session.update(record);
		return headerZone.getBody();
	}
	
	//TITLEINFO
	
	@CommitAfter
	public Object onSuccessFromCreateTitleInfo() {
		newTitleInfo.setRecord(record);
		newTitleInfo.setCreator(getUsername());
		record.getTitleInfos().add(newTitleInfo);
		session.update(record);
		return titleInfoZone.getBody();
	}


	void onPrepareForSubmitFromUpdateTitleInfo(Long id) {
		titleInfo = (TitleInfo) session.get(TitleInfo.class, id);
	}

	@CommitAfter
	public void onSuccessFromUpdateTitleInfo() {
		session.update(titleInfo);
		updateTitleInfo.clearErrors();
	}

/*	public void onValidateFromTI_NonSort(String value) {
		if(titleInfo.hasNonSortAttributes() && (value == null || "".equals(value))) {
			updateTitleInfo.recordError("NonSort cannot be empty and have attributes.");
		}
	}

	public void onValidateFromTI_Title(String value) {
		if(titleInfo.hasTitleAttributes() && (value == null || "".equals(value))) {
			updateTitleInfo.recordError("Title cannot be empty and have attributes.");
		}
	}

	public void onValidateFromTI_Subtitle(String value) {
		if(titleInfo.hasSubtitleAttributes() && (value == null || "".equals(value))) {
			updateTitleInfo.recordError("Subtitle cannot be empty and have attributes.");
		}
	}

	public void onValidateFromTI_PartName(String value) {
		if(titleInfo.hasPartNameAttributes() && (value == null || "".equals(value))) {
			updateTitleInfo.recordError("PartName cannot be empty and have attributes.");
		}
	}

	public void onValidateFromTI_PartNumber(String value) {
		if(titleInfo.hasPartNumberAttributes() && (value == null || "".equals(value))) {
			updateTitleInfo.recordError("PartNumber cannot be empty and have attributes.");
		}
	}*/

	public Object onSubmitFromUpdateTitleInfo() {
		return updateTitleInfoZone.getBody();
	}

	//@CommitAfter 
	//public Object onValueChangedFromTi_Type(String type) {
	//	System.out.println("ALALALALALALALALALLALALALA");
	//	return typeZone.getBody();
	//}

	public String getTitleInfoTypeLabel() {
		return titleInfo.getTiType() == null ? "None" : titleInfo.getTiType();
	}
	
	public boolean getNotFirstTitleInfo() {
		TitleInfo first = null;
		if(!record.getTitleInfos().isEmpty()) {
			first = record.getTitleInfos().get(0);
		}
		return first != titleInfo;
	}

	//ti type
	@CommitAfter public Object onActionFromSetTypeAbbreviated(long id) { return addTiType(id, "typeabbreviated"); }
	@CommitAfter public Object onActionFromSetTypeTranslated(long id) { return addTiType(id, "typetranslated"); }
	@CommitAfter public Object onActionFromSetTypeAlternative(long id) { return addTiType(id, "typealternative"); }
	@CommitAfter public Object onActionFromSetTypeUniform(long id) { return addTiType(id, "typeuniform"); }
	@CommitAfter public Object onActionFromSetTypeBlank(long id) { return addTiType(id, "blank"); }
	public Object addTiType(long id, String attribute) {
		titleInfo = (TitleInfo) session.get(TitleInfo.class, id);

		if("typeabbreviated".equals(attribute)) {
			titleInfo.setTiType("abbreviated");
			makeUniformBlank();
		} else if("typetranslated".equals(attribute)) {
			titleInfo.setTiType("translated");
			makeUniformBlank();
			makeAbbreviatedBlank();
		} else if("typealternative".equals(attribute)) {
			titleInfo.setTiType("alternative");
			makeUniformBlank();
			makeAbbreviatedBlank();
		} else if("typeuniform".equals(attribute)) {
			titleInfo.setTiType("uniform");
			makeAbbreviatedBlank();
		} else if("blank".equals(attribute)) {
			titleInfo.setTiType("None");
			makeUniformBlank();
			makeAbbreviatedBlank();
		}

		session.update(titleInfo);
		return typeZone.getBody();
	}

	private void makeAbbreviatedBlank() {
		titleInfo.setAuthority(null);
		titleInfo.setUri(null);
	}

	private void makeUniformBlank() {
		titleInfo.setUniformAuthority(null);
		titleInfo.setUniformUri(null);
	}

	//type abbreviated

	@CommitAfter public Object onActionFromAddAuthorityDnlm(long id) { return addAbbreviatedAuthority(id, "authorityDnlm"); }
	@CommitAfter public Object onActionFromAddAuthorityHlasja(long id) { return addAbbreviatedAuthority(id, "authorityHlasja"); }
	@CommitAfter public Object onActionFromAddAuthorityInisaljt(long id) { return addAbbreviatedAuthority(id, "authorityInisaljt"); }
	@CommitAfter public Object onActionFromAddAuthorityIssnkey(long id) { return addAbbreviatedAuthority(id, "authorityIssnkey"); }
	public Object addAbbreviatedAuthority(long id, String attribute) {
		titleInfo = (TitleInfo) session.get(TitleInfo.class, id);


		if("authorityDnlm".equals(attribute)) {
			titleInfo.setAuthority("Dnlm");
			titleInfo.setUri("http://id.loc.gov/vocabulary/classSchemes/nlm");
			titleInfo.setValueUri("valueURI");
		} else if("authorityHlasja".equals(attribute)) {
			titleInfo.setUri("http://id.loc.gov/vocabulary/subjectSchemes/hlasstg.html");
			titleInfo.setAuthority("Hlasja");
			titleInfo.setValueUri("valueURI");
		} else if("authorityInisaljt".equals(attribute)) {
			titleInfo.setUri("http://id.loc.gov/vocabulary/subjectSchemes/inist.html");
			titleInfo.setAuthority("Inisaljt");
			titleInfo.setValueUri("valueURI");
		} else if("authorityIssnkey".equals(attribute)) {
			titleInfo.setUri("http://id.loc.gov/vocabulary/identifiers/issn.html");
			titleInfo.setAuthority("Issnkey");
			titleInfo.setValueUri("valueURI");
		} 

		session.update(titleInfo);
		return typeZone.getBody();
	}

	//type uniform

	@CommitAfter public Object onActionFromAddAuthorityNaf(long id) { return addUniformAuthority(id, "authorityNaf"); }
	@CommitAfter public Object onActionFromAddAuthorityUnbisn(long id) { return addUniformAuthority(id, "authorityUnbisn"); }
	@CommitAfter public Object onActionFromAddAuthorityUlan(long id) { return addUniformAuthority(id, "authorityUlan"); }
	@CommitAfter public Object onActionFromAddAuthorityViaf(long id) { return addUniformAuthority(id, "authorityViaf"); }
	public Object addUniformAuthority(long id, String attribute) {
		titleInfo = (TitleInfo) session.get(TitleInfo.class, id);

		if("authorityNaf".equals(attribute)) {
			titleInfo.setUniformAuthority("Naf");
			titleInfo.setUniformUri("http://id.loc.gov/authorities/names.html");
			titleInfo.setUniformValueUri("valueURI");
		} else if("authorityUnbisn".equals(attribute)) {
			titleInfo.setUniformAuthority("Unbisn");
			titleInfo.setUniformUri("http://vocab.getty.edu/resource/ulan.html");
			titleInfo.setUniformValueUri("valueURI");
		} else if("authorityUlan".equals(attribute)) {
			titleInfo.setUniformAuthority("Ulan");
			titleInfo.setUniformUri("http://id.loc.gov/vocabulary/subjectSchemes/unbisn.html");
			titleInfo.setUniformValueUri("valueURI");
		} else if("authorityViaf".equals(attribute)) {
			titleInfo.setUniformAuthority("Viaf");
			titleInfo.setUniformUri("http://id.loc.gov/vocabulary/identifiers/viaf.html");
			titleInfo.setUniformValueUri("valueURI");
		} 

		session.update(titleInfo);
		return typeZone.getBody();
	}
	
	//ti attributes
	@CommitAfter public Object onActionFromAddUsage(long id) { return addTiAttribute(id, "usage"); }
	@CommitAfter public Object onActionFromAddSupplied(long id) { return addTiAttribute(id, "supplied"); }
	@CommitAfter public Object onActionFromAddNameTitleGroup(long id) { return addTiAttribute(id, "nametitlegroup"); }
	@CommitAfter public Object onActionFromAddAltRepGroup(long id) { return addTiAttribute(id, "altrepgroup"); }
	@CommitAfter public Object onActionFromAddAltFormat(long id) { return addTiAttribute(id, "altformat"); }
	@CommitAfter public Object onActionFromAddContentType(long id) { return addTiAttribute(id, "contenttype"); }
	@CommitAfter public Object onActionFromAddXlink(long id) { return addTiAttribute(id, "xlink"); }
	@CommitAfter public Object onActionFromAddTiId(long id) { return addTiAttribute(id, "tiid"); }
	@CommitAfter public Object onActionFromAddLang(long id) { return addTiAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddXmlLang(long id) { return addTiAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddScript(long id) { return addTiAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddTransliteration(long id) { return addTiAttribute(id, "transliteration"); }
	@CommitAfter public Object onActionFromAddOtherType(long id) { return addTiAttribute(id, "othertype"); }
	public Object addTiAttribute(long id, String attribute) {
		titleInfo = (TitleInfo) session.get(TitleInfo.class, id);

		if("usage".equals(attribute)) {
			titleInfo.setTiUsage("primary");
		} else if ("supplied".equals(attribute)) {
			titleInfo.setTiSupplied("yes");
		} else if ("nametitlegroup".equals(attribute)) {
			titleInfo.setTiNameTitleGroup(attribute);
		} else if ("altrepgroup".equals(attribute)) {
			titleInfo.setTiAltRepGroup(attribute);
		} else if ("altformat".equals(attribute)) {
			titleInfo.setTiAltFormat(attribute);
		} else if ("contenttype".equals(attribute)) {
			titleInfo.setTiContentType(attribute);
		} else if ("xlink".equals(attribute)) {
			titleInfo.setTiXlink(attribute);
		} else if ("tiid".equals(attribute)) {
			titleInfo.setTiId(attribute);
		} else if("lang".equals(attribute)) {
			titleInfo.setTiLang("eng");
		} else if ("xmllang".equals(attribute)) {
			titleInfo.setTiXmlLang("en");
		} else if ("script".equals(attribute)) {
			titleInfo.setTiScript("arab");
		} else if ("transliteration".equals(attribute)) {
			titleInfo.setTiTransliteration(attribute);
		} else if ("othertype".equals(attribute)) {
			titleInfo.setTiOtherType(attribute);
		}

		session.update(titleInfo);
		return titleInfoAttributeZone.getBody();
	}

	public boolean getRemainingTitleInfoAttributes() {
		if(titleInfo.getTiUsage() != null)
			if(titleInfo.getTiSupplied() != null)
				if(titleInfo.getTiNameTitleGroup() != null)
					if(titleInfo.getTiAltRepGroup() != null)
						if(titleInfo.getTiAltFormat() != null)
							if(titleInfo.getTiContentType() != null)
								if(titleInfo.getTiXlink() != null)
									if(titleInfo.getTiId() != null)
										if(titleInfo.getTiLang() != null)
											if(titleInfo.getTiXmlLang() != null)
												if(titleInfo.getTiScript() != null)
													if(titleInfo.getTiTransliteration() != null)
														if(titleInfo.getTiOtherType() != null)
															return false;
		return true;

	}
	
	


	//ti nonsort
	@CommitAfter public Object onActionFromAddNonSortLang(long id) { return addNonSortAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddNonSortXmlLang(long id) { return addNonSortAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddNonSortScript(long id) { return addNonSortAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddNonSortTransliteration(long id) { return addNonSortAttribute(id, "transliteration"); }
	@CommitAfter public Object onActionFromAddNonSortXmlSpace(long id) { return addNonSortAttribute(id, "xmlspace"); }
	public Object addNonSortAttribute(long id, String attribute) {
		titleInfo = (TitleInfo) session.get(TitleInfo.class, id);

		if("lang".equals(attribute)) {
			titleInfo.setNonSortLang("eng");
		} else if ("xmllang".equals(attribute)) {
			titleInfo.setNonSortXmlLang("en");
		} else if ("script".equals(attribute)) {
			titleInfo.setNonSortScript("arab");
		} else if ("transliteration".equals(attribute)) {
			titleInfo.setNonSortTransliteration(attribute);
		} else if ("xmlspace".equals(attribute)) {
			titleInfo.setNonSortXmlSpace(attribute);
		}

		session.update(titleInfo);
		return nonSortZone.getBody();
	}

	public boolean getRemainingNonSortAttributes() {
		if(titleInfo.getNonSortLang() != null)
			if(titleInfo.getNonSortXmlLang() != null)
				if(titleInfo.getNonSortScript() != null)
					if(titleInfo.getNonSortTransliteration() != null)
						if(titleInfo.getNonSortXmlSpace() != null)
							return false;
		return true;

	}

	//ti title
	@CommitAfter public Object onActionFromAddTitleLang(long id) { return addTitleAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddTitleXmlLang(long id) { return addTitleAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddTitleScript(long id) { return addTitleAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddTitletransliteration(long id) { return addTitleAttribute(id, "transliteration"); }
	public Object addTitleAttribute(long id, String attribute) {
		titleInfo = (TitleInfo) session.get(TitleInfo.class, id);

		if("lang".equals(attribute)) {
			titleInfo.setTitleLang("eng");
		} else if ("xmllang".equals(attribute)) {
			titleInfo.setTitleXmlLang("en");
		} else if ("script".equals(attribute)) {
			titleInfo.setTitleScript("arab");
		} else if ("transliteration".equals(attribute)) {
			titleInfo.setTitleTransliteration(attribute);
		} 

		session.update(titleInfo);
		return titleZone.getBody();
	}

	public boolean getRemainingTitleAttributes() {
		if(titleInfo.getTitleLang() != null)
			if(titleInfo.getTitleXmlLang() != null)
				if(titleInfo.getTitleScript() != null)
					if(titleInfo.getTitleTransliteration() != null)
						return false;
		return true;

	}

	//ti subtitle
	@CommitAfter public Object onActionFromAddSubtitleLang(long id) { return addSubtitleAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddSubtitleXmlLang(long id) { return addSubtitleAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddSubtitleScript(long id) { return addSubtitleAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddSubtitletransliteration(long id) { return addSubtitleAttribute(id, "transliteration"); }
	public Object addSubtitleAttribute(long id, String attribute) {
		titleInfo = (TitleInfo) session.get(TitleInfo.class, id);

		if("lang".equals(attribute)) {
			titleInfo.setSubtitleLang("eng");
		} else if ("xmllang".equals(attribute)) {
			titleInfo.setSubtitleXmlLang("en");
		} else if ("script".equals(attribute)) {
			titleInfo.setSubtitleScript("arab");
		} else if ("transliteration".equals(attribute)) {
			titleInfo.setSubtitleTransliteration(attribute);
		} 

		session.update(titleInfo);
		return subtitleZone.getBody();
	}

	public boolean getRemainingSubtitleAttributes() {
		if(titleInfo.getSubtitleLang() != null)
			if(titleInfo.getSubtitleXmlLang() != null)
				if(titleInfo.getSubtitleScript() != null)
					if(titleInfo.getSubtitleTransliteration() != null)
						return false;
		return true;

	}

	//ti partnumber
	@CommitAfter public Object onActionFromAddPartNumberLang(long id) { return addPartNumberAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddPartNumberXmlLang(long id) { return addPartNumberAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddPartNumberScript(long id) { return addPartNumberAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddPartNumberTransliteration(long id) { return addPartNumberAttribute(id, "transliteration"); }
	public Object addPartNumberAttribute(long id, String attribute) {
		titleInfo = (TitleInfo) session.get(TitleInfo.class, id);

		if("lang".equals(attribute)) {
			titleInfo.setPartNumberLang("eng");
		} else if ("xmllang".equals(attribute)) {
			titleInfo.setPartNumberXmlLang("en");
		} else if ("script".equals(attribute)) {
			titleInfo.setPartNumberScript("arab");
		} else if ("transliteration".equals(attribute)) {
			titleInfo.setPartNumberTransliteration(attribute);
		} 

		session.update(titleInfo);
		return partNumberZone.getBody();
	}

	public boolean getRemainingPartNumberAttributes() {
		if(titleInfo.getPartNumberLang() != null)
			if(titleInfo.getPartNumberXmlLang() != null)
				if(titleInfo.getPartNumberScript() != null)
					if(titleInfo.getPartNumberTransliteration() != null)
						return false;
		return true;

	}

	//ti partname
	@CommitAfter public Object onActionFromAddPartNameLang(long id) { return addPartNameAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddPartNameXmlLang(long id) { return addPartNameAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddPartNameScript(long id) { return addPartNameAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddPartNameTransliteration(long id) { return addPartNameAttribute(id, "transliteration"); }
	public Object addPartNameAttribute(long id, String attribute) {
		titleInfo = (TitleInfo) session.get(TitleInfo.class, id);

		if("lang".equals(attribute)) {
			titleInfo.setPartNameLang("eng");
		} else if ("xmllang".equals(attribute)) {
			titleInfo.setPartNameXmlLang("en");
		} else if ("script".equals(attribute)) {
			titleInfo.setPartNameScript("arab");
		} else if ("transliteration".equals(attribute)) {
			titleInfo.setPartNameTransliteration(attribute);
		}

		session.update(titleInfo);
		return partNameZone.getBody();
	}

	public boolean getRemainingPartNameAttributes() {
		if(titleInfo.getPartNameLang() != null)
			if(titleInfo.getPartNameXmlLang() != null)
				if(titleInfo.getPartNameScript() != null)
					if(titleInfo.getPartNameTransliteration() != null)
						return false;
		return true;

	}
	
	
	

	// NAME
	
	@CommitAfter
	public Object onSuccessFromCreateName() {
		newName.setRecord(record);
		newName.setCreator(getUsername());
		record.getNames().add(newName);
		session.update(record);
		newName.setRoleTermTypeText("Text");
		newName.setRoleTermTypeText2("none");
		newName.setRoleTermText("author");
		newName.setRoleTermText2("none");
		newName.setRoleTermTypeCode("Code");
		newName.setRoleTermTypeCode2("none");
		newName.setRoleTermCode("aut");
		newName.setRoleTermCode2("none");
		newName.setRtAuthority("marcrelator");
		newName.setRtAuthority2("none");
		newName.setRtAuthorityUri("http://id.loc.gov/vocabulary/relators");
		newName.setRtAuthorityUri2("none");
		newName.setRtValueUri("http://id.loc.gov/vocabulary/relators/aut");
		newName.setRtValueUri2("none");
		return nameZone.getBody();
	}

	void onPrepareForSubmitFromUpdateName(Long id) {
		name = (Name) session.get(Name.class, id);
	}

	@CommitAfter
	public void onSuccessFromUpdateName() {
		session.update(name);
		updateName.clearErrors();
	}

	public Object onSubmitFromUpdateName() {
		return updateNameZone.getBody();
	}
	
	
	/*public void onValidateFromName_NamePart(String value) {
		if(name.hasNamePartAttributes() && (value == null || "".equals(value))) {
			updateName.recordError("Name Part cannot be empty and have attributes.");
		}
	}*/
	
	//public void onValidateFromName_RoleTermText(String value) {
		//if(name.hasRoleTermTextAttributes() && (value == null || "".equals(value))) {
			//updateName.recordError("Role Term cannot be empty and have attributes.");
		//}
	//}
	
	//public void onValidateFromName_RoleTermCode(String value) {
		//if(name.hasRoleTermCodeAttributes() && (value == null || "".equals(value))) {
			//updateName.recordError("Role Term cannot be empty and have attributes.");
		//}
	//}


	public String getNameAuthorityLabel() {
		return name.getAuthority() == null ? "None" : name.getAuthority();
	}
	
	//nameAuthority
	@CommitAfter public Object onActionFromSetAuthorityLocal(long id) { return addNameAuthority(id, "authoritylocal"); }
	@CommitAfter public Object onActionFromSetAuthorityDib(long id) { return addNameAuthority(id, "authoritydib"); }
	@CommitAfter public Object onActionFromSetAuthorityNaf(long id) { return addNameAuthority(id, "authoritynaf"); }
	@CommitAfter public Object onActionFromSetAuthorityUnbis(long id) { return addNameAuthority(id, "authorityunbis"); }
	@CommitAfter public Object onActionFromSetAuthorityUlan(long id) { return addNameAuthority(id, "authorityulan"); }
	@CommitAfter public Object onActionFromSetAuthorityViaf(long id) { return addNameAuthority(id, "authorityviaf"); }
	@CommitAfter public Object onActionFromSetAuthorityBlank(long id) { return addNameAuthority(id, "authorityblank"); }
	public Object addNameAuthority(long id, String attribute) {
		name = (Name) session.get(Name.class, id);

		if("authoritylocal".equals(attribute)) {
			name.setAuthority("local");
			name.setAuthorityUri("AuthorityUri");
			name.setValueUri("ValueUri");
			
		} else if("authoritydib".equals(attribute)) {
			name.setAuthority("dib");
			name.setAuthorityUri("http://dib.cambridge.org/");
			name.setValueUri("ValueUri");
			
		} else if("authoritynaf".equals(attribute)) {
			name.setAuthority("naf");
			name.setAuthorityUri("http://id.loc.gov/authorities/names.html");
			name.setValueUri("ValueUri");
			
		} else if("authorityunbis".equals(attribute)) {
			name.setAuthority("unbis");
			name.setAuthorityUri("http://id.loc.gov/vocabulary/subjectSchemes/unbisn.html");
			name.setValueUri("ValueUri");
			
		} else if("authorityulan".equals(attribute)) {
			name.setAuthority("ulan");
			name.setAuthorityUri("http://vocab.getty.edu/resource/ulan.html");
			name.setValueUri("ValueUri");
			
		} else if("authorityviaf".equals(attribute)) {
			name.setAuthority("viaf");
			name.setAuthorityUri("http://id.loc.gov/vocabulary/identifiers/viaf.html");
			name.setValueUri("ValueUri");
			
		} else if("authorityblank".equals(attribute)) {
			name.setAuthority("none");
			name.setAuthorityUri("none");
			name.setValueUri("none");
			
		}

		session.update(name);
		return nameAuthorityZone.getBody();
	}

	//name attributes
	@CommitAfter public Object onActionFromAddNameUsage(long id) { return addNameAttribute(id, "usage"); }
	@CommitAfter public Object onActionFromAddNameNameTitleGroup(long id) { return addNameAttribute(id, "nametitlegroup"); }
	@CommitAfter public Object onActionFromAddNameAltRepGroup(long id) { return addNameAttribute(id, "altrepgroup"); }
	@CommitAfter public Object onActionFromAddNameXlink(long id) { return addNameAttribute(id, "xlink"); }
	@CommitAfter public Object onActionFromAddNameId(long id) { return addNameAttribute(id, "nameid"); }
	@CommitAfter public Object onActionFromAddNameLang(long id) { return addNameAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddNameXmlLang(long id) { return addNameAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddNameScript(long id) { return addNameAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddNameTransliteration(long id) { return addNameAttribute(id, "transliteration"); }
	@CommitAfter public Object onActionFromAddNameEtal(long id) { return addNameAttribute(id, "etal"); }
	public Object addNameAttribute(long id, String attribute) {
		name = (Name) session.get(Name.class, id);

		if("usage".equals(attribute)) {
			name.setNameUsage("primary");
		} else if ("nametitlegroup".equals(attribute)) {
			name.setNameTitleGroup(attribute);
		} else if ("altrepgroup".equals(attribute)) {
			name.setNameAltRepGroup(attribute);
		} else if ("xlink".equals(attribute)) {
			name.setNameXlink(attribute);
		} else if ("nameid".equals(attribute)) {
			name.setNameId(attribute);
		} else if("lang".equals(attribute)) {
			name.setNameLang("eng");
		} else if ("xmllang".equals(attribute)) {
			name.setNameXmlLang("en");
		} else if ("script".equals(attribute)) {
			name.setNameScript("arab");
		} else if ("transliteration".equals(attribute)) {
			name.setNameTransliteration(attribute);
		} else if ("etal".equals(attribute)) {
			name.setNameEtal(attribute);
		}

		session.update(name);
		return nameAttributeZone.getBody();
	}

	public boolean getRemainingNameAttributes() {
		if(name.getNameUsage() != null)
			if(name.getNameTitleGroup() != null)
				if(name.getNameAltRepGroup() != null)
					if(name.getNameXlink() != null)
						if(name.getNameId() != null)
							if(name.getNameLang() != null)
								if(name.getNameXmlLang() != null)
									if(name.getNameScript() != null)
										if(name.getNameTransliteration() != null)
											if(name.getNameEtal() != null)
												return false;
		return true;

	}
	
	
	// namePart
	@CommitAfter public Object onActionFromAddNamePartLang(long id) { return addNamePartAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddNamePartXmlLang(long id) { return addNamePartAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddNamePartScript(long id) { return addNamePartAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddNamePartTransliteration(long id) { return addNamePartAttribute(id, "transliteration"); }
	public Object addNamePartAttribute(long id, String attribute) {
		name = (Name) session.get(Name.class, id);

		if("lang".equals(attribute)) {
			name.setNamePartLang("eng");
		} else if ("xmllang".equals(attribute)) {
			name.setNamePartXmlLang("en");
		} else if ("script".equals(attribute)) {
			name.setNamePartScript("arab");
		} else if ("transliteration".equals(attribute)) {
			name.setNamePartTransliteration(attribute);
		}

		session.update(name);
		return namePartZone.getBody();
	}

	public boolean getRemainingNamePartAttributes() {
		if(name.getNamePartLang() != null)
			if(name.getNamePartXmlLang() != null)
				if(name.getNamePartScript() != null)
					if(name.getNamePartTransliteration() != null)
						return false;
		return true;

	}
	
	
	//roleTerm 
	
	
	public String getRoleTermTypeTextLabel() {
		return name.getRoleTermTypeText() == null ? "text" : name.getRoleTermTypeText();
	}
	
	public String getRoleTermTypeText2Label() {
		return name.getRoleTermTypeText2() == null ? "none" : name.getRoleTermTypeText2();
	}
	
	public String getRoleTermTextLabel() {
		return name.getRoleTermText() == null ? "author" : name.getRoleTermText();
	}
	
	public String getRoleTermText2Label() {
		return name.getRoleTermText2() == null ? "none" : name.getRoleTermText2();
	}
	
	public String getRoleTermTypeCodeLabel() {
		return name.getRoleTermTypeCode() == null ? "code" : name.getRoleTermTypeCode();
	}
	
	public String getRoleTermTypeCodeLabel2Label() {
		return name.getRoleTermTypeCode2() == null ? "none" : name.getRoleTermTypeCode2();
	}
	
	public String getRoleTermCodeLabel() {
		return name.getRoleTermCode() == null ? "aut" : name.getRoleTermCode();
	}
	
	public String getRoleTermCode2Label() {
		return name.getRoleTermCode2() == null ? "none" : name.getRoleTermCode2();
	}
	
	public String getRoleTermAuthorityLabel() {
		return name.getRtAuthority() == null ? "marcrelator" : name.getRtAuthority();
	}
	
	public String getRoleTermAuthority2Label() {
		return name.getRtAuthority2() == null ? "none" : name.getRtAuthority2();
	}
	
	public String getRoleTermAuthorityUriLabel() {
		return name.getRtAuthorityUri() == null ? "http://id.loc.gov/vocabulary/relators.html" : name.getRtAuthorityUri();
	}
	
	public String getRoleTermAuthorityUri2Label() {
		return name.getRtAuthorityUri2() == null ? "none" : name.getRtAuthorityUri2();
	}
	
	public String getRoleTermValueUriLabel() {
		return name.getRtValueUri() == null ? "http://id.loc.gov/vocabulary/relators/aut" : name.getRtValueUri();
	}
	
	public String getRoleTermValueUri2Label() {
		return name.getRtValueUri2() == null ? "none" : name.getRtValueUri2();
	}
	
	
	@CommitAfter public Object onActionFromSetRoleTermTypeText(long id) { return addRoleTermType(id, "roletermtypetext"); }
	@CommitAfter public Object onActionFromSetRoleTermTypeBlank(long id) { return addRoleTermType(id, "roletermtypeblank"); }
	public Object addRoleTermType(long id, String attribute) {
		name = (Name) session.get(Name.class, id);
		
		if("roletermtypetext".equals(attribute)) {
			name.setRoleTermTypeText("text");
			name.setRtAuthority("marcrelator");
			name.setRtAuthorityUri("http://id.loc.gov/vocabulary/relators.html");
			name.setRoleTermTypeCode("code");
			name.setRoleTermText("author");
			name.setRoleTermCode("aut");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/aut");
			
		} else if("roletermtypeblank".equals(attribute)) {
			name.setRoleTermTypeText("none");
			name.setRoleTermTypeCode("none");
			name.setRtAuthority("none");
			name.setRtAuthorityUri("none");
			name.setRoleTermText("none");
			name.setRoleTermCode("none");
			name.setRtValueUri("none");
		}
	
			session.update(name);
			return roleZone.getBody();
		}
	
	@CommitAfter public Object onActionFromSetRoleTermTextArchitect(long id) { return addRoleTerm(id, "roletermtextarchitect"); }
	@CommitAfter public Object onActionFromSetRoleTermTextArtist(long id) { return addRoleTerm(id, "roletermtextartist"); }
	@CommitAfter public Object onActionFromSetRoleTermTextAssocName(long id) { return addRoleTerm(id, "roletermtextassocname"); }
	@CommitAfter public Object onActionFromSetRoleTermTextAttName(long id) { return addRoleTerm(id, "roletermtextattname"); }
	@CommitAfter public Object onActionFromSetRoleTermTextAuthor(long id) { return addRoleTerm(id, "roletermtextauthor"); }
	@CommitAfter public Object onActionFromSetRoleTermTextBook(long id) { return addRoleTerm(id, "roletermtextbook"); }
	@CommitAfter public Object onActionFromSetRoleTermTextComp(long id) { return addRoleTerm(id, "roletermtextcomp"); }
	@CommitAfter public Object onActionFromSetRoleTermTextColl(long id) { return addRoleTerm(id, "roletermtextcoll"); }
	@CommitAfter public Object onActionFromSetRoleTermTextCreator(long id) { return addRoleTerm(id, "roletermtextcreator"); }
	@CommitAfter public Object onActionFromSetRoleTermTextCart(long id) { return addRoleTerm(id, "roletermtextcart"); }
	@CommitAfter public Object onActionFromSetRoleTermTextDelin(long id) { return addRoleTerm(id, "roletermtextdelin"); }
	@CommitAfter public Object onActionFromSetRoleTermTextDonor(long id) { return addRoleTerm(id, "roletermtextdonor"); }
	@CommitAfter public Object onActionFromSetRoleTermTextDepic(long id) { return addRoleTerm(id, "roletermtextdepic"); }
	@CommitAfter public Object onActionFromSetRoleTermTextDedic(long id) { return addRoleTerm(id, "roletermtextdedic"); }
	@CommitAfter public Object onActionFromSetRoleTermTextEditor(long id) { return addRoleTerm(id, "roletermtexteditor"); }
	@CommitAfter public Object onActionFromSetRoleTermTextEng(long id) { return addRoleTerm(id, "roletermtexteng"); }
	@CommitAfter public Object onActionFromSetRoleTermTextIll(long id) { return addRoleTerm(id, "roletermtextill"); }
	@CommitAfter public Object onActionFromSetRoleTermTextMan(long id) { return addRoleTerm(id, "roletermtextman"); }
	@CommitAfter public Object onActionFromSetRoleTermTextOrig(long id) { return addRoleTerm(id, "roletermtextorig"); }
	@CommitAfter public Object onActionFromSetRoleTermTextPatron(long id) { return addRoleTerm(id, "roletermtextpatron"); }
	@CommitAfter public Object onActionFromSetRoleTermTextPhoto(long id) { return addRoleTerm(id, "roletermtextphoto"); }
	@CommitAfter public Object onActionFromSetRoleTermTextPap(long id) { return addRoleTerm(id, "roletermtextpap"); }
	@CommitAfter public Object onActionFromSetRoleTermTextPrint(long id) { return addRoleTerm(id, "roletermtextprint"); }
	@CommitAfter public Object onActionFromSetRoleTermTextPrinter(long id) { return addRoleTerm(id, "roletermtextprinter"); }
	@CommitAfter public Object onActionFromSetRoleTermTextAdd(long id) { return addRoleTerm(id, "roletermtextadd"); }
	@CommitAfter public Object onActionFromSetRoleTermTextSculpt(long id) { return addRoleTerm(id, "roletermtextsculpt"); }
	@CommitAfter public Object onActionFromSetRoleTermTextSurv(long id) { return addRoleTerm(id, "roletermtextsurv"); }
	@CommitAfter public Object onActionFromSetRoleTermTextTrans(long id) { return addRoleTerm(id, "roletermtexttrans"); }
	@CommitAfter public Object onActionFromSetRoleTermTextBlank(long id) { return addRoleTerm(id, "roletermtextblank"); }
	public Object addRoleTerm(long id, String attribute) {
		name = (Name) session.get(Name.class, id);
		
		

		if("roletermtextarchitect".equals(attribute)) {
			name.setRoleTermText("architect");
			name.setRoleTermCode("arc");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/arc");
			
		} else if("roletermtextartist".equals(attribute)) {
			name.setRoleTermText("artist");
			name.setRoleTermCode("ar");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/ar");
			
		} else if("roletermtextassocname".equals(attribute)) {
			name.setRoleTermText("associated name");
			name.setRoleTermCode("asn");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/asn");
			
		} else if("roletermtextattname".equals(attribute)) {
			name.setRoleTermText("attributed name");
			name.setRoleTermCode("att");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/att");
			
		} else if("roletermtextauthor".equals(attribute)) {
			name.setRoleTermText("author");
			name.setRoleTermCode("aut");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/aut");
			
		} else if("roletermtextbook".equals(attribute)) {
			name.setRoleTermText("bookseller");
			name.setRoleTermCode("bsl");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/bsl");
			
		} else if("roletermtextcomp".equals(attribute)) {
			name.setRoleTermText("composer");
			name.setRoleTermCode("cmp");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/cmp");
		
		} else if("roletermtextcoll".equals(attribute)) {
			name.setRoleTermText("collector");
			name.setRoleTermCode("col");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/col");
			
		} else if("roletermtextcreator".equals(attribute)) {
			name.setRoleTermText("creator");
			name.setRoleTermCode("cre");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/cre");
			
		} else if("roletermtextcart".equals(attribute)) {
			name.setRoleTermText("cartographer");
			name.setRoleTermCode("ctg");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/ctg");
			
		} else if("roletermtextdelin".equals(attribute)) {
			name.setRoleTermText("delineator");
			name.setRoleTermCode("dln");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/dln");
			
		} else if("roletermtextdonor".equals(attribute)) {
			name.setRoleTermText("donor");
			name.setRoleTermCode("dnr");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/dnr");
		
			
		} else if("roletermtextdepic".equals(attribute)) {
			name.setRoleTermText("depicted");
			name.setRoleTermCode("dpc");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/dpc");
			
		} else if("roletermtextdedic".equals(attribute)) {
			name.setRoleTermText("dedicatee");
			name.setRoleTermCode("dte");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/dte");
			
		} else if("roletermtexteditor".equals(attribute)) {
			name.setRoleTermText("editor");
			name.setRoleTermCode("edt");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/edt");
			
		} else if("roletermtexteng".equals(attribute)) {
			name.setRoleTermText("engraver");
			name.setRoleTermCode("egr");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/egr");
			
		} else if("roletermtextill".equals(attribute)) {
			name.setRoleTermText("illustrator");
			name.setRoleTermCode("ill");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/ill");
			
		} else if("roletermtextman".equals(attribute)) {
			name.setRoleTermText("manufacturer");
			name.setRoleTermCode("mfr");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/mfr");
			
		} else if("roletermtextorig".equals(attribute)) {
			name.setRoleTermText("originator");
			name.setRoleTermCode("org");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/org");
			
		} else if("roletermtextpatron".equals(attribute)) {
			name.setRoleTermText("patron");
			name.setRoleTermCode("pat");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/pat");
			
		} else if("roletermtextphoto".equals(attribute)) {
			name.setRoleTermText("photographer");
			name.setRoleTermCode("pht");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/pht");
			
		} else if("roletermtextpap".equals(attribute)) {
			name.setRoleTermText("papermaker");
			name.setRoleTermCode("ppm");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/ppm");
			
		} else if("roletermtextprint".equals(attribute)) {
			name.setRoleTermText("printmaker");
			name.setRoleTermCode("prm");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/prm");
			
		} else if("roletermtextprinter".equals(attribute)) {
			name.setRoleTermText("printer");
			name.setRoleTermCode("prt");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/prt");
			
		} else if("roletermtextadd".equals(attribute)) {
			name.setRoleTermText("addressee");
			name.setRoleTermCode("rcp");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/rcp");
			
		} else if("roletermtextsculpt".equals(attribute)) {
			name.setRoleTermText("sculptor");
			name.setRoleTermCode("scl");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/scl");
			
		} else if("roletermtextsurv".equals(attribute)) {
			name.setRoleTermText("surveyor");
			name.setRoleTermCode("srv");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/srv");
			
		} else if("roletermtexttrans".equals(attribute)) {
			name.setRoleTermText("translator");
			name.setRoleTermCode("trl");
			name.setRtValueUri("http://id.loc.gov/vocabulary/relators/trl");
		
		} else if("roletermtextblank".equals(attribute)) {
			name.setRoleTermText("none");
			name.setRoleTermCode("none");
			name.setRtValueUri("none");
	}

		session.update(name);
		return roleZone.getBody();
	}
	
	//public String getNameRoleTermTextLabel() {
		//return name.getRoleTermText() == null ? "" : name.getRoleTermText();
	//}
	
	
	
	
	
	// roleTerm Text
	@CommitAfter public Object onActionFromAddRoleTermTextLang(long id) { return addRoleTermTextAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddRoleTermTextXmlLang(long id) { return addRoleTermTextAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddRoleTermTextScript(long id) { return addRoleTermTextAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddRoleTermTextTransliteration(long id) { return addRoleTermTextAttribute(id, "transliteration"); }
	public Object addRoleTermTextAttribute(long id, String attribute) {
		name = (Name) session.get(Name.class, id);

		if("lang".equals(attribute)) {
			name.setRoleTermTextLang("eng");
		} else if ("xmllang".equals(attribute)) {
			name.setRoleTermTextXmlLang("en");
		} else if ("script".equals(attribute)) {
			name.setRoleTermTextScript("arab");
		} else if ("transliteration".equals(attribute)) {
			name.setRoleTermTextTransliteration(attribute);
		}

		session.update(name);
		return roleZone.getBody();
	}

	public boolean getRemainingRoleTermTextAttributes() {
		if(name.getRoleTermTextLang() != null)
			if(name.getRoleTermTextXmlLang() != null)
				if(name.getRoleTermTextScript() != null)
					if(name.getRoleTermTextTransliteration() != null)
						return false;
		return true;

	}
	

	//roleTerm Code
	@CommitAfter public Object onActionFromAddRoleTermCodeLang(long id) { return addRoleTermCodeAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddRoleTermCodeXmlLang(long id) { return addRoleTermCodeAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddRoleTermCodeScript(long id) { return addRoleTermCodeAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddRoleTermCodeTransliteration(long id) { return addRoleTermCodeAttribute(id, "transliteration"); }
	public Object addRoleTermCodeAttribute(long id, String attribute) {
		name = (Name) session.get(Name.class, id);

		if("lang".equals(attribute)) {
			name.setRoleTermCodeLang("eng");
		} else if ("xmllang".equals(attribute)) {
			name.setRoleTermCodeXmlLang("en");
		} else if ("script".equals(attribute)) {
			name.setRoleTermCodeScript("arab");
		} else if ("transliteration".equals(attribute)) {
			name.setRoleTermCodeTransliteration(attribute);
		}

		session.update(name);
		return roleZone.getBody();
	}

	public boolean getRemainingRoleTermCodeAttributes() {
		if(name.getRoleTermCodeLang() != null)
			if(name.getRoleTermCodeXmlLang() != null)
				if(name.getRoleTermCodeScript() != null)
					if(name.getRoleTermCodeTransliteration() != null)
						return false;
		return true;

	}
	
	
	
	
	
	//
	
	@CommitAfter public Object onActionFromAddNamePart2(long id) { return addNamePart2(id, "namepart2"); }
	public Object addNamePart2(long id, String attribute) {
		name = (Name) session.get(Name.class, id);

		if("namepart2".equals(attribute)) {
			name.setNamePart2("NamePart2");
		} 
		

		session.update(name);
		return namePartZone.getBody();
	}
	
	@CommitAfter public Object onActionFromAddRole2(long id) { return addRole2(id, "role2"); }
	public Object addRole2(long id, String attribute) {
		name = (Name) session.get(Name.class, id);

		if("role2".equals(attribute)) {
			name.setRole2("Role2");
		} 
		session.update(name);
		return roleZone2.getBody();
	}
	
	
	
	
	// namePart
		@CommitAfter public Object onActionFromAddNamePartLang2(long id) { return addNamePartAttribute2(id, "lang"); }
		@CommitAfter public Object onActionFromAddNamePartXmlLang2(long id) { return addNamePartAttribute2(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddNamePartScript2(long id) { return addNamePartAttribute2(id, "script"); }
		@CommitAfter public Object onActionFromAddNamePartTransliteration2(long id) { return addNamePartAttribute2(id, "transliteration"); }
		public Object addNamePartAttribute2(long id, String attribute) {
			name = (Name) session.get(Name.class, id);

			if("lang".equals(attribute)) {
				name.setNamePartLang2("eng");
			} else if ("xmllang".equals(attribute)) {
				name.setNamePartXmlLang2("en");
			} else if ("script".equals(attribute)) {
				name.setNamePartScript2("arab");
			} else if ("transliteration".equals(attribute)) {
				name.setNamePartTransliteration2(attribute);
			}

			session.update(name);
			return namePartZone2.getBody();
		}

		public boolean getRemainingNamePartAttributes2() {
			if(name.getNamePartLang2() != null)
				if(name.getNamePartXmlLang2() != null)
					if(name.getNamePartScript2() != null)
						if(name.getNamePartTransliteration2() != null)
							return false;
			return true;

		}
		
		
		//roleTerm 
		@CommitAfter public Object onActionFromSetRoleTermTypeText2(long id) { return addRoleTermType2(id, "roletermtypetext"); }
		@CommitAfter public Object onActionFromSetRoleTermTypeBlank2(long id) { return addRoleTermType2(id, "roletermtypeblank"); }
		public Object addRoleTermType2(long id, String attribute) {
			name = (Name) session.get(Name.class, id);
			
			

			if("roletermtypetext".equals(attribute)) {
				name.setRoleTermTypeText2("text");
				name.setRtAuthority2("marcrelator");
				name.setRtAuthorityUri2("http://id.loc.gov/vocabulary/relators.html");
				name.setRoleTermTypeCode2("code");
				name.setRoleTermText2("author");
				name.setRoleTermCode2("aut");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/aut");
				
			} else if("roletermtypeblank".equals(attribute)) {
				name.setRoleTermTypeText2("none");
				name.setRoleTermTypeCode2("none");
				name.setRtAuthority2("none");
				name.setRtAuthorityUri2("none");
				name.setRoleTermText2("none");
				name.setRoleTermCode2("none");
				name.setRtValueUri2("none");
			}
		
				session.update(name);
				return roleZone2.getBody();
			}
		
		
		
		
		@CommitAfter public Object onActionFromSetRoleTermTextArchitect2(long id) { return addRoleTerm2(id, "roletermtextarchitect"); }
		@CommitAfter public Object onActionFromSetRoleTermTextArtist2(long id) { return addRoleTerm2(id, "roletermtextartist"); }
		@CommitAfter public Object onActionFromSetRoleTermTextAssocName2(long id) { return addRoleTerm2(id, "roletermtextassocname"); }
		@CommitAfter public Object onActionFromSetRoleTermTextAttName2(long id) { return addRoleTerm2(id, "roletermtextattname"); }
		@CommitAfter public Object onActionFromSetRoleTermTextAuthor2(long id) { return addRoleTerm2(id, "roletermtextauthor"); }
		@CommitAfter public Object onActionFromSetRoleTermTextBook2(long id) { return addRoleTerm2(id, "roletermtextbook"); }
		@CommitAfter public Object onActionFromSetRoleTermTextComp2(long id) { return addRoleTerm2(id, "roletermtextcomp"); }
		@CommitAfter public Object onActionFromSetRoleTermTextColl2(long id) { return addRoleTerm2(id, "roletermtextcoll"); }
		@CommitAfter public Object onActionFromSetRoleTermTextCreator2(long id) { return addRoleTerm2(id, "roletermtextcreator"); }
		@CommitAfter public Object onActionFromSetRoleTermTextCart2(long id) { return addRoleTerm2(id, "roletermtextcart"); }
		@CommitAfter public Object onActionFromSetRoleTermTextDelin2(long id) { return addRoleTerm2(id, "roletermtextdelin"); }
		@CommitAfter public Object onActionFromSetRoleTermTextDonor2(long id) { return addRoleTerm2(id, "roletermtextdonor"); }
		@CommitAfter public Object onActionFromSetRoleTermTextDepic2(long id) { return addRoleTerm2(id, "roletermtextdepic"); }
		@CommitAfter public Object onActionFromSetRoleTermTextDedic2(long id) { return addRoleTerm2(id, "roletermtextdedic"); }
		@CommitAfter public Object onActionFromSetRoleTermTextEditor2(long id) { return addRoleTerm2(id, "roletermtexteditor"); }
		@CommitAfter public Object onActionFromSetRoleTermTextEng2(long id) { return addRoleTerm2(id, "roletermtexteng"); }
		@CommitAfter public Object onActionFromSetRoleTermTextIll2(long id) { return addRoleTerm2(id, "roletermtextill"); }
		@CommitAfter public Object onActionFromSetRoleTermTextMan2(long id) { return addRoleTerm2(id, "roletermtextman"); }
		@CommitAfter public Object onActionFromSetRoleTermTextOrig2(long id) { return addRoleTerm2(id, "roletermtextorig"); }
		@CommitAfter public Object onActionFromSetRoleTermTextPatron2(long id) { return addRoleTerm2(id, "roletermtextpatron"); }
		@CommitAfter public Object onActionFromSetRoleTermTextPhoto2(long id) { return addRoleTerm2(id, "roletermtextphoto"); }
		@CommitAfter public Object onActionFromSetRoleTermTextPap2(long id) { return addRoleTerm2(id, "roletermtextpap"); }
		@CommitAfter public Object onActionFromSetRoleTermTextPrint2(long id) { return addRoleTerm2(id, "roletermtextprint"); }
		@CommitAfter public Object onActionFromSetRoleTermTextPrinter2(long id) { return addRoleTerm2(id, "roletermtextprinter"); }
		@CommitAfter public Object onActionFromSetRoleTermTextAdd2(long id) { return addRoleTerm2(id, "roletermtextadd"); }
		@CommitAfter public Object onActionFromSetRoleTermTextSculpt2(long id) { return addRoleTerm2(id, "roletermtextsculpt"); }
		@CommitAfter public Object onActionFromSetRoleTermTextSurv2(long id) { return addRoleTerm2(id, "roletermtextsurv"); }
		@CommitAfter public Object onActionFromSetRoleTermTextTrans2(long id) { return addRoleTerm2(id, "roletermtexttrans"); }
		@CommitAfter public Object onActionFromSetRoleTermTextBlank2(long id) { return addRoleTerm2(id, "roletermtextblank"); }
		public Object addRoleTerm2(long id, String attribute) {
			name = (Name) session.get(Name.class, id);
			
			

			if("roletermtextarchitect".equals(attribute)) {
				name.setRoleTermText2("architect");
				name.setRoleTermCode2("arc");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/arc");
				
			} else if("roletermtextartist".equals(attribute)) {
				name.setRoleTermText2("artist");
				name.setRoleTermCode2("ar");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/ar");
				
			} else if("roletermtextassocname".equals(attribute)) {
				name.setRoleTermText2("associated name");
				name.setRoleTermCode2("asn");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/asn");
				
			} else if("roletermtextattname".equals(attribute)) {
				name.setRoleTermText2("attributed name");
				name.setRoleTermCode2("att");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/att");
				
			} else if("roletermtextauthor".equals(attribute)) {
				name.setRoleTermText2("author");
				name.setRoleTermCode2("aut");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/aut");
				
			} else if("roletermtextbook".equals(attribute)) {
				name.setRoleTermText2("bookseller");
				name.setRoleTermCode2("bsl");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/bsl");
				
			} else if("roletermtextcomp".equals(attribute)) {
				name.setRoleTermText2("composer");
				name.setRoleTermCode2("cmp");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/cmp");
			
			} else if("roletermtextcoll".equals(attribute)) {
				name.setRoleTermText2("collector");
				name.setRoleTermCode2("col");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/col");
				
			} else if("roletermtextcreator".equals(attribute)) {
				name.setRoleTermText2("creator");
				name.setRoleTermCode2("cre");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/cre");
				
			} else if("roletermtextcart".equals(attribute)) {
				name.setRoleTermText2("cartographer");
				name.setRoleTermCode2("ctg");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/ctg");
				
			} else if("roletermtextdelin".equals(attribute)) {
				name.setRoleTermText2("delineator");
				name.setRoleTermCode2("dln");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/dln");
				
			} else if("roletermtextdonor".equals(attribute)) {
				name.setRoleTermText2("donor");
				name.setRoleTermCode2("dnr");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/dnr");
			
				
			} else if("roletermtextdepic".equals(attribute)) {
				name.setRoleTermText2("depicted");
				name.setRoleTermCode2("dpc");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/dpc");
				
			} else if("roletermtextdedic".equals(attribute)) {
				name.setRoleTermText2("dedicatee");
				name.setRoleTermCode2("dte");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/dte");
				
			} else if("roletermtexteditor".equals(attribute)) {
				name.setRoleTermText2("editor");
				name.setRoleTermCode2("edt");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/edt");
				
			} else if("roletermtexteng".equals(attribute)) {
				name.setRoleTermText2("engraver");
				name.setRoleTermCode2("egr");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/egr");
				
			} else if("roletermtextill".equals(attribute)) {
				name.setRoleTermText2("illustrator");
				name.setRoleTermCode2("ill");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/ill");
				
			} else if("roletermtextman".equals(attribute)) {
				name.setRoleTermText2("manufacturer");
				name.setRoleTermCode2("mfr");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/mfr");
				
			} else if("roletermtextorig".equals(attribute)) {
				name.setRoleTermText2("originator");
				name.setRoleTermCode2("org");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/org");
				
			} else if("roletermtextpatron".equals(attribute)) {
				name.setRoleTermText2("patron");
				name.setRoleTermCode2("pat");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/pat");
				
			} else if("roletermtextphoto".equals(attribute)) {
				name.setRoleTermText2("photographer");
				name.setRoleTermCode2("pht");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/pht");
				
			} else if("roletermtextpap".equals(attribute)) {
				name.setRoleTermText2("papermaker");
				name.setRoleTermCode2("ppm");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/ppm");
				
			} else if("roletermtextprint".equals(attribute)) {
				name.setRoleTermText2("printmaker");
				name.setRoleTermCode2("prm");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/prm");
				
			} else if("roletermtextprinter".equals(attribute)) {
				name.setRoleTermText2("printer");
				name.setRoleTermCode2("prt");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/prt");
				
			} else if("roletermtextadd".equals(attribute)) {
				name.setRoleTermText2("addressee");
				name.setRoleTermCode2("rcp");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/rcp");
				
			} else if("roletermtextsculpt".equals(attribute)) {
				name.setRoleTermText2("sculptor");
				name.setRoleTermCode2("scl");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/scl");
				
			} else if("roletermtextsurv".equals(attribute)) {
				name.setRoleTermText2("surveyor");
				name.setRoleTermCode2("srv");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/srv");
				
			} else if("roletermtexttrans".equals(attribute)) {
				name.setRoleTermText2("translator");
				name.setRoleTermCode2("trl");
				name.setRtValueUri2("http://id.loc.gov/vocabulary/relators/trl");
			
			} else if("roletermtextblank".equals(attribute)) {
				name.setRoleTermText2("none");
				name.setRoleTermCode2("none");
				name.setRtValueUri2("none");
		}

			session.update(name);
			return roleZone2.getBody();
		}
		
		public String getNameRoleTermTextLabel2() {
			return name.getRoleTermText2() == null ? "" : name.getRoleTermText2();
		}
		
		
		// roleTerm Text
		@CommitAfter public Object onActionFromAddRoleTermTextLang2(long id) { return addRoleTermTextAttribute2(id, "lang"); }
		@CommitAfter public Object onActionFromAddRoleTermTextXmlLang2(long id) { return addRoleTermTextAttribute2(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddRoleTermTextScript2(long id) { return addRoleTermTextAttribute2(id, "script"); }
		@CommitAfter public Object onActionFromAddRoleTermTextTransliteration2(long id) { return addRoleTermTextAttribute2(id, "transliteration"); }
		public Object addRoleTermTextAttribute2(long id, String attribute) {
			name = (Name) session.get(Name.class, id);

			if("lang".equals(attribute)) {
				name.setRoleTermTextLang2("eng");
			} else if ("xmllang".equals(attribute)) {
				name.setRoleTermTextXmlLang2("en");
			} else if ("script".equals(attribute)) {
				name.setRoleTermTextScript2("arab");
			} else if ("transliteration".equals(attribute)) {
				name.setRoleTermTextTransliteration2(attribute);
			}

			session.update(name);
			return roleZone2.getBody();
		}

		public boolean getRemainingRoleTermTextAttributes2() {
			if(name.getRoleTermTextLang2() != null)
				if(name.getRoleTermTextXmlLang2() != null)
					if(name.getRoleTermTextScript2() != null)
						if(name.getRoleTermTextTransliteration2() != null)
							return false;
			return true;

		}
		

		//roleTerm Code
		@CommitAfter public Object onActionFromAddRoleTermCodeLang2(long id) { return addRoleTermCodeAttribute2(id, "lang"); }
		@CommitAfter public Object onActionFromAddRoleTermCodeXmlLang2(long id) { return addRoleTermCodeAttribute2(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddRoleTermCodeScript2(long id) { return addRoleTermCodeAttribute2(id, "script"); }
		@CommitAfter public Object onActionFromAddRoleTermCodeTransliteration2(long id) { return addRoleTermCodeAttribute2(id, "transliteration"); }
		public Object addRoleTermCodeAttribute2(long id, String attribute) {
			name = (Name) session.get(Name.class, id);

			if("lang".equals(attribute)) {
				name.setRoleTermCodeLang2("eng");
			} else if ("xmllang".equals(attribute)) {
				name.setRoleTermCodeXmlLang2("en");
			} else if ("script".equals(attribute)) {
				name.setRoleTermCodeScript2("arab");
			} else if ("transliteration".equals(attribute)) {
				name.setRoleTermCodeTransliteration2(attribute);
			}

			session.update(name);
			return roleZone2.getBody();
		}

		public boolean getRemainingRoleTermCodeAttributes2() {
			if(name.getRoleTermCodeLang2() != null)
				if(name.getRoleTermCodeXmlLang2() != null)
					if(name.getRoleTermCodeScript2() != null)
						if(name.getRoleTermCodeTransliteration2() != null)
							return false;
			return true;

		}
		
		
//TYPE OF RESOURCE

		@CommitAfter
		public Object onSuccessFromCreateTor() {
			newTor.setRecord(record);
			newTor.setCreator(getUsername());
			record.getTors().add(newTor);
			session.update(record);
			return torZone.getBody();
		}

		void onPrepareForSubmitFromUpdateTor(Long id) {
			tor = (Tor) session.get(Tor.class, id);
		}

		@CommitAfter
		public void onSuccessFromUpdateTor() {
			session.update(tor);
			updateTor.clearErrors();
		}

		public Object onSubmitFromUpdateTor() {
			return updateTorZone.getBody();
		}
		
	//TYPE OF RESOURCE
	//tor attributes
	@CommitAfter public Object onActionFromAddTorUsage(long id) { return addTorAttribute(id, "usage"); }
	@CommitAfter public Object onActionFromAddTorDisplayLabel(long id) { return addTorAttribute(id, "displaylabel"); }
	@CommitAfter public Object onActionFromAddTorAltRepGroup(long id) { return addTorAttribute(id, "altrepgroup"); }
	public Object addTorAttribute(long id, String attribute) {
		tor = (Tor) session.get(Tor.class, id);

		if("usage".equals(attribute)) {
			tor.setTorUsage("primary");
		} else if ("displaylabel".equals(attribute)) {
			tor.setTorDisplayLabel(attribute);
		} else if ("altrepgroup".equals(attribute)) {
			tor.setTorAltRepGroup(attribute);
		}

		session.update(tor);
		return torAttributeZone.getBody();
	}

	public boolean getRemainingTorAttributes() {
		if(tor.getTorUsage() != null)
			if(tor.getTorDisplayLabel() != null)
				if(tor.getTorAltRepGroup() != null)
					return false;
		return true;

	}
	
	//GENRE
	
		@CommitAfter
		public Object onSuccessFromCreateGenre() {
			newGenre.setRecord(record);
			newGenre.setCreator(getUsername());
			newGenre.setAuthority("aat");
			newGenre.setAuthorityUri("http://vocab.getty.edu/resource/aat.html");
			record.getGenres().add(newGenre);
			session.update(record);
			return genreZone.getBody();
		}

		void onPrepareForSubmitFromUpdateGenre(Long id) {
			genre = (Genre) session.get(Genre.class, id);
		}

		@CommitAfter
		public void onSuccessFromUpdateGenre() {
			session.update(genre);
			updateGenre.clearErrors();
		}

		

		public Object onSubmitFromUpdateGenre() {
			return updateGenreZone.getBody();
		}

		public String getGenreAuthorityLabel() {
			return genre.getAuthority() == null ? "aat" : genre.getAuthority();
				
		}
		
		
		
		public String getGenreAuthorityUriLabel() {
			return genre.getAuthorityUri() == null ? "http://vocab.getty.edu/resource/aat.html" : genre.getAuthorityUri();
		}
	
	//genre authority
	@CommitAfter public Object onActionFromSetAuthorityLcgft(long id) { return addGenreAuthority(id, "authorityLcgft"); }
	@CommitAfter public Object onActionFromSetAuthorityTgm(long id) { return addGenreAuthority(id, "authorityTgm"); }
	@CommitAfter public Object onActionFromSetAuthorityAat(long id) { return addGenreAuthority(id, "authorityAat"); }
	public Object addGenreAuthority(long id, String attribute) {
		genre = (Genre) session.get(Genre.class, id);
		
		

		if("authorityLcgft".equals(attribute)) {
			genre.setAuthority("lcgft");
			genre.setAuthorityUri("http://id.loc.gov/authorities/genreForms.html");
			
		} else if("authorityTgm".equals(attribute)) {
			genre.setAuthority("tgm");
			genre.setAuthorityUri("http://id.loc.gov/vocabulary/graphicMaterials.html");
			
		} else if("authorityAat".equals(attribute)) {
			genre.setAuthority("aat");
			genre.setAuthorityUri("http://vocab.getty.edu/resource/aat.html");
	
		}
		
	    	session.update(genre);
			return genreAuthorityZone.getBody();
		}
	
	
	
		//genre attributes
		@CommitAfter public Object onActionFromAddGenreType(long id) { return addGenreAttribute(id, "type"); }
		@CommitAfter public Object onActionFromAddGenreUsage(long id) { return addGenreAttribute(id, "usage"); }
		@CommitAfter public Object onActionFromAddGenreDisplayLabel(long id) { return addGenreAttribute(id, "displaylabel"); }
		@CommitAfter public Object onActionFromAddGenreAltRepGroup(long id) { return addGenreAttribute(id, "altrepgroup"); }
		@CommitAfter public Object onActionFromAddGenreLang(long id) { return addGenreAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddGenreXmlLang(long id) { return addGenreAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddGenreScript(long id) { return addGenreAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddGenreTransliteration(long id) { return addGenreAttribute(id, "transliteration"); }
		public Object addGenreAttribute(long id, String attribute) {
			genre = (Genre) session.get(Genre.class, id);

			
			if("type".equals(attribute)) {
				genre.setGenreType("class");
			} else if("usage".equals(attribute)) {
				genre.setGenreUsage("primary");
			} else if ("displaylabel".equals(attribute)) {
				genre.setGenreDisplayLabel(attribute);
			} else if ("altrepgroup".equals(attribute)) {
				genre.setGenreAltRepGroup(attribute);
			} else if("lang".equals(attribute)) {
				genre.setGenreLang("eng");
			} else if ("xmllang".equals(attribute)) {
				genre.setGenreXmlLang("en");
			} else if ("script".equals(attribute)) {
				genre.setGenreScript("arab");
			} else if ("transliteration".equals(attribute)) {
				genre.setGenreTransliteration(attribute);
			}

			session.update(genre);
			return genreChoiceZone.getBody();
		}

		public boolean getRemainingGenreAttributes() {
			if(genre.getGenreType() != null)
				if(genre.getGenreUsage() != null)
					if(genre.getGenreDisplayLabel() != null)
						if(genre.getGenreAltRepGroup() != null)
							if(genre.getGenreLang() != null)
								if(genre.getGenreXmlLang() != null)
									if(genre.getGenreScript() != null)
										if(genre.getGenreTransliteration() != null)
											return false;
			return true;

		}
	

	// Language
	
	@CommitAfter
	public Object onSuccessFromCreateLanguage() {
		newLanguage.setRecord(record);
		newLanguage.setCreator(getUsername());
		record.getLanguages().add(newLanguage);
		newLanguage.setLanguageTermTypeText("Text");
		newLanguage.setLanguageTermTypeText2("none");
		newLanguage.setLanguageTermText("English");
		newLanguage.setLanguageTermText2("none");
		newLanguage.setLanguageTermTypeCode("Code");
		newLanguage.setLanguageTermTypeCode2("none");
		newLanguage.setLanguageTermCode("Eng");
		newLanguage.setLanguageTermCode2("none");
		newLanguage.setLangTermAuthority("iso639-2b");
		newLanguage.setLangTermAuthority2("none");
		newLanguage.setLangTermAuthorityUri("http://id.loc.gov/vocabulary/iso639-2.html");
		newLanguage.setLangTermAuthorityUri2("none");
		newLanguage.setLangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/eng.html");
		newLanguage.setLangTermValueUri2("none");
		session.update(record);
		return languageZone.getBody();
	}

	void onPrepareForSubmitFromUpdateLanguage(Long id) {
		language = (Language) session.get(Language.class, id);
	}

	@CommitAfter
	public void onSuccessFromUpdateLanguage() {
		session.update(language);
		updateLanguage.clearErrors();
	}

	public Object onSubmitFromUpdateLanguage() {
		return updateLanguageZone.getBody();
	}
	
	
	//public void onValidateFromLanguage_LanguageTermText(String value) {
		//if(name.hasLanguageTermTextAttributes() && (value == null || "".equals(value))) {
			//updateLanguage.recordError("Language Term cannot be empty and have attributes.");
		//}
	//}
	
	//public void onValidateFromLanguage_LanguageTermCode(String value) {
		//if(name.hasLanguageTermCodeAttributes() && (value == null || "".equals(value))) {
			//updateLanguage.recordError("Language Term cannot be empty and have attributes.");
		//}
	//}


	
	//Language attributes
	@CommitAfter public Object onActionFromAddLanguageUsage(long id) { return addLanguageAttribute(id, "usage"); }
	@CommitAfter public Object onActionFromAddLanguageObjectPart(long id) { return addLanguageAttribute(id, "objectPart"); }
	@CommitAfter public Object onActionFromAddLanguageDisplayLabel(long id) { return addLanguageAttribute(id, "displayLabel"); }
	@CommitAfter public Object onActionFromAddLanguageAltRepGroup(long id) { return addLanguageAttribute(id, "altrepgroup"); }
	@CommitAfter public Object onActionFromAddLanguageLang(long id) { return addLanguageAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddLanguageXmlLang(long id) { return addLanguageAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddLanguageScript(long id) { return addLanguageAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddLanguageTransliteration(long id) { return addLanguageAttribute(id, "transliteration"); }
	public Object addLanguageAttribute(long id, String attribute) {
		language = (Language) session.get(Language.class, id);

		if("usage".equals(attribute)) {
			language.setLangUsage("primary");
		} else if ("objectPart".equals(attribute)) {
			language.setLangObjectPart(attribute);
		} else if ("altrepgroup".equals(attribute)) {
			language.setLangAltRepGroup(attribute);
		} else if ("displayLabel".equals(attribute)) {
			language.setLangDisplayLabel(attribute);
		} else if("lang".equals(attribute)) {
			language.setLangLang("eng");
		} else if ("xmllang".equals(attribute)) {
			language.setLangXmlLang("en");
		} else if ("script".equals(attribute)) {
			language.setLangScript("arab");
		} else if ("transliteration".equals(attribute)) {
			language.setLangTransliteration(attribute);
		}

		session.update(language);
		return languageAttributeZone.getBody();
	}

	public boolean getRemainingLanguageAttributes() {
		if(language.getLangUsage() != null)
			if(language.getLangObjectPart() != null)
				if(language.getLangAltRepGroup() != null)
					if(language.getLangDisplayLabel() != null)
							if(language.getLangLang() != null)
								if(language.getLangXmlLang() != null)
									if(language.getLangScript() != null)
										if(language.getLangTransliteration() != null)
												return false;
		return true;

	}
	
	
	
	//languageTerm 
	
	
	public String getLanguageTermTypeTextLabel() {
		return language.getLanguageTermTypeText() == null ? "text" : language.getLanguageTermTypeText();
	}
	
	public String getLanguageTermTypeText2Label() {
		return language.getLanguageTermTypeText2() == null ? "none" : language.getLanguageTermTypeText2();
	}
	
	public String getLanguageTermTextLabel() {
		return language.getLanguageTermText() == null ? "english" : language.getLanguageTermText();
	}
	
	public String getLanguageTermText2Label() {
		return language.getLanguageTermText2() == null ? "none" : language.getLanguageTermText2();
	}
	
	public String getLanguageTermTypeCodeLabel() {
		return language.getLanguageTermTypeCode() == null ? "code" : language.getLanguageTermTypeCode();
	}
	
	public String getLanguageTermTypeCode2Label() {
		return language.getLanguageTermTypeCode2() == null ? "none" : language.getLanguageTermTypeCode2();
	}
	
	public String getLanguageTermCodeLabel() {
		return language.getLanguageTermCode() == null ? "eng" : language.getLanguageTermCode();
	}
	
	public String getLanguageTermCode2Label() {
		return language.getLanguageTermCode2() == null ? "none" : language.getLanguageTermCode2();
	}
	
	public String getLanguageTermAuthorityLabel() {
		return language.getLangTermAuthority() == null ? "iso639-2b" : language.getLangTermAuthority();
	}
	
	public String getLanguageTermAuthority2Label() {
		return language.getLangTermAuthority2() == null ? "none" : language.getLangTermAuthority2();
	}
	
	public String getLanguageTermAuthorityUriLabel() {
		return language.getLangTermAuthorityUri() == null ? "http://id.loc.gov/vocabulary/iso639-2.html" : language.getLangTermAuthorityUri();
	}
	
	public String getLanguageTermAuthorityUri2Label() {
		return language.getLangTermAuthorityUri2() == null ? "none" : language.getLangTermAuthorityUri2();
	}
	
	public String getLanguageTermValueUriLabel() {
		return language.getLangTermValueUri() == null ? "http://id.loc.gov/vocabulary/iso639-2/eng.html" : language.getLangTermValueUri();
	}
	
	public String getLanguageTermValueUri2Label() {
		return language.getLangTermValueUri2() == null ? "none" : language.getLangTermValueUri2();
	}
	
	@CommitAfter public Object onActionFromSetLanguageTermTypeText(long id) { return addLanguageTermType(id, "languagetermtypetext"); }
	@CommitAfter public Object onActionFromSetLanguageTermTypeBlank(long id) { return addLanguageTermType(id, "languagetermtypeblank"); }
	public Object addLanguageTermType(long id, String attribute) {
		language = (Language) session.get(Language.class, id);
		
		if("languagetermtypetext".equals(attribute)) {
			language.setLanguageTermTypeText("text");
			language.setLangTermAuthority("ISO639-2b");
			language.setLangTermAuthorityUri("http://id.loc.gov/vocabulary/iso639-2.html");
			language.setLanguageTermTypeCode("code");
			language.setLanguageTermText("english");
			language.setLanguageTermCode("eng");
			language.setLangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/eng.html");
			
		} else if("languagetermtypeblank".equals(attribute)) {
			language.setLanguageTermTypeText("none");
			language.setLanguageTermTypeCode("none");
			language.setLangTermAuthority("none");
			language.setLangTermAuthorityUri("none");
			language.setLanguageTermText("none");
			language.setLanguageTermCode("none");
			language.setLangTermValueUri("none");
		}
	
			session.update(language);
			return languageTermZone.getBody();
		}
	
	@CommitAfter public Object onActionFromSetLangTermTextEng(long id) { return addLanguageTerm(id, "languagetermtextenglish"); }
	@CommitAfter public Object onActionFromSetLangTermTextFre(long id) { return addLanguageTerm(id, "languagetermtextfrench"); }
	@CommitAfter public Object onActionFromSetLangTermTextGer(long id) { return addLanguageTerm(id, "languagetermtextgerman"); }
	@CommitAfter public Object onActionFromSetLangTermTextGle(long id) { return addLanguageTerm(id, "languagetermtextirish"); }
	@CommitAfter public Object onActionFromSetLangTermTextIta(long id) { return addLanguageTerm(id, "languagetermtextitalian"); }
	@CommitAfter public Object onActionFromSetLangTermTextLat(long id) { return addLanguageTerm(id, "languagetermtextlatin"); }
	@CommitAfter public Object onActionFromSetLangTermTextSpa(long id) { return addLanguageTerm(id, "languagetermtextspanish"); }
	@CommitAfter public Object onActionFromSetLangTermTextBlank(long id) { return addLanguageTerm(id, "languagetermtextblank"); }
	public Object addLanguageTerm(long id, String attribute) {
		language = (Language) session.get(Language.class, id);
		
		if("languagetermtextenglish".equals(attribute)) {
			language.setLanguageTermText("english");
			language.setLanguageTermCode("eng");
			language.setLangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/eng.html");
			
		} else if("languagetermtextfrench".equals(attribute)) {
			language.setLanguageTermText("french");
			language.setLanguageTermCode("fre");
			language.setLangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/fre.html");
			
		} else if("languagetermtextgerman".equals(attribute)) {
			language.setLanguageTermText("german");
			language.setLanguageTermCode("ger");
			language.setLangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/ger.html");
			
		} else if("languagetermtextirish".equals(attribute)) {
			language.setLanguageTermText("irish");
			language.setLanguageTermCode("gle");
			language.setLangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/gle.html");
			
		} else if("languagetermtextitalian".equals(attribute)) {
			language.setLanguageTermText("italian");
			language.setLanguageTermCode("ita");
			language.setLangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/ita.html");
			
		} else if("languagetermtextlatin".equals(attribute)) {
			language.setLanguageTermText("latin");
			language.setLanguageTermCode("lat");
			language.setLangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/lat.html");
			
		} else if("languagetermtextspanish".equals(attribute)) {
			language.setLanguageTermText("spanish");
			language.setLanguageTermCode("spa");
			language.setLangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/spa.html");
		
		} else if("languagetermtextblank".equals(attribute)) {
			language.setLanguageTermText("none");
			language.setLanguageTermCode("none");
			language.setLangTermValueUri("none");
	}

		session.update(language);
		return languageTermZone.getBody();
	}
	
	//public String getLanguageTermTextLabel() {
		//return language.getLanguageTermText() == null ? "" : language.getLanguageTermText();
	//}
	
	
	// langTerm Text
	@CommitAfter public Object onActionFromAddLangTermTextLang(long id) { return addLanguageTermTextAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddLangTermTextXmlLang(long id) { return addLanguageTermTextAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddLangTermTextScript(long id) { return addLanguageTermTextAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddLangTermTextTransliteration(long id) { return addLanguageTermTextAttribute(id, "transliteration"); }
	public Object addLanguageTermTextAttribute(long id, String attribute) {
		language = (Language) session.get(Language.class, id);

		if("lang".equals(attribute)) {
			language.setLanguageTermTextLang("eng");
		} else if ("xmllang".equals(attribute)) {
			language.setLanguageTermTextXmlLang("en");
		} else if ("script".equals(attribute)) {
			language.setLanguageTermTextScript("arab");
		} else if ("transliteration".equals(attribute)) {
			language.setLanguageTermTextTransliteration(attribute);
		}

		session.update(language);
		return languageTermZone.getBody();
	}

	public boolean getRemainingLanguageTermTextAttributes() {
		if(language.getLanguageTermTextLang() != null)
			if(language.getLanguageTermTextXmlLang() != null)
				if(language.getLanguageTermTextScript() != null)
					if(language.getLanguageTermTextTransliteration() != null)
						return false;
		return true;

	}
	

	//langTerm Code
	@CommitAfter public Object onActionFromAddLangTermCodeLang(long id) { return addLanguageTermCodeAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddLangTermCodeXmlLang(long id) { return addLanguageTermCodeAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddLangTermCodeScript(long id) { return addLanguageTermCodeAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddLangTermCodeTransliteration(long id) { return addLanguageTermCodeAttribute(id, "transliteration"); }
	public Object addLanguageTermCodeAttribute(long id, String attribute) {
		language = (Language) session.get(Language.class, id);

		if("lang".equals(attribute)) {
			language.setLanguageTermCodeLang("eng");
		} else if ("xmllang".equals(attribute)) {
			language.setLanguageTermCodeXmlLang("en");
		} else if ("script".equals(attribute)) {
			language.setLanguageTermCodeScript("arab");
		} else if ("transliteration".equals(attribute)) {
			language.setLanguageTermCodeTransliteration(attribute);
		}

		session.update(language);
		return languageTermZone.getBody();
	}

	public boolean getRemainingLanguageTermCodeAttributes() {
		if(language.getLanguageTermCodeLang() != null)
			if(language.getLanguageTermCodeXmlLang() != null)
				if(language.getLanguageTermCodeScript() != null)
					if(language.getLanguageTermCodeTransliteration() != null)
						return false;
		return true;

	}
	
		
		//languageTerm 2
		
		@CommitAfter public Object onActionFromAddLanguageTerm2(long id) { return addLanguageTerm2(id, "languageTerm2"); }
		public Object addLanguageTerm2(long id, String attribute) {
			language = (Language) session.get(Language.class, id);

			if("languageTerm2".equals(attribute)) {
				language.setLanguageTerm2("languageTerm2");
			} 
			session.update(language);
			return languageTerm2Zone.getBody();
		}
		
		public String getLanguageTermTypeTextLabel2() {
			return language.getLanguageTermTypeText2() == null ? "none" : language.getLanguageTermTypeText2();
		}
		
		@CommitAfter public Object onActionFromSetLanguageTermTypeText2(long id) { return addLanguageTermType2(id, "languagetermtypetext2"); }
		@CommitAfter public Object onActionFromSetLanguageTermTypeBlank2(long id) { return addLanguageTermType2(id, "languagetermtypeblank2"); }
		public Object addLanguageTermType2(long id, String attribute) {
			language = (Language) session.get(Language.class, id);
			
			if("languagetermtypetext2".equals(attribute)) {
				language.setLanguageTermTypeText2("text");
				language.setLangTermAuthority2("ISO639-2b");
				language.setLangTermAuthorityUri2("http://id.loc.gov/vocabulary/iso639-2.html");
				language.setLanguageTermTypeCode2("code");
				language.setLanguageTermText2("english");
				language.setLanguageTermCode2("eng");
				language.setLangTermValueUri2("http://id.loc.gov/vocabulary/iso639-2/eng.html");
				
			} else if("languagetermtypeblank2".equals(attribute)) {
				language.setLanguageTermTypeText2("none");
				language.setLanguageTermTypeCode2("none");
				language.setLangTermAuthority2("none");
				language.setLangTermAuthorityUri2("none");
				language.setLanguageTermText2("none");
				language.setLanguageTermCode2("none");
				language.setLangTermValueUri2("none");
			}
		
				session.update(language);
				return languageTerm2Zone.getBody();
			}
		
		@CommitAfter public Object onActionFromSetLangTermTextEng2(long id) { return addLanguageTermText2(id, "languagetermtextenglish2"); }
		@CommitAfter public Object onActionFromSetLangTermTextFre2(long id) { return addLanguageTermText2(id, "languagetermtextfrench2"); }
		@CommitAfter public Object onActionFromSetLangTermTextGer2(long id) { return addLanguageTermText2(id, "languagetermtextgerman2"); }
		@CommitAfter public Object onActionFromSetLangTermTextGle2(long id) { return addLanguageTermText2(id, "languagetermtextirish2"); }
		@CommitAfter public Object onActionFromSetLangTermTextIta2(long id) { return addLanguageTermText2(id, "languagetermtextitalian2"); }
		@CommitAfter public Object onActionFromSetLangTermTextLat2(long id) { return addLanguageTermText2(id, "languagetermtextlatin2"); }
		@CommitAfter public Object onActionFromSetLangTermTextSpa2(long id) { return addLanguageTermText2(id, "languagetermtextspanish2"); }
		@CommitAfter public Object onActionFromSetLangTermTextBlank2(long id) { return addLanguageTermText2(id, "languagetermtextblank2"); }
		public Object addLanguageTermText2(long id, String attribute) {
			language = (Language) session.get(Language.class, id);
			
			if("languagetermtextenglish2".equals(attribute)) {
				language.setLanguageTermText2("english");
				language.setLanguageTermCode2("eng");
				language.setLangTermValueUri2("http://id.loc.gov/vocabulary/iso639-2/eng.html");
				
			} else if("languagetermtextfrench2".equals(attribute)) {
				language.setLanguageTermText2("french");
				language.setLanguageTermCode2("fre");
				language.setLangTermValueUri2("http://id.loc.gov/vocabulary/iso639-2/fre.html");
				
			} else if("languagetermtextgerman2".equals(attribute)) {
				language.setLanguageTermText2("german");
				language.setLanguageTermCode2("ger");
				language.setLangTermValueUri2("http://id.loc.gov/vocabulary/iso639-2/ger.html");
				
			} else if("languagetermtextirish2".equals(attribute)) {
				language.setLanguageTermText2("irish");
				language.setLanguageTermCode2("gle");
				language.setLangTermValueUri2("http://id.loc.gov/vocabulary/iso639-2/gle.html");
				
			} else if("languagetermtextitalian2".equals(attribute)) {
				language.setLanguageTermText2("italian");
				language.setLanguageTermCode2("ita");
				language.setLangTermValueUri2("http://id.loc.gov/vocabulary/iso639-2/ita.html");
				
			} else if("languagetermtextlatin2".equals(attribute)) {
				language.setLanguageTermText2("latin");
				language.setLanguageTermCode2("lat");
				language.setLangTermValueUri2("http://id.loc.gov/vocabulary/iso639-2/lat.html");
				
			} else if("languagetermtextspanish2".equals(attribute)) {
				language.setLanguageTermText2("spanish");
				language.setLanguageTermCode2("spa");
				language.setLangTermValueUri2("http://id.loc.gov/vocabulary/iso639-2/spa.html");
			
			} else if("languagetermtextblank2".equals(attribute)) {
				language.setLanguageTermText2("none");
				language.setLanguageTermCode2("none");
				language.setLangTermValueUri2("none");
		}

			session.update(language);
			return languageTerm2Zone.getBody();
		}
		
		public String getLanguageTermTextLabel2() {
			return language.getLanguageTermText2() == null ? "" : language.getLanguageTermText2();
		}
		
		
		// langTerm Text
		@CommitAfter public Object onActionFromAddLangTermTextLang2(long id) { return addLanguageTermTextAttribute2(id, "lang2"); }
		@CommitAfter public Object onActionFromAddLangTermTextXmlLang2(long id) { return addLanguageTermTextAttribute2(id, "xmllang2"); }
		@CommitAfter public Object onActionFromAddLangTermTextScript2(long id) { return addLanguageTermTextAttribute2(id, "script2"); }
		@CommitAfter public Object onActionFromAddLangTermTextTransliteration2(long id) { return addLanguageTermTextAttribute2(id, "transliteration2"); }
		public Object addLanguageTermTextAttribute2(long id, String attribute) {
			language = (Language) session.get(Language.class, id);

			if("lang2".equals(attribute)) {
				language.setLanguageTermTextLang2("eng");
			} else if ("xmllang2".equals(attribute)) {
				language.setLanguageTermTextXmlLang2("en");
			} else if ("script2".equals(attribute)) {
				language.setLanguageTermTextScript2("arab");
			} else if ("transliteration2".equals(attribute)) {
				language.setLanguageTermTextTransliteration2(attribute);
			}

			session.update(language);
			return languageTerm2Zone.getBody();
		}

		public boolean getRemainingLanguageTermTextAttributes2() {
			if(language.getLanguageTermTextLang2() != null)
				if(language.getLanguageTermTextXmlLang2() != null)
					if(language.getLanguageTermTextScript2() != null)
						if(language.getLanguageTermTextTransliteration2() != null)
							return false;
			return true;

		}
		

		//langTerm Code
		@CommitAfter public Object onActionFromAddLangTermCodeLang2(long id) { return addLanguageTermCodeAttribute2(id, "lang2"); }
		@CommitAfter public Object onActionFromAddLangTermCodeXmlLang2(long id) { return addLanguageTermCodeAttribute2(id, "xmllang2"); }
		@CommitAfter public Object onActionFromAddLangTermCodeScript2(long id) { return addLanguageTermCodeAttribute2(id, "script2"); }
		@CommitAfter public Object onActionFromAddLangTermCodeTransliteration2(long id) { return addLanguageTermCodeAttribute2(id, "transliteration2"); }
		public Object addLanguageTermCodeAttribute2(long id, String attribute) {
			language = (Language) session.get(Language.class, id);

			if("lang2".equals(attribute)) {
				language.setLanguageTermCodeLang2("eng");
			} else if ("xmllang2".equals(attribute)) {
				language.setLanguageTermCodeXmlLang2("en");
			} else if ("script2".equals(attribute)) {
				language.setLanguageTermCodeScript2("arab");
			} else if ("transliteration2".equals(attribute)) {
				language.setLanguageTermCodeTransliteration2(attribute);
			}

			session.update(language);
			return languageTerm2Zone.getBody();
		}

		public boolean getRemainingLanguageTermCodeAttributes2() {
			if(language.getLanguageTermCodeLang2() != null)
				if(language.getLanguageTermCodeXmlLang2() != null)
					if(language.getLanguageTermCodeScript2() != null)
						if(language.getLanguageTermCodeTransliteration2() != null)
							return false;
			return true;

		}
		
		
		
		
		//Abstract
		
		@CommitAfter
		public Object onSuccessFromCreateAbstractSection() {
			newAbstractSection.setRecord(record);
			newAbstractSection.setCreator(getUsername());
			record.getAbstractSections().add(newAbstractSection);
			session.update(record);
			return abstractZone.getBody();
		}

		void onPrepareForSubmitFromUpdateAbstractSection(Long id) {
			abstractSection = (AbstractSection) session.get(AbstractSection.class, id);
		}

		@CommitAfter
		public void onSuccessFromUpdateAbstractSection() {
			session.update(abstractSection);
			updateAbstractSection.clearErrors();
		}

		public Object onSubmitFromUpdateAbstractSection() {
			return updateAbstractZone.getBody();
		}

		/*public void onValidateFromAbstract_AbstractText(String value) {
			if(abstractSection.hasAttributes() && (value == null || "".equals(value))) {
				updateAbstractSection.recordError("Abstract cannot be empty and have attributes.");
			}
		}*/
		
		//abstract attributes
		@CommitAfter public Object onActionFromAddAbShareable(long id) { return addAbstractAttribute(id, "shareable"); }
		@CommitAfter public Object onActionFromAddAbType(long id) { return addAbstractAttribute(id, "type"); }
		@CommitAfter public Object onActionFromAddAbDisplayLabel(long id) { return addAbstractAttribute(id, "displayLabel"); }
		@CommitAfter public Object onActionFromAddAbAltRepGroup(long id) { return addAbstractAttribute(id, "altrepgroup"); }
		@CommitAfter public Object onActionFromAddAbAltFormat(long id) { return addAbstractAttribute(id, "altformat"); }
		@CommitAfter public Object onActionFromAddAbContentType(long id) { return addAbstractAttribute(id, "contenttype"); }
		@CommitAfter public Object onActionFromAddAbXlink(long id) { return addAbstractAttribute(id, "xlink"); }
		@CommitAfter public Object onActionFromAddAbLang(long id) { return addAbstractAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddAbXmlLang(long id) { return addAbstractAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddAbScript(long id) { return addAbstractAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddAbTransliteration(long id) { return addAbstractAttribute(id, "transliteration"); }
		public Object addAbstractAttribute(long id, String attribute) {
			abstractSection = (AbstractSection) session.get(AbstractSection.class, id);

			if("shareable".equals(attribute)) {
				abstractSection.setAbShareable("no");
			} else if ("type".equals(attribute)) {
				abstractSection.setAbType(attribute);
			} else if ("displayLabel".equals(attribute)) {
				abstractSection.setAbDisplayLabel(attribute);
			} else if ("altrepgroup".equals(attribute)) {
				abstractSection.setAbAltRepGroup(attribute);
			} else if ("altformat".equals(attribute)) {
				abstractSection.setAbAltFormat(attribute);
			} else if ("contenttype".equals(attribute)) {
				abstractSection.setAbContentType(attribute);
			} else if ("xlink".equals(attribute)) {
				abstractSection.setAbXlink(attribute);
			} else if("lang".equals(attribute)) {
				abstractSection.setAbLang("eng");
			} else if ("xmllang".equals(attribute)) {
				abstractSection.setAbXmlLang("en");
			} else if ("script".equals(attribute)) {
				abstractSection.setAbScript("arab");
			} else if ("transliteration".equals(attribute)) {
				abstractSection.setAbTransliteration(attribute);
			}

			session.update(abstractSection);
			return abstractTextZone.getBody();
		}

		public boolean getRemainingAbstractAttributes() {
			if(abstractSection.getAbShareable() != null)
				if(abstractSection.getAbType() != null)
					if(abstractSection.getAbDisplayLabel() != null)
						if(abstractSection.getAbAltRepGroup() != null)
							if(abstractSection.getAbAltFormat() != null)
								if(abstractSection.getAbContentType() != null)
									if(abstractSection.getAbXlink() != null)
											if(abstractSection.getAbLang() != null)
												if(abstractSection.getAbXmlLang() != null)
													if(abstractSection.getAbScript() != null)
														if(abstractSection.getAbTransliteration() != null)
																return false;
			return true;

		}
		
		
		
    //toc

	@CommitAfter
	public Object onSuccessFromCreateToc() {
		newToc.setRecord(record);
		newToc.setCreator(getUsername());
		record.getTocs().add(newToc);
		session.update(record);
		return tocZone.getBody();
	}

	void onPrepareForSubmitFromUpdateToc(Long id) {
		toc = (Toc) session.get(Toc.class, id);
	}

	@CommitAfter
	public void onSuccessFromUpdateToc() {
		session.update(toc);
		updateToc.clearErrors();
	}

	public Object onSubmitFromUpdateToc() {
		return updateTocZone.getBody();
	}

	/*public void onValidateFromToc_Toc(String value) {
		if(toc.hasAttributes() && (value == null || "".equals(value))) {
			updateToc.recordError("Table of Contents cannot be empty and have attributes.");
		}
	}*/
	
	//toc attributes
	@CommitAfter public Object onActionFromAddTocShareable(long id) { return addTocAttribute(id, "shareable"); }
	@CommitAfter public Object onActionFromAddTocType(long id) { return addTocAttribute(id, "type"); }
	@CommitAfter public Object onActionFromAddTocDisplayLabel(long id) { return addTocAttribute(id, "displayLabel"); }
	@CommitAfter public Object onActionFromAddTocAltRepGroup(long id) { return addTocAttribute(id, "altrepgroup"); }
	@CommitAfter public Object onActionFromAddTocAltFormat(long id) { return addTocAttribute(id, "altformat"); }
	@CommitAfter public Object onActionFromAddTocContentType(long id) { return addTocAttribute(id, "contenttype"); }
	@CommitAfter public Object onActionFromAddTocXlink(long id) { return addTocAttribute(id, "xlink"); }
	@CommitAfter public Object onActionFromAddTocLang(long id) { return addTocAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddTocXmlLang(long id) { return addTocAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddTocScript(long id) { return addTocAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddTocTransliteration(long id) { return addTocAttribute(id, "transliteration"); }
	public Object addTocAttribute(long id, String attribute) {
		toc = (Toc) session.get(Toc.class, id);

		if("shareable".equals(attribute)) {
			toc.setTocShareable("no");
		} else if ("type".equals(attribute)) {
			toc.setTocType(attribute);
		} else if ("displayLabel".equals(attribute)) {
			toc.setTocDisplayLabel(attribute);
		} else if ("altrepgroup".equals(attribute)) {
			toc.setTocAltRepGroup(attribute);
		} else if ("altformat".equals(attribute)) {
			toc.setTocAltFormat(attribute);
		} else if ("contenttype".equals(attribute)) {
			toc.setTocContentType(attribute);
		} else if ("xlink".equals(attribute)) {
			toc.setTocXlink(attribute);
		} else if("lang".equals(attribute)) {
			toc.setTocLang("eng");
		} else if ("xmllang".equals(attribute)) {
			toc.setTocXmlLang("en");
		} else if ("script".equals(attribute)) {
			toc.setTocScript("arab");
		} else if ("transliteration".equals(attribute)) {
			toc.setTocTransliteration(attribute);
		}

		session.update(toc);
		return tocTextZone.getBody();
	}

	public boolean getRemainingTocAttributes() {
		if(toc.getTocShareable() != null)
			if(toc.getTocType() != null)
				if(toc.getTocDisplayLabel() != null)
					if(toc.getTocAltRepGroup() != null)
						if(toc.getTocAltFormat() != null)
							if(toc.getTocContentType() != null)
								if(toc.getTocXlink() != null)
										if(toc.getTocLang() != null)
											if(toc.getTocXmlLang() != null)
												if(toc.getTocScript() != null)
													if(toc.getTocTransliteration() != null)
															return false;
		return true;

	}
	

		
//note

	@CommitAfter
	public Object onSuccessFromCreateNote() {
		newNote.setRecord(record);
		newNote.setCreator(getUsername());
		record.getNotes().add(newNote);
		session.update(record);
		return noteZone.getBody();
	}

	void onPrepareForSubmitFromUpdateNote(Long id) {
		note = (Note) session.get(Note.class, id);
	}

	@CommitAfter
	public void onSuccessFromUpdateNote() {
		session.update(note);
		updateNote.clearErrors();
	}

	public Object onSubmitFromUpdateNote() {
		return updateNoteZone.getBody();
	}

//	public void onValidateFromNote_Note(String value) {
//		if(note.hasAttributes() && (value == null || "".equals(value))) {
//			updateNote.recordError("Note cannot be empty and have attributes.");
//		}
//	}
	
	//note attributes
	@CommitAfter public Object onActionFromAddNoteType(long id) { return addNoteAttribute(id, "type"); }
	@CommitAfter public Object onActionFromAddNoteDisplayLabel(long id) { return addNoteAttribute(id, "displayLabel"); }
	@CommitAfter public Object onActionFromAddNoteAltRepGroup(long id) { return addNoteAttribute(id, "altrepgroup"); }
	@CommitAfter public Object onActionFromAddNoteXlink(long id) { return addNoteAttribute(id, "xlink"); }
	@CommitAfter public Object onActionFromAddNoteID(long id) { return addNoteAttribute(id, "id"); }
	@CommitAfter public Object onActionFromAddNoteLang(long id) { return addNoteAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddNoteXmlLang(long id) { return addNoteAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddNoteScript(long id) { return addNoteAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddNoteTransliteration(long id) { return addNoteAttribute(id, "transliteration"); }
	@CommitAfter public Object onActionFromAddNoteTypeUri(long id) { return addNoteAttribute(id, "typeUri"); }
	public Object addNoteAttribute(long id, String attribute) {
		note = (Note) session.get(Note.class, id);

		if ("type".equals(attribute)) {
			note.setNoteType(attribute);
		} else if ("displayLabel".equals(attribute)) {
			note.setNoteDisplayLabel(attribute);
		} else if ("altrepgroup".equals(attribute)) {
			note.setNoteAltRepGroup(attribute);
		} else if ("xlink".equals(attribute)) {
			note.setNoteXlink(attribute);
		} else if ("id".equals(attribute)) {
			note.setNoteId(attribute);
		} else if("lang".equals(attribute)) {
			note.setNoteLang("eng");
		} else if ("xmllang".equals(attribute)) {
			note.setNoteXmlLang("en");
		} else if ("script".equals(attribute)) {
			note.setNoteScript("arab");
		} else if ("transliteration".equals(attribute)) {
			note.setNoteTransliteration(attribute);
		} else if ("typeUri".equals(attribute)) {
			note.setNoteTypeUri(attribute);
		}

		session.update(note);
		return noteTextZone.getBody();
	}

	public boolean getRemainingNoteAttributes() {
			if(note.getNoteType() != null)
				if(note.getNoteDisplayLabel() != null)
					if(note.getNoteAltRepGroup() != null)
						if(note.getNoteXlink() != null)
							if(note.getNoteId() != null)
								if(note.getNoteLang() != null)
									if(note.getNoteXmlLang() != null)
										if(note.getNoteScript() != null)
											if(note.getNoteTransliteration() != null)
												if(note.getNoteTypeUri() != null)
															return false;
		return true;

	}
	
	
	
//Classification

	@CommitAfter
	public Object onSuccessFromCreateClassification() {
		newClassification.setRecord(record);
		newClassification.setCreator(getUsername());
		record.getClassifications().add(newClassification);
		newClassification.setClassAuthority("ddc");
		newClassification.setClassAuthorityUri("http://www.oclc.org/dewey.en.html");
		newClassification.setClassEdition("23");
		session.update(record);
		return classificationZone.getBody();
	}

	void onPrepareForSubmitFromUpdateClassification(Long id) {
		classification = (Classification) session.get(Classification.class, id);
	}

	@CommitAfter
	public void onSuccessFromUpdateClassification() {
		session.update(classification);
		updateClassification.clearErrors();
	}

	public Object onSubmitFromUpdateClassification() {
		return updateClassificationZone.getBody();
	}

	/*public void onValidateFromClassification_classification(String value) {
		if(classification.hasAttributes() && (value == null || "".equals(value))) {
			updateClassification.recordError("Classification cannot be empty and have attributes.");
		}
	}*/
	
	
	public String getClassificationAuthorityLabel() {
		return classification.getClassAuthority() == null ? "DDC" : classification.getClassAuthority();
	}
	
	/*public String getClassificationAuthorityUriLabel() {
		return classification.getClassAuthority() == null ? "http://www.oclc.org/dewey.en.html" : classification.getClassAuthorityUri();
	}
	
	public String getClassificationEditionLabel() {
		return classification.getClassEdition() == null ? "23" : classification.getClassEdition();
	}*/


	@CommitAfter public Object onActionFromSetClassAuthorityDdc(long id) { return addClassAuthority(id, "classauthorityddc"); }
	@CommitAfter public Object onActionFromSetClassAuthorityNlm(long id) { return addClassAuthority(id, "classauthoritynlm"); }
	@CommitAfter public Object onActionFromSetClassAuthorityLocal(long id) { return addClassAuthority(id, "classauthoritylocal"); }
	public Object addClassAuthority(long id, String attribute) {
		classification = (Classification) session.get(Classification.class, id);
		
		if("classauthorityddc".equals(attribute)) {
			classification.setClassAuthority("DDC");
			classification.setClassEdition("23");
			classification.setClassAuthorityUri("http://www.oclc.org/dewey.en.html");
			
		} else if("classauthoritynlm".equals(attribute)) {
			classification.setClassAuthority("NLM");
			classification.setClassEdition("2016");
			classification.setClassAuthorityUri("https://www.nlm.nih.gov/class/index.html");
			
		} else if("classauthoritylocal".equals(attribute)) {
			classification.setClassAuthority("Local");
			classification.setClassEdition("Edition");
			classification.setClassAuthorityUri("AuthorityURI");
	}

		session.update(classification);
		return classificationAuthorityZone.getBody();
	}
	
	
	
	
	
	//Class attributes
	@CommitAfter public Object onActionFromAddClassValueUri(long id) { return addClassAttribute(id, "valueUri"); }
	@CommitAfter public Object onActionFromAddClassDisplayLabel(long id) { return addClassAttribute(id, "displayLabel"); }
	@CommitAfter public Object onActionFromAddClassAltRepGroup(long id) { return addClassAttribute(id, "altrepgroup"); }
	@CommitAfter public Object onActionFromAddClassUsage(long id) { return addClassAttribute(id, "usage"); }
	@CommitAfter public Object onActionFromAddClassLang(long id) { return addClassAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddClassXmlLang(long id) { return addClassAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddClassScript(long id) { return addClassAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddClassTransliteration(long id) { return addClassAttribute(id, "transliteration"); }
	@CommitAfter public Object onActionFromAddClassGenerator(long id) { return addClassAttribute(id, "generator"); }
	public Object addClassAttribute(long id, String attribute) {
		classification = (Classification) session.get(Classification.class, id);

		if ("valueUri".equals(attribute)) {
			classification.setClassValueUri(attribute);
		} else if ("displayLabel".equals(attribute)) {
			classification.setClassDisplayLabel(attribute);
		} else if ("altrepgroup".equals(attribute)) {
			classification.setClassAltRepGroup(attribute);
		} else if ("usage".equals(attribute)) {
			classification.setClassUsage("primary");
		} else if("lang".equals(attribute)) {
			classification.setClassLang("eng");
		} else if ("xmllang".equals(attribute)) {
			classification.setClassXmlLang("en");
		} else if ("script".equals(attribute)) {
			classification.setClassScript("arab");
		} else if ("transliteration".equals(attribute)) {
			classification.setClassTransliteration(attribute);
		} else if ("generator".equals(attribute)) {
			classification.setClassGenerator("lcc2ddc-software v.1.2");
		}

		session.update(classification);
		return classificationTextZone.getBody();
	}

	public boolean getRemainingClassificationAttributes() {
			if(classification.getClassValueUri() != null)
				if(classification.getClassDisplayLabel() != null)
					if(classification.getClassAltRepGroup() != null)
						if(classification.getClassUsage() != null)
								if(classification.getClassLang() != null)
									if(classification.getClassXmlLang() != null)
										if(classification.getClassScript() != null)
											if(classification.getClassTransliteration() != null)
												if(classification.getClassGenerator() != null)
															return false;
		return true;

	}
	
	
	//Identifier

		@CommitAfter
		public Object onSuccessFromCreateIdentifier() {
			newIdentifier.setRecord(record);
			newIdentifier.setCreator(getUsername());
			record.getIdentifiers().add(newIdentifier);
			session.update(record);
			return identifierZone.getBody();
		}

		void onPrepareForSubmitFromUpdateIdentifier(Long id) {
			identifier = (Identifier) session.get(Identifier.class, id);
		}

		@CommitAfter
		public void onSuccessFromUpdateIdentifier() {
			session.update(identifier);
			updateIdentifier.clearErrors();
		}

		public Object onSubmitFromUpdateIdentifier() {
			return updateIdentifierZone.getBody();
		}

		/*public void onValidateFromIdentifier_identifier(String value) {
			if(identifier.hasAttributes() && (value == null || "".equals(value))) {
				updateIdentifier.recordError("Identifier cannot be empty and have attributes.");
			}
		}
		*/
		
		//Class attributes
		@CommitAfter public Object onActionFromAddIdentAltRepGroup(long id) { return addIdentAttribute(id, "altrepgroup"); }
		@CommitAfter public Object onActionFromAddIdentLang(long id) { return addIdentAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddIdentXmlLang(long id) { return addIdentAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddIdentScript(long id) { return addIdentAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddIdentTransliteration(long id) { return addIdentAttribute(id, "transliteration"); }
		@CommitAfter public Object onActionFromAddIdentTypeUri(long id) { return addIdentAttribute(id, "typeUri"); }
		public Object addIdentAttribute(long id, String attribute) {
			identifier = (Identifier) session.get(Identifier.class, id);

			if ("altrepgroup".equals(attribute)) {
				identifier.setIdentAltRepGroup(attribute);
			} else if("lang".equals(attribute)) {
				identifier.setIdentLang("eng");
			} else if ("xmllang".equals(attribute)) {
				identifier.setIdentXmlLang("en");
			} else if ("script".equals(attribute)) {
				identifier.setIdentScript("arab");
			} else if ("transliteration".equals(attribute)) {
				identifier.setIdentTransliteration(attribute);
			} else if ("typeUri".equals(attribute)) {
				identifier.setIdentTypeUri(attribute);
			}

			session.update(identifier);
			return identifierTextZone.getBody();
		}

		public boolean getRemainingIdentifierAttributes() {
					if(identifier.getIdentDisplayLabel() != null)
						if(identifier.getIdentAltRepGroup() != null)
							if(identifier.getIdentLang() != null)
								if(identifier.getIdentXmlLang() != null)
									if(identifier.getIdentScript() != null)
										if(identifier.getIdentTransliteration() != null)
											if(identifier.getIdentTypeUri() != null)
																return false;
			return true;

		}


		
//AccessCondition

	@CommitAfter
	public Object onSuccessFromCreateAccessCondition() {
		newAccessCondition.setRecord(record);
		newAccessCondition.setCreator(getUsername());
		
		if(record.getAccessConditions().size() == 0) {
			newAccessCondition.setAccessCondition("Copyright 2014 The Board of Trinity College Dublin. Images are available for single-use academic application only. Publication, transmission or display is prohibited without formal written approval of Trinity College Library, Dublin.");
		}
		
		record.getAccessConditions().add(newAccessCondition);
		session.update(record);
		return accessConditionZone.getBody();
	}
	
	void onPrepareForSubmitFromUpdateAccessCondition(Long id) {
		accessCondition = (AccessCondition) session.get(AccessCondition.class, id);
	}
	
	@CommitAfter
	public void onSuccessFromUpdateAccessCondition() {
		session.update(accessCondition);
		updateAccessCondition.clearErrors();
	}
	
	public Object onSubmitFromUpdateAccessCondition() {
		return updateAccessConditionZone.getBody();
	}
	
/*	public void onValidateFromAccessCondition_accessCondition(String value) {
		if(accessCondition.hasAttributes() && (value == null || "".equals(value))) {
			updateAccessCondition.recordError("AccessCondition cannot be empty and have attributes.");
		}
	}
	
	public void onValidateFromAccessCondition_accessCondition1(String value) {
		if(accessCondition.hasAttributes1() && (value == null || "".equals(value))) {
			updateAccessCondition.recordError("Access Condition cannot be empty and have attributes.");
		}
	}*/
	
	public boolean getNotFirstAccessCondition() {
		AccessCondition first = null;
		if(!record.getAccessConditions().isEmpty()) {
			first = record.getAccessConditions().get(0);
		}
		return first != accessCondition;
	}
	
	public boolean getIsFirstAccessCondition() {
		AccessCondition first = null;
		if(!record.getAccessConditions().isEmpty()) {
			first = record.getAccessConditions().get(0);
		}
		return first == accessCondition;
	}
	
	//attributes first
	
	@CommitAfter public Object onActionFromAddAccessDisplayLabel1(long id) { return addAccessConditionAttribute1(id, "displayLabel1"); }
	@CommitAfter public Object onActionFromAddAccessAltRepGroup1(long id) { return addAccessConditionAttribute1(id, "altrepgroup1"); }
	@CommitAfter public Object onActionFromAddAccessAltFormat1(long id) { return addAccessConditionAttribute1(id, "altformat1"); }
	@CommitAfter public Object onActionFromAddAccessContentType1(long id) { return addAccessConditionAttribute1(id, "contenttype1"); }
	@CommitAfter public Object onActionFromAddAccessXlink1(long id) { return addAccessConditionAttribute1(id, "xlink1"); }
	@CommitAfter public Object onActionFromAddAccessLang1(long id) { return addAccessConditionAttribute1(id, "lang1"); }
	@CommitAfter public Object onActionFromAddAccessXmlLang1(long id) { return addAccessConditionAttribute1(id, "xmllang1"); }
	@CommitAfter public Object onActionFromAddAccessScript1(long id) { return addAccessConditionAttribute1(id, "script1"); }
	@CommitAfter public Object onActionFromAddAccessTransliteration1(long id) { return addAccessConditionAttribute1(id, "transliteration1"); }
	public Object addAccessConditionAttribute1(long id, String attribute) {
		accessCondition = (AccessCondition) session.get(AccessCondition.class, id);

		if ("displayLabel1".equals(attribute)) {
			accessCondition.setAccessDisplayLabel1(attribute);
		} else if ("altrepgroup1".equals(attribute)) {
			accessCondition.setAccessAltRepGroup1(attribute);
		} else if ("altformat1".equals(attribute)) {
			accessCondition.setAccessAltFormat1(attribute);
		} else if ("contenttype1".equals(attribute)) {
			accessCondition.setAccessContentType1(attribute);
		} else if ("xlink1".equals(attribute)) {
			accessCondition.setAccessXlink1(attribute);
		} else if("lang1".equals(attribute)) {
			accessCondition.setAccessLang1("eng");
		} else if ("xmllang1".equals(attribute)) {
			accessCondition.setAccessXmlLang1("en");
		} else if ("script1".equals(attribute)) {
			accessCondition.setAccessScript1("arab");
		} else if ("transliteration1".equals(attribute)) {
			accessCondition.setAccessTransliteration1(attribute);
		}

		session.update(accessCondition);
		return accessConditionTextZone1.getBody();
	}

	public boolean getRemainingAccessConditionAttributes1() {
				if(accessCondition.getAccessDisplayLabel1() != null)
					if(accessCondition.getAccessAltRepGroup1() != null)
						if(accessCondition.getAccessAltFormat1() != null)
							if(accessCondition.getAccessContentType1() != null)
								if(accessCondition.getAccessXlink1() != null)
										if(accessCondition.getAccessLang1() != null)
											if(accessCondition.getAccessXmlLang1() != null)
												if(accessCondition.getAccessScript1() != null)
													if(accessCondition.getAccessTransliteration1() != null)
															return false;
		return true;

	}
		
		
// second
		
	@CommitAfter public Object onActionFromAddAccessDisplayLabel(long id) { return addAccessConditionAttribute(id, "displayLabel"); }
	@CommitAfter public Object onActionFromAddAccessAltRepGroup(long id) { return addAccessConditionAttribute(id, "altrepgroup"); }
	@CommitAfter public Object onActionFromAddAccessAltFormat(long id) { return addAccessConditionAttribute(id, "altformat"); }
	@CommitAfter public Object onActionFromAddAccessContentType(long id) { return addAccessConditionAttribute(id, "contenttype"); }
	@CommitAfter public Object onActionFromAddAccessXlink(long id) { return addAccessConditionAttribute(id, "xlink"); }
	@CommitAfter public Object onActionFromAddAccessLang(long id) { return addAccessConditionAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddAccessXmlLang(long id) { return addAccessConditionAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddAccessScript(long id) { return addAccessConditionAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddAccessTransliteration(long id) { return addAccessConditionAttribute(id, "transliteration"); }
	public Object addAccessConditionAttribute(long id, String attribute) {
		accessCondition = (AccessCondition) session.get(AccessCondition.class, id);

		if ("displayLabel".equals(attribute)) {
			accessCondition.setAccessDisplayLabel(attribute);
		} else if ("altrepgroup".equals(attribute)) {
			accessCondition.setAccessAltRepGroup(attribute);
		} else if ("altformat".equals(attribute)) {
			accessCondition.setAccessAltFormat(attribute);
		} else if ("contenttype".equals(attribute)) {
			accessCondition.setAccessContentType(attribute);
		} else if ("xlink".equals(attribute)) {
			accessCondition.setAccessXlink(attribute);
		} else if("lang".equals(attribute)) {
			accessCondition.setAccessLang("eng");
		} else if ("xmllang".equals(attribute)) {
			accessCondition.setAccessXmlLang("en");
		} else if ("script".equals(attribute)) {
			accessCondition.setAccessScript("arab");
		} else if ("transliteration".equals(attribute)) {
			accessCondition.setAccessTransliteration(attribute);
		}

		session.update(accessCondition);
		return accessConditionTextZone.getBody();
	}

	public boolean getRemainingAccessConditionAttributes() {
				if(accessCondition.getAccessDisplayLabel() != null)
					if(accessCondition.getAccessAltRepGroup() != null)
						if(accessCondition.getAccessAltFormat() != null)
							if(accessCondition.getAccessContentType() != null)
								if(accessCondition.getAccessXlink() != null)
										if(accessCondition.getAccessLang() != null)
											if(accessCondition.getAccessXmlLang() != null)
												if(accessCondition.getAccessScript() != null)
													if(accessCondition.getAccessTransliteration() != null)
															return false;
		return true;

	}
	
	
	
	//Related Item
	
	@CommitAfter
	public Object onSuccessFromCreateRelatedItem() {
		newRelatedItem.setRecord(record);
		newRelatedItem.setCreator(getUsername());
		record.getRelatedItems().add(newRelatedItem);
		session.update(record);
		return relatedItemZone.getBody();
	}
	
	
	
	@CommitAfter
	public Object onSuccessFromCreateRelatedItemTitleInfo() {
		newTitleInfo.setRecord(record);
		newTitleInfo.setCreator(getUsername());
		record.getTitleInfos().add(newTitleInfo);
		session.update(record);
		return titleInfoZone.getBody();
	}
	
	@CommitAfter
	public Object onSuccessFromCreateRelatedItemIdentifier() {
		newIdentifier.setRecord(record);
		newIdentifier.setCreator(getUsername());
		record.getIdentifiers().add(newIdentifier);
		session.update(record);
		return identifierZone.getBody();
	}
	
	
	
	void onPrepareForSubmitFromUpdateRelatedItem(Long id) {
		relatedItem = (RelatedItem) session.get(RelatedItem.class, id);
	}
	
	@CommitAfter
	public void onSuccessFromUpdateRelatedItem() {
		session.update(relatedItem);
		updateRelatedItem.clearErrors();
	}
	
	public Object onSubmitFromUpdateRelatedItem() {
		return updateRelatedItemZone.getBody();
	}
	
	
	
	@CommitAfter public Object onActionFromAddRelatedDisplayLabel(long id) { return addRelatedItemAttribute(id, "displayLabel");}
	@CommitAfter public Object onActionFromAddRelatedId(long id) { return addRelatedItemAttribute(id, "id"); }
	@CommitAfter public Object onActionFromAddRelatedOtherType(long id) { return addRelatedItemAttribute(id, "othertype"); }
	@CommitAfter public Object onActionFromAddRelatedOtherTypeAuth(long id) { return addRelatedItemAttribute(id, "othertypeauth"); }
	@CommitAfter public Object onActionFromAddRelatedOtherTypeAuthUri(long id) { return addRelatedItemAttribute(id, "othertypeauthuri"); }
	@CommitAfter public Object onActionFromAddRelatedOtherTypeUri(long id) { return addRelatedItemAttribute(id, "othertypeuri"); }
	public Object addRelatedItemAttribute(long id, String attribute) {
		relatedItem = (RelatedItem) session.get(RelatedItem.class, id);

		if ("displayLabel".equals(attribute)) {
			relatedItem.setRelatedDisplayLabel(attribute);
		} else if ("id".equals(attribute)) {
			relatedItem.setRelatedId(attribute);
		} else if ("othertype".equals(attribute)) {
			relatedItem.setRelatedOtherType(attribute);
		} else if ("othertypeauth".equals(attribute)) {
			relatedItem.setRelatedOtherTypeAuth(attribute);
		} else if("othertypeauthuri".equals(attribute)) {
			relatedItem.setRelatedOtherTypeAuthUri(attribute);
		} else if ("othertypeuri".equals(attribute)) {
			relatedItem.setRelatedOtherTypeUri(attribute);
		}

		session.update(relatedItem);
		return relatedItemAttributeZone.getBody();
	}

	public boolean getRemainingRelatedItemAttributes() {
				if(relatedItem.getRelatedDisplayLabel() != null)
					if(relatedItem.getRelatedXlinkHref() != null)
						if(relatedItem.getRelatedId() != null)
							if(relatedItem.getRelatedOtherType() != null)
								if(relatedItem.getRelatedOtherTypeAuth() != null)
										if(relatedItem.getRelatedOtherTypeAuthUri() != null)
											if(relatedItem.getRelatedOtherTypeUri() != null)
												return false;
		return true;

	}
		
	
	//SUBJECT
		@CommitAfter
		public Object onSuccessFromCreateSubjectSection() {
			newSubjectSection.setRecord(record);
			newSubjectSection.setCreator(getUsername());
			record.getSubjectSections().add(newSubjectSection);
			session.update(record);
			//TODO WHEN ADDING SUBJECT SECTION2 TO SUBJECT
			//newSubjectSection.setSubGeographicCodeAuthority("marccountry");
			//newSubjectSection.setSubGeographicCodeAuthorityUri("http://id.loc.gov/vocabulary/countries");
			return subjectSectionZone.getBody();
		}
		
		
		void onPrepareForSubmitFromUpdateSubjectSection(Long id) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);
		}

		@CommitAfter
		public void onSuccessFromUpdateSubjectSection() {
			session.update(subjectSection);
			updateSubjectSection.clearErrors();
		}


		public Object onSubmitFromUpdateSubjectSection() {
			return updateSubjectSectionZone.getBody();
		}
		
		
			/*public void onValidateFromSubject_subject(String value) {
			if(subjectSection.hasAttributes() && (value == null || "".equals(value))) {
				updatesubjectSection.recordError("Subject cannot be empty and have attributes.");
			}
		}*/
	
		/*public void onValidateFromSubject_subTopic(String value) {
			if(subjectSection.hasTopicAttributes() && (value == null || "".equals(value))) {
				updatesubjectSection.recordError("Topic cannot be empty and have attributes.");
			}
		}*/
	
		/*public void onValidateFromSubject_subGeographic(String value) {
			if(subjectSection.hasGeographicAttributes() && (value == null || "".equals(value))) {
				updatesubjectSection.recordError("Geographic cannot be empty and have attributes.");
			}
		}*/
	
	/*	public void onValidateFromSubject_subTemporal(String value) {
			if(subjectSection.hasTemporalAttributes() && (value == null || "".equals(value))) {
				updatesubjectSection.recordError("Temporal cannot be empty and have attributes.");
			}
		}
	
		public void onValidateFromSubject_subGeographicCode(String value) {
			if(subjectSection.hasGeographicCodeAttributes() && (value == null || "".equals(value))) {
				updatesubjectSection.recordError("GeographicCode cannot be empty and have attributes.");
			}
		}*/
		
		
			//sub
		public String getSubjectAuthorityLabel() {
			return subjectSection.getSubAuthority() == null ? "None" : subjectSection.getSubAuthority();
		}
		
		
		@CommitAfter public Object onActionFromAddSubDisplayLabel(long id) { return addSubjectAttribute(id, "displayLabel"); }
		@CommitAfter public Object onActionFromAddSubUsage(long id) { return addSubjectAttribute(id, "usage"); }
		@CommitAfter public Object onActionFromAddSubAltRepGroup(long id) { return addSubjectAttribute(id, "altrepgroup"); }
		@CommitAfter public Object onActionFromAddSubXlink(long id) { return addSubjectAttribute(id, "xlink"); }
		@CommitAfter public Object onActionFromAddSubId(long id) { return addSubjectAttribute(id, "id"); }
		@CommitAfter public Object onActionFromAddSubLang(long id) { return addSubjectAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddSubXmlLang(long id) { return addSubjectAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddSubScript(long id) { return addSubjectAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddSubTransliteration(long id) { return addSubjectAttribute(id, "transliteration"); }
		public Object addSubjectAttribute(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);

			if ("displayLabel".equals(attribute)) {
				subjectSection.setSubDisplayLabel(attribute);
			} else if ("altrepgroup".equals(attribute)) {
				subjectSection.setSubAltRepGroup(attribute);
			} else if ("usage".equals(attribute)) {
				subjectSection.setSubUsage(attribute);
			} else if ("id".equals(attribute)) {
				subjectSection.setSubId(attribute);
			} else if ("xlink".equals(attribute)) {
				subjectSection.setSubXlink(attribute);
			} else if("lang".equals(attribute)) {
				subjectSection.setSubLang("eng");
			} else if ("xmllang".equals(attribute)) {
				subjectSection.setSubXmlLang("en");
			} else if ("script".equals(attribute)) {
				subjectSection.setSubScript("arab");
			} else if ("transliteration".equals(attribute)) {
				subjectSection.setSubTransliteration(attribute);
			}

			session.update(subjectSection);
			return subjectAttributeZone.getBody();
		}

		public boolean getRemainingSubjectAttributes() {
			if(subjectSection.getSubDisplayLabel() != null)
				if(subjectSection.getSubAltRepGroup() != null)
					if(subjectSection.getSubXlink() != null)
							if(subjectSection.getSubLang() != null)
								if(subjectSection.getSubXmlLang() != null)
									if(subjectSection.getSubScript() != null)
										if(subjectSection.getSubTransliteration() != null)
											return false;
			return true;

		}
	
		@CommitAfter public Object onActionFromSetSubAuthorityAat(long id) { return addSubjectAuthority(id, "SubAuthorityAat"); }
		@CommitAfter public Object onActionFromSetSubAuthorityDnlm(long id) { return addSubjectAuthority(id, "SubAuthorityDnlm"); }
		@CommitAfter public Object onActionFromSetSubAuthorityHlasja(long id) { return addSubjectAuthority(id, "SubAuthorityHlasja"); }
		@CommitAfter public Object onActionFromSetSubAuthorityInisaljt(long id) { return addSubjectAuthority(id, "SubAuthorityInisaljt"); }
		@CommitAfter public Object onActionFromSetSubAuthorityIssnkey(long id) { return addSubjectAuthority(id, "SubAuthorityIssnkey"); }
		@CommitAfter public Object onActionFromSetSubAuthorityLcgft(long id) { return addSubjectAuthority(id, "SubAuthorityLcgft"); }
		@CommitAfter public Object onActionFromSetSubAuthorityMarccountry(long id) { return addSubjectAuthority(id, "SubAuthorityMarccountry"); }
		@CommitAfter public Object onActionFromSetSubAuthorityMarcgac(long id) { return addSubjectAuthority(id, "SubAuthorityMarcgac"); }
		@CommitAfter public Object onActionFromSetSubAuthorityNaf(long id) { return addSubjectAuthority(id, "SubAuthorityNaf"); }
		@CommitAfter public Object onActionFromSetSubAuthorityTgn(long id) { return addSubjectAuthority(id, "SubAuthorityTgn"); }
		@CommitAfter public Object onActionFromSetSubAuthorityUlan(long id) { return addSubjectAuthority(id, "SubAuthorityUlan"); }
		@CommitAfter public Object onActionFromSetSubAuthorityUnbisn(long id) { return addSubjectAuthority(id, "SubAuthorityUnbisn"); }
		@CommitAfter public Object onActionFromSetSubAuthorityViaf(long id) { return addSubjectAuthority(id, "SubAuthorityViaf"); }
		@CommitAfter public Object onActionFromSetSubAuthorityLocal(long id) { return addSubjectAuthority(id, "SubAuthorityLocal"); }
		@CommitAfter public Object onActionFromSetSubAuthorityNone(long id) { return addSubjectAuthority(id, "SubAuthorityNone"); }
		public Object addSubjectAuthority(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);
		
			if("SubAuthorityAat".equals(attribute)) {
				subjectSection.setSubAuthority("AAT");
				subjectSection.setSubAuthorityUri("http://vocab.getty.edu/resource/aat.html");
			
			} else if("SubAuthorityDnlm".equals(attribute)) {
				subjectSection.setSubAuthority("NLM");
				subjectSection.setSubAuthorityUri("http://id.loc.gov/vocabulary/classSchemes/nlm");
		
			} else if("SubAuthorityHlasja".equals(attribute)) {
				subjectSection.setSubAuthority("HLASJA");
				subjectSection.setSubAuthorityUri("http://id.loc.gov/vocabulary/subjectSchemes/hlasstg.html");
			
			} else if("SubAuthorityInisaltj".equals(attribute)) {
				subjectSection.setSubAuthority("INISALTJ");
				subjectSection.setSubAuthorityUri("http://id.loc.gov/vocabulary/subjectSchemes/inist.html");
			
			} else if("SubAuthorityIssnkey".equals(attribute)) {
				subjectSection.setSubAuthority("ISSNKEY");
				subjectSection.setSubAuthorityUri("http://id.loc.gov/vocabulary/identifiers/issn.html");
			
			} else if("SubAuthorityLcgft".equals(attribute)) {
				subjectSection.setSubAuthority("LCGFT");
				subjectSection.setSubAuthorityUri("http://id.loc.gov/authorities/subjects");
			
			} else if("SubAuthorityMarccountry".equals(attribute)) {
				subjectSection.setSubAuthority("marccountry");
				subjectSection.setSubAuthorityUri("http://id.loc.gov/vocabulary/countries");
		
			} else if("SubAuthorityMarcgac".equals(attribute)) {
				subjectSection.setSubAuthority("marcgac");
				subjectSection.setSubAuthorityUri("http://id.loc.gov/vocabulary/geographicAreas.html");
			
			} else if("SubAuthorityNaf".equals(attribute)) {
				subjectSection.setSubAuthority("NAF");
				subjectSection.setSubAuthorityUri("http://id.loc.gov/authorities/names.html");
			
			} else if("SubAuthorityTgn".equals(attribute)) {
				subjectSection.setSubAuthority("TGN");
				subjectSection.setSubAuthorityUri("http://www.getty.edu/research/tools/vocabularies/tgn/index.html");
			
			} else if("SubAuthorityUlan".equals(attribute)) {
				subjectSection.setSubAuthority("ULAN");
				subjectSection.setSubAuthorityUri("http://vocab.getty.edu/resource/ulan.html");
			
			} else if("SubAuthorityUnbisn".equals(attribute)) {
				subjectSection.setSubAuthority("UNBISN");
				subjectSection.setSubAuthorityUri("http://id.loc.gov/vocabulary/subjectSchemes/unbisn.html");
			
			} else if("SubAuthorityViaf".equals(attribute)) {
				subjectSection.setSubAuthority("VIAF");
				subjectSection.setSubAuthorityUri("http://id.loc.gov/vocabulary/identifiers/viaf.html");
			
			} else if("SubAuthorityLocal".equals(attribute)) {
				subjectSection.setSubAuthority(attribute);
				subjectSection.setSubAuthorityUri(attribute);
			
			} else if("SubAuthorityNone".equals(attribute)) {
				subjectSection.setSubAuthority(attribute);
				subjectSection.setSubAuthorityUri(attribute);
			
		}

			session.update(subjectSection);
			return subAuthorityZone.getBody();
		}
		
		
		//topic
		
		
		public String getSubjectTopicAuthorityLabel() {
			return subjectSection.getSubTopicAuthority() == null ? "None" : subjectSection.getSubTopicAuthority();
		}
		
		
		@CommitAfter public Object onActionFromAddSubTopicAuthority(long id) { return addTopicAttribute(id, "authority"); }
		@CommitAfter public Object onActionFromAddSubTopicValueUri(long id) { return addTopicAttribute(id, "valueUri"); }
		@CommitAfter public Object onActionFromAddSubTopicLang(long id) { return addTopicAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddSubTopicXmlLang(long id) { return addTopicAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddSubTopicScript(long id) { return addTopicAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddSubTopicTransliteration(long id) { return addTopicAttribute(id, "transliteration"); }
		public Object addTopicAttribute(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);

			if ("authority".equals(attribute)) {
				subjectSection.setSubTopicAuthority("None");
			} else if ("valueUri".equals(attribute)) {
				subjectSection.setSubTopicValueUri(attribute);
			} else if("lang".equals(attribute)) {
				subjectSection.setSubTopicLang("eng");
			} else if ("xmllang".equals(attribute)) {
				subjectSection.setSubTopicXmlLang("en");
			} else if ("script".equals(attribute)) {
				subjectSection.setSubTopicScript("arab");
			} else if ("transliteration".equals(attribute)) {
				subjectSection.setSubTopicTransliteration(attribute);
			}

			session.update(subjectSection);
			return subjectTopicZone.getBody();
		}

		public boolean getRemainingTopicAttributes() {
			if(subjectSection.getSubTopicAuthority() != null)
				if(subjectSection.getSubTopicAuthorityUri() != null)
					if(subjectSection.getSubTopicValueUri() != null)
							if(subjectSection.getSubTopicLang() != null)
								if(subjectSection.getSubTopicXmlLang() != null)
									if(subjectSection.getSubTopicScript() != null)
										if(subjectSection.getSubTopicTransliteration() != null)
											return false;
			return true;

		}
	
		@CommitAfter public Object onActionFromSetSubTopicAuthorityAat(long id) { return addSubTopicAuthority(id, "SubTopicAuthorityAat"); }
		@CommitAfter public Object onActionFromSetSubTopicAuthorityLcgft(long id) { return addSubTopicAuthority(id, "SubTopicAuthorityLcgft"); }
		@CommitAfter public Object onActionFromSetSubTopicAuthorityNone(long id) { return addSubTopicAuthority(id, "SubTopicAuthorityNone"); }
		public Object addSubTopicAuthority(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);
		
			if("SubTopicAuthorityAat".equals(attribute)) {
				subjectSection.setSubTopicAuthority("AAT");
				subjectSection.setSubTopicAuthorityUri("http://vocab.getty.edu/resource/aat.html");
			
			
			} else if("SubTopicAuthorityLcgft".equals(attribute)) {
				subjectSection.setSubTopicAuthority("LCGFT");
				subjectSection.setSubTopicAuthorityUri("http://id.loc.gov/authorities/subjects");
				
			} else if("SubTopicAuthorityNone".equals(attribute)) {
				subjectSection.setSubTopicAuthority("None");
				subjectSection.setSubTopicAuthorityUri("None");
		
			
		}

			session.update(subjectSection);
			return subjectTopicZone.getBody();
		}
		
		
		//geo
		public String getSubjectGeographicAuthorityLabel() {
			return subjectSection.getSubGeographicAuthority() == null ? "None" : subjectSection.getSubGeographicAuthority();
		}
		
		@CommitAfter public Object onActionFromAddSubGeographicAuthority(long id) { return addGeographicAttribute(id, "authority"); }
		@CommitAfter public Object onActionFromAddSubGeographicValueUri(long id) { return addGeographicAttribute(id, "valueUri"); }
		@CommitAfter public Object onActionFromAddSubGeographicLang(long id) { return addGeographicAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddSubGeographicXmlLang(long id) { return addGeographicAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddSubGeographicScript(long id) { return addGeographicAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddSubGeographicTransliteration(long id) { return addGeographicAttribute(id, "transliteration"); }
		public Object addGeographicAttribute(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);

			if ("authority".equals(attribute)) {
				subjectSection.setSubGeographicAuthority("None");
			} else if ("valueUri".equals(attribute)) {
				subjectSection.setSubGeographicValueUri(attribute);
			} else if("lang".equals(attribute)) {
				subjectSection.setSubGeographicLang("eng");
			} else if ("xmllang".equals(attribute)) {
				subjectSection.setSubGeographicXmlLang("en");
			} else if ("script".equals(attribute)) {
				subjectSection.setSubGeographicScript("arab");
			} else if ("transliteration".equals(attribute)) {
				subjectSection.setSubGeographicTransliteration(attribute);
			}

			session.update(subjectSection);
			return subjectGeographicZone.getBody();
		}

		public boolean getRemainingGeographicAttributes() {
			if(subjectSection.getSubGeographicAuthority() != null)
				if(subjectSection.getSubGeographicAuthorityUri() != null)
					if(subjectSection.getSubGeographicValueUri() != null)
							if(subjectSection.getSubGeographicLang() != null)
								if(subjectSection.getSubGeographicXmlLang() != null)
									if(subjectSection.getSubGeographicScript() != null)
										if(subjectSection.getSubGeographicTransliteration() != null)
											return false;
			return true;

		}
	
		@CommitAfter public Object onActionFromSetSubGeographicAuthorityMarccountry(long id) { return addSubGeographicAuthority(id, "SubAuthorityMarccountry"); }
		@CommitAfter public Object onActionFromSetSubGeographicAuthorityMarcgac(long id) { return addSubGeographicAuthority(id, "SubAuthorityMarcgac"); }
		@CommitAfter public Object onActionFromSetSubGeographicAuthorityTgn(long id) { return addSubGeographicAuthority(id, "SubAuthorityTgn"); }
		@CommitAfter public Object onActionFromSetSubGeographicAuthorityNone(long id) { return addSubGeographicAuthority(id, "SubAuthorityNone"); }
		public Object addSubGeographicAuthority(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);
		
			if("SubAuthorityMarccountry".equals(attribute)) {
				subjectSection.setSubGeographicAuthority("marccountry");
				subjectSection.setSubGeographicAuthorityUri("http://id.loc.gov/vocabulary/countries");
		
			} else if("SubAuthorityMarcgac".equals(attribute)) {
				subjectSection.setSubGeographicAuthority("marcgac");
				subjectSection.setSubGeographicAuthorityUri("http://id.loc.gov/vocabulary/geographicAreas.html");
				
			} else if("SubAuthorityTgn".equals(attribute)) {
				subjectSection.setSubGeographicAuthority("TGN");
				subjectSection.setSubGeographicAuthorityUri("http://www.getty.edu/research/tools/vocabularies/tgn/index.html");
			
			} else if("SubAuthorityNone".equals(attribute)) {
				subjectSection.setSubGeographicAuthority("None");
				subjectSection.setSubGeographicAuthorityUri("None");
			
		}

			session.update(subjectSection);
			return subjectGeographicZone.getBody();
		}
    
		
		
		//temporal
		
		public String getSubjectTemporalAuthorityLabel() {
			return subjectSection.getSubTemporalAuthority() == null ? "None" : subjectSection.getSubTemporalAuthority();
		}
		
		
		@CommitAfter public Object onActionFromAddSubTemporalAuthority(long id) { return addTemporalAttribute(id, "authority"); }
		@CommitAfter public Object onActionFromAddSubTemporalValueUri(long id) { return addTemporalAttribute(id, "valueUri"); }
		@CommitAfter public Object onActionFromAddSubTemporalKeyDate(long id) { return addTemporalAttribute(id, "keydate"); }
		@CommitAfter public Object onActionFromAddSubTemporalLang(long id) { return addTemporalAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddSubTemporalXmlLang(long id) { return addTemporalAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddSubTemporalScript(long id) { return addTemporalAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddSubTemporalTransliteration(long id) { return addTemporalAttribute(id, "transliteration"); }
		public Object addTemporalAttribute(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);

			if ("authority".equals(attribute)) {
				subjectSection.setSubTemporalAuthority("None");
			} else if ("valueUri".equals(attribute)) {
				subjectSection.setSubTemporalValueUri(attribute);
			} else if("keydate".equals(attribute)) {
				subjectSection.setSubTemporalKeydate("yes");
			} else if("lang".equals(attribute)) {
				subjectSection.setSubTemporalLang("eng");
			} else if ("xmllang".equals(attribute)) {
				subjectSection.setSubTemporalXmlLang("en");
			} else if ("script".equals(attribute)) {
				subjectSection.setSubTemporalScript("arab");
			} else if ("transliteration".equals(attribute)) {
				subjectSection.setSubTemporalTransliteration(attribute);
			}

			session.update(subjectSection);
			return subjectTemporalZone.getBody();
		}

		public boolean getRemainingTemporalAttributes() {
			if(subjectSection.getSubTemporalAuthority() != null)
				if(subjectSection.getSubTemporalAuthorityUri() != null)
					if(subjectSection.getSubTemporalValueUri() != null)
							if(subjectSection.getSubTemporalLang() != null)
								if(subjectSection.getSubTemporalXmlLang() != null)
									if(subjectSection.getSubTemporalScript() != null)
										if(subjectSection.getSubTemporalTransliteration() != null)
											if(subjectSection.getSubTemporalKeydate() != null)
											return false;
			return true;

		}
	
		@CommitAfter public Object onActionFromSetSubTemporalAuthorityAat(long id) { return addSubTemporalAuthority(id, "SubTemporalAuthorityAat"); }
		@CommitAfter public Object onActionFromSetSubTemporalAuthorityLcgft(long id) { return addSubTemporalAuthority(id, "SubTemporalAuthorityLcgft"); }
		@CommitAfter public Object onActionFromSetSubTemporalAuthorityNone(long id) { return addSubTemporalAuthority(id, "SubTemporalAuthorityNone"); }
		public Object addSubTemporalAuthority(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);
		
			if("SubTemporalAuthorityAat".equals(attribute)) {
				subjectSection.setSubTemporalAuthority("AAT");
				subjectSection.setSubTemporalAuthorityUri("http://vocab.getty.edu/resource/aat.html");
			
			
			} else if("SubTemporalAuthorityLcgft".equals(attribute)) {
				subjectSection.setSubTemporalAuthority("LCGFT");
				subjectSection.setSubTemporalAuthorityUri("http://id.loc.gov/authorities/subjects");
		
			} else if("SubTemporalAuthorityNone".equals(attribute)) {
				subjectSection.setSubTemporalAuthority("None");
				subjectSection.setSubTemporalAuthorityUri("None");
		
			
		}

			session.update(subjectSection);
			return subjectTemporalZone.getBody();
		}
		
	
		public String getSubjectHierarchicalGeographicAuthorityLabel() {
			return subjectSection.getSubHierarchicalGeographicAuthority() == null ? "None" : subjectSection.getSubHierarchicalGeographicAuthority();
		}

		public String getSubjectHgCountryAuthorityLabel() {
			return subjectSection.getHgCountryAuthority() == null ? "None" : subjectSection.getHgCountryAuthority();
		}
	
		public String getSubjectHgRegionAuthorityLabel() {
			return subjectSection.getHgRegionAuthority() == null ? "None" : subjectSection.getHgRegionAuthority();
		}
    
		public String getSubjectHgCountyAuthorityLabel() {
			return subjectSection.getHgCountyAuthority() == null ? "None" : subjectSection.getHgCountyAuthority();
		}
    
		public String getSubjectHgCityAuthorityLabel() {
			return subjectSection.getHgCityAuthority() == null ? "None" : subjectSection.getHgCityAuthority();
		}
		
		
		@CommitAfter public Object onActionFromAddSubHierarchicalGeographicAuthority(long id) { return addHierarchicalGeographicAttribute(id, "authority"); }
		@CommitAfter public Object onActionFromAddSubHierarchicalGeographicValueUri(long id) { return addHierarchicalGeographicAttribute(id, "valueUri"); }
		public Object addHierarchicalGeographicAttribute(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);

			if ("authority".equals(attribute)) {
				subjectSection.setSubHierarchicalGeographicAuthority("None");
			} else if ("valueUri".equals(attribute)) {
				subjectSection.setSubHierarchicalGeographicValueUri(attribute);
			}

			session.update(subjectSection);
			return hgAttributeZone.getBody();
		}

		public boolean getRemainingHierarchicalGeographicAttributes() {
			if(subjectSection.getSubHierarchicalGeographicAuthority() != null)
					if(subjectSection.getSubHierarchicalGeographicValueUri() != null)
											return false;
			return true;

		}
	
		@CommitAfter public Object onActionFromSetSubHierarchicalGeographicAuthorityMarccountry(long id) { return addSubHierarchicalGeographicAuthority(id, "SubAuthorityMarccountry"); }
		@CommitAfter public Object onActionFromSetSubHierarchicalGeographicAuthorityMarcgac(long id) { return addSubHierarchicalGeographicAuthority(id, "SubAuthorityMarcgac"); }
		@CommitAfter public Object onActionFromSetSubHierarchicalGeographicAuthorityTgn(long id) { return addSubHierarchicalGeographicAuthority(id, "SubAuthorityTgn"); }
		@CommitAfter public Object onActionFromSetSubHierarchicalGeographicAuthorityNone(long id) { return addSubHierarchicalGeographicAuthority(id, "SubAuthorityNone"); }
		public Object addSubHierarchicalGeographicAuthority(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);
		
			if("SubAuthorityMarccountry".equals(attribute)) {
				subjectSection.setSubHierarchicalGeographicAuthority("marccountry");
				subjectSection.setSubHierarchicalGeographicAuthorityUri("http://id.loc.gov/vocabulary/countries");
		
			} else if("SubAuthorityMarcgac".equals(attribute)) {
				subjectSection.setSubHierarchicalGeographicAuthority("marcgac");
				subjectSection.setSubHierarchicalGeographicAuthorityUri("http://id.loc.gov/vocabulary/geographicAreas.html");
				
			} else if("SubAuthorityTgn".equals(attribute)) {
				subjectSection.setSubHierarchicalGeographicAuthority("TGN");
				subjectSection.setSubHierarchicalGeographicAuthorityUri("http://www.getty.edu/research/tools/vocabularies/tgn/index.html");
			
			} else if("SubAuthorityNone".equals(attribute)) {
				subjectSection.setSubHierarchicalGeographicAuthority("None");
				subjectSection.setSubHierarchicalGeographicAuthorityUri("None");
			
		}

			session.update(subjectSection);
			return hgAttributeZone.getBody();
		}
	
	
	
	
		@CommitAfter public Object onActionFromAddHgCountryLevel(long id) { return addHgCountryAttribute(id, "level"); }
		@CommitAfter public Object onActionFromAddHgCountryPeriod(long id) { return addHgCountryAttribute(id, "period"); }
		@CommitAfter public Object onActionFromAddHgCountryAuthority(long id) { return addHgCountryAttribute(id, "authority"); }
		@CommitAfter public Object onActionFromAddHgCountryValueUri(long id) { return addHgCountryAttribute(id, "valueUri"); }
		@CommitAfter public Object onActionFromAddHgCountryLang(long id) { return addHgCountryAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddHgCountryXmlLang(long id) { return addHgCountryAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddHgCountryScript(long id) { return addHgCountryAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddHgCountryTransliteration(long id) { return addHgCountryAttribute(id, "transliteration"); }
		public Object addHgCountryAttribute(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);

		
			if ("level".equals(attribute)) {
				subjectSection.setHgCountryLevel(attribute);
			} else if ("period".equals(attribute)) {
				subjectSection.setHgCountryPeriod(attribute);
			} else if ("authority".equals(attribute)) {
				subjectSection.setHgCountryAuthority("None");
			} else if ("valueUri".equals(attribute)) {
				subjectSection.setHgCountryValueUri(attribute);
			} else if("lang".equals(attribute)) {
				subjectSection.setHgCountryLang("eng");
			} else if ("xmllang".equals(attribute)) {
				subjectSection.setHgCountryXmlLang("en");
			} else if ("script".equals(attribute)) {
				subjectSection.setHgCountryScript("arab");
			} else if ("transliteration".equals(attribute)) {
				subjectSection.setHgCountryTransliteration(attribute);
			}

			session.update(subjectSection);
			return hgCountryZone.getBody();
		}

		public boolean getRemainingHgCountryAttributes() {
			if(subjectSection.getHgCountryLevel() != null)
				if(subjectSection.getHgCountryPeriod() != null)
					if(subjectSection.getHgCountryAuthority() != null)
							if(subjectSection.getHgCountryValueUri() != null)
									if(subjectSection.getHgCountryLang() != null)
										if(subjectSection.getHgCountryXmlLang() != null)
											if(subjectSection.getHgCountryScript() != null)
												if(subjectSection.getHgCountryTransliteration() != null)
											return false;
			return true;

		}
	
		@CommitAfter public Object onActionFromSetHgCountryAuthorityMarccountry(long id) { return addHgCountryAuthority(id, "SubAuthorityMarccountry"); }
		@CommitAfter public Object onActionFromSetHgCountryAuthorityMarcgac(long id) { return addHgCountryAuthority(id, "SubAuthorityMarcgac"); }
		@CommitAfter public Object onActionFromSetHgCountryAuthorityTgn(long id) { return addHgCountryAuthority(id, "SubAuthorityTgn"); }
		@CommitAfter public Object onActionFromSetHgCountryAuthorityNone(long id) { return addHgCountryAuthority(id, "SubAuthorityNone"); }
		public Object addHgCountryAuthority(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);
		
			if("SubAuthorityMarccountry".equals(attribute)) {
				subjectSection.setHgCountryAuthority("marccountry");
				subjectSection.setHgCountryAuthorityUri("http://id.loc.gov/vocabulary/countries");
		
			} else if("SubAuthorityMarcgac".equals(attribute)) {
				subjectSection.setHgCountryAuthority("marcgac");
				subjectSection.setHgCountryAuthorityUri("http://id.loc.gov/vocabulary/geographicAreas.html");
				
			} else if("SubAuthorityTgn".equals(attribute)) {
				subjectSection.setHgCountryAuthority("TGN");
				subjectSection.setHgCountryAuthorityUri("http://www.getty.edu/research/tools/vocabularies/tgn/index.html");
			
			} else if("SubAuthorityNone".equals(attribute)) {
				subjectSection.setHgCountryAuthority("None");
				subjectSection.setHgCountryAuthorityUri("None");
			
		}

			session.update(subjectSection);
			return hgCountryZone.getBody();
		}
	
		@CommitAfter public Object onActionFromAddHgRegionLevel(long id) { return addHgRegionAttribute(id, "level"); }
		@CommitAfter public Object onActionFromAddHgRegionPeriod(long id) { return addHgRegionAttribute(id, "period"); }
		@CommitAfter public Object onActionFromAddHgRegionAuthority(long id) { return addHgRegionAttribute(id, "authority"); }
		@CommitAfter public Object onActionFromAddHgRegionValueUri(long id) { return addHgRegionAttribute(id, "valueUri"); }
		@CommitAfter public Object onActionFromAddHgRegionLang(long id) { return addHgRegionAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddHgRegionXmlLang(long id) { return addHgRegionAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddHgRegionScript(long id) { return addHgRegionAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddHgRegionTransliteration(long id) { return addHgRegionAttribute(id, "transliteration"); }
		public Object addHgRegionAttribute(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);

		
			if ("level".equals(attribute)) {
				subjectSection.setHgRegionLevel(attribute);
			} else if ("period".equals(attribute)) {
				subjectSection.setHgRegionPeriod(attribute);
			} else if ("authority".equals(attribute)) {
				subjectSection.setHgRegionAuthority("None");
			} else if ("valueUri".equals(attribute)) {
				subjectSection.setHgRegionValueUri(attribute);
			} else if("lang".equals(attribute)) {
				subjectSection.setHgRegionLang("eng");
			} else if ("xmllang".equals(attribute)) {
				subjectSection.setHgRegionXmlLang("en");
			} else if ("script".equals(attribute)) {
				subjectSection.setHgRegionScript("arab");
			} else if ("transliteration".equals(attribute)) {
				subjectSection.setHgRegionTransliteration(attribute);
			}

			session.update(subjectSection);
			return hgRegionZone.getBody();
		}

		public boolean getRemainingHgRegionAttributes() {
			if(subjectSection.getHgRegionLevel() != null)
				if(subjectSection.getHgRegionPeriod() != null)
					if(subjectSection.getHgRegionAuthority() != null)
							if(subjectSection.getHgRegionValueUri() != null)
									if(subjectSection.getHgRegionLang() != null)
										if(subjectSection.getHgRegionXmlLang() != null)
											if(subjectSection.getHgRegionScript() != null)
												if(subjectSection.getHgRegionTransliteration() != null)
											return false;
			return true;

		}
	
		@CommitAfter public Object onActionFromSetHgRegionAuthorityMarcRegion(long id) { return addHgRegionAuthority(id, "SubAuthorityMarcRegion"); }
		@CommitAfter public Object onActionFromSetHgRegionAuthorityMarcgac(long id) { return addHgRegionAuthority(id, "SubAuthorityMarcgac"); }
		@CommitAfter public Object onActionFromSetHgRegionAuthorityTgn(long id) { return addHgRegionAuthority(id, "SubAuthorityTgn"); }
		@CommitAfter public Object onActionFromSetHgRegionAuthorityNone(long id) { return addHgRegionAuthority(id, "SubAuthorityNone"); }
		public Object addHgRegionAuthority(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);
		
			if("SubAuthorityMarcRegion".equals(attribute)) {
				subjectSection.setHgRegionAuthority("marccountry");
				subjectSection.setHgRegionAuthorityUri("http://id.loc.gov/vocabulary/countries");
		
			} else if("SubAuthorityMarcgac".equals(attribute)) {
				subjectSection.setHgRegionAuthority("marcgac");
				subjectSection.setHgRegionAuthorityUri("http://id.loc.gov/vocabulary/geographicAreas.html");
				
			} else if("SubAuthorityTgn".equals(attribute)) {
				subjectSection.setHgRegionAuthority("TGN");
				subjectSection.setHgRegionAuthorityUri("http://www.getty.edu/research/tools/vocabularies/tgn/index.html");
			
			} else if("SubAuthorityNone".equals(attribute)) {
				subjectSection.setHgRegionAuthority("None");
				subjectSection.setHgRegionAuthorityUri("None");
			
		}

			session.update(subjectSection);
			return hgRegionZone.getBody();
		}


		@CommitAfter public Object onActionFromAddHgCountyLevel(long id) { return addHgCountyAttribute(id, "level"); }
		@CommitAfter public Object onActionFromAddHgCountyPeriod(long id) { return addHgCountyAttribute(id, "period"); }
		@CommitAfter public Object onActionFromAddHgCountyAuthority(long id) { return addHgCountyAttribute(id, "authority"); }
		@CommitAfter public Object onActionFromAddHgCountyValueUri(long id) { return addHgCountyAttribute(id, "valueUri"); }
		@CommitAfter public Object onActionFromAddHgCountyLang(long id) { return addHgCountyAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddHgCountyXmlLang(long id) { return addHgCountyAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddHgCountyScript(long id) { return addHgCountyAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddHgCountyTransliteration(long id) { return addHgCountyAttribute(id, "transliteration"); }
		public Object addHgCountyAttribute(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);

		
			if ("level".equals(attribute)) {
				subjectSection.setHgCountyLevel(attribute);
			} else if ("period".equals(attribute)) {
				subjectSection.setHgCountyPeriod(attribute);
			} else if ("authority".equals(attribute)) {
				subjectSection.setHgCountyAuthority("None");
			} else if ("valueUri".equals(attribute)) {
				subjectSection.setHgCountyValueUri(attribute);
			} else if("lang".equals(attribute)) {
				subjectSection.setHgCountyLang("eng");
			} else if ("xmllang".equals(attribute)) {
				subjectSection.setHgCountyXmlLang("en");
			} else if ("script".equals(attribute)) {
				subjectSection.setHgCountyScript("arab");
			} else if ("transliteration".equals(attribute)) {
				subjectSection.setHgCountyTransliteration(attribute);
			}

			session.update(subjectSection);
			return hgCountyZone.getBody();
		}

		public boolean getRemainingHgCountyAttributes() {
			if(subjectSection.getHgCountyLevel() != null)
				if(subjectSection.getHgCountyPeriod() != null)
					if(subjectSection.getHgCountyAuthority() != null)
							if(subjectSection.getHgCountyValueUri() != null)
									if(subjectSection.getHgCountyLang() != null)
										if(subjectSection.getHgCountyXmlLang() != null)
											if(subjectSection.getHgCountyScript() != null)
												if(subjectSection.getHgCountyTransliteration() != null)
											return false;
			return true;

		}
	
		@CommitAfter public Object onActionFromSetHgCountyAuthorityMarcCounty(long id) { return addHgCountyAuthority(id, "SubAuthorityMarcCounty"); }
		@CommitAfter public Object onActionFromSetHgCountyAuthorityMarcgac(long id) { return addHgCountyAuthority(id, "SubAuthorityMarcgac"); }
		@CommitAfter public Object onActionFromSetHgCountyAuthorityTgn(long id) { return addHgCountyAuthority(id, "SubAuthorityTgn"); }
		@CommitAfter public Object onActionFromSetHgCountyAuthorityNone(long id) { return addHgCountyAuthority(id, "SubAuthorityNone"); }
		public Object addHgCountyAuthority(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);
		
			if("SubAuthorityMarcCounty".equals(attribute)) {
				subjectSection.setHgCountyAuthority("marccountry");
				subjectSection.setHgCountyAuthorityUri("http://id.loc.gov/vocabulary/countries");
		
			} else if("SubAuthorityMarcgac".equals(attribute)) {
				subjectSection.setHgCountyAuthority("marcgac");
				subjectSection.setHgCountyAuthorityUri("http://id.loc.gov/vocabulary/geographicAreas.html");
				
			} else if("SubAuthorityTgn".equals(attribute)) {
				subjectSection.setHgCountyAuthority("TGN");
				subjectSection.setHgCountyAuthorityUri("http://www.getty.edu/research/tools/vocabularies/tgn/index.html");
				
			} else if("SubAuthorityNone".equals(attribute)) {
				subjectSection.setHgCountyAuthority("None");
				subjectSection.setHgCountyAuthorityUri("None");
			
		}

			session.update(subjectSection);
			return hgCountyZone.getBody();
		}
	
		@CommitAfter public Object onActionFromAddHgCityLevel(long id) { return addHgCityAttribute(id, "level"); }
		@CommitAfter public Object onActionFromAddHgCityPeriod(long id) { return addHgCityAttribute(id, "period"); }
		@CommitAfter public Object onActionFromAddHgCityAuthority(long id) { return addHgCityAttribute(id, "authority"); }
		@CommitAfter public Object onActionFromAddHgCityValueUri(long id) { return addHgCityAttribute(id, "valueUri"); }
		@CommitAfter public Object onActionFromAddHgCityLang(long id) { return addHgCityAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddHgCityXmlLang(long id) { return addHgCityAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddHgCityScript(long id) { return addHgCityAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddHgCityTransliteration(long id) { return addHgCityAttribute(id, "transliteration"); }
		public Object addHgCityAttribute(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);

		
			if ("level".equals(attribute)) {
				subjectSection.setHgCityLevel(attribute);
			} else if ("period".equals(attribute)) {
				subjectSection.setHgCityPeriod(attribute);
			} else if ("authority".equals(attribute)) {
				subjectSection.setHgCityAuthority("None");
			} else if ("valueUri".equals(attribute)) {
				subjectSection.setHgCityValueUri(attribute);
			} else if("lang".equals(attribute)) {
				subjectSection.setHgCityLang("eng");
			} else if ("xmllang".equals(attribute)) {
				subjectSection.setHgCityXmlLang("en");
			} else if ("script".equals(attribute)) {
				subjectSection.setHgCityScript("arab");
			} else if ("transliteration".equals(attribute)) {
				subjectSection.setHgCityTransliteration(attribute);
			}

			session.update(subjectSection);
			return hgCityZone.getBody();
		}

		public boolean getRemainingHgCityAttributes() {
			if(subjectSection.getHgCityLevel() != null)
				if(subjectSection.getHgCityPeriod() != null)
					if(subjectSection.getHgCityAuthority() != null)
							if(subjectSection.getHgCityValueUri() != null)
									if(subjectSection.getHgCityLang() != null)
										if(subjectSection.getHgCityXmlLang() != null)
											if(subjectSection.getHgCityScript() != null)
												if(subjectSection.getHgCityTransliteration() != null)
											return false;
			return true;

		}
	
		@CommitAfter public Object onActionFromSetHgCityAuthorityMarcCity(long id) { return addHgCityAuthority(id, "SubAuthorityMarcCity"); }
		@CommitAfter public Object onActionFromSetHgCityAuthorityMarcgac(long id) { return addHgCityAuthority(id, "SubAuthorityMarcgac"); }
		@CommitAfter public Object onActionFromSetHgCityAuthorityTgn(long id) { return addHgCityAuthority(id, "SubAuthorityTgn"); }
		@CommitAfter public Object onActionFromSetHgCityAuthorityNone(long id) { return addHgCityAuthority(id, "SubAuthorityNone"); }
		public Object addHgCityAuthority(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);
		
			if("SubAuthorityMarcCity".equals(attribute)) {
				subjectSection.setHgCityAuthority("marccountry");
				subjectSection.setHgCityAuthorityUri("http://id.loc.gov/vocabulary/countries");
		
			} else if("SubAuthorityMarcgac".equals(attribute)) {
				subjectSection.setHgCityAuthority("marcgac");
				subjectSection.setHgCityAuthorityUri("http://id.loc.gov/vocabulary/geographicAreas.html");
				
			} else if("SubAuthorityTgn".equals(attribute)) {
				subjectSection.setHgCityAuthority("TGN");
				subjectSection.setHgCityAuthorityUri("http://www.getty.edu/research/tools/vocabularies/tgn/index.html");
				
			} else if("SubAuthorityNone".equals(attribute)) {
				subjectSection.setHgCityAuthority("None");
				subjectSection.setHgCityAuthorityUri("None");
			
		}

			session.update(subjectSection);
			return hgCityZone.getBody();
		}
		
		
//TODO Below should be part o SubjectSection, but is currently part of SubjectSection2 due to bug
	
	/*	@CommitAfter public Object onActionFromAddCoordinatesLang(long id) { return addCoordinatesAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddCoordinatesXmlLang(long id) { return addCoordinatesAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddCoordinatesScript(long id) { return addCoordinatesAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddCoordinatesTransliteration(long id) { return addCoordinatesAttribute(id, "transliteration"); }
		public Object addCoordinatesAttribute(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);

		
			 if("lang".equals(attribute)) {
				subjectSection.setCoordinatesLang("eng");
			} else if ("xmllang".equals(attribute)) {
				subjectSection.setCoordinatesXmlLang("en");
			} else if ("script".equals(attribute)) {
				subjectSection.setCoordinatesScript("arab");
			} else if ("transliteration".equals(attribute)) {
				subjectSection.setCoordinatesTransliteration(attribute);
			}

			session.update(subjectSection);
			return coordinatesZone.getBody();
			//return subjectCartographicsZone.getBody();
		}

		public boolean getRemainingCoordinatesAttributes() {
									if(subjectSection.getCoordinatesLang() != null)
										if(subjectSection.getCoordinatesXmlLang() != null)
											if(subjectSection.getCoordinatesScript() != null)
												if(subjectSection.getCoordinatesTransliteration() != null)
											return false;
			return true;

		}
		
		

		@CommitAfter public Object onActionFromAddScaleLang(long id) { return addScaleAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddScaleXmlLang(long id) { return addScaleAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddScaleScript(long id) { return addScaleAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddScaleTransliteration(long id) { return addScaleAttribute(id, "transliteration"); }
		public Object addScaleAttribute(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);

		
			 if("lang".equals(attribute)) {
				subjectSection.setScaleLang("eng");
			} else if ("xmllang".equals(attribute)) {
				subjectSection.setScaleXmlLang("en");
			} else if ("script".equals(attribute)) {
				subjectSection.setScaleScript("arab");
			} else if ("transliteration".equals(attribute)) {
				subjectSection.setScaleTransliteration(attribute);
			}

			session.update(subjectSection);
			return scaleZone.getBody();
			//return subjectCartographicsZone.getBody();
		}

		public boolean getRemainingScaleAttributes() {
									if(subjectSection.getScaleLang() != null)
										if(subjectSection.getScaleXmlLang() != null)
											if(subjectSection.getScaleScript() != null)
												if(subjectSection.getScaleTransliteration() != null)
											return false;
			return true;

		}
		
		@CommitAfter public Object onActionFromAddProjectionLang(long id) { return addProjectionAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddProjectionXmlLang(long id) { return addProjectionAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddProjectionScript(long id) { return addProjectionAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddProjectionTransliteration(long id) { return addProjectionAttribute(id, "transliteration"); }
		public Object addProjectionAttribute(long id, String attribute) {
			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);

		
			 if("lang".equals(attribute)) {
				subjectSection.setProjectionLang("eng");
			} else if ("xmllang".equals(attribute)) {
				subjectSection.setProjectionXmlLang("en");
			} else if ("script".equals(attribute)) {
				subjectSection.setProjectionScript("arab");
			} else if ("transliteration".equals(attribute)) {
				subjectSection.setProjectionTransliteration(attribute);
			}

			session.update(subjectSection);
			return projectionZone.getBody();
			//return subjectCartographicsZone.getBody();
		}

		public boolean getRemainingProjectionAttributes() {
									if(subjectSection.getProjectionLang() != null)
										if(subjectSection.getProjectionXmlLang() != null)
											if(subjectSection.getProjectionScript() != null)
												if(subjectSection.getProjectionTransliteration() != null)
											return false;
			return true;

		}
		
		//geo code
		
		
		public String getSubjectGeographicCodeAuthorityLabel() {
			return subjectSection.getSubGeographicCodeAuthority() == null ? "marccountry" : subjectSection.getSubGeographicCodeAuthority();
		}
		
		public String getSubjectGeographicCodeAuthorityUriLabel() {
			return subjectSection.getSubGeographicCodeAuthorityUri() == null ? "http://id.loc.gov/vocabulary/countries" : subjectSection.getSubGeographicCodeAuthorityUri();
		}
	
//	
//		@CommitAfter public Object onActionFromAddSubGeographicCodeValueUri(long id) { return addGeographicCodeAttribute(id, "valueuri"); }
//		@CommitAfter public Object onActionFromAddSubGeographicCodeLang(long id) { return addGeographicCodeAttribute(id, "lang"); }
//		@CommitAfter public Object onActionFromAddSubGeographicCodeXmlLang(long id) { return addGeographicCodeAttribute(id, "xmllang"); }
//		@CommitAfter public Object onActionFromAddSubGeographicCodeScript(long id) { return addGeographicCodeAttribute(id, "script"); }
//		@CommitAfter public Object onActionFromAddSubGeographicCodeTransliteration(long id) { return addGeographicCodeAttribute(id, "transliteration"); }
//		public Object addGeographicCodeAttribute(long id, String attribute) {
//			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);
//
//			
//			if ("valueuri".equals(attribute)) {
//				subjectSection.setSubGeographicCodeValueUri(attribute);
//			} else if ("lang".equals(attribute)) {
//				subjectSection.setSubGeographicCodeLang("eng");
//			} else if ("xmllang".equals(attribute)) {
//				subjectSection.setSubGeographicCodeXmlLang("en");
//			} else if ("script".equals(attribute)) {
//				subjectSection.setSubGeographicCodeScript("arab");
//			} else if ("transliteration".equals(attribute)) {
//				subjectSection.setSubGeographicCodeTransliteration(attribute);
//			}
//
//			session.update(subjectSection);
//			return subjectGeographicCodeZone.getBody();
//		}
//
//		public boolean getRemainingGeographicCodeAttributes() {
//					if(subjectSection.getSubGeographicCodeValueUri() != null)
//							if(subjectSection.getSubGeographicCodeLang() != null)
//								if(subjectSection.getSubGeographicCodeXmlLang() != null)
//									if(subjectSection.getSubGeographicCodeScript() != null)
//										if(subjectSection.getSubGeographicCodeTransliteration() != null)
//											return false;
//			return true;
//
//		}
//	
//		@CommitAfter public Object onActionFromSetSubGeographicCodeAuthorityMarccountry(long id) { return addSubGeographicCodeAuthority(id, "SubAuthorityMarccountry"); }
//		@CommitAfter public Object onActionFromSetSubGeographicCodeAuthorityMarcgac(long id) { return addSubGeographicCodeAuthority(id, "SubAuthorityMarcgac"); }
//		@CommitAfter public Object onActionFromSetSubGeographicCodeAuthorityIso3166(long id) { return addSubGeographicCodeAuthority(id, "SubAuthorityIso3166"); }
//		public Object addSubGeographicCodeAuthority(long id, String attribute) {
//			subjectSection = (SubjectSection) session.get(SubjectSection.class, id);
//		
//			if("SubAuthorityMarccountry".equals(attribute)) {
//				subjectSection.setSubGeographicCodeAuthority("marccountry");
//				subjectSection.setSubGeographicCodeAuthorityUri("http://id.loc.gov/vocabulary/countries");
//		
//			} else if("SubAuthorityMarcgac".equals(attribute)) {
//				subjectSection.setSubGeographicCodeAuthority("marcgac");
//				subjectSection.setSubGeographicCodeAuthorityUri("http://id.loc.gov/vocabulary/geographicAreas.html");
//				
//			} else if("SubAuthorityIso3166".equals(attribute)) {
//				subjectSection.setSubGeographicCodeAuthority("iso3166");
//				subjectSection.setSubGeographicCodeAuthorityUri("http://psi.oasis-open.org/iso/3166/");
//			
//		}
//
//			session.update(subjectSection);
//			return subjectGeographicCodeZone.getBody();
//		}
//		
//		
		*/
		
		
		
		//SubjectSection2
		
		
		@CommitAfter
		public Object onSuccessFromCreateSubjectSection2() {
			newSubjectSection2.setRecord(record);
			newSubjectSection2.setCreator(getUsername());
			record.getSubjectSections2().add(newSubjectSection2);
			session.update(record);
			newSubjectSection2.setSubGeographicCodeAuthority("none");
			newSubjectSection2.setSubGeographicCodeAuthorityUri("none");
			return subjectSection2Zone.getBody();
		}
		
		
		@CommitAfter
		public Object onSuccessFromCreateSubjectTitleInfo() {
			newTitleInfo.setRecord(record);
			newTitleInfo.setCreator(getUsername());
			record.getTitleInfos().add(newTitleInfo);
			session.update(record);
			return titleInfoZone.getBody();
		}


		@CommitAfter
		public Object onSuccessFromCreateSubjectName() {
			newName.setRecord(record);
			newName.setCreator(getUsername());
			record.getNames().add(newName);
			session.update(record);
			return nameZone.getBody();
		}

		
		void onPrepareForSubmitFromUpdateSubjectSection2(Long id) {
			subjectSection2 = (SubjectSection2) session.get(SubjectSection2.class, id);
		}

		@CommitAfter
		public void onSuccessFromUpdateSubjectSection2() {
			session.update(subjectSection2);
			updateSubjectSection2.clearErrors();
		}


		public Object onSubmitFromUpdateSubjectSection2() {
			return updateSubjectSection2Zone.getBody();
		}
		
		
		@CommitAfter public Object onActionFromAddCoordinatesLang(long id) { return addCoordinatesAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddCoordinatesXmlLang(long id) { return addCoordinatesAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddCoordinatesScript(long id) { return addCoordinatesAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddCoordinatesTransliteration(long id) { return addCoordinatesAttribute(id, "transliteration"); }
		public Object addCoordinatesAttribute(long id, String attribute) {
			subjectSection2 = (SubjectSection2) session.get(SubjectSection2.class, id);

		
			 if("lang".equals(attribute)) {
				subjectSection2.setCoordinatesLang("eng");
			} else if ("xmllang".equals(attribute)) {
				subjectSection2.setCoordinatesXmlLang("en");
			} else if ("script".equals(attribute)) {
				subjectSection2.setCoordinatesScript("arab");
			} else if ("transliteration".equals(attribute)) {
				subjectSection2.setCoordinatesTransliteration(attribute);
			}

			session.update(subjectSection2);
			return coordinatesZone.getBody();
		}

		public boolean getRemainingCoordinatesAttributes() {
									if(subjectSection2.getCoordinatesLang() != null)
										if(subjectSection2.getCoordinatesXmlLang() != null)
											if(subjectSection2.getCoordinatesScript() != null)
												if(subjectSection2.getCoordinatesTransliteration() != null)
											return false;
			return true;

		}
		

		@CommitAfter public Object onActionFromAddScaleLang(long id) { return addScaleAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddScaleXmlLang(long id) { return addScaleAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddScaleScript(long id) { return addScaleAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddScaleTransliteration(long id) { return addScaleAttribute(id, "transliteration"); }
		public Object addScaleAttribute(long id, String attribute) {
			subjectSection2 = (SubjectSection2) session.get(SubjectSection2.class, id);

		
			 if("lang".equals(attribute)) {
				subjectSection2.setScaleLang("eng");
			} else if ("xmllang".equals(attribute)) {
				subjectSection2.setScaleXmlLang("en");
			} else if ("script".equals(attribute)) {
				subjectSection2.setScaleScript("arab");
			} else if ("transliteration".equals(attribute)) {
				subjectSection2.setScaleTransliteration(attribute);
			}

			session.update(subjectSection2);
			return scaleZone.getBody();
		}

		public boolean getRemainingScaleAttributes() {
									if(subjectSection2.getScaleLang() != null)
										if(subjectSection2.getScaleXmlLang() != null)
											if(subjectSection2.getScaleScript() != null)
												if(subjectSection2.getScaleTransliteration() != null)
											return false;
			return true;

		}
		
		
		@CommitAfter public Object onActionFromAddProjectionLang(long id) { return addProjectionAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddProjectionXmlLang(long id) { return addProjectionAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddProjectionScript(long id) { return addProjectionAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddProjectionTransliteration(long id) { return addProjectionAttribute(id, "transliteration"); }
		public Object addProjectionAttribute(long id, String attribute) {
			subjectSection2 = (SubjectSection2) session.get(SubjectSection2.class, id);

		
			 if("lang".equals(attribute)) {
				subjectSection2.setProjectionLang("eng");
			} else if ("xmllang".equals(attribute)) {
				subjectSection2.setProjectionXmlLang("en");
			} else if ("script".equals(attribute)) {
				subjectSection2.setProjectionScript("arab");
			} else if ("transliteration".equals(attribute)) {
				subjectSection2.setProjectionTransliteration(attribute);
			}

			session.update(subjectSection2);
			return projectionZone.getBody();
		}

		public boolean getRemainingProjectionAttributes() {
									if(subjectSection2.getProjectionLang() != null)
										if(subjectSection2.getProjectionXmlLang() != null)
											if(subjectSection2.getProjectionScript() != null)
												if(subjectSection2.getProjectionTransliteration() != null)
											return false;
			return true;

		}
		
		//geo code
		
		
		public String getSubjectGeographicCodeAuthorityLabel() {
			return subjectSection2.getSubGeographicCodeAuthority() == null ? "marccountry" : subjectSection2.getSubGeographicCodeAuthority();
		}
		
		public String getSubjectGeographicCodeAuthorityUriLabel() {
			return subjectSection2.getSubGeographicCodeAuthorityUri() == null ? "http://id.loc.gov/vocabulary/countries" : subjectSection2.getSubGeographicCodeAuthorityUri();
		}
	
	
		@CommitAfter public Object onActionFromAddSubGeographicCodeValueUri(long id) { return addGeographicCodeAttribute(id, "valueuri"); }
		@CommitAfter public Object onActionFromAddSubGeographicCodeLang(long id) { return addGeographicCodeAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddSubGeographicCodeXmlLang(long id) { return addGeographicCodeAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddSubGeographicCodeScript(long id) { return addGeographicCodeAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddSubGeographicCodeTransliteration(long id) { return addGeographicCodeAttribute(id, "transliteration"); }
		public Object addGeographicCodeAttribute(long id, String attribute) {
			subjectSection2 = (SubjectSection2) session.get(SubjectSection2.class, id);

			
			if ("valueuri".equals(attribute)) {
				subjectSection2.setSubGeographicCodeValueUri(attribute);
			} else if ("lang".equals(attribute)) {
				subjectSection2.setSubGeographicCodeLang("eng");
			} else if ("xmllang".equals(attribute)) {
				subjectSection2.setSubGeographicCodeXmlLang("en");
			} else if ("script".equals(attribute)) {
				subjectSection2.setSubGeographicCodeScript("arab");
			} else if ("transliteration".equals(attribute)) {
				subjectSection2.setSubGeographicCodeTransliteration(attribute);
			}

			session.update(subjectSection2);
			return subjectGeographicCodeZone.getBody();
		}

		public boolean getRemainingGeographicCodeAttributes() {
					if(subjectSection2.getSubGeographicCodeValueUri() != null)
							if(subjectSection2.getSubGeographicCodeLang() != null)
								if(subjectSection2.getSubGeographicCodeXmlLang() != null)
									if(subjectSection2.getSubGeographicCodeScript() != null)
										if(subjectSection2.getSubGeographicCodeTransliteration() != null)
											return false;
			return true;

		}
	
		@CommitAfter public Object onActionFromSetSubGeographicCodeAuthorityMarccountry(long id) { return addSubGeographicCodeAuthority(id, "SubAuthorityMarccountry"); }
		@CommitAfter public Object onActionFromSetSubGeographicCodeAuthorityMarcgac(long id) { return addSubGeographicCodeAuthority(id, "SubAuthorityMarcgac"); }
		@CommitAfter public Object onActionFromSetSubGeographicCodeAuthorityIso3166(long id) { return addSubGeographicCodeAuthority(id, "SubAuthorityIso3166"); }
		public Object addSubGeographicCodeAuthority(long id, String attribute) {
			subjectSection2 = (SubjectSection2) session.get(SubjectSection2.class, id);
		
			if("SubAuthorityMarccountry".equals(attribute)) {
				subjectSection2.setSubGeographicCodeAuthority("marccountry");
				subjectSection2.setSubGeographicCodeAuthorityUri("http://id.loc.gov/vocabulary/countries");
		
			} else if("SubAuthorityMarcgac".equals(attribute)) {
				subjectSection2.setSubGeographicCodeAuthority("marcgac");
				subjectSection2.setSubGeographicCodeAuthorityUri("http://id.loc.gov/vocabulary/geographicAreas.html");
				
			} else if("SubAuthorityIso3166".equals(attribute)) {
				subjectSection2.setSubGeographicCodeAuthority("iso3166");
				subjectSection2.setSubGeographicCodeAuthorityUri("http://psi.oasis-open.org/iso/3166/");
			
		}

			session.update(subjectSection2);
			return subjectGeographicCodeZone.getBody();
		}
		
		
		
		
		//LOCATION
		@CommitAfter
		public Object onSuccessFromCreateLocation() {
			newLocation.setRecord(record);
			newLocation.setCreator(getUsername());
			newLocation.setPlAuthority("None");
			newLocation.setPlAuthority("None");
			record.getLocations().add(newLocation);
			session.update(record);
			return locationZone.getBody();
		}
		
		
		void onPrepareForSubmitFromUpdateLocation(Long id) {
			location = (Location) session.get(Location.class, id);
		}

		@CommitAfter
		public void onSuccessFromUpdateLocation() {
			session.update(location);
			updateLocation.clearErrors();
		}


		public Object onSubmitFromUpdateLocation() {
			return updateLocationZone.getBody();
		}
		
		
		@CommitAfter public Object onActionFromAddLocationDisplayLabel(long id) { return addLocationAttribute(id, "displayLabel"); }
		@CommitAfter public Object onActionFromAddLocationAltRepGroup(long id) { return addLocationAttribute(id, "altrepgroup"); }
		@CommitAfter public Object onActionFromAddLocationLang(long id) { return addLocationAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddLocationXmlLang(long id) { return addLocationAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddLocationScript(long id) { return addLocationAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddLocationTransliteration(long id) { return addLocationAttribute(id, "transliteration"); }
		public Object addLocationAttribute(long id, String attribute) {
			location = (Location) session.get(Location.class, id);

			if ("displayLabel".equals(attribute)) {
				location.setLocDisplayLabel(attribute);
			} else if ("altrepgroup".equals(attribute)) {
				location.setLocAltRepGroup(attribute);
			} else if("lang".equals(attribute)) {
				location.setLocLang("eng");
			} else if ("xmllang".equals(attribute)) {
				location.setLocXmlLang("en");
			} else if ("script".equals(attribute)) {
				location.setLocScript("arab");
			} else if ("transliteration".equals(attribute)) {
				location.setLocTransliteration(attribute);
			}

			session.update(location);
			return locationAttributeZone.getBody();
		}

		public boolean getRemainingLocationAttributes() {
			if(location.getLocDisplayLabel() != null)
				if(location.getLocAltRepGroup() != null)
							if(location.getLocLang() != null)
								if(location.getLocXmlLang() != null)
									if(location.getLocScript() != null)
										if(location.getLocTransliteration() != null)
											return false;
			return true;

		}
		
		
		
			//pl
		public String getPhysicalLocationAuthorityLabel() {
			return location.getPlAuthority() == null ? "None" : location.getPlAuthority();
		}
		
		public String getPhysicalLocationAuthorityUriLabel() {
			return location.getPlAuthorityUri() == null ? "None" : location.getPlAuthorityUri();
		}
		
		@CommitAfter public Object onActionFromAddPlDisplayLabel(long id) { return addPhysicalLocationAttribute(id, "displayLabel"); }
		@CommitAfter public Object onActionFromAddPlValueUri(long id) { return addPhysicalLocationAttribute(id, "valueuri"); }
		@CommitAfter public Object onActionFromAddPlXlink(long id) { return addPhysicalLocationAttribute(id, "xlink"); }
		@CommitAfter public Object onActionFromAddPlLang(long id) { return addPhysicalLocationAttribute(id, "lang"); }
		@CommitAfter public Object onActionFromAddPlXmlLang(long id) { return addPhysicalLocationAttribute(id, "xmllang"); }
		@CommitAfter public Object onActionFromAddPlScript(long id) { return addPhysicalLocationAttribute(id, "script"); }
		@CommitAfter public Object onActionFromAddPlTransliteration(long id) { return addPhysicalLocationAttribute(id, "transliteration"); }
		public Object addPhysicalLocationAttribute(long id, String attribute) {
			location = (Location) session.get(Location.class, id);

			if ("displayLabel".equals(attribute)) {
				location.setPlDisplayLabel(attribute);
			} else if ("valueuri".equals(attribute)) {
				location.setPlValueUri(attribute);
			} else if ("xlink".equals(attribute)) {
				location.setPlXlink(attribute);
			} else if("lang".equals(attribute)) {
				location.setPlLang("eng");
			} else if ("xmllang".equals(attribute)) {
				location.setPlXmlLang("en");
			} else if ("script".equals(attribute)) {
				location.setPlScript("arab");
			} else if ("transliteration".equals(attribute)) {
				location.setPlTransliteration(attribute);
			}

			session.update(location);
			return physicalLocationZone.getBody();
		}

		public boolean getRemainingPhysicalLocationAttributes() {
			if(location.getPlDisplayLabel() != null)
				if(location.getPlValueUri() != null)
					if(location.getPlXlink() != null)
							if(location.getPlLang() != null)
								if(location.getPlXmlLang() != null)
									if(location.getPlScript() != null)
										if(location.getPlTransliteration() != null)
											return false;
			return true;

		}
	
		@CommitAfter public Object onActionFromSetPlAuthorityMarcorg(long id) { return addPhysicalLocationAuthority(id, "marcorg"); }
		@CommitAfter public Object onActionFromSetPlAuthorityOclcorg(long id) { return addPhysicalLocationAuthority(id, "oclcorg"); }
		@CommitAfter public Object onActionFromSetPlAuthorityNone(long id) { return addPhysicalLocationAuthority(id, "none"); }
		public Object addPhysicalLocationAuthority(long id, String attribute) {
			location = (Location) session.get(Location.class, id);
		
			if("marcorg".equals(attribute)) {
				location.setPlAuthority("marcorg");
				location.setPlAuthorityUri("http://id.loc.gov/vocabulary/organizations.html");
			
			} else if("oclcorg".equals(attribute)) {
				location.setPlAuthority("oclcorg");
				location.setPlAuthorityUri("http://vocab.getty.edu/resource/aat.html");
		
			
			} else if("none".equals(attribute)) {
				location.setPlAuthority("None");
				location.setPlAuthorityUri("None");
			
		}

			session.update(location);
			return physicalLocationZone.getBody();
		}
		
		
		//url
		
		@CommitAfter public Object onActionFromAddUrlDisplayLabel(long id) { return addUrlAttribute(id, "displayLabel"); }
		@CommitAfter public Object onActionFromAddUrlDateLastAccessed(long id) { return addUrlAttribute(id, "datelastaccessed"); }
		@CommitAfter public Object onActionFromAddUrlNote(long id) { return addUrlAttribute(id, "note"); }
		public Object addUrlAttribute(long id, String attribute) {
			location = (Location) session.get(Location.class, id);

			if ("displayLabel".equals(attribute)) {
				location.setUrlDisplayLabel(attribute);
			} else if ("datelastaccessed".equals(attribute)) {
				location.setUrlDateLastAccessed(attribute);
			} else if ("note".equals(attribute)) {
				location.setUrlNote(attribute);
			}

			session.update(location);
			return urlZone.getBody();
		}

		public boolean getRemainingUrlAttributes() {
			if(location.getUrlDisplayLabel() != null)
				if(location.getUrlDateLastAccessed() != null)
					if(location.getUrlNote() != null)
						return false;
			return true;

		}
				
		
		
	//RECORD INFO	
		
	
	
	@CommitAfter
	public Object onSuccessFromCreateRecordInfo() {
		newRecordInfo.setRecord(record);
		newRecordInfo.setCreator(getUsername());
		record.getRecordInfos().add(newRecordInfo);
		newRecordInfo.setRecordContentSource("iedutc");
		newRecordInfo.setRcsAuthority("marcorg");
		newRecordInfo.setRcsAuthorityUri("http://id.loc.gov/vocabulary/organizations.html");
		newRecordInfo.setRecordOrigin("Record has been transformed into MODS from a MARC21 record");
		newRecordInfo.setLocatlanguageTermTypeText("Text");
		newRecordInfo.setLocatlanguageTermText("English");
		newRecordInfo.setLocatlanguageTermTypeCode("Code");
		newRecordInfo.setLocatlanguageTermCode("Eng");
		newRecordInfo.setLocatlangTermAuthority("iso639-2b");
		newRecordInfo.setLocatlangTermAuthorityUri("http://id.loc.gov/vocabulary/iso639-2.html");
		newRecordInfo.setLocatlangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/eng.html");
		session.persist(newRecordInfo);
		newRecordInfo.setRiRecordIdentifier((int) newRecordInfo.getId());
		session.update(record);
		return recordInfoZone.getBody();
	}

	void onPrepareForSubmitFromUpdateRecordInfo(Long id) {
		recordInfo = (RecordInfo) session.get(RecordInfo.class, id);
	}

	@CommitAfter
	public void onSuccessFromUpdateRecordInfo() {
		session.update(recordInfo);
		updateRecordInfo.clearErrors();
	}

	public Object onSubmitFromUpdateRecordInfo() {
		return updateRecordInfoZone.getBody();
	}
	
	
	@CommitAfter public Object onActionFromAddRiDisplayLabel(long id) { return addRiAttribute(id, "displayLabel"); }
	@CommitAfter public Object onActionFromAddRiAltRepGroup(long id) { return addRiAttribute(id, "altrepgroup"); }
	@CommitAfter public Object onActionFromAddRiLang(long id) { return addRiAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddRiXmlLang(long id) { return addRiAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddRiScript(long id) { return addRiAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddRiTransliteration(long id) { return addRiAttribute(id, "transliteration"); }
	public Object addRiAttribute(long id, String attribute) {
		recordInfo = (RecordInfo) session.get(RecordInfo.class, id);

		if("lang".equals(attribute)) {
			recordInfo.setRilang("eng");
		} else if ("xmllang".equals(attribute)) {
			recordInfo.setRixmlLang("en");
		} else if ("script".equals(attribute)) {
			recordInfo.setRiscript("arab");
		} else if ("transliteration".equals(attribute)) {
			recordInfo.setRitransliteration(attribute);
		} else if ("altrepgroup".equals(attribute)) {
			recordInfo.setRialtRepGroup(attribute);
		} else if ("displayLabel".equals(attribute)) {
			recordInfo.setRidisplayLabel(attribute);
		}

		session.update(recordInfo);
		return recordInfoAttributeZone.getBody();
	}

	public boolean getRemainingRiAttributes() {
		if(recordInfo.getRialtRepGroup() != null)
			if(recordInfo.getRidisplayLabel() != null)
				if(recordInfo.getLocatlanguageTermTextLang() != null)
					if(recordInfo.getLocatlanguageTermTextXmlLang() != null)
						if(recordInfo.getLocatlanguageTermTextScript() != null)
							if(recordInfo.getLocatlanguageTermTextTransliteration() != null)
												return false;
		return true;

	}
	
	//RecordContentSource
	
	public String getRecordContentSourceAuthorityLabel() {
		return recordInfo.getRcsAuthority() == null ? "marcorg" : recordInfo.getRcsAuthority();
	}
	
	public String getRecordContentSourceAuthorityUriLabel() {
		return recordInfo.getRcsAuthorityUri() == null ? "http://id.loc.gov/vocabulary/organizations.html" : recordInfo.getRcsAuthorityUri();
	}
	
	@CommitAfter public Object onActionFromSetRcsAuthorityMarcorg(long id) { return addRcsAuthority(id, "marcorg"); }
	@CommitAfter public Object onActionFromSetRcsAuthorityNone(long id) { return addRcsAuthority(id, "none"); }
	public Object addRcsAuthority(long id, String attribute) {
		recordInfo = (RecordInfo) session.get(RecordInfo.class, id);
	
		if("marcorg".equals(attribute)) {
			recordInfo.setRcsAuthority("marcorg");
			recordInfo.setRcsAuthorityUri("http://id.loc.gov/vocabulary/organizations.html");
			recordInfo.setRecordContentSource("iedutc");
	
		} else if("none".equals(attribute)) {
			recordInfo.setRcsAuthority("none");
			recordInfo.setRcsAuthorityUri("none");
			recordInfo.setRecordContentSource(attribute);
	
	}

		session.update(recordInfo);
		return recordContentSourceZone.getBody();
	}
	
	//record creation date
	
	@CommitAfter public Object onActionFromAddRcdEncoding(long id) { return addRcdAttribute(id, "encoding"); }
	@CommitAfter public Object onActionFromAddRcdPoint(long id) { return addRcdAttribute(id, "point"); }
	@CommitAfter public Object onActionFromAddRcdKeydate(long id) { return addRcdAttribute(id, "keydate"); }
	@CommitAfter public Object onActionFromAddRcdQualifier(long id) { return addRcdAttribute(id, "qualifier"); }
	@CommitAfter public Object onActionFromAddRcdLang(long id) { return addRcdAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddRcdXmlLang(long id) { return addRcdAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddRcdScript(long id) { return addRcdAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddRcdTransliteration(long id) { return addRcdAttribute(id, "transliteration"); }
	public Object addRcdAttribute(long id, String attribute) {
		recordInfo = (RecordInfo) session.get(RecordInfo.class, id);

		if("lang".equals(attribute)) {
			recordInfo.setRcdlang("eng");
		} else if ("xmllang".equals(attribute)) {
			recordInfo.setRcdxmlLang("en");
		} else if ("script".equals(attribute)) {
			recordInfo.setRcdscript("arab");
		} else if ("transliteration".equals(attribute)) {
			recordInfo.setRcdtransliteration(attribute);
		} else if ("encoding".equals(attribute)) {
			recordInfo.setRcdencoding(attribute);
		} else if ("point".equals(attribute)) {
			recordInfo.setRcdpoint(attribute);
		} else if ("keydate".equals(attribute)) {
			recordInfo.setRcdkeydate(attribute);
		} else if ("qualifier".equals(attribute)) {
			recordInfo.setRcdqualifier(attribute);
		}

		session.update(recordInfo);
		return recordCreationDateZone.getBody();
	}

	public boolean getRemainingRcdAttributes() {
		if(recordInfo.getRcdencoding() != null)
			if(recordInfo.getRcdpoint() != null)
				if(recordInfo.getRcdlang() != null)
					if(recordInfo.getRcdxmlLang() != null)
						if(recordInfo.getRcdscript() != null)
							if(recordInfo.getRcdtransliteration() != null)
								if(recordInfo.getRcdkeydate() != null)
									if(recordInfo.getRcdqualifier() != null)
												return false;
		return true;

	}
	
	//record change date
	
	@CommitAfter public Object onActionFromAddRchdEncoding(long id) { return addRchdAttribute(id, "encoding"); }
	@CommitAfter public Object onActionFromAddRchdPoint(long id) { return addRchdAttribute(id, "point"); }
	@CommitAfter public Object onActionFromAddRchdKeydate(long id) { return addRchdAttribute(id, "keydate"); }
	@CommitAfter public Object onActionFromAddRchdQualifier(long id) { return addRchdAttribute(id, "qualifier"); }
	@CommitAfter public Object onActionFromAddRchdLang(long id) { return addRchdAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddRchdXmlLang(long id) { return addRchdAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddRchdScript(long id) { return addRchdAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddRchdTransliteration(long id) { return addRchdAttribute(id, "transliteration"); }
	public Object addRchdAttribute(long id, String attribute) {
		recordInfo = (RecordInfo) session.get(RecordInfo.class, id);

		if("lang".equals(attribute)) {
			recordInfo.setRchdlang("eng");
		} else if ("xmllang".equals(attribute)) {
			recordInfo.setRchdxmlLang("en");
		} else if ("script".equals(attribute)) {
			recordInfo.setRchdscript("arab");
		} else if ("transliteration".equals(attribute)) {
			recordInfo.setRchdtransliteration(attribute);
		} else if ("encoding".equals(attribute)) {
			recordInfo.setRchdencoding(attribute);
		} else if ("point".equals(attribute)) {
			recordInfo.setRchdpoint(attribute);
		} else if ("keydate".equals(attribute)) {
			recordInfo.setRchdkeydate(attribute);
		} else if ("qualifier".equals(attribute)) {
			recordInfo.setRchdqualifier(attribute);
		}

		session.update(recordInfo);
		return recordChangeDateZone.getBody();
	}

	public boolean getRemainingRchdAttributes() {
		if(recordInfo.getRchdencoding() != null)
			if(recordInfo.getRchdpoint() != null)
				if(recordInfo.getRchdlang() != null)
					if(recordInfo.getRchdxmlLang() != null)
						if(recordInfo.getRchdscript() != null)
							if(recordInfo.getRchdtransliteration() != null)
								if(recordInfo.getRchdkeydate() != null)
									if(recordInfo.getRchdqualifier() != null)
												return false;
		return true;

	}
	
	//record Identifier
	
	@CommitAfter public Object onActionFromAddRiriLang(long id) { return addRiriAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddRiriXmlLang(long id) { return addRiriAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddRiriScript(long id) { return addRiriAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddRiriTransliteration(long id) { return addRiriAttribute(id, "transliteration"); }
	public Object addRiriAttribute(long id, String attribute) {
		recordInfo = (RecordInfo) session.get(RecordInfo.class, id);

		if("lang".equals(attribute)) {
			recordInfo.setRirilang("eng");
		} else if ("xmllang".equals(attribute)) {
			recordInfo.setRirixmlLang("en");
		} else if ("script".equals(attribute)) {
			recordInfo.setRiriscript("arab");
		} else if ("transliteration".equals(attribute)) {
			recordInfo.setRiritransliteration(attribute);
		}

		session.update(recordInfo);
		return riRecordIdentifierZone.getBody();
	}

	public boolean getRemainingRiriAttributes() {
				if(recordInfo.getRirilang() != null)
					if(recordInfo.getRirixmlLang() != null)
						if(recordInfo.getRiriscript() != null)
							if(recordInfo.getRiritransliteration() != null)
												return false;
		return true;

	}
	
	
	//record origin
	
	@CommitAfter public Object onActionFromAddRoLang(long id) { return addRoAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddRoXmlLang(long id) { return addRoAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddRoScript(long id) { return addRoAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddRoTransliteration(long id) { return addRoAttribute(id, "transliteration"); }
	public Object addRoAttribute(long id, String attribute) {
		recordInfo = (RecordInfo) session.get(RecordInfo.class, id);

		if("lang".equals(attribute)) {
			recordInfo.setRolang("eng");
		} else if ("xmllang".equals(attribute)) {
			recordInfo.setRoxmlLang("en");
		} else if ("script".equals(attribute)) {
			recordInfo.setRoscript("arab");
		} else if ("transliteration".equals(attribute)) {
			recordInfo.setRotransliteration(attribute);
		}

		session.update(recordInfo);
		return recordOriginZone.getBody();
	}

	public boolean getRemainingRoAttributes() {
				if(recordInfo.getRolang() != null)
					if(recordInfo.getRoxmlLang() != null)
						if(recordInfo.getRoscript() != null)
							if(recordInfo.getRotransliteration() != null)
												return false;
		return true;

	}
	
	// Language of Cataloging attributes
	@CommitAfter public Object onActionFromAddLocatUsage(long id) { return addLocatLanguageAttribute(id, "usage"); }
	@CommitAfter public Object onActionFromAddLocatObjectPart(long id) { return addLocatLanguageAttribute(id, "objectPart"); }
	@CommitAfter public Object onActionFromAddLocatDisplayLabel(long id) { return addLocatLanguageAttribute(id, "displayLabel"); }
	@CommitAfter public Object onActionFromAddLocatAltRepGroup(long id) { return addLocatLanguageAttribute(id, "altrepgroup"); }
	public Object addLocatLanguageAttribute(long id, String attribute) {
		recordInfo = (RecordInfo) session.get(RecordInfo.class, id);

		if("usage".equals(attribute)) {
			recordInfo.setLocatusage("primary");
		} else if ("objectPart".equals(attribute)) {
			recordInfo.setLocatobjectPart(attribute);
		} else if ("altrepgroup".equals(attribute)) {
			recordInfo.setLocataltRepGroup(attribute);
		} else if ("displayLabel".equals(attribute)) {
			recordInfo.setLocatdisplayLabel(attribute);
		}

		session.update(recordInfo);
		return locatAttributeZone.getBody();
	}

	public boolean getRemainingLocatAttributes() {
		if(recordInfo.getLocatusage() != null)
			if(recordInfo.getLocatobjectPart() != null)
				if(recordInfo.getLocataltRepGroup() != null)
					if(recordInfo.getLocatdisplayLabel() != null)
												return false;
		return true;

	}
	
	
	//languageTerm 
	
	public String getLocatLanguageTermTypeTextLabel() {
		return recordInfo.getLocatlanguageTermTypeText() == null ? "text" : recordInfo.getLocatlanguageTermTypeText();
	}
	
	
	public String getLocatLanguageTermTextLabel() {
		return recordInfo.getLocatlanguageTermText() == null ? "english" : recordInfo.getLocatlanguageTermText();
	}
	
	
	public String getLocatLanguageTermTypeCodeLabel() {
		return recordInfo.getLocatlanguageTermTypeCode() == null ? "code" : recordInfo.getLocatlanguageTermTypeCode();
	}
	
	public String getLocatLanguageTermCodeLabel() {
		return recordInfo.getLocatlanguageTermCode() == null ? "eng" : recordInfo.getLocatlanguageTermCode();
	}
	
	public String getLocatLanguageTermAuthorityLabel() {
		return recordInfo.getLocatlangTermAuthority() == null ? "iso639-2b" : recordInfo.getLocatlangTermAuthority();
	}
	
	public String getLocatLanguageTermAuthorityUriLabel() {
		return recordInfo.getLocatlangTermAuthorityUri() == null ? "http://id.loc.gov/vocabulary/iso639-2.html" : recordInfo.getLocatlangTermAuthorityUri();
	}
	
	public String getLocatLanguageTermValueUriLabel() {
		return recordInfo.getLocatlangTermValueUri() == null ? "http://id.loc.gov/vocabulary/iso639-2/eng.html" : recordInfo.getLocatlangTermValueUri();
	}
	
	@CommitAfter public Object onActionFromSetLocatlanguageTermTypeText(long id) { return addLocatLanguageTermType(id, "languagetermtypetext"); }
	public Object addLocatLanguageTermType(long id, String attribute) {
		recordInfo = (RecordInfo) session.get(RecordInfo.class, id);
		
		if("languagetermtypetext".equals(attribute)) {
			recordInfo.setLocatlanguageTermTypeText("text");
			recordInfo.setLocatlangTermAuthority("ISO639-2b");
			recordInfo.setLocatlangTermAuthorityUri("http://id.loc.gov/vocabulary/iso639-2.html");
			recordInfo.setLocatlanguageTermTypeCode("code");
			recordInfo.setLocatlanguageTermText("english");
			recordInfo.setLocatlanguageTermCode("eng");
			recordInfo.setLocatlangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/eng.html");
		}
	
			session.update(recordInfo);
			return locatLanguageTermZone.getBody();
		}
	
	@CommitAfter public Object onActionFromSetLocatlangTermTextEng(long id) { return addLocatLanguageTerm(id, "languagetermtextenglish"); }
	@CommitAfter public Object onActionFromSetLocatlangTermTextFre(long id) { return addLocatLanguageTerm(id, "languagetermtextfrench"); }
	@CommitAfter public Object onActionFromSetLocatlangTermTextGer(long id) { return addLocatLanguageTerm(id, "languagetermtextgerman"); }
	@CommitAfter public Object onActionFromSetLocatlangTermTextGle(long id) { return addLocatLanguageTerm(id, "languagetermtextirish"); }
	@CommitAfter public Object onActionFromSetLocatlangTermTextIta(long id) { return addLocatLanguageTerm(id, "languagetermtextitalian"); }
	@CommitAfter public Object onActionFromSetLocatlangTermTextLat(long id) { return addLocatLanguageTerm(id, "languagetermtextlatin"); }
	@CommitAfter public Object onActionFromSetLocatlangTermTextSpa(long id) { return addLocatLanguageTerm(id, "languagetermtextspanish"); }
	public Object addLocatLanguageTerm(long id, String attribute) {
		recordInfo = (RecordInfo) session.get(RecordInfo.class, id);
		
		if("languagetermtextenglish".equals(attribute)) {
			recordInfo.setLocatlanguageTermText("english");
			recordInfo.setLocatlanguageTermCode("eng");
			recordInfo.setLocatlangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/eng.html");
			
		} else if("languagetermtextfrench".equals(attribute)) {
			recordInfo.setLocatlanguageTermText("french");
			recordInfo.setLocatlanguageTermCode("fre");
			recordInfo.setLocatlangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/fre.html");
			
		} else if("languagetermtextgerman".equals(attribute)) {
			recordInfo.setLocatlanguageTermText("german");
			recordInfo.setLocatlanguageTermCode("ger");
			recordInfo.setLocatlangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/ger.html");
			
		} else if("languagetermtextirish".equals(attribute)) {
			recordInfo.setLocatlanguageTermText("irish");
			recordInfo.setLocatlanguageTermCode("gle");
			recordInfo.setLocatlangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/gle.html");
			
		} else if("languagetermtextitalian".equals(attribute)) {
			recordInfo.setLocatlanguageTermText("italian");
			recordInfo.setLocatlanguageTermCode("ita");
			recordInfo.setLocatlangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/ita.html");
			
		} else if("languagetermtextlatin".equals(attribute)) {
			recordInfo.setLocatlanguageTermText("latin");
			recordInfo.setLocatlanguageTermCode("lat");
			recordInfo.setLocatlangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/lat.html");
			
		} else if("languagetermtextspanish".equals(attribute)) {
			recordInfo.setLocatlanguageTermText("spanish");
			recordInfo.setLocatlanguageTermCode("spa");
			recordInfo.setLocatlangTermValueUri("http://id.loc.gov/vocabulary/iso639-2/spa.html");
	
	}

		session.update(recordInfo);
		return locatLanguageTermZone.getBody();
	}
	
	//public String getLanguageTermTextLabel() {
		//return recordInfo.getLanguageTermText() == null ? "" : recordInfo.getLanguageTermText();
	//}
	
	
	// langTerm Text
	@CommitAfter public Object onActionFromAddLocatlanguageTermTextLang(long id) { return addLocatLanguageTermTextAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddLocatlanguageTermTextXmlLang(long id) { return addLocatLanguageTermTextAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddLocatlanguageTermTextScript(long id) { return addLocatLanguageTermTextAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddLocatlanguageTermTextTransliteration(long id) { return addLocatLanguageTermTextAttribute(id, "transliteration"); }
	public Object addLocatLanguageTermTextAttribute(long id, String attribute) {
		recordInfo = (RecordInfo) session.get(RecordInfo.class, id);

		if("lang".equals(attribute)) {
			recordInfo.setLocatlanguageTermTextLang("eng");
		} else if ("xmllang".equals(attribute)) {
			recordInfo.setLocatlanguageTermTextXmlLang("en");
		} else if ("script".equals(attribute)) {
			recordInfo.setLocatlanguageTermTextScript("arab");
		} else if ("transliteration".equals(attribute)) {
			recordInfo.setLocatlanguageTermTextTransliteration(attribute);
		}

		session.update(recordInfo);
		return locatLanguageTermZone.getBody();
	}

	public boolean getRemainingLocatLanguageTermTextAttributes() {
		if(recordInfo.getLocatlanguageTermTextLang() != null)
			if(recordInfo.getLocatlanguageTermTextXmlLang() != null)
				if(recordInfo.getLocatlanguageTermTextScript() != null)
					if(recordInfo.getLocatlanguageTermTextTransliteration() != null)
						return false;
		return true;

	}
	

	//langTerm Code
	@CommitAfter public Object onActionFromAddLocatlangTermCodeLang(long id) { return addLocatLanguageTermCodeAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddLocatlangTermCodeXmlLang(long id) { return addLocatLanguageTermCodeAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddLocatlangTermCodeScript(long id) { return addLocatLanguageTermCodeAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddLocatlangTermCodeTransliteration(long id) { return addLocatLanguageTermCodeAttribute(id, "transliteration"); }
	public Object addLocatLanguageTermCodeAttribute(long id, String attribute) {
		recordInfo = (RecordInfo) session.get(RecordInfo.class, id);

		if("lang".equals(attribute)) {
			recordInfo.setLocatlanguageTermCodeLang("eng");
		} else if ("xmllang".equals(attribute)) {
			recordInfo.setLocatlanguageTermCodeXmlLang("en");
		} else if ("script".equals(attribute)) {
			recordInfo.setLocatlanguageTermCodeScript("arab");
		} else if ("transliteration".equals(attribute)) {
			recordInfo.setLocatlanguageTermCodeTransliteration(attribute);
		}

		session.update(recordInfo);
		return locatLanguageTermZone.getBody();
	}

	public boolean getRemainingLocatLanguageTermCodeAttributes() {
		if(recordInfo.getLocatlanguageTermCodeLang() != null)
			if(recordInfo.getLocatlanguageTermCodeXmlLang() != null)
				if(recordInfo.getLocatlanguageTermCodeScript() != null)
					if(recordInfo.getLocatlanguageTermCodeTransliteration() != null)
						return false;
		return true;

	}
	

		
		
	

	
	
	
	
	    
		
		
		
}

	
	


