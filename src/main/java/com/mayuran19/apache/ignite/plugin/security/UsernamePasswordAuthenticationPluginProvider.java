package com.mayuran19.apache.ignite.plugin.security;

import org.apache.ignite.IgniteCheckedException;
import org.apache.ignite.cluster.ClusterNode;
import org.apache.ignite.plugin.*;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by mayuran on 25/9/17.
 */
public class UsernamePasswordAuthenticationPluginProvider implements PluginProvider, IgnitePlugin {
    @Override
    public String name() {
        return "UsernamePasswordAuthenticationPlugin";
    }

    @Override
    public String version() {
        return "1.0";
    }

    @Override
    public String copyright() {
        return "GNU GPL";
    }

    @Override
    public void initExtensions(PluginContext ctx, ExtensionRegistry registry) throws IgniteCheckedException {
        System.out.println("UsernamePasswordAuthenticationPluginProvider >> initExtensions");
        ctx.igniteConfiguration().getDiscoverySpi().setAuthenticator(new UsernamePasswordDiscoverySpiNodeAuthenticator());
    }

    @Override
    public CachePluginProvider createCacheProvider(CachePluginContext ctx) {
        return null;
    }

    @Override
    public void start(PluginContext ctx) throws IgniteCheckedException {
        System.out.println("UsernamePasswordAuthenticationPluginProvider >> start");
    }

    @Override
    public void stop(boolean cancel) throws IgniteCheckedException {
        System.out.println("UsernamePasswordAuthenticationPluginProvider >> stop");
    }

    @Override
    public void onIgniteStart() throws IgniteCheckedException {
        System.out.println("UsernamePasswordAuthenticationPluginProvider >> onIgniteStart");
    }

    @Override
    public void onIgniteStop(boolean cancel) {
        System.out.println("UsernamePasswordAuthenticationPluginProvider >> onIgniteStop");
    }

    @Override
    public Serializable provideDiscoveryData(UUID nodeId) {
        return null;
    }

    @Override
    public void receiveDiscoveryData(UUID nodeId, Serializable data) {

    }

    @Override
    public void validateNewNode(ClusterNode node) throws PluginValidationException {
        System.out.println("UsernamePasswordAuthenticationPluginProvider >> validateNewNode");
    }

    @Override
    public Object createComponent(PluginContext ctx, Class cls) {
        return null;
    }

    @Override
    public IgnitePlugin plugin() {
        return this;
    }
}
