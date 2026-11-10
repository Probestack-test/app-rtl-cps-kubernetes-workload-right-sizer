package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.RecommendationAlternativesInner;
import com.probestack.forgestudio.design.model.RecommendationChangesInner;
import com.probestack.forgestudio.design.model.RecommendationProjectedSavings;
import com.probestack.forgestudio.design.model.RecommendationRecommendedResources;
import com.probestack.forgestudio.design.model.RecommendationRiskAssessment;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Recommendation
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class Recommendation {

  private UUID recommendationId;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    APPLIED("APPLIED"),
    
    REJECTED("REJECTED"),
    
    STALE("STALE"),
    
    EXPIRED("EXPIRED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StatusEnum status;

  private RecommendationRecommendedResources recommendedResources;

  @Valid
  private List<@Valid RecommendationChangesInner> changes = new ArrayList<>();

  @Valid
  private List<String> rationale;

  private RecommendationProjectedSavings projectedSavings;

  private RecommendationRiskAssessment riskAssessment;

  private BigDecimal confidenceScore;

  @Valid
  private List<@Valid RecommendationAlternativesInner> alternatives;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime generatedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiresAt;

  public Recommendation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Recommendation(UUID recommendationId, StatusEnum status, RecommendationRecommendedResources recommendedResources, List<@Valid RecommendationChangesInner> changes, RecommendationProjectedSavings projectedSavings, RecommendationRiskAssessment riskAssessment, OffsetDateTime generatedAt) {
    this.recommendationId = recommendationId;
    this.status = status;
    this.recommendedResources = recommendedResources;
    this.changes = changes;
    this.projectedSavings = projectedSavings;
    this.riskAssessment = riskAssessment;
    this.generatedAt = generatedAt;
  }

  public Recommendation recommendationId(UUID recommendationId) {
    this.recommendationId = recommendationId;
    return this;
  }

  /**
   * Get recommendationId
   * @return recommendationId
  */
  @NotNull @Valid   @Schema(name = "recommendationId", example = "b1a2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recommendationId")
  public UUID getRecommendationId() {
    return recommendationId;
  }

  public void setRecommendationId(UUID recommendationId) {
    this.recommendationId = recommendationId;
  }

  public Recommendation status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "PENDING", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Recommendation recommendedResources(RecommendationRecommendedResources recommendedResources) {
    this.recommendedResources = recommendedResources;
    return this;
  }

  /**
   * Get recommendedResources
   * @return recommendedResources
  */
  @NotNull @Valid   @Schema(name = "recommendedResources", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recommendedResources")
  public RecommendationRecommendedResources getRecommendedResources() {
    return recommendedResources;
  }

  public void setRecommendedResources(RecommendationRecommendedResources recommendedResources) {
    this.recommendedResources = recommendedResources;
  }

  public Recommendation changes(List<@Valid RecommendationChangesInner> changes) {
    this.changes = changes;
    return this;
  }

  public Recommendation addChangesItem(RecommendationChangesInner changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<>();
    }
    this.changes.add(changesItem);
    return this;
  }

  /**
   * What specifically changes (for transparency).
   * @return changes
  */
  @NotNull @Valid   @Schema(name = "changes", description = "What specifically changes (for transparency).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("changes")
  public List<@Valid RecommendationChangesInner> getChanges() {
    return changes;
  }

  public void setChanges(List<@Valid RecommendationChangesInner> changes) {
    this.changes = changes;
  }

  public Recommendation rationale(List<String> rationale) {
    this.rationale = rationale;
    return this;
  }

  public Recommendation addRationaleItem(String rationaleItem) {
    if (this.rationale == null) {
      this.rationale = new ArrayList<>();
    }
    this.rationale.add(rationaleItem);
    return this;
  }

  /**
   * Why these values were chosen.
   * @return rationale
  */
    @Schema(name = "rationale", example = "[\"P95 CPU usage is 420m; recommending 500m with 19% buffer.\",\"Peak CPU (1450m) occurs during hourly batch; limit set to 1000m may cause throttling.\",\"Memory P99 is 1580Mi; recommending 1536Mi request risks OOM during peaks — recommend 1536Mi.\"]", description = "Why these values were chosen.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rationale")
  public List<String> getRationale() {
    return rationale;
  }

  public void setRationale(List<String> rationale) {
    this.rationale = rationale;
  }

  public Recommendation projectedSavings(RecommendationProjectedSavings projectedSavings) {
    this.projectedSavings = projectedSavings;
    return this;
  }

  /**
   * Get projectedSavings
   * @return projectedSavings
  */
  @NotNull @Valid   @Schema(name = "projectedSavings", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("projectedSavings")
  public RecommendationProjectedSavings getProjectedSavings() {
    return projectedSavings;
  }

  public void setProjectedSavings(RecommendationProjectedSavings projectedSavings) {
    this.projectedSavings = projectedSavings;
  }

  public Recommendation riskAssessment(RecommendationRiskAssessment riskAssessment) {
    this.riskAssessment = riskAssessment;
    return this;
  }

  /**
   * Get riskAssessment
   * @return riskAssessment
  */
  @NotNull @Valid   @Schema(name = "riskAssessment", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("riskAssessment")
  public RecommendationRiskAssessment getRiskAssessment() {
    return riskAssessment;
  }

  public void setRiskAssessment(RecommendationRiskAssessment riskAssessment) {
    this.riskAssessment = riskAssessment;
  }

  public Recommendation confidenceScore(BigDecimal confidenceScore) {
    this.confidenceScore = confidenceScore;
    return this;
  }

  /**
   * Confidence in the recommendation (0-1).
   * minimum: 0
   * maximum: 1
   * @return confidenceScore
  */
  @Valid @DecimalMin("0") @DecimalMax("1")   @Schema(name = "confidenceScore", example = "0.87", description = "Confidence in the recommendation (0-1).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("confidenceScore")
  public BigDecimal getConfidenceScore() {
    return confidenceScore;
  }

  public void setConfidenceScore(BigDecimal confidenceScore) {
    this.confidenceScore = confidenceScore;
  }

  public Recommendation alternatives(List<@Valid RecommendationAlternativesInner> alternatives) {
    this.alternatives = alternatives;
    return this;
  }

  public Recommendation addAlternativesItem(RecommendationAlternativesInner alternativesItem) {
    if (this.alternatives == null) {
      this.alternatives = new ArrayList<>();
    }
    this.alternatives.add(alternativesItem);
    return this;
  }

  /**
   * Alternative recommendations if the primary is rejected.
   * @return alternatives
  */
  @Valid   @Schema(name = "alternatives", description = "Alternative recommendations if the primary is rejected.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alternatives")
  public List<@Valid RecommendationAlternativesInner> getAlternatives() {
    return alternatives;
  }

  public void setAlternatives(List<@Valid RecommendationAlternativesInner> alternatives) {
    this.alternatives = alternatives;
  }

  public Recommendation generatedAt(OffsetDateTime generatedAt) {
    this.generatedAt = generatedAt;
    return this;
  }

  /**
   * Get generatedAt
   * @return generatedAt
  */
  @NotNull @Valid   @Schema(name = "generatedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generatedAt")
  public OffsetDateTime getGeneratedAt() {
    return generatedAt;
  }

  public void setGeneratedAt(OffsetDateTime generatedAt) {
    this.generatedAt = generatedAt;
  }

  public Recommendation expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Recommendations become STALE after this window.
   * @return expiresAt
  */
  @Valid   @Schema(name = "expiresAt", example = "2026-11-12T14:30Z", description = "Recommendations become STALE after this window.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiresAt")
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recommendation recommendation = (Recommendation) o;
    return Objects.equals(this.recommendationId, recommendation.recommendationId) &&
        Objects.equals(this.status, recommendation.status) &&
        Objects.equals(this.recommendedResources, recommendation.recommendedResources) &&
        Objects.equals(this.changes, recommendation.changes) &&
        Objects.equals(this.rationale, recommendation.rationale) &&
        Objects.equals(this.projectedSavings, recommendation.projectedSavings) &&
        Objects.equals(this.riskAssessment, recommendation.riskAssessment) &&
        Objects.equals(this.confidenceScore, recommendation.confidenceScore) &&
        Objects.equals(this.alternatives, recommendation.alternatives) &&
        Objects.equals(this.generatedAt, recommendation.generatedAt) &&
        Objects.equals(this.expiresAt, recommendation.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendationId, status, recommendedResources, changes, rationale, projectedSavings, riskAssessment, confidenceScore, alternatives, generatedAt, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recommendation {\n");
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    recommendedResources: ").append(toIndentedString(recommendedResources)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    rationale: ").append(toIndentedString(rationale)).append("\n");
    sb.append("    projectedSavings: ").append(toIndentedString(projectedSavings)).append("\n");
    sb.append("    riskAssessment: ").append(toIndentedString(riskAssessment)).append("\n");
    sb.append("    confidenceScore: ").append(toIndentedString(confidenceScore)).append("\n");
    sb.append("    alternatives: ").append(toIndentedString(alternatives)).append("\n");
    sb.append("    generatedAt: ").append(toIndentedString(generatedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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

