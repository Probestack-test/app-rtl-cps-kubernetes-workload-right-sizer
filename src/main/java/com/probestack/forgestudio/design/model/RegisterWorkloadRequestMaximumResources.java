package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Absolute maximum (never go above).
 */
@Schema(name = "registerWorkload_request_maximumResources", description = "Absolute maximum (never go above).")
@JsonTypeName("registerWorkload_request_maximumResources")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class RegisterWorkloadRequestMaximumResources {

  private Integer cpuRequestMillicores;

  private Integer memoryRequestMi;

  public RegisterWorkloadRequestMaximumResources cpuRequestMillicores(Integer cpuRequestMillicores) {
    this.cpuRequestMillicores = cpuRequestMillicores;
    return this;
  }

  /**
   * Get cpuRequestMillicores
   * @return cpuRequestMillicores
  */
    @Schema(name = "cpuRequestMillicores", example = "4000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cpuRequestMillicores")
  public Integer getCpuRequestMillicores() {
    return cpuRequestMillicores;
  }

  public void setCpuRequestMillicores(Integer cpuRequestMillicores) {
    this.cpuRequestMillicores = cpuRequestMillicores;
  }

  public RegisterWorkloadRequestMaximumResources memoryRequestMi(Integer memoryRequestMi) {
    this.memoryRequestMi = memoryRequestMi;
    return this;
  }

  /**
   * Get memoryRequestMi
   * @return memoryRequestMi
  */
    @Schema(name = "memoryRequestMi", example = "8192", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    RegisterWorkloadRequestMaximumResources registerWorkloadRequestMaximumResources = (RegisterWorkloadRequestMaximumResources) o;
    return Objects.equals(this.cpuRequestMillicores, registerWorkloadRequestMaximumResources.cpuRequestMillicores) &&
        Objects.equals(this.memoryRequestMi, registerWorkloadRequestMaximumResources.memoryRequestMi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuRequestMillicores, memoryRequestMi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterWorkloadRequestMaximumResources {\n");
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

