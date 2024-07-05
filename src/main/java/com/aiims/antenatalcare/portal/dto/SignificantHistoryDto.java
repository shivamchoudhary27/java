package com.aiims.antenatalcare.portal.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class SignificantHistoryDto {
    private Long id;

    private int visitCount;
    private Long historyId;

    private String lmp;

    private Integer pog;

    private Integer fever;

    private Integer rash;
    private Integer bleeding;


    private Integer painAbdomen;


    private Integer drugIntake;


    private String details;


    private Integer smoking;


    private Integer alcohol;


    private Integer tobaccoIntake;


    private Integer caffineIntake;


    private Integer intimatePartner;


    private Integer vomiting;


    private Integer violence;


    private String pedalEdema;


    private Integer edema;


    private String otherDetails;


    private String pallor;


    private String icterus;


    private String clubbing;


    private String cyanosis;


    private String lymphadenpathy;


    private Integer height;


    private Integer weight;


    private Integer bmi;

    private Integer pulseRate;


    private Integer systolic;


    private Integer diastolic;


    private Integer mean;


    private Integer rr;


    private Integer temperature;


    private String proteinuria;


    private String chestcvs;


    private Integer pa;


    private String othersD;


    private String womanBloodGroup;


    private String wBGroup;


    private String aboRh;


    private String husBloodGroup;


    private String husBGroup;


    private String ict;


    private String ictValue;


    private String hemogram;


    private Integer hb;

    private String hbValue;

    private String tsh;

    private Integer tshValue;


    private String tshRefer;


    private String hiv;


    private String hivRefer;


    private String hbsag;


    private String hbsagRefer;


    private String vdrl;

    private String vdrlRefer;


    private String urinerm;


    private String urinermRefer;


    private String urinecs;


    private String urinecsRefer;


    private String ntNbScan;


    private String ntNbCrl;


    private String ntNbNt;


    private String ntNbCentile;


    private String ntNbOthers;


    private String ntNbScanRefer;

    private String dualScreen;


    private String dualRefer;


    private String dualPapp;


    private String dualBhcg;


    private String genAdvice;


    private String general;

    private String nutrition;


    private String advMedicine;


    private String bSugar;


    private Integer bFasting;


    private Integer bPp;


    private String gttGlucose;

    private Integer gttFasting;


    private Integer gtt1hr;


    private Integer gtt2hr;

    private Integer othersCheck;


    private String heartBurnValue;


    private String legCrampsValue;


    private String lowBackpainValue;


    private String constipationValue;


    private String vvOedemaValue;


    private String nVomitingValue;


    private Integer legCramps;


    private Integer heartBurn;


    private Integer lowBackpain;

    private Integer constipation;

    private Integer vvOedema;


    private Integer nVomiting;


    private String advice;


    private String nutritionalAdvice;


    private String nextVisit;

    private String today;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLmp() {
        return lmp;
    }

    public void setLmp(String lmp) {
        this.lmp = lmp;
    }

    public Integer getPog() {
        return pog;
    }

    public void setPog(Integer pog) {
        this.pog = pog;
    }

    public Integer getFever() {
        return fever;
    }

    public void setFever(Integer fever) {
        this.fever = fever;
    }

    public Integer getRash() {
        return rash;
    }

    public void setRash(Integer rash) {
        this.rash = rash;
    }

    public Integer getBleeding() {
        return bleeding;
    }

    public void setBleeding(Integer bleeding) {
        this.bleeding = bleeding;
    }

    public Integer getPainAbdomen() {
        return painAbdomen;
    }

    public void setPainAbdomen(Integer painAbdomen) {
        this.painAbdomen = painAbdomen;
    }

    public Integer getDrugIntake() {
        return drugIntake;
    }

    public void setDrugIntake(Integer drugIntake) {
        this.drugIntake = drugIntake;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getSmoking() {
        return smoking;
    }

    public void setSmoking(Integer smoking) {
        this.smoking = smoking;
    }

    public Integer getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Integer alcohol) {
        this.alcohol = alcohol;
    }

    public Integer getTobaccoIntake() {
        return tobaccoIntake;
    }

    public void setTobaccoIntake(Integer tobaccoIntake) {
        this.tobaccoIntake = tobaccoIntake;
    }

    public Integer getCaffineIntake() {
        return caffineIntake;
    }

    public void setCaffineIntake(Integer caffineIntake) {
        this.caffineIntake = caffineIntake;
    }

    public Integer getIntimatePartner() {
        return intimatePartner;
    }

    public void setIntimatePartner(Integer intimatePartner) {
        this.intimatePartner = intimatePartner;
    }

    public Integer getVomiting() {
        return vomiting;
    }

    public void setVomiting(Integer vomiting) {
        this.vomiting = vomiting;
    }

    public Integer getViolence() {
        return violence;
    }

    public void setViolence(Integer violence) {
        this.violence = violence;
    }

    public String getPedalEdema() {
        return pedalEdema;
    }

    public void setPedalEdema(String pedalEdema) {
        this.pedalEdema = pedalEdema;
    }

    public Integer getEdema() {
        return edema;
    }

    public void setEdema(Integer edema) {
        this.edema = edema;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    public String getPallor() {
        return pallor;
    }

    public void setPallor(String pallor) {
        this.pallor = pallor;
    }

    public String getIcterus() {
        return icterus;
    }

    public void setIcterus(String icterus) {
        this.icterus = icterus;
    }

    public String getClubbing() {
        return clubbing;
    }

    public void setClubbing(String clubbing) {
        this.clubbing = clubbing;
    }

    public String getCyanosis() {
        return cyanosis;
    }

    public void setCyanosis(String cyanosis) {
        this.cyanosis = cyanosis;
    }

    public String getLymphadenpathy() {
        return lymphadenpathy;
    }

    public void setLymphadenpathy(String lymphadenpathy) {
        this.lymphadenpathy = lymphadenpathy;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getBmi() {
        return bmi;
    }

    public void setBmi(Integer bmi) {
        this.bmi = bmi;
    }

    public Integer getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(Integer pulseRate) {
        this.pulseRate = pulseRate;
    }

    public Integer getSystolic() {
        return systolic;
    }

    public void setSystolic(Integer systolic) {
        this.systolic = systolic;
    }

    public Integer getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(Integer diastolic) {
        this.diastolic = diastolic;
    }

    public Integer getMean() {
        return mean;
    }

    public void setMean(Integer mean) {
        this.mean = mean;
    }

    public Integer getRr() {
        return rr;
    }

    public void setRr(Integer rr) {
        this.rr = rr;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public String getProteinuria() {
        return proteinuria;
    }

    public void setProteinuria(String proteinuria) {
        this.proteinuria = proteinuria;
    }

    public String getChestcvs() {
        return chestcvs;
    }

    public void setChestcvs(String chestcvs) {
        this.chestcvs = chestcvs;
    }

    public Integer getPa() {
        return pa;
    }

    public void setPa(Integer pa) {
        this.pa = pa;
    }

    public String getOthersD() {
        return othersD;
    }

    public void setOthersD(String othersD) {
        this.othersD = othersD;
    }

    public String getWomanBloodGroup() {
        return womanBloodGroup;
    }

    public void setWomanBloodGroup(String womanBloodGroup) {
        this.womanBloodGroup = womanBloodGroup;
    }

    public String getwBGroup() {
        return wBGroup;
    }

    public void setwBGroup(String wBGroup) {
        this.wBGroup = wBGroup;
    }

    public String getAboRh() {
        return aboRh;
    }

    public void setAboRh(String aboRh) {
        this.aboRh = aboRh;
    }

    public String getHusBloodGroup() {
        return husBloodGroup;
    }

    public void setHusBloodGroup(String husBloodGroup) {
        this.husBloodGroup = husBloodGroup;
    }

    public String getHusBGroup() {
        return husBGroup;
    }

    public void setHusBGroup(String husBGroup) {
        this.husBGroup = husBGroup;
    }

    public String getIct() {
        return ict;
    }

    public void setIct(String ict) {
        this.ict = ict;
    }

    public String getIctValue() {
        return ictValue;
    }

    public void setIctValue(String ictValue) {
        this.ictValue = ictValue;
    }

    public String getHemogram() {
        return hemogram;
    }

    public void setHemogram(String hemogram) {
        this.hemogram = hemogram;
    }

    public Integer getHb() {
        return hb;
    }

    public void setHb(Integer hb) {
        this.hb = hb;
    }

    public String getHbValue() {
        return hbValue;
    }

    public void setHbValue(String hbValue) {
        this.hbValue = hbValue;
    }

    public String getTsh() {
        return tsh;
    }

    public void setTsh(String tsh) {
        this.tsh = tsh;
    }

    public Integer getTshValue() {
        return tshValue;
    }

    public void setTshValue(Integer tshValue) {
        this.tshValue = tshValue;
    }

    public String getTshRefer() {
        return tshRefer;
    }

    public void setTshRefer(String tshRefer) {
        this.tshRefer = tshRefer;
    }

    public String getHiv() {
        return hiv;
    }

    public void setHiv(String hiv) {
        this.hiv = hiv;
    }

    public String getHivRefer() {
        return hivRefer;
    }

    public void setHivRefer(String hivRefer) {
        this.hivRefer = hivRefer;
    }

    public String getHbsag() {
        return hbsag;
    }

    public void setHbsag(String hbsag) {
        this.hbsag = hbsag;
    }

    public String getHbsagRefer() {
        return hbsagRefer;
    }

    public void setHbsagRefer(String hbsagRefer) {
        this.hbsagRefer = hbsagRefer;
    }

    public String getVdrl() {
        return vdrl;
    }

    public void setVdrl(String vdrl) {
        this.vdrl = vdrl;
    }

    public String getVdrlRefer() {
        return vdrlRefer;
    }

    public void setVdrlRefer(String vdrlRefer) {
        this.vdrlRefer = vdrlRefer;
    }

    public String getUrinerm() {
        return urinerm;
    }

    public void setUrinerm(String urinerm) {
        this.urinerm = urinerm;
    }

    public String getUrinermRefer() {
        return urinermRefer;
    }

    public void setUrinermRefer(String urinermRefer) {
        this.urinermRefer = urinermRefer;
    }

    public String getUrinecs() {
        return urinecs;
    }

    public void setUrinecs(String urinecs) {
        this.urinecs = urinecs;
    }

    public String getUrinecsRefer() {
        return urinecsRefer;
    }

    public void setUrinecsRefer(String urinecsRefer) {
        this.urinecsRefer = urinecsRefer;
    }

    public String getNtNbScan() {
        return ntNbScan;
    }

    public void setNtNbScan(String ntNbScan) {
        this.ntNbScan = ntNbScan;
    }

    public String getNtNbCrl() {
        return ntNbCrl;
    }

    public void setNtNbCrl(String ntNbCrl) {
        this.ntNbCrl = ntNbCrl;
    }

    public String getNtNbNt() {
        return ntNbNt;
    }

    public void setNtNbNt(String ntNbNt) {
        this.ntNbNt = ntNbNt;
    }

    public String getNtNbCentile() {
        return ntNbCentile;
    }

    public void setNtNbCentile(String ntNbCentile) {
        this.ntNbCentile = ntNbCentile;
    }

    public String getNtNbOthers() {
        return ntNbOthers;
    }

    public void setNtNbOthers(String ntNbOthers) {
        this.ntNbOthers = ntNbOthers;
    }

    public String getNtNbScanRefer() {
        return ntNbScanRefer;
    }

    public void setNtNbScanRefer(String ntNbScanRefer) {
        this.ntNbScanRefer = ntNbScanRefer;
    }

    public String getDualScreen() {
        return dualScreen;
    }

    public void setDualScreen(String dualScreen) {
        this.dualScreen = dualScreen;
    }

    public String getDualRefer() {
        return dualRefer;
    }

    public void setDualRefer(String dualRefer) {
        this.dualRefer = dualRefer;
    }

    public String getDualPapp() {
        return dualPapp;
    }

    public void setDualPapp(String dualPapp) {
        this.dualPapp = dualPapp;
    }

    public String getDualBhcg() {
        return dualBhcg;
    }

    public void setDualBhcg(String dualBhcg) {
        this.dualBhcg = dualBhcg;
    }

    public String getGenAdvice() {
        return genAdvice;
    }

    public void setGenAdvice(String genAdvice) {
        this.genAdvice = genAdvice;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

    public String getNutrition() {
        return nutrition;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    public String getAdvMedicine() {
        return advMedicine;
    }

    public void setAdvMedicine(String advMedicine) {
        this.advMedicine = advMedicine;
    }

    public String getbSugar() {
        return bSugar;
    }

    public void setbSugar(String bSugar) {
        this.bSugar = bSugar;
    }

    public Integer getbFasting() {
        return bFasting;
    }

    public void setbFasting(Integer bFasting) {
        this.bFasting = bFasting;
    }

    public Integer getbPp() {
        return bPp;
    }

    public void setbPp(Integer bPp) {
        this.bPp = bPp;
    }

    public String getGttGlucose() {
        return gttGlucose;
    }

    public void setGttGlucose(String gttGlucose) {
        this.gttGlucose = gttGlucose;
    }

    public Integer getGttFasting() {
        return gttFasting;
    }

    public void setGttFasting(Integer gttFasting) {
        this.gttFasting = gttFasting;
    }

    public Integer getGtt1hr() {
        return gtt1hr;
    }

    public void setGtt1hr(Integer gtt1hr) {
        this.gtt1hr = gtt1hr;
    }

    public Integer getGtt2hr() {
        return gtt2hr;
    }

    public void setGtt2hr(Integer gtt2hr) {
        this.gtt2hr = gtt2hr;
    }

    public Integer getOthersCheck() {
        return othersCheck;
    }

    public void setOthersCheck(Integer othersCheck) {
        this.othersCheck = othersCheck;
    }

    public String getHeartBurnValue() {
        return heartBurnValue;
    }

    public void setHeartBurnValue(String heartBurnValue) {
        this.heartBurnValue = heartBurnValue;
    }

    public String getLegCrampsValue() {
        return legCrampsValue;
    }

    public void setLegCrampsValue(String legCrampsValue) {
        this.legCrampsValue = legCrampsValue;
    }

    public String getLowBackpainValue() {
        return lowBackpainValue;
    }

    public void setLowBackpainValue(String lowBackpainValue) {
        this.lowBackpainValue = lowBackpainValue;
    }

    public String getConstipationValue() {
        return constipationValue;
    }

    public void setConstipationValue(String constipationValue) {
        this.constipationValue = constipationValue;
    }

    public String getVvOedemaValue() {
        return vvOedemaValue;
    }

    public void setVvOedemaValue(String vvOedemaValue) {
        this.vvOedemaValue = vvOedemaValue;
    }

    public String getnVomitingValue() {
        return nVomitingValue;
    }

    public void setnVomitingValue(String nVomitingValue) {
        this.nVomitingValue = nVomitingValue;
    }

    public Integer getLegCramps() {
        return legCramps;
    }

    public void setLegCramps(Integer legCramps) {
        this.legCramps = legCramps;
    }

    public Integer getHeartBurn() {
        return heartBurn;
    }

    public void setHeartBurn(Integer heartBurn) {
        this.heartBurn = heartBurn;
    }

    public Integer getLowBackpain() {
        return lowBackpain;
    }

    public void setLowBackpain(Integer lowBackpain) {
        this.lowBackpain = lowBackpain;
    }

    public Integer getConstipation() {
        return constipation;
    }

    public void setConstipation(Integer constipation) {
        this.constipation = constipation;
    }

    public Integer getVvOedema() {
        return vvOedema;
    }

    public void setVvOedema(Integer vvOedema) {
        this.vvOedema = vvOedema;
    }

    public Integer getnVomiting() {
        return nVomiting;
    }

    public void setnVomiting(Integer nVomiting) {
        this.nVomiting = nVomiting;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getNutritionalAdvice() {
        return nutritionalAdvice;
    }

    public void setNutritionalAdvice(String nutritionalAdvice) {
        this.nutritionalAdvice = nutritionalAdvice;
    }

    public String getNextVisit() {
        return nextVisit;
    }

    public void setNextVisit(String nextVisit) {
        this.nextVisit = nextVisit;
    }

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public Long getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Long historyId) {
        this.historyId = historyId;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }
}
