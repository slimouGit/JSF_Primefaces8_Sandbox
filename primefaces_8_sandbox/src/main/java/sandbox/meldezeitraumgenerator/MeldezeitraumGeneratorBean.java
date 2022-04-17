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
	
	
	private String meldezeitraum1;
	private String meldezeitraumVon1;
	private String meldezeitraumBis1;
	public String getMeldezeitraum1() {
		return meldezeitraum1;
	}
	public void setMeldezeitraum1(String meldezeitraum1) {
		this.meldezeitraum1 = meldezeitraum1;
	}	
	public String getMeldezeitraumVon1() {
		return meldezeitraumVon1;
	}
	public void setMeldezeitraumVon1(String meldezeitraumVon1) {
		this.meldezeitraumVon1 = meldezeitraumVon1;
	}
	public String getMeldezeitraumBis1() {
		return meldezeitraumBis1;
	}
	public void setMeldezeitraumBis1(String meldezeitraumBis1) {
		this.meldezeitraumBis1 = meldezeitraumBis1;
	}
	
	
	
	private String meldezeitraum2;
	private String meldezeitraumVon2;
	private String meldezeitraumBis2;
	public String getMeldezeitraum2() {
		return meldezeitraum2;
	}
	public void setMeldezeitraum2(String meldezeitraum2) {
		this.meldezeitraum2 = meldezeitraum2;
	}	
	public String getMeldezeitraumVon2() {
		return meldezeitraumVon2;
	}
	public void setMeldezeitraumVon2(String meldezeitraumVon2) {
		this.meldezeitraumVon2 = meldezeitraumVon2;
	}
	public String getMeldezeitraumBis2() {
		return meldezeitraumBis2;
	}
	public void setMeldezeitraumBis2(String meldezeitraumBis2) {
		this.meldezeitraumBis2 = meldezeitraumBis2;
	}
	
	
	
	private String meldezeitraum3;
	private String meldezeitraumVon3;
	private String meldezeitraumBis3;
	public String getMeldezeitraum3() {
		return meldezeitraum3;
	}
	public void setMeldezeitraum3(String meldezeitraum3) {
		this.meldezeitraum3 = meldezeitraum3;
	}	
	public String getMeldezeitraumVon3() {
		return meldezeitraumVon3;
	}
	public void setMeldezeitraumVon3(String meldezeitraumVon3) {
		this.meldezeitraumVon3 = meldezeitraumVon3;
	}
	public String getMeldezeitraumBis3() {
		return meldezeitraumBis3;
	}
	public void setMeldezeitraumBis3(String meldezeitraumBis3) {
		this.meldezeitraumBis3 = meldezeitraumBis3;
	}	
	
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
	
	public void setzeMeldezeitraum() {
		System.out.println("Meldezeitraum 1 " + this.meldezeitraum1);
		if(null!=this.meldezeitraum1 && !this.meldezeitraum1.isEmpty()) {
			this.meldezeitraumVon1 = "01.02.2022";
			this.meldezeitraumBis1 = "28.02.2022";
		}else {
			this.meldezeitraumVon1 = "";
			this.meldezeitraumBis1 = "";
		}
		System.out.println("Meldezeitraum 2 " + this.meldezeitraum2);
		if(null!=this.meldezeitraum2 && !this.meldezeitraum2.isEmpty()) {
			this.meldezeitraumVon2 = "01.02.2022";
			this.meldezeitraumBis2 = "28.02.2022";
		}else {
			this.meldezeitraumVon2 = "";
			this.meldezeitraumBis2 = "";
		}
		System.out.println("Meldezeitraum 3 " + this.meldezeitraum3);
		if(null!=this.meldezeitraum3 && !this.meldezeitraum3.isEmpty()) {
			this.meldezeitraumVon3 = "01.02.2022";
			this.meldezeitraumBis3 = "28.02.2022";
		}else {
			this.meldezeitraumVon3 = "";
			this.meldezeitraumBis3 = "";
		}
	}
	
	
	private boolean zeigeMeldezeitraumDetail_1;	
	public void toggleMeldezeitraumDetail_1() {		
		this.zeigeMeldezeitraumDetail_1 ^= true;
		System.out.println("Meldezeitraum T 1 " + this.meldezeitraum1);		
	}
	public boolean isZeigeMeldezeitraumDetail_1() {
		return zeigeMeldezeitraumDetail_1;
	}
	
	
	private boolean zeigeMeldezeitraumDetail_2;
	public void toggleMeldezeitraumDetail_2() {
		this.zeigeMeldezeitraumDetail_2 ^= true;
		System.out.println("Meldezeitraum T 2 " + this.meldezeitraum2);
	}
	public boolean isZeigeMeldezeitraumDetail_2() {
		return zeigeMeldezeitraumDetail_2;
	}
	
	
	private boolean zeigeMeldezeitraumDetail_3;
	public void toggleMeldezeitraumDetail_3() {
		this.zeigeMeldezeitraumDetail_3 ^= true;
		System.out.println("Meldezeitraum T 3 " + this.meldezeitraum3);
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
