package ie.tcd.kdeg.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.apache.tapestry5.OptionModel;
import org.apache.tapestry5.SelectModel;
import org.apache.tapestry5.beaneditor.Validate;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.util.EnumSelectModel;


@Entity
public class Tor extends BaseEntity {
	
	
	private TypeOfResource typeOfResource;
	
	private String torType;
	private String manuscript;
	private String collection;
	
	private String torDisplayLabel;
	private String torUsage;
	private String torAltRepGroup;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;
	
	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	public TypeOfResource getTypeOfResource() {
		return typeOfResource;
	}

	public void setTypeOfResource(TypeOfResource typeOfResource) {
		this.typeOfResource = typeOfResource;
	}
	
	public String getTorType() {
		return torType;
	}

	public void setTorType(String torType) {
		this.torType = torType;
	}

	public String getManuscript() {
		return manuscript;
	}

	public void setManuscript(String manuscript) {
		this.manuscript = manuscript;
	}

	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	public String getTorDisplayLabel() {
		return torDisplayLabel;
	}

	public void setTorDisplayLabel(String torDisplayLabel) {
		this.torDisplayLabel = torDisplayLabel;
	}

	public String getTorUsage() {
		return torUsage;
	}

	public void setTorUsage(String torUsage) {
		this.torUsage = torUsage;
	}

	public String getTorAltRepGroup() {
		return torAltRepGroup;
	}

	public void setTorAltRepGroup(String torAltRepGroup) {
		this.torAltRepGroup = torAltRepGroup;
	}
	
	
	
	
	@Transient
	public boolean hasAttributes() {
			if(getTorUsage() == null)
				if(getTorAltRepGroup() == null)
					if(getTorDisplayLabel() == null)
									return false;
		return true;
	}

	public void Attributes() {
		this.torUsage = null;
		this.torAltRepGroup = null;
		this.torDisplayLabel = null;
	}

	
	
	

	
/*	public enum typeOfResources {
		
		TEXT, 
		CARTOGRAPHIC, 
		NOTATED_MUSIC, 
		SOUND_RECORDING, 
		SOUND_RECORDING_MUSICAL, 
		SOUND_RECORDING_NONMUSICAL, 
		STILL_IMAGE, MOVING_IMAGE, 
		THREE_DIMENSIONAL_OBJECT, 
		SOFTWARE_MULTIMEDIA, 
		MIXED_MATERIAL;

}
*/	
	


	
	
	
//	public String getTypeOfResource() {
//		return typeOfResource;
//	}
//
//	public void setTypeOfResource(String typeOfResource) {
//		this.typeOfResource = typeOfResource;
//	}
	

 
	
	
	
	
	
	
	
	
	
	
	

}
