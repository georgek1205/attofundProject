package com.example.demo.employee;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Employee {

    @Id
    private String id;
    private String name;
    private String surName;
    private String middleName;
    private String nickName;
    private String socialId;
    private String socialIdType;
    private String empTin;
    private String address;
    private Date birthdate;
    private Character gender;
    private String contactTel;
    private String contactEm;
    private String occupation;
    private Long totalSvcRen;
    private Boolean isMarried;
    private Boolean isDisabled;
    private String bankNm;
    private String bankAccNo;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getSocialId() {
        return socialId;
    }

    public String getSocialIdType() {
        return socialIdType;
    }

    public String getEmpTin() {
        return empTin;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public Character getGender() {
        return gender;
    }

    public String getContactTel() {
        return contactTel;
    }

    public String getContactEm() {
        return contactEm;
    }

    public String getOccupation() {
        return occupation;
    }

    public Long getTotalSvcRen() {
        return totalSvcRen;
    }

    public Boolean getIsMarried() {
        return isMarried;
    }

    public Boolean getIsDisabled() {
        return isDisabled;
    }

    public String getBankNm() {
        return bankNm;
    }

    public String getBankAccNo() {
        return bankAccNo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setSocialId(String socialId) {
        this.socialId = socialId;
    }

    public void setSocialIdType(String socialIdType) {
        this.socialIdType = socialIdType;
    }

    public void setEmpTin(String empTin) {
        this.empTin = empTin;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public void setContactEm(String contactEm) {
        this.contactEm = contactEm;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setTotalSvcRen(Long totalSvcRen) {
        this.totalSvcRen = totalSvcRen;
    }

    public void setIsMarried(Boolean married) {
        isMarried = married;
    }

    public void setIsDisabled(Boolean disabled) {
        isDisabled = disabled;
    }

    public void setBankNm(String bankNm) {
        this.bankNm = bankNm;
    }

    public void setBankAccNo(String bankAccNo) {
        this.bankAccNo = bankAccNo;
    }
}
