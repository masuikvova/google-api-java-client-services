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

package com.google.api.services.cloudkms.v1.model;

/**
 * Request message for KeyManagementService.AsymmetricDecrypt.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Key Management Service (KMS) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AsymmetricDecryptRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The data encrypted with the named CryptoKeyVersion's public key using OAEP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ciphertext;

  /**
   * Optional. An optional CRC32C checksum of the AsymmetricDecryptRequest.ciphertext. If specified,
   * KeyManagementService will verify the integrity of the received
   * AsymmetricDecryptRequest.ciphertext using this checksum. KeyManagementService will report an
   * error if the checksum verification fails. If you receive a checksum error, your client should
   * verify that CRC32C(AsymmetricDecryptRequest.ciphertext) is equal to
   * AsymmetricDecryptRequest.ciphertext_crc32c, and if so, perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note:
   * This field is defined as int64 for reasons of compatibility across different languages.
   * However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely
   * downconverted to uint32 in languages that support this type. NOTE: This field is in Beta.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long ciphertextCrc32c;

  /**
   * Required. The data encrypted with the named CryptoKeyVersion's public key using OAEP.
   * @see #decodeCiphertext()
   * @return value or {@code null} for none
   */
  public java.lang.String getCiphertext() {
    return ciphertext;
  }

  /**
   * Required. The data encrypted with the named CryptoKeyVersion's public key using OAEP.
   * @see #getCiphertext()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeCiphertext() {
    return com.google.api.client.util.Base64.decodeBase64(ciphertext);
  }

  /**
   * Required. The data encrypted with the named CryptoKeyVersion's public key using OAEP.
   * @see #encodeCiphertext()
   * @param ciphertext ciphertext or {@code null} for none
   */
  public AsymmetricDecryptRequest setCiphertext(java.lang.String ciphertext) {
    this.ciphertext = ciphertext;
    return this;
  }

  /**
   * Required. The data encrypted with the named CryptoKeyVersion's public key using OAEP.
   * @see #setCiphertext()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public AsymmetricDecryptRequest encodeCiphertext(byte[] ciphertext) {
    this.ciphertext = com.google.api.client.util.Base64.encodeBase64URLSafeString(ciphertext);
    return this;
  }

  /**
   * Optional. An optional CRC32C checksum of the AsymmetricDecryptRequest.ciphertext. If specified,
   * KeyManagementService will verify the integrity of the received
   * AsymmetricDecryptRequest.ciphertext using this checksum. KeyManagementService will report an
   * error if the checksum verification fails. If you receive a checksum error, your client should
   * verify that CRC32C(AsymmetricDecryptRequest.ciphertext) is equal to
   * AsymmetricDecryptRequest.ciphertext_crc32c, and if so, perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note:
   * This field is defined as int64 for reasons of compatibility across different languages.
   * However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely
   * downconverted to uint32 in languages that support this type. NOTE: This field is in Beta.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCiphertextCrc32c() {
    return ciphertextCrc32c;
  }

  /**
   * Optional. An optional CRC32C checksum of the AsymmetricDecryptRequest.ciphertext. If specified,
   * KeyManagementService will verify the integrity of the received
   * AsymmetricDecryptRequest.ciphertext using this checksum. KeyManagementService will report an
   * error if the checksum verification fails. If you receive a checksum error, your client should
   * verify that CRC32C(AsymmetricDecryptRequest.ciphertext) is equal to
   * AsymmetricDecryptRequest.ciphertext_crc32c, and if so, perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note:
   * This field is defined as int64 for reasons of compatibility across different languages.
   * However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely
   * downconverted to uint32 in languages that support this type. NOTE: This field is in Beta.
   * @param ciphertextCrc32c ciphertextCrc32c or {@code null} for none
   */
  public AsymmetricDecryptRequest setCiphertextCrc32c(java.lang.Long ciphertextCrc32c) {
    this.ciphertextCrc32c = ciphertextCrc32c;
    return this;
  }

  @Override
  public AsymmetricDecryptRequest set(String fieldName, Object value) {
    return (AsymmetricDecryptRequest) super.set(fieldName, value);
  }

  @Override
  public AsymmetricDecryptRequest clone() {
    return (AsymmetricDecryptRequest) super.clone();
  }

}
