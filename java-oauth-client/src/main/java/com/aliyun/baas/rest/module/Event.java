/*
 * BaaS API Gateway
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.aliyun.baas.rest.module;

import java.util.Objects;
import java.util.Arrays;
import com.aliyun.baas.rest.module.EventType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Event
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-12T03:32:15.669Z[GMT]")
public class Event {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("instance_id")
  private String instanceId = null;

  @JsonProperty("network")
  private String network = null;

  @JsonProperty("type")
  private EventType type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("content")
  private Object content = null;

  public Event id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for event
   * @return id
  **/
  @Schema(required = true, description = "The unique identifier for event")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Event instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * The id of the gateway instance
   * @return instanceId
  **/
  @Schema(required = true, description = "The id of the gateway instance")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public Event network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Network name. In hyperledger fabric, network name is channel name.
   * @return network
  **/
  @Schema(required = true, description = "Network name. In hyperledger fabric, network name is channel name.")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public Event type(EventType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public EventType getType() {
    return type;
  }

  public void setType(EventType type) {
    this.type = type;
  }

  public Event name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of event
   * @return name
  **/
  @Schema(required = true, description = "The name of event")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Event content(Object content) {
    this.content = content;
    return this;
  }

   /**
   * The data of event
   * @return content
  **/
  @Schema(required = true, description = "The data of event")
  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.id, event.id) &&
        Objects.equals(this.instanceId, event.instanceId) &&
        Objects.equals(this.network, event.network) &&
        Objects.equals(this.type, event.type) &&
        Objects.equals(this.name, event.name) &&
        Objects.equals(this.content, event.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instanceId, network, type, name, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
