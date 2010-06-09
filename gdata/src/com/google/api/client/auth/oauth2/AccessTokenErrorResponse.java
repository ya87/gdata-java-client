/*
 * Copyright (c) 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.api.client.auth.oauth2;

import com.google.api.client.util.Key;

/**
 * OAuth 2.0 access token error response as specified in <a
 * href="http://tools.ietf.org/html/draft-ietf-oauth-v2-05#section-3.3.2.2"
 * >Error Response</a>.
 * 
 * @since 2.3
 * @author Yaniv Inbar
 */
public class AccessTokenErrorResponse {

  /**
   * (REQUIRED) The parameter value MUST be set to one of the values specified
   * by each flow.
   */
  @Key
  public String error;
}