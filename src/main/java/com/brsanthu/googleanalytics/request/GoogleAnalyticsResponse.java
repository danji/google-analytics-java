/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.brsanthu.googleanalytics.request;

import java.util.Map;

/**
 * Response for GA tracking request.
 *
 * @author Santhosh Kumar
 */
public class GoogleAnalyticsResponse {
    private int statusCode = 200;
    private GoogleAnalyticsRequest<?> googleAnalyticsRequest;
    private Map<String, String> requestParams = null;

    public Map<String, String> getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(Map<String, String> postedParms) {
        requestParams = postedParms;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Response [statusCode=");
        builder.append(statusCode);
        builder.append("]");
        return builder.toString();
    }

    public GoogleAnalyticsRequest<?> getGoogleAnalyticsRequest() {
        return googleAnalyticsRequest;
    }

    public GoogleAnalyticsResponse setGoogleAnalyticsRequest(GoogleAnalyticsRequest<?> googleAnalyticsRequest) {
        this.googleAnalyticsRequest = googleAnalyticsRequest;
        return this;
    }
}
