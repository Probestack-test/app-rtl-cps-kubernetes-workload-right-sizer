package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.Recommendation;
import com.probestack.forgestudio.design.model.WorkloadCurrentResources;
import com.probestack.forgestudio.design.model.WorkloadUsage;
import com.probestack.forgestudio.design.model.WorkloadUsageHistoryInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Workload
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class Workload {

  private UUID workloadId;

  private String workloadName;

  private String namespace;

  private String clusterName;

  /**
   * Gets or Sets workloadType
   */
  public enum WorkloadTypeEnum {
    DEPLOYMENT("DEPLOYMENT"),
    
    STATEFULSET("STATEFULSET"),
    
    DAEMONSET("DAEMONSET"),
    
    CRONJOB("CRONJOB"),
    
    JOB("JOB");

    private String value;

    WorkloadTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WorkloadTypeEnum fromValue(String value) {
      for (WorkloadTypeEnum b : WorkloadTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private WorkloadTypeEnum workloadType;

  private String containerName;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    MONITORING("MONITORING"),
    
    ANALYZING("ANALYZING"),
    
    RECOMMENDATION_READY("RECOMMENDATION_READY"),
    
    APPLIED("APPLIED"),
    
    PAUSED("PAUSED"),
    
    ERROR("ERROR");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StatusEnum status;

  private String owner;

  /**
   * Gets or Sets criticality
   */
  public enum CriticalityEnum {
    _0("TIER_0"),
    
    _1("TIER_1"),
    
    _2("TIER_2"),
    
    _3("TIER_3");

    private String value;

    CriticalityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CriticalityEnum fromValue(String value) {
      for (CriticalityEnum b : CriticalityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private CriticalityEnum criticality;

  private Integer analysisWindowDays;

  /**
   * Auto-detected from historical usage.
   */
  public enum DetectedWorkloadPatternEnum {
    STEADY("STEADY"),
    
    PERIODIC("PERIODIC"),
    
    SPIKY("SPIKY"),
    
    BATCH("BATCH"),
    
    SEASONAL("SEASONAL"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    DetectedWorkloadPatternEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DetectedWorkloadPatternEnum fromValue(String value) {
      for (DetectedWorkloadPatternEnum b : DetectedWorkloadPatternEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private DetectedWorkloadPatternEnum detectedWorkloadPattern;

  private WorkloadCurrentResources currentResources;

  private WorkloadUsage usage;

  private Recommendation recommendation;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime analysisWindowStart;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime analysisWindowEnd;

  @Valid
  private List<@Valid WorkloadUsageHistoryInner> usageHistory;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastAnalyzedAt;

  private String auditReference;

  public Workload() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Workload(UUID workloadId, String workloadName, String namespace, String clusterName, WorkloadTypeEnum workloadType, String containerName, StatusEnum status, String owner, WorkloadCurrentResources currentResources, OffsetDateTime createdAt) {
    this.workloadId = workloadId;
    this.workloadName = workloadName;
    this.namespace = namespace;
    this.clusterName = clusterName;
    this.workloadType = workloadType;
    this.containerName = containerName;
    this.status = status;
    this.owner = owner;
    this.currentResources = currentResources;
    this.createdAt = createdAt;
  }

  public Workload workloadId(UUID workloadId) {
    this.workloadId = workloadId;
    return this;
  }

  /**
   * Get workloadId
   * @return workloadId
  */
  @NotNull @Valid   @Schema(name = "workloadId", example = "9c8f1a3b-6d7e-4a12-8f5e-123456789abc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("workloadId")
  public UUID getWorkloadId() {
    return workloadId;
  }

  public void setWorkloadId(UUID workloadId) {
    this.workloadId = workloadId;
  }

  public Workload workloadName(String workloadName) {
    this.workloadName = workloadName;
    return this;
  }

  /**
   * Get workloadName
   * @return workloadName
  */
  @NotNull   @Schema(name = "workloadName", example = "payment-processor", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("workloadName")
  public String getWorkloadName() {
    return workloadName;
  }

  public void setWorkloadName(String workloadName) {
    this.workloadName = workloadName;
  }

  public Workload namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
  */
  @NotNull   @Schema(name = "namespace", example = "payments", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public Workload clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * Get clusterName
   * @return clusterName
  */
  @NotNull   @Schema(name = "clusterName", example = "prod-us-east-1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public Workload workloadType(WorkloadTypeEnum workloadType) {
    this.workloadType = workloadType;
    return this;
  }

  /**
   * Get workloadType
   * @return workloadType
  */
  @NotNull   @Schema(name = "workloadType", example = "DEPLOYMENT", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("workloadType")
  public WorkloadTypeEnum getWorkloadType() {
    return workloadType;
  }

  public void setWorkloadType(WorkloadTypeEnum workloadType) {
    this.workloadType = workloadType;
  }

  public Workload containerName(String containerName) {
    this.containerName = containerName;
    return this;
  }

  /**
   * Get containerName
   * @return containerName
  */
  @NotNull   @Schema(name = "containerName", example = "payment-processor", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("containerName")
  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }

  public Workload status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "RECOMMENDATION_READY", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Workload owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @NotNull   @Schema(name = "owner", example = "payments-team", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Workload criticality(CriticalityEnum criticality) {
    this.criticality = criticality;
    return this;
  }

  /**
   * Get criticality
   * @return criticality
  */
    @Schema(name = "criticality", example = "TIER_0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("criticality")
  public CriticalityEnum getCriticality() {
    return criticality;
  }

  public void setCriticality(CriticalityEnum criticality) {
    this.criticality = criticality;
  }

  public Workload analysisWindowDays(Integer analysisWindowDays) {
    this.analysisWindowDays = analysisWindowDays;
    return this;
  }

  /**
   * Get analysisWindowDays
   * @return analysisWindowDays
  */
    @Schema(name = "analysisWindowDays", example = "14", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("analysisWindowDays")
  public Integer getAnalysisWindowDays() {
    return analysisWindowDays;
  }

  public void setAnalysisWindowDays(Integer analysisWindowDays) {
    this.analysisWindowDays = analysisWindowDays;
  }

  public Workload detectedWorkloadPattern(DetectedWorkloadPatternEnum detectedWorkloadPattern) {
    this.detectedWorkloadPattern = detectedWorkloadPattern;
    return this;
  }

  /**
   * Auto-detected from historical usage.
   * @return detectedWorkloadPattern
  */
    @Schema(name = "detectedWorkloadPattern", example = "PERIODIC", description = "Auto-detected from historical usage.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detectedWorkloadPattern")
  public DetectedWorkloadPatternEnum getDetectedWorkloadPattern() {
    return detectedWorkloadPattern;
  }

  public void setDetectedWorkloadPattern(DetectedWorkloadPatternEnum detectedWorkloadPattern) {
    this.detectedWorkloadPattern = detectedWorkloadPattern;
  }

  public Workload currentResources(WorkloadCurrentResources currentResources) {
    this.currentResources = currentResources;
    return this;
  }

  /**
   * Get currentResources
   * @return currentResources
  */
  @NotNull @Valid   @Schema(name = "currentResources", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currentResources")
  public WorkloadCurrentResources getCurrentResources() {
    return currentResources;
  }

  public void setCurrentResources(WorkloadCurrentResources currentResources) {
    this.currentResources = currentResources;
  }

  public Workload usage(WorkloadUsage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
  */
  @Valid   @Schema(name = "usage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usage")
  public WorkloadUsage getUsage() {
    return usage;
  }

  public void setUsage(WorkloadUsage usage) {
    this.usage = usage;
  }

  public Workload recommendation(Recommendation recommendation) {
    this.recommendation = recommendation;
    return this;
  }

  /**
   * Get recommendation
   * @return recommendation
  */
  @Valid   @Schema(name = "recommendation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recommendation")
  public Recommendation getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(Recommendation recommendation) {
    this.recommendation = recommendation;
  }

  public Workload analysisWindowStart(OffsetDateTime analysisWindowStart) {
    this.analysisWindowStart = analysisWindowStart;
    return this;
  }

  /**
   * Get analysisWindowStart
   * @return analysisWindowStart
  */
  @Valid   @Schema(name = "analysisWindowStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("analysisWindowStart")
  public OffsetDateTime getAnalysisWindowStart() {
    return analysisWindowStart;
  }

  public void setAnalysisWindowStart(OffsetDateTime analysisWindowStart) {
    this.analysisWindowStart = analysisWindowStart;
  }

  public Workload analysisWindowEnd(OffsetDateTime analysisWindowEnd) {
    this.analysisWindowEnd = analysisWindowEnd;
    return this;
  }

  /**
   * Get analysisWindowEnd
   * @return analysisWindowEnd
  */
  @Valid   @Schema(name = "analysisWindowEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("analysisWindowEnd")
  public OffsetDateTime getAnalysisWindowEnd() {
    return analysisWindowEnd;
  }

  public void setAnalysisWindowEnd(OffsetDateTime analysisWindowEnd) {
    this.analysisWindowEnd = analysisWindowEnd;
  }

  public Workload usageHistory(List<@Valid WorkloadUsageHistoryInner> usageHistory) {
    this.usageHistory = usageHistory;
    return this;
  }

  public Workload addUsageHistoryItem(WorkloadUsageHistoryInner usageHistoryItem) {
    if (this.usageHistory == null) {
      this.usageHistory = new ArrayList<>();
    }
    this.usageHistory.add(usageHistoryItem);
    return this;
  }

  /**
   * Hourly usage data points (if includeUsageHistory=true).
   * @return usageHistory
  */
  @Valid   @Schema(name = "usageHistory", description = "Hourly usage data points (if includeUsageHistory=true).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usageHistory")
  public List<@Valid WorkloadUsageHistoryInner> getUsageHistory() {
    return usageHistory;
  }

  public void setUsageHistory(List<@Valid WorkloadUsageHistoryInner> usageHistory) {
    this.usageHistory = usageHistory;
  }

  public Workload createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @NotNull @Valid   @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Workload lastAnalyzedAt(OffsetDateTime lastAnalyzedAt) {
    this.lastAnalyzedAt = lastAnalyzedAt;
    return this;
  }

  /**
   * Get lastAnalyzedAt
   * @return lastAnalyzedAt
  */
  @Valid   @Schema(name = "lastAnalyzedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastAnalyzedAt")
  public OffsetDateTime getLastAnalyzedAt() {
    return lastAnalyzedAt;
  }

  public void setLastAnalyzedAt(OffsetDateTime lastAnalyzedAt) {
    this.lastAnalyzedAt = lastAnalyzedAt;
  }

  public Workload auditReference(String auditReference) {
    this.auditReference = auditReference;
    return this;
  }

  /**
   * Get auditReference
   * @return auditReference
  */
    @Schema(name = "auditReference", example = "audit://rightsizer/workload-9c8f1a3b", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditReference")
  public String getAuditReference() {
    return auditReference;
  }

  public void setAuditReference(String auditReference) {
    this.auditReference = auditReference;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workload workload = (Workload) o;
    return Objects.equals(this.workloadId, workload.workloadId) &&
        Objects.equals(this.workloadName, workload.workloadName) &&
        Objects.equals(this.namespace, workload.namespace) &&
        Objects.equals(this.clusterName, workload.clusterName) &&
        Objects.equals(this.workloadType, workload.workloadType) &&
        Objects.equals(this.containerName, workload.containerName) &&
        Objects.equals(this.status, workload.status) &&
        Objects.equals(this.owner, workload.owner) &&
        Objects.equals(this.criticality, workload.criticality) &&
        Objects.equals(this.analysisWindowDays, workload.analysisWindowDays) &&
        Objects.equals(this.detectedWorkloadPattern, workload.detectedWorkloadPattern) &&
        Objects.equals(this.currentResources, workload.currentResources) &&
        Objects.equals(this.usage, workload.usage) &&
        Objects.equals(this.recommendation, workload.recommendation) &&
        Objects.equals(this.analysisWindowStart, workload.analysisWindowStart) &&
        Objects.equals(this.analysisWindowEnd, workload.analysisWindowEnd) &&
        Objects.equals(this.usageHistory, workload.usageHistory) &&
        Objects.equals(this.createdAt, workload.createdAt) &&
        Objects.equals(this.lastAnalyzedAt, workload.lastAnalyzedAt) &&
        Objects.equals(this.auditReference, workload.auditReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workloadId, workloadName, namespace, clusterName, workloadType, containerName, status, owner, criticality, analysisWindowDays, detectedWorkloadPattern, currentResources, usage, recommendation, analysisWindowStart, analysisWindowEnd, usageHistory, createdAt, lastAnalyzedAt, auditReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workload {\n");
    sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
    sb.append("    workloadName: ").append(toIndentedString(workloadName)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
    sb.append("    analysisWindowDays: ").append(toIndentedString(analysisWindowDays)).append("\n");
    sb.append("    detectedWorkloadPattern: ").append(toIndentedString(detectedWorkloadPattern)).append("\n");
    sb.append("    currentResources: ").append(toIndentedString(currentResources)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    analysisWindowStart: ").append(toIndentedString(analysisWindowStart)).append("\n");
    sb.append("    analysisWindowEnd: ").append(toIndentedString(analysisWindowEnd)).append("\n");
    sb.append("    usageHistory: ").append(toIndentedString(usageHistory)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastAnalyzedAt: ").append(toIndentedString(lastAnalyzedAt)).append("\n");
    sb.append("    auditReference: ").append(toIndentedString(auditReference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

