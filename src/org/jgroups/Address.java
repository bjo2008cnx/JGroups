
package org.jgroups;

import org.jgroups.util.SizeStreamable;
import org.jgroups.util.UUID;

/**
 * Address identifies cluster member. For example, whenever a unicast message is sent in a cluster
 * an Address of a cluster member message recipient needs to be specified. Similarly a cluster
 * member can use Address to check its own identity, request a state from a particular member and so
 * on. Addresses are mostly generated by the bottom-most (transport) layers (e.g. UDP, TCP,
 * LOOPBACK).
 * 
 * @author Bela Ban
 * @since 2.0
 * @see PhysicalAddress
 * @see UUID
 */
public interface Address extends SizeStreamable, Comparable<Address> {
    // flags used for marshalling
    byte NULL         = 1 << 0;
    byte UUID_ADDR    = 1 << 1;
    byte SITE_UUID    = 1 << 2;
    byte SITE_MASTER  = 1 << 3;
    byte IP_ADDR      = 1 << 4;
    byte IP_ADDR_UUID = 1 << 5;
}
