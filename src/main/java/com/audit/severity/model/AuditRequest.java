package com.audit.severity.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Table(name="auditrequest")
public class AuditRequest {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="RequestId")
	private int requestId;
	private AuditDetails auditDetails;
//	@Column(name="ProjectName")
	private String projectName;
//	@Column(name="ManagerName")
	private String managerName;
//	@Column(name="OwnerName")
	private String ownerName;
	
	
	public int getRequestId() {
		return requestId;
	}


	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}


	public AuditDetails getAuditDetails() {
		return auditDetails;
	}


	public void setAuditDetails(AuditDetails auditDetails) {
		this.auditDetails = auditDetails;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getManagerName() {
		return managerName;
	}


	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	@Override
	public String toString() {
		return "AuditRequest [requestId=" + requestId + ", auditDetails=" + auditDetails + ", projectName="
				+ projectName + ", managerName=" + managerName + ", ownerName=" + ownerName + "]";
	}
	
	
}
