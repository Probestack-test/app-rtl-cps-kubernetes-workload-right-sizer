package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.RegisterWorkloadRequestMaximumResources;
import com.probestack.forgestudio.design.model.RegisterWorkloadRequestMinimumResources;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RegisterWorkloadRequest
 */
@JsonTypeName("registerWorkload_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class RegisterWorkloadRequest {

  private String workloadName;

  private String namespace;

  private String clusterName;

  /**
   * Gets or Sets workloadType
   */
  public enum WorkloadTypeEnum {
    DEPLOYMENT("DEPLOYMENT"),
    
    STATEFULSET("STATEFULSET"),
    
    DAEMONSET("DAEMONSET"),
    
    CRONJOB("CRONJOB"),
    
    JOB("JOB");

    private String value;

    WorkloadTypeEnum(String value) {
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
    public static WorkloadTypeEnum fromValue(String value) {
      for (WorkloadTypeEnum b : WorkloadTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private WorkloadTypeEnum workloadType;

  private String containerName;

  private String owner;

  /**
   * Business criticality — drives safety margins.
   */
  public enum CriticalityEnum {
    _0("TIER_0"),
    
    _1("TIER_1"),
    
    _2("TIER_2"),
    
    _3("TIER_3");

    private String value;

    CriticalityEnum(String value) {
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
    public static CriticalityEnum fromValue(String value) {
      for (CriticalityEnum b : CriticalityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private CriticalityEnum criticality;

  private Integer analysisWindowDays = 14;

  /**
   * Expected pattern; affects safety margins.
   */
  public enum WorkloadPatternEnum {
    AUTO_DETECT("AUTO_DETECT"),
    
    STEADY("STEADY"),
    
    PERIODIC("PERIODIC"),
    
    SPIKY("SPIKY"),
    
    BATCH("BATCH"),
    
    SEASONAL("SEASONAL");

    private String value;

    WorkloadPatternEnum(String value) {
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
    public static WorkloadPatternEnum fromValue(String value) {
      for (WorkloadPatternEnum b : WorkloadPatternEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private WorkloadPatternEnum workloadPattern = WorkloadPatternEnum.AUTO_DETECT;

  private Integer safetyMarginPercent = 25;

  private RegisterWorkloadRequestMinimumResources minimumResources;

  private RegisterWorkloadRequestMaximumResources maximumResources;

  private Boolean autoApply = false;

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

  public RegisterWorkloadRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RegisterWorkloadRequest(String workloadName, String namespace, String clusterName, WorkloadTypeEnum workloadType, String containerName, String owner) {
    this.workloadName = workloadName;
    this.namespace = namespace;
    this.clusterName = clusterName;
    this.workloadType = workloadType;
    this.containerName = containerName;
    this.owner = owner;
  }

  public RegisterWorkloadRequest workloadName(String workloadName) {
    this.workloadName = workloadName;
    return this;
  }

  /**
   * Name of the Kubernetes workload.
   * @return workloadName
  */
  @NotNull   @Schema(name = "workloadName", example = "payment-processor", description = "Name of the Kubernetes workload.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("workloadName")
  public String getWorkloadName() {
    return workloadName;
  }

  public void setWorkloadName(String workloadName) {
    this.workloadName = workloadName;
  }

  public RegisterWorkloadRequest namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
  */
  @NotNull   @Schema(name = "namespace", example = "payments", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public RegisterWorkloadRequest clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * Kubernetes cluster identifier.
   * @return clusterName
  */
  @NotNull   @Schema(name = "clusterName", example = "prod-us-east-1", description = "Kubernetes cluster identifier.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public RegisterWorkloadRequest workloadType(WorkloadTypeEnum workloadType) {
    this.workloadType = workloadType;
    return this;
  }

  /**
   * Get workloadType
   * @return workloadType
  */
  @NotNull   @Schema(name = "workloadType", example = "DEPLOYMENT", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("workloadType")
  public WorkloadTypeEnum getWorkloadType() {
    return workloadType;
  }

  public void setWorkloadType(WorkloadTypeEnum workloadType) {
    this.workloadType = workloadType;
  }

  public RegisterWorkloadRequest containerName(String containerName) {
    this.containerName = containerName;
    return this;
  }

  /**
   * Specific container to right-size.
   * @return containerName
  */
  @NotNull   @Schema(name = "containerName", example = "payment-processor", description = "Specific container to right-size.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("containerName")
  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }

  public RegisterWorkloadRequest owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Team owning this workload.
   * @return owner
  */
  @NotNull   @Schema(name = "owner", example = "payments-team", description = "Team owning this workload.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public RegisterWorkloadRequest criticality(CriticalityEnum criticality) {
    this.criticality = criticality;
    return this;
  }

  /**
   * Business criticality — drives safety margins.
   * @return criticality
  */
    @Schema(name = "criticality", example = "TIER_0", description = "Business criticality — drives safety margins.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("criticality")
  public CriticalityEnum getCriticality() {
    return criticality;
  }

  public void setCriticality(CriticalityEnum criticality) {
    this.criticality = criticality;
  }

  public RegisterWorkloadRequest analysisWindowDays(Integer analysisWindowDays) {
    this.analysisWindowDays = analysisWindowDays;
    return this;
  }

  /**
   * How much historical usage to analyze.
   * minimum: 3
   * maximum: 30
   * @return analysisWindowDays
  */
  @Min(3) @Max(30)   @Schema(name = "analysisWindowDays", example = "14", description = "How much historical usage to analyze.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("analysisWindowDays")
  public Integer getAnalysisWindowDays() {
    return analysisWindowDays;
  }

  public void setAnalysisWindowDays(Integer analysisWindowDays) {
    this.analysisWindowDays = analysisWindowDays;
  }

  public RegisterWorkloadRequest workloadPattern(WorkloadPatternEnum workloadPattern) {
    this.workloadPattern = workloadPattern;
    return this;
  }

  /**
   * Expected pattern; affects safety margins.
   * @return workloadPattern
  */
    @Schema(name = "workloadPattern", example = "PERIODIC", description = "Expected pattern; affects safety margins.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workloadPattern")
  public WorkloadPatternEnum getWorkloadPattern() {
    return workloadPattern;
  }

  public void setWorkloadPattern(WorkloadPatternEnum workloadPattern) {
    this.workloadPattern = workloadPattern;
  }

  public RegisterWorkloadRequest safetyMarginPercent(Integer safetyMarginPercent) {
    this.safetyMarginPercent = safetyMarginPercent;
    return this;
  }

  /**
   * Buffer above P95 usage for recommendations.
   * minimum: 10
   * maximum: 100
   * @return safetyMarginPercent
  */
  @Min(10) @Max(100)   @Schema(name = "safetyMarginPercent", example = "25", description = "Buffer above P95 usage for recommendations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("safetyMarginPercent")
  public Integer getSafetyMarginPercent() {
    return safetyMarginPercent;
  }

  public void setSafetyMarginPercent(Integer safetyMarginPercent) {
    this.safetyMarginPercent = safetyMarginPercent;
  }

  public RegisterWorkloadRequest minimumResources(RegisterWorkloadRequestMinimumResources minimumResources) {
    this.minimumResources = minimumResources;
    return this;
  }

  /**
   * Get minimumResources
   * @return minimumResources
  */
  @Valid   @Schema(name = "minimumResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minimumResources")
  public RegisterWorkloadRequestMinimumResources getMinimumResources() {
    return minimumResources;
  }

  public void setMinimumResources(RegisterWorkloadRequestMinimumResources minimumResources) {
    this.minimumResources = minimumResources;
  }

  public RegisterWorkloadRequest maximumResources(RegisterWorkloadRequestMaximumResources maximumResources) {
    this.maximumResources = maximumResources;
    return this;
  }

  /**
   * Get maximumResources
   * @return maximumResources
  */
  @Valid   @Schema(name = "maximumResources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximumResources")
  public RegisterWorkloadRequestMaximumResources getMaximumResources() {
    return maximumResources;
  }

  public void setMaximumResources(RegisterWorkloadRequestMaximumResources maximumResources) {
    this.maximumResources = maximumResources;
  }

  public RegisterWorkloadRequest autoApply(Boolean autoApply) {
    this.autoApply = autoApply;
    return this;
  }

  /**
   * If true, apply recommendations automatically with rollback.
   * @return autoApply
  */
    @Schema(name = "autoApply", example = "false", description = "If true, apply recommendations automatically with rollback.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoApply")
  public Boolean getAutoApply() {
    return autoApply;
  }

  public void setAutoApply(Boolean autoApply) {
    this.autoApply = autoApply;
  }

  public RegisterWorkloadRequest notifyChannels(List<NotifyChannelsEnum> notifyChannels) {
    this.notifyChannels = notifyChannels;
    return this;
  }

  public RegisterWorkloadRequest addNotifyChannelsItem(NotifyChannelsEnum notifyChannelsItem) {
    if (this.notifyChannels == null) {
      this.notifyChannels = new ArrayList<>();
    }
    this.notifyChannels.add(notifyChannelsItem);
    return this;
  }

  /**
   * Channels for recommendation notifications.
   * @return notifyChannels
  */
    @Schema(name = "notifyChannels", example = "[\"SLACK\"]", description = "Channels for recommendation notifications.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    RegisterWorkloadRequest registerWorkloadRequest = (RegisterWorkloadRequest) o;
    return Objects.equals(this.workloadName, registerWorkloadRequest.workloadName) &&
        Objects.equals(this.namespace, registerWorkloadRequest.namespace) &&
        Objects.equals(this.clusterName, registerWorkloadRequest.clusterName) &&
        Objects.equals(this.workloadType, registerWorkloadRequest.workloadType) &&
        Objects.equals(this.containerName, registerWorkloadRequest.containerName) &&
        Objects.equals(this.owner, registerWorkloadRequest.owner) &&
        Objects.equals(this.criticality, registerWorkloadRequest.criticality) &&
        Objects.equals(this.analysisWindowDays, registerWorkloadRequest.analysisWindowDays) &&
        Objects.equals(this.workloadPattern, registerWorkloadRequest.workloadPattern) &&
        Objects.equals(this.safetyMarginPercent, registerWorkloadRequest.safetyMarginPercent) &&
        Objects.equals(this.minimumResources, registerWorkloadRequest.minimumResources) &&
        Objects.equals(this.maximumResources, registerWorkloadRequest.maximumResources) &&
        Objects.equals(this.autoApply, registerWorkloadRequest.autoApply) &&
        Objects.equals(this.notifyChannels, registerWorkloadRequest.notifyChannels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workloadName, namespace, clusterName, workloadType, containerName, owner, criticality, analysisWindowDays, workloadPattern, safetyMarginPercent, minimumResources, maximumResources, autoApply, notifyChannels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterWorkloadRequest {\n");
    sb.append("    workloadName: ").append(toIndentedString(workloadName)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
    sb.append("    analysisWindowDays: ").append(toIndentedString(analysisWindowDays)).append("\n");
    sb.append("    workloadPattern: ").append(toIndentedString(workloadPattern)).append("\n");
    sb.append("    safetyMarginPercent: ").append(toIndentedString(safetyMarginPercent)).append("\n");
    sb.append("    minimumResources: ").append(toIndentedString(minimumResources)).append("\n");
    sb.append("    maximumResources: ").append(toIndentedString(maximumResources)).append("\n");
    sb.append("    autoApply: ").append(toIndentedString(autoApply)).append("\n");
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

