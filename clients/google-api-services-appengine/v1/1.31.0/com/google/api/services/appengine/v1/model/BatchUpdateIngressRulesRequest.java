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

package com.google.api.services.appengine.v1.model;

/**
 * Request message for Firewall.BatchUpdateIngressRules.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchUpdateIngressRulesRequest extends com.google.api.client.json.GenericJson {

  /**
   * A list of FirewallRules to replace the existing set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FirewallRule> ingressRules;

  /**
   * A list of FirewallRules to replace the existing set.
   * @return value or {@code null} for none
   */
  public java.util.List<FirewallRule> getIngressRules() {
    return ingressRules;
  }

  /**
   * A list of FirewallRules to replace the existing set.
   * @param ingressRules ingressRules or {@code null} for none
   */
  public BatchUpdateIngressRulesRequest setIngressRules(java.util.List<FirewallRule> ingressRules) {
    this.ingressRules = ingressRules;
    return this;
  }

  @Override
  public BatchUpdateIngressRulesRequest set(String fieldName, Object value) {
    return (BatchUpdateIngressRulesRequest) super.set(fieldName, value);
  }

  @Override
  public BatchUpdateIngressRulesRequest clone() {
    return (BatchUpdateIngressRulesRequest) super.clone();
  }

}
