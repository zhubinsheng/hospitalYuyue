package com.score.bean;

public class Hosiptal {
    private String hosname;
    private Integer id;
    private Integer keid;

    public Hosiptal() {
    }

    public Hosiptal(String hosname, Integer id, Integer keid) {
        this.hosname = hosname;
        this.id = id;
        this.keid = keid;
    }

    public String getHosname() {
        return hosname;
    }

    public void setHosname(String hosname) {
        this.hosname = hosname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKeid() {
        return keid;
    }

    public void setKeid(Integer keid) {
        this.keid = keid;
    }
}
