package ie.tcd.kdeg.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.apache.tapestry5.beaneditor.Validate;

@Entity
public class Note extends BaseEntity {
	
	@Validate("required")
	private String note;
	
	private String noteType;
	private String noteDisplayLabel;
	private String noteAltRepGroup;
	private String noteXlink;
	private String noteId;
	private String noteLang;
	private String noteXmlLang;
	private String noteScript;
	private String noteTransliteration;
	private String noteTypeUri;
	

	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;
	
	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	
	

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNoteType() {
		return noteType;
	}

	public void setNoteType(String noteType) {
		this.noteType = noteType;
	}

	public String getNoteDisplayLabel() {
		return noteDisplayLabel;
	}

	public void setNoteDisplayLabel(String noteDisplayLabel) {
		this.noteDisplayLabel = noteDisplayLabel;
	}

	public String getNoteAltRepGroup() {
		return noteAltRepGroup;
	}

	public void setNoteAltRepGroup(String noteAltRepGroup) {
		this.noteAltRepGroup = noteAltRepGroup;
	}

	public String getNoteXlink() {
		return noteXlink;
	}

	public void setNoteXlink(String noteXlink) {
		this.noteXlink = noteXlink;
	}

	public String getNoteId() {
		return noteId;
	}

	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}

	public String getNoteLang() {
		return noteLang;
	}

	public void setNoteLang(String noteLang) {
		this.noteLang = noteLang;
	}

	public String getNoteXmlLang() {
		return noteXmlLang;
	}

	public void setNoteXmlLang(String noteXmlLang) {
		this.noteXmlLang = noteXmlLang;
	}

	public String getNoteScript() {
		return noteScript;
	}

	public void setNoteScript(String noteScript) {
		this.noteScript = noteScript;
	}

	public String getNoteTransliteration() {
		return noteTransliteration;
	}

	public void setNoteTransliteration(String noteTransliteration) {
		this.noteTransliteration = noteTransliteration;
	}
	
	
	public String getNoteTypeUri() {
		return noteTypeUri;
	}

	public void setNoteTypeUri(String noteTypeUri) {
		this.noteTypeUri = noteTypeUri;
	}

	@Transient
	public boolean hasAttributes() {
			if(getNoteType() == null)
				if(getNoteDisplayLabel() == null)
					if(getNoteAltRepGroup() == null)
						if(getNoteXlink() == null)
							if(getNoteId() == null)
								if(getNoteLang() == null)
									if(getNoteXmlLang() == null)
										if(getNoteScript() == null)
											if(getNoteTransliteration() == null)
												if(getNoteTypeUri() == null)
													return false;
		return true;
	}

	public void Attributes() {
		this.noteType = null;
		this.noteTypeUri = null;
		this.noteDisplayLabel = null;
		this.noteAltRepGroup = null;
		this.noteXlink = null;
		this.noteId = null;
		this.noteLang = null;
		this.noteXmlLang = null;
		this.noteScript = null;
		this.noteTransliteration = null;
	}

}
