/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.displayvideo.v1.model;

/**
 * Response message for AdvertiserService.AuditAdvertiser.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuditAdvertiserResponse extends com.google.api.client.json.GenericJson {

  /**
   * The number of ACTIVE and PAUSED campaigns under this advertiser. These campaigns count towards
   * the limit of 9999 campaigns per advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long usedCampaignsCount;

  /**
   * The number of ACTIVE, PAUSED and DRAFT insertion orders under this advertiser. These insertion
   * orders count towards the limit of 9999 insertion orders per advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long usedInsertionOrdersCount;

  /**
   * The number of ACTIVE, PAUSED, and DRAFT line items under this advertiser. These line items
   * count towards the limit of 9999 line items per advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long usedLineItemsCount;

  /**
   * The number of ACTIVE and PAUSED campaigns under this advertiser. These campaigns count towards
   * the limit of 9999 campaigns per advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUsedCampaignsCount() {
    return usedCampaignsCount;
  }

  /**
   * The number of ACTIVE and PAUSED campaigns under this advertiser. These campaigns count towards
   * the limit of 9999 campaigns per advertiser.
   * @param usedCampaignsCount usedCampaignsCount or {@code null} for none
   */
  public AuditAdvertiserResponse setUsedCampaignsCount(java.lang.Long usedCampaignsCount) {
    this.usedCampaignsCount = usedCampaignsCount;
    return this;
  }

  /**
   * The number of ACTIVE, PAUSED and DRAFT insertion orders under this advertiser. These insertion
   * orders count towards the limit of 9999 insertion orders per advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUsedInsertionOrdersCount() {
    return usedInsertionOrdersCount;
  }

  /**
   * The number of ACTIVE, PAUSED and DRAFT insertion orders under this advertiser. These insertion
   * orders count towards the limit of 9999 insertion orders per advertiser.
   * @param usedInsertionOrdersCount usedInsertionOrdersCount or {@code null} for none
   */
  public AuditAdvertiserResponse setUsedInsertionOrdersCount(java.lang.Long usedInsertionOrdersCount) {
    this.usedInsertionOrdersCount = usedInsertionOrdersCount;
    return this;
  }

  /**
   * The number of ACTIVE, PAUSED, and DRAFT line items under this advertiser. These line items
   * count towards the limit of 9999 line items per advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUsedLineItemsCount() {
    return usedLineItemsCount;
  }

  /**
   * The number of ACTIVE, PAUSED, and DRAFT line items under this advertiser. These line items
   * count towards the limit of 9999 line items per advertiser.
   * @param usedLineItemsCount usedLineItemsCount or {@code null} for none
   */
  public AuditAdvertiserResponse setUsedLineItemsCount(java.lang.Long usedLineItemsCount) {
    this.usedLineItemsCount = usedLineItemsCount;
    return this;
  }

  @Override
  public AuditAdvertiserResponse set(String fieldName, Object value) {
    return (AuditAdvertiserResponse) super.set(fieldName, value);
  }

  @Override
  public AuditAdvertiserResponse clone() {
    return (AuditAdvertiserResponse) super.clone();
  }

}
