package com.rj.optimise.vo;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;


/**
 * OptimseTask
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2020-05-21T23:34:58.667+08:00")
@Builder
public class OptimseTask   {
  private String requestKey = null;

  private String usrId = null;

  private String taskId = null;

  private Long startTime = null;

  private Long approvTime = null;

  private Integer splice = null;

  private String pceInstance = null;

  /**
   * Gets or Sets stateEum
   */
  public enum StateEumEnum {
    AVAILABLE("available"),
    
    PENDING("pending"),
    
    SOLD("sold");

    private String value;

    StateEumEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StateEumEnum stateEum = null;

  private Integer downloadingProgress = null;

  public OptimseTask requestKey(String requestKey) {
    this.requestKey = requestKey;
    return this;
  }

   /**
   * Get requestKey
   * @return requestKey
  **/
  @ApiModelProperty(value = "")
  public String getRequestKey() {
    return requestKey;
  }

  public void setRequestKey(String requestKey) {
    this.requestKey = requestKey;
  }

  public OptimseTask usrId(String usrId) {
    this.usrId = usrId;
    return this;
  }

   /**
   * Get usrId
   * @return usrId
  **/
  @ApiModelProperty(value = "")
  public String getUsrId() {
    return usrId;
  }

  public void setUsrId(String usrId) {
    this.usrId = usrId;
  }

  public OptimseTask taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @ApiModelProperty(value = "")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public OptimseTask startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public OptimseTask approvTime(Long approvTime) {
    this.approvTime = approvTime;
    return this;
  }

   /**
   * Get approvTime
   * @return approvTime
  **/
  @ApiModelProperty(value = "")
  public Long getApprovTime() {
    return approvTime;
  }

  public void setApprovTime(Long approvTime) {
    this.approvTime = approvTime;
  }

  public OptimseTask splice(Integer splice) {
    this.splice = splice;
    return this;
  }

   /**
   * Get splice
   * @return splice
  **/
  @ApiModelProperty(value = "")
  public Integer getSplice() {
    return splice;
  }

  public void setSplice(Integer splice) {
    this.splice = splice;
  }

  public OptimseTask pceInstance(String pceInstance) {
    this.pceInstance = pceInstance;
    return this;
  }

   /**
   * Get pceInstance
   * @return pceInstance
  **/
  @ApiModelProperty(value = "")
  public String getPceInstance() {
    return pceInstance;
  }

  public void setPceInstance(String pceInstance) {
    this.pceInstance = pceInstance;
  }

  public OptimseTask stateEum(StateEumEnum stateEum) {
    this.stateEum = stateEum;
    return this;
  }

   /**
   * Get stateEum
   * @return stateEum
  **/
  @ApiModelProperty(value = "")
  public StateEumEnum getStateEum() {
    return stateEum;
  }

  public void setStateEum(StateEumEnum stateEum) {
    this.stateEum = stateEum;
  }

  public OptimseTask downloadingProgress(Integer downloadingProgress) {
    this.downloadingProgress = downloadingProgress;
    return this;
  }

   /**
   * Get downloadingProgress
   * @return downloadingProgress
  **/
  @ApiModelProperty(value = "")
  public Integer getDownloadingProgress() {
    return downloadingProgress;
  }

  public void setDownloadingProgress(Integer downloadingProgress) {
    this.downloadingProgress = downloadingProgress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimseTask optimseTask = (OptimseTask) o;
    return Objects.equals(this.requestKey, optimseTask.requestKey) &&
        Objects.equals(this.usrId, optimseTask.usrId) &&
        Objects.equals(this.taskId, optimseTask.taskId) &&
        Objects.equals(this.startTime, optimseTask.startTime) &&
        Objects.equals(this.approvTime, optimseTask.approvTime) &&
        Objects.equals(this.splice, optimseTask.splice) &&
        Objects.equals(this.pceInstance, optimseTask.pceInstance) &&
        Objects.equals(this.stateEum, optimseTask.stateEum) &&
        Objects.equals(this.downloadingProgress, optimseTask.downloadingProgress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestKey, usrId, taskId, startTime, approvTime, splice, pceInstance, stateEum, downloadingProgress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimseTask {\n");
    
    sb.append("    requestKey: ").append(toIndentedString(requestKey)).append("\n");
    sb.append("    usrId: ").append(toIndentedString(usrId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    approvTime: ").append(toIndentedString(approvTime)).append("\n");
    sb.append("    splice: ").append(toIndentedString(splice)).append("\n");
    sb.append("    pceInstance: ").append(toIndentedString(pceInstance)).append("\n");
    sb.append("    stateEum: ").append(toIndentedString(stateEum)).append("\n");
    sb.append("    downloadingProgress: ").append(toIndentedString(downloadingProgress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

