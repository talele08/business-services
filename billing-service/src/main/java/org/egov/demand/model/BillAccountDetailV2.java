package org.egov.demand.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

/**
 * BillAccountDetail
 */

@Data
@Builder
public class BillAccountDetailV2   {
	
  @JsonProperty("id")
  private String id;

  @JsonProperty("tenantId")
  private String tenantId;

  @JsonProperty("billDetail")
  private String billDetail;

  @JsonProperty("demandDetailId")
  private String demandDetailId;

  @JsonProperty("order")
  private Integer order;

  @JsonProperty("amount")
  private BigDecimal amount;
  
  @JsonProperty("adjustedAmount")
  private BigDecimal adjustedAmount;

  @JsonProperty("taxHeadCode")
  private String taxHeadCode;

  @JsonProperty("additionalDetails")
  private Object additionalDetails;

  @JsonProperty("auditDetails")
  private AuditDetails auditDetails;
}

