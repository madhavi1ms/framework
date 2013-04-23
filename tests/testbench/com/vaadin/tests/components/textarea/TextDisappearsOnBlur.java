/*
 * Copyright 2012 Vaadin Ltd.
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

package com.vaadin.tests.components.textarea;

import com.vaadin.tests.components.TestBase;
import com.vaadin.ui.TextArea;

public class TextDisappearsOnBlur extends TestBase {

    @Override
    protected void setup() {
        TextArea ta = new TextArea();
        addComponent(ta);

        // All three are required for the bug to manifest
        ta.setMaxLength(50);
        ta.setImmediate(true);
        ta.setRequired(true);
    }

    @Override
    protected String getDescription() {
        return "Text disappears from TextArea in IE 6-8 when focus changes";
    }

    @Override
    protected Integer getTicketNumber() {
        return 11396;
    }
}
