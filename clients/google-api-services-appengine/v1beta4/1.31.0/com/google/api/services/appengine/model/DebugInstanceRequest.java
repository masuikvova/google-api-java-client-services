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

package com.google.api.services.appengine.model;

/**
 * Request message for Instances.DebugInstance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DebugInstanceRequest extends com.google.api.client.json.GenericJson {

  /**
   * Public SSH key to add to the instance. Examples: [USERNAME]:ssh-rsa [KEY_VALUE] [USERNAME]
   * [USERNAME]:ssh-rsa [KEY_VALUE] google-ssh
   * {"userName":"[USERNAME]","expireOn":"[EXPIRE_TIME]"}For more information, see Adding and
   * Removing SSH Keys (https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sshKey;

  /**
   * Public SSH key to add to the instance. Examples: [USERNAME]:ssh-rsa [KEY_VALUE] [USERNAME]
   * [USERNAME]:ssh-rsa [KEY_VALUE] google-ssh
   * {"userName":"[USERNAME]","expireOn":"[EXPIRE_TIME]"}For more information, see Adding and
   * Removing SSH Keys (https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys).
   * @return value or {@code null} for none
   */
  public java.lang.String getSshKey() {
    return sshKey;
  }

  /**
   * Public SSH key to add to the instance. Examples: [USERNAME]:ssh-rsa [KEY_VALUE] [USERNAME]
   * [USERNAME]:ssh-rsa [KEY_VALUE] google-ssh
   * {"userName":"[USERNAME]","expireOn":"[EXPIRE_TIME]"}For more information, see Adding and
   * Removing SSH Keys (https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys).
   * @param sshKey sshKey or {@code null} for none
   */
  public DebugInstanceRequest setSshKey(java.lang.String sshKey) {
    this.sshKey = sshKey;
    return this;
  }

  @Override
  public DebugInstanceRequest set(String fieldName, Object value) {
    return (DebugInstanceRequest) super.set(fieldName, value);
  }

  @Override
  public DebugInstanceRequest clone() {
    return (DebugInstanceRequest) super.clone();
  }

}
