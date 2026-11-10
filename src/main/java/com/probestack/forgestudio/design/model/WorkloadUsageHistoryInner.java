package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * WorkloadUsageHistoryInner
 */
@JsonTypeName("Workload_usageHistory_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class WorkloadUsageHistoryInner {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  private Integer cpuMillicores;

  private Integer memoryMi;

  private Integer replicas;

  public WorkloadUsageHistoryInner timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @Valid   @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public WorkloadUsageHistoryInner cpuMillicores(Integer cpuMillicores) {
    this.cpuMillicores = cpuMillicores;
    return this;
  }

  /**
   * Get cpuMillicores
   * @return cpuMillicores
  */
    @Schema(name = "cpuMillicores", example = "420", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cpuMillicores")
  public Integer getCpuMillicores() {
    return cpuMillicores;
  }

  public void setCpuMillicores(Integer cpuMillicores) {
    this.cpuMillicores = cpuMillicores;
  }

  public WorkloadUsageHistoryInner memoryMi(Integer memoryMi) {
    this.memoryMi = memoryMi;
    return this;
  }

  /**
   * Get memoryMi
   * @return memoryMi
  */
    @Schema(name = "memoryMi", example = "1120", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memoryMi")
  public Integer getMemoryMi() {
    return memoryMi;
  }

  public void setMemoryMi(Integer memoryMi) {
    this.memoryMi = memoryMi;
  }

  public WorkloadUsageHistoryInner replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * Get replicas
   * @return replicas
  */
    @Schema(name = "replicas", example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("replicas")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkloadUsageHistoryInner workloadUsageHistoryInner = (WorkloadUsageHistoryInner) o;
    return Objects.equals(this.timestamp, workloadUsageHistoryInner.timestamp) &&
        Objects.equals(this.cpuMillicores, workloadUsageHistoryInner.cpuMillicores) &&
        Objects.equals(this.memoryMi, workloadUsageHistoryInner.memoryMi) &&
        Objects.equals(this.replicas, workloadUsageHistoryInner.replicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, cpuMillicores, memoryMi, replicas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkloadUsageHistoryInner {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    cpuMillicores: ").append(toIndentedString(cpuMillicores)).append("\n");
    sb.append("    memoryMi: ").append(toIndentedString(memoryMi)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
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

