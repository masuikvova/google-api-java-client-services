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

package com.google.api.services.bigquery.model;

/**
 * Model definition for ProjectReference.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProjectReference extends com.google.api.client.json.GenericJson {

  /**
   * [Required] ID of the project. Can be either the numeric ID or the assigned ID of the project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * [Required] ID of the project. Can be either the numeric ID or the assigned ID of the project.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * [Required] ID of the project. Can be either the numeric ID or the assigned ID of the project.
   * @param projectId projectId or {@code null} for none
   */
  public ProjectReference setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  @Override
  public ProjectReference set(String fieldName, Object value) {
    return (ProjectReference) super.set(fieldName, value);
  }

  @Override
  public ProjectReference clone() {
    return (ProjectReference) super.clone();
  }

}
