package ie.tcd.kdeg.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.beaneditor.Validate;
import org.apache.tapestry5.corelib.components.Zone;

@Entity
public class Genre extends BaseEntity  {
	
	
	@Property
	@Persist
	@Validate("required")
	@Enumerated(EnumType.STRING)
	private GenreAuthorities genreAuthorities;
	
	@Validate("required")
	private String genre;
	private String authority;
	private String authorityUri;
	private String valueUri;

	private String genreType;
	private String genreDisplayLabel;
	private String genreUsage;
	private String genreAltRepGroup;
	private String genreLang;
	private String genreXmlLang;
	private String genreScript;
	private String genreTransliteration;
	
	/*public class EnumTest {
		GenreAuthorities genreAuthorities;
		public EnumTest(GenreAuthorities genreAuthorities) {
	        this.genreAuthorities = genreAuthorities;
		}*/
	
	/*public void onValueChanged(GenreAuthorities genreAuthorities) {
	  switch (genreAuthorities) 
      {
         case ART_AND_ARCHITECTURE_THESAURUS:
            authority = "aat";
			authorityUri ="http://vocab.getty.edu/resource/aat.html";
			break;
         case LIBRARY_OF_CONGRESS_GENRE_AND_FORM_TERMS:
        	 authority = "lcgft";
        	 authorityUri = "http://id.loc.gov/authorities/genreForms.html";
        	 break;
         case THESAURUS_FOR_GRAPHIC_MATERIALS:
        	 authority = "tgm";
        	 authorityUri = "http://id.loc.gov/vocabulary/graphicMaterials.html";
        	 break;
       }
	 }*/

	
	
	
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "record_id")
	private Record record;
	
	

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}
	
	
	public GenreAuthorities getGenreAuthorities() {
		return genreAuthorities;
	}

	public void setGenreAuthorities(GenreAuthorities genreAuthorities) {
		this.genreAuthorities = genreAuthorities;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getAuthorityUri() {
		return authorityUri;
	}

	public void setAuthorityUri(String authorityUri) {
		this.authorityUri = authorityUri;
	}

	public String getValueUri() {
		return valueUri;
	}

	public void setValueUri(String valueUri) {
		this.valueUri = valueUri;
	}
	
	
	
	
	@Transient
	public boolean isAuthorityLcgft() {
		return authority != null && "lcgft".equals(authority);
	}
	@Transient
	public boolean isAuthorityTgm() {
		return authority != null && "tgm".equals(authority);
	}
	@Transient
	public boolean isAuthorityAat() {
		return authority != null && "aat".equals(authority);
	}
	

	
	//Attributes
	
	
	public String getGenreUsage() {
		return genreUsage;
	}

	public void setGenreUsage(String genreUsage) {
		this.genreUsage = genreUsage;
	}

	
	
	
	@Transient
	public boolean hasAttributes() {
		if(getGenreType() == null)
			if(getGenreUsage() == null)
				if(getGenreAltRepGroup() == null)
					if(getGenreLang() == null)
						if(getGenreXmlLang() == null)
							if(getGenreScript() == null)
								if(getGenreTransliteration() == null)
									return false;
		return true;
	}

	public void Attributes() {
		this.genreType = null;
		this.genreUsage = null;
		this.genreAltRepGroup = null;
		this.genreLang = null;
		this.genreXmlLang = null;
		this.genreScript = null;
		this.genreTransliteration = null;
	}

	public String getGenreType() {
		return genreType;
	}

	public void setGenreType(String genreType) {
		this.genreType = genreType;
	}

	public String getGenreDisplayLabel() {
		return genreDisplayLabel;
	}

	public void setGenreDisplayLabel(String genreDisplayLabel) {
		this.genreDisplayLabel = genreDisplayLabel;
	}

	public String getGenreAltRepGroup() {
		return genreAltRepGroup;
	}

	public void setGenreAltRepGroup(String genreAltRepGroup) {
		this.genreAltRepGroup = genreAltRepGroup;
	}

	public String getGenreLang() {
		return genreLang;
	}

	public void setGenreLang(String genreLang) {
		this.genreLang = genreLang;
	}

	public String getGenreXmlLang() {
		return genreXmlLang;
	}

	public void setGenreXmlLang(String genreXmlLang) {
		this.genreXmlLang = genreXmlLang;
	}

	public String getGenreScript() {
		return genreScript;
	}

	public void setGenreScript(String genreScript) {
		this.genreScript = genreScript;
	}

	public String getGenreTransliteration() {
		return genreTransliteration;
	}

	public void setGenreTransliteration(String genreTransliteration) {
		this.genreTransliteration = genreTransliteration;
	}

	
	
	
}
