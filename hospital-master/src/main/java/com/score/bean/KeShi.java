package com.score.bean;

public class KeShi {
    private String kename;
    private Integer id;
    private String keid;
    private String huid;

    public KeShi() {
    }

    public KeShi(String kename, Integer id, String keid, String huid) {
        this.kename = kename;
        this.id = id;
        this.keid = keid;
        this.huid = huid;
    }

    public String getKename() {
        return kename;
    }

    public void setKename(String kename) {
        this.kename = kename;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeid() {
        return keid;
    }

    public void setKeid(String keid) {
        this.keid = keid;
    }

    public String getHuid() {
        return huid;
    }

    public void setHuid(String huid) {
        this.huid = huid;
    }
}
