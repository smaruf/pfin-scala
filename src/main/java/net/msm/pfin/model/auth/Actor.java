package net.msm.pfin.model.auth;

import java.util.List;

public interface Actor {
    String getActorKey();
    Long getUserId();
    List<Long> getActorPermissionIds();
    boolean isActive();
    boolean isBlocked();
}
