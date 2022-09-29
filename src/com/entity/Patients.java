package com.entity;

import java.sql.Date;

public class Patients 
{
	private int pid;
    private String pname;
    private String Gender;
    private String Disease;
    private Date AdmitDate;
    private int Did;
    private String Dname;
    private Date DischargeDate;
    public Patients()
    {
    	
    }
	public Patients(int pid, String pname, String gender, String disease, Date admitDate, int did, String dname,
			Date dischargeDate) {
		super();
		this.pid = pid;
		this.pname = pname;
		Gender = gender;
		Disease = disease;
		AdmitDate = admitDate;
		Did = did;
		Dname = dname;
		DischargeDate = dischargeDate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDisease() {
		return Disease;
	}
	public void setDisease(String disease) {
		Disease = disease;
	}
	public Date getAdmitDate() {
		return AdmitDate;
	}
	public void setAdmitDate(Date admitDate) {
		AdmitDate = admitDate;
	}
	public int getDid() {
		return Did;
	}
	public void setDid(int did) {
		Did = did;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public Date getDischargeDate() {
		return DischargeDate;
	}
	public void setDischargeDate(Date dischargeDate) {
		DischargeDate = dischargeDate;
	}
	@Override
	public String toString() {
		return "Patients [pid=" + pid + ", pname=" + pname + ", Gender=" + Gender + ", Disease=" + Disease
				+ ", AdmitDate=" + AdmitDate + ", Did=" + Did + ", Dname=" + Dname + ", DischargeDate=" + DischargeDate
				+ "]";
	}

}
