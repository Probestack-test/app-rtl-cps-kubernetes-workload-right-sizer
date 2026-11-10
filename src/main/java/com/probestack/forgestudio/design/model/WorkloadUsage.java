package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.probestack.forgestudio.design.model.WorkloadUsageCpu;
import com.probestack.forgestudio.design.model.WorkloadUsageMemory;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Actual usage over the analysis window.
 */
@Schema(name = "Workload_usage", description = "Actual usage over the analysis window.")
@JsonTypeName("Workload_usage")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")public class WorkloadUsage {

  private WorkloadUsageCpu cpu;

  private WorkloadUsageMemory memory;

  private Integer oomKillsLastWindow;

  private Integer throttlingEventsLastWindow;

  public WorkloadUsage cpu(WorkloadUsageCpu cpu) {
    this.cpu = cpu;
    return this;
  }

  /**
   * Get cpu
   * @return cpu
  */
  @Valid   @Schema(name = "cpu", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cpu")
  public WorkloadUsageCpu getCpu() {
    return cpu;
  }

  public void setCpu(WorkloadUsageCpu cpu) {
    this.cpu = cpu;
  }

  public WorkloadUsage memory(WorkloadUsageMemory memory) {
    this.memory = memory;
    return this;
  }

  /**
   * Get memory
   * @return memory
  */
  @Valid   @Schema(name = "memory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memory")
  public WorkloadUsageMemory getMemory() {
    return memory;
  }

  public void setMemory(WorkloadUsageMemory memory) {
    this.memory = memory;
  }

  public WorkloadUsage oomKillsLastWindow(Integer oomKillsLastWindow) {
    this.oomKillsLastWindow = oomKillsLastWindow;
    return this;
  }

  /**
   * OOMKill count in the analysis window.
   * @return oomKillsLastWindow
  */
    @Schema(name = "oomKillsLastWindow", example = "0", description = "OOMKill count in the analysis window.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oomKillsLastWindow")
  public Integer getOomKillsLastWindow() {
    return oomKillsLastWindow;
  }

  public void setOomKillsLastWindow(Integer oomKillsLastWindow) {
    this.oomKillsLastWindow = oomKillsLastWindow;
  }

  public WorkloadUsage throttlingEventsLastWindow(Integer throttlingEventsLastWindow) {
    this.throttlingEventsLastWindow = throttlingEventsLastWindow;
    return this;
  }

  /**
   * CPU throttling events in the analysis window.
   * @return throttlingEventsLastWindow
  */
    @Schema(name = "throttlingEventsLastWindow", example = "12", description = "CPU throttling events in the analysis window.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("throttlingEventsLastWindow")
  public Integer getThrottlingEventsLastWindow() {
    return throttlingEventsLastWindow;
  }

  public void setThrottlingEventsLastWindow(Integer throttlingEventsLastWindow) {
    this.throttlingEventsLastWindow = throttlingEventsLastWindow;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkloadUsage workloadUsage = (WorkloadUsage) o;
    return Objects.equals(this.cpu, workloadUsage.cpu) &&
        Objects.equals(this.memory, workloadUsage.memory) &&
        Objects.equals(this.oomKillsLastWindow, workloadUsage.oomKillsLastWindow) &&
        Objects.equals(this.throttlingEventsLastWindow, workloadUsage.throttlingEventsLastWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, memory, oomKillsLastWindow, throttlingEventsLastWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkloadUsage {\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    oomKillsLastWindow: ").append(toIndentedString(oomKillsLastWindow)).append("\n");
    sb.append("    throttlingEventsLastWindow: ").append(toIndentedString(throttlingEventsLastWindow)).append("\n");
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

