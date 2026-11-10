package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AnalyzeWorkloadRequest
 */
@JsonTypeName("analyzeWorkload_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class AnalyzeWorkloadRequest {

  private String reason;

  private Integer overrideWindowDays;

  private Integer overrideSafetyMarginPercent;

  private String requestedBy;

  public AnalyzeWorkloadRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AnalyzeWorkloadRequest(String reason) {
    this.reason = reason;
  }

  public AnalyzeWorkloadRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Why the analysis is being triggered (min 15 chars).
   * @return reason
  */
  @NotNull @Size(min = 15)   @Schema(name = "reason", example = "Traffic increased 3x after Diwali sale; re-checking sizing.", description = "Why the analysis is being triggered (min 15 chars).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public AnalyzeWorkloadRequest overrideWindowDays(Integer overrideWindowDays) {
    this.overrideWindowDays = overrideWindowDays;
    return this;
  }

  /**
   * Optional shorter/longer window for this analysis.
   * minimum: 1
   * maximum: 30
   * @return overrideWindowDays
  */
  @Min(1) @Max(30)   @Schema(name = "overrideWindowDays", example = "7", description = "Optional shorter/longer window for this analysis.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overrideWindowDays")
  public Integer getOverrideWindowDays() {
    return overrideWindowDays;
  }

  public void setOverrideWindowDays(Integer overrideWindowDays) {
    this.overrideWindowDays = overrideWindowDays;
  }

  public AnalyzeWorkloadRequest overrideSafetyMarginPercent(Integer overrideSafetyMarginPercent) {
    this.overrideSafetyMarginPercent = overrideSafetyMarginPercent;
    return this;
  }

  /**
   * Optional override for safety margin.
   * minimum: 10
   * maximum: 100
   * @return overrideSafetyMarginPercent
  */
  @Min(10) @Max(100)   @Schema(name = "overrideSafetyMarginPercent", example = "40", description = "Optional override for safety margin.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overrideSafetyMarginPercent")
  public Integer getOverrideSafetyMarginPercent() {
    return overrideSafetyMarginPercent;
  }

  public void setOverrideSafetyMarginPercent(Integer overrideSafetyMarginPercent) {
    this.overrideSafetyMarginPercent = overrideSafetyMarginPercent;
  }

  public AnalyzeWorkloadRequest requestedBy(String requestedBy) {
    this.requestedBy = requestedBy;
    return this;
  }

  /**
   * Get requestedBy
   * @return requestedBy
  */
    @Schema(name = "requestedBy", example = "amit.kumar@forgesphere.example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedBy")
  public String getRequestedBy() {
    return requestedBy;
  }

  public void setRequestedBy(String requestedBy) {
    this.requestedBy = requestedBy;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyzeWorkloadRequest analyzeWorkloadRequest = (AnalyzeWorkloadRequest) o;
    return Objects.equals(this.reason, analyzeWorkloadRequest.reason) &&
        Objects.equals(this.overrideWindowDays, analyzeWorkloadRequest.overrideWindowDays) &&
        Objects.equals(this.overrideSafetyMarginPercent, analyzeWorkloadRequest.overrideSafetyMarginPercent) &&
        Objects.equals(this.requestedBy, analyzeWorkloadRequest.requestedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, overrideWindowDays, overrideSafetyMarginPercent, requestedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyzeWorkloadRequest {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    overrideWindowDays: ").append(toIndentedString(overrideWindowDays)).append("\n");
    sb.append("    overrideSafetyMarginPercent: ").append(toIndentedString(overrideSafetyMarginPercent)).append("\n");
    sb.append("    requestedBy: ").append(toIndentedString(requestedBy)).append("\n");
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

