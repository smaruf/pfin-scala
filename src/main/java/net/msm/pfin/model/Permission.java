public interface Permission {
    Long getId();
    List<Long> getRoleIds();
    List<Long> getGroupIds();
    List<AuthTypes> getAuthTypes();
    boolean isGranted();
    default isDenied() {
      return !isGranted();
    }
}
