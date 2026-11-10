package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * WorkloadUsageCpu
 */
@JsonTypeName("Workload_usage_cpu")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class WorkloadUsageCpu {

  private Integer p50Millicores;

  private Integer p95Millicores;

  private Integer p99Millicores;

  private Integer maxMillicores;

  private Double avgUtilizationPercent;

  public WorkloadUsageCpu p50Millicores(Integer p50Millicores) {
    this.p50Millicores = p50Millicores;
    return this;
  }

  /**
   * Get p50Millicores
   * @return p50Millicores
  */
    @Schema(name = "p50Millicores", example = "180", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("p50Millicores")
  public Integer getP50Millicores() {
    return p50Millicores;
  }

  public void setP50Millicores(Integer p50Millicores) {
    this.p50Millicores = p50Millicores;
  }

  public WorkloadUsageCpu p95Millicores(Integer p95Millicores) {
    this.p95Millicores = p95Millicores;
    return this;
  }

  /**
   * Get p95Millicores
   * @return p95Millicores
  */
    @Schema(name = "p95Millicores", example = "420", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("p95Millicores")
  public Integer getP95Millicores() {
    return p95Millicores;
  }

  public void setP95Millicores(Integer p95Millicores) {
    this.p95Millicores = p95Millicores;
  }

  public WorkloadUsageCpu p99Millicores(Integer p99Millicores) {
    this.p99Millicores = p99Millicores;
    return this;
  }

  /**
   * Get p99Millicores
   * @return p99Millicores
  */
    @Schema(name = "p99Millicores", example = "780", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("p99Millicores")
  public Integer getP99Millicores() {
    return p99Millicores;
  }

  public void setP99Millicores(Integer p99Millicores) {
    this.p99Millicores = p99Millicores;
  }

  public WorkloadUsageCpu maxMillicores(Integer maxMillicores) {
    this.maxMillicores = maxMillicores;
    return this;
  }

  /**
   * Get maxMillicores
   * @return maxMillicores
  */
    @Schema(name = "maxMillicores", example = "1450", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxMillicores")
  public Integer getMaxMillicores() {
    return maxMillicores;
  }

  public void setMaxMillicores(Integer maxMillicores) {
    this.maxMillicores = maxMillicores;
  }

  public WorkloadUsageCpu avgUtilizationPercent(Double avgUtilizationPercent) {
    this.avgUtilizationPercent = avgUtilizationPercent;
    return this;
  }

  /**
   * Average usage vs current request.
   * @return avgUtilizationPercent
  */
    @Schema(name = "avgUtilizationPercent", example = "9.0", description = "Average usage vs current request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    WorkloadUsageCpu workloadUsageCpu = (WorkloadUsageCpu) o;
    return Objects.equals(this.p50Millicores, workloadUsageCpu.p50Millicores) &&
        Objects.equals(this.p95Millicores, workloadUsageCpu.p95Millicores) &&
        Objects.equals(this.p99Millicores, workloadUsageCpu.p99Millicores) &&
        Objects.equals(this.maxMillicores, workloadUsageCpu.maxMillicores) &&
        Objects.equals(this.avgUtilizationPercent, workloadUsageCpu.avgUtilizationPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(p50Millicores, p95Millicores, p99Millicores, maxMillicores, avgUtilizationPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkloadUsageCpu {\n");
    sb.append("    p50Millicores: ").append(toIndentedString(p50Millicores)).append("\n");
    sb.append("    p95Millicores: ").append(toIndentedString(p95Millicores)).append("\n");
    sb.append("    p99Millicores: ").append(toIndentedString(p99Millicores)).append("\n");
    sb.append("    maxMillicores: ").append(toIndentedString(maxMillicores)).append("\n");
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

