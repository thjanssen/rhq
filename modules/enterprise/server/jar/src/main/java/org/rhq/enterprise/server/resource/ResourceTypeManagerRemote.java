/*
 * RHQ Management Platform
 * Copyright (C) 2005-2008 Red Hat, Inc.
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
package org.rhq.enterprise.server.resource;

import javax.ejb.Remote;

import org.rhq.core.domain.auth.Subject;
import org.rhq.core.domain.criteria.ResourceTypeCriteria;
import org.rhq.core.domain.resource.ResourceType;
import org.rhq.core.domain.util.PageList;

/**
 * ResourceType remote API.
 */
@Remote
public interface ResourceTypeManagerRemote {

    /**
     * @param subject
     * @param resourceTypeId
     * @param ignoreFlag
     */
    void setResourceTypeIgnoreFlagAndUninventoryResources(Subject subject, int resourceTypeId, boolean ignoreFlag);

    /**
     * @param subject
     * @param resourceTypeId
     * @return the type
     * @throws ResourceTypeNotFoundException
     */
    ResourceType getResourceTypeById(Subject subject, int resourceTypeId) throws ResourceTypeNotFoundException;

    /**
     * @param subject
     * @param name
     * @param plugin
     * @return null if not found
     */
    ResourceType getResourceTypeByNameAndPlugin(Subject subject, String name, String plugin);

    /**
     * @param subject
     * @param criteria
     * @return not null
     */
    PageList<ResourceType> findResourceTypesByCriteria(Subject subject, ResourceTypeCriteria criteria);
}