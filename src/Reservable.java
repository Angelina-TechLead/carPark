public interface Reservable {
    public void reserve(String user);
    public void cancelReservation();
    public boolean isReserved();
}
