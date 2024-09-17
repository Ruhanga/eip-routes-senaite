/*
 * Copyright © 2021, Ozone HIS <info@ozone-his.com>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.ozonehis.eip.openmrs.senaite.model.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientItem {

    @JsonProperty("portal_type")
    private String portalType;

    @JsonProperty("title")
    private String title;

    @JsonProperty("getClientID")
    private String getClientID;

    @JsonProperty("parent_path")
    private String parentPath;

    @JsonProperty("uid")
    private String uid;

    @JsonProperty("path")
    private String path;
}
