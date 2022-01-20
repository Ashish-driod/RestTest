package com.example.resttest;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/** Tapi Response Bean class - Holds the status code and result string */
public class TapiResponse {

  // Various errors that TAPI Communication may run into
  public enum StatusCode {
    INVALID_PARAMETER,
    INVALID_UUID_LIST,
    INVALID_SERVER_CONFIG,
    UNKNOWN_EXCEPTION,
    RUNTIME_EXCEPTION,
    INVALID_URL_EXCEPTION,
    OTHER_PROCESSING_ERROR,
    SSL_HANDSHAKE_EXCEPTION,
    SOCKET_EXCEPTION,
    CONNECTION_REFUSED,
    UNKNOWN_HOST_ERROR,
    SERVER_TIMEOUT,
    INVALID_STATUS,
    INVALID_KEY_PARAMETER,
    SUCCESS
  }

  public static final String EMPTY_RESPONSE = "";

  public static final Map<String, List<String>> EMPTY_HEADERS = Collections.emptyMap();

  // statusCode holds the enum value indicating success and failure reasons

  private StatusCode statusCode;

  // resultString is the JSON String response that TAPI server sends
  private String resultString;

  // responseHeaders is the map of HTTP headers that the TAPI server sends with the response.
  private Map<String, List<String>> responseHeaders;

  public TapiResponse(StatusCode statusCode, String result, Map<String, List<String>> responseHeaders) {
    this.statusCode = statusCode;
    this.resultString = result;
    this.responseHeaders = responseHeaders;
  }

  // getters and setters
  public StatusCode getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(StatusCode statusCode) {
    this.statusCode = statusCode;
  }

  public String getResultString() {
    return resultString;
  }

  public void setResultString(String resultString) {
    this.resultString = resultString;
  }

  public Map<String, List<String>> getResponseHeaders() {
    return responseHeaders;
  }

  public void setResponseHeaders(Map<String, List<String>> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  @Override
  public String toString() {
    return "TapiResponse{" + "statusCode=" + statusCode + ", resultString='" + resultString + '\'' + '}';
  }
}
