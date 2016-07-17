package ie.tcd.kdeg.pages;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import ie.tcd.kdeg.entities.Record;

public class EditRecord extends BasePage {

	@Property
	private Record record;

	@Inject
	private Session session;
	
	// fields for changing the information
	@Component private Zone headerZone;

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
	

}
