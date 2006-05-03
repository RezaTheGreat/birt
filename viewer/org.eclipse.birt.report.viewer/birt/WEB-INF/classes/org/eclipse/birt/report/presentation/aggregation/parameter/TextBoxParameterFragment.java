/*************************************************************************************
 * Copyright (c) 2004 Actuate Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Actuate Corporation - Initial implementation.
 ************************************************************************************/

package org.eclipse.birt.report.presentation.aggregation.parameter;

import org.eclipse.birt.report.service.api.ParameterDefinition;

/**
 * Fragment help rendering scalar parameter.
 * <p>
 * @see org.eclipse.birt.report.presentation.aggregation.BaseFragment
 */
public class TextBoxParameterFragment extends ScalarParameterFragment
{
	/**
	 * Protected constructor.
	 * 
	 * @param parameter parameter definition reference.
	 */
	public TextBoxParameterFragment( ParameterDefinition parameter )
	{
		super( parameter );
	}
}