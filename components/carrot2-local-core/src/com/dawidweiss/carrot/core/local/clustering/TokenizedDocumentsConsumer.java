
/*
 * Carrot2 Project
 * Copyright (C) 2002-2005, Dawid Weiss
 * Portions (C) Contributors listed in carrot2.CONTRIBUTORS file.
 * All rights reserved.
 *
 * Refer to the full license file "carrot2.LICENSE"
 * in the root folder of the CVS checkout or at:
 * http://www.cs.put.poznan.pl/dweiss/carrot2.LICENSE
 *
 * Sponsored by: CCG, Inc.
 */

package com.dawidweiss.carrot.core.local.clustering;

import com.dawidweiss.carrot.core.local.ProcessingException;


/**
 * A marker interface and data-related interface  for components that can
 * produce {@link TokenizedDocument} objects.
 * 
 * <p>
 * Predecessor components to this one should implement the corresponding {@link
 * TokenizedDocumentsProducer} interface.
 * </p>
 *
 * @author Dawid Weiss
 * @version $Revision$
 *
 * @see TokenizedDocument
 * @see TokenizedDocumentsProducer
 * @see com.dawidweiss.carrot.core.local.LocalComponent#getComponentCapabilities()
 * @see com.dawidweiss.carrot.core.local.LocalComponent
 */
public interface TokenizedDocumentsConsumer {
    /**
     * Data-related method for passing a new {@link TokenizedDocument} object
     * reference to the component implementing this interface.
     *
     * @param doc A new {@link TokenizedDocument} object passed from the
     *        predecessor component.
     *
     * @throws ProcessingException Thrown if this component cannot accept the
     *         document reference for some reason.
     */
    public void addDocument(TokenizedDocument doc) throws ProcessingException;
}
