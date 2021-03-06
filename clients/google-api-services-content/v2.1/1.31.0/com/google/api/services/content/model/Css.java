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
 * Information about CSS domain.
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
public final class Css extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Immutable. The CSS domain ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long cssDomainId;

  /**
   * Output only. Immutable. The ID of the CSS group this CSS domain is affiliated with. Only
   * populated for CSS group users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long cssGroupId;

  /**
   * Output only. Immutable. The CSS domain's display name, used when space is constrained.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Immutable. The CSS domain's full name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullName;

  /**
   * Output only. Immutable. The CSS domain's homepage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String homepageUri;

  /**
   * A list of label IDs that are assigned to this CSS domain by its CSS group. Only populated for
   * CSS group users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> labelIds;

  /**
   * Output only. Immutable. The CSS domain ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCssDomainId() {
    return cssDomainId;
  }

  /**
   * Output only. Immutable. The CSS domain ID.
   * @param cssDomainId cssDomainId or {@code null} for none
   */
  public Css setCssDomainId(java.lang.Long cssDomainId) {
    this.cssDomainId = cssDomainId;
    return this;
  }

  /**
   * Output only. Immutable. The ID of the CSS group this CSS domain is affiliated with. Only
   * populated for CSS group users.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCssGroupId() {
    return cssGroupId;
  }

  /**
   * Output only. Immutable. The ID of the CSS group this CSS domain is affiliated with. Only
   * populated for CSS group users.
   * @param cssGroupId cssGroupId or {@code null} for none
   */
  public Css setCssGroupId(java.lang.Long cssGroupId) {
    this.cssGroupId = cssGroupId;
    return this;
  }

  /**
   * Output only. Immutable. The CSS domain's display name, used when space is constrained.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Output only. Immutable. The CSS domain's display name, used when space is constrained.
   * @param displayName displayName or {@code null} for none
   */
  public Css setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Immutable. The CSS domain's full name.
   * @return value or {@code null} for none
   */
  public java.lang.String getFullName() {
    return fullName;
  }

  /**
   * Output only. Immutable. The CSS domain's full name.
   * @param fullName fullName or {@code null} for none
   */
  public Css setFullName(java.lang.String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Output only. Immutable. The CSS domain's homepage.
   * @return value or {@code null} for none
   */
  public java.lang.String getHomepageUri() {
    return homepageUri;
  }

  /**
   * Output only. Immutable. The CSS domain's homepage.
   * @param homepageUri homepageUri or {@code null} for none
   */
  public Css setHomepageUri(java.lang.String homepageUri) {
    this.homepageUri = homepageUri;
    return this;
  }

  /**
   * A list of label IDs that are assigned to this CSS domain by its CSS group. Only populated for
   * CSS group users.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getLabelIds() {
    return labelIds;
  }

  /**
   * A list of label IDs that are assigned to this CSS domain by its CSS group. Only populated for
   * CSS group users.
   * @param labelIds labelIds or {@code null} for none
   */
  public Css setLabelIds(java.util.List<java.lang.Long> labelIds) {
    this.labelIds = labelIds;
    return this;
  }

  @Override
  public Css set(String fieldName, Object value) {
    return (Css) super.set(fieldName, value);
  }

  @Override
  public Css clone() {
    return (Css) super.clone();
  }

}
