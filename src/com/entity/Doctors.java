package com.entity;

public class Doctors 
{
	private int Did;
    private String Dname;
    private String Address;
    private String Qualification;
    private int Experience;
    private String Specilization;
    public Doctors()
    {
    	
    }
    public Doctors(int did, String dname, String address, String qualification, int experience,
			String specilization) {
		super();
		Did = did;
		Dname = dname;
		Address = address;
		Qualification = qualification;
		Experience = experience;
		Specilization = specilization;
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		Experience = experience;
	}
	public String getSpecilization() {
		return Specilization;
	}
	public void setSpecilization(String specilization) {
		Specilization = specilization;
	}
	@Override
	public String toString() {
		return "Doctors [Did=" + Did + ", Dname=" + Dname + ", Address=" + Address + ", Qualification=" + Qualification
				+ ", Experience=" + Experience + ", Specilization=" + Specilization + "]";
	}
    
}