package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.RecommendationApplyPostApplyMetrics;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RecommendationApply
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class RecommendationApply {

  private UUID applyId;

  private UUID recommendationId;

  private UUID workloadId;

  /**
   * Gets or Sets mode
   */
  public enum ModeEnum {
    DRY_RUN("DRY_RUN"),
    
    STAGED("STAGED"),
    
    IMMEDIATE("IMMEDIATE");

    private String value;

    ModeEnum(String value) {
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
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ModeEnum mode;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    QUEUED("QUEUED"),
    
    VALIDATING("VALIDATING"),
    
    APPLYING("APPLYING"),
    
    MONITORING("MONITORING"),
    
    COMPLETED("COMPLETED"),
    
    ROLLED_BACK("ROLLED_BACK"),
    
    FAILED("FAILED");

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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startedAt;

  private String completedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime monitoringUntil;

  @Valid
  private Map<String, Object> beforeResources = new HashMap<>();

  @Valid
  private Map<String, Object> afterResources = new HashMap<>();

  private Integer replicasUpdated;

  private Integer replicasTotal;

  private RecommendationApplyPostApplyMetrics postApplyMetrics;

  private String rollbackReason;

  private String error;

  private String appliedBy;

  private String auditReference;

  public RecommendationApply() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RecommendationApply(UUID applyId, UUID recommendationId, UUID workloadId, ModeEnum mode, StatusEnum status, OffsetDateTime startedAt) {
    this.applyId = applyId;
    this.recommendationId = recommendationId;
    this.workloadId = workloadId;
    this.mode = mode;
    this.status = status;
    this.startedAt = startedAt;
  }

  public RecommendationApply applyId(UUID applyId) {
    this.applyId = applyId;
    return this;
  }

  /**
   * Get applyId
   * @return applyId
  */
  @NotNull @Valid   @Schema(name = "applyId", example = "d1a2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("applyId")
  public UUID getApplyId() {
    return applyId;
  }

  public void setApplyId(UUID applyId) {
    this.applyId = applyId;
  }

  public RecommendationApply recommendationId(UUID recommendationId) {
    this.recommendationId = recommendationId;
    return this;
  }

  /**
   * Get recommendationId
   * @return recommendationId
  */
  @NotNull @Valid   @Schema(name = "recommendationId", example = "b1a2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recommendationId")
  public UUID getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(UUID recommendationId) {
    this.recommendationId = recommendationId;
  }

  public RecommendationApply workloadId(UUID workloadId) {
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

  public RecommendationApply mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  */
  @NotNull   @Schema(name = "mode", example = "STAGED", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mode")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public RecommendationApply status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "MONITORING", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public RecommendationApply startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
  */
  @NotNull @Valid   @Schema(name = "startedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startedAt")
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public RecommendationApply completedAt(String completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * Get completedAt
   * @return completedAt
  */
    @Schema(name = "completedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedAt")
  public String getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(String completedAt) {
    this.completedAt = completedAt;
  }

  public RecommendationApply monitoringUntil(OffsetDateTime monitoringUntil) {
    this.monitoringUntil = monitoringUntil;
    return this;
  }

  /**
   * End of auto-rollback monitoring window.
   * @return monitoringUntil
  */
  @Valid   @Schema(name = "monitoringUntil", example = "2026-11-06T14:30Z", description = "End of auto-rollback monitoring window.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monitoringUntil")
  public OffsetDateTime getMonitoringUntil() {
    return monitoringUntil;
  }

  public void setMonitoringUntil(OffsetDateTime monitoringUntil) {
    this.monitoringUntil = monitoringUntil;
  }

  public RecommendationApply beforeResources(Map<String, Object> beforeResources) {
    this.beforeResources = beforeResources;
    return this;
  }

  public RecommendationApply putBeforeResourcesItem(String key, Object beforeResourcesItem) {
    if (this.beforeResources == null) {
      this.beforeResources = new HashMap<>();
    }
    this.beforeResources.put(key, beforeResourcesItem);
    return this;
  }

  /**
   * Get beforeResources
   * @return beforeResources
  */
    @Schema(name = "beforeResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("beforeResources")
  public Map<String, Object> getBeforeResources() {
    return beforeResources;
  }

  public void setBeforeResources(Map<String, Object> beforeResources) {
    this.beforeResources = beforeResources;
  }

  public RecommendationApply afterResources(Map<String, Object> afterResources) {
    this.afterResources = afterResources;
    return this;
  }

  public RecommendationApply putAfterResourcesItem(String key, Object afterResourcesItem) {
    if (this.afterResources == null) {
      this.afterResources = new HashMap<>();
    }
    this.afterResources.put(key, afterResourcesItem);
    return this;
  }

  /**
   * Get afterResources
   * @return afterResources
  */
    @Schema(name = "afterResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("afterResources")
  public Map<String, Object> getAfterResources() {
    return afterResources;
  }

  public void setAfterResources(Map<String, Object> afterResources) {
    this.afterResources = afterResources;
  }

  public RecommendationApply replicasUpdated(Integer replicasUpdated) {
    this.replicasUpdated = replicasUpdated;
    return this;
  }

  /**
   * Get replicasUpdated
   * @return replicasUpdated
  */
    @Schema(name = "replicasUpdated", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("replicasUpdated")
  public Integer getReplicasUpdated() {
    return replicasUpdated;
  }

  public void setReplicasUpdated(Integer replicasUpdated) {
    this.replicasUpdated = replicasUpdated;
  }

  public RecommendationApply replicasTotal(Integer replicasTotal) {
    this.replicasTotal = replicasTotal;
    return this;
  }

  /**
   * Get replicasTotal
   * @return replicasTotal
  */
    @Schema(name = "replicasTotal", example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("replicasTotal")
  public Integer getReplicasTotal() {
    return replicasTotal;
  }

  public void setReplicasTotal(Integer replicasTotal) {
    this.replicasTotal = replicasTotal;
  }

  public RecommendationApply postApplyMetrics(RecommendationApplyPostApplyMetrics postApplyMetrics) {
    this.postApplyMetrics = postApplyMetrics;
    return this;
  }

  /**
   * Get postApplyMetrics
   * @return postApplyMetrics
  */
  @Valid   @Schema(name = "postApplyMetrics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postApplyMetrics")
  public RecommendationApplyPostApplyMetrics getPostApplyMetrics() {
    return postApplyMetrics;
  }

  public void setPostApplyMetrics(RecommendationApplyPostApplyMetrics postApplyMetrics) {
    this.postApplyMetrics = postApplyMetrics;
  }

  public RecommendationApply rollbackReason(String rollbackReason) {
    this.rollbackReason = rollbackReason;
    return this;
  }

  /**
   * Get rollbackReason
   * @return rollbackReason
  */
    @Schema(name = "rollbackReason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rollbackReason")
  public String getRollbackReason() {
    return rollbackReason;
  }

  public void setRollbackReason(String rollbackReason) {
    this.rollbackReason = rollbackReason;
  }

  public RecommendationApply error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
    @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public RecommendationApply appliedBy(String appliedBy) {
    this.appliedBy = appliedBy;
    return this;
  }

  /**
   * Get appliedBy
   * @return appliedBy
  */
    @Schema(name = "appliedBy", example = "amit.kumar@forgesphere.example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appliedBy")
  public String getAppliedBy() {
    return appliedBy;
  }

  public void setAppliedBy(String appliedBy) {
    this.appliedBy = appliedBy;
  }

  public RecommendationApply auditReference(String auditReference) {
    this.auditReference = auditReference;
    return this;
  }

  /**
   * Get auditReference
   * @return auditReference
  */
    @Schema(name = "auditReference", example = "audit://rightsizer/apply-d1a2c3d4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    RecommendationApply recommendationApply = (RecommendationApply) o;
    return Objects.equals(this.applyId, recommendationApply.applyId) &&
        Objects.equals(this.recommendationId, recommendationApply.recommendationId) &&
        Objects.equals(this.workloadId, recommendationApply.workloadId) &&
        Objects.equals(this.mode, recommendationApply.mode) &&
        Objects.equals(this.status, recommendationApply.status) &&
        Objects.equals(this.startedAt, recommendationApply.startedAt) &&
        Objects.equals(this.completedAt, recommendationApply.completedAt) &&
        Objects.equals(this.monitoringUntil, recommendationApply.monitoringUntil) &&
        Objects.equals(this.beforeResources, recommendationApply.beforeResources) &&
        Objects.equals(this.afterResources, recommendationApply.afterResources) &&
        Objects.equals(this.replicasUpdated, recommendationApply.replicasUpdated) &&
        Objects.equals(this.replicasTotal, recommendationApply.replicasTotal) &&
        Objects.equals(this.postApplyMetrics, recommendationApply.postApplyMetrics) &&
        Objects.equals(this.rollbackReason, recommendationApply.rollbackReason) &&
        Objects.equals(this.error, recommendationApply.error) &&
        Objects.equals(this.appliedBy, recommendationApply.appliedBy) &&
        Objects.equals(this.auditReference, recommendationApply.auditReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyId, recommendationId, workloadId, mode, status, startedAt, completedAt, monitoringUntil, beforeResources, afterResources, replicasUpdated, replicasTotal, postApplyMetrics, rollbackReason, error, appliedBy, auditReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationApply {\n");
    sb.append("    applyId: ").append(toIndentedString(applyId)).append("\n");
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
    sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    monitoringUntil: ").append(toIndentedString(monitoringUntil)).append("\n");
    sb.append("    beforeResources: ").append(toIndentedString(beforeResources)).append("\n");
    sb.append("    afterResources: ").append(toIndentedString(afterResources)).append("\n");
    sb.append("    replicasUpdated: ").append(toIndentedString(replicasUpdated)).append("\n");
    sb.append("    replicasTotal: ").append(toIndentedString(replicasTotal)).append("\n");
    sb.append("    postApplyMetrics: ").append(toIndentedString(postApplyMetrics)).append("\n");
    sb.append("    rollbackReason: ").append(toIndentedString(rollbackReason)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    appliedBy: ").append(toIndentedString(appliedBy)).append("\n");
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

