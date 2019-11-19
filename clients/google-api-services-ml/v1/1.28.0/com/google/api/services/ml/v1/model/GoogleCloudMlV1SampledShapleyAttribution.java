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

package com.google.api.services.ml.v1.model;

/**
 * An attribution method that approximates Shapley values for features that contribute to the label
 * being predicted. A sampling strategy is used to approximate the value rather than considering all
 * subsets of features.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AI Platform Training & Prediction API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudMlV1SampledShapleyAttribution extends com.google.api.client.json.GenericJson {

  /**
   * The number of feature permutations to consider when approximating the shapley values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numPaths;

  /**
   * The number of feature permutations to consider when approximating the shapley values.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumPaths() {
    return numPaths;
  }

  /**
   * The number of feature permutations to consider when approximating the shapley values.
   * @param numPaths numPaths or {@code null} for none
   */
  public GoogleCloudMlV1SampledShapleyAttribution setNumPaths(java.lang.Integer numPaths) {
    this.numPaths = numPaths;
    return this;
  }

  @Override
  public GoogleCloudMlV1SampledShapleyAttribution set(String fieldName, Object value) {
    return (GoogleCloudMlV1SampledShapleyAttribution) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1SampledShapleyAttribution clone() {
    return (GoogleCloudMlV1SampledShapleyAttribution) super.clone();
  }

}
