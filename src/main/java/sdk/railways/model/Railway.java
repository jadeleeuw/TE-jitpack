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


package sdk.railways.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Railway
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-04-05T17:38:51.364752+02:00[Europe/Amsterdam]")
public class Railway {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("connectedStations")
  private List<Integer> connectedStations = new ArrayList<>();

  public Railway id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Railway name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Railway connectedStations(List<Integer> connectedStations) {
    this.connectedStations = connectedStations;
    return this;
  }

  public Railway addConnectedStationsItem(Integer connectedStationsItem) {
    this.connectedStations.add(connectedStationsItem);
    return this;
  }

   /**
   * Get connectedStations
   * @return connectedStations
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Integer> getConnectedStations() {
    return connectedStations;
  }

  public void setConnectedStations(List<Integer> connectedStations) {
    this.connectedStations = connectedStations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Railway railway = (Railway) o;
    return Objects.equals(this.id, railway.id) &&
        Objects.equals(this.name, railway.name) &&
        Objects.equals(this.connectedStations, railway.connectedStations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, connectedStations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Railway {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    connectedStations: ").append(toIndentedString(connectedStations)).append("\n");
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

