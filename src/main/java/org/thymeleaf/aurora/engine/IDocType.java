/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.aurora.engine;

/**
 *
 * @author Daniel Fern&aacute;ndez
 * @since 3.0.0
 * 
 */
public interface IDocType extends INode {

    public String getKeyword();
    public String getElementName();
    public String getType();
    public String getPublicId();
    public String getSystemId();
    public String getInternalSubset();
    public String getDocType();


    public void setKeyword(final String keyword);
    public void setElementName(final String elementName);
    public void setToHTML5();
    public void setIDs(final String publicId, final String systemId);
    public void setIDs(final String type, final String publicId, final String systemId);
    public void setInternalSubset(final String internalSubset);

    public IDocType cloneNode();

}
