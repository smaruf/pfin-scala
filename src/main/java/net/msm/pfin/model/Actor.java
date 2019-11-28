public interface Actor {
    String getActorKey();
    Long getUserId();
    List<Long> getActorPermissionIds();
    boolean isActive();
    boolean isBlocked();
}
