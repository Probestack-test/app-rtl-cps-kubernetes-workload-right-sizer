package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ApplyRecommendationRequest
 */
@JsonTypeName("applyRecommendation_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class ApplyRecommendationRequest {

  /**
   * How to apply the recommendation.
   */
  public enum ModeEnum {
    DRY_RUN("DRY_RUN"),
    
    STAGED("STAGED"),
    
    IMMEDIATE("IMMEDIATE");

    private String value;

    ModeEnum(String value) {
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
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ModeEnum mode;

  private String reason;

  private String appliedBy;

  private Boolean autoRollbackOnOom = true;

  private Integer rollbackWindowHours = 24;

  /**
   * Gets or Sets notifyChannels
   */
  public enum NotifyChannelsEnum {
    EMAIL("EMAIL"),
    
    SLACK("SLACK"),
    
    WEBHOOK("WEBHOOK");

    private String value;

    NotifyChannelsEnum(String value) {
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
    public static NotifyChannelsEnum fromValue(String value) {
      for (NotifyChannelsEnum b : NotifyChannelsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  @Valid
  private List<NotifyChannelsEnum> notifyChannels;

  public ApplyRecommendationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApplyRecommendationRequest(ModeEnum mode, String reason) {
    this.mode = mode;
    this.reason = reason;
  }

  public ApplyRecommendationRequest mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * How to apply the recommendation.
   * @return mode
  */
  @NotNull   @Schema(name = "mode", example = "STAGED", description = "How to apply the recommendation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mode")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public ApplyRecommendationRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Justification for the apply (min 15 chars).
   * @return reason
  */
  @NotNull @Size(min = 15)   @Schema(name = "reason", example = "CPU requests 4x over P95; safe to reduce with 25% buffer.", description = "Justification for the apply (min 15 chars).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ApplyRecommendationRequest appliedBy(String appliedBy) {
    this.appliedBy = appliedBy;
    return this;
  }

  /**
   * Get appliedBy
   * @return appliedBy
  */
    @Schema(name = "appliedBy", example = "amit.kumar@forgesphere.example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appliedBy")
  public String getAppliedBy() {
    return appliedBy;
  }

  public void setAppliedBy(String appliedBy) {
    this.appliedBy = appliedBy;
  }

  public ApplyRecommendationRequest autoRollbackOnOom(Boolean autoRollbackOnOom) {
    this.autoRollbackOnOom = autoRollbackOnOom;
    return this;
  }

  /**
   * Auto-rollback if OOMKills occur post-apply.
   * @return autoRollbackOnOom
  */
    @Schema(name = "autoRollbackOnOom", example = "true", description = "Auto-rollback if OOMKills occur post-apply.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoRollbackOnOom")
  public Boolean getAutoRollbackOnOom() {
    return autoRollbackOnOom;
  }

  public void setAutoRollbackOnOom(Boolean autoRollbackOnOom) {
    this.autoRollbackOnOom = autoRollbackOnOom;
  }

  public ApplyRecommendationRequest rollbackWindowHours(Integer rollbackWindowHours) {
    this.rollbackWindowHours = rollbackWindowHours;
    return this;
  }

  /**
   * How long to monitor for regressions before finalizing.
   * minimum: 1
   * maximum: 72
   * @return rollbackWindowHours
  */
  @Min(1) @Max(72)   @Schema(name = "rollbackWindowHours", example = "24", description = "How long to monitor for regressions before finalizing.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rollbackWindowHours")
  public Integer getRollbackWindowHours() {
    return rollbackWindowHours;
  }

  public void setRollbackWindowHours(Integer rollbackWindowHours) {
    this.rollbackWindowHours = rollbackWindowHours;
  }

  public ApplyRecommendationRequest notifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
    return this;
  }

  public ApplyRecommendationRequest addNotifyChannelsItem(NotifyChannelsEnum notifyChannelsItem) {
    if (this.notifyChannels == null) {
      this.notifyChannels = new ArrayList<>();
    }
    this.notifyChannels.add(notifyChannelsItem);
    return this;
  }

  /**
   * Get notifyChannels
   * @return notifyChannels
  */
    @Schema(name = "notifyChannels", example = "[\"SLACK\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifyChannels")
  public List<NotifyChannelsEnum> getNotifyChannels() {
    return notifyChannels;
  }

  public void setNotifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyRecommendationRequest applyRecommendationRequest = (ApplyRecommendationRequest) o;
    return Objects.equals(this.mode, applyRecommendationRequest.mode) &&
        Objects.equals(this.reason, applyRecommendationRequest.reason) &&
        Objects.equals(this.appliedBy, applyRecommendationRequest.appliedBy) &&
        Objects.equals(this.autoRollbackOnOom, applyRecommendationRequest.autoRollbackOnOom) &&
        Objects.equals(this.rollbackWindowHours, applyRecommendationRequest.rollbackWindowHours) &&
        Objects.equals(this.notifyChannels, applyRecommendationRequest.notifyChannels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, reason, appliedBy, autoRollbackOnOom, rollbackWindowHours, notifyChannels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyRecommendationRequest {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    appliedBy: ").append(toIndentedString(appliedBy)).append("\n");
    sb.append("    autoRollbackOnOom: ").append(toIndentedString(autoRollbackOnOom)).append("\n");
    sb.append("    rollbackWindowHours: ").append(toIndentedString(rollbackWindowHours)).append("\n");
    sb.append("    notifyChannels: ").append(toIndentedString(notifyChannels)).append("\n");
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

