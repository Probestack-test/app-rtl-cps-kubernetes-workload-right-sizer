package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RecommendationRiskAssessment
 */
@JsonTypeName("Recommendation_riskAssessment")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class RecommendationRiskAssessment {

  /**
   * Gets or Sets overallRisk
   */
  public enum OverallRiskEnum {
    SAFE("SAFE"),
    
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH");

    private String value;

    OverallRiskEnum(String value) {
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
    public static OverallRiskEnum fromValue(String value) {
      for (OverallRiskEnum b : OverallRiskEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private OverallRiskEnum overallRisk;

  /**
   * Risk of OOMKill after change.
   */
  public enum OomRiskEnum {
    NONE("NONE"),
    
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH");

    private String value;

    OomRiskEnum(String value) {
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
    public static OomRiskEnum fromValue(String value) {
      for (OomRiskEnum b : OomRiskEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private OomRiskEnum oomRisk;

  private String oomRiskReasoning;

  /**
   * Gets or Sets throttlingRisk
   */
  public enum ThrottlingRiskEnum {
    NONE("NONE"),
    
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH");

    private String value;

    ThrottlingRiskEnum(String value) {
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
    public static ThrottlingRiskEnum fromValue(String value) {
      for (ThrottlingRiskEnum b : ThrottlingRiskEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ThrottlingRiskEnum throttlingRisk;

  private String throttlingRiskReasoning;

  /**
   * Gets or Sets performanceRisk
   */
  public enum PerformanceRiskEnum {
    NONE("NONE"),
    
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH");

    private String value;

    PerformanceRiskEnum(String value) {
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
    public static PerformanceRiskEnum fromValue(String value) {
      for (PerformanceRiskEnum b : PerformanceRiskEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private PerformanceRiskEnum performanceRisk;

  private String performanceRiskReasoning;

  public RecommendationRiskAssessment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RecommendationRiskAssessment(OverallRiskEnum overallRisk, OomRiskEnum oomRisk, ThrottlingRiskEnum throttlingRisk, PerformanceRiskEnum performanceRisk) {
    this.overallRisk = overallRisk;
    this.oomRisk = oomRisk;
    this.throttlingRisk = throttlingRisk;
    this.performanceRisk = performanceRisk;
  }

  public RecommendationRiskAssessment overallRisk(OverallRiskEnum overallRisk) {
    this.overallRisk = overallRisk;
    return this;
  }

  /**
   * Get overallRisk
   * @return overallRisk
  */
  @NotNull   @Schema(name = "overallRisk", example = "MEDIUM", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("overallRisk")
  public OverallRiskEnum getOverallRisk() {
    return overallRisk;
  }

  public void setOverallRisk(OverallRiskEnum overallRisk) {
    this.overallRisk = overallRisk;
  }

  public RecommendationRiskAssessment oomRisk(OomRiskEnum oomRisk) {
    this.oomRisk = oomRisk;
    return this;
  }

  /**
   * Risk of OOMKill after change.
   * @return oomRisk
  */
  @NotNull   @Schema(name = "oomRisk", example = "MEDIUM", description = "Risk of OOMKill after change.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("oomRisk")
  public OomRiskEnum getOomRisk() {
    return oomRisk;
  }

  public void setOomRisk(OomRiskEnum oomRisk) {
    this.oomRisk = oomRisk;
  }

  public RecommendationRiskAssessment oomRiskReasoning(String oomRiskReasoning) {
    this.oomRiskReasoning = oomRiskReasoning;
    return this;
  }

  /**
   * Get oomRiskReasoning
   * @return oomRiskReasoning
  */
    @Schema(name = "oomRiskReasoning", example = "P99 memory is 1580Mi; recommended request 1536Mi will OOM during peaks. Consider 2048Mi request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oomRiskReasoning")
  public String getOomRiskReasoning() {
    return oomRiskReasoning;
  }

  public void setOomRiskReasoning(String oomRiskReasoning) {
    this.oomRiskReasoning = oomRiskReasoning;
  }

  public RecommendationRiskAssessment throttlingRisk(ThrottlingRiskEnum throttlingRisk) {
    this.throttlingRisk = throttlingRisk;
    return this;
  }

  /**
   * Get throttlingRisk
   * @return throttlingRisk
  */
  @NotNull   @Schema(name = "throttlingRisk", example = "LOW", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("throttlingRisk")
  public ThrottlingRiskEnum getThrottlingRisk() {
    return throttlingRisk;
  }

  public void setThrottlingRisk(ThrottlingRiskEnum throttlingRisk) {
    this.throttlingRisk = throttlingRisk;
  }

  public RecommendationRiskAssessment throttlingRiskReasoning(String throttlingRiskReasoning) {
    this.throttlingRiskReasoning = throttlingRiskReasoning;
    return this;
  }

  /**
   * Get throttlingRiskReasoning
   * @return throttlingRiskReasoning
  */
    @Schema(name = "throttlingRiskReasoning", example = "P99 CPU 780m; limit 1000m provides 28% buffer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("throttlingRiskReasoning")
  public String getThrottlingRiskReasoning() {
    return throttlingRiskReasoning;
  }

  public void setThrottlingRiskReasoning(String throttlingRiskReasoning) {
    this.throttlingRiskReasoning = throttlingRiskReasoning;
  }

  public RecommendationRiskAssessment performanceRisk(PerformanceRiskEnum performanceRisk) {
    this.performanceRisk = performanceRisk;
    return this;
  }

  /**
   * Get performanceRisk
   * @return performanceRisk
  */
  @NotNull   @Schema(name = "performanceRisk", example = "LOW", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("performanceRisk")
  public PerformanceRiskEnum getPerformanceRisk() {
    return performanceRisk;
  }

  public void setPerformanceRisk(PerformanceRiskEnum performanceRisk) {
    this.performanceRisk = performanceRisk;
  }

  public RecommendationRiskAssessment performanceRiskReasoning(String performanceRiskReasoning) {
    this.performanceRiskReasoning = performanceRiskReasoning;
    return this;
  }

  /**
   * Get performanceRiskReasoning
   * @return performanceRiskReasoning
  */
    @Schema(name = "performanceRiskReasoning", example = "All criticality TIER_0 safety margins respected.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("performanceRiskReasoning")
  public String getPerformanceRiskReasoning() {
    return performanceRiskReasoning;
  }

  public void setPerformanceRiskReasoning(String performanceRiskReasoning) {
    this.performanceRiskReasoning = performanceRiskReasoning;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationRiskAssessment recommendationRiskAssessment = (RecommendationRiskAssessment) o;
    return Objects.equals(this.overallRisk, recommendationRiskAssessment.overallRisk) &&
        Objects.equals(this.oomRisk, recommendationRiskAssessment.oomRisk) &&
        Objects.equals(this.oomRiskReasoning, recommendationRiskAssessment.oomRiskReasoning) &&
        Objects.equals(this.throttlingRisk, recommendationRiskAssessment.throttlingRisk) &&
        Objects.equals(this.throttlingRiskReasoning, recommendationRiskAssessment.throttlingRiskReasoning) &&
        Objects.equals(this.performanceRisk, recommendationRiskAssessment.performanceRisk) &&
        Objects.equals(this.performanceRiskReasoning, recommendationRiskAssessment.performanceRiskReasoning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overallRisk, oomRisk, oomRiskReasoning, throttlingRisk, throttlingRiskReasoning, performanceRisk, performanceRiskReasoning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationRiskAssessment {\n");
    sb.append("    overallRisk: ").append(toIndentedString(overallRisk)).append("\n");
    sb.append("    oomRisk: ").append(toIndentedString(oomRisk)).append("\n");
    sb.append("    oomRiskReasoning: ").append(toIndentedString(oomRiskReasoning)).append("\n");
    sb.append("    throttlingRisk: ").append(toIndentedString(throttlingRisk)).append("\n");
    sb.append("    throttlingRiskReasoning: ").append(toIndentedString(throttlingRiskReasoning)).append("\n");
    sb.append("    performanceRisk: ").append(toIndentedString(performanceRisk)).append("\n");
    sb.append("    performanceRiskReasoning: ").append(toIndentedString(performanceRiskReasoning)).append("\n");
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

