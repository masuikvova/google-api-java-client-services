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

package com.google.api.services.networkmanagement.v1beta1.model;

/**
 * The details of probing from the latest run.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProbingDetails extends com.google.api.client.json.GenericJson {

  /**
   * Causes that the probing was aborted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String abortCause;

  /**
   * Derived from the test input. The actual source and destination endpoint where the probing was
   * run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EndpointInfo endpointInfo;

  /**
   * The details of an internal failure or a cancellation of reachability analysis.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status error;

  /**
   * The overall reachability result of the test.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String result;

  /**
   * Number of probes sent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sentProbeCount;

  /**
   * Number of probes that reached destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer successfulProbeCount;

  /**
   * The time the reachability state was verified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String verifyTime;

  /**
   * Causes that the probing was aborted.
   * @return value or {@code null} for none
   */
  public java.lang.String getAbortCause() {
    return abortCause;
  }

  /**
   * Causes that the probing was aborted.
   * @param abortCause abortCause or {@code null} for none
   */
  public ProbingDetails setAbortCause(java.lang.String abortCause) {
    this.abortCause = abortCause;
    return this;
  }

  /**
   * Derived from the test input. The actual source and destination endpoint where the probing was
   * run.
   * @return value or {@code null} for none
   */
  public EndpointInfo getEndpointInfo() {
    return endpointInfo;
  }

  /**
   * Derived from the test input. The actual source and destination endpoint where the probing was
   * run.
   * @param endpointInfo endpointInfo or {@code null} for none
   */
  public ProbingDetails setEndpointInfo(EndpointInfo endpointInfo) {
    this.endpointInfo = endpointInfo;
    return this;
  }

  /**
   * The details of an internal failure or a cancellation of reachability analysis.
   * @return value or {@code null} for none
   */
  public Status getError() {
    return error;
  }

  /**
   * The details of an internal failure or a cancellation of reachability analysis.
   * @param error error or {@code null} for none
   */
  public ProbingDetails setError(Status error) {
    this.error = error;
    return this;
  }

  /**
   * The overall reachability result of the test.
   * @return value or {@code null} for none
   */
  public java.lang.String getResult() {
    return result;
  }

  /**
   * The overall reachability result of the test.
   * @param result result or {@code null} for none
   */
  public ProbingDetails setResult(java.lang.String result) {
    this.result = result;
    return this;
  }

  /**
   * Number of probes sent.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSentProbeCount() {
    return sentProbeCount;
  }

  /**
   * Number of probes sent.
   * @param sentProbeCount sentProbeCount or {@code null} for none
   */
  public ProbingDetails setSentProbeCount(java.lang.Integer sentProbeCount) {
    this.sentProbeCount = sentProbeCount;
    return this;
  }

  /**
   * Number of probes that reached destination.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSuccessfulProbeCount() {
    return successfulProbeCount;
  }

  /**
   * Number of probes that reached destination.
   * @param successfulProbeCount successfulProbeCount or {@code null} for none
   */
  public ProbingDetails setSuccessfulProbeCount(java.lang.Integer successfulProbeCount) {
    this.successfulProbeCount = successfulProbeCount;
    return this;
  }

  /**
   * The time the reachability state was verified.
   * @return value or {@code null} for none
   */
  public String getVerifyTime() {
    return verifyTime;
  }

  /**
   * The time the reachability state was verified.
   * @param verifyTime verifyTime or {@code null} for none
   */
  public ProbingDetails setVerifyTime(String verifyTime) {
    this.verifyTime = verifyTime;
    return this;
  }

  @Override
  public ProbingDetails set(String fieldName, Object value) {
    return (ProbingDetails) super.set(fieldName, value);
  }

  @Override
  public ProbingDetails clone() {
    return (ProbingDetails) super.clone();
  }

}
