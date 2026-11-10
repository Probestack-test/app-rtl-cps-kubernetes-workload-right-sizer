package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * WorkloadListSummary
 */
@JsonTypeName("WorkloadList_summary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class WorkloadListSummary {

  private Integer totalWorkloads;

  private Integer workloadsWithRecommendation;

  private Integer oomRiskCount;

  private Double cpuWastePercentAvg;

  private Double memoryWastePercentAvg;

  private Double totalMonthlySavingsOpportunityUSD;

  private Double totalYearlySavingsOpportunityUSD;

  public WorkloadListSummary totalWorkloads(Integer totalWorkloads) {
    this.totalWorkloads = totalWorkloads;
    return this;
  }

  /**
   * Get totalWorkloads
   * @return totalWorkloads
  */
    @Schema(name = "totalWorkloads", example = "247", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalWorkloads")
  public Integer getTotalWorkloads() {
    return totalWorkloads;
  }

  public void setTotalWorkloads(Integer totalWorkloads) {
    this.totalWorkloads = totalWorkloads;
  }

  public WorkloadListSummary workloadsWithRecommendation(Integer workloadsWithRecommendation) {
    this.workloadsWithRecommendation = workloadsWithRecommendation;
    return this;
  }

  /**
   * Get workloadsWithRecommendation
   * @return workloadsWithRecommendation
  */
    @Schema(name = "workloadsWithRecommendation", example = "89", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workloadsWithRecommendation")
  public Integer getWorkloadsWithRecommendation() {
    return workloadsWithRecommendation;
  }

  public void setWorkloadsWithRecommendation(Integer workloadsWithRecommendation) {
    this.workloadsWithRecommendation = workloadsWithRecommendation;
  }

  public WorkloadListSummary oomRiskCount(Integer oomRiskCount) {
    this.oomRiskCount = oomRiskCount;
    return this;
  }

  /**
   * Get oomRiskCount
   * @return oomRiskCount
  */
    @Schema(name = "oomRiskCount", example = "12", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oomRiskCount")
  public Integer getOomRiskCount() {
    return oomRiskCount;
  }

  public void setOomRiskCount(Integer oomRiskCount) {
    this.oomRiskCount = oomRiskCount;
  }

  public WorkloadListSummary cpuWastePercentAvg(Double cpuWastePercentAvg) {
    this.cpuWastePercentAvg = cpuWastePercentAvg;
    return this;
  }

  /**
   * Get cpuWastePercentAvg
   * @return cpuWastePercentAvg
  */
    @Schema(name = "cpuWastePercentAvg", example = "62.5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cpuWastePercentAvg")
  public Double getCpuWastePercentAvg() {
    return cpuWastePercentAvg;
  }

  public void setCpuWastePercentAvg(Double cpuWastePercentAvg) {
    this.cpuWastePercentAvg = cpuWastePercentAvg;
  }

  public WorkloadListSummary memoryWastePercentAvg(Double memoryWastePercentAvg) {
    this.memoryWastePercentAvg = memoryWastePercentAvg;
    return this;
  }

  /**
   * Get memoryWastePercentAvg
   * @return memoryWastePercentAvg
  */
    @Schema(name = "memoryWastePercentAvg", example = "48.3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memoryWastePercentAvg")
  public Double getMemoryWastePercentAvg() {
    return memoryWastePercentAvg;
  }

  public void setMemoryWastePercentAvg(Double memoryWastePercentAvg) {
    this.memoryWastePercentAvg = memoryWastePercentAvg;
  }

  public WorkloadListSummary totalMonthlySavingsOpportunityUSD(Double totalMonthlySavingsOpportunityUSD) {
    this.totalMonthlySavingsOpportunityUSD = totalMonthlySavingsOpportunityUSD;
    return this;
  }

  /**
   * Get totalMonthlySavingsOpportunityUSD
   * @return totalMonthlySavingsOpportunityUSD
  */
    @Schema(name = "totalMonthlySavingsOpportunityUSD", example = "12450.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalMonthlySavingsOpportunityUSD")
  public Double getTotalMonthlySavingsOpportunityUSD() {
    return totalMonthlySavingsOpportunityUSD;
  }

  public void setTotalMonthlySavingsOpportunityUSD(Double totalMonthlySavingsOpportunityUSD) {
    this.totalMonthlySavingsOpportunityUSD = totalMonthlySavingsOpportunityUSD;
  }

  public WorkloadListSummary totalYearlySavingsOpportunityUSD(Double totalYearlySavingsOpportunityUSD) {
    this.totalYearlySavingsOpportunityUSD = totalYearlySavingsOpportunityUSD;
    return this;
  }

  /**
   * Get totalYearlySavingsOpportunityUSD
   * @return totalYearlySavingsOpportunityUSD
  */
    @Schema(name = "totalYearlySavingsOpportunityUSD", example = "149400.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalYearlySavingsOpportunityUSD")
  public Double getTotalYearlySavingsOpportunityUSD() {
    return totalYearlySavingsOpportunityUSD;
  }

  public void setTotalYearlySavingsOpportunityUSD(Double totalYearlySavingsOpportunityUSD) {
    this.totalYearlySavingsOpportunityUSD = totalYearlySavingsOpportunityUSD;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkloadListSummary workloadListSummary = (WorkloadListSummary) o;
    return Objects.equals(this.totalWorkloads, workloadListSummary.totalWorkloads) &&
        Objects.equals(this.workloadsWithRecommendation, workloadListSummary.workloadsWithRecommendation) &&
        Objects.equals(this.oomRiskCount, workloadListSummary.oomRiskCount) &&
        Objects.equals(this.cpuWastePercentAvg, workloadListSummary.cpuWastePercentAvg) &&
        Objects.equals(this.memoryWastePercentAvg, workloadListSummary.memoryWastePercentAvg) &&
        Objects.equals(this.totalMonthlySavingsOpportunityUSD, workloadListSummary.totalMonthlySavingsOpportunityUSD) &&
        Objects.equals(this.totalYearlySavingsOpportunityUSD, workloadListSummary.totalYearlySavingsOpportunityUSD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalWorkloads, workloadsWithRecommendation, oomRiskCount, cpuWastePercentAvg, memoryWastePercentAvg, totalMonthlySavingsOpportunityUSD, totalYearlySavingsOpportunityUSD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkloadListSummary {\n");
    sb.append("    totalWorkloads: ").append(toIndentedString(totalWorkloads)).append("\n");
    sb.append("    workloadsWithRecommendation: ").append(toIndentedString(workloadsWithRecommendation)).append("\n");
    sb.append("    oomRiskCount: ").append(toIndentedString(oomRiskCount)).append("\n");
    sb.append("    cpuWastePercentAvg: ").append(toIndentedString(cpuWastePercentAvg)).append("\n");
    sb.append("    memoryWastePercentAvg: ").append(toIndentedString(memoryWastePercentAvg)).append("\n");
    sb.append("    totalMonthlySavingsOpportunityUSD: ").append(toIndentedString(totalMonthlySavingsOpportunityUSD)).append("\n");
    sb.append("    totalYearlySavingsOpportunityUSD: ").append(toIndentedString(totalYearlySavingsOpportunityUSD)).append("\n");
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

