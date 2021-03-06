/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
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

package org.jbpm.services.api.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface ProcessDefinition extends Serializable, DeployedAsset {

    String getId();

    String getName();

    String getVersion();

    String getPackageName();

    String getType();

    String getDeploymentId();
    
    boolean isDynamic();
    
    Map<String, Collection<String>> getAssociatedEntities();

    Map<String, String> getServiceTasks();

    Map<String, String> getProcessVariables();

    Collection<String> getReusableSubProcesses();

    Collection<String> getSignals();

    Collection<String> getGlobals();

    Collection<String> getReferencedRules();
    
    boolean isActive();

    Set<NodeDesc> getNodes();

    Set<TimerDesc> getTimers();
}
