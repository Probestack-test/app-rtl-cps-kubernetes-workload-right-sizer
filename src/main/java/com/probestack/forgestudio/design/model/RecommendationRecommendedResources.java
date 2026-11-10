package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RecommendationRecommendedResources
 */
@JsonTypeName("Recommendation_recommendedResources")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class RecommendationRecommendedResources {

  private Integer cpuRequestMillicores;

  private Integer cpuLimitMillicores;

  private Integer memoryRequestMi;

  private Integer memoryLimitMi;

  public RecommendationRecommendedResources() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RecommendationRecommendedResources(Integer cpuRequestMillicores, Integer cpuLimitMillicores, Integer memoryRequestMi, Integer memoryLimitMi) {
    this.cpuRequestMillicores = cpuRequestMillicores;
    this.cpuLimitMillicores = cpuLimitMillicores;
    this.memoryRequestMi = memoryRequestMi;
    this.memoryLimitMi = memoryLimitMi;
  }

  public RecommendationRecommendedResources cpuRequestMillicores(Integer cpuRequestMillicores) {
    this.cpuRequestMillicores = cpuRequestMillicores;
    return this;
  }

  /**
   * Get cpuRequestMillicores
   * @return cpuRequestMillicores
  */
  @NotNull   @Schema(name = "cpuRequestMillicores", example = "500", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cpuRequestMillicores")
  public Integer getCpuRequestMillicores() {
    return cpuRequestMillicores;
  }

  public void setCpuRequestMillicores(Integer cpuRequestMillicores) {
    this.cpuRequestMillicores = cpuRequestMillicores;
  }

  public RecommendationRecommendedResources cpuLimitMillicores(Integer cpuLimitMillicores) {
    this.cpuLimitMillicores = cpuLimitMillicores;
    return this;
  }

  /**
   * Get cpuLimitMillicores
   * @return cpuLimitMillicores
  */
  @NotNull   @Schema(name = "cpuLimitMillicores", example = "1000", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cpuLimitMillicores")
  public Integer getCpuLimitMillicores() {
    return cpuLimitMillicores;
  }

  public void setCpuLimitMillicores(Integer cpuLimitMillicores) {
    this.cpuLimitMillicores = cpuLimitMillicores;
  }

  public RecommendationRecommendedResources memoryRequestMi(Integer memoryRequestMi) {
    this.memoryRequestMi = memoryRequestMi;
    return this;
  }

  /**
   * Get memoryRequestMi
   * @return memoryRequestMi
  */
  @NotNull   @Schema(name = "memoryRequestMi", example = "1536", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("memoryRequestMi")
  public Integer getMemoryRequestMi() {
    return memoryRequestMi;
  }

  public void setMemoryRequestMi(Integer memoryRequestMi) {
    this.memoryRequestMi = memoryRequestMi;
  }

  public RecommendationRecommendedResources memoryLimitMi(Integer memoryLimitMi) {
    this.memoryLimitMi = memoryLimitMi;
    return this;
  }

  /**
   * Get memoryLimitMi
   * @return memoryLimitMi
  */
  @NotNull   @Schema(name = "memoryLimitMi", example = "2048", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("memoryLimitMi")
  public Integer getMemoryLimitMi() {
    return memoryLimitMi;
  }

  public void setMemoryLimitMi(Integer memoryLimitMi) {
    this.memoryLimitMi = memoryLimitMi;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationRecommendedResources recommendationRecommendedResources = (RecommendationRecommendedResources) o;
    return Objects.equals(this.cpuRequestMillicores, recommendationRecommendedResources.cpuRequestMillicores) &&
        Objects.equals(this.cpuLimitMillicores, recommendationRecommendedResources.cpuLimitMillicores) &&
        Objects.equals(this.memoryRequestMi, recommendationRecommendedResources.memoryRequestMi) &&
        Objects.equals(this.memoryLimitMi, recommendationRecommendedResources.memoryLimitMi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuRequestMillicores, cpuLimitMillicores, memoryRequestMi, memoryLimitMi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationRecommendedResources {\n");
    sb.append("    cpuRequestMillicores: ").append(toIndentedString(cpuRequestMillicores)).append("\n");
    sb.append("    cpuLimitMillicores: ").append(toIndentedString(cpuLimitMillicores)).append("\n");
    sb.append("    memoryRequestMi: ").append(toIndentedString(memoryRequestMi)).append("\n");
    sb.append("    memoryLimitMi: ").append(toIndentedString(memoryLimitMi)).append("\n");
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

