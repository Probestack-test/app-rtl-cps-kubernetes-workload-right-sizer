package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RecommendationProjectedSavings
 */
@JsonTypeName("Recommendation_projectedSavings")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class RecommendationProjectedSavings {

  private Double monthlySavingsUSD;

  private Double yearlySavingsUSD;

  private Integer cpuSavedMillicores;

  private Integer memorySavedMi;

  private Double savingsPercent;

  private String assumption;

  public RecommendationProjectedSavings() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RecommendationProjectedSavings(Double monthlySavingsUSD, Integer cpuSavedMillicores, Integer memorySavedMi, Double savingsPercent) {
    this.monthlySavingsUSD = monthlySavingsUSD;
    this.cpuSavedMillicores = cpuSavedMillicores;
    this.memorySavedMi = memorySavedMi;
    this.savingsPercent = savingsPercent;
  }

  public RecommendationProjectedSavings monthlySavingsUSD(Double monthlySavingsUSD) {
    this.monthlySavingsUSD = monthlySavingsUSD;
    return this;
  }

  /**
   * Get monthlySavingsUSD
   * @return monthlySavingsUSD
  */
  @NotNull   @Schema(name = "monthlySavingsUSD", example = "245.5", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("monthlySavingsUSD")
  public Double getMonthlySavingsUSD() {
    return monthlySavingsUSD;
  }

  public void setMonthlySavingsUSD(Double monthlySavingsUSD) {
    this.monthlySavingsUSD = monthlySavingsUSD;
  }

  public RecommendationProjectedSavings yearlySavingsUSD(Double yearlySavingsUSD) {
    this.yearlySavingsUSD = yearlySavingsUSD;
    return this;
  }

  /**
   * Get yearlySavingsUSD
   * @return yearlySavingsUSD
  */
    @Schema(name = "yearlySavingsUSD", example = "2946.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yearlySavingsUSD")
  public Double getYearlySavingsUSD() {
    return yearlySavingsUSD;
  }

  public void setYearlySavingsUSD(Double yearlySavingsUSD) {
    this.yearlySavingsUSD = yearlySavingsUSD;
  }

  public RecommendationProjectedSavings cpuSavedMillicores(Integer cpuSavedMillicores) {
    this.cpuSavedMillicores = cpuSavedMillicores;
    return this;
  }

  /**
   * Get cpuSavedMillicores
   * @return cpuSavedMillicores
  */
  @NotNull   @Schema(name = "cpuSavedMillicores", example = "1500", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cpuSavedMillicores")
  public Integer getCpuSavedMillicores() {
    return cpuSavedMillicores;
  }

  public void setCpuSavedMillicores(Integer cpuSavedMillicores) {
    this.cpuSavedMillicores = cpuSavedMillicores;
  }

  public RecommendationProjectedSavings memorySavedMi(Integer memorySavedMi) {
    this.memorySavedMi = memorySavedMi;
    return this;
  }

  /**
   * Get memorySavedMi
   * @return memorySavedMi
  */
  @NotNull   @Schema(name = "memorySavedMi", example = "2560", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("memorySavedMi")
  public Integer getMemorySavedMi() {
    return memorySavedMi;
  }

  public void setMemorySavedMi(Integer memorySavedMi) {
    this.memorySavedMi = memorySavedMi;
  }

  public RecommendationProjectedSavings savingsPercent(Double savingsPercent) {
    this.savingsPercent = savingsPercent;
    return this;
  }

  /**
   * Cost reduction vs current.
   * @return savingsPercent
  */
  @NotNull   @Schema(name = "savingsPercent", example = "62.5", description = "Cost reduction vs current.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("savingsPercent")
  public Double getSavingsPercent() {
    return savingsPercent;
  }

  public void setSavingsPercent(Double savingsPercent) {
    this.savingsPercent = savingsPercent;
  }

  public RecommendationProjectedSavings assumption(String assumption) {
    this.assumption = assumption;
    return this;
  }

  /**
   * Get assumption
   * @return assumption
  */
    @Schema(name = "assumption", example = "Based on 3 replicas × $0.04/vCPU-hr + $0.005/GiB-hr for 730 hours.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assumption")
  public String getAssumption() {
    return assumption;
  }

  public void setAssumption(String assumption) {
    this.assumption = assumption;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationProjectedSavings recommendationProjectedSavings = (RecommendationProjectedSavings) o;
    return Objects.equals(this.monthlySavingsUSD, recommendationProjectedSavings.monthlySavingsUSD) &&
        Objects.equals(this.yearlySavingsUSD, recommendationProjectedSavings.yearlySavingsUSD) &&
        Objects.equals(this.cpuSavedMillicores, recommendationProjectedSavings.cpuSavedMillicores) &&
        Objects.equals(this.memorySavedMi, recommendationProjectedSavings.memorySavedMi) &&
        Objects.equals(this.savingsPercent, recommendationProjectedSavings.savingsPercent) &&
        Objects.equals(this.assumption, recommendationProjectedSavings.assumption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthlySavingsUSD, yearlySavingsUSD, cpuSavedMillicores, memorySavedMi, savingsPercent, assumption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationProjectedSavings {\n");
    sb.append("    monthlySavingsUSD: ").append(toIndentedString(monthlySavingsUSD)).append("\n");
    sb.append("    yearlySavingsUSD: ").append(toIndentedString(yearlySavingsUSD)).append("\n");
    sb.append("    cpuSavedMillicores: ").append(toIndentedString(cpuSavedMillicores)).append("\n");
    sb.append("    memorySavedMi: ").append(toIndentedString(memorySavedMi)).append("\n");
    sb.append("    savingsPercent: ").append(toIndentedString(savingsPercent)).append("\n");
    sb.append("    assumption: ").append(toIndentedString(assumption)).append("\n");
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

