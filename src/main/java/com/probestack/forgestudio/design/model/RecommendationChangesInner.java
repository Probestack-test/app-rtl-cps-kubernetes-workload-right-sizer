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
 * RecommendationChangesInner
 */
@JsonTypeName("Recommendation_changes_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class RecommendationChangesInner {

  private String field;

  private String currentValue;

  private String newValue;

  /**
   * Gets or Sets changeType
   */
  public enum ChangeTypeEnum {
    DECREASE("DECREASE"),
    
    INCREASE("INCREASE"),
    
    NO_CHANGE("NO_CHANGE");

    private String value;

    ChangeTypeEnum(String value) {
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
    public static ChangeTypeEnum fromValue(String value) {
      for (ChangeTypeEnum b : ChangeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ChangeTypeEnum changeType;

  private Double changePercent;

  public RecommendationChangesInner field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
  */
    @Schema(name = "field", example = "resources.requests.cpu", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public RecommendationChangesInner currentValue(String currentValue) {
    this.currentValue = currentValue;
    return this;
  }

  /**
   * Get currentValue
   * @return currentValue
  */
    @Schema(name = "currentValue", example = "2000m", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentValue")
  public String getCurrentValue() {
    return currentValue;
  }

  public void setCurrentValue(String currentValue) {
    this.currentValue = currentValue;
  }

  public RecommendationChangesInner newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

  /**
   * Get newValue
   * @return newValue
  */
    @Schema(name = "newValue", example = "500m", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("newValue")
  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }

  public RecommendationChangesInner changeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * Get changeType
   * @return changeType
  */
    @Schema(name = "changeType", example = "DECREASE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changeType")
  public ChangeTypeEnum getChangeType() {
    return changeType;
  }

  public void setChangeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
  }

  public RecommendationChangesInner changePercent(Double changePercent) {
    this.changePercent = changePercent;
    return this;
  }

  /**
   * Get changePercent
   * @return changePercent
  */
    @Schema(name = "changePercent", example = "-75.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changePercent")
  public Double getChangePercent() {
    return changePercent;
  }

  public void setChangePercent(Double changePercent) {
    this.changePercent = changePercent;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationChangesInner recommendationChangesInner = (RecommendationChangesInner) o;
    return Objects.equals(this.field, recommendationChangesInner.field) &&
        Objects.equals(this.currentValue, recommendationChangesInner.currentValue) &&
        Objects.equals(this.newValue, recommendationChangesInner.newValue) &&
        Objects.equals(this.changeType, recommendationChangesInner.changeType) &&
        Objects.equals(this.changePercent, recommendationChangesInner.changePercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, currentValue, newValue, changeType, changePercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationChangesInner {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    changePercent: ").append(toIndentedString(changePercent)).append("\n");
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

