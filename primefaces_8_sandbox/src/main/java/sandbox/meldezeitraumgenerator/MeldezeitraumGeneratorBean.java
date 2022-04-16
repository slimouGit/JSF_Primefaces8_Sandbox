package sandbox.meldezeitraumgenerator;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import abstractbean.AbstractBean;

@Named
@ViewScoped	
public class MeldezeitraumGeneratorBean extends AbstractBean {
	
	private String title;
	private String meldeZeitraumSuffix;
	private List<String> meldezeitraumModusMap = new ArrayList<>();
	private String meldeZeitraumPraefix;
	private List<String> meldezeitraumPraefixListe = new ArrayList<>();
	
	
	@PostConstruct
	public void init() {
		this.title = "MeldezeitraumKomponente";
		
		this.meldezeitraumPraefixListe.add("Monat");
		this.meldezeitraumPraefixListe.add("2 Monate");
		this.meldezeitraumPraefixListe.add("Quartal");
		this.meldezeitraumPraefixListe.add("Jahr");
		
		this.meldezeitraumModusMap.add("01");
		this.meldezeitraumModusMap.add("02");
		this.meldezeitraumModusMap.add("03");
		this.meldezeitraumModusMap.add("04");
		this.meldezeitraumModusMap.add("05");
		this.meldezeitraumModusMap.add("06");
		this.meldezeitraumModusMap.add("07");
		this.meldezeitraumModusMap.add("08");
		this.meldezeitraumModusMap.add("09");
		this.meldezeitraumModusMap.add("10");
		this.meldezeitraumModusMap.add("11");
		this.meldezeitraumModusMap.add("12");
	
	}
	
	
	private boolean zeigeMeldezeitraumDetail_1;	
	public boolean toggleMeldezeitraumDetail_1() {		
		return this.zeigeMeldezeitraumDetail_1 ^= true;
	}
	public boolean isZeigeMeldezeitraumDetail_1() {
		return zeigeMeldezeitraumDetail_1;
	}
	
	
	private boolean zeigeMeldezeitraumDetail_2;
	public boolean toggleMeldezeitraumDetail_2() {
		return this.zeigeMeldezeitraumDetail_2 ^= true;
	}
	public boolean isZeigeMeldezeitraumDetail_2() {
		return zeigeMeldezeitraumDetail_2;
	}
	
	
	private boolean zeigeMeldezeitraumDetail_3;
	public boolean toggleMeldezeitraumDetail_3() {
		return this.zeigeMeldezeitraumDetail_3 ^= true;
	}
	public boolean isZeigeMeldezeitraumDetail_3() {
		return zeigeMeldezeitraumDetail_3;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMeldeZeitraumSuffix() {
		return meldeZeitraumSuffix;
	}

	public void setMeldeZeitraumSuffix(String meldeZeitraumSuffix) {
		this.meldeZeitraumSuffix = meldeZeitraumSuffix;
	}

	public List<String> getMeldezeitraumModusMap() {
		return meldezeitraumModusMap;
	}

	public void setMeldezeitraumModusMap(List<String> meldezeitraumModusMap) {
		this.meldezeitraumModusMap = meldezeitraumModusMap;
	}
	
	
	public String getMeldeZeitraumPraefix() {
		return meldeZeitraumPraefix;
	}

	public void setMeldeZeitraumPraefix(String meldeZeitraumPraefix) {
		this.meldeZeitraumPraefix = meldeZeitraumPraefix;
	}

	public List<String> getMeldezeitraumPraefixListe() {
		return meldezeitraumPraefixListe;
	}

	public void setMeldezeitraumPraefixListe(List<String> meldezeitraumPraefixListe) {
		this.meldezeitraumPraefixListe = meldezeitraumPraefixListe;
	}
	
	
	
	
}
