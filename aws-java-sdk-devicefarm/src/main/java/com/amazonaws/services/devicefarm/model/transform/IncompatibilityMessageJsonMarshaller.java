/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;

import com.amazonaws.protocol.json.*;

/**
 * IncompatibilityMessageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IncompatibilityMessageJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(IncompatibilityMessage incompatibilityMessage, StructuredJsonGenerator jsonGenerator) {

        if (incompatibilityMessage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (incompatibilityMessage.getMessage() != null) {
                jsonGenerator.writeFieldName("message").writeValue(incompatibilityMessage.getMessage());
            }
            if (incompatibilityMessage.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(incompatibilityMessage.getType());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static IncompatibilityMessageJsonMarshaller instance;

    public static IncompatibilityMessageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IncompatibilityMessageJsonMarshaller();
        return instance;
    }

}
