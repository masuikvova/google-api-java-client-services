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

package com.google.api.services.content.model;

/**
 * Model definition for ReturnpolicyCustomBatchRequestEntry.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReturnpolicyCustomBatchRequestEntry extends com.google.api.client.json.GenericJson {

  /**
   * An entry ID, unique within the batch request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long batchId;

  /**
   * The Merchant Center account ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger merchantId;

  /**
   * Method of the batch request entry. Acceptable values are: - "`delete`" - "`get`" - "`insert`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String method;

  /**
   * The return policy to submit. This should be set only if the method is `insert`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReturnPolicy returnPolicy;

  /**
   * The return policy ID. This should be set only if the method is `delete` or `get`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String returnPolicyId;

  /**
   * An entry ID, unique within the batch request.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBatchId() {
    return batchId;
  }

  /**
   * An entry ID, unique within the batch request.
   * @param batchId batchId or {@code null} for none
   */
  public ReturnpolicyCustomBatchRequestEntry setBatchId(java.lang.Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * The Merchant Center account ID.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getMerchantId() {
    return merchantId;
  }

  /**
   * The Merchant Center account ID.
   * @param merchantId merchantId or {@code null} for none
   */
  public ReturnpolicyCustomBatchRequestEntry setMerchantId(java.math.BigInteger merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * Method of the batch request entry. Acceptable values are: - "`delete`" - "`get`" - "`insert`"
   * @return value or {@code null} for none
   */
  public java.lang.String getMethod() {
    return method;
  }

  /**
   * Method of the batch request entry. Acceptable values are: - "`delete`" - "`get`" - "`insert`"
   * @param method method or {@code null} for none
   */
  public ReturnpolicyCustomBatchRequestEntry setMethod(java.lang.String method) {
    this.method = method;
    return this;
  }

  /**
   * The return policy to submit. This should be set only if the method is `insert`.
   * @return value or {@code null} for none
   */
  public ReturnPolicy getReturnPolicy() {
    return returnPolicy;
  }

  /**
   * The return policy to submit. This should be set only if the method is `insert`.
   * @param returnPolicy returnPolicy or {@code null} for none
   */
  public ReturnpolicyCustomBatchRequestEntry setReturnPolicy(ReturnPolicy returnPolicy) {
    this.returnPolicy = returnPolicy;
    return this;
  }

  /**
   * The return policy ID. This should be set only if the method is `delete` or `get`.
   * @return value or {@code null} for none
   */
  public java.lang.String getReturnPolicyId() {
    return returnPolicyId;
  }

  /**
   * The return policy ID. This should be set only if the method is `delete` or `get`.
   * @param returnPolicyId returnPolicyId or {@code null} for none
   */
  public ReturnpolicyCustomBatchRequestEntry setReturnPolicyId(java.lang.String returnPolicyId) {
    this.returnPolicyId = returnPolicyId;
    return this;
  }

  @Override
  public ReturnpolicyCustomBatchRequestEntry set(String fieldName, Object value) {
    return (ReturnpolicyCustomBatchRequestEntry) super.set(fieldName, value);
  }

  @Override
  public ReturnpolicyCustomBatchRequestEntry clone() {
    return (ReturnpolicyCustomBatchRequestEntry) super.clone();
  }

}
