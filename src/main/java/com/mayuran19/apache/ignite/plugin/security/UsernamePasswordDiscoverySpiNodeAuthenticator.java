package com.mayuran19.apache.ignite.plugin.security;

import com.mayuran19.apache.ignite.plugin.security.credential.UsernamePasswordSecurityContext;
import org.apache.ignite.IgniteException;
import org.apache.ignite.cluster.ClusterNode;
import org.apache.ignite.internal.processors.security.SecurityContext;
import org.apache.ignite.plugin.security.SecurityCredentials;
import org.apache.ignite.spi.discovery.DiscoverySpiNodeAuthenticator;

/**
 * Created by mayuran on 25/9/17.
 */
public class UsernamePasswordDiscoverySpiNodeAuthenticator implements DiscoverySpiNodeAuthenticator {

    @Override
    public SecurityContext authenticateNode(ClusterNode node, SecurityCredentials cred) throws IgniteException {
        System.out.println("UsernamePasswordDiscoverySpiNodeAuthenticator >> authenticateNode");
        return new UsernamePasswordSecurityContext();
    }

    @Override
    public boolean isGlobalNodeAuthentication() {
        return false;
    }
}
