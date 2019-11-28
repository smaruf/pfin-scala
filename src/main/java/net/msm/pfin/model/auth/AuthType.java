package net.msm.pfin.model.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AuthType {
    DEFAULT(0L, "Default"),
    SINGLE_SIGN_ON(0L, "Single Signing");
    
    private long id;
    private String name;
}
