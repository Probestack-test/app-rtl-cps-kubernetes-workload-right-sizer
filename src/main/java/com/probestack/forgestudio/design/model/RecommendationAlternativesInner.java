package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RecommendationAlternativesInner
 */
@JsonTypeName("Recommendation_alternatives_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class RecommendationAlternativesInner {

  private String description;

  @Valid
  private Map<String, Object> recommendedResources = new HashMap<>();

  private Double projectedMonthlySavingsUSD;

  /**
   * Gets or Sets risk
   */
  public enum RiskEnum {
    SAFE("SAFE"),
    
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH");

    private String value;

    RiskEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RiskEnum fromValue(String value) {
      for (RiskEnum b : RiskEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private RiskEnum risk;

  public RecommendationAlternativesInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
    @Schema(name = "description", example = "Conservative: keep memory at 2048Mi, reduce CPU only", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RecommendationAlternativesInner recommendedResources(Map<String, Object> recommendedResources) {
    this.recommendedResources = recommendedResources;
    return this;
  }

  public RecommendationAlternativesInner putRecommendedResourcesItem(String key, Object recommendedResourcesItem) {
    if (this.recommendedResources == null) {
      this.recommendedResources = new HashMap<>();
    }
    this.recommendedResources.put(key, recommendedResourcesItem);
    return this;
  }

  /**
   * Get recommendedResources
   * @return recommendedResources
  */
    @Schema(name = "recommendedResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recommendedResources")
  public Map<String, Object> getRecommendedResources() {
    return recommendedResources;
  }

  public void setRecommendedResources(Map<String, Object> recommendedResources) {
    this.recommendedResources = recommendedResources;
  }

  public RecommendationAlternativesInner projectedMonthlySavingsUSD(Double projectedMonthlySavingsUSD) {
    this.projectedMonthlySavingsUSD = projectedMonthlySavingsUSD;
    return this;
  }

  /**
   * Get projectedMonthlySavingsUSD
   * @return projectedMonthlySavingsUSD
  */
    @Schema(name = "projectedMonthlySavingsUSD", example = "120.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectedMonthlySavingsUSD")
  public Double getProjectedMonthlySavingsUSD() {
    return projectedMonthlySavingsUSD;
  }

  public void setProjectedMonthlySavingsUSD(Double projectedMonthlySavingsUSD) {
    this.projectedMonthlySavingsUSD = projectedMonthlySavingsUSD;
  }

  public RecommendationAlternativesInner risk(RiskEnum risk) {
    this.risk = risk;
    return this;
  }

  /**
   * Get risk
   * @return risk
  */
    @Schema(name = "risk", example = "SAFE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("risk")
  public RiskEnum getRisk() {
    return risk;
  }

  public void setRisk(RiskEnum risk) {
    this.risk = risk;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationAlternativesInner recommendationAlternativesInner = (RecommendationAlternativesInner) o;
    return Objects.equals(this.description, recommendationAlternativesInner.description) &&
        Objects.equals(this.recommendedResources, recommendationAlternativesInner.recommendedResources) &&
        Objects.equals(this.projectedMonthlySavingsUSD, recommendationAlternativesInner.projectedMonthlySavingsUSD) &&
        Objects.equals(this.risk, recommendationAlternativesInner.risk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, recommendedResources, projectedMonthlySavingsUSD, risk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationAlternativesInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    recommendedResources: ").append(toIndentedString(recommendedResources)).append("\n");
    sb.append("    projectedMonthlySavingsUSD: ").append(toIndentedString(projectedMonthlySavingsUSD)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
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

