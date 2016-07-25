package ie.tcd.kdeg.pages;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import ie.tcd.kdeg.entities.Record;
import ie.tcd.kdeg.entities.TitleInfo;

public class EditRecord extends BasePage {

	@Property
	private Record record;

	@Inject
	private Session session;
	
	@Property
	private TitleInfo titleInfo;

	@Property
	private TitleInfo newTitleInfo;
	
	// fields for changing the information
	@InjectComponent private Zone headerZone;
	
	// fields for changing the title information
	@InjectComponent private Zone titleInfoZone;
	@InjectComponent private Zone updateTitleInfoZone;
	@InjectComponent private Zone displayLabelZone;
	@Component private Form updateTitleInfo;

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
	public Object onSuccessFromUpdateTitleInfo() {
		if(titleInfo.hasDisplayLabelAttributes() && titleInfo.getDisplayLabel() == null)
			titleInfo.removeDisplayAttributes();
		
		session.update(titleInfo);
		return updateTitleInfoZone.getBody();
	}
	
	@CommitAfter public Object onActionFromAddDisplayLabelLang(long id) { return addDisplayLabelAttribute(id, "lang"); }
	@CommitAfter public Object onActionFromAddDisplayLabelXmlLang(long id) { return addDisplayLabelAttribute(id, "xmllang"); }
	@CommitAfter public Object onActionFromAddDisplayLabelScript(long id) { return addDisplayLabelAttribute(id, "script"); }
	@CommitAfter public Object onActionFromAddDisplayLabelTranslation(long id) { return addDisplayLabelAttribute(id, "translation"); }
	public Object addDisplayLabelAttribute(long id, String attribute) {
		titleInfo = (TitleInfo) session.get(TitleInfo.class, id);
		
		if("lang".equals(attribute)) {
			titleInfo.setDisplayLabelLang(attribute);
		} else if ("xmllang".equals(attribute)) {
			titleInfo.setDisplayLabelXmlLang(attribute);
		} else if ("script".equals(attribute)) {
			titleInfo.setDisplayLabelScript(attribute);
		} else if ("translation".equals(attribute)) {
			titleInfo.setDisplayLabelTranslation(attribute);
		}
		
		session.update(titleInfo);
        return displayLabelZone.getBody();
    }
	
	public boolean getRemainingDisplayAttributes() {
		if(titleInfo.getDisplayLabelLang() != null)
			if(titleInfo.getDisplayLabelXmlLang() != null)
				if(titleInfo.getDisplayLabelScript() != null)
					if(titleInfo.getDisplayLabelTranslation() != null)
						return false;
		return true;
			
	}

}
