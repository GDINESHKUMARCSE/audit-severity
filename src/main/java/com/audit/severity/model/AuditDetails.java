package com.audit.severity.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Table(name = "auditdetail")
public class AuditDetails {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "AuditId")
	private int auditId;
//	@Column(name = "AuditType")
	private String auditType;
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name = "auditdate")
	private Date auditDate;
	
	private List<AuditQuestion> auditQuestions;

	@PrePersist
	protected void onCreate() {
		auditDate = new Date();
	}

	public int getAuditId() {
		return auditId;
	}

	public void setAuditId(int auditId) {
		this.auditId = auditId;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public Date getAuditDate() {
		return auditDate;
	}

	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}

	public List<AuditQuestion> getAuditQuestions() {
		return auditQuestions;
	}

	public void setAuditQuestions(List<AuditQuestion> auditQuestions) {
		this.auditQuestions = auditQuestions;
	}

	@Override
	public String toString() {
		return "AuditDetails [auditId=" + auditId + ", auditType=" + auditType + ", auditDate=" + auditDate
				+ ", auditQuestions=" + auditQuestions + "]";
	}

	
	
}
