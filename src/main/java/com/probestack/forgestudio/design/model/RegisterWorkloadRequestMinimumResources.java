package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Absolute minimum (never go below).
 */
@Schema(name = "registerWorkload_request_minimumResources", description = "Absolute minimum (never go below).")
@JsonTypeName("registerWorkload_request_minimumResources")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class RegisterWorkloadRequestMinimumResources {

  private Integer cpuRequestMillicores;

  private Integer memoryRequestMi;

  public RegisterWorkloadRequestMinimumResources cpuRequestMillicores(Integer cpuRequestMillicores) {
    this.cpuRequestMillicores = cpuRequestMillicores;
    return this;
  }

  /**
   * Get cpuRequestMillicores
   * @return cpuRequestMillicores
  */
    @Schema(name = "cpuRequestMillicores", example = "100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cpuRequestMillicores")
  public Integer getCpuRequestMillicores() {
    return cpuRequestMillicores;
  }

  public void setCpuRequestMillicores(Integer cpuRequestMillicores) {
    this.cpuRequestMillicores = cpuRequestMillicores;
  }

  public RegisterWorkloadRequestMinimumResources memoryRequestMi(Integer memoryRequestMi) {
    this.memoryRequestMi = memoryRequestMi;
    return this;
  }

  /**
   * Get memoryRequestMi
   * @return memoryRequestMi
  */
    @Schema(name = "memoryRequestMi", example = "256", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memoryRequestMi")
  public Integer getMemoryRequestMi() {
    return memoryRequestMi;
  }

  public void setMemoryRequestMi(Integer memoryRequestMi) {
    this.memoryRequestMi = memoryRequestMi;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterWorkloadRequestMinimumResources registerWorkloadRequestMinimumResources = (RegisterWorkloadRequestMinimumResources) o;
    return Objects.equals(this.cpuRequestMillicores, registerWorkloadRequestMinimumResources.cpuRequestMillicores) &&
        Objects.equals(this.memoryRequestMi, registerWorkloadRequestMinimumResources.memoryRequestMi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuRequestMillicores, memoryRequestMi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterWorkloadRequestMinimumResources {\n");
    sb.append("    cpuRequestMillicores: ").append(toIndentedString(cpuRequestMillicores)).append("\n");
    sb.append("    memoryRequestMi: ").append(toIndentedString(memoryRequestMi)).append("\n");
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

