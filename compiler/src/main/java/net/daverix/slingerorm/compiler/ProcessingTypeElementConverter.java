/*
 * Copyright 2014 David Laurell
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.daverix.slingerorm.compiler;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Types;

public class ProcessingTypeElementConverter implements TypeElementConverter {

    private final ProcessingEnvironment mProcessingEnvironment;

    public ProcessingTypeElementConverter(ProcessingEnvironment processingEnvironment) {
        if(processingEnvironment == null) throw new IllegalArgumentException("processingEnvironment is null");
        mProcessingEnvironment = processingEnvironment;
    }

    @Override
    public TypeElement asTypeElement(TypeMirror typeMirror) {
        Types TypeUtils = mProcessingEnvironment.getTypeUtils();
        return (TypeElement)TypeUtils.asElement(typeMirror);
    }
}
