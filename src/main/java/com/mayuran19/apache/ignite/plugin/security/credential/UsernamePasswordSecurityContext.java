package com.mayuran19.apache.ignite.plugin.security.credential;

import org.apache.ignite.internal.processors.security.SecurityContext;
import org.apache.ignite.plugin.security.SecurityPermission;
import org.apache.ignite.plugin.security.SecuritySubject;

import java.io.Serializable;

/**
 * Created by mayuran on 26/9/17.
 */
public class UsernamePasswordSecurityContext implements SecurityContext, Serializable {
    @Override
    public SecuritySubject subject() {
        return null;
    }

    @Override
    public boolean taskOperationAllowed(String taskClsName, SecurityPermission perm) {
        return false;
    }

    @Override
    public boolean cacheOperationAllowed(String cacheName, SecurityPermission perm) {
        return false;
    }

    @Override
    public boolean serviceOperationAllowed(String srvcName, SecurityPermission perm) {
        return false;
    }

    @Override
    public boolean systemOperationAllowed(SecurityPermission perm) {
        return false;
    }
}
