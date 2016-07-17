package ie.tcd.kdeg.pages;

import java.util.List;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import ie.tcd.kdeg.entities.Record;

public class Index extends BasePage {

	@Property
	private Record newRecord;

	@Property
	private Record record;

	@Inject
	private Session session;
	
	@CommitAfter
	public String onActivate() {
		if(!securityService.isAuthenticated()) {
			return "login";
		}
		return null;
	}
	
	@CommitAfter
	public void onSuccessNewRecord() {
		newRecord.setCreator(getUsername());
		session.persist(newRecord);
	}

	@SuppressWarnings("unchecked")
	public List<Record> getRecords() {
		return session.createCriteria(Record.class).list();
	}
	
	@CommitAfter
	public void onSuccessFromCreateDummyRecords() {
		for (int i = 0; i < 10; i++) {
			Record r = new Record();
			r.setCreator(getUsername());
			r.setDigitalObjectIdentifier("DOI:" + ((int) (Math.random() * 10000)));
			r.setDrisUnique("DOI:" + ((int) (Math.random() * 10000)));
			r.setDrisPageNo((int) (Math.random() * 10000));
			r.setDrisDocumentNo((int) (Math.random() * 10000));
			r.setProjectNo((int) (Math.random() * 10000));
			r.setFolderNo((int) (Math.random() * 10000));
			r.setDigitalRootNo((int) (Math.random() * 10000));
			r.setModsCollection((int) (Math.random() * 10) % 2 == 0 ? true : false);
			r.setModsRecord((int) (Math.random() * 10) % 2 == 0 ? true : false);
			session.persist(r);
		}
	}
	
}
