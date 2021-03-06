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

package com.google.api.services.container.v1beta1.model;

/**
 * Configuration for controlling master global access settings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PrivateClusterMasterGlobalAccessConfig extends com.google.api.client.json.GenericJson {

  /**
   * Whenever master is accessible globally or not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Whenever master is accessible globally or not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Whenever master is accessible globally or not.
   * @param enabled enabled or {@code null} for none
   */
  public PrivateClusterMasterGlobalAccessConfig setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  @Override
  public PrivateClusterMasterGlobalAccessConfig set(String fieldName, Object value) {
    return (PrivateClusterMasterGlobalAccessConfig) super.set(fieldName, value);
  }

  @Override
  public PrivateClusterMasterGlobalAccessConfig clone() {
    return (PrivateClusterMasterGlobalAccessConfig) super.clone();
  }

}
