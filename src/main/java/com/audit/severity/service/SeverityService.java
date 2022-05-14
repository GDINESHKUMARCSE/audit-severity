package com.audit.severity.service;

import org.springframework.stereotype.Service;

import com.audit.severity.model.AuditQuestion;
import com.audit.severity.model.AuditRequest;
import com.audit.severity.model.AuditResponse;

@Service
public class SeverityService {
	
	public AuditResponse getProjectExecutionStatus(AuditRequest auditRequest) {
		int noCount = 0;
		int acceptableNos = 3;
		for(AuditQuestion question: auditRequest.getAuditDetails().getAuditQuestions()) {
			if (question.getResponse().equalsIgnoreCase("No"))
				noCount += 1;
		}
		AuditResponse response = new AuditResponse();
		response.setOwnerName(auditRequest.getOwnerName());
		response.setManagerName(auditRequest.getManagerName());
		response.setProjectName(auditRequest.getProjectName());
		response.setAuditType(auditRequest.getAuditDetails().getAuditType());
		response.setAuditDate(auditRequest.getAuditDetails().getAuditDate());
		if (noCount > acceptableNos) {
			response.setExecutionStatus("RED");
			response.setDuration("Action should be taken in 2 weeks");
		} else {
			response.setExecutionStatus("GREEN");
			response.setDuration("No Action requried");
		}
		return response;
	}

}
