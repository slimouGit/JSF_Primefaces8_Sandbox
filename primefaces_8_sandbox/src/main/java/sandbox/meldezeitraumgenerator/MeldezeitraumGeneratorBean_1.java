package sandbox.meldezeitraumgenerator;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import abstractbean.AbstractBean;

@Named
@ViewScoped	
public class MeldezeitraumGeneratorBean_1 extends AbstractBean {
	
	private String meldeZeitraumSuffix;
	private List<String> meldezeitraumModusMap = new ArrayList<>();
	private String meldeZeitraumPraefix;
	private List<String> meldezeitraumPraefixListe = new ArrayList<>();
	private String meldezeitraum;
	private String meldezeitraumVon;
	private String meldezeitraumBis;
	private boolean zeigeMeldezeitraumDetail;
	
	
	
	@PostConstruct
	public void init() {
		
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
	
	public void setzeMeldezeitraum() {
		System.out.println("Meldezeitraum " + this.meldezeitraum);
		if(null!=this.meldezeitraum && !this.meldezeitraum.isEmpty()) {
			this.meldezeitraumVon = "01.02.2022";
			this.meldezeitraumBis = "28.02.2022";
		}else {
			this.meldezeitraumVon = "";
			this.meldezeitraumBis = "";
		}
	}
		
	public void toggleMeldezeitraumDetail() {		
		this.zeigeMeldezeitraumDetail ^= true;
		System.out.println("Meldezeitraum T " + this.meldezeitraum);		
	}
	
	public void selectQuartal() {
		System.out.println("selectQuartal");
		this.meldezeitraum = "0322";
		this.meldezeitraumVon = "01.03.2022";
		this.meldezeitraumBis = "31.03.2022";
	}
	
	
	public String getMeldezeitraum() {
		return meldezeitraum;
	}
	public void setMeldezeitraum(String meldezeitraum) {
		this.meldezeitraum = meldezeitraum;
	}	
	public String getMeldezeitraumVon() {
		return meldezeitraumVon;
	}
	public void setMeldezeitraumVom(String meldezeitraumVon) {
		this.meldezeitraumVon = meldezeitraumVon;
	}
	public String getMeldezeitraumBis() {
		return meldezeitraumBis;
	}
	public void setMeldezeitraumBis(String meldezeitraumBis) {
		this.meldezeitraumBis = meldezeitraumBis;
	}
	public boolean isZeigeMeldezeitraumDetail() {
		return zeigeMeldezeitraumDetail;
	}
	public void setZeigeMeldezeitraumDetail(boolean zeigeMeldezeitraumDetail) {
		this.zeigeMeldezeitraumDetail = zeigeMeldezeitraumDetail;
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
