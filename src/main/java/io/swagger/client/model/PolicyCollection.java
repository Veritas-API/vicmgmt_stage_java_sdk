/*
 * Veritas Information Classifier (VIC)
 * APIs
 *
 * OpenAPI spec version: Resource Specific
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Policy;
import java.util.ArrayList;
import java.util.List;

/**
 * PolicyCollection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-12T23:02:37.653Z")
public class PolicyCollection {
  @SerializedName("totalItems")
  private Integer totalItems = null;

  @SerializedName("items")
  private List<Policy> items = new ArrayList<Policy>();

  @SerializedName("engineRuleSets")
  private List<String> engineRuleSets = new ArrayList<String>();

  @SerializedName("revision")
  private Long revision = null;

  public PolicyCollection totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

   /**
   * Get totalItems
   * @return totalItems
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  public PolicyCollection items(List<Policy> items) {
    this.items = items;
    return this;
  }

  public PolicyCollection addItemsItem(Policy itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Policy> getItems() {
    return items;
  }

  public void setItems(List<Policy> items) {
    this.items = items;
  }

  public PolicyCollection engineRuleSets(List<String> engineRuleSets) {
    this.engineRuleSets = engineRuleSets;
    return this;
  }

  public PolicyCollection addEngineRuleSetsItem(String engineRuleSetsItem) {
    this.engineRuleSets.add(engineRuleSetsItem);
    return this;
  }

   /**
   * Rules used by the policies, in a format specific to the classification engine.
   * @return engineRuleSets
  **/
  @ApiModelProperty(example = "null", value = "Rules used by the policies, in a format specific to the classification engine.")
  public List<String> getEngineRuleSets() {
    return engineRuleSets;
  }

  public void setEngineRuleSets(List<String> engineRuleSets) {
    this.engineRuleSets = engineRuleSets;
  }

  public PolicyCollection revision(Long revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Revision number for this collection of policies The revision number increases when anything changes that affects the policy collection, for example enabling or disabling a policy, or changes to the rules for a policy.
   * @return revision
  **/
  @ApiModelProperty(example = "null", value = "Revision number for this collection of policies The revision number increases when anything changes that affects the policy collection, for example enabling or disabling a policy, or changes to the rules for a policy.")
  public Long getRevision() {
    return revision;
  }

  public void setRevision(Long revision) {
    this.revision = revision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyCollection policyCollection = (PolicyCollection) o;
    return Objects.equals(this.totalItems, policyCollection.totalItems) &&
        Objects.equals(this.items, policyCollection.items) &&
        Objects.equals(this.engineRuleSets, policyCollection.engineRuleSets) &&
        Objects.equals(this.revision, policyCollection.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalItems, items, engineRuleSets, revision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyCollection {\n");
    
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    engineRuleSets: ").append(toIndentedString(engineRuleSets)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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

