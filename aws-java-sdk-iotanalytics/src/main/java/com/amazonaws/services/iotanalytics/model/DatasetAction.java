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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A "DatasetAction" object specifying the query that creates the data set content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DatasetAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data set action.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * An "SqlQueryDatasetAction" object that contains the SQL query to modify the message.
     * </p>
     */
    private SqlQueryDatasetAction queryAction;

    /**
     * <p>
     * The name of the data set action.
     * </p>
     * 
     * @param actionName
     *        The name of the data set action.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the data set action.
     * </p>
     * 
     * @return The name of the data set action.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the data set action.
     * </p>
     * 
     * @param actionName
     *        The name of the data set action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetAction withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * An "SqlQueryDatasetAction" object that contains the SQL query to modify the message.
     * </p>
     * 
     * @param queryAction
     *        An "SqlQueryDatasetAction" object that contains the SQL query to modify the message.
     */

    public void setQueryAction(SqlQueryDatasetAction queryAction) {
        this.queryAction = queryAction;
    }

    /**
     * <p>
     * An "SqlQueryDatasetAction" object that contains the SQL query to modify the message.
     * </p>
     * 
     * @return An "SqlQueryDatasetAction" object that contains the SQL query to modify the message.
     */

    public SqlQueryDatasetAction getQueryAction() {
        return this.queryAction;
    }

    /**
     * <p>
     * An "SqlQueryDatasetAction" object that contains the SQL query to modify the message.
     * </p>
     * 
     * @param queryAction
     *        An "SqlQueryDatasetAction" object that contains the SQL query to modify the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetAction withQueryAction(SqlQueryDatasetAction queryAction) {
        setQueryAction(queryAction);
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
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getQueryAction() != null)
            sb.append("QueryAction: ").append(getQueryAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetAction == false)
            return false;
        DatasetAction other = (DatasetAction) obj;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getQueryAction() == null ^ this.getQueryAction() == null)
            return false;
        if (other.getQueryAction() != null && other.getQueryAction().equals(this.getQueryAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getQueryAction() == null) ? 0 : getQueryAction().hashCode());
        return hashCode;
    }

    @Override
    public DatasetAction clone() {
        try {
            return (DatasetAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatasetActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
