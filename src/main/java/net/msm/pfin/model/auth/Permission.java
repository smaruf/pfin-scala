package net.msm.pfin.model.auth;

import java.util.List;

public interface Permission {
    Long getId();
    List<Long> getRoleIds();
    List<Long> getGroupIds();
    List<AuthType> getAuthTypes();
    boolean isGranted();
    default boolean isDenied() {
      return !isGranted();
    }
}
