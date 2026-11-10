package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AnalysisJob
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class AnalysisJob {

  private UUID jobId;

  private UUID workloadId;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    QUEUED("QUEUED"),
    
    COLLECTING_METRICS("COLLECTING_METRICS"),
    
    ANALYZING_USAGE("ANALYZING_USAGE"),
    
    GENERATING_RECOMMENDATION("GENERATING_RECOMMENDATION"),
    
    COMPLETED("COMPLETED"),
    
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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime completedAt;

  private Integer progressPercent;

  private Integer estimatedCompletionSeconds;

  private UUID resultRecommendationId;

  private String error;

  public AnalysisJob() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AnalysisJob(UUID jobId, UUID workloadId, StatusEnum status, OffsetDateTime startedAt) {
    this.jobId = jobId;
    this.workloadId = workloadId;
    this.status = status;
    this.startedAt = startedAt;
  }

  public AnalysisJob jobId(UUID jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Get jobId
   * @return jobId
  */
  @NotNull @Valid   @Schema(name = "jobId", example = "c1a2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("jobId")
  public UUID getJobId() {
    return jobId;
  }

  public void setJobId(UUID jobId) {
    this.jobId = jobId;
  }

  public AnalysisJob workloadId(UUID workloadId) {
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

  public AnalysisJob status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "ANALYZING_USAGE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public AnalysisJob startedAt(OffsetDateTime startedAt) {
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

  public AnalysisJob completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * Get completedAt
   * @return completedAt
  */
  @Valid   @Schema(name = "completedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedAt")
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  public AnalysisJob progressPercent(Integer progressPercent) {
    this.progressPercent = progressPercent;
    return this;
  }

  /**
   * Get progressPercent
   * @return progressPercent
  */
    @Schema(name = "progressPercent", example = "62", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("progressPercent")
  public Integer getProgressPercent() {
    return progressPercent;
  }

  public void setProgressPercent(Integer progressPercent) {
    this.progressPercent = progressPercent;
  }

  public AnalysisJob estimatedCompletionSeconds(Integer estimatedCompletionSeconds) {
    this.estimatedCompletionSeconds = estimatedCompletionSeconds;
    return this;
  }

  /**
   * Get estimatedCompletionSeconds
   * @return estimatedCompletionSeconds
  */
    @Schema(name = "estimatedCompletionSeconds", example = "30", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedCompletionSeconds")
  public Integer getEstimatedCompletionSeconds() {
    return estimatedCompletionSeconds;
  }

  public void setEstimatedCompletionSeconds(Integer estimatedCompletionSeconds) {
    this.estimatedCompletionSeconds = estimatedCompletionSeconds;
  }

  public AnalysisJob resultRecommendationId(UUID resultRecommendationId) {
    this.resultRecommendationId = resultRecommendationId;
    return this;
  }

  /**
   * Populated on completion.
   * @return resultRecommendationId
  */
  @Valid   @Schema(name = "resultRecommendationId", example = "b1a2c3d4-e5f6-7890-1234-567890abcdef", description = "Populated on completion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resultRecommendationId")
  public UUID getResultRecommendationId() {
    return resultRecommendationId;
  }

  public void setResultRecommendationId(UUID resultRecommendationId) {
    this.resultRecommendationId = resultRecommendationId;
  }

  public AnalysisJob error(String error) {
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
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisJob analysisJob = (AnalysisJob) o;
    return Objects.equals(this.jobId, analysisJob.jobId) &&
        Objects.equals(this.workloadId, analysisJob.workloadId) &&
        Objects.equals(this.status, analysisJob.status) &&
        Objects.equals(this.startedAt, analysisJob.startedAt) &&
        Objects.equals(this.completedAt, analysisJob.completedAt) &&
        Objects.equals(this.progressPercent, analysisJob.progressPercent) &&
        Objects.equals(this.estimatedCompletionSeconds, analysisJob.estimatedCompletionSeconds) &&
        Objects.equals(this.resultRecommendationId, analysisJob.resultRecommendationId) &&
        Objects.equals(this.error, analysisJob.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, workloadId, status, startedAt, completedAt, progressPercent, estimatedCompletionSeconds, resultRecommendationId, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisJob {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    progressPercent: ").append(toIndentedString(progressPercent)).append("\n");
    sb.append("    estimatedCompletionSeconds: ").append(toIndentedString(estimatedCompletionSeconds)).append("\n");
    sb.append("    resultRecommendationId: ").append(toIndentedString(resultRecommendationId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

