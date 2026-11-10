package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Metrics observed during monitoring.
 */
@Schema(name = "RecommendationApply_postApplyMetrics", description = "Metrics observed during monitoring.")
@JsonTypeName("RecommendationApply_postApplyMetrics")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class RecommendationApplyPostApplyMetrics {

  private Integer oomKillsObserved;

  private Integer throttlingEventsObserved;

  private Double avgCpuUtilizationPercent;

  private Double avgMemoryUtilizationPercent;

  private Double actualMonthlySavingsUSD;

  public RecommendationApplyPostApplyMetrics oomKillsObserved(Integer oomKillsObserved) {
    this.oomKillsObserved = oomKillsObserved;
    return this;
  }

  /**
   * Get oomKillsObserved
   * @return oomKillsObserved
  */
    @Schema(name = "oomKillsObserved", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oomKillsObserved")
  public Integer getOomKillsObserved() {
    return oomKillsObserved;
  }

  public void setOomKillsObserved(Integer oomKillsObserved) {
    this.oomKillsObserved = oomKillsObserved;
  }

  public RecommendationApplyPostApplyMetrics throttlingEventsObserved(Integer throttlingEventsObserved) {
    this.throttlingEventsObserved = throttlingEventsObserved;
    return this;
  }

  /**
   * Get throttlingEventsObserved
   * @return throttlingEventsObserved
  */
    @Schema(name = "throttlingEventsObserved", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("throttlingEventsObserved")
  public Integer getThrottlingEventsObserved() {
    return throttlingEventsObserved;
  }

  public void setThrottlingEventsObserved(Integer throttlingEventsObserved) {
    this.throttlingEventsObserved = throttlingEventsObserved;
  }

  public RecommendationApplyPostApplyMetrics avgCpuUtilizationPercent(Double avgCpuUtilizationPercent) {
    this.avgCpuUtilizationPercent = avgCpuUtilizationPercent;
    return this;
  }

  /**
   * Get avgCpuUtilizationPercent
   * @return avgCpuUtilizationPercent
  */
    @Schema(name = "avgCpuUtilizationPercent", example = "42.5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avgCpuUtilizationPercent")
  public Double getAvgCpuUtilizationPercent() {
    return avgCpuUtilizationPercent;
  }

  public void setAvgCpuUtilizationPercent(Double avgCpuUtilizationPercent) {
    this.avgCpuUtilizationPercent = avgCpuUtilizationPercent;
  }

  public RecommendationApplyPostApplyMetrics avgMemoryUtilizationPercent(Double avgMemoryUtilizationPercent) {
    this.avgMemoryUtilizationPercent = avgMemoryUtilizationPercent;
    return this;
  }

  /**
   * Get avgMemoryUtilizationPercent
   * @return avgMemoryUtilizationPercent
  */
    @Schema(name = "avgMemoryUtilizationPercent", example = "68.2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avgMemoryUtilizationPercent")
  public Double getAvgMemoryUtilizationPercent() {
    return avgMemoryUtilizationPercent;
  }

  public void setAvgMemoryUtilizationPercent(Double avgMemoryUtilizationPercent) {
    this.avgMemoryUtilizationPercent = avgMemoryUtilizationPercent;
  }

  public RecommendationApplyPostApplyMetrics actualMonthlySavingsUSD(Double actualMonthlySavingsUSD) {
    this.actualMonthlySavingsUSD = actualMonthlySavingsUSD;
    return this;
  }

  /**
   * Realized savings so far (extrapolated).
   * @return actualMonthlySavingsUSD
  */
    @Schema(name = "actualMonthlySavingsUSD", example = "238.4", description = "Realized savings so far (extrapolated).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actualMonthlySavingsUSD")
  public Double getActualMonthlySavingsUSD() {
    return actualMonthlySavingsUSD;
  }

  public void setActualMonthlySavingsUSD(Double actualMonthlySavingsUSD) {
    this.actualMonthlySavingsUSD = actualMonthlySavingsUSD;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationApplyPostApplyMetrics recommendationApplyPostApplyMetrics = (RecommendationApplyPostApplyMetrics) o;
    return Objects.equals(this.oomKillsObserved, recommendationApplyPostApplyMetrics.oomKillsObserved) &&
        Objects.equals(this.throttlingEventsObserved, recommendationApplyPostApplyMetrics.throttlingEventsObserved) &&
        Objects.equals(this.avgCpuUtilizationPercent, recommendationApplyPostApplyMetrics.avgCpuUtilizationPercent) &&
        Objects.equals(this.avgMemoryUtilizationPercent, recommendationApplyPostApplyMetrics.avgMemoryUtilizationPercent) &&
        Objects.equals(this.actualMonthlySavingsUSD, recommendationApplyPostApplyMetrics.actualMonthlySavingsUSD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oomKillsObserved, throttlingEventsObserved, avgCpuUtilizationPercent, avgMemoryUtilizationPercent, actualMonthlySavingsUSD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationApplyPostApplyMetrics {\n");
    sb.append("    oomKillsObserved: ").append(toIndentedString(oomKillsObserved)).append("\n");
    sb.append("    throttlingEventsObserved: ").append(toIndentedString(throttlingEventsObserved)).append("\n");
    sb.append("    avgCpuUtilizationPercent: ").append(toIndentedString(avgCpuUtilizationPercent)).append("\n");
    sb.append("    avgMemoryUtilizationPercent: ").append(toIndentedString(avgMemoryUtilizationPercent)).append("\n");
    sb.append("    actualMonthlySavingsUSD: ").append(toIndentedString(actualMonthlySavingsUSD)).append("\n");
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

