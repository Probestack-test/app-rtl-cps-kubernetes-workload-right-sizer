package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * WorkloadUsageMemory
 */
@JsonTypeName("Workload_usage_memory")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class WorkloadUsageMemory {

  private Integer p50Mi;

  private Integer p95Mi;

  private Integer p99Mi;

  private Integer maxMi;

  private Double avgUtilizationPercent;

  public WorkloadUsageMemory p50Mi(Integer p50Mi) {
    this.p50Mi = p50Mi;
    return this;
  }

  /**
   * Get p50Mi
   * @return p50Mi
  */
    @Schema(name = "p50Mi", example = "680", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("p50Mi")
  public Integer getP50Mi() {
    return p50Mi;
  }

  public void setP50Mi(Integer p50Mi) {
    this.p50Mi = p50Mi;
  }

  public WorkloadUsageMemory p95Mi(Integer p95Mi) {
    this.p95Mi = p95Mi;
    return this;
  }

  /**
   * Get p95Mi
   * @return p95Mi
  */
    @Schema(name = "p95Mi", example = "1120", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("p95Mi")
  public Integer getP95Mi() {
    return p95Mi;
  }

  public void setP95Mi(Integer p95Mi) {
    this.p95Mi = p95Mi;
  }

  public WorkloadUsageMemory p99Mi(Integer p99Mi) {
    this.p99Mi = p99Mi;
    return this;
  }

  /**
   * Get p99Mi
   * @return p99Mi
  */
    @Schema(name = "p99Mi", example = "1580", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("p99Mi")
  public Integer getP99Mi() {
    return p99Mi;
  }

  public void setP99Mi(Integer p99Mi) {
    this.p99Mi = p99Mi;
  }

  public WorkloadUsageMemory maxMi(Integer maxMi) {
    this.maxMi = maxMi;
    return this;
  }

  /**
   * Get maxMi
   * @return maxMi
  */
    @Schema(name = "maxMi", example = "2340", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxMi")
  public Integer getMaxMi() {
    return maxMi;
  }

  public void setMaxMi(Integer maxMi) {
    this.maxMi = maxMi;
  }

  public WorkloadUsageMemory avgUtilizationPercent(Double avgUtilizationPercent) {
    this.avgUtilizationPercent = avgUtilizationPercent;
    return this;
  }

  /**
   * Average usage vs current request.
   * @return avgUtilizationPercent
  */
    @Schema(name = "avgUtilizationPercent", example = "27.3", description = "Average usage vs current request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avgUtilizationPercent")
  public Double getAvgUtilizationPercent() {
    return avgUtilizationPercent;
  }

  public void setAvgUtilizationPercent(Double avgUtilizationPercent) {
    this.avgUtilizationPercent = avgUtilizationPercent;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkloadUsageMemory workloadUsageMemory = (WorkloadUsageMemory) o;
    return Objects.equals(this.p50Mi, workloadUsageMemory.p50Mi) &&
        Objects.equals(this.p95Mi, workloadUsageMemory.p95Mi) &&
        Objects.equals(this.p99Mi, workloadUsageMemory.p99Mi) &&
        Objects.equals(this.maxMi, workloadUsageMemory.maxMi) &&
        Objects.equals(this.avgUtilizationPercent, workloadUsageMemory.avgUtilizationPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(p50Mi, p95Mi, p99Mi, maxMi, avgUtilizationPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkloadUsageMemory {\n");
    sb.append("    p50Mi: ").append(toIndentedString(p50Mi)).append("\n");
    sb.append("    p95Mi: ").append(toIndentedString(p95Mi)).append("\n");
    sb.append("    p99Mi: ").append(toIndentedString(p99Mi)).append("\n");
    sb.append("    maxMi: ").append(toIndentedString(maxMi)).append("\n");
    sb.append("    avgUtilizationPercent: ").append(toIndentedString(avgUtilizationPercent)).append("\n");
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

