/*
    Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.

    Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
    except in compliance with the License. A copy of the License is located at

        http://aws.amazon.com/apache2.0/

    or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
    the specific language governing permissions and limitations under the License.
 */

package com.amazon.ask.exception.template;

/**
 * Exception thrown when an exception is encountered while {@link com.amazon.ask.response.template.renderer.TemplateRenderer} is rendering template.
 */
public class TemplateRendererException extends TemplateFactoryException {

    /**
     * Constructs an instance of TemplateRendererException with the given message.
     * @param message exception message.
     */
    public TemplateRendererException(final String message) {
        super(message);
    }

    /**
     * Constructs an instance of TemplateRendererException with the given message and cause.
     * @param message exception message.
     * @param cause instance of {@link Throwable}.
     */
    public TemplateRendererException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
