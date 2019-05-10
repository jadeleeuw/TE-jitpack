/*
 * Railways API Game!
 * Find your way in the Tokyo railway system!
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sdk.serialization.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Task
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-10T16:08:05.987300+02:00[Europe/Amsterdam]")
public class Task {
  @JsonProperty("start")
  private Integer start;

  @JsonProperty("finish")
  private Integer finish;

  public Task start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public Task finish(Integer finish) {
    this.finish = finish;
    return this;
  }

   /**
   * Get finish
   * @return finish
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getFinish() {
    return finish;
  }

  public void setFinish(Integer finish) {
    this.finish = finish;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.start, task.start) &&
        Objects.equals(this.finish, task.finish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, finish);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    finish: ").append(toIndentedString(finish)).append("\n");
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

