package com.webprojekti.webprojekti;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="hadcrut_5_0_1_0_analysis_summary_series_global_monthly__1__1")
public class Dataset {

    
    
    @Id
    @Column(name ="col1")
    private String time;
    @Column(name ="col2")
    private String anomalyc;
    @Column(name ="col3")
    private String lowerconlim;
    @Column(name="col4")
    private String upperconlim;
    
   
  
    public Dataset(){}


    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAnomalydeg() {
        return this.anomalyc;
    }

    public void setAnomalydeg(String anomalyc) {
        this.anomalyc = anomalyc;
    }

    public String getLowerconlim() {
        return this.lowerconlim;
    }

    public void setLowerconlim(String lowerconlim) {
        this.lowerconlim = lowerconlim;
    }

    public String getUpperconlim() {
        return this.upperconlim;
    }

    public void setUpperconlim(String upperconlim) {
        this.upperconlim = upperconlim;
    }

}
