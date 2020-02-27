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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
/**
 * Body
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-02-12T03:32:15.669Z[GMT]")
public class Body {
  @JsonProperty("transaction")
  private Object transaction = null;

  @JsonProperty("oss_endpoint")
  private String ossEndpoint = "oss-cn-hangzhou.aliyuncs.com";

  @JsonProperty("oss_bucket")
  private String ossBucket = "baas-oss-demo";

  @JsonProperty("data")
  private File data = null;

  @JsonProperty("oss_path")
  private String ossPath = "notary-data/91ed5f8a-a5eb";

  @JsonProperty("notary_id")
  private String notaryId = "91ed5f8a-a5eb";

  public Body transaction(Object transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * Transaction object, same with invoke
   * @return transaction
  **/
  @Schema(required = true, description = "Transaction object, same with invoke")
  public Object getTransaction() {
    return transaction;
  }

  public void setTransaction(Object transaction) {
    this.transaction = transaction;
  }

  public Body ossEndpoint(String ossEndpoint) {
    this.ossEndpoint = ossEndpoint;
    return this;
  }

   /**
   * Your OSS endpoint
   * @return ossEndpoint
  **/
  @Schema(required = true, description = "Your OSS endpoint")
  public String getOssEndpoint() {
    return ossEndpoint;
  }

  public void setOssEndpoint(String ossEndpoint) {
    this.ossEndpoint = ossEndpoint;
  }

  public Body ossBucket(String ossBucket) {
    this.ossBucket = ossBucket;
    return this;
  }

   /**
   * Your OSS bucket name
   * @return ossBucket
  **/
  @Schema(required = true, description = "Your OSS bucket name")
  public String getOssBucket() {
    return ossBucket;
  }

  public void setOssBucket(String ossBucket) {
    this.ossBucket = ossBucket;
  }

  public Body data(File data) {
    this.data = data;
    return this;
  }

   /**
   * Object data
   * @return data
  **/
  @Schema(required = true, description = "Object data")
  public File getData() {
    return data;
  }

  public void setData(File data) {
    this.data = data;
  }

  public Body ossPath(String ossPath) {
    this.ossPath = ossPath;
    return this;
  }

   /**
   * Optional, object file path in oss, gateway will save object in root directory with notary_id if this field is empty.
   * @return ossPath
  **/
  @Schema(description = "Optional, object file path in oss, gateway will save object in root directory with notary_id if this field is empty.")
  public String getOssPath() {
    return ossPath;
  }

  public void setOssPath(String ossPath) {
    this.ossPath = ossPath;
  }

  public Body notaryId(String notaryId) {
    this.notaryId = notaryId;
    return this;
  }

   /**
   * Optional, gateway will try to use this field as notary id if set.
   * @return notaryId
  **/
  @Schema(description = "Optional, gateway will try to use this field as notary id if set.")
  public String getNotaryId() {
    return notaryId;
  }

  public void setNotaryId(String notaryId) {
    this.notaryId = notaryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body body = (Body) o;
    return Objects.equals(this.transaction, body.transaction) &&
        Objects.equals(this.ossEndpoint, body.ossEndpoint) &&
        Objects.equals(this.ossBucket, body.ossBucket) &&
        Objects.equals(this.data, body.data) &&
        Objects.equals(this.ossPath, body.ossPath) &&
        Objects.equals(this.notaryId, body.notaryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transaction, ossEndpoint, ossBucket, Objects.hashCode(data), ossPath, notaryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    ossEndpoint: ").append(toIndentedString(ossEndpoint)).append("\n");
    sb.append("    ossBucket: ").append(toIndentedString(ossBucket)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    ossPath: ").append(toIndentedString(ossPath)).append("\n");
    sb.append("    notaryId: ").append(toIndentedString(notaryId)).append("\n");
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
