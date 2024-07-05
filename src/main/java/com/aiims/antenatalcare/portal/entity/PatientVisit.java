package com.aiims.antenatalcare.portal.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "patient_visit")
public class PatientVisit {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "visit_count")
    private int visitCount;
    @Column
    private Long historyId;
    @Column
    private LocalDate lmp;
    @Column
    private Integer pog;
    @Column
    private Integer fever;
    @Column
    private Integer rash;
    @Column
    private Integer bleeding;
    @Column
    private Integer painAbdomen;
    @Column
    private Integer drugIntake;
    @Column
    private String details;
    @Column
    private Integer smoking;
    @Column
    private Integer alcohol;
    @Column
    private Integer tobaccoIntake;
    @Column
    private Integer caffineIntake;
    @Column
    private Integer intimatePartner;
    @Column
    private Integer vomiting;
    @Column
    private Integer violence;
    @Column
    private String pedalEdema;
    @Column
    private Integer edema;
    @Column
    private String otherDetails;
    @Column
    private String pallor;
    @Column
    private String icterus;
    @Column
    private String clubbing;
    @Column
    private String cyanosis;
    @Column
    private String lymphadenpathy;
    @Column
    private Integer height;
    @Column
    private Integer weight;
    @Column
    private Integer bmi;
    @Column
    private Integer pulseRate;
    @Column
    private Integer systolic;
    @Column
    private Integer diastolic;
    @Column
    private Integer mean;
    @Column
    private Integer rr;
    @Column
    private Integer temperature;
    @Column
    private String proteinuria;
    @Column
    private String chestcvs;
    @Column
    private Integer pa;
    @Column
    private String othersD;
    @Column
    private String womanBloodGroup;
    @Column
    private String wBGroup;
    @Column
    private String aboRh;
    @Column
    private String husBloodGroup;
    @Column
    private String husBGroup;
    @Column
    private String ict;
    @Column
    private String ictValue;
    @Column
    private String hemogram;
    @Column
    private Integer hb;
    @Column
    private String hbValue;
    @Column
    private String tsh;
    @Column
    private Integer tshValue;
    @Column
    private String tshRefer;
    @Column(length=16)
    private String hiv;
    @Column
    private String hivRefer;
    @Column(length=16)
    private String hbsag;
    @Column
    private String hbsagRefer;
    @Column(length=16)
    private String vdrl;
    @Column(length=16)
    private String vdrlRefer;
    @Column
    private String urinerm;
    @Column(length=16)
    private String urinermRefer;
    @Column(length=16)
    private String urinecs;
    @Column(length=16)
    private String urinecsRefer;
    @Column(length=16)
    private String ntNbScan;
    @Column(length=16)
    private String ntNbCrl;
    @Column(length=16)
    private String ntNbNt;
    @Column
    private String ntNbCentile;
    @Column
    private String ntNbOthers;
    @Column
    private String ntNbScanRefer;
    @Column
    private String dualScreen;
    @Column
    private String dualRefer;
    @Column
    private String dualPapp;
    @Column
    private String dualBhcg;
    @Column
    private String genAdvice;
    @Column
    private String general;
    @Column
    private String nutrition;
    @Column
    private String advMedicine;
    @Column
    private String bSugar;
    @Column
    private Integer bFasting;
    @Column
    private Integer bPp;
    @Column
    private String gttGlucose;
    @Column
    private Integer gttFasting;
    @Column
    private Integer gtt1hr;
    @Column
    private Integer gtt2hr;
    @Column
    private Integer othersCheck;
    @Column
    private String heartBurnValue;
    @Column
    private String legCrampsValue;
    @Column
    private String lowBackpainValue;
    @Column
    private String constipationValue;
    @Column
    private String vvOedemaValue;
    @Column
    private String nVomitingValue;
    @Column
    private Integer legCramps;
    @Column
    private Integer heartBurn;
    @Column
    private Integer lowBackpain;
    @Column
    private Integer constipation;
    @Column
    private Integer vvOedema;
    @Column
    private Integer nVomiting;
    @Column
    private String advice;
    @Column
    private String nutritionalAdvice;
    @Column
    private LocalDate nextVisit;
    @Column
    private LocalDate today;
    @Column
    private String pelvi;
    @Column
    private String hcWeeks;
    @Column
    private String hcCentile;
    @Column
    private String acCm;
    @Column
    private String acWeeks;
    @Column
    private String acCentile;
    @Column
    private String flCm;
    @Column
    private String flWeeks;
    @Column
    private String flCentile;
    @Column
    private String efwCm;
    @Column
    private String efwWeeks;
    @Column
    private String efwCentile;
    @Column
    private String liquor;
    @Column
    private String afi;
    @Column
    private String uapi;
    @Column
    private String mcapi;
    @Column
    private String cpr;
    @Column
    private String bpdCm;
    @Column
    private String bpdWeeks;
    @Column
    private String bpdCentile;
    @Column
    private String hcCm;
    @Column
    private String pelvic;
    @Column
    private String usg;
    @Column
    private String modeOfDelivery;
    @Column
    private String laborAnalysis;
    @Column
    private String birth;
    @Column
    private String timing;
    @Column
    private String quadRuple;
    @Column
    private String qrLevelIi;
    @Column
    private String qrNormal;
    @Column
    private String quadRupleOthers;
    @Column
    private String fedalEcho;
    @Column
    private String feOthers;
    @Column
    private String cbcValue;
    @Column
    private String othersText;
    @Column
    private String cbc;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public Long getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Long historyId) {
        this.historyId = historyId;
    }

    public LocalDate getLmp() {
        return lmp;
    }

    public void setLmp(LocalDate lmp) {
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

    public LocalDate getNextVisit() {
        return nextVisit;
    }

    public void setNextVisit(LocalDate nextVisit) {
        this.nextVisit = nextVisit;
    }

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public String getPelvi() {
        return pelvi;
    }

    public void setPelvi(String pelvi) {
        this.pelvi = pelvi;
    }

    public String getHcWeeks() {
        return hcWeeks;
    }

    public void setHcWeeks(String hcWeeks) {
        this.hcWeeks = hcWeeks;
    }

    public String getHcCentile() {
        return hcCentile;
    }

    public void setHcCentile(String hcCentile) {
        this.hcCentile = hcCentile;
    }

    public String getAcCm() {
        return acCm;
    }

    public void setAcCm(String acCm) {
        this.acCm = acCm;
    }

    public String getAcWeeks() {
        return acWeeks;
    }

    public void setAcWeeks(String acWeeks) {
        this.acWeeks = acWeeks;
    }

    public String getAcCentile() {
        return acCentile;
    }

    public void setAcCentile(String acCentile) {
        this.acCentile = acCentile;
    }

    public String getFlCm() {
        return flCm;
    }

    public void setFlCm(String flCm) {
        this.flCm = flCm;
    }

    public String getFlWeeks() {
        return flWeeks;
    }

    public void setFlWeeks(String flWeeks) {
        this.flWeeks = flWeeks;
    }

    public String getFlCentile() {
        return flCentile;
    }

    public void setFlCentile(String flCentile) {
        this.flCentile = flCentile;
    }

    public String getEfwCm() {
        return efwCm;
    }

    public void setEfwCm(String efwCm) {
        this.efwCm = efwCm;
    }

    public String getEfwWeeks() {
        return efwWeeks;
    }

    public void setEfwWeeks(String efwWeeks) {
        this.efwWeeks = efwWeeks;
    }

    public String getEfwCentile() {
        return efwCentile;
    }

    public void setEfwCentile(String efwCentile) {
        this.efwCentile = efwCentile;
    }

    public String getLiquor() {
        return liquor;
    }

    public void setLiquor(String liquor) {
        this.liquor = liquor;
    }

    public String getAfi() {
        return afi;
    }

    public void setAfi(String afi) {
        this.afi = afi;
    }

    public String getUapi() {
        return uapi;
    }

    public void setUapi(String uapi) {
        this.uapi = uapi;
    }

    public String getMcapi() {
        return mcapi;
    }

    public void setMcapi(String mcapi) {
        this.mcapi = mcapi;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getBpdCm() {
        return bpdCm;
    }

    public void setBpdCm(String bpdCm) {
        this.bpdCm = bpdCm;
    }

    public String getBpdWeeks() {
        return bpdWeeks;
    }

    public void setBpdWeeks(String bpdWeeks) {
        this.bpdWeeks = bpdWeeks;
    }

    public String getBpdCentile() {
        return bpdCentile;
    }

    public void setBpdCentile(String bpdCentile) {
        this.bpdCentile = bpdCentile;
    }

    public String getHcCm() {
        return hcCm;
    }

    public void setHcCm(String hcCm) {
        this.hcCm = hcCm;
    }

    public String getPelvic() {
        return pelvic;
    }

    public void setPelvic(String pelvic) {
        this.pelvic = pelvic;
    }

    public String getUsg() {
        return usg;
    }

    public void setUsg(String usg) {
        this.usg = usg;
    }

    public String getModeOfDelivery() {
        return modeOfDelivery;
    }

    public void setModeOfDelivery(String modeOfDelivery) {
        this.modeOfDelivery = modeOfDelivery;
    }

    public String getLaborAnalysis() {
        return laborAnalysis;
    }

    public void setLaborAnalysis(String laborAnalysis) {
        this.laborAnalysis = laborAnalysis;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getQuadRuple() {
        return quadRuple;
    }

    public void setQuadRuple(String quadRuple) {
        this.quadRuple = quadRuple;
    }

    public String getQrLevelIi() {
        return qrLevelIi;
    }

    public void setQrLevelIi(String qrLevelIi) {
        this.qrLevelIi = qrLevelIi;
    }

    public String getQrNormal() {
        return qrNormal;
    }

    public void setQrNormal(String qrNormal) {
        this.qrNormal = qrNormal;
    }

    public String getQuadRupleOthers() {
        return quadRupleOthers;
    }

    public void setQuadRupleOthers(String quadRupleOthers) {
        this.quadRupleOthers = quadRupleOthers;
    }

    public String getFedalEcho() {
        return fedalEcho;
    }

    public void setFedalEcho(String fedalEcho) {
        this.fedalEcho = fedalEcho;
    }

    public String getFeOthers() {
        return feOthers;
    }

    public void setFeOthers(String feOthers) {
        this.feOthers = feOthers;
    }

    public String getCbcValue() {
        return cbcValue;
    }

    public void setCbcValue(String cbcValue) {
        this.cbcValue = cbcValue;
    }

    public String getOthersText() {
        return othersText;
    }

    public void setOthersText(String othersText) {
        this.othersText = othersText;
    }

    public String getCbc() {
        return cbc;
    }

    public void setCbc(String cbc) {
        this.cbc = cbc;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
