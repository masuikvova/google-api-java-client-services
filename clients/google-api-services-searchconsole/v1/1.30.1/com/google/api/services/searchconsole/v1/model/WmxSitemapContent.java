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

package com.google.api.services.searchconsole.v1.model;

/**
 * Information about the various content types in the sitemap.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Search Console API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WmxSitemapContent extends com.google.api.client.json.GenericJson {

  /**
   * The number of URLs from the sitemap that were indexed (of the content type).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long indexed;

  /**
   * The number of URLs in the sitemap (of the content type).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long submitted;

  /**
   * The specific type of content in this sitemap. For example: `web`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The number of URLs from the sitemap that were indexed (of the content type).
   * @return value or {@code null} for none
   */
  public java.lang.Long getIndexed() {
    return indexed;
  }

  /**
   * The number of URLs from the sitemap that were indexed (of the content type).
   * @param indexed indexed or {@code null} for none
   */
  public WmxSitemapContent setIndexed(java.lang.Long indexed) {
    this.indexed = indexed;
    return this;
  }

  /**
   * The number of URLs in the sitemap (of the content type).
   * @return value or {@code null} for none
   */
  public java.lang.Long getSubmitted() {
    return submitted;
  }

  /**
   * The number of URLs in the sitemap (of the content type).
   * @param submitted submitted or {@code null} for none
   */
  public WmxSitemapContent setSubmitted(java.lang.Long submitted) {
    this.submitted = submitted;
    return this;
  }

  /**
   * The specific type of content in this sitemap. For example: `web`.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The specific type of content in this sitemap. For example: `web`.
   * @param type type or {@code null} for none
   */
  public WmxSitemapContent setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public WmxSitemapContent set(String fieldName, Object value) {
    return (WmxSitemapContent) super.set(fieldName, value);
  }

  @Override
  public WmxSitemapContent clone() {
    return (WmxSitemapContent) super.clone();
  }

}
