/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2017-10-30/GetFieldLevelEncryptionProfileConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFieldLevelEncryptionProfileConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Get the ID for the field-level encryption profile configuration information.
     * </p>
     */
    private String id;

    /**
     * <p>
     * Get the ID for the field-level encryption profile configuration information.
     * </p>
     * 
     * @param id
     *        Get the ID for the field-level encryption profile configuration information.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Get the ID for the field-level encryption profile configuration information.
     * </p>
     * 
     * @return Get the ID for the field-level encryption profile configuration information.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Get the ID for the field-level encryption profile configuration information.
     * </p>
     * 
     * @param id
     *        Get the ID for the field-level encryption profile configuration information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFieldLevelEncryptionProfileConfigRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFieldLevelEncryptionProfileConfigRequest == false)
            return false;
        GetFieldLevelEncryptionProfileConfigRequest other = (GetFieldLevelEncryptionProfileConfigRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public GetFieldLevelEncryptionProfileConfigRequest clone() {
        return (GetFieldLevelEncryptionProfileConfigRequest) super.clone();
    }

}
