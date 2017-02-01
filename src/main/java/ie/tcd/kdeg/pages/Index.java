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
	public void onSuccessFromNewRecord() {
		// TODO: foo bar
		// a new Records has id zero
		newRecord.setCreator(getUsername());
		session.persist(newRecord);
		// after persisting, the newRecord has a unique ID, which we will use
		// for the time being as DRIS unique
		newRecord.setDrisUnique((int) newRecord.getId());
		session.persist(newRecord);
	}


	@SuppressWarnings("unchecked")
	public List<Record> getRecords() {
		return session.createCriteria(Record.class).list();
	}

/*	@CommitAfter
	public void onSuccessFromCreateDummyRecords() {
		for (int i = 0; i < 10; i++) {
			Record r = new Record();
			r.setCreator(getUsername());
			//r.setDigitalObjectIdentifier("DOI:" + ((int) (Math.random() * 10000)));
			r.setDrisUnique(((int) (Math.random() * 10000)));
			r.setDrisPageNo("page_" + (int) (Math.random() * 10000));
			r.setDrisDocumentNo("" + (int) (Math.random() * 10000));
			r.setProjectNo("Project" + (int) (Math.random() * 10000));
			r.setFolderNo((int) (Math.random() * 10000));
			r.setDigitalRootNo("" + (int) (Math.random() * 10000));
			//r.setModsCollection((int) (Math.random() * 10) % 2 == 0 ? true : false);
			// r.setModsRecord((int) (Math.random() * 10) % 2 == 0 ? true : false);
			session.persist(r);
		}
	}*/

	@CommitAfter
	public Object onActionFromDelete(long id){
		record = (Record) session.get(Record.class, id);

		
		session.delete(record);
		return "Index";

	}

}
