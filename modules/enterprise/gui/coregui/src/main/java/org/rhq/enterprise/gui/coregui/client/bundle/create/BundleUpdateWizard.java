/*
 * RHQ Management Platform
 * Copyright (C) 2005-2010 Red Hat, Inc.
 * All rights reserved.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package org.rhq.enterprise.gui.coregui.client.bundle.create;

import java.util.ArrayList;

import org.rhq.core.domain.bundle.BundleVersion;
import org.rhq.enterprise.gui.coregui.client.components.wizard.WizardStep;

public class BundleUpdateWizard extends AbstractBundleCreateWizard {

    public BundleUpdateWizard(BundleVersion bv) {
        setWindowTitle("Bundle Update Wizard");
        setTitle("Update a Bundle");
        setSubtitle(bv.getName());
        setBundleVersion(bv);

        ArrayList<WizardStep> steps = new ArrayList<WizardStep>();
        steps.add(new BundleInfoStep(this));
        steps.add(new BundleUploadRecipeStep(this));
        steps.add(new BundleUploadDataStep(this));
        setSteps(steps);
    }
}
